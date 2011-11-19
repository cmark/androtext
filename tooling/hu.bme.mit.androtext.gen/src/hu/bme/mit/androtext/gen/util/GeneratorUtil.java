package hu.bme.mit.androtext.gen.util;

import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class GeneratorUtil {

	public static Collection<EObject> findCrossReferences(EObject eObject, ResourceSet context) {
		List<EObject> referables = new ArrayList<EObject>();
		Collection<Setting> settings = EcoreUtil.UsageCrossReferencer.find(eObject, context);
		for (Setting setting : settings) {
			referables.add(setting.getEObject());
		}
		return referables;
	}
	
	/**
	 * Returns the Android Target value from the ApiLevel enumeration.
	 * @param target
	 * @return
	 */
	public static int getTarget(TargetApplication target) {
		return Integer.parseInt(target.getTarget().getName().replaceAll("[\\D]", ""));
	}
	
	/**
	 * Deletes all content in the specified parent folder. If you want to delete
	 * the parent folder to, set the parameter deleteParentFolder to true.
	 * 
	 * @param parentFolder
	 * @param filter
	 * @param continueOnError
	 * @param deleteParentFolder
	 * @return
	 * @throws FileNotFoundException
	 */
	public static boolean cleanFolder(File parentFolder, final FileFilter filter, boolean continueOnError,
			boolean deleteParentFolder) throws FileNotFoundException {
		if (!parentFolder.exists())
			throw new FileNotFoundException(parentFolder.getAbsolutePath());
		FileFilter myFilter = filter;
		if (myFilter == null) {
			myFilter = new FileFilter() {
				public boolean accept(File pathname) {
					return true;
				}
			};
		}
		System.out.println("Cleaning folder " + parentFolder.toString());
		final File[] contents = parentFolder.listFiles(myFilter);
		for (int j = 0; contents!=null && j < contents.length; j++) {
			final File file = contents[j];
			if (file.isDirectory()) {
				if (!cleanFolder(file, myFilter, continueOnError, false) && !continueOnError)
					return false;
			}
			else {
				if (!file.delete()) {
					System.out.println("Couldn't delete " + file.getAbsolutePath());
					if (!continueOnError)
						return false;
				}
			}
		}
		if (deleteParentFolder) {
			if (!parentFolder.delete()) {
				System.out.println("Couldn't delete " + parentFolder.getAbsolutePath());
				return false;
			}
		}
		return true;
	}

	
}
