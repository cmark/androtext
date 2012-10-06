package hu.bme.mit.androtext.gen.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import com.android.ide.eclipse.adt.AdtConstants;
import com.android.ide.eclipse.adt.AdtPlugin;
import com.android.ide.eclipse.adt.internal.project.AndroidNature;
import com.android.ide.eclipse.adt.internal.project.ProjectHelper;
import com.android.ide.eclipse.adt.internal.sdk.Sdk;
import com.android.io.StreamException;
import com.android.sdklib.IAndroidTarget;
import com.android.sdklib.SdkConstants;


@SuppressWarnings("restriction")
public class AndroidProjectUtil {

	/**
	 * Creates the Android Eclipse project with base folders, and files, target
	 * can be configured via the targetNumber and isGoogleVendor parameters.
	 * 
	 * @param monitor
	 * @param projectName
	 * @param targetNumber
	 * @param isGoogleVendor
	 * @return
	 */
	public static void createEclipseProject(IProgressMonitor monitor, IProject project, int targetNumber, boolean isGoogleVendor) {
		monitor.subTask("Creating Android Project");
		try {
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IProjectDescription projectDescription = ws.newProjectDescription(project.getName());
			Sdk sdk = AndroidSdkUtil.getAndroidSdk();
			if (sdk == null) {
				throw new RuntimeException("SDKfolder is null, enter the SDK folder name in the !");
			}
			IAndroidTarget target = AndroidSdkUtil.getTarget(sdk, targetNumber, isGoogleVendor);
			boolean legacy = target.getVersion().getApiLevel() < 4;
			// create the main android project
			project.create(projectDescription, new SubProgressMonitor(monitor, 10));
			if (monitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			
			// open the project
			project.open(IResource.BACKGROUND_REFRESH, new SubProgressMonitor(monitor, 10));
			
			// Add the Java and android nature to the project
			AndroidNature.setupProjectNatures(project, monitor);
			
			// create the folders in the project
			AndroidProjectUtil.addDefaultDirectories(project, AdtConstants.WS_ROOT,
					AndroidConstants2.DEFAULT_DIRECTORIES, monitor);
			String[] sourceFolders = new String[] { SdkConstants.FD_SOURCES,
					AndroidConstants2.GEN_SRC_DIRECTORY, "src-gen" };
			AndroidProjectUtil.addDefaultDirectories(project, AdtConstants.WS_ROOT,
					sourceFolders, monitor);
			
			// create resource folders
			if (legacy) {
				AndroidProjectUtil.addDefaultDirectories(project, AndroidConstants2.RES_DIRECTORY,
						AndroidConstants2.RES_DIRECTORIES, monitor);
			} else {
				AndroidProjectUtil.addDefaultDirectories(project, AndroidConstants2.RES_DIRECTORY,
						AndroidConstants2.RES_DENSITY_ENABLED_DIRECTORIES,
						monitor);
			}
			
			// Setup class path: mark folders as source folders
			IJavaProject javaProject = JavaCore.create(project);
			AndroidProjectUtil.setupSourceFolders(javaProject, sourceFolders, monitor);

			// add static resources like images to the res/* folders
			AndroidProjectUtil.addIcon(project, legacy, monitor);

            // add the default proguard config
            File libFolder = new File(AdtPlugin.getOsSdkToolsFolder(),
                    SdkConstants.FD_LIB);
            AndroidProjectUtil.addLocalFile(project,
                    new File(libFolder, SdkConstants.FN_PROGUARD),
                    monitor);
			
			// set output location in the java project
			javaProject.setOutputLocation(
					project.getFolder(AndroidConstants2.BIN_CLASSES_DIRECTORY)
							.getFullPath(), monitor);

			sdk.initProject(project, target);

			// Fix the project to make sure all properties are as expected.
			// Necessary for existing projects and good for new ones to.
			ProjectHelper.fixProject(project);
		} catch (CoreException e) {
			throw new RuntimeException(e.getMessage());
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		} catch (StreamException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static void addFile(IFile dest, byte[] source, IProgressMonitor monitor)
			throws CoreException {
		if (source != null) {
			// Save in the project
			InputStream stream = new ByteArrayInputStream(source);
			dest.create(stream, false /* force */, new SubProgressMonitor(
					monitor, 10));
		}
	}
	
    /**
     * Adds a file to the root of the project
     * @param project the project to add the file to.
     * @param source the file to add. It'll keep the same filename once copied into the project.
     * @throws FileNotFoundException
     * @throws CoreException
     */
    public static void addLocalFile(IProject project, File source, IProgressMonitor monitor)
            throws FileNotFoundException, CoreException {
        IFile dest = project.getFile(source.getName());
        if (dest.exists() == false) {
            FileInputStream stream = new FileInputStream(source);
            dest.create(stream, false /* force */, new SubProgressMonitor(monitor, 10));
        }
    }
	
	/**
	 * Adds default directories to the project.
	 * 
	 * @param project
	 *            The Java project to update.
	 * @param parentFolder
	 *            The path of the parent folder. Must end with a separator.
	 * @param folders
	 *            Folders to be added.
	 * @param monitor
	 *            An existing monitor.
	 * @throws CoreException
	 *             if the method fails to create the directories in the project.
	 */
	public static void addDefaultDirectories(IProject project, String parentFolder,
			String[] folders, IProgressMonitor monitor) throws CoreException {
		for (String name : folders) {
			if (name.length() > 0) {
				IFolder folder = project.getFolder(parentFolder + name);
				if (!folder.exists()) {
					folder.create(true /* force */, true /* local */,
							new SubProgressMonitor(monitor, 10));
				}
			}
		}
	}
	
	public static void setupSourceFolders(IJavaProject javaProject,
			String[] sourceFolders, IProgressMonitor monitor)
			throws JavaModelException {
		IProject project = javaProject.getProject();

		// get the list of entries.
		IClasspathEntry[] entries = javaProject.getRawClasspath();

		// remove the project as a source folder (This is the default)
		entries = removeSourceClasspath(entries, project);

		// add the source folders.
		for (String sourceFolder : sourceFolders) {
			IFolder srcFolder = project.getFolder(sourceFolder);

			// remove it first in case.
			entries = removeSourceClasspath(entries, srcFolder);
			entries = ProjectHelper.addEntryToClasspath(entries,
					JavaCore.newSourceEntry(srcFolder.getFullPath()));
		}
		javaProject.setRawClasspath(entries,
				new SubProgressMonitor(monitor, 10));
	}
	
	private static IClasspathEntry[] removeSourceClasspath(IClasspathEntry[] entries,
			IContainer folder) {
		if (folder == null) {
			return entries;
		}
		IClasspathEntry source = JavaCore.newSourceEntry(folder.getFullPath());
		int n = entries.length;
		for (int i = 0; i < n; i++) {
			if (entries[i].equals(source)) {
				IClasspathEntry[] newEntries = new IClasspathEntry[n - 1];
				if (i > 0) {
					System.arraycopy(entries, 0, newEntries, 0, i);
				}
				if (i < n - 1) {
					System.arraycopy(entries, i + 1, newEntries, i, n - i - 1);
				}
				n--;
				entries = newEntries;
			}
		}
		return entries;
	}

	/**
	 * Adds default application icon to the project.
	 * 
	 * @param project
	 *            The Java Project to update.
	 * @param legacy
	 *            whether we're running in legacy mode (no density support)
	 * @param monitor
	 *            An existing monitor.
	 * @throws CoreException
	 *             if the method fails to update the project.
	 */
	public static void addIcon(IProject project, boolean legacy,
			IProgressMonitor monitor) throws CoreException {
		if (legacy) { // density support
			// do medium density icon only, in the default drawable folder.
			IFile file = project.getFile(AndroidConstants2.RES_DIRECTORY
					+ AdtConstants.WS_SEP
					+ AndroidConstants2.DRAWABLE_DIRECTORY
					+ AdtConstants.WS_SEP + AndroidConstants2.PROJECT_ICON);
			if (!file.exists()) {
				addFile(file,
						AdtPlugin
								.readEmbeddedFile(AndroidConstants2.TEMPLATES_DIRECTORY
										+ AndroidConstants2.ICON_MDPI), monitor);
			}
		} else {
			// do all 3 icons.
			IFile file;

			// high density
			file = project.getFile(AndroidConstants2.RES_DIRECTORY
					+ AdtConstants.WS_SEP
					+ AndroidConstants2.DRAWABLE_HDPI_DIRECTORY
					+ AdtConstants.WS_SEP + AndroidConstants2.PROJECT_ICON);
			if (!file.exists()) {
				addFile(file,
						AdtPlugin
								.readEmbeddedFile(AndroidConstants2.TEMPLATES_DIRECTORY
										+ AndroidConstants2.ICON_HDPI), monitor);
			}

			// medium density
			file = project.getFile(AndroidConstants2.RES_DIRECTORY
					+ AdtConstants.WS_SEP
					+ AndroidConstants2.DRAWABLE_MDPI_DIRECTORY
					+ AdtConstants.WS_SEP + AndroidConstants2.PROJECT_ICON);
			if (!file.exists()) {
				addFile(file,
						AdtPlugin
								.readEmbeddedFile(AndroidConstants2.TEMPLATES_DIRECTORY
										+ AndroidConstants2.ICON_MDPI), monitor);
			}

			// low density
			file = project.getFile(AndroidConstants2.RES_DIRECTORY
					+ AdtConstants.WS_SEP
					+ AndroidConstants2.DRAWABLE_LDPI_DIRECTORY
					+ AdtConstants.WS_SEP + AndroidConstants2.PROJECT_ICON);
			if (!file.exists()) {
				addFile(file,
						AdtPlugin
								.readEmbeddedFile(AndroidConstants2.TEMPLATES_DIRECTORY
										+ AndroidConstants2.ICON_LDPI), monitor);
			}
		}
	}
	
//    /**
//     * Adds the string resource file.
//     *
//     * @param project The Java Project to update.
//     * @param strings The list of strings to be added to the string file.
//     * @param monitor An existing monitor.
//     * @throws CoreException if the method fails to update the project.
//     * @throws IOException if the method fails to create the files in the
//     *         project.
//     */
//    private void addStringDictionaryFile(IProject project,
//            Map<String, String> strings, IProgressMonitor monitor)
//            throws CoreException, IOException {
//
//        // create the IFile object and check if the file doesn't already exist.
//        IFile file = project.getFile(AndroidConstants2.RES_DIRECTORY + AdtConstants.WS_SEP
//                                     + AndroidConstants2.VALUES_DIRECTORY + AdtConstants.WS_SEP + AndroidConstants2.STRINGS_FILE);
//        if (!file.exists()) {
//            // get the Strings.xml template
//            String stringDefinitionTemplate = AdtPlugin.readEmbeddedTextFile(AndroidConstants2.TEMPLATE_STRINGS);
//
//            // get the template for one string
//            String stringTemplate = AdtPlugin.readEmbeddedTextFile(AndroidConstants2.TEMPLATE_STRING);
//
//            // get all the string names
//            Set<String> stringNames = strings.keySet();
//
//            // loop on it and create the string definitions
//            StringBuilder stringNodes = new StringBuilder();
//            for (String key : stringNames) {
//                // get the value from the key
//                String value = strings.get(key);
//
//                // place them in the template
////                String stringDef = stringTemplate.replace(PARAM_STRING_NAME, key);
////                stringDef = stringDef.replace(PARAM_STRING_CONTENT, value);
//
//                // append to the other string
//                if (stringNodes.length() > 0) {
//                    stringNodes.append("\n");
//                }
////                stringNodes.append(stringDef);
//            }
//
//            // put the string nodes in the Strings.xml template
////            stringDefinitionTemplate = stringDefinitionTemplate.replace(PH_STRINGS,
////                                                                        stringNodes.toString());
//
//            // reformat the file according to the user's formatting settings
//            stringDefinitionTemplate = reformat(XmlFormatStyle.RESOURCE, stringDefinitionTemplate);
//
//            // write the file as UTF-8
//            InputStream stream = new ByteArrayInputStream(
//                    stringDefinitionTemplate.getBytes("UTF-8")); //$NON-NLS-1$
//            file.create(stream, false /* force */, new SubProgressMonitor(monitor, 10));
//        }
//    }
    
    /** Reformats the given contents with the current formatting settings */
//    private String reformat(XmlFormatStyle style, String contents) {
//        if (AdtPrefs.getPrefs().getUseCustomXmlFormatter()) {
//            XmlFormatPreferences formatPrefs = XmlFormatPreferences.create();
//            return XmlPrettyPrinter.prettyPrint(contents, formatPrefs, style,
//                    null /*lineSeparator*/);
//        } else {
//            return contents;
//        }
//    }

	
}
