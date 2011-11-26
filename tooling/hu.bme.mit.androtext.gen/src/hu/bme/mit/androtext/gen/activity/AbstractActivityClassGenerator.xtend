package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.ImportManager

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity

class AbstractActivityClassGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions extensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (activity : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (Activity))).flatten) {
			fsa.generateFile(activity.abstractClassName + ".java", generate(activity, androidApplication))
		}
	}
	
	def generate(Activity activity, TargetApplication application) '''
		«val importManager = new ImportManager(true)»
		«/* first evaluate the body in order to collect the used types for the import section */
		val body = body(activity, importManager)»
		«IF !(application.findPackageName.isNullOrEmpty)»
			package «application.findPackageName»;
			
		«ENDIF»
		«FOR i : importManager.imports»
			import «i»;
		«ENDFOR»
		import android.app.Activity;
		import android.os.Bundle;
		
		«body»
	'''
	
	def body(Activity activity, ImportManager manager) '''
		public abstract class «activity.abstractClassName» extends Activity {
			
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				«activity.contentViewSet»
			}
			
		} 
	'''
	
	def dispatch contentViewSet(Activity activity) ''''''
	
	def dispatch contentViewSet(SimpleActivity activity) '''
		setContentView(R.layout.«activity.layout.layoutName»);
	'''
	
}