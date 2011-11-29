package hu.bme.mit.androtext.gen.resources

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry

class StringArrayResourceGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions extensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (entries : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (StringArrayResource))).flatten) {
			fsa.generateFile(entries.name + ".xml", IGeneratorSlots::VALUES_SLOT, generate(entries))
		}
	}
	
	def generate(StringArrayResource stringArrayResource) '''
		«stringArrayResource.xmlHeader»
		<resources>
			<string-array name="«stringArrayResource.name»">
				«FOR entry : stringArrayResource.entries»
					«entry.generate.toString.trim»
				«ENDFOR»
			</string-array>
		</resources>
	'''
	
	def generate(StringArrayEntry entry) '''
		«IF !entry.name.nullOrEmpty»
			<item name="«entry.name»">«entry.value»</item>
		«ELSE»
			<item>«entry.value»</item>
		«ENDIF»
		
	'''
	
}