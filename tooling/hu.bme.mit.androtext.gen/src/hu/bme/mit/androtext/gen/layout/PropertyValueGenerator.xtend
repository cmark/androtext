package hu.bme.mit.androtext.gen.layout

import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
import hu.bme.mit.androtext.lang.androTextDsl.LinkableLink
import hu.bme.mit.androtext.lang.androTextDsl.PropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.Resource
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.View
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource
import hu.bme.mit.androtext.lang.androTextDsl.StringResource
import hu.bme.mit.androtext.lang.androTextDsl.ColorResource
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResource
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.EnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkEnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeEnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.GravityEnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.NumericEnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeEnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleEnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceEnumerationPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind
import org.eclipse.emf.common.util.EList

class PropertyValueGenerator {
	
	def dispatch generateValue(PropertyValue value) {}
	
	def dispatch generateValue(LinkableLink link) {
		link.link.generateLinkable
	}
	
	def dispatch generateLinkable(Resource resource) {
		"@" + resource.type + "/" + resource.name
	}
	
	def type(Resource resource) {
		switch (resource) {
			ArrayResource : "array"
			BooleanResource : "bool"
			StringResource : "string"
			ColorResource : "color"
			DrawableResource : "drawable"
			DimensionResource : "dimen"
		}
	}
	
	def dispatch generateLinkable(View view) {
		"@id/" + view.name
	}
	
	def dispatch generateValue(BooleanPropertyValue value) {
		value.value
	}
	
	def dispatch generateValue(IntegerPropertyValue value) '''
		«FOR v : value.values SEPARATOR ','»«v»«ENDFOR»
	'''
	
	def dispatch generateValue(StringPropertyValue value) {
		value.value
	}
	
	def dispatch generateValue(AnyDrawablePropertyValue value) {}
	
	def dispatch generateValue(ColorPropertyValue value) {
		value.value
	}
	
	def dispatch generateValue(ExternalDrawableResourceLink valueLink) {
		"@android:drawable/" + valueLink.externalResource.name.toLowerCase
	}
	
	def dispatch generateValue(LayoutDimensionPropertyValue value) {
		value.value.layoutDimensionKind
	}	
	
	def dispatch generateValue(DimensionPropertyValue dimensionPropertyValue) { 
		"" + dimensionPropertyValue.value.value + dimensionPropertyValue.value.metric.toString
	}
	
	def dispatch generateValue(NumColumnsPropertyValue value) {
		if (value.autofit) {
			return "auto_fit"
		} else {
			""+value.numColumns	
		}
	}
	
	def dispatch generateValue(EnumerationPropertyValue value) {}
	def dispatch generateValue(AutoLinkEnumerationPropertyValue value) {
		if (value.values.contains(AutoLinkKind::ALL)) {
			return "all"
		} else {
			return value.values.generateEnumList.toString.trim
		}
	}	
	def dispatch generateValue(CapitalizeEnumerationPropertyValue value) {
		value.value
	}
	def dispatch generateValue(GravityEnumerationPropertyValue value) {
		return value.values.generateEnumList.toString.trim
	}
	def dispatch generateValue(NumericEnumerationPropertyValue value) {
		return value.values.generateEnumList.toString.trim
	}
	def dispatch generateValue(StretchModeEnumerationPropertyValue value) {
		value.value
	}
	def dispatch generateValue(TextStyleEnumerationPropertyValue value) {
		return value.values.generateEnumList.toString.trim
	}
	def dispatch generateValue(TypefaceEnumerationPropertyValue value) {
		value.value
	}
	
	def generateEnumList(EList<?> list) '''
		«FOR e : list SEPARATOR '|'»«e»«ENDFOR»
	'''
	def generate(LayoutStyle style) {
		style.value.layoutDimensionKind
	}

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