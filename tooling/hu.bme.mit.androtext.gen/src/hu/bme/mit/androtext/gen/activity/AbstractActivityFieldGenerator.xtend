package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup

class AbstractActivityFieldGenerator {
	
	@Inject extension GeneratorExtensions
	
	def defaultFields(AbstractActivity activity) '''
		protected final static String TAG = "«activity.className»";
	'''
	
	def dispatch generateFields(AbstractActivity activity) '''
		«activity.defaultFields.toString.trim»
	'''
	def dispatch generateFields(Activity activity) '''
		«activity.defaultFields.toString.trim»
		«IF activity.databinding != null && activity.databinding.contentProvider instanceof DatabaseContentProvider && activity.databinding.entity != null»
		protected final static String[] PROJECTION = new String[] {
			«activity.databinding.entity.columnsClassName»._ID,
			«FOR p : activity.databinding.projection SEPARATOR ','»
			«activity.databinding.entity.columnsClassName».«p.name.toUpperCase»
			«ENDFOR»
		};
		«FOR p : activity.databinding.projection»
		protected final static int COLUMN_INDEX_«p.name.toUpperCase» = «activity.databinding.projection.indexOf(p) + 1»;
		«ENDFOR»
		«ENDIF»
		«IF activity.databinding != null»
		protected Cursor mCursor;
		«ENDIF»
		«activity.viewFields»
	'''
	
	def dispatch viewFields(AbstractActivity activity) ''''''
	
	def dispatch viewFields(Activity activity) '''
		«IF activity.layout != null»
		«IF activity.layout instanceof ViewGroup»
			«FOR v : (activity.layout as ViewGroup).views»
				protected «v.javaType» «v.fieldName»;
			«ENDFOR»
		«ELSE»
			protected «activity.layout.javaType» «activity.layout.fieldName»;
		«ENDIF»
		«ENDIF»
	'''
	
	def dispatch generateFields(ListActivity activity) '''
		«activity.defaultFields.toString.trim»
		«IF activity.databinding != null && activity.databinding.fetchAll && activity.databinding.contentProvider instanceof DatabaseContentProvider && activity.databinding.entity != null»
		protected final static String[] PROJECTION = new String[] {
			«activity.databinding.entity.columnsClassName»._ID,
			«FOR p : activity.databinding.projection SEPARATOR ','»
			«activity.databinding.entity.columnsClassName».«p.name.toUpperCase»
			«ENDFOR»
		};
		«ENDIF»
		«IF activity.databinding != null»
		protected Cursor mCursor;
		«ENDIF»
	'''
	
}