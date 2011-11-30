package hu.bme.mit.androtext.gen.selector

import hu.bme.mit.androtext.gen.IGenerator
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Tab
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource

class SelectorGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication application) {
		for (tab : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof (Tab))).flatten) {
			fsa.generateFile(tab.drawable.link.name + ".xml", IGeneratorSlots::DRAWABLE_SLOT, tab.drawable.link.generate);	
		}
	}
	
	def generate(TabDrawableResource resource) '''
		«resource.xmlHeader»
		<selector «resource.androidSchema» >
		    <item android:drawable="@drawable/«resource.selected.filename»" android:state_selected="true" />
		    <item android:drawable="@drawable/«resource.unselected.filename»" />
		</selector>
	'''
	
}