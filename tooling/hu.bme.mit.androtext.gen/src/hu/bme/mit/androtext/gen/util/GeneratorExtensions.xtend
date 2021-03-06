package hu.bme.mit.androtext.gen.util

import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.DataTypes
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef
import hu.bme.mit.androtext.lang.androTextDsl.Entity
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceContainer
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceElement
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen
import hu.bme.mit.androtext.lang.androTextDsl.Property
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef
import hu.bme.mit.androtext.lang.androTextDsl.View
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.compiler.ImportManager

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
	
	def fieldName(View view) {
		"m"+view.name.toFirstUpper
	}
	
	def path_uri(Entity e) {
		"PATH_"+e.name.toUpperCase() + "S"
	}
	
	def path_id_uri(Entity e) {
		"PATH_"+e.name.toUpperCase() + "_ID"
	}
	
	def contentType(Entity e, TargetApplication application) {
		"vnd.android.cursor.dir/vnd."+application.findPackageName+"."+e.name.toLowerCase
	}
	
	def contentItemType(Entity e, TargetApplication application) {
		"vnd.android.cursor.item/vnd."+application.findPackageName+"."+e.name.toLowerCase
	}
		
	/**
	 * computes the class name if its a Entity 
	 * returns null otherwise
	 */
	def className(Object o) {
		switch(o) {
			Entity : o.name.toFirstUpper
			AbstractActivity : o.name.toFirstUpper
			ContentProvider: o.name.toFirstUpper
			default: o.^class.name.toFirstUpper
		}
	}
	
	def javaType(EObject e) {
		switch (e) {
			ViewElement: "View"
			default: e.eClass.name
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
	
	def List<AbstractPreference> getPreferencesWithKeys(PreferenceContainer container) {
		val prefList = new ArrayList<AbstractPreference>()
		if (container instanceof PreferenceScreen) {
			if (!(container as PreferenceScreen).name.nullOrEmpty) {
				prefList.add(container)
			}
		}
		for (e : container.preferences) {
			if (e instanceof PreferenceContainer) {
				prefList.addAll(getPreferencesWithKeys(e as PreferenceContainer))
			} else {
				prefList.add(e)
			}
		}
		return prefList
	}
	
	def tabActivityLayout(TabActivity activity) {
		activity.name.toLowerCase+"_layout"
	}
	
	def preferenceXmlFileName(PreferenceActivity activity) {
		activity.name.toLowerCase+"_preflayout"
	}
	
	def dispatch preferenceKeyName(PreferenceElement p) {
		p.name + "Key"		
	}
	
	def dispatch preferenceKeyName(PreferenceScreen p) {
		if (p.name.nullOrEmpty) {
			return null
		}
		p.name + "Key"		
	}
	
	def abstractClassName(AbstractActivity activity) {
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
	
	def activityNameValue(AbstractActivity a) {
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
	
	def menuResourceFileName(ActivityMenu menu) {
		menu.name.toLowerCase + "_menu"
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