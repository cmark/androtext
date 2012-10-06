package hu.bme.mit.androtext.gen.layout;

import com.google.common.base.Objects;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkEnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeEnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind;
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResource;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionValue;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.EnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind;
import hu.bme.mit.androtext.lang.androTextDsl.GravityEnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.GravityKind;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.Linkable;
import hu.bme.mit.androtext.lang.androTextDsl.LinkableLink;
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.NumericEnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.NumericKind;
import hu.bme.mit.androtext.lang.androTextDsl.PropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.Resource;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeEnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.StringResource;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleEnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceEnumerationPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PropertyValueGenerator {
  protected Object _generateValue(final PropertyValue value) {
    return null;
  }
  
  protected Object _generateValue(final LinkableLink link) {
    Linkable _link = link.getLink();
    String _generateLinkable = this.generateLinkable(_link);
    return _generateLinkable;
  }
  
  protected String _generateLinkable(final Resource resource) {
    String _type = this.type(resource);
    String _plus = ("@" + _type);
    String _plus_1 = (_plus + "/");
    String _name = resource.getName();
    String _plus_2 = (_plus_1 + _name);
    return _plus_2;
  }
  
  public String type(final Resource resource) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (resource instanceof ArrayResource) {
        final ArrayResource _arrayResource = (ArrayResource)resource;
        _matched=true;
        _switchResult = "array";
      }
    }
    if (!_matched) {
      if (resource instanceof BooleanResource) {
        final BooleanResource _booleanResource = (BooleanResource)resource;
        _matched=true;
        _switchResult = "bool";
      }
    }
    if (!_matched) {
      if (resource instanceof StringResource) {
        final StringResource _stringResource = (StringResource)resource;
        _matched=true;
        _switchResult = "string";
      }
    }
    if (!_matched) {
      if (resource instanceof ColorResource) {
        final ColorResource _colorResource = (ColorResource)resource;
        _matched=true;
        _switchResult = "color";
      }
    }
    if (!_matched) {
      if (resource instanceof DrawableResource) {
        final DrawableResource _drawableResource = (DrawableResource)resource;
        _matched=true;
        _switchResult = "drawable";
      }
    }
    if (!_matched) {
      if (resource instanceof DimensionResource) {
        final DimensionResource _dimensionResource = (DimensionResource)resource;
        _matched=true;
        _switchResult = "dimen";
      }
    }
    return _switchResult;
  }
  
  protected String _generateLinkable(final View view) {
    String _name = view.getName();
    String _plus = ("@id/" + _name);
    return _plus;
  }
  
  protected Object _generateValue(final BooleanPropertyValue value) {
    boolean _isValue = value.isValue();
    return _isValue;
  }
  
  protected Object _generateValue(final IntegerPropertyValue value) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Integer> _values = value.getValues();
      boolean _hasElements = false;
      for(final Integer v : _values) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(v, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected Object _generateValue(final StringPropertyValue value) {
    String _value = value.getValue();
    return _value;
  }
  
  protected Object _generateValue(final AnyDrawablePropertyValue value) {
    return null;
  }
  
  protected Object _generateValue(final ColorPropertyValue value) {
    String _value = value.getValue();
    return _value;
  }
  
  protected Object _generateValue(final ExternalDrawableResourceLink valueLink) {
    AndroidDrawableResource _externalResource = valueLink.getExternalResource();
    String _name = _externalResource.name();
    String _lowerCase = _name.toLowerCase();
    String _plus = ("@android:drawable/" + _lowerCase);
    return _plus;
  }
  
  protected Object _generateValue(final LayoutDimensionPropertyValue value) {
    LayoutDimensionKind _value = value.getValue();
    String _layoutDimensionKind = this.layoutDimensionKind(_value);
    return _layoutDimensionKind;
  }
  
  protected Object _generateValue(final DimensionPropertyValue dimensionPropertyValue) {
    DimensionValue _value = dimensionPropertyValue.getValue();
    float _value_1 = _value.getValue();
    String _plus = ("" + Float.valueOf(_value_1));
    DimensionValue _value_2 = dimensionPropertyValue.getValue();
    DimensionMetric _metric = _value_2.getMetric();
    String _string = _metric.toString();
    String _plus_1 = (_plus + _string);
    return _plus_1;
  }
  
  protected Object _generateValue(final NumColumnsPropertyValue value) {
    String _xifexpression = null;
    boolean _isAutofit = value.isAutofit();
    if (_isAutofit) {
      return "auto_fit";
    } else {
      IntegerPropertyValue _numColumns = value.getNumColumns();
      String _plus = ("" + _numColumns);
      _xifexpression = _plus;
    }
    return _xifexpression;
  }
  
  protected Object _generateValue(final EnumerationPropertyValue value) {
    return null;
  }
  
  protected Object _generateValue(final AutoLinkEnumerationPropertyValue value) {
    EList<AutoLinkKind> _values = value.getValues();
    boolean _contains = _values.contains(AutoLinkKind.ALL);
    if (_contains) {
      return "all";
    } else {
      EList<AutoLinkKind> _values_1 = value.getValues();
      CharSequence _generateEnumList = this.generateEnumList(_values_1);
      String _string = _generateEnumList.toString();
      return _string.trim();
    }
  }
  
  protected Object _generateValue(final CapitalizeEnumerationPropertyValue value) {
    CapitalizeKind _value = value.getValue();
    return _value;
  }
  
  protected Object _generateValue(final GravityEnumerationPropertyValue value) {
    EList<GravityKind> _values = value.getValues();
    CharSequence _generateEnumList = this.generateEnumList(_values);
    String _string = _generateEnumList.toString();
    return _string.trim();
  }
  
  protected Object _generateValue(final NumericEnumerationPropertyValue value) {
    EList<NumericKind> _values = value.getValues();
    CharSequence _generateEnumList = this.generateEnumList(_values);
    String _string = _generateEnumList.toString();
    return _string.trim();
  }
  
  protected Object _generateValue(final StretchModeEnumerationPropertyValue value) {
    StretchModeKind _value = value.getValue();
    return _value;
  }
  
  protected Object _generateValue(final TextStyleEnumerationPropertyValue value) {
    EList<TextStyleKind> _values = value.getValues();
    CharSequence _generateEnumList = this.generateEnumList(_values);
    String _string = _generateEnumList.toString();
    return _string.trim();
  }
  
  protected Object _generateValue(final TypefaceEnumerationPropertyValue value) {
    TypefaceKind _value = value.getValue();
    return _value;
  }
  
  public CharSequence generateEnumList(final EList<? extends Object> list) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final Object e : list) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("|", "");
        }
        _builder.append(e, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generate(final LayoutStyle style) {
    FastLayoutDimensionKind _value = style.getValue();
    CharSequence _layoutDimensionKind = this.layoutDimensionKind(_value);
    return _layoutDimensionKind;
  }
  
  public CharSequence layoutDimensionKind(final FastLayoutDimensionKind kind) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(kind,FastLayoutDimensionKind.FILL)) {
        _matched=true;
        CharSequence _fillLayout = this.fillLayout();
        _switchResult = _fillLayout;
      }
    }
    if (!_matched) {
      if (Objects.equal(kind,FastLayoutDimensionKind.WRAP)) {
        _matched=true;
        CharSequence _wrapLayout = this.wrapLayout();
        _switchResult = _wrapLayout;
      }
    }
    if (!_matched) {
      if (Objects.equal(kind,FastLayoutDimensionKind.FILL_WRAP)) {
        _matched=true;
        CharSequence _fillwrapLayout = this.fillwrapLayout();
        _switchResult = _fillwrapLayout;
      }
    }
    if (!_matched) {
      if (Objects.equal(kind,FastLayoutDimensionKind.WRAP_FILL)) {
        _matched=true;
        CharSequence _wrapfillLayout = this.wrapfillLayout();
        _switchResult = _wrapfillLayout;
      }
    }
    return _switchResult;
  }
  
  public String layoutDimensionKind(final LayoutDimensionKind style) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(style,LayoutDimensionKind.FILL)) {
        _matched=true;
        _switchResult = "fill_parent";
      }
    }
    if (!_matched) {
      if (Objects.equal(style,LayoutDimensionKind.WRAP)) {
        _matched=true;
        _switchResult = "wrap_content";
      }
    }
    if (!_matched) {
      if (Objects.equal(style,LayoutDimensionKind.MATCH)) {
        _matched=true;
        _switchResult = "match_parent";
      }
    }
    return _switchResult;
  }
  
  public CharSequence fillLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"fill_parent\"");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence wrapLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence fillwrapLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence wrapfillLayout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("android:layout_height=\"fill_parent\"");
    _builder.newLine();
    return _builder;
  }
  
  public Object generateValue(final PropertyValue value) {
    if (value instanceof AutoLinkEnumerationPropertyValue) {
      return _generateValue((AutoLinkEnumerationPropertyValue)value);
    } else if (value instanceof CapitalizeEnumerationPropertyValue) {
      return _generateValue((CapitalizeEnumerationPropertyValue)value);
    } else if (value instanceof ColorPropertyValue) {
      return _generateValue((ColorPropertyValue)value);
    } else if (value instanceof ExternalDrawableResourceLink) {
      return _generateValue((ExternalDrawableResourceLink)value);
    } else if (value instanceof GravityEnumerationPropertyValue) {
      return _generateValue((GravityEnumerationPropertyValue)value);
    } else if (value instanceof NumericEnumerationPropertyValue) {
      return _generateValue((NumericEnumerationPropertyValue)value);
    } else if (value instanceof StretchModeEnumerationPropertyValue) {
      return _generateValue((StretchModeEnumerationPropertyValue)value);
    } else if (value instanceof TextStyleEnumerationPropertyValue) {
      return _generateValue((TextStyleEnumerationPropertyValue)value);
    } else if (value instanceof TypefaceEnumerationPropertyValue) {
      return _generateValue((TypefaceEnumerationPropertyValue)value);
    } else if (value instanceof AnyDrawablePropertyValue) {
      return _generateValue((AnyDrawablePropertyValue)value);
    } else if (value instanceof BooleanPropertyValue) {
      return _generateValue((BooleanPropertyValue)value);
    } else if (value instanceof DimensionPropertyValue) {
      return _generateValue((DimensionPropertyValue)value);
    } else if (value instanceof EnumerationPropertyValue) {
      return _generateValue((EnumerationPropertyValue)value);
    } else if (value instanceof IntegerPropertyValue) {
      return _generateValue((IntegerPropertyValue)value);
    } else if (value instanceof LayoutDimensionPropertyValue) {
      return _generateValue((LayoutDimensionPropertyValue)value);
    } else if (value instanceof LinkableLink) {
      return _generateValue((LinkableLink)value);
    } else if (value instanceof NumColumnsPropertyValue) {
      return _generateValue((NumColumnsPropertyValue)value);
    } else if (value instanceof StringPropertyValue) {
      return _generateValue((StringPropertyValue)value);
    } else if (value != null) {
      return _generateValue(value);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(value).toString());
    }
  }
  
  public String generateLinkable(final Linkable resource) {
    if (resource instanceof Resource) {
      return _generateLinkable((Resource)resource);
    } else if (resource instanceof View) {
      return _generateLinkable((View)resource);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(resource).toString());
    }
  }
}
