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

class LayoutResourceGenerator implements IGenerator {

	@Inject extension GeneratorExtensions
	@Inject extension ViewAttributeGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (guimodel : resourceSet.resources.map(r | r.allContents.toIterable.filter(typeof (AndroGuiModelRoot))).flatten) {
			for (root : guimodel.roots) {
				fsa.generateFile(root.layoutName + ".xml", IGeneratorSlots::LAYOUT_SLOT, generate(root))	
			}
		}
	}
	
	def generate(View root) '''
		«root.xmlHeader»
		<«root.eClass.name» «root.androidSchema» «root.generateAttributes.toString.trim»>
			«root.generateElements»
		</«root.eClass.name»>
	'''
	
	def uielement(View element) '''
		«element.startTag»
			«element.generateElements»
		«element.endTag»
	'''
	
	def dispatch startTag(ViewElement element) '''
		<View «element.generateAttributes.toString.trim»>
	'''
	
	def dispatch startTag(View element) '''
		<«element.eClass.name» «element.generateAttributes.toString.trim»>
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
