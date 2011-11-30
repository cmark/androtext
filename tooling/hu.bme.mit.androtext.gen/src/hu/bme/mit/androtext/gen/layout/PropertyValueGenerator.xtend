package hu.bme.mit.androtext.gen.layout

import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind
import hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle

class PropertyValueGenerator {
	
	def dispatch booleanValue(BooleanPropertyValue value) '''
		«value.value»
	'''
	
	def dispatch booleanValue(BooleanResourceLink value) '''
		@bool/«value.link.name»
	'''
	
	def dispatch integerValue(IntegerPropertyValue value) '''
		«value.value»
	'''
	def dispatch integerValue(IntegerResourceLink value) '''
		@integer/«value.link.name»
	'''
	
	def dispatch stringValue(StringPropertyValue value) '''
		«value.value»
	'''
	
	def dispatch stringValue(StringResourceLink valueLink) '''
		@string/«valueLink.link.name»
	'''
	
	def dispatch backgroundValue(AnyDrawablePropertyValue value) ''''''
	
	def dispatch backgroundValue(ColorPropertyValue value) '''
		«value.value»
	'''
	
	def dispatch backgroundValue(ColorResourceLink valueLink) '''
		@color/«valueLink.link.name»
	'''
	
	def dispatch backgroundValue(DrawableResourceLink valueLink) '''
		@drawable/«valueLink.link.name»
	'''
	
	def dispatch backgroundValue(ExternalDrawableResourceLink valueLink) '''
		@android:drawable/«valueLink.externalResource.name.toLowerCase»
	'''
	
	def dispatch dimensionValue(LayoutDimensionPropertyValue value) '''
		"«value.constValue.layoutDimensionKind»"
	'''
	
	def dispatch dimensionValue(DimensionPropertyValue dimensionPropertyValue) '''
		«dimensionPropertyValue.value.value»«dimensionPropertyValue.value.metric»
	'''
	
	def dispatch dimensionValue(DimensionResourceLink dimensionResourceLink) '''
		@dimen/«dimensionResourceLink.link.name»
	'''
	
	def dispatch generate(LayoutStyle style) '''
	'''
	def dispatch generate(FastLayoutStyle style) '''
		«style.value.layoutDimensionKind»
	'''
	def dispatch generate(RegularLayoutStyle style) '''
		«IF style.width != null»
			android:layout_width="«style.width.dimensionValue»"
		«ENDIF»
		«IF style.height != null»
			android:layout_height="«style.height.dimensionValue»"	
		«ENDIF»
	'''
	

	def layoutDimensionKind(FastLayoutDimensionKind kind) {
		switch (kind) {
			case FastLayoutDimensionKind::FILL: fillLayout
			case FastLayoutDimensionKind::WRAP: wrapLayout
			case FastLayoutDimensionKind::FILL_WRAP: fillwrapLayout
			case FastLayoutDimensionKind::WRAP_FILL: wrapfillLayout
		}
	}
	
	def String layoutDimensionKind(LayoutDimensionKind style) { 
		switch (style) {
			case LayoutDimensionKind::FILL : "fill_parent"
			case LayoutDimensionKind::WRAP : "wrap_content"
			case LayoutDimensionKind::MATCH : "match_parent"
		}
	}
	
	def fillLayout() '''
		android:layout_width="fill_parent"
		android:layout_height="fill_parent"
	'''

	def wrapLayout() '''
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
	'''

	def fillwrapLayout() '''
		android:layout_width="fill_parent"
		android:layout_height="wrap_content"
	'''

	def wrapfillLayout() '''
		android:layout_width="wrap_content"
		android:layout_height="fill_parent"
	'''
	
}