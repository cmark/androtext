package hu.bme.mit.androtext.gen.layout

import com.google.inject.Inject
import hu.bme.mit.androtext.lang.androTextDsl.Button
import hu.bme.mit.androtext.lang.androTextDsl.EditText
import hu.bme.mit.androtext.lang.androTextDsl.TextView
import hu.bme.mit.androtext.lang.androTextDsl.View

class ViewAttributeGenerator {
	
	@Inject extension PropertyValueGenerator
	
	def generateAttributes(View view) '''
			«IF !view.name.nullOrEmpty»
			android:id="@+id/«view.name»" 
			android:name="«view.name»"
			«ENDIF»
			«IF view.layoutStyle != null»
			«view.layoutStyle.generate.toString.trim»
			«ENDIF»
			«view.specificAttributes»
			«IF !view.attributes.empty»
			«FOR attr : view.attributes»
			android:«attr.name»="«attr.value.generateValue.toString.trim»"
			«ENDFOR»
			«ENDIF»
	'''
	
	def dispatch specificAttributes(View view) ''''''		
	
	def dispatch specificAttributes(Button view) '''
		«IF view.text!=null»
		android:text="«view.text.generateValue»"
		«ENDIF»
	'''
	
	def dispatch specificAttributes(EditText view) '''
		«IF view.text != null»
		android:text="«view.text.generateValue»"
		«ENDIF»
	'''
		
	def dispatch specificAttributes(TextView view) '''
		«IF view.text != null»
		android:text="«view.text.generateValue»"
		«ENDIF»
	'''
	
}