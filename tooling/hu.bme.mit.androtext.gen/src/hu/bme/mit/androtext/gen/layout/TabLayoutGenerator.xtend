package hu.bme.mit.androtext.gen.layout

import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.gen.IGeneratorSlots

class TabLayoutGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication application) {
		for (tabactivity : resourceSet.resources.map(r | r.allContentsIterable.filter(typeof(TabActivity))).flatten) {
			fsa.generateFile(tabactivity.tabActivityLayout + ".xml", IGeneratorSlots::LAYOUT_SLOT, tabactivity.generateLayout)
		}
	}
	
	def generateLayout(TabActivity activity) '''
		<?xml version="1.0" encoding="utf-8"?>
		<TabHost xmlns:android="http://schemas.android.com/apk/res/android"
		    android:id="@android:id/tabhost"
		    android:layout_width="fill_parent"
		    android:layout_height="fill_parent">
		    <LinearLayout
		        android:orientation="vertical"
		        android:layout_width="fill_parent"
		        android:layout_height="fill_parent"
		        android:padding="5dp">
		        <TabWidget
		            android:id="@android:id/tabs"
		            android:layout_width="fill_parent"
		            android:layout_height="wrap_content" />
		        <FrameLayout
		            android:id="@android:id/tabcontent"
		            android:layout_width="fill_parent"
		            android:layout_height="fill_parent"
		            android:padding="5dp" />
		    </LinearLayout>
		</TabHost>
	'''
	
}