package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IAbstractActivityGenerator
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.ImportManager

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene

class AbstractActivityClassGenerator implements IAbstractActivityGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension AbstractActivityFieldGenerator
	@Inject extension AbstractActivityMethodGenerator
	
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
		import android.os.Bundle;
		«activity.importActivity.toString.trim»
		«activity.extraImports.toString.trim»
		
		«body»
	'''
	
	def dispatch extraImports(Activity activity) ''''''
	
	def dispatch extraImports(ListActivity activity) '''
		import android.widget.ArrayAdapter;
	'''
	
	def dispatch extraImports(TabActivity activity) '''
		import android.widget.TabHost;
		import android.content.Intent;
		import android.content.res.Resources;
	'''
	
	def dispatch extraImports(BaseGameActivity activity) '''
		import android.graphics.Color;
		import android.graphics.Typeface;
		import android.hardware.SensorManager;
		import org.anddev.andengine.engine.Engine;
		import org.anddev.andengine.engine.options.EngineOptions;
		import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
		import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
		import org.anddev.andengine.entity.Entity;
		import org.anddev.andengine.entity.text.Text;
		import org.anddev.andengine.entity.sprite.Sprite;
		import org.anddev.andengine.entity.scene.Scene;
		import org.anddev.andengine.entity.scene.menu.MenuScene;
		import org.anddev.andengine.entity.scene.menu.MenuScene.IOnMenuItemClickListener;
		import org.anddev.andengine.entity.scene.menu.item.SpriteMenuItem;
		import org.anddev.andengine.entity.scene.menu.item.TextMenuItem;
		import org.anddev.andengine.entity.scene.background.*;
		import org.anddev.andengine.engine.camera.Camera;
		import org.anddev.andengine.util.HorizontalAlign;
		import org.anddev.andengine.entity.primitive.*;
		import org.anddev.andengine.opengl.font.*;
		import org.anddev.andengine.opengl.texture.*;
		import org.anddev.andengine.opengl.texture.region.*;
		import org.anddev.andengine.opengl.texture.atlas.bitmap.*;
		import org.anddev.andengine.entity.modifier.*;
		import org.anddev.andengine.extension.physics.box2d.*;
		import com.badlogic.gdx.math.*;
		import com.badlogic.gdx.physics.box2d.*;
		import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
		import com.badlogic.gdx.physics.box2d.joints.*;
		import org.anddev.andengine.extension.physics.box2d.util.Vector2Pool;
		import org.anddev.andengine.sensor.accelerometer.AccelerometerData;
		import org.anddev.andengine.sensor.accelerometer.IAccelerometerListener;
		import javax.microedition.khronos.opengles.GL10;
	'''
	
	def dispatch importActivity(Activity a) '''
		import android.app.«a.eClass.name»;
	'''
	
	def dispatch importActivity(BaseGameActivity activity) '''
		import org.anddev.andengine.ui.activity.BaseGameActivity;
	'''
	
	def dispatch importActivity(PreferenceActivity a) '''
		import android.preference.PreferenceActivity;
	''' 
	
	def body(Activity activity, ImportManager manager) '''
		public abstract class «activity.abstractClassName» extends «activity.eClass.name» «activity.interfaces.toString.trim» {
			
			«activity.generateFields»
			
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				«activity.contentViewSet»
				«activity.logic»
			}
			
			«activity.generateMethods»
			
		} 
	'''
	
	def dispatch interfaces(Activity activity) ''''''
	def dispatch interfaces(BaseGameActivity activity) '''
«««		«IF activity.findSensorUsage»implements IAccelerometerListener«ENDIF»
		«IF activity.scene instanceof MenuScene»implements IOnMenuItemClickListener«ENDIF»
	'''
	
	def dispatch contentViewSet(Activity activity) '''
		«IF activity.layout != null»
		setContentView(R.layout.«activity.layout.layoutName»);
		«ENDIF»
	'''
	
	def dispatch contentViewSet(TabActivity activity) '''
		setContentView(R.layout.«activity.tabActivityLayout»);
	'''
	
	def dispatch logic(Activity activity) ''''''
	def dispatch logic(ListActivity activity) '''
		«val listItem = activity.listitem.layoutName»
		«activity.contentProvider.generate(listItem)»
	'''
	
	def dispatch logic(TabActivity activity) '''
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost();  // The activity TabHost
		TabHost.TabSpec spec;  // Resusable TabSpec for each tab
		Intent intent;  // Reusable Intent for each tab
		«FOR tab : activity.tabs»
		intent = new Intent().setClass(this, «tab.activity.className».class);
		spec = tabHost.newTabSpec("«tab.tag»").setIndicator("«tab.tag.toFirstUpper»",
						res.getDrawable(R.drawable.«tab.drawable.link.name»))
						.setContent(intent);
		tabHost.addTab(spec);
		
		«ENDFOR»
		
		tabHost.setCurrentTab(2);
	'''
	
	def dispatch generate(ContentProvider provider, String listItem) ''''''
	def dispatch generate(ResourceContentProvider provider, String listItem) '''
		«provider.link.generateContentSet(listItem)»
	'''
	
	def dispatch generateContentSet(ArrayResource resource, String listItem) '''
	'''
	def dispatch generateContentSet(StringArrayResource resource, String listItem) '''
		String[] «resource.name» = getResources().getStringArray(R.array.«resource.name»);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.«listItem», «resource.name»));
	'''
	def dispatch generateContentSet(IntegerArrayResource resource, String listItem) '''
	'''
	
}