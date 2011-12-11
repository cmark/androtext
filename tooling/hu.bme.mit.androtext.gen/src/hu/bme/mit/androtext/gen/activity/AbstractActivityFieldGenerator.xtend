package hu.bme.mit.androtext.gen.activity

import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion
import hu.bme.mit.androtext.lang.androTextDsl.Font
import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity

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
	'''
	
}