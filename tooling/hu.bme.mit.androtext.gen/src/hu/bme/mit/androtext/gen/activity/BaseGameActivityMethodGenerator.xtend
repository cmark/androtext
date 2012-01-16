package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic
import hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.Bindable
import hu.bme.mit.androtext.lang.androTextDsl.Binding
import hu.bme.mit.androtext.lang.androTextDsl.BindingTarget
import hu.bme.mit.androtext.lang.androTextDsl.Body
import hu.bme.mit.androtext.lang.androTextDsl.BoxBody
import hu.bme.mit.androtext.lang.androTextDsl.CircleBody
import hu.bme.mit.androtext.lang.androTextDsl.Color
import hu.bme.mit.androtext.lang.androTextDsl.EntityBindingTarget
import hu.bme.mit.androtext.lang.androTextDsl.EntityModifier
import hu.bme.mit.androtext.lang.androTextDsl.Fixture
import hu.bme.mit.androtext.lang.androTextDsl.Font
import hu.bme.mit.androtext.lang.androTextDsl.FromDouble
import hu.bme.mit.androtext.lang.androTextDsl.GameBackground
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity
import hu.bme.mit.androtext.lang.androTextDsl.Joint
import hu.bme.mit.androtext.lang.androTextDsl.Line
import hu.bme.mit.androtext.lang.androTextDsl.LineBody
import hu.bme.mit.androtext.lang.androTextDsl.LoopEntityModifier
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
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion
import hu.bme.mit.androtext.lang.androTextDsl.ToDouble

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class BaseGameActivityMethodGenerator {
	
	@Inject extension GeneratorExtensions
	
	def methods(BaseGameActivity activity) '''
«««		«val boolean isSensorNeeded = activity.findSensorUsage»
		@Override
		public Engine onLoadEngine() {
			«activity.loadEngine»
		}
		
		@Override
		public void onLoadResources() {
			BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");
			«activity.loadResources»
		}
		
		@Override
		public Scene onLoadScene() {
			«activity.scene.loadScene»
		}
		
		@Override
		public void onLoadComplete() {
		}
		
		private void initializeScene(Scene scene) {
			«activity.scene.initializeScene»
		}
		
		private void initializeLogic() {
			«activity.scene.initializeLogic»
		}
		
		private void initializeBox2D() {
			«activity.scene.initializeBox2D»
		}
		
«««		@Override
«««		public void onResumeGame() {
«««			super.onResumeGame();
«««			«IF isSensorNeeded»
«««			this.enableAccelerometerSensor(this);
«««			«ENDIF»
«««		}
«««		
«««		@Override
«««		public void onPauseGame() {
«««			super.onPauseGame();
«««			«IF isSensorNeeded»
«««			this.disableAccelerometerSensor();
«««			«ENDIF»
«««		}
«««		
«««		«IF isSensorNeeded»
«««		@Override
«««		public void onAccelerometerChanged(AccelerometerData pAccelerometerData) {
«««			final Vector2 gravity = Vector2Pool.obtain(pAccelerometerData.getX(), pAccelerometerData.getY());
«««			this.mPhysicsWorld.setGravity(gravity);
«««			Vector2Pool.recycle(gravity);
«««		}
«««		«ENDIF»
		
	'''
	
	def initializeBox2D(Scene scene) '''
		«FOR logic : scene.eResource.allContentsIterable.filter(typeof(AndroGameLogic))»
		this.mPhysicsWorld = new PhysicsWorld(new Vector2(0, «IF logic.box2dOptions == null»SensorManager.GRAVITY_EARTH«ELSE»«logic.box2dOptions.gravity»«ENDIF»), false);
		// create box2d components
		«logic.generateBox2DComponents»
		this.mScene.registerUpdateHandler(this.mPhysicsWorld);
		«ENDFOR»
	'''
	
	def generateBox2DComponents(AndroGameLogic logic) '''
		«FOR fixture : logic.logicComponent.filter(typeof(Fixture))»
		FixtureDef «fixture.name» = PhysicsFactory.createFixtureDef(«fixture.density»f, «fixture.restitution»f, «fixture.friction»f);
		«ENDFOR»
		«FOR body : logic.logicComponent.filter(typeof(Body))»
		«FOR binding : logic.eResource.allContentsIterable.filter(typeof(Binding))»
		«IF binding.bindable.equals(body)»
		«val gameEntity = binding.bindingTarget.getEntity»
		Body «body.name»For«gameEntity.name.toString.trim» = PhysicsFactory.create«body.eClass.name»(«body.factoryParameters(gameEntity).toString.trim»);
		this.mPhysicsWorld.registerPhysicsConnector(new PhysicsConnector(this.«gameEntity.entityFieldName.toString.trim», «body.name»For«gameEntity.name», true, true));
		«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR joint : logic.logicComponent.filter(typeof(Joint))»
		// TODO: joint generation «joint.name»
		«ENDFOR»
	'''
	
	def dispatch GameEntity getEntity(BindingTarget target) {
		return null
	}
	def dispatch GameEntity getEntity(EntityBindingTarget target) {
		return target.entity	
	}
	
	def dispatch factoryParameters(Body body, GameEntity entity) ''''''
	def dispatch factoryParameters(BoxBody body, GameEntity entity) '''
		this.mPhysicsWorld, this.«entity.entityFieldName.toString.trim», BodyType.«body.bodyType.name.toLowerCase.toFirstUpper»Body, «body.fixture.name»
	'''
	def dispatch factoryParameters(CircleBody body, GameEntity entity) '''
		this.mPhysicsWorld, this.«entity.entityFieldName.toString.trim», BodyType.«body.bodyType.name.toFirstUpper», «body.fixture.name»
	'''
	def dispatch factoryParameters(LineBody body, GameEntity entity) '''
		this.mPhysicsWorld, this.«entity.entityFieldName.toString.trim», «body.fixture.name»
	'''
		
	def loadEngine(BaseGameActivity activity) '''
		this.mCamera = new Camera(0, 0, «activity.size.w»f, «activity.size.h»f); 
		EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.«activity.orientation.name.toUpperCase», new RatioResolutionPolicy(«activity.size.w»f, «activity.size.h»f), this.mCamera);
		Engine engine = new Engine(engineOptions);
		return engine;
	'''
	
	def loadResources(BaseGameActivity activity) '''
		// load textures
		«var Iterable<TextureRegion> regions = activity.scene.eResource.allContentsIterable.filter(typeof (TextureRegion))»
		«var Iterable<Font> fonts = activity.scene.eResource.allContentsIterable.filter(typeof (Font))»
		«FOR texture : regions»
		BitmapTextureAtlas «texture.name» = new BitmapTextureAtlas(64, 64, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		this.«texture.textureRegionFieldName.toString.trim» = BitmapTextureAtlasTextureRegionFactory.createFromAsset(«texture.name», this, "«texture.fileName»", 0, 0);
		«ENDFOR»
		getEngine().getTextureManager().loadTextures(«FOR texture : regions SEPARATOR ', '»«texture.name»«ENDFOR»);
		// load fonts
		«FOR font : fonts»
		BitmapTextureAtlas «font.textureVariableName.toString.trim» = new BitmapTextureAtlas(256, 256, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		this.«font.fontFieldName.toString.trim» = FontFactory.create(«font.textureVariableName.toString.trim», Typeface.create(Typeface.DEFAULT, Typeface.«IF font.type != null»«font.type.name.toUpperCase»«ELSE»NORMAL«ENDIF»), «font.size»f, «font.antialias», Color.«IF font.color.constantColor != null»«font.color.constantColor.name.toUpperCase»«ELSE»«font.color.argb»«ENDIF»);
		getEngine().getTextureManager().loadTexture(«font.textureVariableName.toString.trim»);
		«ENDFOR»
		getEngine().getFontManager().loadFonts(«FOR font : fonts SEPARATOR ', '»this.«font.fontFieldName.toString.trim»«ENDFOR»);
	'''
	
	def argb(Color color) '''
		argb(«color.a»*255.0f, «color.r»*255.0f, «color.g»*255.0f, «color.b»*255.0f)
	'''
	
	def loadScene(Scene scene) '''
		this.mScene = new Scene();
		IBackground bg = «scene.gameBackground.loadBackground.toString.trim»;
		this.mScene.setBackground(bg);
		initializeScene(this.mScene);
		initializeLogic();
		initializeBox2D();
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
		«entity.position.position.toString.trim», «entity.font.fontFieldName.toString.trim», "«entity.text.replaceAll("[\\n]", "\\\\n")»" «IF entity.halign != null», HorizontalAlign.«entity.halign.name.toUpperCase»«ENDIF»
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
		«FOR logic : scene.eResource.allContentsIterable.filter(typeof (Binding))»
		«logic.generate»
		«ENDFOR»
	'''
	
	def generate(Binding logic) '''
		«IF logic.bindable instanceof EntityModifier»
		this.«logic.bindingTarget.toString.trim».registerEntityModifier(«logic.bindable.name.toString.trim»);
		«ENDIF»
	'''
	
	def name(Bindable bindable) ''''''
	def name(Body bindable) '''
		«bindable.name»
	'''
	def name(EntityModifier bindable) '''
		«bindable.name»
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