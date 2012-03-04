package hu.bme.mit.androtext.gen.ui.builder;

import static com.google.common.collect.Maps.uniqueIndex;
import static com.google.common.collect.Sets.newLinkedHashSet;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.IMainGenerator;
import hu.bme.mit.androtext.gen.util.AndroidProjectUtil;
import hu.bme.mit.androtext.gen.util.GeneratorUtil;
import hu.bme.mit.androtext.gen.util.TargetApplicationFinder;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.DerivedResourceMarkers;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class AndroTextBuilderParticipant implements IXtextBuilderParticipant {

	private List<String> fileExtensions;
	
	@Inject
	protected Provider<EclipseResourceFileSystemAccess3> fileSystemAccessProvider;
	
	@Inject
	protected IMainGenerator mainGenerator;
	
	@Inject
	protected IResourceServiceProvider resourceServiceProvider;
	
	@Inject
	protected ResourceDescriptionsProvider resourceDescriptionsProvider;
	
	@Inject
	protected IStorage2UriMapper storage2UriMapper;
	
	@Inject
	protected DerivedResourceMarkers derivedResourceMarkers;
	
	@Inject
	protected BasicAndroidOutputConfigurationProvider outputConfigurationProvider;
	
	@Override
	public void build(final IBuildContext context, final IProgressMonitor monitor)
			throws CoreException {
		System.out.println("====================PreBuild=======================");
		if (context.getDeltas().isEmpty()) return;
		final List<Delta> deltas = new ArrayList<IResourceDescription.Delta>();
		for (Delta d : context.getDeltas()) {
			if (canHandle(d.getUri().fileExtension())) {
				deltas.add(d);
			} else {
				System.out.println("Cant handle " + d.getUri());
			}
		}
		final int numberOfDeltas = deltas.size();
		if (numberOfDeltas > 1) {
			System.out.println("Warning: Multiple build of different deltas not implemented!");
			return;
		}
		// monitor handling
		if (monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
		SubMonitor subMonitor = SubMonitor.convert(monitor, numberOfDeltas + 3);
		// this file system access reused for the next couple of generations
		EclipseResourceFileSystemAccess3 access = fileSystemAccessProvider.get();
//		printResourceInformation(context);
		System.out.println("====================Build=======================");
		Map<TargetApplication, ResourceSet> targetApps = findTargetApplications(context, deltas);
		Delta delta = deltas.get(0);
		for (TargetApplication app : targetApps.keySet()) {
			System.out.println("Building target application " + app.getProjectName());
			// monitor handling
			if (subMonitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			access.setMonitor(subMonitor.newChild(1));
			final String uri = delta.getUri().toString();
			final Set<IFile> derivedResources = newLinkedHashSet();
			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(app.getProjectName());
			// get the current project for the TargetApplication
			final Map<String, OutputConfiguration> outputConfigurations = getBasicAndroidOutputConfigurations(app, project);
			access.setOutputConfigurations(outputConfigurations);
			findOrCreateProject(project, subMonitor.newChild(1), app, outputConfigurations.get(IGeneratorSlots.SRCGEN_SLOT));
			access.setProject(project);
			// refresh outputs before generation
			project.refreshLocal(IResource.DEPTH_INFINITE, subMonitor);
//			refreshOutputFolders(context, outputConfigurations, subMonitor);
			// delete derived resources
			for (OutputConfiguration config : outputConfigurations.values()) {
				if (config.isCleanUpDerivedResources()) {
					if (config.getName().equals(IGeneratorSlots.PROJECT_SLOT)) {
						List<IFile> resources = derivedResourceMarkers.findDerivedResources(project, uri);
						derivedResources.addAll(resources);
					} else {
						List<IFile> resources = derivedResourceMarkers.findDerivedResources(project.getFolder(config.getOutputDirectory()), uri);
						derivedResources.addAll(resources);
					}
				}
			}
			access.setPostProcessor(new EclipseResourceFileSystemAccess2.IFileCallback() {
				
				public boolean beforeFileDeletion(IFile file) {
					System.out.println(file.getName() + " will be deleted!");
					derivedResources.remove(file);
					context.needRebuild();
					return true;
				}
				
				public void afterFileUpdate(IFile file) {
					handleFileAccess(file);
				}

				public void afterFileCreation(IFile file) {
					handleFileAccess(file);
				}
				
				protected void handleFileAccess(IFile file) {
					try {
						derivedResources.remove(file);
						derivedResourceMarkers.installMarker(file, uri);
						context.needRebuild();
					} catch (CoreException e) {
						throw new RuntimeException(e);
					}
				}
				
			});
			System.out.println("Delta.getNew(): " + delta.getNew());
			if (delta.getNew() != null) {
				handleChangedContents(delta, context, access, project, app, targetApps.get(app));
			}
			SubMonitor deleteMonitor = SubMonitor.convert(subMonitor.newChild(1), derivedResources.size());
			for (IFile iFile : derivedResources) {
				System.err.println("" + iFile.getName() + " is in the derived list!");
				if (!iFile.isDerived()) continue;
				IMarker marker = derivedResourceMarkers.findDerivedResourceMarker(iFile, uri);
				if (marker != null)
					marker.delete();
				if (derivedResourceMarkers.findDerivedResourceMarkers(iFile).length == 0) {
					System.err.println(iFile.getName() + " deleted during build (derived file)!");
					iFile.delete(IResource.KEEP_HISTORY, deleteMonitor.newChild(1));
					context.needRebuild();
				}
			}
			project.refreshLocal(IResource.DEPTH_INFINITE, subMonitor);
		}
		
//		for (int i = 0 ; i < numberOfDeltas ; i++) {
//			final IResourceDescription.Delta delta = context.getDeltas().get(i);
//			
//		}
//		// replace this call with a project refresh
//		refreshOutputFolders(context, outputConfigurations, subMonitor);
//		if (context.getBuildType() == BuildType.CLEAN || context.getBuildType() == BuildType.RECOVERY) {
//			SubMonitor cleanMonitor = SubMonitor.convert(subMonitor.newChild(1), outputConfigurations.size());
//			for (OutputConfiguration config : outputConfigurations.values()) {
//				cleanOutput(context, config, cleanMonitor.newChild(1));
//			}
//			if (context.getBuildType() == BuildType.CLEAN)
//				return;
//		}
		
	}
	
	private void printResourceInformation(IBuildContext context) {
		System.out.println("============PRINT INFO=============");
		for (Delta d : context.getDeltas()) {
			final URI deltaURI = d.getUri();
//			System.out.println("Delta URI: " + deltaURI);
			Resource deltaRes = context.getResourceSet().getResource(deltaURI, true);
			System.out.println(deltaRes);
			if (d.getOld() != null) {
				final URI oldURI = d.getOld().getURI();
//				System.out.println("Old URI: " + oldURI);
				Resource res = context.getResourceSet().getResource(oldURI, true);
				System.out.println(res);
			}
			if (d.getNew() != null) {
				final URI newURI = d.getNew().getURI();
//				System.out.println("New URI: " + newURI);
				Resource res = context.getResourceSet().getResource(newURI, true);
				System.out.println(res);
			}
		}
		System.out.println("============END PRINT INFO=============");
	}

	protected void handleChangedContents(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess, IProject project, TargetApplication targetApplication, ResourceSet set) throws CoreException {
		if (!canHandle(delta.getUri().fileExtension()))
			return;
		System.out.println("Handling changed contexts!");
		// TODO: we will run out of memory here if the number of deltas is large enough
		Resource resource = set.getResource(delta.getUri(), true);
		if (shouldGenerate(resource, context)) {
			try {
				System.out.println("Generate called on " + delta.getUri());
				System.out.println("Destination: " + project.getName());
				mainGenerator.doGenerate(set, fileSystemAccess, targetApplication);
			} catch (RuntimeException e) {
				if (e.getCause() instanceof CoreException) {
					throw (CoreException) e.getCause();
				}
				throw e;
			}
		}
	}

	protected boolean canHandle(String fileExtension) {
		return getFileExtensions().contains(fileExtension);
	}
	
	protected boolean shouldGenerate(Resource resource, IBuildContext context) {
		try {
			Iterable<Pair<IStorage, IProject>> storages = storage2UriMapper.getStorages(resource.getURI());
			for (Pair<IStorage, IProject> pair : storages) {
				if (pair.getFirst() instanceof IFile && pair.getSecond().equals(context.getBuiltProject())) {
					return((IFile) pair.getFirst()).findMaxProblemSeverity(null, true, IResource.DEPTH_INFINITE) != IMarker.SEVERITY_ERROR;
				}
			}
			return false;
		} catch (CoreException exc) {
			throw new WrappedException(exc);
		}
	}
	
//	protected void refreshOutputFolders(IBuildContext ctx, Map<String, OutputConfiguration> outputConfigurations, IProgressMonitor monitor) throws CoreException {
//		SubMonitor subMonitor = SubMonitor.convert(monitor, outputConfigurations.size());
//		for (OutputConfiguration config : outputConfigurations.values()) {
//			SubMonitor child = subMonitor.newChild(1);
//			final IProject project = ctx.getBuiltProject();
//			IFolder folder = project.getFolder(config.getOutputDirectory());
//			folder.refreshLocal(IResource.DEPTH_INFINITE, child);
//		}
//	}
	
	private void findOrCreateProject(IProject project, SubMonitor monitor, TargetApplication target, OutputConfiguration srcGenConfig) throws CoreException {
		if (!project.exists()) {
			// create the project
			AndroidProjectUtil.createEclipseProject(monitor, project, GeneratorUtil.getTarget(target), false);
			boolean addGameJar = false;
			if (target.getApplication().getMainActivity() instanceof BaseGameActivity) {
				addGameJar = true;
			} else {
				for (AndroidApplicationModelElement me : target.getApplication().getModelElements()) {
					if (me instanceof BaseGameActivity) {
						addGameJar = true;
						break;
					}
				}
			}
			if (addGameJar) {
				AndroidProjectUtil.addGameJars(project);
			}
		} else {
			// clean only the src-gen folder, if the project exists
			cleanOutput(project, srcGenConfig, monitor);
			// clean src-gen directory
//			String folderToClean = project.getFolder("src-gen").getLocation().toString();
//			File f = new File(folderToClean);
//			if (f.exists() && f.isDirectory()) {
//				try {
//					GeneratorUtil.cleanFolder(f, null, false, false);
//				}
//				catch (FileNotFoundException e) {
//					e.printStackTrace();
//				}
//			}
		}
	}

	private Map<TargetApplication, ResourceSet> findTargetApplications(IBuildContext context, List<Delta> deltas) {
		Map<TargetApplication, ResourceSet> targetApps = new HashMap<TargetApplication, ResourceSet>();
		for (Delta delta : deltas) {
			System.out.println("Current delta: " + delta.getUri());
			// monitor handling
//			if (subMonitor.isCanceled())
//				throw new OperationCanceledException();
			// First select a delta to search for TargetApplications
			try {
				Resource resource = context.getResourceSet().getResource(delta.getUri(), true);
				findAllContent(context, resource);
				List<TargetApplication> targetApplications = TargetApplicationFinder.findTargetApplications(resource, context.getResourceSet());
				if (targetApplications != null) {
					for (TargetApplication app : targetApplications) {
						System.out.println("Found a target application with project name: " + app.getProjectName());
						if (!targetApps.containsKey(app)) {
							ResourceSet set = new XtextResourceSet();
							set.getResource(delta.getUri(), true);
							targetApps.put(app, set);
						} else {
							targetApps.get(app).getResource(delta.getUri(), true);
						}
					}
				}
			} catch (Exception e) {
				System.out.println(delta.getUri() + " MalformedURLException!");
//				e.printStackTrace();
			}
		}
		for (TargetApplication app : targetApps.keySet()) {
			System.out.println("\n\nFound an application " + app.getProjectName() + " with resources: ");
			ResourceSet set = targetApps.get(app);
			// load all remaining resource for generation
			List<URI> uris = new ArrayList<URI>();
			uris.add(app.getApplication().eResource().getURI());
			List<AndroidApplicationModelElement> activities = new ArrayList<AndroidApplicationModelElement>(app.getApplication().getModelElements());
			activities.add(app.getApplication().getMainActivity());
			for (AndroidApplicationModelElement ac : activities) {
				if (ac instanceof ContentProvider) {
					if (ac instanceof ResourceContentProvider) {
						URI newURI2 = ((ResourceContentProvider) ac).getArrayResource().eResource().getURI();
						if (!uris.contains(newURI2)) {
							uris.add(newURI2);
						}
					}
					if (ac instanceof DatabaseContentProvider) {
						URI newURI2 = ((DatabaseContentProvider) ac).getDatamodel().eResource().getURI();
						if (!uris.contains(newURI2)) {
							uris.add(newURI2);
						}
					}
				}
				if (ac instanceof ListActivity) {
					URI newURI = ((ListActivity) ac).getListitem().eResource().getURI();
					if (!uris.contains(newURI)) {
						uris.add(newURI);
					}
				}
				if (ac instanceof Activity) {
					View lay = ((Activity) ac).getLayout();
					if (lay == null) continue;
					URI newURI = lay.eResource().getURI();
					if (!uris.contains(newURI)) {
						uris.add(newURI);
					}
					if (lay instanceof ViewGroup) {
						for (View uie : ((ViewGroup) lay).getViews()) {
							URI resURI = null;
							if (uie instanceof ListView) {
								if (((ListView) uie).getEntriesAttribute() != null) {
									ArrayResource res = ((ListView) uie).getEntriesAttribute().getEntries();
									if (res != null) {
										resURI = res.eResource().getURI();
									}
								}
							}
							// TODO add more instanceof if needed, or maybe a good abstraction of resource usage
							if (resURI != null && !uris.contains(resURI)) {
								uris.add(resURI);
							}
						}
					}
				}
			}
			for (URI uri : uris) {
				try {
					System.out.println("Resource: " + uri);
					set.getResource(uri, true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return targetApps;
	}
	
	private Map<String, OutputConfiguration> getBasicAndroidOutputConfigurations(TargetApplication app, IProject project) {
		Set<OutputConfiguration> configurations = outputConfigurationProvider.getOutputConfigurations(app, project);
		return uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
			public String apply(OutputConfiguration from) {
				return from.getName();
			}
		});
	}

	private void findAllContent(IBuildContext context, Resource resource) {
		IResourceDescriptions index = resourceDescriptionsProvider.createResourceDescriptions();
		IResourceDescription resDesc = resourceServiceProvider.getResourceDescriptionManager().getResourceDescription(resource);
		List<IContainer> visibleContainers = resourceServiceProvider.getContainerManager().getVisibleContainers(resDesc, index);
		for (IContainer c : visibleContainers) {
			for (IResourceDescription rd : c
					.getResourceDescriptions()) {
				Resource res = context.getResourceSet().getResource(rd.getURI(), true);
				System.out.println(rd.getURI() + " added to newSet resourceset! toString: " + res);
			}
		}
	}

	protected void cleanOutput(final IProject project, OutputConfiguration config, IProgressMonitor monitor) throws CoreException {
		IFolder folder = project.getFolder(config.getOutputDirectory());
		if (!folder.exists())
			return;
		if (config.isCanClearOutputDirectory()) {
			for (IResource resource : folder.members())
				resource.delete(IResource.KEEP_HISTORY, monitor);
		} else {
			if (config.isCleanUpDerivedResources()) {
				List<IFile> resources = derivedResourceMarkers.findDerivedResources(folder, null);
				for (IFile iFile : resources) {
					iFile.delete(IResource.KEEP_HISTORY, monitor);
				}
			}
		}
	}
	
	protected List<String> getFileExtensions() {
		if (fileExtensions == null) {
			fileExtensions = new ArrayList<String>();
			fileExtensions.add("androtext");
		}
		return fileExtensions;
	}
	
}
