package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IAbstractActivityGenerator
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.ImportManager

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

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
	
	def basicImports(Activity activity) '''
		import android.widget.Button;
		import android.view.View;
		import android.view.View.OnClickListener;
		import android.content.Intent;
	'''
	
	def dispatch extraImports(Activity activity) '''
		«activity.basicImports.toString.trim»
	'''
	
	def dispatch extraImports(ListActivity activity) '''
		«activity.basicImports.toString.trim»
		import android.widget.ArrayAdapter;
		import android.widget.AdapterView.OnItemClickListener;
	'''
	
	def dispatch extraImports(TabActivity activity) '''
		«activity.basicImports.toString.trim»
		import android.widget.TabHost;
		import android.content.Intent;
		import android.content.res.Resources;
	'''
	
	def dispatch extraImports(BaseGameActivity activity) '''
		«activity.basicImports.toString.trim»
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
			
			«activity.generateMethods»
			
		} 
	'''
	
	def dispatch interfaces(Activity activity) ''''''
	def dispatch interfaces(BaseGameActivity activity) '''
«««		«IF activity.findSensorUsage»implements IAccelerometerListener«ENDIF»
		«IF activity.scene instanceof MenuScene»implements IOnMenuItemClickListener«ENDIF»
	'''
}