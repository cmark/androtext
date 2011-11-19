package hu.bme.mit.androtext.gen

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.activity.AbstractActivityClassGenerator
import hu.bme.mit.androtext.gen.activity.ActivityClassGenerator
import hu.bme.mit.androtext.gen.application.AndroidManifestGenerator
import hu.bme.mit.androtext.gen.entity.EntityClassGenerator
import hu.bme.mit.androtext.gen.entity.EntityTableGenerator
import hu.bme.mit.androtext.gen.resources.BasicAndroidInformationValuesGenerator
import hu.bme.mit.androtext.gen.resources.LayoutResourceGenerator
import hu.bme.mit.androtext.gen.resources.StringArrayResourceGenerator
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

class AndroTextGeneratorMain implements IGenerator {
	
	@Inject EntityClassGenerator entityClassGenerator
	
	@Inject EntityTableGenerator entityTableGenerator
	
	@Inject AndroidManifestGenerator manifestGenerator
	
	@Inject BasicAndroidInformationValuesGenerator basicValueGenerator
	
	@Inject StringArrayResourceGenerator stringArrayResourceGenerator
	
	@Inject AbstractActivityClassGenerator abstractActivityClassGenerator
	
	@Inject ActivityClassGenerator activityClassGenerator
	
	@Inject LayoutResourceGenerator layoutGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication targetApplication) {
		// generate data related stuff only if datamodel is defined
		if (targetApplication.application.dataroot != null) {
			entityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
			entityTableGenerator.doGenerate(resourceSet, fsa, targetApplication);	
		}
		manifestGenerator.doGenerate(resourceSet, fsa, targetApplication);
		basicValueGenerator.doGenerate(resourceSet, fsa, targetApplication);
		stringArrayResourceGenerator.doGenerate(resourceSet, fsa, targetApplication);
		abstractActivityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
		activityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
		layoutGenerator.doGenerate(resourceSet, fsa, targetApplication);
	}
	
}