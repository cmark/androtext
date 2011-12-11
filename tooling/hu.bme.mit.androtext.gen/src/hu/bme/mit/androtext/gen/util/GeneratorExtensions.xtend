package hu.bme.mit.androtext.gen.util

import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.Entity
import hu.bme.mit.androtext.lang.androTextDsl.Property
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.View
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.compiler.ImportManager
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion
import hu.bme.mit.androtext.lang.androTextDsl.Font
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity
import hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity

class GeneratorExtensions {
	
	def xmlHeader(Object o) '''
		<?xml version="1.0" encoding="utf-8"?>
	'''
	
	def androidSchema(Object o) '''
		xmlns:android="http://schemas.android.com/apk/res/android"
	'''
		
	def findPackageName(TargetApplication targetApplication) {
		if (targetApplication.packageName == null || targetApplication.packageName.empty) {
			return targetApplication.projectName;
		} else {
			return targetApplication.packageName;
		}
	}	
		
	/**
	 * computes the class name if its a Entity 
	 * returns null otherwise
	 */
	def className(Object o) {
		switch(o) {
			Entity : o.name.toFirstUpper
			Activity : o.name.toFirstUpper
			default: o.^class.name.toFirstUpper
		}
	}
	
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
	
	def entityFieldName(GameEntity entity) '''
		m«entity.name.toFirstUpper»Entity
	'''
	
	def dispatch type(GameEntity entity) '''
		«entity.eClass.name»
	'''
	
	def dispatch type(SimpleEntity entity) '''
		Entity
	'''
	
//	def columnType(Feature f) {
//		val t = f.type;
//		switch (t) {
//			EntityTypeRef : "INTEGER" 
//			DataTypeRef : columnType(t)
//			default: null
//		}
//	}
	
//	def columnType(DataTypeRef ref) {
//		switch (ref) {
//			case DataTypes::BOOLEAN : "BOOLEAN"
//			case DataTypes::FLOAT : "REAL"
//			case DataTypes::STRING : "TEXT"
//			case DataTypes::INT : "INTEGER"
//			default : throw new IllegalArgumentException("Unresolved column type for DataTypeReference!")
//		}
//	}
	
}