package hu.bme.mit.androtext.gen.ui.builder;

import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.AndroidConstants2;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;

public class BasicAndroidOutputConfigurationProvider {

	public Set<OutputConfiguration> getOutputConfigurations(TargetApplication targetApplication, IProject project) {
		Set<OutputConfiguration> configs = new HashSet<OutputConfiguration>();
		IFolder srcGen = project.getFolder("src-gen");
		IFolder src = project.getFolder("src");
		// main project slot
		configs.add(createConfiguration(IGeneratorSlots.PROJECT_SLOT, "/", false, true, false, true, false));
		// source folders
		configs.add(createConfiguration(IGeneratorSlots.SRCGEN_SLOT, srcGen.getProjectRelativePath().toString(), true, true, true, true, true));
		configs.add(createConfiguration(IGeneratorSlots.SRC_SLOT, src.getProjectRelativePath().toString(), false, false, true, false, false));
		// android resource folders
		configs.add(createConfiguration(IGeneratorSlots.DRAWABLE_SLOT, project.getFolder(AndroidConstants2.RES_DIRECTORY + AndroidConstants2.DRAWABLE_DIRECTORY).getProjectRelativePath().toString(), false, true, true, true, true));
		configs.add(createConfiguration(IGeneratorSlots.VALUES_SLOT, project.getFolder(AndroidConstants2.RES_DIRECTORY + AndroidConstants2.VALUES_DIRECTORY).getProjectRelativePath().toString(), false, true, true, true, true));
		configs.add(createConfiguration(IGeneratorSlots.MENU_SLOT, project.getFolder(AndroidConstants2.RES_DIRECTORY + AndroidConstants2.MENU_DIRECTORY).getProjectRelativePath().toString(), false, true, true, true, true));
		configs.add(createConfiguration(IGeneratorSlots.LAYOUT_SLOT, project.getFolder(AndroidConstants2.RES_DIRECTORY + AndroidConstants2.LAYOUT_DIRECTORY).getProjectRelativePath().toString(), false, true, true, true, true));
		configs.add(createConfiguration(IGeneratorSlots.XML_SLOT, project.getFolder(AndroidConstants2.RES_DIRECTORY + AndroidConstants2.XML_DIRECTORY).getProjectRelativePath().toString(), false, true, true, true, true));
		// package folders in src folders
		for (String packageName : getAllPackageNames(targetApplication)) {
			if (packageName == null) continue;
			String outputDir = packageName.replaceAll("[//.]", "/"); 
			if (packageName.equals(targetApplication.getPackageName()) || packageName.equals(targetApplication.getProjectName())) {
				configs.add(createConfiguration(IFileSystemAccess.DEFAULT_OUTPUT, srcGen.getFolder(new Path(outputDir)).getProjectRelativePath().toString(), true, true, true, true, true));
				configs.add(createConfiguration(IGeneratorSlots.DEFAULT_SRC, src.getFolder(new Path(outputDir)).getProjectRelativePath().toString(), false, false, true, false, false));
			} else {
				configs.add(createConfiguration(getNameForPackageName(packageName), srcGen.getFolder(new Path(outputDir)).getProjectRelativePath().toString(), true, true, true, true, true));
				configs.add(createConfiguration("src_"+getNameForPackageName(packageName), src.getFolder(new Path(outputDir)).getProjectRelativePath().toString(), false, false, true, false, false));
			}
		}
		return configs;
	}
	
	private OutputConfiguration createConfiguration(String name, String outputDirectory, boolean canClearOutput, boolean cleanDerived, boolean createOutputDirectory, boolean overrideExistingResources, boolean setDerivedProperty) {
		final OutputConfiguration config = new OutputConfiguration(name);
		config.setOutputDirectory(outputDirectory);
		config.setCanClearOutputDirectory(canClearOutput);
		config.setCleanUpDerivedResources(cleanDerived);
		config.setCreateOutputDirectory(createOutputDirectory);
		config.setOverrideExistingResources(overrideExistingResources);
		config.setSetDerivedProperty(setDerivedProperty);
		return config;
	}
	
	private List<String> getAllPackageNames(TargetApplication androidApplication) {
		List<String> allPackageNames = new ArrayList<String>();
		String packageName;
		if (androidApplication.getPackageName() == null) {
			packageName = androidApplication.getProjectName();
		} else {
			packageName = androidApplication.getPackageName();
		}
		allPackageNames.add(packageName);
		// data package for entity generation
		allPackageNames.add(packageName + ".data");
		return allPackageNames;
	}
	
	private String getNameForPackageName(String pName) {
		if (pName == null) {
			return null;
		}
		if (pName.contains(".")) {
			int lastDot = pName.lastIndexOf(".");
			return pName.substring(lastDot + 1).toUpperCase();
		} else if (pName.contains("/")) {
			int lastSlash = pName.lastIndexOf("/");
			return pName.substring(lastSlash + 1).toUpperCase();
		} else {
			return pName;
		}
	}
	
}
