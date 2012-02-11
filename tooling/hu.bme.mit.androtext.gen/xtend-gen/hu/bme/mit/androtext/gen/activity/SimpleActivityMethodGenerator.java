package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Action;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.OnClickAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import java.util.Arrays;
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
  
  public StringConcatenation methods(final Activity activity) {
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
  
  protected StringConcatenation _logic(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _logic(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    View _listitem = activity.getListitem();
    String _layoutName = this._generatorExtensions.layoutName(_listitem);
    final String listItem = _layoutName;
    _builder.newLineIfNotEmpty();
    ContentProvider _contentProvider = activity.getContentProvider();
    StringConcatenation _generate = this.generate(_contentProvider, listItem);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    {
      Action _action = activity.getAction();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_action, null);
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
        Action _action_1 = activity.getAction();
        StringConcatenation _generate_1 = this.generate(_action_1, activity);
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
  
  protected StringConcatenation _generate(final ContentProvider provider, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final ResourceContentProvider provider, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    ArrayResource _link = provider.getLink();
    StringConcatenation _generateContentSet = this.generateContentSet(_link, listItem);
    _builder.append(_generateContentSet, "");
    _builder.newLineIfNotEmpty();
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
  
  public StringConcatenation generate(final EObject action, final Object activity) {
    if ((action instanceof InvokeActivity)
         && (activity instanceof Activity)) {
      return _generate((InvokeActivity)action, (Activity)activity);
    } else if ((action instanceof ResourceContentProvider)
         && (activity instanceof String)) {
      return _generate((ResourceContentProvider)action, (String)activity);
    } else if ((action instanceof Action)
         && (activity instanceof Activity)) {
      return _generate((Action)action, (Activity)activity);
    } else if ((action instanceof ContentProvider)
         && (activity instanceof String)) {
      return _generate((ContentProvider)action, (String)activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action, activity).toString());
    }
  }
  
  public StringConcatenation contentViewSet(final Activity activity) {
    if (activity instanceof TabActivity) {
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
