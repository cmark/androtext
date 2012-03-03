package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Action;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.OnClickAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SimpleActivityMethodGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public StringConcatenation simpleMethods(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("protected void onCreate(Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("super.onCreate(savedInstanceState);");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _contentViewSet = this.contentViewSet(activity);
    _builder.append(_contentViewSet, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _logic = this.logic(activity);
    _builder.append(_logic, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _generateButtonClicks = this.generateButtonClicks(activity);
    _builder.append(_generateButtonClicks, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      ActivityMenu _menu = activity.getMenu();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_menu, null);
      if (_operator_notEquals) {
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("public boolean onCreateOptionsMenu(Menu menu) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("MenuInflater inflater = getMenuInflater();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("inflater.inflate(R.menu.");
        ActivityMenu _menu_1 = activity.getMenu();
        String _menuResourceFileName = this._generatorExtensions.menuResourceFileName(_menu_1);
        _builder.append(_menuResourceFileName, "    ");
        _builder.append(", menu);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generateButtonClicks(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      View _layout = activity.getLayout();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_layout, null);
      if (_operator_notEquals) {
        {
          View _layout_1 = activity.getLayout();
          Resource _eResource = _layout_1.eResource();
          Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
          Iterable<Button> _filter = IterableExtensions.<Button>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.Button.class);
          for(final Button button : _filter) {
            {
              OnClickAttribute _onClickAttribute = button.getOnClickAttribute();
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_onClickAttribute, null);
              if (_operator_notEquals_1) {
                _builder.append("Button ");
                String _name = button.getName();
                _builder.append(_name, "");
                _builder.append(" = (Button)findViewById(R.id.");
                String _name_1 = button.getName();
                _builder.append(_name_1, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                String _name_2 = button.getName();
                _builder.append(_name_2, "");
                _builder.append(".setOnClickListener(new OnClickListener() {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("@Override");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("public void onClick(View v) {");
                _builder.newLine();
                _builder.append("\t\t");
                OnClickAttribute _onClickAttribute_1 = button.getOnClickAttribute();
                Action _action = _onClickAttribute_1.getAction();
                StringConcatenation _generate = this.generate(_action, activity);
                _builder.append(_generate, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("});");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Action action, final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final InvokeActivity action, final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Intent invoke");
    Activity _activity = action.getActivity();
    String _name = _activity.getName();
    _builder.append(_name, "");
    _builder.append(" = new Intent(");
    String _abstractClassName = this._generatorExtensions.abstractClassName(activity);
    String _string = _abstractClassName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(".this, ");
    Activity _activity_1 = action.getActivity();
    String _className = this._generatorExtensions.className(_activity_1);
    String _string_1 = _className.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append(".class);");
    _builder.newLineIfNotEmpty();
    _builder.append("startActivity(invoke");
    Activity _activity_2 = action.getActivity();
    String _name_1 = _activity_2.getName();
    _builder.append(_name_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _contentViewSet(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      View _layout = activity.getLayout();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_layout, null);
      if (_operator_notEquals) {
        _builder.append("setContentView(R.layout.");
        View _layout_1 = activity.getLayout();
        String _layoutName = this._generatorExtensions.layoutName(_layout_1);
        _builder.append(_layoutName, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _contentViewSet(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("setContentView(R.layout.");
    String _tabActivityLayout = this._generatorExtensions.tabActivityLayout(activity);
    _builder.append(_tabActivityLayout, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _contentViewSet(final PreferenceActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addPreferencesFromResource(R.xml.");
    String _preferenceXmlFileName = this._generatorExtensions.preferenceXmlFileName(activity);
    _builder.append(_preferenceXmlFileName, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _logic(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _logic(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Intent intent = getIntent();");
    _builder.newLine();
    View _listitem = activity.getListitem();
    String _layoutName = this._generatorExtensions.layoutName(_listitem);
    final String listItem = _layoutName;
    _builder.newLineIfNotEmpty();
    DataBinding _databinding = activity.getDatabinding();
    StringConcatenation _generate = this.generate(_databinding, listItem);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    {
      Action _onListItemClickAction = activity.getOnListItemClickAction();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_onListItemClickAction, null);
      if (_operator_notEquals) {
        _builder.append("getListView().setOnItemClickListener(new OnItemClickListener() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void onItemClick(AdapterView<?> parent, View view, int position, long id) {");
        _builder.newLine();
        _builder.append("\t\t");
        Action _onListItemClickAction_1 = activity.getOnListItemClickAction();
        StringConcatenation _generate_1 = this.generate(_onListItemClickAction_1, activity);
        _builder.append(_generate_1, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("});");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _logic(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Resources res = getResources(); // Resource object to get Drawables");
    _builder.newLine();
    _builder.append("TabHost tabHost = getTabHost();  // The activity TabHost");
    _builder.newLine();
    _builder.append("TabHost.TabSpec spec;  // Resusable TabSpec for each tab");
    _builder.newLine();
    _builder.append("Intent intent;  // Reusable Intent for each tab");
    _builder.newLine();
    {
      EList<Tab> _tabs = activity.getTabs();
      for(final Tab tab : _tabs) {
        _builder.append("intent = new Intent().setClass(this, ");
        Activity _activity = tab.getActivity();
        String _className = this._generatorExtensions.className(_activity);
        _builder.append(_className, "");
        _builder.append(".class);");
        _builder.newLineIfNotEmpty();
        _builder.append("spec = tabHost.newTabSpec(\"");
        String _tag = tab.getTag();
        _builder.append(_tag, "");
        _builder.append("\").setIndicator(\"");
        String _tag_1 = tab.getTag();
        String _firstUpper = StringExtensions.toFirstUpper(_tag_1);
        _builder.append(_firstUpper, "");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("res.getDrawable(R.drawable.");
        TabDrawableResourceLink _drawable = tab.getDrawable();
        TabDrawableResource _link = _drawable.getLink();
        String _name = _link.getName();
        _builder.append(_name, "				");
        _builder.append("))");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append(".setContent(intent);");
        _builder.newLine();
        _builder.append("tabHost.addTab(spec);");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("tabHost.setCurrentTab(2);");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate(final DataBinding db, final String listItem) {
    ContentProvider _contentProvider = db.getContentProvider();
    StringConcatenation _generate = this.generate(_contentProvider, db, listItem);
    return _generate;
  }
  
  protected StringConcatenation _generate(final ContentProvider provider, final DataBinding db, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final ResourceContentProvider provider, final DataBinding db, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    ArrayResource _arrayResource = provider.getArrayResource();
    StringConcatenation _generateContentSet = this.generateContentSet(_arrayResource, listItem);
    _builder.append(_generateContentSet, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final DatabaseContentProvider provider, final DataBinding db, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isFetchAll = db.isFetchAll();
      if (_isFetchAll) {
        _builder.append("if (intent.getData() == null) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("intent.setData(");
        Entity _entity = db.getEntity();
        String _columnsClassName = this._generatorExtensions.columnsClassName(_entity);
        _builder.append(_columnsClassName, "	");
        _builder.append(".CONTENT_URI);");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.append("Cursor cursor = managedQuery(getIntent().getData(), PROJECTION, null, null, ");
        Entity _entity_1 = db.getEntity();
        String _columnsClassName_1 = this._generatorExtensions.columnsClassName(_entity_1);
        _builder.append(_columnsClassName_1, "");
        _builder.append(".DEFAULT_SORT_ORDER);");
        _builder.newLineIfNotEmpty();
        _builder.append("SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.");
        _builder.append(listItem, "");
        _builder.append(", cursor, ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("new String[] { ");
        {
          EList<Property> _projection = db.getProjection();
          boolean hasAnyElements = false;
          for(final Property p : _projection) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate(", ", "			");
            }
            Entity _entity_2 = db.getEntity();
            String _columnsClassName_2 = this._generatorExtensions.columnsClassName(_entity_2);
            _builder.append(_columnsClassName_2, "			");
            _builder.append(".");
            String _name = p.getName();
            String _upperCase = _name.toUpperCase();
            _builder.append(_upperCase, "			");
          }
        }
        _builder.append(" }, ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("new int[] { ");
        {
          EList<View> _target = db.getTarget();
          boolean hasAnyElements_1 = false;
          for(final View view : _target) {
            if (!hasAnyElements_1) {
              hasAnyElements_1 = true;
            } else {
              _builder.appendImmediate(", ", "			");
            }
            _builder.append("R.id.");
            String _name_1 = view.getName();
            _builder.append(_name_1, "			");
          }
        }
        _builder.append(" });");
        _builder.newLineIfNotEmpty();
        _builder.append("setListAdapter(adapter);");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generateContentSet(final ArrayResource resource, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateContentSet(final StringArrayResource resource, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String[] ");
    String _name = resource.getName();
    _builder.append(_name, "");
    _builder.append(" = getResources().getStringArray(R.array.");
    String _name_1 = resource.getName();
    _builder.append(_name_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("setListAdapter(new ArrayAdapter<String>(this, R.layout.");
    _builder.append(listItem, "");
    _builder.append(", ");
    String _name_2 = resource.getName();
    _builder.append(_name_2, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generateContentSet(final IntegerArrayResource resource, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public StringConcatenation generate(final Action action, final Activity activity) {
    if (action instanceof InvokeActivity) {
      return _generate((InvokeActivity)action, activity);
    } else {
      return _generate(action, activity);
    }
  }
  
  public StringConcatenation contentViewSet(final Activity activity) {
    if (activity instanceof PreferenceActivity) {
      return _contentViewSet((PreferenceActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _contentViewSet((TabActivity)activity);
    } else {
      return _contentViewSet(activity);
    }
  }
  
  public StringConcatenation logic(final Activity activity) {
    if (activity instanceof ListActivity) {
      return _logic((ListActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _logic((TabActivity)activity);
    } else {
      return _logic(activity);
    }
  }
  
  public StringConcatenation generate(final ContentProvider provider, final DataBinding db, final String listItem) {
    if (provider instanceof DatabaseContentProvider) {
      return _generate((DatabaseContentProvider)provider, db, listItem);
    } else if (provider instanceof ResourceContentProvider) {
      return _generate((ResourceContentProvider)provider, db, listItem);
    } else {
      return _generate(provider, db, listItem);
    }
  }
  
  public StringConcatenation generateContentSet(final ArrayResource resource, final String listItem) {
    if (resource instanceof IntegerArrayResource) {
      return _generateContentSet((IntegerArrayResource)resource, listItem);
    } else if (resource instanceof StringArrayResource) {
      return _generateContentSet((StringArrayResource)resource, listItem);
    } else {
      return _generateContentSet(resource, listItem);
    }
  }
}
