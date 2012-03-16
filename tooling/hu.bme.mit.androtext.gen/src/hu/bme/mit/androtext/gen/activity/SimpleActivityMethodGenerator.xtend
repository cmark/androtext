package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.gen.util.IteratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity
import hu.bme.mit.androtext.lang.androTextDsl.Action
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.Button
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.DataAction
import hu.bme.mit.androtext.lang.androTextDsl.DataActionType
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.InvokeExplicitActivity
import hu.bme.mit.androtext.lang.androTextDsl.InvokeImplicitActivity
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu
import hu.bme.mit.androtext.lang.androTextDsl.ActivityContextMenu
import hu.bme.mit.androtext.lang.androTextDsl.IntentActionType

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
		
		«IF activity.menu.isOnSelectedMethodNeeded»
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			«IF activity.menu.dataUriNeeded»
			AdapterView.AdapterContextMenuInfo info;
			try {
			     info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
			} catch (ClassCastException e) {
			    Log.e(TAG, "bad menuInfo", e);
			    return false;
			}
			
			Uri dataUri = ContentUris.withAppendedId(getIntent().getData(), info.id);
			«ENDIF»
			switch (item.getItemId()) {
			«FOR menuItem : IteratorExtensions::toIterable(activity.menu.eAllContents).filter(typeof (ActivityMenuItem))»
			case R.id.«menuItem.name»:
				«menuItem.onSelectedAction.generate(activity)»
			    return true;
			«ENDFOR»
			default:
			    return super.onOptionsItemSelected(item);
			}
		}
		«ENDIF»
		«ENDIF»
		
		«IF activity.listActivity»
		«IF (activity as ListActivity).onListItemClickAction != null»
		@Override
		protected void onListItemClick(ListView l, View v, int position, long id) {
			Uri dataUri = ContentUris.withAppendedId(getIntent().getData(), id);
			«(activity as ListActivity).onListItemClickAction.generate(activity)»
		}
		«ENDIF»
		
		«IF activity.contextMenu != null»
		@Override
		public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo menuInfo) {
			AdapterView.AdapterContextMenuInfo info;
			try {
				info = (AdapterView.AdapterContextMenuInfo) menuInfo;
			} catch (ClassCastException e) {
				Log.e(TAG, "bad menuInfo", e);
				return;
			}
			Cursor cursor = (Cursor) getListAdapter().getItem(info.position);
			if (cursor == null) {
			    // For some reason the requested item isn't available, do nothing
			    return;
			}
			// Inflate menu from XML resource
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.«activity.contextMenu.menuResourceFileName», menu);
		}
		
		«IF activity.contextMenu.isOnSelectedMethodNeeded»
		@Override
		public boolean onContextItemSelected(MenuItem item) {
			«IF activity.contextMenu.dataUriNeeded»
			AdapterView.AdapterContextMenuInfo info;
			try {
				info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
			} catch (ClassCastException e) {
				Log.e(TAG, "bad menuInfo", e);
				return false;
			}
			Uri dataUri = ContentUris.withAppendedId(getIntent().getData(), info.id);
			«ENDIF»
			switch (item.getItemId()) {
			«FOR menuItem : IteratorExtensions::toIterable(activity.contextMenu.eAllContents).filter(typeof (ActivityMenuItem))»
			«IF menuItem.onSelectedAction != null»
			case R.id.«menuItem.name»:
				«menuItem.onSelectedAction.generate(activity)»
			    return true;
			«ENDIF»
			«ENDFOR»
			default:
			    return super.onOptionsItemSelected(item);
			}
		}
		«ENDIF»
		«ENDIF»
		«ENDIF»
	'''
	
	def dispatch isOnSelectedMethodNeeded(ActivityMenu menu) {
		return IteratorExtensions::toIterable(menu.eAllContents).filter(typeof (Action)).size > 0
	}
	def dispatch isOnSelectedMethodNeeded(ActivityContextMenu menu) {
		return IteratorExtensions::toIterable(menu.eAllContents).filter(typeof (Action)).size > 0
	}
	
	def dispatch dataUriNeeded(ActivityMenu menu) {
		return IteratorExtensions::toIterable(menu.eAllContents).filter(typeof (Action)).filter([
			if (it instanceof InvokeImplicitActivity) {
				if ((it as InvokeImplicitActivity).action.equals(IntentActionType::INSERT)) {
					return false;	
				}
			}
			return true
		]).size > 0
	}
	
	def dispatch dataUriNeeded(ActivityContextMenu menu) {
		return IteratorExtensions::toIterable(menu.eAllContents).filter(typeof (Action)).filter([
			if (it instanceof InvokeImplicitActivity) {
				if ((it as InvokeImplicitActivity).action.equals(IntentActionType::INSERT)) {
					return false;	
				}
			}
			return true
		]).size > 0
	}
	
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
	
	def dispatch generate(DataAction action, AbstractActivity activity) '''
		«IF action.type.equals(DataActionType::INSERT)»
		getContentResolver().«action.type.name.toLowerCase»(getIntent().getData(), null);
		«ELSEIF action.type.equals(DataActionType::UPDATE)»
		// TODO add values
		getContentResolver().«action.type.name.toLowerCase»(«IF activity.listActivity»dataUri«ELSE»getIntent().getData()«ENDIF», null, null, null);
		«ELSEIF action.type.equals(DataActionType::DELETE)»
		getContentResolver().«action.type.name.toLowerCase»(«IF activity.listActivity»dataUri«ELSE»getIntent().getData()«ENDIF», null, null);
		«ENDIF»
	'''
	
	def boolean isListActivity(AbstractActivity activity) {
		activity instanceof ListActivity
	}
	
	def dispatch generate(InvokeExplicitActivity action, AbstractActivity activity) '''
		Intent invoke«action.activity.name» = new Intent(«activity.abstractClassName.toString.trim».this, «action.activity.className.toString.trim».class);
		startActivity(invoke«action.activity.name»);
	'''
	
	def dispatch generate(InvokeImplicitActivity action, AbstractActivity activity) '''
		«val varName = action.intentVariableName»
		Intent «varName» = new Intent(«action.actionName»);
		«IF !action.data.nullOrEmpty»
			«varName».setData(Uri.create("«action.data»"));
		«ELSEIF !activity.listActivity || action.action.equals(IntentActionType::INSERT)»
			«varName».setData(getIntent().getData());
		«ELSE»
			«varName».setData(dataUri);
		«ENDIF»
		startActivity(«varName»);
	'''
	
	def actionName(InvokeImplicitActivity action) {
		if (action.action != null) {
			"Intent.ACTION_"+action.action.name
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
	def dispatch logic(Activity activity) '''
		«IF activity.databinding != null»
		«activity.databinding.generate(null)»
		«ENDIF»
	'''
	def dispatch logic(ListActivity activity) '''
		Intent intent = getIntent();
		«IF activity.contextMenu != null»
		getListView().setOnCreateContextMenuListener(this);
		«ENDIF»
		«val listItem = activity.listitem.layoutName»
		«IF activity.databinding != null»
		«activity.databinding.generate(listItem)»
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
		
		tabHost.setCurrentTab(0);
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
		«IF !listItem.nullOrEmpty»
		if (intent.getData() == null) {
			intent.setData(«db.entity.columnsClassName».CONTENT_URI);
		}
		this.mCursor = managedQuery(getIntent().getData(), PROJECTION, null, null, «db.entity.columnsClassName».DEFAULT_SORT_ORDER);
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.«listItem», this.mCursor, 
					new String[] { «FOR p : db.projection SEPARATOR ', '»«db.entity.columnsClassName».«p.name.toUpperCase»«ENDFOR» }, 
					new int[] { «FOR view : db.target SEPARATOR ', '»R.id.«view.name»«ENDFOR» });
		setListAdapter(adapter);
		«ENDIF»
		«ELSE»
		this.mCursor = managedQuery(getIntent().getData(), PROJECTION, null, null, null);
		«ENDIF»
	'''
	
	def dispatch generateContentSet(ArrayResource resource, String listItem) '''
	'''
	def dispatch generateContentSet(StringArrayResource resource, String listItem) '''
		String[] «resource.name» = getResources().getStringArray(R.array.«resource.name»);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.«listItem», «resource.name»));
	'''
	def dispatch generateContentSet(IntegerArrayResource resource, String listItem) '''
		int[] «resource.name» = getResources().getIntArray(R.array.«resource.name»);
		setListAdapter(new ArrayAdapter<Integer>(this, R.layout.«listItem», «resource.name»));
	'''
	
}