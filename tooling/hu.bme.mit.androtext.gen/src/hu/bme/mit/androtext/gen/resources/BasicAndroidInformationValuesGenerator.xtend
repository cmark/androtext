package hu.bme.mit.androtext.gen.resources

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class BasicAndroidInformationValuesGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions extensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		fsa.generateFile("string.xml", IGeneratorSlots::VALUES_SLOT, content(resourceSet, androidApplication))
	}
	
	def content(ResourceSet resourceSet, TargetApplication androidApplication) '''
		«androidApplication.xmlHeader»
		<resources>
			«stringLine("app_name", androidApplication.application.name)»
			«stringLine("package_name", androidApplication.findPackageName)»
			«FOR activity : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (Activity))).flatten»
				«stringLine(activity.activityNameValue, activity.name)»
			«ENDFOR» 
		</resources>
	'''
	
	def stringLine(String name, String value) '''
		<string name="«name»">«value»</string>
	'''
	
}