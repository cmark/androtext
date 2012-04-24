package hu.bme.mit.androtext.gen.layout

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceContainer
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceElement
import hu.bme.mit.androtext.lang.androTextDsl.DialogBasedPreference
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference

class PreferenceResourceGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension ViewPropertiesGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication targetApplication) {
		for (pref : targetApplication.application.components.filter(typeof (PreferenceActivity))) {
			if (pref.screen != null) {
				fsa.generateFile(pref.preferenceXmlFileName + ".xml", IGeneratorSlots::XML_SLOT, generate(pref.screen))
			}
		}
	}
	
	def generate(PreferenceScreen screen) '''
		«screen.xmlHeader»
		<«screen.eClass.name» «screen.androidSchema.toString.trim» 
			«screen.titleAttribute.toString.trim» 
			«screen.attributes.toString.trim»>
			«screen.elements.toString.trim»
		</«screen.eClass.name»>
	'''
	
	
	def generate(AbstractPreference preference) '''
		<«preference.eClass.name»
			«preference.titleAttribute.toString.trim»
			«preference.attributes.toString.trim»>
			«preference.elements.toString.trim»
		</«preference.eClass.name»>
	'''
	
	def basicAttributes(PreferenceElement preference) '''
		«preference.keyAttribute»
		«IF !preference.summary.nullOrEmpty»
		android:summary="«preference.summary.toString.trim»"
		«ENDIF»
		android:enabled="«preference.enabled.toString.trim»"
		android:persistent="«preference.persistent.toString.trim»"
	'''
	
	def dispatch attributes(AbstractPreference preference) ''''''
	def dispatch attributes(PreferenceScreen preference) '''
		«preference.keyAttribute»
		«IF !preference.summary.nullOrEmpty»
		android:summary="«preference.summary.toString.trim»"
		«ENDIF»
		android:enabled="«preference.enabled.toString.trim»"
		android:persistent="«preference.persistent.toString.trim»"
	'''
	def dispatch attributes(PreferenceElement preference) '''
		«preference.basicAttributes»
	'''
	def dispatch attributes(DialogBasedPreference preference) '''
		«preference.basicAttributes»
		«IF !preference.defaultValue.nullOrEmpty»
		android:defaultValue="«preference.defaultValue.toString.trim»"
		«ENDIF»
		«IF !preference.dialogTitle.nullOrEmpty»
		android:dialogTitle="«preference.dialogTitle.toString.trim»"
		«ENDIF»
		«IF preference instanceof ListPreference»
		«(preference as ListPreference).entriesAttribute.generate»
		android:entryValues="@array/«(preference as ListPreference).entryValues.name»"
		«ENDIF»
	'''
		
	def dispatch elements(AbstractPreference preference) ''''''
	def dispatch elements(PreferenceContainer preference) '''
		«FOR e : preference.preferences»
			«e.generate»
		«ENDFOR»
	'''
	
	def titleAttribute(AbstractPreference preference) '''
		«IF !preference.title.nullOrEmpty»
		android:title="«preference.title»"
		«ENDIF»
	'''
	
	def dispatch keyAttribute(AbstractPreference preference) {}
	def dispatch keyAttribute(PreferenceElement preference) {
		keyAttribute(preference.preferenceKeyName)
	}
	def dispatch keyAttribute(PreferenceScreen preference) {
		keyAttribute(preference.preferenceKeyName)
	}
	
	def keyAttribute(String key) '''
		«IF !key.nullOrEmpty»
		android:key="@string/«key»"
		«ENDIF»
	'''
	
}