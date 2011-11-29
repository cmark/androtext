package hu.bme.mit.androtext.gen.resources

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.Button
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.EditText
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute
import hu.bme.mit.androtext.lang.androTextDsl.LayoutParams
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams
import hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.TextView
import hu.bme.mit.androtext.lang.androTextDsl.View
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle
import hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout

class LayoutResourceGenerator implements IGenerator {

	@Inject extension GeneratorExtensions extensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (guimodel : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (AndroGuiModelRoot))).flatten) {
			for (root : guimodel.roots) {
				if (root instanceof PreferenceScreen) {
					fsa.generateFile(root.layoutName + ".xml", IGeneratorSlots::XML_SLOT, generate(root))
				} else {
					fsa.generateFile(root.layoutName + ".xml", IGeneratorSlots::LAYOUT_SLOT, generate(root))	
				}	
			}
		}
	}
	
	def generate(View root) '''
		«root.xmlHeader»
		<«root.eClass.name» «root.androidSchema» «root.attributes.toString.trim»>
			«root.generateElements»
		</«root.eClass.name»>
	'''
	
	def uielement(View element) '''
		«element.startTag»
			«element.generateElements»
		«element.endTag»
	'''
	
	def dispatch startTag(View element) '''
		<«element.eClass.name» «element.attributes.toString.trim»>
	'''
	
	def dispatch startTag(ViewElement element) '''
		<View «element.attributes.toString.trim»>
	'''

//	def startTag(Preference element) '''
//		<«element.^class.simpleName»«element.attributes»>
//	'''
	
	def attributes(View view) '''
			«IF !view.name.nullOrEmpty»
			android:id="@+id/«view.name»" 
			android:name="«view.name»"
			«ENDIF»
			«view.layoutAttributes»
			«view.specificAttributes»
	'''
	
	def dispatch specificAttributes(View view) ''''''
	def dispatch specificAttributes(LinearLayout linearLayout) '''
		«IF linearLayout.vertical»
		android:orientation="vertical"
		«ELSE»
		android:orientation="horizontal"
		«ENDIF»
		«IF linearLayout.layoutParams != null»
		«linearLayout.layoutParams.linearLayoutParams»
		«ENDIF»
	'''
		
	def linearLayoutParams(LinearLayoutParams params) '''
		«IF params.gravity != null»
		android:gravity="«params.gravity.layoutGravity»"
		«ENDIF»
		«IF params.layoutParams != null»
		«params.layoutParams.generate»
		«ENDIF»
	'''
	
	def layoutGravity(LayoutGravityAttribute layoutGravityAttribute) '''
		«FOR g : layoutGravityAttribute.gravity SEPARATOR ' | '»
			«g.name.toLowerCase»
		«ENDFOR»
	'''
	
	def dispatch specificAttributes(TableLayout layout) '''
		«IF !layout.stretchColumns.nullOrEmpty»
			android:stretchColumns="«FOR s : layout.stretchColumns SEPARATOR ','»«s.integerValue.toString.trim»«ENDFOR»"
		«ENDIF»
	'''
	
	def dispatch specificAttributes(TextView view) '''
		«IF view.gravityAttribute != null»
		android:gravity="«view.gravityAttribute.gravity.name.toLowerCase»"
		«ENDIF»
		«IF view.textSizeAttribute != null»
		«val testSizeValue = view.textSizeAttribute.textSize.dimensionValue»
		android:textSize="«testSizeValue.toString.trim»"
		«ENDIF»
		«IF !view.text.nullOrEmpty»
		android:text="«view.text»"
		«ENDIF»
		«IF view.paddingAttribute != null»
		«val paddingValue = view.paddingAttribute.padding.dimensionValue»
		android:padding="«paddingValue.toString.trim»"
		«ENDIF»
		«IF view.layoutParams != null»
		«view.layoutParams.generate»
		«ENDIF»
	'''
	
	def dispatch specificAttributes(EditText view) '''
		«IF view.gravityAttribute != null»
		android:gravity="«view.gravityAttribute.gravity.name.toLowerCase»"
		«ENDIF»
		«IF view.textSizeAttribute != null»
		«val testSizeValue = view.textSizeAttribute.textSize.dimensionValue»
		android:textSize="«testSizeValue.toString.trim»"
		«ENDIF»
		«IF !view.text.nullOrEmpty»
		android:text="«view.text»"
		«ENDIF»
		«IF view.layoutParams != null»
		«view.layoutParams.generate»
		«ENDIF»
	'''
	
	def dispatch specificAttributes(Button view) '''
		«IF view.layoutParams != null»
		«view.layoutParams.generate»
		«ENDIF»
		«IF view.text!=null»
		android:text="«view.text»"
		«ENDIF»
	'''
	
	def dispatch specificAttributes(ViewElement view) '''
		«IF view.layoutParams != null»
		«view.layoutParams.generate»
		«ENDIF»
	'''
	
	def generate(LayoutParams params) '''
		«IF params.backgroundAttribute != null»
			«val backgroundValue = params.backgroundAttribute.background.backgroundValue»
			android:background="«backgroundValue.toString.trim»"
		«ENDIF»
		«IF params.weight != null»
			«val weightValue = params.weight.integerValue»
			android:layout_weight="«weightValue.toString.trim»"
		«ENDIF»
		«IF params.above != null»
			android:layout_above="@id/«params.above.name»"
		«ENDIF»
		«IF params.below != null»
			android:layout_below="@id/«params.below.name»"
		«ENDIF»
		«IF params.alignBottom != null»
			android:layout_alignBottom="@id/«params.alignBottom.name»"
		«ENDIF»
		«IF params.alignLeft != null»
			android:layout_alignLeft="@id/«params.alignLeft.name»"
		«ENDIF»
		«IF params.alignTop != null»
			android:layout_alignTop="@id/«params.alignTop.name»"
		«ENDIF»
		«IF params.alignParentLeft != null»
			«val aplValue = params.alignParentLeft.booleanValue»
			android:layout_alignParentLeft="«aplValue.toString.trim»"
		«ENDIF»
		«IF params.alignParentTop != null»
			«val aptValue = params.alignParentTop.booleanValue»
			android:layout_alignParentTop="«aptValue.toString.trim»"
		«ENDIF»
		«IF params.alignParentRight != null»
			«val aprValue = params.alignParentRight.booleanValue»
			android:layout_alignParentRight="«aprValue.toString.trim»"
		«ENDIF»
		«IF params.alignParentBottom != null»
			«val apbValue = params.alignParentBottom.booleanValue»
			android:layout_alignParentBottom="«apbValue.toString.trim»"
		«ENDIF»
		«IF params.toLeftOf != null»
			android:layout_toLeftOf="@id/«params.toLeftOf.name»"
		«ENDIF»
		«IF params.toRightOf != null»
			android:layout_toRightOf="@id/«params.toRightOf.name»"
		«ENDIF»
		«IF params.centerHorizontal != null»
			«val chValue = params.centerHorizontal.booleanValue»
			android:layout_toLeftOf="@id/«chValue.toString.trim»"
		«ENDIF»
		«IF params.centerInParent != null»
			«val cipValue = params.centerInParent.booleanValue»
			android:layout_toLeftOf="@id/«cipValue.toString.trim»"
		«ENDIF»
		«IF params.centerVertical != null»
			«val cvValue = params.centerVertical.booleanValue»
			android:layout_toLeftOf="@id/«cvValue.toString.trim»"
		«ENDIF»
		«IF params.marginLeft != null»
			«val marginValue = params.marginLeft.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF params.marginTop != null»
			«val marginValue = params.marginTop.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF params.marginRight != null»
			«val marginValue = params.marginRight.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF params.marginBottom != null»
			«val marginValue = params.marginBottom.dimensionValue»
			android:layout_marginLeft="«marginValue.toString.trim»"
		«ENDIF»
		«IF params.column != null»
			«val columnValue = params.column.integerValue»
			android:layout_column="«columnValue.toString.trim»"
		«ENDIF»
	'''
	
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
	
	def dispatch backgroundValue(AnyDrawablePropertyValue value) ''''''
	
	def dispatch backgroundValue(ColorPropertyValue value) '''
		«value.value»
	'''
	
	def dispatch backgroundValue(ColorResourceLink valueLink) '''
		@color/«valueLink.link.name»
	'''
	
	def dispatch backgroundValue(DrawableResourceLink valueLink) ''''''
	
	def dispatch backgroundValue(LocalDrawableResourceLink valueLink) '''
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
	
	def layoutAttributes(View element) '''
		«IF element.layoutStyle != null»
		«element.layoutStyle.layoutStyle.toString.trim»
		«ENDIF»
	'''
	
	def dispatch layoutStyle(LayoutStyle style) '''
	'''
	def dispatch layoutStyle(FastLayoutStyle style) '''
		«style.value.layoutDimensionKind»
	'''
	def dispatch layoutStyle(RegularLayoutStyle style) '''
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

//	def attributes(Preference element) '''
//		
//	'''	
	
	def dispatch endTag(View element) '''
		</«element.eClass.name»>
	''' 
	
	def dispatch endTag(ViewElement element) '''
		</View>
	''' 
		
	def dispatch generateElements(View element) '''
	'''
		
	def dispatch generateElements(ViewGroup layout) '''
		«FOR e : layout.views»
			«e.uielement»
		«ENDFOR»
	'''
	
	def dispatch generateElements(PreferenceScreen prefScreen) '''
	'''
	
//	def preference(Preference preference) {
//		«preference.startTag»
//		«preference.endTag»
//	}
	
}
