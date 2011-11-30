package hu.bme.mit.androtext.gen.layout

import hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties
import com.google.inject.Inject

class LayoutPropertiesGenerator {
	
	@Inject extension PropertyValueGenerator
	
	def generate(LayoutProperties properties) '''
		«IF properties.weightAttribute != null»
			«val weightValue = properties.weightAttribute.weight.integerValue»
			android:layout_weight="«weightValue.toString.trim»"
		«ENDIF»
		«IF properties.aboveAttribute != null»
			android:layout_above="@id/«properties.aboveAttribute.above.name»"
		«ENDIF»
		«IF properties.belowAttribute != null»
			android:layout_below="@id/«properties.belowAttribute.below.name»"
		«ENDIF»
		«IF properties.alignBottomAttribute != null»
			android:layout_alignBottom="@id/«properties.alignBottomAttribute.alignBottom.name»"
		«ENDIF»
		«IF properties.alignLeftAttribute != null»
			android:layout_alignLeft="@id/«properties.alignLeftAttribute.alignLeft.name»"
		«ENDIF»
		«IF properties.alignTopAttribute != null»
			android:layout_alignTop="@id/«properties.alignTopAttribute.alignTop.name»"
		«ENDIF»
		«IF properties.alignParentLeftAttribute != null»
			«val aplValue = properties.alignParentLeftAttribute.alignParentLeft.booleanValue»
			android:layout_alignParentLeft="«aplValue.toString.trim»"
		«ENDIF»
		«IF properties.alignParentTopAttribute != null»
			«val aptValue = properties.alignParentTopAttribute.alignParentTop.booleanValue»
			android:layout_alignParentTop="«aptValue.toString.trim»"
		«ENDIF»
		«IF properties.alignParentRightAttribute != null»
			«val aprValue = properties.alignParentRightAttribute.alignParentRight.booleanValue»
			android:layout_alignParentRight="«aprValue.toString.trim»"
		«ENDIF»
		«IF properties.alignParentBottomAttribute != null»
			«val apbValue = properties.alignParentBottomAttribute.alignParentBottom.booleanValue»
			android:layout_alignParentBottom="«apbValue.toString.trim»"
		«ENDIF»
		«IF properties.toLeftOfAttribute != null»
			android:layout_toLeftOf="@id/«properties.toLeftOfAttribute.toLeftOf.name»"
		«ENDIF»
		«IF properties.toRightOfAttribute != null»
			android:layout_toRightOf="@id/«properties.toRightOfAttribute.toRightOf.name»"
		«ENDIF»
		«IF properties.centerHorizontalAttribute != null»
			«val chValue = properties.centerHorizontalAttribute.centerHorizontal.booleanValue»
			android:layout_toLeftOf="@id/«chValue.toString.trim»"
		«ENDIF»
		«IF properties.centerInParentAttribute != null»
			«val cipValue = properties.centerInParentAttribute.centerInParent.booleanValue»
			android:layout_toLeftOf="@id/«cipValue.toString.trim»"
		«ENDIF»
		«IF properties.centerVerticalAttribute != null»
			«val cvValue = properties.centerVerticalAttribute.centerVertical.booleanValue»
			android:layout_toLeftOf="@id/«cvValue.toString.trim»"
		«ENDIF»
		«IF properties.marginLeftAttribute != null»
			«val marginValue = properties.marginLeftAttribute.marginLeft.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF properties.marginTopAttribute != null»
			«val marginValue = properties.marginTopAttribute.marginTop.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF properties.marginRightAttribute != null»
			«val marginValue = properties.marginRightAttribute.marginRight.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF properties.marginBottomAttribute != null»
			«val marginValue = properties.marginBottomAttribute.marginBottom.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF properties.columnAttribute != null»
			«val columnValue = properties.columnAttribute.column.integerValue»
			android:layout_column="«columnValue.toString.trim»"
		«ENDIF»
		«IF properties.spanAttribute != null»
			«val spanValue = properties.spanAttribute.span.integerValue»
			android:layout_span="«spanValue.toString.trim»"
		«ENDIF»
	'''
	
}