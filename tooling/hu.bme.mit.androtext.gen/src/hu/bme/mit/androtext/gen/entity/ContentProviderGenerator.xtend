package hu.bme.mit.androtext.gen.entity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.gen.IGeneratorSlots
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class ContentProviderGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions generatorExtensions
	@Inject extension JvmTypesBuilder
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (databaseContentProvider : androidApplication.application.modelElements.filter(typeof (DatabaseContentProvider))) {
			fsa.generateFile(databaseContentProvider.javaFileName, IGeneratorSlots::SRC_DATA_SLOT, generate(databaseContentProvider, androidApplication))
		}
	}
	
	def generate(DatabaseContentProvider contentProvider, TargetApplication application) '''
		package «application.dataPackageName»;
		
		import android.content.ContentValues;
		import android.net.Uri;
		
		«body(contentProvider, application)»
	'''
	
	def body(DatabaseContentProvider contentProvider, TargetApplication application) '''
		public class «contentProvider.className» extends «contentProvider.abstractClassName» {
			
			@Override
			protected void setDefaultValuesFor(Uri uri, ContentValues values) {
				// set default content values when inserting a new entity, called when insert called in provider
			}
			
			@Override
			protected String getNullColumnHack(Uri uri) {
				// specify the nullcolumnhack if needed when inserting new entity
				return null;
			}
			
		}
	'''
}