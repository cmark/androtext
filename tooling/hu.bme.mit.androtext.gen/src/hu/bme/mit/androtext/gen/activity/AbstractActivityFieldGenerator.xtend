package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.Font
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene
import hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem

class AbstractActivityFieldGenerator {
	
	@Inject extension GeneratorExtensions
	
	def dispatch generateFields(Activity activity) ''''''
	def dispatch generateFields(ListActivity activity) ''''''
	def dispatch generateFields(TabActivity activity) ''''''
	def dispatch generateFields(BaseGameActivity activity) '''
		protected Camera mCamera;
		protected Scene mScene;
		«FOR t : activity.scene.eResource.allContentsIterable.filter(typeof(TextureRegion))»
		protected «IF t.tiled != null»Tiled«ENDIF»TextureRegion «t.textureRegionFieldName.toString.trim»;
		«ENDFOR»
		«FOR f : activity.scene.eResource.allContentsIterable.filter(typeof(Font))»
		protected Font «f.fontFieldName.toString.trim»;
		«ENDFOR»
		«FOR e : activity.scene.eResource.allContentsIterable.filter(typeof(GameEntity))»
		protected «e.type.toString.trim» «e.entityFieldName.toString.trim»;
		«ENDFOR»
		«FOR logic : activity.scene.eResource.allContentsIterable.filter(typeof(AndroGameLogic))»
		«IF logic.containsBox2DObject»
		protected PhysicsWorld mPhysicsWorld;
		«ENDIF»
		«ENDFOR»
		«FOR menu : activity.scene.eResource.allContentsIterable.filter(typeof(MenuScene))»
		protected MenuScene «menu.menuSceneFieldName.toString.trim»;
		«ENDFOR»
		«activity.menuItemFields.toString.trim»
	'''
	
	def menuItemFields(BaseGameActivity activity) {
		var buffer = new StringBuffer()
		var GameMenuItem prev = null
		for(item : activity.findAllGameMenuItems) {
			if (prev == null) {
				buffer.append(item.firstMenuItem)
			} else {
				buffer.append(item.afterFirstMenuItem(prev))
			}
			prev = item
		}
		return buffer.toString
	}
	
	def firstMenuItem(GameMenuItem item) '''
		public static final int «item.name.toUpperCase» = 0;
	'''
	
	def afterFirstMenuItem(GameMenuItem item, GameMenuItem prev) '''
		public static final int «item.name.toUpperCase» = «prev.name.toUpperCase» + 1;
	''' 
	
}