package hu.bme.mit.androtext.gen.activity;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AbstractActivityFieldGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public CharSequence defaultFields(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected final static String TAG = \"");
    String _className = this._generatorExtensions.className(activity);
    _builder.append(_className, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFields(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _defaultFields = this.defaultFields(activity);
    String _string = _defaultFields.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFields(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _defaultFields = this.defaultFields(activity);
    String _string = _defaultFields.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _and = false;
      boolean _and_1 = false;
      DataBinding _databinding = activity.getDatabinding();
      boolean _notEquals = (!Objects.equal(_databinding, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        DataBinding _databinding_1 = activity.getDatabinding();
        ContentProvider _contentProvider = _databinding_1.getContentProvider();
        _and_1 = (_notEquals && (_contentProvider instanceof DatabaseContentProvider));
      }
      if (!_and_1) {
        _and = false;
      } else {
        DataBinding _databinding_2 = activity.getDatabinding();
        Entity _entity = _databinding_2.getEntity();
        boolean _notEquals_1 = (!Objects.equal(_entity, null));
        _and = (_and_1 && _notEquals_1);
      }
      if (_and) {
        _builder.append("protected final static String[] PROJECTION = new String[] {");
        _builder.newLine();
        _builder.append("\t");
        DataBinding _databinding_3 = activity.getDatabinding();
        Entity _entity_1 = _databinding_3.getEntity();
        String _columnsClassName = this._generatorExtensions.columnsClassName(_entity_1);
        _builder.append(_columnsClassName, "	");
        _builder.append("._ID,");
        _builder.newLineIfNotEmpty();
        {
          DataBinding _databinding_4 = activity.getDatabinding();
          EList<Property> _projection = _databinding_4.getProjection();
          boolean _hasElements = false;
          for(final Property p : _projection) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "	");
            }
            _builder.append("\t");
            DataBinding _databinding_5 = activity.getDatabinding();
            Entity _entity_2 = _databinding_5.getEntity();
            String _columnsClassName_1 = this._generatorExtensions.columnsClassName(_entity_2);
            _builder.append(_columnsClassName_1, "	");
            _builder.append(".");
            String _name = p.getName();
            String _upperCase = _name.toUpperCase();
            _builder.append(_upperCase, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("};");
        _builder.newLine();
        {
          DataBinding _databinding_6 = activity.getDatabinding();
          EList<Property> _projection_1 = _databinding_6.getProjection();
          for(final Property p_1 : _projection_1) {
            _builder.append("protected final static int COLUMN_INDEX_");
            String _name_1 = p_1.getName();
            String _upperCase_1 = _name_1.toUpperCase();
            _builder.append(_upperCase_1, "");
            _builder.append(" = ");
            DataBinding _databinding_7 = activity.getDatabinding();
            EList<Property> _projection_2 = _databinding_7.getProjection();
            int _indexOf = _projection_2.indexOf(p_1);
            int _plus = (_indexOf + 1);
            _builder.append(_plus, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      DataBinding _databinding_8 = activity.getDatabinding();
      boolean _notEquals_2 = (!Objects.equal(_databinding_8, null));
      if (_notEquals_2) {
        _builder.append("protected Cursor mCursor;");
        _builder.newLine();
      }
    }
    CharSequence _viewFields = this.viewFields(activity);
    _builder.append(_viewFields, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _viewFields(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _viewFields(final Activity activity) {
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
                _builder.append("protected ");
                String _javaType = this._generatorExtensions.javaType(v);
                _builder.append(_javaType, "");
                _builder.append(" ");
                String _fieldName = this._generatorExtensions.fieldName(v);
                _builder.append(_fieldName, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            _builder.append("protected ");
            View _layout_3 = activity.getLayout();
            String _javaType_1 = this._generatorExtensions.javaType(_layout_3);
            _builder.append(_javaType_1, "");
            _builder.append(" ");
            View _layout_4 = activity.getLayout();
            String _fieldName_1 = this._generatorExtensions.fieldName(_layout_4);
            _builder.append(_fieldName_1, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateFields(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _defaultFields = this.defaultFields(activity);
    String _string = _defaultFields.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _and_2 = false;
      DataBinding _databinding = activity.getDatabinding();
      boolean _notEquals = (!Objects.equal(_databinding, null));
      if (!_notEquals) {
        _and_2 = false;
      } else {
        DataBinding _databinding_1 = activity.getDatabinding();
        boolean _isFetchAll = _databinding_1.isFetchAll();
        _and_2 = (_notEquals && _isFetchAll);
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        DataBinding _databinding_2 = activity.getDatabinding();
        ContentProvider _contentProvider = _databinding_2.getContentProvider();
        _and_1 = (_and_2 && (_contentProvider instanceof DatabaseContentProvider));
      }
      if (!_and_1) {
        _and = false;
      } else {
        DataBinding _databinding_3 = activity.getDatabinding();
        Entity _entity = _databinding_3.getEntity();
        boolean _notEquals_1 = (!Objects.equal(_entity, null));
        _and = (_and_1 && _notEquals_1);
      }
      if (_and) {
        _builder.append("protected final static String[] PROJECTION = new String[] {");
        _builder.newLine();
        _builder.append("\t");
        DataBinding _databinding_4 = activity.getDatabinding();
        Entity _entity_1 = _databinding_4.getEntity();
        String _columnsClassName = this._generatorExtensions.columnsClassName(_entity_1);
        _builder.append(_columnsClassName, "	");
        _builder.append("._ID,");
        _builder.newLineIfNotEmpty();
        {
          DataBinding _databinding_5 = activity.getDatabinding();
          EList<Property> _projection = _databinding_5.getProjection();
          boolean _hasElements = false;
          for(final Property p : _projection) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "	");
            }
            _builder.append("\t");
            DataBinding _databinding_6 = activity.getDatabinding();
            Entity _entity_2 = _databinding_6.getEntity();
            String _columnsClassName_1 = this._generatorExtensions.columnsClassName(_entity_2);
            _builder.append(_columnsClassName_1, "	");
            _builder.append(".");
            String _name = p.getName();
            String _upperCase = _name.toUpperCase();
            _builder.append(_upperCase, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("};");
        _builder.newLine();
      }
    }
    {
      DataBinding _databinding_7 = activity.getDatabinding();
      boolean _notEquals_2 = (!Objects.equal(_databinding_7, null));
      if (_notEquals_2) {
        _builder.append("protected Cursor mCursor;");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateFields(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _generateFields((Activity)activity);
    } else if (activity instanceof ListActivity) {
      return _generateFields((ListActivity)activity);
    } else if (activity != null) {
      return _generateFields(activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
  
  public CharSequence viewFields(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _viewFields((Activity)activity);
    } else if (activity != null) {
      return _viewFields(activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
}
