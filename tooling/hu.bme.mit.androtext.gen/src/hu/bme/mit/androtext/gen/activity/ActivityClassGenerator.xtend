package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.ImportManager

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity

class ActivityClassGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions extensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (activity : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (AbstractActivity))).flatten) {
			fsa.generateFile(activity.className + ".java", IGeneratorSlots::DEFAULT_SRC, generate(activity, androidApplication))	
		}
	}
	
	def generate(AbstractActivity activity, TargetApplication application) '''
		«val importManager = new ImportManager(true)»
		«/* first evaluate the body in order to collect the used types for the import section */
		val body = body(activity, importManager)»
		«IF !(application.findPackageName.isNullOrEmpty)»
			package «application.findPackageName»;
			
		«ENDIF»
		«FOR i : importManager.imports»
			import «i»;
		«ENDFOR»
		import android.os.Bundle;
		
		«body»
	'''
	
	def body(AbstractActivity activity, ImportManager manager) '''
		public class «activity.className» extends «activity.abstractClassName» {
			
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
			}
		}
	'''
	
}