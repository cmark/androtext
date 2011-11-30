package hu.bme.mit.androtext.gen.layout

import hu.bme.mit.androtext.lang.androTextDsl.View
import com.google.inject.Inject
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout
import hu.bme.mit.androtext.lang.androTextDsl.TextView
import hu.bme.mit.androtext.lang.androTextDsl.EditText
import hu.bme.mit.androtext.lang.androTextDsl.Button
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement
import hu.bme.mit.androtext.lang.androTextDsl.GridView
import hu.bme.mit.androtext.lang.androTextDsl.ImageView
import hu.bme.mit.androtext.lang.androTextDsl.ListView
import hu.bme.mit.androtext.lang.androTextDsl.RadioGroup
import hu.bme.mit.androtext.lang.androTextDsl.RatingBar
import hu.bme.mit.androtext.lang.androTextDsl.Spinner
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton
import hu.bme.mit.androtext.lang.androTextDsl.WebView

class ViewAttributeGenerator {
	
	@Inject extension LayoutPropertiesGenerator
	@Inject extension PropertyValueGenerator
	@Inject extension ViewPropertiesGenerator
	
	def attributes(View view) '''
			«IF !view.name.nullOrEmpty»
			android:id="@+id/«view.name»" 
			android:name="«view.name»"
			«ENDIF»
			«IF view.layoutStyle != null»
			«view.layoutStyle.generate.toString.trim»
			«ENDIF»
			«IF view.layoutProperties != null»
			«view.layoutProperties.generate.toString.trim»
			«ENDIF»
			«view.specificAttributes»
	'''
	
	def dispatch specificAttributes(View view) ''''''
	def dispatch specificAttributes(ViewElement view) ''''''
	def dispatch specificAttributes(LinearLayout linearLayout) '''
		«IF linearLayout.vertical»
		android:orientation="vertical"
		«ELSE»
		android:orientation="horizontal"
		«ENDIF»
		«linearLayout.gravity.generate»
	'''		
	
	def dispatch specificAttributes(TableLayout layout) '''
		«layout.collapseColumnsAttribute.generate»
		«layout.shrinkColumnsAttribute.generate»
		«layout.stretchColumnsAttribute.generate»
	'''
	
	def dispatch specificAttributes(Button view) '''
		«IF view.text!=null»
		android:text="«view.text.stringValue.toString.trim»"
		«ENDIF»
		«view.backgroundAttribute.generate»
		«view.clickableAttribute.generate»
		«view.heightAttribute.generate»
		«view.hintAttribute.generate»
		«view.widthAttribute.generate»
	'''
	
	def dispatch specificAttributes(EditText view) '''
		«IF view.text != null»
		android:text="«view.text.stringValue.toString.trim»"
		«ENDIF»
				«view.autoLinkAttribute.generate»
		«view.autoTextAttribute.generate»
		«view.backgroundAttribute.generate»
		«view.capitalizeAttribute.generate»
		«view.clickableAttribute.generate»
		«view.digitsAttribute.generate»
		«view.editableAttribute.generate»
		«view.fadeScrollBarsAttribute.generate»
		«view.gravityAttribute.generate»
		«view.heightAttribute.generate»
		«view.hintAttribute.generate»
		«view.isScrollContainerAttribute.generate»
		«view.numericAttribute.generate»
		«view.paddingAttribute.generate»
		«view.passwordAttribute.generate»
		«view.phoneNumberAttribute.generate»
		«view.singleLineAttribute.generate»
		«view.textColorAttribute.generate»
		«view.textSizeAttribute.generate»
		«view.textStyleAttribute.generate»
		«view.typefaceAttribute.generate»
		«view.widthAttribute.generate»
	'''
	
	def dispatch specificAttributes(GridView view) '''
		«view.columnWidthAttribute.generate»
		«view.gravityAttribute.generate»
		«view.horizontalSpacingAttribute.generate»
		«view.numColumnsAttribute.generate»
		«view.stretchModeAttribute.generate»
		«view.verticalSpacingAttribute.generate»
	'''
	
	def dispatch specificAttributes(ImageView view) '''
		«view.backgroundAttribute.generate»
		«view.clickableAttribute.generate»
		«view.fadeScrollBarsAttribute.generate»
		«view.heightAttribute.generate»
		«view.isScrollContainerAttribute.generate»
		«view.widthAttribute.generate»
	'''
	
	def dispatch specificAttributes(ListView view) '''
		«view.entriesAttribute.generate»
	'''
	
	def dispatch specificAttributes(RadioGroup view) ''''''
	
	def dispatch specificAttributes(RatingBar view) ''''''
	
	def dispatch specificAttributes(Spinner view) '''
		«view.backgroundAttribute.generate»
		«view.clickableAttribute.generate»
		«view.entriesAttribute.generate»
		«view.fadeScrollBarsAttribute.generate»
		«view.heightAttribute.generate»
		«view.isScrollContainerAttribute.generate»
		«view.widthAttribute.generate»
	'''
		
	def dispatch specificAttributes(TextView view) '''
		«IF view.text != null»
		android:text="«view.text.stringValue.toString.trim»"
		«ENDIF»
		«view.autoLinkAttribute.generate»
		«view.autoTextAttribute.generate»
		«view.backgroundAttribute.generate»
		«view.capitalizeAttribute.generate»
		«view.clickableAttribute.generate»
		«view.digitsAttribute.generate»
		«view.editableAttribute.generate»
		«view.fadeScrollBarsAttribute.generate»
		«view.gravityAttribute.generate»
		«view.heightAttribute.generate»
		«view.hintAttribute.generate»
		«view.isScrollContainerAttribute.generate»
		«view.numericAttribute.generate»
		«view.paddingAttribute.generate»
		«view.passwordAttribute.generate»
		«view.phoneNumberAttribute.generate»
		«view.singleLineAttribute.generate»
		«view.textColorAttribute.generate»
		«view.textSizeAttribute.generate»
		«view.textStyleAttribute.generate»
		«view.typefaceAttribute.generate»
		«view.widthAttribute.generate»
	'''
	
	def dispatch specificAttributes(ToggleButton view) ''''''
	
	def dispatch specificAttributes(WebView view) ''''''
	
}