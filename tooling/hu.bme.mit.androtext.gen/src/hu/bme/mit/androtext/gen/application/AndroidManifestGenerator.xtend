package hu.bme.mit.androtext.gen.application

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.IntentAction
import hu.bme.mit.androtext.lang.androTextDsl.IntentCategory
import hu.bme.mit.androtext.lang.androTextDsl.IntentData
import hu.bme.mit.androtext.lang.androTextDsl.IntentDataType
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.gen.IAndroidManifestPermissionGenerator

class AndroidManifestGenerator implements IGenerator {

	@Inject extension GeneratorExtensions
	@Inject extension IAndroidManifestPermissionGenerator

	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		fsa.generateFile("AndroidManifest.xml", IGeneratorSlots::PROJECT_SLOT, generate(androidApplication))
	}
	
	def generate(TargetApplication androidApplication) '''
		«val AndroidApplication application = androidApplication.application»
		<?xml version="1.0" encoding="utf-8"?>
		<manifest xmlns:android="http://schemas.android.com/apk/res/android"
			package="«androidApplication.findPackageName»"
			android:versionCode="1"
			android:versionName="1.0">
			«androidApplication.generatePermissons»
			<application android:icon="@drawable/icon" android:label="@string/app_name" android:debuggable="true">
				«application.mainActivity.generateMainActivity(androidApplication)»
				«FOR activity : application.components.filter(typeof (AbstractActivity))» 
					«activity.generateActivity(androidApplication)»
				«ENDFOR»
				«FOR contentProvider : application.components.filter(typeof (DatabaseContentProvider))» 
					«contentProvider.generateContentProvider(androidApplication)»
				«ENDFOR»
			</application>
		</manifest>
	'''
	
	def generateContentProvider(DatabaseContentProvider contentProvider, TargetApplication application) '''
		<provider android:name=".data.«contentProvider.className»" 
			android:authorities="«application.authority»" />
	'''	
	
  	def generateMainActivity(AbstractActivity activity, TargetApplication application) '''
		<activity android:label="@string/«activity.activityNameValue»" 
			android:name=".«activity.className»" 
			«activity.generateTheme»>
			<intent-filter>
				<action android:name="android.intent.action.MAIN" />
				<category android:name="android.intent.category.LAUNCHER" />
			</intent-filter>
			«activity.generateFilters(application)»
		</activity>
	'''
	
	def generateTheme(AbstractActivity activity) '''
		«IF activity.theme != null && activity.theme != ActivityTheme::THEME»android:theme="@android:style/Theme.«activity.theme.resolveTheme»"«ENDIF»
	'''	
	
	def generateActivity(AbstractActivity activity, TargetApplication application) '''
		<activity android:label="@string/«activity.activityNameValue»" 
			android:name=".«activity.className»"
			«activity.generateTheme»>
			«activity.generateFilters(application)»	
		</activity>
	'''
	
	def resolveTheme(ActivityTheme theme) {
		switch (theme) {
			case ActivityTheme::FULLSCREEN: "NoTitleBar.FullScreen"
			case ActivityTheme::NOTITLEBAR: "NoTitleBar"
			default: theme.name.toLowerCase.toFirstUpper
		}
	}
	
	def generateFilters(AbstractActivity activity, TargetApplication application) '''
		«FOR filter : activity.intentFilters»
		<intent-filter «IF !filter.name.nullOrEmpty»android:label="«filter.name»"«ENDIF»>
			«FOR action : filter.actions»
			<action android:name="«IF action.customAction != null»«action.customAction.name»«ELSE»«action.actionType»«ENDIF»" />
			«ENDFOR»
			«FOR category : filter.categories»
			<category android:name="«category.categoryName»" />
			«ENDFOR»
			«FOR data : filter.datas»
			<data android:mimeType="«data.mimeType(application)»" />
			«ENDFOR»
		</intent-filter>
		«ENDFOR»
	'''
	
	def mimeType(IntentData data, TargetApplication application) {
		switch (data.dataType) {
			case IntentDataType::DIR: data.entity.contentType(application)
			case IntentDataType::ITEM: data.entity.contentItemType(application)
		}
	}
	
	def actionType(IntentAction action) {
		"android.intent.action."+action.type.name.toUpperCase
	}
	
	def categoryName(IntentCategory category) {
		"android.intent.category."+category.name.toUpperCase
	}

}