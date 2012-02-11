package hu.bme.mit.androtext.gen.entity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.IGenerator
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Entity
import hu.bme.mit.androtext.lang.androTextDsl.Property
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.gen.IGeneratorSlots

class EntityTableGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions extensions
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa,
			TargetApplication androidApplication) {
		fsa.generateFile(androidApplication.dataInformationClassName + ".java", IGeneratorSlots::DATA_SLOT, generateDataInformation(resourceSet, androidApplication))
	}
	
	def generateDataInformation(ResourceSet resourceSet, TargetApplication androidApplication) '''
		package «androidApplication.dataPackageName»;

		import android.net.Uri;
		import android.provider.BaseColumns;
		
		public final class «androidApplication.dataInformationClassName» {
			
		    public static final String AUTHORITY = "«androidApplication.authority»";
		
		    // This class cannot be instantiated
		    private «androidApplication.dataInformationClassName()»() {
		    }
		    		
			«FOR databaseContentProvider : androidApplication.application.modelElements.filter(typeof (DatabaseContentProvider))» 
				«FOR entity : databaseContentProvider.datamodel.entities»
					«entityTable(entity, androidApplication)»
				«ENDFOR»
			«ENDFOR»
		}
	'''
	
	def entityTable(Entity e, TargetApplication androidApplication) '''
	    /**
	     * Profiles table
	     */
	    public static final class «e.columnsClassName» implements BaseColumns {
	        
	        // This class cannot be instantiated
	        private «e.columnsClassName»() {}

	        /**
	         * The table name offered by this provider
	         */
	        public static final String TABLE_NAME = "«e.name.toLowerCase()»s";

	        /*
	         * URI definitions
	         */

	        /**
	         * The scheme part for this provider's URI
	         */
	        private static final String SCHEME = "content://";

	        /**
	         * Path parts for the URIs
	         */
	        
	        /**
	         * Path part for the «e.name.toLowerCase()»s URI
	         */
	        private static final String «e.path_uri» = "/«e.name.toLowerCase()»s";

	        /**
	         * Path part for the «e.name.toLowerCase()» ID URI
	         */
	        private static final String «e.path_id_uri» = "/«e.name.toLowerCase()»s/";

	        /**
	         * 0-relative position of a «e.name.toLowerCase()» ID segment in the path part of a «e.name.toLowerCase()» ID URI
	         */
	        public static final int «e.name.toUpperCase()»_ID_PATH_POSITION = 1;

	        /**
	         * The content:// style URL for this table
	         */
	        public static final Uri CONTENT_URI =  Uri.parse(SCHEME + AUTHORITY + PATH_«e.name.toUpperCase()»S);

	        /**
	         * The content URI base for a single «e.name.toLowerCase()». Callers must
	         * append a numeric «e.name.toLowerCase()» id to this Uri to retrieve a «e.name.toLowerCase()»
	         */
	        public static final Uri CONTENT_ID_URI_BASE
	            = Uri.parse(SCHEME + AUTHORITY + PATH_«e.name.toUpperCase()»_ID);

	        /**
	         * The content URI match pattern for a single «e.name.toLowerCase()», specified by its ID. Use this to match
	         * incoming URIs or to construct an Intent.
	         */
	        public static final Uri CONTENT_ID_URI_PATTERN
	            = Uri.parse(SCHEME + AUTHORITY + PATH_«e.name.toUpperCase()»_ID + "/#");

	        /*
	         * MIME type definitions
	         */

	        /**
	         * The MIME type of {@link #CONTENT_URI} providing a directory of «e.name.toLowerCase()»s.
	         */
	        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.«androidApplication.findPackageName».«e.name.toLowerCase()»";

	        /**
	         * The MIME type of a {@link #CONTENT_URI} sub-directory of a single
	         * «e.name.toLowerCase()».
	         */
	        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.«androidApplication.findPackageName».«e.name.toLowerCase()»";

	        /**
	         * The default sort order for this table
	         */
	        public static final String DEFAULT_SORT_ORDER = "_id ASC";

	        /*
	         * Column definitions
	         */
	         
	        «FOR prop : e.properties»
	        	«prop.column»
	        «ENDFOR»
	    }
	''' 
	
	def column(Property f) '''
		/**
		 * Column name for the «f.name» feature
		 * <P>Type: «f.columnType»</P>
		 */
		public static final String «f.name.toUpperCase()» = "«f.name»";
	'''
	
}