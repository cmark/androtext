package hu.bme.mit.androtext.gen.layout

import com.google.inject.Inject
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute
import hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute
import hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute
import hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute
import hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute
import hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute
import hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute
import hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute
import hu.bme.mit.androtext.lang.androTextDsl.HintAttribute
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute
import hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute
import hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute
import hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute
import hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute
import hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute
import hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute
import hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute
import hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute
import hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute
import hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute
import hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute

class ViewPropertiesGenerator {
	
	@Inject extension PropertyValueGenerator
	
	def generate(AutoLinkAttribute attribute) '''
		«IF attribute != null»
			«IF attribute.all»
			android:autoLink="all"			
			«ELSE»
			android:autoLink="«FOR autoLink : attribute.autoLinkMask SEPARATOR '|'»«autoLink.name.toLowerCase»«ENDFOR»"	
			«ENDIF»
		«ENDIF»
	'''
	
	def generate(AutoTextAttribute attribute) '''
		«IF attribute != null»
		android:autoText="«attribute.autoText.booleanValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(BackgroundAttribute attribute) '''
		«IF attribute != null»
		android:background="«attribute.background.backgroundValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(CapitalizeAttribute attribute) '''
		«IF attribute != null»
		android:capitalize="«attribute.capitalize.name.toLowerCase»"
		«ENDIF»
	'''
	
	def generate(ClickableAttribute attribute) '''
		«IF attribute != null»
		android:clickable="«attribute.clickable.booleanValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(CollapseColumnsAttribute attribute) '''
		«IF attribute != null»
		android:collapseColumns="«FOR c : attribute.collapseColumns SEPARATOR ','»«c.integerValue.toString.trim»«ENDFOR»"
		«ENDIF»
	'''
	
	def generate(ColumnWidthAttribute attribute) '''
		«IF attribute != null»
		android:columnWidth="«attribute.columnWidth.dimensionValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(DigitsAttribute attribute) '''
		«IF attribute != null»
		android:digits="«attribute.digits.stringValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(EditableAttribute attribute) '''
		«IF attribute != null»
		android:editable="«attribute.editable.booleanValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(EntriesAttribute attribute) '''
		«IF attribute != null»
		android:entries="«attribute.entries.name»"
		«ENDIF»
	'''
	
	def generate(FadeScrollBarsAttribute attribute) '''
		«IF attribute != null»
		android:fadeScrollBars="«attribute.fadeScrollBars.booleanValue.toString.trim»"
		«ENDIF»
	''' 
	
	def generate(GravityAttribute attribute) '''
		«IF attribute != null»
		android:gravity="«FOR g : attribute.gravity SEPARATOR '|'»«g.name.toLowerCase»«ENDFOR»"
		«ENDIF»
	'''
	
	def generate(HeightAttribute attribute) '''
		«IF attribute != null»
		android:height="«attribute.height.dimensionValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(HintAttribute attribute) '''
		«IF attribute != null»
		android:hint="«attribute.hint.stringValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(HorizontalSpacingAttribute attribute) '''
		«IF attribute != null»
		android:horizontalSpacing="«attribute.horizontalSpacing.dimensionValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(IsScrollContainerAttribute attribute) '''
		«IF attribute != null»
		android:isScrollContainer="«attribute.isScrollContainer.booleanValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(NumColumnsAttribute attribute) '''
		«IF attribute != null»
			«IF attribute.autofit»
			android:numColumns="auto_fit"
			«ELSEIF attribute.numColumns != null»
			android:numColumns="«attribute.numColumns.integerValue.toString.trim»"
			«ENDIF»
		«ENDIF»
	'''
	
	def generate(NumericAttribute attribute) '''
		«IF attribute != null»
		android:numeric="«FOR n : attribute.numeric SEPARATOR '|'»«n.name.toLowerCase»«ENDFOR»"
		«ENDIF»
	'''
	
	def generate(PaddingAttribute attribute) '''
		«IF attribute != null»
		«val paddingValue = attribute.padding.dimensionValue»
		android:padding="«paddingValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(PasswordAttribute attribute) '''
		«IF attribute != null»
		android:password="«attribute.password.booleanValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(PhoneNumberAttribute attribute) '''
		«IF attribute != null»
		android:phoneNumber="«attribute.phoneNumber.booleanValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(ShrinkColumnsAttribute attribute) '''
		«IF attribute != null»
		android:shrinkColumns="«FOR s : attribute.shrinkColumns SEPARATOR ','»«s.integerValue.toString.trim»«ENDFOR»"
		«ENDIF»
	'''
	
	def generate(SingleLineAttribute attribute) '''
		«IF attribute != null»
		android:singleLine="«attribute.singleLine.booleanValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(StretchColumnsAttribute attribute) '''
		«IF attribute != null && !attribute.stretchColumns.nullOrEmpty»
		android:stretchColumns="«FOR s : attribute.stretchColumns SEPARATOR ','»«s.integerValue.toString.trim»«ENDFOR»"
		«ENDIF»
	'''
	
	def generate(StretchModeAttribute attribute) '''
		«IF attribute != null»
		android:stretchMode="«attribute.stretchMode.literal»"
		«ENDIF»
	'''
	
	def generate(TextColorAttribute attribute) '''
		«IF attribute != null»
		android:textColor="«attribute.textColor.backgroundValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(TextSizeAttribute attribute) '''
		«IF attribute != null»
		«val testSizeValue = attribute.textSize.dimensionValue»
		android:textSize="«testSizeValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(TextStyleAttribute attribute) '''
		«IF attribute != null»
		android:textStyle="«FOR t : attribute.textStyle SEPARATOR '|'»«t.name.toLowerCase»«ENDFOR»"
		«ENDIF»
	'''
	
	def generate(TypefaceAttribute attribute) '''
		«IF attribute != null»
		android:typeface="«attribute.typeface.name.toLowerCase»"
		«ENDIF»
	'''
	
	def generate(VerticalSpacingAttribute attribute) '''
		«IF attribute != null»
		android:verticalSpacing="«attribute.verticalSpacing.dimensionValue.toString.trim»"
		«ENDIF»
	'''
	
	def generate(WidthAttribute attribute) '''
		«IF attribute != null»
		android:width="«attribute.width.dimensionValue.toString.trim»"
		«ENDIF»
	'''
	
}