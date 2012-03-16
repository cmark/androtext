package hu.bme.mit.androtext.gen.layout;

import hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResource;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionValue;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind;
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.StringResource;
import hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PropertyValueGenerator {
  protected StringConcatenation _booleanValue(final BooleanPropertyValue value) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = value.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _booleanValue(final BooleanResourceLink value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@bool/");
    BooleanResource _link = value.getLink();
    String _name = _link.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _integerValue(final IntegerPropertyValue value) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = value.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _integerValue(final IntegerResourceLink value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@integer/");
    IntegerResource _link = value.getLink();
    String _name = _link.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _stringValue(final StringPropertyValue value) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = value.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _stringValue(final StringResourceLink valueLink) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@string/");
    StringResource _link = valueLink.getLink();
    String _name = _link.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _backgroundValue(final AnyDrawablePropertyValue value) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _backgroundValue(final ColorPropertyValue value) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = value.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _backgroundValue(final ColorResourceLink valueLink) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@color/");
    ColorResource _link = valueLink.getLink();
    String _name = _link.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _backgroundValue(final DrawableResourceLink valueLink) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@drawable/");
    DrawableResource _link = valueLink.getLink();
    String _name = _link.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _backgroundValue(final ExternalDrawableResourceLink valueLink) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@android:drawable/");
    AndroidDrawableResource _externalResource = valueLink.getExternalResource();
    String _name = _externalResource.name();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String _dimensionValue(final LayoutDimensionPropertyValue value) {
    LayoutDimensionKind _constValue = value.getConstValue();
    String _layoutDimensionKind = this.layoutDimensionKind(_constValue);
    return _layoutDimensionKind;
  }
  
  protected String _dimensionValue(final DimensionPropertyValue dimensionPropertyValue) {
    DimensionValue _value = dimensionPropertyValue.getValue();
    float _value_1 = _value.getValue();
    String _operator_plus = StringExtensions.operator_plus("", ((Float)_value_1));
    DimensionValue _value_2 = dimensionPropertyValue.getValue();
    DimensionMetric _metric = _value_2.getMetric();
    String _string = _metric.toString();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _string);
    return _operator_plus_1;
  }
  
  protected String _dimensionValue(final DimensionResourceLink dimensionResourceLink) {
    DimensionResource _link = dimensionResourceLink.getLink();
    String _name = _link.getName();
    String _operator_plus = StringExtensions.operator_plus("@dimen/", _name);
    return _operator_plus;
  }
  
  protected StringConcatenation _generate(final LayoutStyle style) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final FastLayoutStyle style) {
    StringConcatenation _builder = new StringConcatenation();
    FastLayoutDimensionKind _value = style.getValue();
    StringConcatenation _layoutDimensionKind = this.layoutDimensionKind(_value);
    _builder.append(_layoutDimensionKind, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final RegularLayoutStyle style) {
    StringConcatenation _builder = new StringConcatenation();
    {
      LayoutDimensionPropertyValue _width = style.getWidth();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_width, null);
      if (_operator_notEquals) {
        _builder.append("android:layout_width=\"");
        LayoutDimensionPropertyValue _width_1 = style.getWidth();
        String _dimensionValue = this.dimensionValue(_width_1);
        _builder.append(_dimensionValue, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      LayoutDimensionPropertyValue _height = style.getHeight();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_height, null);
      if (_operator_notEquals_1) {
        _builder.append("android:layout_height=\"");
        LayoutDimensionPropertyValue _height_1 = style.getHeight();
        String _dimensionValue_1 = this.dimensionValue(_height_1);
        _builder.append(_dimensionValue_1, "");
        _builder.append("\"\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation layoutDimensionKind(final FastLayoutDimensionKind kind) {
    StringConcatenation _switchResult = null;
    final FastLayoutDimensionKind kind_1 = kind;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(kind_1,FastLayoutDimensionKind.FILL)) {
        matched=true;
        StringConcatenation _fillLayout = this.fillLayout();
        _switchResult = _fillLayout;
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(kind_1,FastLayoutDimensionKind.WRAP)) {
        matched=true;
        StringConcatenation _wrapLayout = this.wrapLayout();
        _switchResult = _wrapLayout;
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(kind_1,FastLayoutDimensionKind.FILL_WRAP)) {
        matched=true;
        StringConcatenation _fillwrapLayout = this.fillwrapLayout();
        _switchResult = _fillwrapLayout;
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(kind_1,FastLayoutDimensionKind.WRAP_FILL)) {
        matched=true;
        StringConcatenation _wrapfillLayout = this.wrapfillLayout();
        _switchResult = _wrapfillLayout;
      }
    }
    return _switchResult;
  }
  
  public String layoutDimensionKind(final LayoutDimensionKind style) {
    String _switchResult = null;
    final LayoutDimensionKind style_1 = style;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(style_1,LayoutDimensionKind.FILL)) {
        matched=true;
        _switchResult = "fill_parent";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(style_1,LayoutDimensionKind.WRAP)) {
        matched=true;
        _switchResult = "wrap_content";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(style_1,LayoutDimensionKind.MATCH)) {
        matched=true;
        _switchResult = "match_parent";
      }
    }
    return _switchResult;
  }
  
  public StringConcatenation fillLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"fill_parent\"");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation wrapLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation fillwrapLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation wrapfillLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"fill_parent\"");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation booleanValue(final BooleanPropertyValue value) {
    if (value instanceof BooleanResourceLink) {
      return _booleanValue((BooleanResourceLink)value);
    } else {
      return _booleanValue(value);
    }
  }
  
  public StringConcatenation integerValue(final IntegerPropertyValue value) {
    if (value instanceof IntegerResourceLink) {
      return _integerValue((IntegerResourceLink)value);
    } else {
      return _integerValue(value);
    }
  }
  
  public StringConcatenation stringValue(final StringPropertyValue valueLink) {
    if (valueLink instanceof StringResourceLink) {
      return _stringValue((StringResourceLink)valueLink);
    } else {
      return _stringValue(valueLink);
    }
  }
  
  public StringConcatenation backgroundValue(final AnyDrawablePropertyValue valueLink) {
    if (valueLink instanceof ColorResourceLink) {
      return _backgroundValue((ColorResourceLink)valueLink);
    } else if (valueLink instanceof ColorPropertyValue) {
      return _backgroundValue((ColorPropertyValue)valueLink);
    } else if (valueLink instanceof DrawableResourceLink) {
      return _backgroundValue((DrawableResourceLink)valueLink);
    } else if (valueLink instanceof ExternalDrawableResourceLink) {
      return _backgroundValue((ExternalDrawableResourceLink)valueLink);
    } else {
      return _backgroundValue(valueLink);
    }
  }
  
  public String dimensionValue(final LayoutDimensionPropertyValue dimensionResourceLink) {
    if (dimensionResourceLink instanceof DimensionResourceLink) {
      return _dimensionValue((DimensionResourceLink)dimensionResourceLink);
    } else if (dimensionResourceLink instanceof DimensionPropertyValue) {
      return _dimensionValue((DimensionPropertyValue)dimensionResourceLink);
    } else {
      return _dimensionValue(dimensionResourceLink);
    }
  }
  
  public StringConcatenation generate(final LayoutStyle style) {
    if (style instanceof FastLayoutStyle) {
      return _generate((FastLayoutStyle)style);
    } else if (style instanceof RegularLayoutStyle) {
      return _generate((RegularLayoutStyle)style);
    } else {
      return _generate(style);
    }
  }
}
