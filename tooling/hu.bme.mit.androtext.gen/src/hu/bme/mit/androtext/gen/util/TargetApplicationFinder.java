package hu.bme.mit.androtext.gen.util;

import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.ModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class TargetApplicationFinder {

	/**
	 * Call this method when you need a {@link TargetApplication} list, that only
	 * contains the {@link TargetApplication}, that use the from parameter elements
	 * (even through multiple resources). The context parameter must contain all
	 * resources that exists in the modelProject.
	 * 
	 * @param from
	 * @param context
	 * @return
	 */
	public static final List<TargetApplication> findTargetApplications(final Resource from, final ResourceSet context) {
		if (from == null || context == null) {
			throw new IllegalArgumentException();
		}
		if (!from.getContents().isEmpty()) {
			final EObject root = from.getContents().get(0);
			if (root instanceof AndroTextModelRoot) {
				final ModelRoot actualModelRoot = ((AndroTextModelRoot) root).getActualModelRoot();
				if (actualModelRoot instanceof AndroGenModelRoot) {
					return findTargetApplications((AndroGenModelRoot) actualModelRoot);
				} else if (actualModelRoot instanceof AndroidApplication) {
					return findTargetApplications((AndroidApplication) actualModelRoot, context);
				} else if (actualModelRoot instanceof AndroDataModelRoot) {				
					return findTargetApplications((AndroDataModelRoot) actualModelRoot, context);
				} else if (actualModelRoot instanceof AndroGuiModelRoot) {
					return findTargetApplications((AndroGuiModelRoot) actualModelRoot, context);
				} else if (actualModelRoot instanceof AndroResModelRoot) {
					return findTargetApplications((AndroResModelRoot) actualModelRoot, context);
				} else {
					throw new RuntimeException("Not recognized resource root: " + from.getURI());
				}
			}
		}
		return null;
	}
	
	private static List<TargetApplication> findTargetApplications(
			AndroResModelRoot root, ResourceSet context) {
		List<TargetApplication> targetApplications = new ArrayList<TargetApplication>();
		for (hu.bme.mit.androtext.lang.androTextDsl.Resource resource : root.getResources()) {
			for (EObject eObject : GeneratorUtil.findCrossReferences(resource, context)) {
				// cover the uielement reference
				if (eObject instanceof View) {
					ViewGroup rootContainer = getRootView(eObject);
					targetApplications.addAll(findTargetApplications(rootContainer, context));
				}
			}
		}
		return targetApplications;
	}

	private static ViewGroup getRootView(EObject eObject) {
		if (eObject == null) return null;
		if (eObject.eContainer() instanceof AndroGuiModelRoot) {
			return (ViewGroup) eObject;
		}
		if (eObject.eContainer() != null) {
			return getRootView(eObject.eContainer());
		}
		return null;
	}

	private static List<TargetApplication> findTargetApplications(
			AndroGuiModelRoot modelRoot, ResourceSet context) {
		List<TargetApplication> targetApplications = new ArrayList<TargetApplication>();
		for (View root : modelRoot.getRoots()) {
			if (root instanceof ViewGroup) {
				targetApplications.addAll(findTargetApplications((ViewGroup)root, context));
			}
		}
		return targetApplications;
	}
	
	private static List<TargetApplication> findTargetApplications(ViewGroup root, ResourceSet context) {
		List<TargetApplication> targetApplications = new ArrayList<TargetApplication>();
		for (EObject eObject : GeneratorUtil.findCrossReferences(root, context)) {
			if (eObject instanceof AbstractActivity) {
				targetApplications.addAll(findTargetApplications((AndroidApplication) eObject.eContainer(), context));
			}
		}
		return targetApplications;
	}

	private static List<TargetApplication> findTargetApplications(
			AndroDataModelRoot data, ResourceSet context) {
		List<TargetApplication> targetApplications = new ArrayList<TargetApplication>();
		for (EObject eObject : GeneratorUtil.findCrossReferences(data, context)) {
			// TODO this reference will be the only one that has a AndroidApplication object as target???
			if (eObject instanceof AndroidApplication) {
				targetApplications.addAll(findTargetApplications((AndroidApplication)eObject, context));
			}
		}
		return targetApplications;
	}

	/**
	 * Maybe this not actually needed, because when an androapp file is saved,
	 * the appropriate androgen file (that has a reference to the androapp
	 * file's {@link AndroidApplication} instance) also called as delta, because
	 * the reference is recreated (Need to retest this, the case when the
	 * androapp not referenced by one of the androgen files is not tested yet).
	 * 
	 * @param application
	 * @param context
	 * @return
	 */
	private static List<TargetApplication> findTargetApplications(
			AndroidApplication application, ResourceSet context) {
		List<TargetApplication> targetApplications = new ArrayList<TargetApplication>();
		for (EObject eObject : GeneratorUtil.findCrossReferences(application, context)) {
			// TODO this reference will be the only one that has a AndroidApplication object as target???
			if (eObject instanceof TargetApplication) {
				targetApplications.add((TargetApplication) eObject);
			}
		}
		return targetApplications;
	}

	/**
	 * Easiest case, when the from resource has a {@link AndroidGeneratorModel} as root.
	 * @param generatorModel
	 * @return
	 */
	private static final List<TargetApplication> findTargetApplications(AndroGenModelRoot generatorModel) {
		return generatorModel.getTargetApplications();
	}
	
}
