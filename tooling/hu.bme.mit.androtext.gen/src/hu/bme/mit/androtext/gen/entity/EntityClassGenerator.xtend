package hu.bme.mit.androtext.gen.entity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.IGeneratorSlots
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Entity
import hu.bme.mit.androtext.lang.androTextDsl.Property
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.ImportManager
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider

class EntityClassGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions generatorExtensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (databaseContentProvider : androidApplication.application.modelElements.filter(typeof (DatabaseContentProvider))) {
			for (entity : databaseContentProvider.datamodel.entities) {
				fsa.generateFile(entity.javaFileName, IGeneratorSlots::DATA_SLOT, generate(entity, androidApplication))
			}
		}
	}
	
	def generate(Entity e, TargetApplication application) ''' 
		«val importManager = new ImportManager(true)»
		«/* first evaluate the body in order to collect the used types for the import section */
		val body = body(e, importManager)»
		«IF !(application.findPackageName.isNullOrEmpty)»
			package «application.findPackageName».data;
			
		«ENDIF»
		«FOR i:importManager.imports»
			import «i»;
		«ENDFOR»
		
		«body»
	'''
	
	def body(Entity e, ImportManager importManager) ''' 
		public class «e.className» «e.superTypeClause(importManager)»{
			
			«FOR f:e.properties»
				«feature(f, importManager)»
			«ENDFOR»
			
			«FOR f:e.properties»
				«f.getter»
			«ENDFOR»
			
			«FOR f:e.properties»
				«f.setter»
			«ENDFOR»
		}
	'''
	
	def superTypeClause(Entity e, ImportManager importManager) {
		if(e.superType != null)
			'extends ' + e.superType.className + " "
		else ""    
	}
	
	def feature(Property f, ImportManager importManager) '''
		private «f.type» «f.featureName»;
	'''
	
	def getter(Property f) '''
		public «f.type» get«f.name.toFirstUpper»() {
			return «f.name»;
		}
		
	'''
	
	def setter(Property f) '''
		public void set«f.name.toFirstUpper»(«f.type» «f.name») {
			this.«f.featureName» = «f.name»;
		}
		
	'''
	
//	def dispatch featuretype(EntityTypeRef t) '''
//		«t.className»
//	'''
	
//	def dispatch featuretype(DataTypeRef t) '''
//		«t.referencedDataType.toString»
//	'''	
}