package hu.bme.mit.androtext.gen.util

import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.Body
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.DataTypes
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef
import hu.bme.mit.androtext.lang.androTextDsl.Entity
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef
import hu.bme.mit.androtext.lang.androTextDsl.Font
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity
import hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene
import hu.bme.mit.androtext.lang.androTextDsl.Property
import hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef
import hu.bme.mit.androtext.lang.androTextDsl.View
import java.util.ArrayList
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.compiler.ImportManager

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class GeneratorExtensions {
	
	def xmlHeader(Object o) '''
		<?xml version="1.0" encoding="utf-8"?>
	'''
	
	def androidSchema(Object o) '''
		xmlns:android="http://schemas.android.com/apk/res/android"
	'''
		
	def String authority(TargetApplication application) {
		application.dataPackageName + "." + application.dataInformationClassName
	}
		
	def findPackageName(TargetApplication targetApplication) {
		if (targetApplication.packageName == null || targetApplication.packageName.empty) {
			return targetApplication.projectName;
		} else {
			return targetApplication.packageName;
		}
	}
	
	def path_uri(Entity e) {
		"PATH_"+e.name.toUpperCase() + "S"
	}
	
	def path_id_uri(Entity e) {
		"PATH_"+e.name.toUpperCase() + "_ID"
	}
		
	/**
	 * computes the class name if its a Entity 
	 * returns null otherwise
	 */
	def className(Object o) {
		switch(o) {
			Entity : o.name.toFirstUpper
			Activity : o.name.toFirstUpper
			ContentProvider: o.name.toFirstUpper
			default: o.^class.name.toFirstUpper
		}
	}
	
	def abstractClassName(Object o) {
		"Abstract" + className(o)
	}
	
	def abstractJavaFileName(Object o) {
		"Abstract" + javaFileName(o)
	}
	
	def columnsClassName(Entity entity) {
		entity.className + "Columns"
	}
	
	def name(TypeRef ref) {
		switch (ref) {
			EntityTypeRef: ref.type.className
			DataTypesRef: ref.type.literal
			default: "Object"
		}
	}
	
	def findAllGameMenuItems(BaseGameActivity activity) {
		var menuItems = new ArrayList<GameMenuItem>();
		for (item : activity.scene.eResource.allContentsIterable.filter(typeof (GameMenuItem))) {
			menuItems.add(item)
		}
		return menuItems
	}
	
	def menuSceneFieldName(MenuScene menu) '''
		mMenuScene«menu.name.toFirstUpper»
	'''
	
	def createMenuMethodName(MenuScene menu) '''
		createMenuScene«menu.name.toFirstUpper»
	'''
	
	def variableName(GameMenuItem item) '''
		«item.name.toFirstLower»MenuItem
	'''
	
	def tabActivityLayout(TabActivity activity) {
		activity.name.toLowerCase+"_layout"
	}
	
	def abstractClassName(Activity activity) {
		"Abstract"+activity.className
	}
	
	def javaFileName(Object o) {
		o.className + ".java"
	}
	
	def shortName(JvmTypeReference r, ImportManager importManager) {
		val builder = new StringBuilder()
		importManager.appendType(r.type, builder)
		builder.toString
	}
	
	def featureName(Property f) {
		f.name.toFirstLower
	}
	
	def activityNameValue(Activity a) {
		a.name.toLowerCase()+"_title";	
	}
	
	def dataPackageName(TargetApplication androidApplication) {
		androidApplication.findPackageName + ".data"
	}
	
	def dataInformationClassName(TargetApplication androidApplication) {
		androidApplication.application.name.toFirstUpper + "Data"
	}
	
	def layoutName(View root) {
		root.name.toLowerCase + "_layout"
	}
	
	def textureRegionFieldName(TextureRegion region) '''
		m«region.name.toFirstUpper»TextureRegion
	'''
	
	def fontFieldName(Font font) '''
		m«font.name.toFirstUpper»Font
	'''
	
	def textureVariableName(Font font) '''
		«font.name.toFirstLower»Texture
	'''
	
	def entityFieldName(GameEntity entity) '''
		m«entity.name.toFirstUpper»Entity
	'''
	
	def dispatch type(GameEntity entity) '''
		«entity.eClass.name»
	'''
	
	def dispatch type(SimpleEntity entity) '''
		Entity
	'''
	
//	def boolean findSensorUsage(BaseGameActivity activity) {
//		for (sb : activity.scene.eResource.allContentsIterable.filter(typeof (Binding))) {
//			if (sb.bindingTarget instanceof SensorBindingTarget) {
//				return sb.bindingTarget.isGravity
//			}
//		}
//		return false
//	}
	
//	def dispatch boolean isGravity(BindingTarget target) { 
//		return false;
//	}
//	def dispatch boolean isGravity(SensorBindingTarget target) { 
//		return target.sensor == SensorTarget::GRAVITY
//	}
	
	def boolean containsBox2DObject(AndroGameLogic logic) {
		for (comp : logic.logicComponent) {
			if (comp instanceof Body) {
				return true
			}
		}
		return false
	}
	
	def columnType(Property f) {
		val t = f.type;
		switch (t) {
			EntityTypeRef : "INTEGER" 
			DataTypesRef : columnType(t)
			default: null
		}
	}
	
	def columnType(DataTypesRef ref) {
		switch (ref.type) {
			case DataTypes::BOOLEAN : "BOOLEAN"
			case DataTypes::FLOAT : "REAL"
			case DataTypes::STRING : "TEXT"
			case DataTypes::INT : "INTEGER"
			default : throw new IllegalArgumentException("Unresolved column type for DataTypeReference!")
		}
	}
	
}