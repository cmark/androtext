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
			<application android:icon="@drawable/icon" android:label="@string/app_name" android:debuggable="true">
				«application.mainActivity.generateMainActivity»
				«FOR activity : application.modelElements.filter(typeof (Activity))» 
					«activity.generateActivity»
				«ENDFOR»
			</application>
		</manifest>				
	'''
	
  def generateMainActivity(Activity activity) '''
		<activity android:label="@string/«activity.activityNameValue»" android:name=".«activity.name.toFirstUpper()»">
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

}