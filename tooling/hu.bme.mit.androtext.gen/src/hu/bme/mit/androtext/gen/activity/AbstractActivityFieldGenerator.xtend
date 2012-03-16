package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.Font
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity
import hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.Activity

class AbstractActivityFieldGenerator {
	
	@Inject extension GeneratorExtensions
	
	def defaultFields(AbstractActivity activity) '''
		protected final static String TAG = "«activity.className»";
	'''
	
	def dispatch generateFields(AbstractActivity activity) '''
		«activity.defaultFields.toString.trim»
	'''
	def dispatch generateFields(Activity activity) '''
		«activity.defaultFields.toString.trim»
		«IF activity.databinding != null && activity.databinding.contentProvider instanceof DatabaseContentProvider && activity.databinding.entity != null»
		protected final static String[] PROJECTION = new String[] {
			«activity.databinding.entity.columnsClassName»._ID,
			«FOR p : activity.databinding.projection SEPARATOR ','»
			«activity.databinding.entity.columnsClassName».«p.name.toUpperCase»
			«ENDFOR»
		};
		«ENDIF»
		«IF activity.databinding != null»
		protected Cursor mCursor;
		«ENDIF»
	'''
	def dispatch generateFields(ListActivity activity) '''
		«activity.defaultFields.toString.trim»
		«IF activity.databinding != null && activity.databinding.fetchAll && activity.databinding.contentProvider instanceof DatabaseContentProvider && activity.databinding.entity != null»
		protected final static String[] PROJECTION = new String[] {
			«activity.databinding.entity.columnsClassName»._ID,
			«FOR p : activity.databinding.projection SEPARATOR ','»
			«activity.databinding.entity.columnsClassName».«p.name.toUpperCase»
			«ENDFOR»
		};
		«ENDIF»
		«IF activity.databinding != null»
		protected Cursor mCursor;
		«ENDIF»
	'''
	def dispatch generateFields(BaseGameActivity activity) '''
		«activity.defaultFields.toString.trim»
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