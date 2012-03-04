package hu.bme.mit.androtext.gen.application

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme


class AndroidManifestGenerator implements IGenerator {

	@Inject extension GeneratorExtensions generatorExtensions

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
			<uses-permission android:name="android.permission.WAKE_LOCK"/>
			<application android:icon="@drawable/icon" android:label="@string/app_name" android:debuggable="true">
				«application.mainActivity.generateMainActivity»
				«FOR activity : application.modelElements.filter(typeof (Activity))» 
					«activity.generateActivity»
				«ENDFOR»
				«FOR contentProvider : application.modelElements.filter(typeof (DatabaseContentProvider))» 
					«contentProvider.generateContentProvider(androidApplication)»
				«ENDFOR»
			</application>
		</manifest>
	'''
	
	def generateContentProvider(DatabaseContentProvider contentProvider, TargetApplication application) '''
		<provider android:name=".data.«contentProvider.className»" 
			android:authorities="«application.authority»" />
	'''	
	
  	def generateMainActivity(Activity activity) '''
		<activity android:label="@string/«activity.activityNameValue»" 
			android:name=".«activity.name.toFirstUpper()»" «IF activity.theme != null»android:theme="@android:style/Theme.«activity.resolveTheme»"«ENDIF»>
			<intent-filter>
				<action android:name="android.intent.action.MAIN" />
				<category android:name="android.intent.category.LAUNCHER" />
			</intent-filter>
		</activity>
	'''
	
	def generateActivity(Activity activity) '''
		<activity android:label="@string/«activity.activityNameValue»" android:name=".«activity.name.toFirstUpper()»">		
		</activity>
	'''
	
	def resolveTheme(Activity activity) {
		switch (activity.theme) {
			case ActivityTheme::FULLSCREEN: "NoTitleBar.FullScreen"
			case ActivityTheme::NOTITLEBAR: "NoTitleBar"
			default: activity.theme.name.toLowerCase.toFirstUpper
		}
	}

}