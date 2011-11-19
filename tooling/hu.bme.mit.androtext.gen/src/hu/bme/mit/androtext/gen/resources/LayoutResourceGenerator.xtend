package hu.bme.mit.androtext.gen.resources

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.RootLayout
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen
import hu.bme.mit.androtext.lang.androTextDsl.UIElement
import hu.bme.mit.androtext.lang.androTextDsl.Layout
import hu.bme.mit.androtext.lang.androTextDsl.Widget
import hu.bme.mit.androtext.lang.androTextDsl.BaseLayout
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle

class LayoutResourceGenerator implements IGenerator {

	@Inject extension GeneratorExtensions extensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (layout : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (RootLayout))).flatten) {
			if (layout instanceof PreferenceScreen) {
				fsa.generateFile(layout.layoutName + ".xml", IGeneratorSlots::XML_SLOT, generate(layout))
			} else {
				fsa.generateFile(layout.layoutName + ".xml", IGeneratorSlots::LAYOUT_SLOT, generate(layout))	
			}
		}
	}
	
	def generate(RootLayout gui) '''
		«gui.xmlHeader»
		<«gui.eClass.name» «gui.androidSchema» «gui.attributes»>
			«gui.generateElements»
		</«gui.eClass.name»>
	'''
	
	def uielement(UIElement element) '''
		«element.startTag»
		«element.endTag»
	'''
	
	def startTag(UIElement element) '''
		<«element.eClass.name» «element.attributes»>
	'''

//	def startTag(Preference element) '''
//		<«element.^class.simpleName»«element.attributes»>
//	'''
	
	def dispatch attributes(UIElement layout) '''
	'''
	
	def dispatch attributes(Layout layout) '''
	'''
	
	def dispatch attributes(RootLayout layout) '''
			android:id="@+id/«layout.name»" 
			android:name="«layout.name»"
			«layout.layoutAttributes»
	'''
	
	def dispatch attributes(Widget widget) '''
			android:id="@+id/«widget.name»"
			android:name="«widget.name»"
			«widget.layoutAttributes»
	'''
	
	def dispatch layoutAttributes(BaseLayout layout) '''
		«layout.layoutStyle.layoutParams»
	'''
		
	def dispatch layoutAttributes(Widget widget) '''
		«widget.layoutStyle.layoutParams»
	'''
	
	def layoutParams(LayoutStyle style) {
		switch (style) {
			case LayoutStyle::FILL : fillLayout
			case LayoutStyle::WRAP : wrapLayout
			case LayoutStyle::FILL_WRAP : fillwrapLayout
			case LayoutStyle::WRAP_FILL : wrapfillLayout
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
	
	def endTag(UIElement element) '''
		</«element.eClass.name»>
	'''
	
	def dispatch generateElements(Layout layout) '''''' 
		
	def dispatch generateElements(BaseLayout layout) '''
		«FOR e : layout.elements»
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
