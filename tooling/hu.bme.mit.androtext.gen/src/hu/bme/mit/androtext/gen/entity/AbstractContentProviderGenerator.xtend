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
import hu.bme.mit.androtext.lang.androTextDsl.Entity

class AbstractContentProviderGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions generatorExtensions
	@Inject extension JvmTypesBuilder
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication androidApplication) {
		for (databaseContentProvider : androidApplication.application.modelElements.filter(typeof (DatabaseContentProvider))) {
			fsa.generateFile(databaseContentProvider.abstractJavaFileName, IGeneratorSlots::DATA_SLOT, generate(databaseContentProvider, androidApplication))
		}
	}
	
	def generate(DatabaseContentProvider contentProvider, TargetApplication application) '''
		package «application.dataPackageName»;
		
		«FOR e : contentProvider.datamodel.entities»
		import «application.dataPackageName».«application.dataInformationClassName».«e.columnsClassName»;
		«ENDFOR»
		
		import android.content.ContentProvider;
		import android.content.ContentUris;
		import android.content.ContentValues;
		import android.content.Context;
		import android.content.UriMatcher;
		import android.database.Cursor;
		import android.database.SQLException;
		import android.database.sqlite.SQLiteDatabase;
		import android.database.sqlite.SQLiteOpenHelper;
		import android.database.sqlite.SQLiteQueryBuilder;
		import android.net.Uri;
		import android.text.TextUtils;
		import android.util.Log;
		
		import java.util.HashMap;
		
		«body(contentProvider, application)»
		
	'''
	
	def query_all(Entity entity) {
		entity.name.toUpperCase + "S"
	}
	
	def query_one(Entity entity) {
		entity.name.toUpperCase + "_ID"
	}
	
	def tableNameFieldNameRef(Entity e) {
		e.columnsClassName + ".TABLE_NAME"
	}
	
	def projectionFieldName(Entity e) {
		"s" + e.query_all.toLowerCase.toFirstUpper + "ProjectionMap"
	}
	
	def body(DatabaseContentProvider contentProvider, TargetApplication application) '''
		public abstract class «contentProvider.abstractClassName» extends ContentProvider {
			
			protected static final String TAG = "«contentProvider.className»";
			protected static final String DATABASE_NAME = "«contentProvider.className.toFirstLower»db.db";
			protected static final int DATABASE_VERSION = 2;
			
			«FOR e : contentProvider.datamodel.entities»
			protected static final int «e.query_all» = «2*contentProvider.datamodel.entities.indexOf(e)+1»;
			protected static final int «e.query_one» = «2*contentProvider.datamodel.entities.indexOf(e)+2»;
			«ENDFOR»
			
			«FOR e : contentProvider.datamodel.entities»
			protected static HashMap<String, String> «e.projectionFieldName»;
			«ENDFOR»
			
			protected static final UriMatcher sUriMatcher;
			protected DatabaseHelper mOpenHelper;
			
			/**
			 * This class helps open, create, and upgrade the database file.
			 */
			private static class DatabaseHelper extends SQLiteOpenHelper {
				
				DatabaseHelper(Context context) {
					super(context, DATABASE_NAME, null, DATABASE_VERSION);
				}
				
				@Override
		        public void onCreate(SQLiteDatabase db) {
		        	«FOR e : contentProvider.datamodel.entities»
		        	db.execSQL("CREATE TABLE " + «e.tableNameFieldNameRef» + " ("
		        		+ «e.columnsClassName»._ID + " INTEGER PRIMARY KEY,"
		        		«FOR p : e.properties SEPARATOR '," '»+ «e.columnsClassName».«p.name.toUpperCase» + " «p.columnType»«ENDFOR»"+ ");");
		            «ENDFOR»
		        }

		        @Override
		        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
		                    + newVersion + ", which will destroy all old data");
		            «FOR e : contentProvider.datamodel.entities»
		            db.execSQL("DROP TABLE IF EXISTS " + «e.tableNameFieldNameRef»);
		            «ENDFOR»
		            onCreate(db);
		        }
		    }
			
			@Override
			public boolean onCreate() {
				mOpenHelper = new DatabaseHelper(getContext());
				return true;
			}
			
			@Override
			public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
				String sortOrder) {
				SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
				int match = sUriMatcher.match(uri);
				String orderBy;
				switch (match) {
				«FOR e : contentProvider.datamodel.entities»
				case «e.query_all»:
					qb.setTables(«e.tableNameFieldNameRef»);
					qb.setProjectionMap(«e.projectionFieldName»);
					// If no sort order is specified use the default
					if (TextUtils.isEmpty(sortOrder)) {
						orderBy = «e.columnsClassName».DEFAULT_SORT_ORDER;
					} else {
						orderBy = sortOrder;
					}
					break;
				case «e.query_one»:
					qb.setTables(«e.tableNameFieldNameRef»);
					qb.setProjectionMap(«e.projectionFieldName»);
					qb.appendWhere(«e.columnsClassName»._ID + "=" + uri.getPathSegments().get(1));
					// If no sort order is specified use the default
					if (TextUtils.isEmpty(sortOrder)) {
						orderBy = «e.columnsClassName».DEFAULT_SORT_ORDER;
					} else {
						orderBy = sortOrder;
					}
					break;
				«ENDFOR»
		
		        default:
		            throw new IllegalArgumentException("Unknown URI " + uri);
		        }
		
		        // Get the database and run the query
		        SQLiteDatabase db = mOpenHelper.getReadableDatabase();
		        Cursor c = qb.query(db, projection, selection, selectionArgs, null, null, orderBy);
		
		        // Tell the cursor what uri to watch, so it knows when its source data changes
		        c.setNotificationUri(getContext().getContentResolver(), uri);
		        return c;
			}
			
		    @Override
		    public String getType(Uri uri) {
		        switch (sUriMatcher.match(uri)) {
		        «FOR e : contentProvider.datamodel.entities»
		        case «e.query_all»:
		            return «e.columnsClassName».CONTENT_TYPE;
		        case «e.query_one»:
		            return «e.columnsClassName».CONTENT_ITEM_TYPE;
				«ENDFOR»
		        default:
		            throw new IllegalArgumentException("Unknown URI " + uri);
		        }
		    }
		    
		    @Override
		    public Uri insert(Uri uri, ContentValues initialValues) {
				String tableName = null;
				Uri contentUri = null;
				switch (sUriMatcher.match(uri)) {
		        «FOR e : contentProvider.datamodel.entities»
		        case «e.query_all»:
		            tableName = «e.tableNameFieldNameRef»;
		            contentUri = «e.columnsClassName».CONTENT_URI;
		            break;
				«ENDFOR»
		        default:
		            throw new IllegalArgumentException("Unknown URI " + uri);
		        }
		
		        ContentValues values;
		        if (initialValues != null) {
		            values = new ContentValues(initialValues);
		        } else {
		            values = new ContentValues();
		        }

				setDefaultValuesFor(uri, values);
		
		        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		        long rowId = db.insert(tableName, getNullColumnHack(uri), values);
		        if (rowId > 0) {
		            Uri newUri = ContentUris.withAppendedId(contentUri, rowId);
		            getContext().getContentResolver().notifyChange(newUri, null);
		            return uri;
		        }
		
		        throw new SQLException("Failed to insert row into " + uri);
		    }
		    
		    @Override
		    public int delete(Uri uri, String where, String[] whereArgs) {
		        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		        int count;
		        switch (sUriMatcher.match(uri)) {
		        «FOR e : contentProvider.datamodel.entities»
		        case «e.query_all»:
		        	count = db.delete(«e.tableNameFieldNameRef», where, whereArgs);
		        	break;
		        case «e.query_one»:
		        	String «e.name.toLowerCase»Id = uri.getPathSegments().get(1);
		        	count = db.delete(«e.tableNameFieldNameRef», «e.columnsClassName»._ID + "=" + «e.name.toLowerCase»Id
		                    + (!TextUtils.isEmpty(where) ? " AND (" + where + ')' : ""), whereArgs);
		        	break;
		        «ENDFOR»		
		        default:
		            throw new IllegalArgumentException("Unknown URI " + uri);
		        }
		
		        getContext().getContentResolver().notifyChange(uri, null);
		        return count;
		    }
		    
		    @Override
		    public int update(Uri uri, ContentValues values, String where, String[] whereArgs) {
		        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		        int count;
		        switch (sUriMatcher.match(uri)) {
		        «FOR e : contentProvider.datamodel.entities»
		        case «e.query_all»:
		        	count = db.update(«e.tableNameFieldNameRef», values, where, whereArgs);
		        	break;
		        case «e.query_one»:
		        	String «e.name.toLowerCase»Id = uri.getPathSegments().get(1);
		        	count = db.update(«e.tableNameFieldNameRef», values, «e.columnsClassName»._ID + "=" + «e.name.toLowerCase»Id
		                    + (!TextUtils.isEmpty(where) ? " AND (" + where + ')' : ""), whereArgs);
		        	break;
		        «ENDFOR»
		
		        default:
		            throw new IllegalArgumentException("Unknown URI " + uri);
		        }
		
		        getContext().getContentResolver().notifyChange(uri, null);
		        return count;
		    }
		    
		    abstract protected String getNullColumnHack(Uri uri);
		    abstract protected void setDefaultValuesFor(Uri uri, ContentValues values);
			
			static {
		        sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
		        «FOR e : contentProvider.datamodel.entities»
		        sUriMatcher.addURI(«application.dataInformationClassName».AUTHORITY, "«e.path_uri»", «e.query_all»);
		        sUriMatcher.addURI(«application.dataInformationClassName».AUTHORITY, "«e.path_id_uri»#", «e.query_one»);
		        «ENDFOR»

		        «FOR e : contentProvider.datamodel.entities»
		        «e.projectionFieldName» = new HashMap<String, String>();
		        «e.projectionFieldName».put(«e.columnsClassName»._ID, «e.columnsClassName»._ID);
		        «FOR p : e.properties»
		        «e.projectionFieldName».put(«e.columnsClassName».«p.name.toUpperCase», «e.columnsClassName».«p.name.toUpperCase»);
		        «ENDFOR»
		        «ENDFOR»
		    }
		}
	'''
	
}