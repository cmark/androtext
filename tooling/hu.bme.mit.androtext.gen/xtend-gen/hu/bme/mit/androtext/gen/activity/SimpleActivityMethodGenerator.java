package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.gen.util.IteratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Action;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityContextMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.CustomAction;
import hu.bme.mit.androtext.lang.androTextDsl.DataAction;
import hu.bme.mit.androtext.lang.androTextDsl.DataActionType;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntentActionType;
import hu.bme.mit.androtext.lang.androTextDsl.InvokeExplicitActivity;
import hu.bme.mit.androtext.lang.androTextDsl.InvokeImplicitActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SimpleActivityMethodGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public StringConcatenation simpleMethods(final AbstractActivity activity) {
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
        _builder.newLine();
        {
          ActivityMenu _menu_2 = activity.getMenu();
          boolean _isOnSelectedMethodNeeded = this.isOnSelectedMethodNeeded(_menu_2);
          if (_isOnSelectedMethodNeeded) {
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("public boolean onOptionsItemSelected(MenuItem item) {");
            _builder.newLine();
            {
              ActivityMenu _menu_3 = activity.getMenu();
              boolean _dataUriNeeded = this.dataUriNeeded(_menu_3);
              if (_dataUriNeeded) {
                _builder.append("\t");
                _builder.append("AdapterView.AdapterContextMenuInfo info;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("     ");
                _builder.append("info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("} catch (ClassCastException e) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("    ");
                _builder.append("Log.e(TAG, \"bad menuInfo\", e);");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("    ");
                _builder.append("return false;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("Uri dataUri = ContentUris.withAppendedId(getIntent().getData(), info.id);");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("switch (item.getItemId()) {");
            _builder.newLine();
            {
              ActivityMenu _menu_4 = activity.getMenu();
              TreeIterator<EObject> _eAllContents = _menu_4.eAllContents();
              Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
              Iterable<ActivityMenuItem> _filter = IterableExtensions.<ActivityMenuItem>filter(_iterable, hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem.class);
              for(final ActivityMenuItem menuItem : _filter) {
                _builder.append("\t");
                _builder.append("case R.id.");
                String _name = menuItem.getName();
                _builder.append(_name, "	");
                _builder.append(":");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                Action _onSelectedAction = menuItem.getOnSelectedAction();
                StringConcatenation _generate = this.generate(_onSelectedAction, activity);
                _builder.append(_generate, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("    ");
                _builder.append("return true;");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("default:");
            _builder.newLine();
            _builder.append("\t    ");
            _builder.append("return super.onOptionsItemSelected(item);");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    {
      boolean _isListActivity = this.isListActivity(activity);
      if (_isListActivity) {
        {
          Action _onListItemClickAction = ((ListActivity) activity).getOnListItemClickAction();
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_onListItemClickAction, null);
          if (_operator_notEquals_1) {
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("protected void onListItemClick(ListView l, View v, int position, long id) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("Uri dataUri = ContentUris.withAppendedId(getIntent().getData(), id);");
            _builder.newLine();
            _builder.append("\t");
            Action _onListItemClickAction_1 = ((ListActivity) activity).getOnListItemClickAction();
            StringConcatenation _generate_1 = this.generate(_onListItemClickAction_1, activity);
            _builder.append(_generate_1, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.newLine();
        {
          ActivityContextMenu _contextMenu = activity.getContextMenu();
          boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_contextMenu, null);
          if (_operator_notEquals_2) {
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo menuInfo) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("AdapterView.AdapterContextMenuInfo info;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("info = (AdapterView.AdapterContextMenuInfo) menuInfo;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("} catch (ClassCastException e) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("Log.e(TAG, \"bad menuInfo\", e);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("Cursor cursor = (Cursor) getListAdapter().getItem(info.position);");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("if (cursor == null) {");
            _builder.newLine();
            _builder.append("\t    ");
            _builder.append("// For some reason the requested item isn\'t available, do nothing");
            _builder.newLine();
            _builder.append("\t    ");
            _builder.append("return;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("// Inflate menu from XML resource");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("MenuInflater inflater = getMenuInflater();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("inflater.inflate(R.menu.");
            ActivityContextMenu _contextMenu_1 = activity.getContextMenu();
            String _menuResourceFileName_1 = this._generatorExtensions.menuResourceFileName(_contextMenu_1);
            _builder.append(_menuResourceFileName_1, "	");
            _builder.append(", menu);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            {
              ActivityContextMenu _contextMenu_2 = activity.getContextMenu();
              boolean _isOnSelectedMethodNeeded_1 = this.isOnSelectedMethodNeeded(_contextMenu_2);
              if (_isOnSelectedMethodNeeded_1) {
                _builder.append("@Override");
                _builder.newLine();
                _builder.append("public boolean onContextItemSelected(MenuItem item) {");
                _builder.newLine();
                {
                  ActivityContextMenu _contextMenu_3 = activity.getContextMenu();
                  boolean _dataUriNeeded_1 = this.dataUriNeeded(_contextMenu_3);
                  if (_dataUriNeeded_1) {
                    _builder.append("\t");
                    _builder.append("AdapterView.AdapterContextMenuInfo info;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("try {");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("} catch (ClassCastException e) {");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("Log.e(TAG, \"bad menuInfo\", e);");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("return false;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("Uri dataUri = ContentUris.withAppendedId(getIntent().getData(), info.id);");
                    _builder.newLine();
                  }
                }
                _builder.append("\t");
                _builder.append("switch (item.getItemId()) {");
                _builder.newLine();
                {
                  ActivityContextMenu _contextMenu_4 = activity.getContextMenu();
                  TreeIterator<EObject> _eAllContents_1 = _contextMenu_4.eAllContents();
                  Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
                  Iterable<ActivityMenuItem> _filter_1 = IterableExtensions.<ActivityMenuItem>filter(_iterable_1, hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem.class);
                  for(final ActivityMenuItem menuItem_1 : _filter_1) {
                    {
                      Action _onSelectedAction_1 = menuItem_1.getOnSelectedAction();
                      boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_onSelectedAction_1, null);
                      if (_operator_notEquals_3) {
                        _builder.append("\t");
                        _builder.append("case R.id.");
                        String _name_1 = menuItem_1.getName();
                        _builder.append(_name_1, "	");
                        _builder.append(":");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                        Action _onSelectedAction_2 = menuItem_1.getOnSelectedAction();
                        StringConcatenation _generate_2 = this.generate(_onSelectedAction_2, activity);
                        _builder.append(_generate_2, "		");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("    ");
                        _builder.append("return true;");
                        _builder.newLine();
                      }
                    }
                  }
                }
                _builder.append("\t");
                _builder.append("default:");
                _builder.newLine();
                _builder.append("\t    ");
                _builder.append("return super.onOptionsItemSelected(item);");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  protected boolean _isOnSelectedMethodNeeded(final ActivityMenu menu) {
    TreeIterator<EObject> _eAllContents = menu.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<Action> _filter = IterableExtensions.<Action>filter(_iterable, hu.bme.mit.androtext.lang.androTextDsl.Action.class);
    int _size = IterableExtensions.size(_filter);
    boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)0));
    return _operator_greaterThan;
  }
  
  protected boolean _isOnSelectedMethodNeeded(final ActivityContextMenu menu) {
    TreeIterator<EObject> _eAllContents = menu.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<Action> _filter = IterableExtensions.<Action>filter(_iterable, hu.bme.mit.androtext.lang.androTextDsl.Action.class);
    int _size = IterableExtensions.size(_filter);
    boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)0));
    return _operator_greaterThan;
  }
  
  protected boolean _dataUriNeeded(final ActivityMenu menu) {
    TreeIterator<EObject> _eAllContents = menu.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<Action> _filter = IterableExtensions.<Action>filter(_iterable, hu.bme.mit.androtext.lang.androTextDsl.Action.class);
    final Function1<Action,Boolean> _function = new Function1<Action,Boolean>() {
        public Boolean apply(final Action it) {
          {
            if ((it instanceof InvokeImplicitActivity)) {
              IntentActionType _action = ((InvokeImplicitActivity) it).getAction();
              boolean _equals = _action.equals(IntentActionType.INSERT);
              if (_equals) {
                return ((Boolean)false);
              }
            }
            return ((Boolean)true);
          }
        }
      };
    Iterable<Action> _filter_1 = IterableExtensions.<Action>filter(_filter, _function);
    int _size = IterableExtensions.size(_filter_1);
    boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)0));
    return _operator_greaterThan;
  }
  
  protected boolean _dataUriNeeded(final ActivityContextMenu menu) {
    TreeIterator<EObject> _eAllContents = menu.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<Action> _filter = IterableExtensions.<Action>filter(_iterable, hu.bme.mit.androtext.lang.androTextDsl.Action.class);
    final Function1<Action,Boolean> _function = new Function1<Action,Boolean>() {
        public Boolean apply(final Action it) {
          {
            if ((it instanceof InvokeImplicitActivity)) {
              IntentActionType _action = ((InvokeImplicitActivity) it).getAction();
              boolean _equals = _action.equals(IntentActionType.INSERT);
              if (_equals) {
                return ((Boolean)false);
              }
            }
            return ((Boolean)true);
          }
        }
      };
    Iterable<Action> _filter_1 = IterableExtensions.<Action>filter(_filter, _function);
    int _size = IterableExtensions.size(_filter_1);
    boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)0));
    return _operator_greaterThan;
  }
  
  protected StringConcatenation _generateButtonClicks(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateButtonClicks(final Activity activity) {
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
          }
        }
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Action action, final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final DataAction action, final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DataActionType _type = action.getType();
      boolean _equals = _type.equals(DataActionType.INSERT);
      if (_equals) {
        _builder.append("getContentResolver().");
        DataActionType _type_1 = action.getType();
        String _name = _type_1.name();
        String _lowerCase = _name.toLowerCase();
        _builder.append(_lowerCase, "");
        _builder.append("(getIntent().getData(), null);");
        _builder.newLineIfNotEmpty();
      } else {
        DataActionType _type_2 = action.getType();
        boolean _equals_1 = _type_2.equals(DataActionType.UPDATE);
        if (_equals_1) {
          _builder.append("// TODO add values");
          _builder.newLine();
          _builder.append("getContentResolver().");
          DataActionType _type_3 = action.getType();
          String _name_1 = _type_3.name();
          String _lowerCase_1 = _name_1.toLowerCase();
          _builder.append(_lowerCase_1, "");
          _builder.append("(");
          {
            boolean _isListActivity = this.isListActivity(activity);
            if (_isListActivity) {
              _builder.append("dataUri");
            } else {
              _builder.append("getIntent().getData()");
            }
          }
          _builder.append(", null, null, null);");
          _builder.newLineIfNotEmpty();
        } else {
          DataActionType _type_4 = action.getType();
          boolean _equals_2 = _type_4.equals(DataActionType.DELETE);
          if (_equals_2) {
            _builder.append("getContentResolver().");
            DataActionType _type_5 = action.getType();
            String _name_2 = _type_5.name();
            String _lowerCase_2 = _name_2.toLowerCase();
            _builder.append(_lowerCase_2, "");
            _builder.append("(");
            {
              boolean _isListActivity_1 = this.isListActivity(activity);
              if (_isListActivity_1) {
                _builder.append("dataUri");
              } else {
                _builder.append("getIntent().getData()");
              }
            }
            _builder.append(", null, null);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public boolean isListActivity(final AbstractActivity activity) {
    return (activity instanceof ListActivity);
  }
  
  protected StringConcatenation _generate(final InvokeExplicitActivity action, final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Intent invoke");
    AbstractActivity _activity = action.getActivity();
    String _name = _activity.getName();
    _builder.append(_name, "");
    _builder.append(" = new Intent(");
    String _abstractClassName = this._generatorExtensions.abstractClassName(activity);
    String _string = _abstractClassName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(".this, ");
    AbstractActivity _activity_1 = action.getActivity();
    String _className = this._generatorExtensions.className(_activity_1);
    String _string_1 = _className.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append(".class);");
    _builder.newLineIfNotEmpty();
    _builder.append("startActivity(invoke");
    AbstractActivity _activity_2 = action.getActivity();
    String _name_1 = _activity_2.getName();
    _builder.append(_name_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final InvokeImplicitActivity action, final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    String _intentVariableName = this.intentVariableName(action);
    final String varName = _intentVariableName;
    _builder.newLineIfNotEmpty();
    _builder.append("Intent ");
    _builder.append(varName, "");
    _builder.append(" = new Intent(");
    String _actionName = this.actionName(action);
    _builder.append(_actionName, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      String _data = action.getData();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_data);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append(varName, "");
        _builder.append(".setData(Uri.create(\"");
        String _data_1 = action.getData();
        _builder.append(_data_1, "");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _operator_or = false;
        boolean _isListActivity = this.isListActivity(activity);
        boolean _operator_not_1 = BooleanExtensions.operator_not(_isListActivity);
        if (_operator_not_1) {
          _operator_or = true;
        } else {
          IntentActionType _action = action.getAction();
          boolean _equals = _action.equals(IntentActionType.INSERT);
          _operator_or = BooleanExtensions.operator_or(_operator_not_1, _equals);
        }
        if (_operator_or) {
          _builder.append(varName, "");
          _builder.append(".setData(getIntent().getData());");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append(varName, "");
          _builder.append(".setData(dataUri);");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("startActivity(");
    _builder.append(varName, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String actionName(final InvokeImplicitActivity action) {
    String _xifexpression = null;
    IntentActionType _action = action.getAction();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_action, null);
    if (_operator_notEquals) {
      IntentActionType _action_1 = action.getAction();
      String _name = _action_1.name();
      String _operator_plus = StringExtensions.operator_plus("Intent.ACTION_", _name);
      _xifexpression = _operator_plus;
    } else {
      CustomAction _customAction = action.getCustomAction();
      String _name_1 = _customAction.getName();
      _xifexpression = _name_1;
    }
    return _xifexpression;
  }
  
  public String intentVariableName(final InvokeImplicitActivity action) {
    String _xblockexpression = null;
    {
      String variableName = "";
      IntentActionType _action = action.getAction();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_action, null);
      if (_operator_notEquals) {
        IntentActionType _action_1 = action.getAction();
        String _name = _action_1.name();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        variableName = _firstUpper;
      } else {
        {
          CustomAction _customAction = action.getCustomAction();
          String _name_1 = _customAction.getName();
          int _lastIndexOf = _name_1.lastIndexOf(".");
          final int li = _lastIndexOf;
          int _operator_minus = IntegerExtensions.operator_minus(1);
          boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)li), ((Integer)_operator_minus));
          if (_operator_equals) {
            CustomAction _customAction_1 = action.getCustomAction();
            String _name_2 = _customAction_1.getName();
            variableName = _name_2;
          } else {
            CustomAction _customAction_2 = action.getCustomAction();
            String _name_3 = _customAction_2.getName();
            String _substring = _name_3.substring(li);
            variableName = _substring;
          }
        }
      }
      String _operator_plus = StringExtensions.operator_plus("invoke", variableName);
      _xblockexpression = (_operator_plus);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _contentViewSet(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
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
  
  protected StringConcatenation _logic(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _logic(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DataBinding _databinding = activity.getDatabinding();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_databinding, null);
      if (_operator_notEquals) {
        DataBinding _databinding_1 = activity.getDatabinding();
        CharSequence _generate = this.generate(_databinding_1, null);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _logic(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Intent intent = getIntent();");
    _builder.newLine();
    {
      ActivityContextMenu _contextMenu = activity.getContextMenu();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_contextMenu, null);
      if (_operator_notEquals) {
        _builder.append("getListView().setOnCreateContextMenuListener(this);");
        _builder.newLine();
      }
    }
    View _listitem = activity.getListitem();
    String _layoutName = this._generatorExtensions.layoutName(_listitem);
    final String listItem = _layoutName;
    _builder.newLineIfNotEmpty();
    {
      DataBinding _databinding = activity.getDatabinding();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_databinding, null);
      if (_operator_notEquals_1) {
        DataBinding _databinding_1 = activity.getDatabinding();
        CharSequence _generate = this.generate(_databinding_1, listItem);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
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
        AbstractActivity _activity = tab.getActivity();
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
    _builder.append("tabHost.setCurrentTab(0);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final DataBinding db, final String listItem) {
      ContentProvider _contentProvider = db.getContentProvider();
      boolean _operator_equals = ObjectExtensions.operator_equals(_contentProvider, null);
      if (_operator_equals) {
        return "";
      }
      ContentProvider _contentProvider_1 = db.getContentProvider();
      StringConcatenation _generate = this.generate(_contentProvider_1, db, listItem);
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
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(listItem);
          boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
          if (_operator_not) {
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
            _builder.append("this.mCursor = managedQuery(getIntent().getData(), PROJECTION, null, null, ");
            Entity _entity_1 = db.getEntity();
            String _columnsClassName_1 = this._generatorExtensions.columnsClassName(_entity_1);
            _builder.append(_columnsClassName_1, "");
            _builder.append(".DEFAULT_SORT_ORDER);");
            _builder.newLineIfNotEmpty();
            _builder.append("SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.");
            _builder.append(listItem, "");
            _builder.append(", this.mCursor, ");
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
      } else {
        _builder.append("this.mCursor = managedQuery(getIntent().getData(), PROJECTION, null, null, null);");
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
    _builder.append("int[] ");
    String _name = resource.getName();
    _builder.append(_name, "");
    _builder.append(" = getResources().getIntArray(R.array.");
    String _name_1 = resource.getName();
    _builder.append(_name_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("setListAdapter(new ArrayAdapter<Integer>(this, R.layout.");
    _builder.append(listItem, "");
    _builder.append(", ");
    String _name_2 = resource.getName();
    _builder.append(_name_2, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public boolean isOnSelectedMethodNeeded(final EObject menu) {
    if (menu instanceof ActivityContextMenu) {
      return _isOnSelectedMethodNeeded((ActivityContextMenu)menu);
    } else if (menu instanceof ActivityMenu) {
      return _isOnSelectedMethodNeeded((ActivityMenu)menu);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(menu).toString());
    }
  }
  
  public boolean dataUriNeeded(final EObject menu) {
    if (menu instanceof ActivityContextMenu) {
      return _dataUriNeeded((ActivityContextMenu)menu);
    } else if (menu instanceof ActivityMenu) {
      return _dataUriNeeded((ActivityMenu)menu);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(menu).toString());
    }
  }
  
  public StringConcatenation generateButtonClicks(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _generateButtonClicks((Activity)activity);
    } else {
      return _generateButtonClicks(activity);
    }
  }
  
  public StringConcatenation generate(final Action action, final AbstractActivity activity) {
    if (action instanceof DataAction) {
      return _generate((DataAction)action, activity);
    } else if (action instanceof InvokeExplicitActivity) {
      return _generate((InvokeExplicitActivity)action, activity);
    } else if (action instanceof InvokeImplicitActivity) {
      return _generate((InvokeImplicitActivity)action, activity);
    } else {
      return _generate(action, activity);
    }
  }
  
  public StringConcatenation contentViewSet(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _contentViewSet((Activity)activity);
    } else if (activity instanceof PreferenceActivity) {
      return _contentViewSet((PreferenceActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _contentViewSet((TabActivity)activity);
    } else {
      return _contentViewSet(activity);
    }
  }
  
  public StringConcatenation logic(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _logic((Activity)activity);
    } else if (activity instanceof ListActivity) {
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
