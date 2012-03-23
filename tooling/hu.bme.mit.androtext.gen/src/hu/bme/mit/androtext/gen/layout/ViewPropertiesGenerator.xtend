package hu.bme.mit.androtext.gen.layout

import com.google.inject.Inject
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute

class ViewPropertiesGenerator {
	
	@Inject extension PropertyValueGenerator
	
	def generate(EntriesAttribute attribute) '''
		«IF attribute != null»
		android:entries="@array/«attribute.entries.name»"
		«ENDIF»
	'''
	
}