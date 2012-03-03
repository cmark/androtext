package hu.bme.mit.androtext.gen.layout

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.View
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class LayoutResourceGenerator implements IGenerator {

	@Inject extension GeneratorExtensions
	@Inject extension ViewAttributeGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (guimodel : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (AndroGuiModelRoot))).flatten) {
			for (root : guimodel.roots) {
				fsa.generateFile(root.layoutName + ".xml", IGeneratorSlots::LAYOUT_SLOT, generate(root))	
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
	
}
