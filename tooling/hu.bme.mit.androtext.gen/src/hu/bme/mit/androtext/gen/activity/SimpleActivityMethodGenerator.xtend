package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Action
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.Button
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.InvokeExplicitActivity
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.InvokeImplicitActivity
import hu.bme.mit.androtext.lang.androTextDsl.Keyword
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.lang.androTextDsl.Activity

class SimpleActivityMethodGenerator {
	
	@Inject extension GeneratorExtensions
	
	def simpleMethods(AbstractActivity activity) '''
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			«activity.contentViewSet»
			«activity.logic»
			«activity.generateButtonClicks»
		}
		
		«IF activity.menu != null»
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
		    MenuInflater inflater = getMenuInflater();
		    inflater.inflate(R.menu.«activity.menu.menuResourceFileName», menu);
		    return true;
		}
		«ENDIF»
	'''
	
	def dispatch generateButtonClicks(AbstractActivity activity) ''''''
	def dispatch generateButtonClicks(Activity activity) '''
		«IF activity.layout != null»
		«FOR button : activity.layout.eResource.allContentsIterable.filter(typeof (Button))»
		«IF button.onClickAttribute != null»
		Button «button.name» = (Button)findViewById(R.id.«button.name»);
		«button.name».setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				«button.onClickAttribute.action.generate(activity)»
			}
		});
		«ENDIF»
		«ENDFOR»
		«ENDIF»
	'''
	
	def dispatch generate(Action action, AbstractActivity activity) ''''''
	/**
	 * TODO add data
	 */
	def dispatch generate(InvokeExplicitActivity action, AbstractActivity activity) '''
		Intent invoke«action.activity.name» = new Intent(«activity.abstractClassName.toString.trim».this, «action.activity.className.toString.trim».class);
		startActivity(invoke«action.activity.name»);
	'''
	
	def dispatch generate(InvokeImplicitActivity action, AbstractActivity activity) '''
		Intent «val varName = action.intentVariableName» = new Intent(«action.actionName»);
		«IF !action.data.nullOrEmpty»
			«varName».setData(Uri.create("«action.data»"));
		«ELSEIF action.currentUri != null && action.currentUri == Keyword::CURRENT_DATA»
			«varName».setData(getIntent().getData());
		«ELSE»
			"Wrong model state at implicit intent invocation: " 
		«ENDIF»
		startActivity(«varName»);
	'''
	
	def actionName(InvokeImplicitActivity action) {
		if (action.action != null) {
			action.action.name
		} else {
			action.customAction.name
		}
	}
	
	def intentVariableName(InvokeImplicitActivity action) {
		var variableName = ""
		if (action.action != null) {
			variableName = action.action.name.toFirstUpper
		} else {
			val li = action.customAction.name.lastIndexOf(".")
			if (li == -1) {
				variableName = action.customAction.name
			} else {
				variableName = action.customAction.name.substring(li)	
			}
		}
		"invoke"+variableName
	}
	
	def dispatch contentViewSet(AbstractActivity activity) ''''''
	def dispatch contentViewSet(Activity activity) '''
		«IF activity.layout != null»
		setContentView(R.layout.«activity.layout.layoutName»);
		«ENDIF»
	'''
	
	def dispatch contentViewSet(TabActivity activity) '''
		setContentView(R.layout.«activity.tabActivityLayout»);
	'''
	
	def dispatch contentViewSet(PreferenceActivity activity) '''
		addPreferencesFromResource(R.xml.«activity.preferenceXmlFileName»);
	'''
	
	def dispatch logic(AbstractActivity activity) ''''''
	def dispatch logic(ListActivity activity) '''
		Intent intent = getIntent();
		«val listItem = activity.listitem.layoutName»
		«IF activity.databinding != null»
		«activity.databinding.generate(listItem)»
		«ENDIF»
		«IF activity.onListItemClickAction != null»
		getListView().setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				«activity.onListItemClickAction.generate(activity)»
			}
		});
		«ENDIF»
	'''
	
	def dispatch logic(TabActivity activity) '''
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost();  // The activity TabHost
		TabHost.TabSpec spec;  // Resusable TabSpec for each tab
		Intent intent;  // Reusable Intent for each tab
		«FOR tab : activity.tabs»
		intent = new Intent().setClass(this, «tab.activity.className».class);
		spec = tabHost.newTabSpec("«tab.tag»").setIndicator("«tab.tag.toFirstUpper»",
						res.getDrawable(R.drawable.«tab.drawable.link.name»))
						.setContent(intent);
		tabHost.addTab(spec);
		
		«ENDFOR»
		
		tabHost.setCurrentTab(2);
	'''
	
	def generate(DataBinding db, String listItem) {
		if (db.contentProvider == null) return ""
		return db.contentProvider.generate(db, listItem)
	}
	
	def dispatch generate(ContentProvider provider, DataBinding db, String listItem) ''''''
	def dispatch generate(ResourceContentProvider provider, DataBinding db, String listItem) '''
		«provider.arrayResource.generateContentSet(listItem)»
	'''
	
	def dispatch generate(DatabaseContentProvider provider, DataBinding db, String listItem)'''
		«IF db.fetchAll»
		if (intent.getData() == null) {
			intent.setData(«db.entity.columnsClassName».CONTENT_URI);
		}
		Cursor cursor = managedQuery(getIntent().getData(), PROJECTION, null, null, «db.entity.columnsClassName».DEFAULT_SORT_ORDER);
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.«listItem», cursor, 
					new String[] { «FOR p : db.projection SEPARATOR ', '»«db.entity.columnsClassName».«p.name.toUpperCase»«ENDFOR» }, 
					new int[] { «FOR view : db.target SEPARATOR ', '»R.id.«view.name»«ENDFOR» });
		setListAdapter(adapter);
		«ENDIF»
	'''
	
	def dispatch generateContentSet(ArrayResource resource, String listItem) '''
	'''
	def dispatch generateContentSet(StringArrayResource resource, String listItem) '''
		String[] «resource.name» = getResources().getStringArray(R.array.«resource.name»);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.«listItem», «resource.name»));
	'''
	def dispatch generateContentSet(IntegerArrayResource resource, String listItem) '''
	'''
	
}