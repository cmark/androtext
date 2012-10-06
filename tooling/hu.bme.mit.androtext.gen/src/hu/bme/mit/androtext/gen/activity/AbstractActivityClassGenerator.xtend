package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IAbstractActivityGenerator
import hu.bme.mit.androtext.gen.IActivityMethodGenerator
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.ImportManager

class AbstractActivityClassGenerator implements IAbstractActivityGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension AbstractActivityFieldGenerator
	@Inject extension IActivityMethodGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (activity : resourceSet.resources.map(r | r.allContents.toIterable.filter(typeof (AbstractActivity))).flatten) {
			fsa.generateFile(activity.abstractClassName + ".java", generate(activity, androidApplication))
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
		«activity.importActivity.toString.trim»
		«activity.extraImports.toString.trim»
		«activity.genDepImports(application).toString.trim»
		
		«body»
	'''
	
	def dispatch genDepImports(AbstractActivity activity, TargetApplication app) ''''''
	def dispatch genDepImports(Activity activity, TargetApplication app) '''
		«IF activity.databinding != null && activity.databinding.entity != null»
		import «app.dataPackageName».«app.dataInformationClassName».«activity.databinding.entity.columnsClassName»;
		«ENDIF»
	'''
	def dispatch genDepImports(ListActivity activity, TargetApplication app) '''
		«IF activity.databinding != null && activity.databinding.entity != null»
		import «app.dataPackageName».«app.dataInformationClassName».«activity.databinding.entity.columnsClassName»;
		«ENDIF»
	'''
	
	def basicImports(AbstractActivity activity) '''
		import android.net.Uri;
		import android.util.Log;
		import android.widget.Button;
		import android.widget.TextView;
		import android.widget.EditText;
		import android.widget.AutoCompleteTextView;
		import android.widget.GridView;
		import android.widget.TableRow;
		import android.widget.LinearLayout;
		import android.view.View;
		import android.view.View.OnClickListener;
		import android.content.Intent;
		import android.content.ContentUris;
		«IF activity.menu != null»
		import android.view.Menu;
		import android.view.MenuItem;
		«ENDIF»
		«IF activity.contextMenu != null»
		import android.view.ContextMenu;
		import android.view.ContextMenu.ContextMenuInfo;
		«ENDIF»
		«IF activity.contextMenu != null || activity.menu != null»
		import android.view.MenuInflater;
		«ENDIF»
	'''
	
	def dispatch extraImports(Activity activity) '''
		«activity.basicImports.toString.trim»
		import android.database.Cursor;
	'''
	
	def dispatch extraImports(ListActivity activity) '''
		«activity.basicImports.toString.trim»
		import android.widget.ArrayAdapter;
		import android.widget.AdapterView;
		import android.widget.AdapterView.OnItemClickListener;
		import android.database.Cursor;
		import android.widget.SimpleCursorAdapter;
		import android.widget.ListView;
	'''
	
	def dispatch extraImports(TabActivity activity) '''
		«activity.basicImports.toString.trim»
		import android.widget.TabHost;
		import android.content.Intent;
		import android.content.res.Resources;
	'''
	
	def dispatch extraImports(PreferenceActivity activity) '''
		«activity.basicImports.toString.trim»
	'''
	
	def dispatch importActivity(AbstractActivity a) '''
		import android.app.«a.eClass.name»;
	'''
	
	def dispatch importActivity(PreferenceActivity a) '''
		import android.preference.PreferenceActivity;
	'''
	
	def body(AbstractActivity activity, ImportManager manager) '''
		public abstract class «activity.abstractClassName» extends «activity.eClass.name» «activity.interfaces.toString.trim» {
			
			«activity.generateFields»
			
			«activity.generateMethods»
			
		}
	'''
	
	def dispatch interfaces(AbstractActivity activity) ''''''

}
