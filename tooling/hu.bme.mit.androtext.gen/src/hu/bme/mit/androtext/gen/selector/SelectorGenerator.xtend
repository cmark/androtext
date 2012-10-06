package hu.bme.mit.androtext.gen.selector

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Tab
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

class SelectorGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication application) {
		for (tab : resourceSet.resources.map(r | r.allContents.toIterable.filter(typeof (Tab))).flatten) {
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