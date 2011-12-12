package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind;
import hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind;
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GravityKind;
import hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HintAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumericKind;
import hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind;
import hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViewPropertiesGenerator {
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  public StringConcatenation generate(final AutoLinkAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        {
          boolean _isAll = attribute.isAll();
          if (_isAll) {
            _builder.append("android:autoLink=\"all\"\t\t\t");
            _builder.newLine();
          } else {
            _builder.append("android:autoLink=\"");
            {
              EList<AutoLinkKind> _autoLinkMask = attribute.getAutoLinkMask();
              boolean hasAnyElements = false;
              for(final AutoLinkKind autoLink : _autoLinkMask) {
                if (!hasAnyElements) {
                  hasAnyElements = true;
                } else {
                  _builder.appendImmediate("|", "");
                }
                String _name = autoLink.name();
                String _lowerCase = _name.toLowerCase();
                _builder.append(_lowerCase, "");
              }
            }
            _builder.append("\"\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final AutoTextAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:autoText=\"");
        BooleanPropertyValue _autoText = attribute.getAutoText();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_autoText);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final BackgroundAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:background=\"");
        AnyDrawablePropertyValue _background = attribute.getBackground();
        StringConcatenation _backgroundValue = this._propertyValueGenerator.backgroundValue(_background);
        String _string = _backgroundValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final CapitalizeAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:capitalize=\"");
        CapitalizeKind _capitalize = attribute.getCapitalize();
        String _name = _capitalize.name();
        String _lowerCase = _name.toLowerCase();
        _builder.append(_lowerCase, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final ClickableAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:clickable=\"");
        BooleanPropertyValue _clickable = attribute.getClickable();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_clickable);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final CollapseColumnsAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:collapseColumns=\"");
        {
          EList<IntegerPropertyValue> _collapseColumns = attribute.getCollapseColumns();
          boolean hasAnyElements = false;
          for(final IntegerPropertyValue c : _collapseColumns) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            StringConcatenation _integerValue = this._propertyValueGenerator.integerValue(c);
            String _string = _integerValue.toString();
            String _trim = _string.trim();
            _builder.append(_trim, "");
          }
        }
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final ColumnWidthAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:columnWidth=\"");
        DimensionPropertyValue _columnWidth = attribute.getColumnWidth();
        StringConcatenation _dimensionValue = this._propertyValueGenerator.dimensionValue(_columnWidth);
        String _string = _dimensionValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final DigitsAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:digits=\"");
        StringPropertyValue _digits = attribute.getDigits();
        StringConcatenation _stringValue = this._propertyValueGenerator.stringValue(_digits);
        String _string = _stringValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final EditableAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:editable=\"");
        BooleanPropertyValue _editable = attribute.getEditable();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_editable);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final EntriesAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:entries=\"");
        ArrayResource _entries = attribute.getEntries();
        String _name = _entries.getName();
        _builder.append(_name, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final FadeScrollBarsAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:fadeScrollBars=\"");
        BooleanPropertyValue _fadeScrollBars = attribute.getFadeScrollBars();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_fadeScrollBars);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final GravityAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:gravity=\"");
        {
          EList<GravityKind> _gravity = attribute.getGravity();
          boolean hasAnyElements = false;
          for(final GravityKind g : _gravity) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate("|", "");
            }
            String _name = g.name();
            String _lowerCase = _name.toLowerCase();
            _builder.append(_lowerCase, "");
          }
        }
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final HeightAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:height=\"");
        DimensionPropertyValue _height = attribute.getHeight();
        StringConcatenation _dimensionValue = this._propertyValueGenerator.dimensionValue(_height);
        String _string = _dimensionValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final HintAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:hint=\"");
        StringPropertyValue _hint = attribute.getHint();
        StringConcatenation _stringValue = this._propertyValueGenerator.stringValue(_hint);
        String _string = _stringValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final HorizontalSpacingAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:horizontalSpacing=\"");
        DimensionPropertyValue _horizontalSpacing = attribute.getHorizontalSpacing();
        StringConcatenation _dimensionValue = this._propertyValueGenerator.dimensionValue(_horizontalSpacing);
        String _string = _dimensionValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final IsScrollContainerAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:isScrollContainer=\"");
        BooleanPropertyValue _isScrollContainer = attribute.getIsScrollContainer();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_isScrollContainer);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final NumColumnsAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        {
          boolean _isAutofit = attribute.isAutofit();
          if (_isAutofit) {
            _builder.append("android:numColumns=\"auto_fit\"");
            _builder.newLine();
          } else {
            IntegerPropertyValue _numColumns = attribute.getNumColumns();
            boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_numColumns, null);
            if (_operator_notEquals_1) {
              _builder.append("android:numColumns=\"");
              IntegerPropertyValue _numColumns_1 = attribute.getNumColumns();
              StringConcatenation _integerValue = this._propertyValueGenerator.integerValue(_numColumns_1);
              String _string = _integerValue.toString();
              String _trim = _string.trim();
              _builder.append(_trim, "");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final NumericAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:numeric=\"");
        {
          EList<NumericKind> _numeric = attribute.getNumeric();
          boolean hasAnyElements = false;
          for(final NumericKind n : _numeric) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate("|", "");
            }
            String _name = n.name();
            String _lowerCase = _name.toLowerCase();
            _builder.append(_lowerCase, "");
          }
        }
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final PaddingAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        DimensionPropertyValue _padding = attribute.getPadding();
        StringConcatenation _dimensionValue = this._propertyValueGenerator.dimensionValue(_padding);
        final StringConcatenation paddingValue = _dimensionValue;
        _builder.newLineIfNotEmpty();
        _builder.append("android:padding=\"");
        String _string = paddingValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final PasswordAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:password=\"");
        BooleanPropertyValue _password = attribute.getPassword();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_password);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final PhoneNumberAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:phoneNumber=\"");
        BooleanPropertyValue _phoneNumber = attribute.getPhoneNumber();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_phoneNumber);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final ShrinkColumnsAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:shrinkColumns=\"");
        {
          EList<IntegerPropertyValue> _shrinkColumns = attribute.getShrinkColumns();
          boolean hasAnyElements = false;
          for(final IntegerPropertyValue s : _shrinkColumns) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            StringConcatenation _integerValue = this._propertyValueGenerator.integerValue(s);
            String _string = _integerValue.toString();
            String _trim = _string.trim();
            _builder.append(_trim, "");
          }
        }
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final SingleLineAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:singleLine=\"");
        BooleanPropertyValue _singleLine = attribute.getSingleLine();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_singleLine);
        String _string = _booleanValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final StretchColumnsAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_and = false;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        EList<IntegerPropertyValue> _stretchColumns = attribute.getStretchColumns();
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_stretchColumns);
        boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
      }
      if (_operator_and) {
        _builder.append("android:stretchColumns=\"");
        {
          EList<IntegerPropertyValue> _stretchColumns_1 = attribute.getStretchColumns();
          boolean hasAnyElements = false;
          for(final IntegerPropertyValue s : _stretchColumns_1) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            StringConcatenation _integerValue = this._propertyValueGenerator.integerValue(s);
            String _string = _integerValue.toString();
            String _trim = _string.trim();
            _builder.append(_trim, "");
          }
        }
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final StretchModeAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:stretchMode=\"");
        StretchModeKind _stretchMode = attribute.getStretchMode();
        String _literal = _stretchMode.getLiteral();
        _builder.append(_literal, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final TextColorAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:textColor=\"");
        ColorPropertyValue _textColor = attribute.getTextColor();
        StringConcatenation _backgroundValue = this._propertyValueGenerator.backgroundValue(_textColor);
        String _string = _backgroundValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final TextSizeAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        DimensionPropertyValue _textSize = attribute.getTextSize();
        StringConcatenation _dimensionValue = this._propertyValueGenerator.dimensionValue(_textSize);
        final StringConcatenation testSizeValue = _dimensionValue;
        _builder.newLineIfNotEmpty();
        _builder.append("android:textSize=\"");
        String _string = testSizeValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final TextStyleAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:textStyle=\"");
        {
          EList<TextStyleKind> _textStyle = attribute.getTextStyle();
          boolean hasAnyElements = false;
          for(final TextStyleKind t : _textStyle) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate("|", "");
            }
            String _name = t.name();
            String _lowerCase = _name.toLowerCase();
            _builder.append(_lowerCase, "");
          }
        }
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final TypefaceAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:typeface=\"");
        TypefaceKind _typeface = attribute.getTypeface();
        String _name = _typeface.name();
        String _lowerCase = _name.toLowerCase();
        _builder.append(_lowerCase, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final VerticalSpacingAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:verticalSpacing=\"");
        DimensionPropertyValue _verticalSpacing = attribute.getVerticalSpacing();
        StringConcatenation _dimensionValue = this._propertyValueGenerator.dimensionValue(_verticalSpacing);
        String _string = _dimensionValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final WidthAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:width=\"");
        DimensionPropertyValue _width = attribute.getWidth();
        StringConcatenation _dimensionValue = this._propertyValueGenerator.dimensionValue(_width);
        String _string = _dimensionValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
