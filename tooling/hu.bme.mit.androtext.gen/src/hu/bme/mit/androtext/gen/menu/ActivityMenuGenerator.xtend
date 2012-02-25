package hu.bme.mit.androtext.gen.menu

import hu.bme.mit.androtext.gen.IGenerator
import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuElement
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuGroup
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator

class ActivityMenuGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension PropertyValueGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (activity : androidApplication.application.modelElements.filter(typeof (Activity))) {
			if (activity.menu != null) {
				fsa.generateFile(activity.menu.menuResourceFileName+".xml", IGeneratorSlots::MENU_SLOT, activity.menu.generate(true))
			}
		}
	}
	
	def generate(ActivityMenu menu, boolean isRoot) '''
		«IF isRoot»«menu.xmlHeader»«ENDIF»
		<menu «IF isRoot»«menu.androidSchema.toString.trim»«ENDIF»>
			«FOR element : menu.menuElements»
			«element.generate»
			«ENDFOR»
		</menu>
	'''
	
	def dispatch generate(ActivityMenuElement element) ''''''
	def dispatch generate(ActivityMenuItem element) '''
		<item android:id="@+id/«element.name»" 
			  android:title="«element.title»"
			  android:icon="«element.icon.backgroundValue.toString.trim»">
			  «IF element.subMenu != null»
			  «element.subMenu.generate(false)»
			  «ENDIF»
		</item>
	'''
	def dispatch generate(ActivityMenuGroup element) '''
		<group android:id="@+id/«element.name»">
			«FOR item : element.menuItems»
			«item.generate»
			«ENDFOR»
		</group>
	'''
}