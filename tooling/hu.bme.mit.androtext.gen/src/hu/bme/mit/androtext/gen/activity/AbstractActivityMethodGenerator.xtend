package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.Color
import hu.bme.mit.androtext.lang.androTextDsl.EntityModifier
import hu.bme.mit.androtext.lang.androTextDsl.FromDouble
import hu.bme.mit.androtext.lang.androTextDsl.GameBackground
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity
import hu.bme.mit.androtext.lang.androTextDsl.Line
import hu.bme.mit.androtext.lang.androTextDsl.Logic
import hu.bme.mit.androtext.lang.androTextDsl.LoopEntityModifier
import hu.bme.mit.androtext.lang.androTextDsl.ModifierBinding
import hu.bme.mit.androtext.lang.androTextDsl.MoveByModifier
import hu.bme.mit.androtext.lang.androTextDsl.MoveModifier
import hu.bme.mit.androtext.lang.androTextDsl.Position
import hu.bme.mit.androtext.lang.androTextDsl.Rectangle
import hu.bme.mit.androtext.lang.androTextDsl.RotationByModifier
import hu.bme.mit.androtext.lang.androTextDsl.RotationModifier
import hu.bme.mit.androtext.lang.androTextDsl.Scene
import hu.bme.mit.androtext.lang.androTextDsl.SequenceEntityModifier
import hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity
import hu.bme.mit.androtext.lang.androTextDsl.Size
import hu.bme.mit.androtext.lang.androTextDsl.Sprite
import hu.bme.mit.androtext.lang.androTextDsl.Text
import hu.bme.mit.androtext.lang.androTextDsl.ToDouble

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion

class AbstractActivityMethodGenerator {
	
	@Inject extension GeneratorExtensions
	
	def dispatch generateMethods(Activity activity) ''''''
	def dispatch generateMethods(BaseGameActivity activity) '''
		
		public Engine onLoadEngine() {
			«activity.loadEngine»
		}
		
		public void onLoadResources() {
			BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");
			«activity.loadResources»
		}
		
		public Scene onLoadScene() {
			«activity.scene.loadScene»
		}
		
		public void onLoadComplete() {
		}
		
		private void initializeScene(Scene scene) {
			«activity.scene.initializeScene»
		}
		
		private void initializeLogic() {
			«activity.scene.initializeLogic»
		}
		
	'''
	
	def loadEngine(BaseGameActivity activity) '''
		this.mCamera = new Camera(0, 0, «activity.size.w»f, «activity.size.h»f); 
		EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.«activity.orientation.name.toUpperCase», new RatioResolutionPolicy(«activity.size.w»f, «activity.size.h»f), this.mCamera);
		Engine engine = new Engine(engineOptions);
		return engine;
	'''
	
	def loadResources(BaseGameActivity activity) '''
		«FOR texture : activity.scene.eResource.allContentsIterable.filter(typeof (TextureRegion))»
		BitmapTextureAtlas «texture.name» = new BitmapTextureAtlas(64, 64, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		this.«texture.textureRegionFieldName.toString.trim» = BitmapTextureAtlasTextureRegionFactory.createFromAsset(«texture.name», this, "«texture.fileName»", 0, 0);
		«ENDFOR»
		getEngine().getTextureManager().loadTextures(«FOR texture : activity.scene.eResource.allContentsIterable.filter(typeof (TextureRegion)) SEPARATOR ', '»«texture.name»«ENDFOR»);
	'''
	
	def loadScene(Scene scene) '''
		this.mScene = new Scene();
		IBackground bg = «scene.gameBackground.loadBackground.toString.trim»;
		this.mScene.setBackground(bg);
		initializeScene(this.mScene);
		initializeLogic();
		return this.mScene;
	'''
	
	def loadBackground(GameBackground bg) '''
		«IF bg.color != null»
		new ColorBackground(«bg.color.generateColorParameters.toString.trim»)
		«ELSEIF bg.textureRegion != null»
		new SpriteBackground(new Sprite(0, 0, «bg.textureRegion.textureRegionFieldName.toString.trim»))
		«ELSE»
		Error when processing background!
		«ENDIF»
	'''
	
	def initializeScene(Scene scene) '''
		«FOR e : scene.entities»
			«e.generate(null).toString.trim»
			scene.attachChild(this.«e.entityFieldName.toString.trim»);
		«ENDFOR»
	'''
	
	def generate(GameEntity e, GameEntity parent) '''
		this.«e.entityFieldName.toString.trim» = new «e.type.toString.trim»(«e.ctrParameters.toString.trim»);
		«IF e.color != null»this.«e.entityFieldName.toString.trim».setColor(«e.color.generateColorParameters.toString.trim»);«ENDIF»
		«e.generateChildren»
		«IF parent != null»
		this.«parent.entityFieldName.toString.trim».attachChild(this.«e.entityFieldName.toString.trim»);
		«ENDIF»
	'''
	
	def generateColorParameters(Color color) '''
		«color.r»f, «color.g»f, «color.b»f, «IF color.a != null»«color.a»f«ENDIF»
	'''
	
	def dispatch ctrParameters(GameEntity entity) ''''''
	
	def dispatch ctrParameters(SimpleEntity entity) '''
		«IF entity.position != null»
			«entity.position.position.toString.trim» 
		«ENDIF»
	'''
	
	def dispatch ctrParameters(Line entity) '''
		«entity.from.generate.toString.trim», «entity.to.generate.toString.trim» «IF entity.lineWidth != null && entity.lineWidth != 0», «entity.lineWidth»f«ENDIF»
	'''
	
	def generate(FromDouble from) '''
		«from.x»f, «from.y»f
	'''
	
	def generate(ToDouble to) '''
		«to.x»f, «to.y»f
	'''
	
	def dispatch ctrParameters(Rectangle entity) '''
		«entity.position.position.toString.trim», «entity.size.size.toString.trim»
	'''
	
	def dispatch ctrParameters(Sprite entity) '''
		«entity.position.position.toString.trim», «IF entity.size != null»«entity.size.size.toString.trim»,«ENDIF» this.«entity.textureRegion.textureRegionFieldName»
	'''
	
	def dispatch ctrParameters(AnimatedSprite entity) '''
		«entity.position.position.toString.trim», this.«entity.textureRegion.textureRegionFieldName»
	'''
	
	def dispatch ctrParameters(Text entity) '''
		«entity.position.position.toString.trim», «entity.font.fontFieldName», "«entity.text.toString.trim»" «IF entity.halign != null», HorizontalAlign.«entity.halign.name.toUpperCase»«ENDIF»
	'''
	
	def position(Position position) '''
		«position.x»f, «position.y»f
	'''
	
	def size(Size size) '''
		«size.w»f, «size.h»f
	'''
	
	def dispatch generateChildren(GameEntity entity) ''''''
	def dispatch generateChildren(SimpleEntity entity) '''
		«FOR c : entity.children»
			«c.generate(entity).toString.trim»
		«ENDFOR»
	'''
	
	def initializeLogic(Scene scene) '''
		«FOR modifier : scene.eResource.allContentsIterable.filter(typeof (EntityModifier))»
		«IF !(modifier instanceof LoopEntityModifier) && !(modifier instanceof SequenceEntityModifier)»
		«modifier.generate»
		«ENDIF»
		«ENDFOR»
		«FOR modifier : scene.eResource.allContentsIterable.filter(typeof (SequenceEntityModifier))»
		«modifier.generate»
		«ENDFOR»
		«FOR modifier : scene.eResource.allContentsIterable.filter(typeof (LoopEntityModifier))»
		«modifier.generate»
		«ENDFOR»
		«FOR logic : scene.eResource.allContentsIterable.filter(typeof (Logic))»
		«logic.generate»
		«ENDFOR»
	'''
	
	def dispatch generate(Logic logic) ''''''
	def dispatch generate(ModifierBinding logic) '''
		this.«logic.gameEntity.entityFieldName.toString.trim».registerEntityModifier(«logic.modifier.name»);
	'''
	
	def type(EntityModifier modifier) '''
		«modifier.eClass.name»
	'''
	
	def generate(EntityModifier modifier) '''
		«modifier.type.toString.trim» «modifier.name» = new «modifier.type.toString.trim»(«modifier.ctrParameters.toString.trim»);
	'''
	
	def dispatch ctrParameters(EntityModifier modifier) ''''''
	
	def dispatch ctrParameters(MoveModifier modifier) '''
		«modifier.duration»f, «modifier.from.x»f, «modifier.to.x»f, «modifier.from.y»f, «modifier.to.y»f
	'''
	
	def dispatch ctrParameters(MoveByModifier modifier) '''
		«modifier.duration»f, «modifier.by.x»f, «modifier.by.y»f
	'''
	
	def dispatch ctrParameters(RotationModifier modifier) '''
		«modifier.duration»f, «modifier.from.value»f, «modifier.to.value»f
	'''
	
	def dispatch ctrParameters(RotationByModifier modifier) '''
		«modifier.duration»f, «modifier.by.value»f
	'''
	
	def dispatch ctrParameters(LoopEntityModifier modifier) '''
		«FOR m : modifier.modifiers SEPARATOR ','»«m.name»«ENDFOR»
	'''
	
	def dispatch ctrParameters(SequenceEntityModifier modifier) '''
		«FOR m : modifier.modifiers SEPARATOR ','»«m.name»«ENDFOR»
	'''
	
}