package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.Attribute;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.PropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViewAttributeGenerator {
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  public StringConcatenation generateAttributes(final View view) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = view.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("android:id=\"@+id/");
        String _name_1 = view.getName();
        _builder.append(_name_1, "");
        _builder.append("\" ");
        _builder.newLineIfNotEmpty();
        _builder.append("android:name=\"");
        String _name_2 = view.getName();
        _builder.append(_name_2, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      LayoutStyle _layoutStyle = view.getLayoutStyle();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_layoutStyle, null);
      if (_operator_notEquals) {
        LayoutStyle _layoutStyle_1 = view.getLayoutStyle();
        StringConcatenation _generate = this._propertyValueGenerator.generate(_layoutStyle_1);
        String _string = _generate.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.newLineIfNotEmpty();
      }
    }
    StringConcatenation _specificAttributes = this.specificAttributes(view);
    _builder.append(_specificAttributes, "");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = view.getAttributes();
      boolean _isEmpty = _attributes.isEmpty();
      boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not_1) {
        {
          EList<Attribute> _attributes_1 = view.getAttributes();
          for(final Attribute attr : _attributes_1) {
            _builder.append("android:");
            String _name_3 = attr.getName();
            _builder.append(_name_3, "");
            _builder.append("=\"");
            PropertyValue _value = attr.getValue();
            Object _generateValue = this._propertyValueGenerator.generateValue(_value);
            String _string_1 = _generateValue.toString();
            String _trim_1 = _string_1.trim();
            _builder.append(_trim_1, "");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final View view) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final Button view) {
    StringConcatenation _builder = new StringConcatenation();
    {
      StringPropertyValue _text = view.getText();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_text, null);
      if (_operator_notEquals) {
        _builder.append("android:text=\"");
        StringPropertyValue _text_1 = view.getText();
        Object _generateValue = this._propertyValueGenerator.generateValue(_text_1);
        _builder.append(_generateValue, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final EditText view) {
    StringConcatenation _builder = new StringConcatenation();
    {
      StringPropertyValue _text = view.getText();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_text, null);
      if (_operator_notEquals) {
        _builder.append("android:text=\"");
        StringPropertyValue _text_1 = view.getText();
        Object _generateValue = this._propertyValueGenerator.generateValue(_text_1);
        _builder.append(_generateValue, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final TextView view) {
    StringConcatenation _builder = new StringConcatenation();
    {
      StringPropertyValue _text = view.getText();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_text, null);
      if (_operator_notEquals) {
        _builder.append("android:text=\"");
        StringPropertyValue _text_1 = view.getText();
        Object _generateValue = this._propertyValueGenerator.generateValue(_text_1);
        _builder.append(_generateValue, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation specificAttributes(final View view) {
    if (view instanceof Button) {
      return _specificAttributes((Button)view);
    } else if (view instanceof EditText) {
      return _specificAttributes((EditText)view);
    } else if (view instanceof TextView) {
      return _specificAttributes((TextView)view);
    } else {
      return _specificAttributes(view);
    }
  }
}
