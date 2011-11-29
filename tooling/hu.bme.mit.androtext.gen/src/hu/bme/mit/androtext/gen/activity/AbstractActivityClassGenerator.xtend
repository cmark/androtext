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
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource

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
		«activity.importActivity.toString.trim»
		import android.os.Bundle;
		import android.widget.ArrayAdapter;
		
		«body»
	'''
	
	def dispatch importActivity(Activity a) '''
		import android.app.«a.eClass.name»;
	'''
	
	def dispatch importActivity(PreferenceActivity a) '''
		import android.preference.PreferenceActivity;
	''' 
	
	def body(Activity activity, ImportManager manager) '''
		public abstract class «activity.abstractClassName» extends «activity.eClass.name» {
			
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				«activity.contentViewSet»
				«activity.logic»
			}
			
		} 
	'''
	
	def dispatch contentViewSet(Activity activity) ''''''
	
	def dispatch contentViewSet(SimpleActivity activity) '''
		setContentView(R.layout.«activity.layout.layoutName»);
	'''
	
	def dispatch logic(Activity activity) ''''''
	def dispatch logic(ListActivity activity) '''
		«val listItem = activity.listitem.layoutName»
		«activity.contentProvider.generate(listItem)»
	'''
	
	def dispatch generate(ContentProvider provider, String listItem) ''''''
	def dispatch generate(ResourceContentProvider provider, String listItem) '''
		«provider.link.generateContentSet(listItem)»
	'''
	
	def dispatch generateContentSet(ArrayResource resource, String listItem) '''
	'''
	def dispatch generateContentSet(StringArrayResource resource, String listItem) '''
		String[] countries = getResources().getStringArray(R.array.«resource.name»);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.«listItem», countries));
	'''
	def dispatch generateContentSet(IntegerArrayResource resource, String listItem) '''
	'''
	
}