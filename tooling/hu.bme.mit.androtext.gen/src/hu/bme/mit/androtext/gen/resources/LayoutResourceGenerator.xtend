package hu.bme.mit.androtext.gen.resources

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute
import hu.bme.mit.androtext.lang.androTextDsl.LayoutParams
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.TextView
import hu.bme.mit.androtext.lang.androTextDsl.View
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

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
	
	def startTag(View element) '''
		<«element.eClass.name» «element.attributes.toString.trim»>
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
	
	def dispatch specificAttributes(TextView view) '''
		«IF view.gravityAttribute != null»
		android:gravity="«view.gravityAttribute.gravity.name.toLowerCase»"
		«ENDIF»
		«IF view.textSizeAttribute != null»
		«val testSizeValue = view.textSizeAttribute.textSize.dimensionValue»
		android:textSize="«testSizeValue.toString.trim»"
		«ENDIF»
		«IF view.text!=null»
		android:text="«view.text»"
		«ENDIF»
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
	
	def dispatch backgroundValue(DrawableResourceLink valueLink) '''
		@drawable/«valueLink.link.name»
	'''
	
	def dispatch dimensionValue(DimensionPropertyValue dimensionPropertyValue) '''
		«dimensionPropertyValue.value.value»«dimensionPropertyValue.value.metric»
	'''
	
	def dispatch dimensionValue(DimensionResourceLink dimensionResourceLink) '''
		@dimen/«dimensionResourceLink.link.name»
	'''
	
	def layoutAttributes(View element) '''
		«IF element.layoutStyle != null»
		«element.layoutStyle.layoutDimensionKind»
		«ENDIF»
	'''
	
	def layoutDimensionKind(LayoutDimensionKind style) {
		switch (style) {
			case LayoutDimensionKind::FILL : fillLayout
			case LayoutDimensionKind::WRAP : wrapLayout
			case LayoutDimensionKind::FILL_WRAP : fillwrapLayout
			case LayoutDimensionKind::WRAP_FILL : wrapfillLayout
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
	
	def endTag(View element) '''
		</«element.eClass.name»>
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
