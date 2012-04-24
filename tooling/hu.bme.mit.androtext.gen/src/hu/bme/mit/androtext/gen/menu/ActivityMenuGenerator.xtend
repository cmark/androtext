package hu.bme.mit.androtext.gen.menu

import com.google.common.collect.Iterables
import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuElement
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuGroup
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import java.util.Collections
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.lang.androTextDsl.ActivityContextMenu

class ActivityMenuGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension PropertyValueGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		val activities = androidApplication.application.components.filter(typeof (AbstractActivity)).toList
		Iterables::addAll(activities, Collections::singletonList(androidApplication.application.mainActivity))
		for (activity : activities) {
			if (activity.menu != null) {
				fsa.generateFile(activity.menu.menuResourceFileName+".xml", IGeneratorSlots::MENU_SLOT, activity.menu.generate(true))
			}
			if (activity.contextMenu != null) {
				fsa.generateFile(activity.contextMenu.menuResourceFileName+".xml", IGeneratorSlots::MENU_SLOT, activity.contextMenu.generate(true))
			}
		}
	}
	
	def dispatch generate(ActivityMenu menu, boolean isRoot) '''
		«IF isRoot»«menu.xmlHeader»«ENDIF»
		<menu «IF isRoot»«menu.androidSchema.toString.trim»«ENDIF»>
			«FOR element : menu.menuElements»
			«element.generate»
			«ENDFOR»
		</menu>
	'''
	
	def dispatch generate(ActivityContextMenu menu, boolean isRoot) '''
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
			  «IF !element.title.nullOrEmpty»android:title="«element.title»"«ENDIF»
			  «IF element.icon != null»android:icon="«element.icon.generateValue»"«ENDIF»>
			  «IF element.subMenu != null»
			  «element.subMenu.generate(false)»
			  «ENDIF»
		</item>
	'''
	def dispatch generate(ActivityMenuGroup element) '''
		<group «IF !element.name.nullOrEmpty»android:id="@+id/«element.name»"«ENDIF»>
			«FOR item : element.menuItems»
			«item.generate»
			«ENDFOR»
		</group>
	'''
}