package hu.bme.mit.androtext.gen.activity;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IActivityMethodGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Action;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.CustomAction;
import hu.bme.mit.androtext.lang.androTextDsl.DataAction;
import hu.bme.mit.androtext.lang.androTextDsl.DataActionType;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypes;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
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
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SimpleActivityMethodGenerator implements IActivityMethodGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public View viewForProjection(final DataBinding db, final Property p) {
    View _xblockexpression = null;
    {
      EList<Property> _projection = db.getProjection();
      final int pI = _projection.indexOf(p);
      EList<View> _target = db.getTarget();
      View _get = _target.get(pI);
      _xblockexpression = (_get);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateMethods(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("protected void onCreate(Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("super.onCreate(savedInstanceState);");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _contentViewSet = this.contentViewSet(activity);
    _builder.append(_contentViewSet, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _viewsToLocalVariable = this.getViewsToLocalVariable(activity);
    _builder.append(_viewsToLocalVariable, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _logic = this.logic(activity);
    _builder.append(_logic, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateButtonClicks = this.generateButtonClicks(activity);
    _builder.append(_generateButtonClicks, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("protected void onResume() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("super.onResume();");
    _builder.newLine();
    {
      if ((activity instanceof Activity)) {
        {
          DataBinding _databinding = ((Activity) activity).getDatabinding();
          boolean _notEquals = (!Objects.equal(_databinding, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("if (mCursor != null) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("mCursor.requery();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("mCursor.moveToFirst();");
            _builder.newLine();
            {
              DataBinding _databinding_1 = ((Activity) activity).getDatabinding();
              EList<Property> _projection = _databinding_1.getProjection();
              for(final Property p : _projection) {
                _builder.append("\t");
                _builder.append("\t");
                DataBinding _databinding_2 = ((Activity) activity).getDatabinding();
                View _viewForProjection = this.viewForProjection(_databinding_2, p);
                String _fieldName = this._generatorExtensions.fieldName(_viewForProjection);
                _builder.append(_fieldName, "		");
                _builder.append(".setText(mCursor.get");
                String _cursorGetter = this.cursorGetter(p);
                _builder.append(_cursorGetter, "		");
                _builder.append("(COLUMN_INDEX_");
                String _name = p.getName();
                String _upperCase = _name.toUpperCase();
                _builder.append(_upperCase, "		");
                _builder.append("));");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      ActivityMenu _menu = activity.getMenu();
      boolean _notEquals_1 = (!Objects.equal(_menu, null));
      if (_notEquals_1) {
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
              Iterable<ActivityMenuItem> _filter = Iterables.<ActivityMenuItem>filter(_iterable, ActivityMenuItem.class);
              for(final ActivityMenuItem menuItem : _filter) {
                _builder.append("\t");
                _builder.append("case R.id.");
                String _name_1 = menuItem.getName();
                _builder.append(_name_1, "	");
                _builder.append(":");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                Action _onSelectedAction = menuItem.getOnSelectedAction();
                CharSequence _generate = this.generate(_onSelectedAction, activity);
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
          boolean _notEquals_2 = (!Objects.equal(_onListItemClickAction, null));
          if (_notEquals_2) {
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("protected void onListItemClick(ListView l, View v, int position, long id) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("Uri dataUri = ContentUris.withAppendedId(getIntent().getData(), id);");
            _builder.newLine();
            _builder.append("\t");
            Action _onListItemClickAction_1 = ((ListActivity) activity).getOnListItemClickAction();
            CharSequence _generate_1 = this.generate(_onListItemClickAction_1, activity);
            _builder.append(_generate_1, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.newLine();
        {
          ActivityMenu _contextMenu = activity.getContextMenu();
          boolean _notEquals_3 = (!Objects.equal(_contextMenu, null));
          if (_notEquals_3) {
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
            ActivityMenu _contextMenu_1 = activity.getContextMenu();
            String _menuResourceFileName_1 = this._generatorExtensions.menuResourceFileName(_contextMenu_1);
            _builder.append(_menuResourceFileName_1, "	");
            _builder.append(", menu);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            {
              ActivityMenu _contextMenu_2 = activity.getContextMenu();
              boolean _isOnSelectedMethodNeeded_1 = this.isOnSelectedMethodNeeded(_contextMenu_2);
              if (_isOnSelectedMethodNeeded_1) {
                _builder.append("@Override");
                _builder.newLine();
                _builder.append("public boolean onContextItemSelected(MenuItem item) {");
                _builder.newLine();
                {
                  ActivityMenu _contextMenu_3 = activity.getContextMenu();
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
                  ActivityMenu _contextMenu_4 = activity.getContextMenu();
                  TreeIterator<EObject> _eAllContents_1 = _contextMenu_4.eAllContents();
                  Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
                  Iterable<ActivityMenuItem> _filter_1 = Iterables.<ActivityMenuItem>filter(_iterable_1, ActivityMenuItem.class);
                  for(final ActivityMenuItem menuItem_1 : _filter_1) {
                    {
                      Action _onSelectedAction_1 = menuItem_1.getOnSelectedAction();
                      boolean _notEquals_4 = (!Objects.equal(_onSelectedAction_1, null));
                      if (_notEquals_4) {
                        _builder.append("\t");
                        _builder.append("case R.id.");
                        String _name_2 = menuItem_1.getName();
                        _builder.append(_name_2, "	");
                        _builder.append(":");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                        Action _onSelectedAction_2 = menuItem_1.getOnSelectedAction();
                        CharSequence _generate_2 = this.generate(_onSelectedAction_2, activity);
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
  
  public String cursorGetter(final Property p) {
    String _xblockexpression = null;
    {
      final TypeRef type = p.getType();
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (type instanceof EntityTypeRef) {
          final EntityTypeRef _entityTypeRef = (EntityTypeRef)type;
          _matched=true;
          _switchResult = "Int";
        }
      }
      if (!_matched) {
        if (type instanceof DataTypesRef) {
          final DataTypesRef _dataTypesRef = (DataTypesRef)type;
          _matched=true;
          DataTypes _type = _dataTypesRef.getType();
          String _literal = _type.getLiteral();
          String _firstUpper = StringExtensions.toFirstUpper(_literal);
          _switchResult = _firstUpper;
        }
      }
      if (!_matched) {
        _switchResult = null;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _getViewsToLocalVariable(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _getViewsToLocalVariable(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      View _layout = activity.getLayout();
      boolean _notEquals = (!Objects.equal(_layout, null));
      if (_notEquals) {
        {
          View _layout_1 = activity.getLayout();
          if ((_layout_1 instanceof ViewGroup)) {
            {
              View _layout_2 = activity.getLayout();
              EList<View> _views = ((ViewGroup) _layout_2).getViews();
              for(final View v : _views) {
                String _fieldName = this._generatorExtensions.fieldName(v);
                _builder.append(_fieldName, "");
                _builder.append(" = (");
                String _javaType = this._generatorExtensions.javaType(v);
                _builder.append(_javaType, "");
                _builder.append(") findViewById(R.id.");
                String _name = v.getName();
                _builder.append(_name, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            View _layout_3 = activity.getLayout();
            String _fieldName_1 = this._generatorExtensions.fieldName(_layout_3);
            _builder.append(_fieldName_1, "");
            _builder.append(" = (");
            View _layout_4 = activity.getLayout();
            String _javaType_1 = this._generatorExtensions.javaType(_layout_4);
            _builder.append(_javaType_1, "");
            _builder.append(") findViewById(R.id.");
            View _layout_5 = activity.getLayout();
            String _name_1 = _layout_5.getName();
            _builder.append(_name_1, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public boolean isOnSelectedMethodNeeded(final ActivityMenu menu) {
    TreeIterator<EObject> _eAllContents = menu.eAllContents();
    Iterator<Action> _filter = Iterators.<Action>filter(_eAllContents, Action.class);
    int _size = IteratorExtensions.size(_filter);
    return (_size > 0);
  }
  
  protected boolean _dataUriNeeded(final ActivityMenu menu) {
    TreeIterator<EObject> _eAllContents = menu.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<Action> _filter = Iterables.<Action>filter(_iterable, Action.class);
    final Function1<Action,Boolean> _function = new Function1<Action,Boolean>() {
        public Boolean apply(final Action it) {
          if ((it instanceof InvokeImplicitActivity)) {
            IntentActionType _action = ((InvokeImplicitActivity) it).getAction();
            boolean _equals = _action.equals(IntentActionType.INSERT);
            if (_equals) {
              return Boolean.valueOf(false);
            }
          }
          return Boolean.valueOf(true);
        }
      };
    Iterable<Action> _filter_1 = IterableExtensions.<Action>filter(_filter, _function);
    int _size = IterableExtensions.size(_filter_1);
    return (_size > 0);
  }
  
  protected CharSequence _generateButtonClicks(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateButtonClicks(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      View _layout = activity.getLayout();
      boolean _notEquals = (!Objects.equal(_layout, null));
      if (_notEquals) {
        {
          View _layout_1 = activity.getLayout();
          Resource _eResource = _layout_1.eResource();
          TreeIterator<EObject> _allContents = _eResource.getAllContents();
          Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
          Iterable<Button> _filter = Iterables.<Button>filter(_iterable, Button.class);
          for(final Button button : _filter) {
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Action action, final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generate(final DataAction action, final AbstractActivity activity) {
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
  
  protected CharSequence _generate(final InvokeExplicitActivity action, final AbstractActivity activity) {
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
  
  protected CharSequence _generate(final InvokeImplicitActivity action, final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    final String varName = this.intentVariableName(action);
    _builder.newLineIfNotEmpty();
    _builder.append("Intent ");
    _builder.append(varName, "");
    _builder.append(" = new Intent(");
    CharSequence _actionName = this.actionName(action);
    String _string = _actionName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      String _data = action.getData();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_data);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append(varName, "");
        _builder.append(".setData(Uri.create(\"");
        String _data_1 = action.getData();
        _builder.append(_data_1, "");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _or = false;
        boolean _isListActivity = this.isListActivity(activity);
        boolean _not_1 = (!_isListActivity);
        if (_not_1) {
          _or = true;
        } else {
          IntentActionType _action = action.getAction();
          boolean _equals = _action.equals(IntentActionType.INSERT);
          _or = (_not_1 || _equals);
        }
        if (_or) {
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
  
  public CharSequence actionName(final InvokeImplicitActivity action) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      CustomAction _customAction = action.getCustomAction();
      boolean _notEquals = (!Objects.equal(_customAction, null));
      if (!_notEquals) {
        _and = false;
      } else {
        CustomAction _customAction_1 = action.getCustomAction();
        String _name = _customAction_1.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        boolean _not = (!_isNullOrEmpty);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("\"");
        CustomAction _customAction_2 = action.getCustomAction();
        String _name_1 = _customAction_2.getName();
        _builder.append(_name_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("Intent.ACTION_");
        IntentActionType _action = action.getAction();
        String _name_2 = _action.name();
        _builder.append(_name_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String intentVariableName(final InvokeImplicitActivity action) {
    String _xblockexpression = null;
    {
      String variableName = "";
      IntentActionType _action = action.getAction();
      boolean _notEquals = (!Objects.equal(_action, null));
      if (_notEquals) {
        IntentActionType _action_1 = action.getAction();
        String _name = _action_1.name();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        variableName = _firstUpper;
      } else {
        CustomAction _customAction = action.getCustomAction();
        String _name_1 = _customAction.getName();
        final int li = _name_1.lastIndexOf(".");
        int _minus = (-1);
        boolean _equals = (li == _minus);
        if (_equals) {
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
      String _plus = ("invoke" + variableName);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _contentViewSet(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _contentViewSet(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      View _layout = activity.getLayout();
      boolean _notEquals = (!Objects.equal(_layout, null));
      if (_notEquals) {
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
  
  protected CharSequence _contentViewSet(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("setContentView(R.layout.");
    String _tabActivityLayout = this._generatorExtensions.tabActivityLayout(activity);
    _builder.append(_tabActivityLayout, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _contentViewSet(final PreferenceActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addPreferencesFromResource(R.xml.");
    String _preferenceXmlFileName = this._generatorExtensions.preferenceXmlFileName(activity);
    _builder.append(_preferenceXmlFileName, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _logic(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _logic(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DataBinding _databinding = activity.getDatabinding();
      boolean _notEquals = (!Objects.equal(_databinding, null));
      if (_notEquals) {
        DataBinding _databinding_1 = activity.getDatabinding();
        CharSequence _generate = this.generate(_databinding_1, null);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _logic(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      View _listitem = activity.getListitem();
      boolean _notEquals = (!Objects.equal(_listitem, null));
      if (_notEquals) {
        _builder.append("Intent intent = getIntent();");
        _builder.newLine();
        {
          ActivityMenu _contextMenu = activity.getContextMenu();
          boolean _notEquals_1 = (!Objects.equal(_contextMenu, null));
          if (_notEquals_1) {
            _builder.append("getListView().setOnCreateContextMenuListener(this);");
            _builder.newLine();
          }
        }
        View _listitem_1 = activity.getListitem();
        final String listItem = this._generatorExtensions.layoutName(_listitem_1);
        _builder.newLineIfNotEmpty();
        {
          DataBinding _databinding = activity.getDatabinding();
          boolean _notEquals_2 = (!Objects.equal(_databinding, null));
          if (_notEquals_2) {
            DataBinding _databinding_1 = activity.getDatabinding();
            CharSequence _generate = this.generate(_databinding_1, listItem);
            _builder.append(_generate, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _logic(final TabActivity activity) {
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
    boolean _equals = Objects.equal(_contentProvider, null);
    if (_equals) {
      return "";
    }
    ContentProvider _contentProvider_1 = db.getContentProvider();
    return this.generate(_contentProvider_1, db, listItem);
  }
  
  protected CharSequence _generate(final ContentProvider provider, final DataBinding db, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generate(final ResourceContentProvider provider, final DataBinding db, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    ArrayResource _arrayResource = provider.getArrayResource();
    CharSequence _generateContentSet = this.generateContentSet(_arrayResource, listItem);
    _builder.append(_generateContentSet, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final DatabaseContentProvider provider, final DataBinding db, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isFetchAll = db.isFetchAll();
      if (_isFetchAll) {
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(listItem);
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
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
              boolean _hasElements = false;
              for(final Property p : _projection) {
                if (!_hasElements) {
                  _hasElements = true;
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
              boolean _hasElements_1 = false;
              for(final View view : _target) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
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
  
  protected CharSequence _generateContentSet(final ArrayResource resource, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateContentSet(final StringArrayResource resource, final String listItem) {
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
  
  protected CharSequence _generateContentSet(final IntegerArrayResource resource, final String listItem) {
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
  
  public CharSequence getViewsToLocalVariable(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _getViewsToLocalVariable((Activity)activity);
    } else if (activity != null) {
      return _getViewsToLocalVariable(activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
  
  public boolean dataUriNeeded(final ActivityMenu menu) {
    {
      return _dataUriNeeded(menu);
    }
  }
  
  public CharSequence generateButtonClicks(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _generateButtonClicks((Activity)activity);
    } else if (activity != null) {
      return _generateButtonClicks(activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
  
  public CharSequence generate(final Action action, final AbstractActivity activity) {
    if (action instanceof DataAction) {
      return _generate((DataAction)action, activity);
    } else if (action instanceof InvokeExplicitActivity) {
      return _generate((InvokeExplicitActivity)action, activity);
    } else if (action instanceof InvokeImplicitActivity) {
      return _generate((InvokeImplicitActivity)action, activity);
    } else if (action != null) {
      return _generate(action, activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action, activity).toString());
    }
  }
  
  public CharSequence contentViewSet(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _contentViewSet((Activity)activity);
    } else if (activity instanceof PreferenceActivity) {
      return _contentViewSet((PreferenceActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _contentViewSet((TabActivity)activity);
    } else if (activity != null) {
      return _contentViewSet(activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
  
  public CharSequence logic(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _logic((Activity)activity);
    } else if (activity instanceof ListActivity) {
      return _logic((ListActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _logic((TabActivity)activity);
    } else if (activity != null) {
      return _logic(activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
  
  public CharSequence generate(final ContentProvider provider, final DataBinding db, final String listItem) {
    if (provider instanceof DatabaseContentProvider) {
      return _generate((DatabaseContentProvider)provider, db, listItem);
    } else if (provider instanceof ResourceContentProvider) {
      return _generate((ResourceContentProvider)provider, db, listItem);
    } else if (provider != null) {
      return _generate(provider, db, listItem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(provider, db, listItem).toString());
    }
  }
  
  public CharSequence generateContentSet(final ArrayResource resource, final String listItem) {
    if (resource instanceof IntegerArrayResource) {
      return _generateContentSet((IntegerArrayResource)resource, listItem);
    } else if (resource instanceof StringArrayResource) {
      return _generateContentSet((StringArrayResource)resource, listItem);
    } else if (resource != null) {
      return _generateContentSet(resource, listItem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(resource, listItem).toString());
    }
  }
}
