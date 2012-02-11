package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.layout.LayoutPropertiesGenerator;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.gen.layout.ViewPropertiesGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GridView;
import hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HintAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ImageView;
import hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.RadioGroup;
import hu.bme.mit.androtext.lang.androTextDsl.RatingBar;
import hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.Spinner;
import hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout;
import hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement;
import hu.bme.mit.androtext.lang.androTextDsl.WebView;
import hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViewAttributeGenerator {
  @Inject
  private LayoutPropertiesGenerator _layoutPropertiesGenerator;
  
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  @Inject
  private ViewPropertiesGenerator _viewPropertiesGenerator;
  
  public StringConcatenation attributes(final View view) {
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
    {
      LayoutProperties _layoutProperties = view.getLayoutProperties();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_layoutProperties, null);
      if (_operator_notEquals_1) {
        LayoutProperties _layoutProperties_1 = view.getLayoutProperties();
        StringConcatenation _generate_1 = this._layoutPropertiesGenerator.generate(_layoutProperties_1);
        String _string_1 = _generate_1.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    StringConcatenation _specificAttributes = this.specificAttributes(view);
    _builder.append(_specificAttributes, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final View view) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final ViewElement view) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final LinearLayout linearLayout) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isVertical = linearLayout.isVertical();
      if (_isVertical) {
        _builder.append("android:orientation=\"vertical\"");
        _builder.newLine();
      } else {
        _builder.append("android:orientation=\"horizontal\"");
        _builder.newLine();
      }
    }
    GravityAttribute _gravity = linearLayout.getGravity();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_gravity);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final TableLayout layout) {
    StringConcatenation _builder = new StringConcatenation();
    CollapseColumnsAttribute _collapseColumnsAttribute = layout.getCollapseColumnsAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_collapseColumnsAttribute);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    ShrinkColumnsAttribute _shrinkColumnsAttribute = layout.getShrinkColumnsAttribute();
    StringConcatenation _generate_1 = this._viewPropertiesGenerator.generate(_shrinkColumnsAttribute);
    _builder.append(_generate_1, "");
    _builder.newLineIfNotEmpty();
    StretchColumnsAttribute _stretchColumnsAttribute = layout.getStretchColumnsAttribute();
    StringConcatenation _generate_2 = this._viewPropertiesGenerator.generate(_stretchColumnsAttribute);
    _builder.append(_generate_2, "");
    _builder.newLineIfNotEmpty();
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
        StringConcatenation _stringValue = this._propertyValueGenerator.stringValue(_text_1);
        String _string = _stringValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    BackgroundAttribute _backgroundAttribute = view.getBackgroundAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_backgroundAttribute);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    ClickableAttribute _clickableAttribute = view.getClickableAttribute();
    StringConcatenation _generate_1 = this._viewPropertiesGenerator.generate(_clickableAttribute);
    _builder.append(_generate_1, "");
    _builder.newLineIfNotEmpty();
    HeightAttribute _heightAttribute = view.getHeightAttribute();
    StringConcatenation _generate_2 = this._viewPropertiesGenerator.generate(_heightAttribute);
    _builder.append(_generate_2, "");
    _builder.newLineIfNotEmpty();
    HintAttribute _hintAttribute = view.getHintAttribute();
    StringConcatenation _generate_3 = this._viewPropertiesGenerator.generate(_hintAttribute);
    _builder.append(_generate_3, "");
    _builder.newLineIfNotEmpty();
    WidthAttribute _widthAttribute = view.getWidthAttribute();
    StringConcatenation _generate_4 = this._viewPropertiesGenerator.generate(_widthAttribute);
    _builder.append(_generate_4, "");
    _builder.newLineIfNotEmpty();
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
        StringConcatenation _stringValue = this._propertyValueGenerator.stringValue(_text_1);
        String _string = _stringValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    AutoLinkAttribute _autoLinkAttribute = view.getAutoLinkAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_autoLinkAttribute);
    _builder.append(_generate, "		");
    _builder.newLineIfNotEmpty();
    AutoTextAttribute _autoTextAttribute = view.getAutoTextAttribute();
    StringConcatenation _generate_1 = this._viewPropertiesGenerator.generate(_autoTextAttribute);
    _builder.append(_generate_1, "");
    _builder.newLineIfNotEmpty();
    BackgroundAttribute _backgroundAttribute = view.getBackgroundAttribute();
    StringConcatenation _generate_2 = this._viewPropertiesGenerator.generate(_backgroundAttribute);
    _builder.append(_generate_2, "");
    _builder.newLineIfNotEmpty();
    CapitalizeAttribute _capitalizeAttribute = view.getCapitalizeAttribute();
    StringConcatenation _generate_3 = this._viewPropertiesGenerator.generate(_capitalizeAttribute);
    _builder.append(_generate_3, "");
    _builder.newLineIfNotEmpty();
    ClickableAttribute _clickableAttribute = view.getClickableAttribute();
    StringConcatenation _generate_4 = this._viewPropertiesGenerator.generate(_clickableAttribute);
    _builder.append(_generate_4, "");
    _builder.newLineIfNotEmpty();
    DigitsAttribute _digitsAttribute = view.getDigitsAttribute();
    StringConcatenation _generate_5 = this._viewPropertiesGenerator.generate(_digitsAttribute);
    _builder.append(_generate_5, "");
    _builder.newLineIfNotEmpty();
    EditableAttribute _editableAttribute = view.getEditableAttribute();
    StringConcatenation _generate_6 = this._viewPropertiesGenerator.generate(_editableAttribute);
    _builder.append(_generate_6, "");
    _builder.newLineIfNotEmpty();
    FadeScrollBarsAttribute _fadeScrollBarsAttribute = view.getFadeScrollBarsAttribute();
    StringConcatenation _generate_7 = this._viewPropertiesGenerator.generate(_fadeScrollBarsAttribute);
    _builder.append(_generate_7, "");
    _builder.newLineIfNotEmpty();
    GravityAttribute _gravityAttribute = view.getGravityAttribute();
    StringConcatenation _generate_8 = this._viewPropertiesGenerator.generate(_gravityAttribute);
    _builder.append(_generate_8, "");
    _builder.newLineIfNotEmpty();
    HeightAttribute _heightAttribute = view.getHeightAttribute();
    StringConcatenation _generate_9 = this._viewPropertiesGenerator.generate(_heightAttribute);
    _builder.append(_generate_9, "");
    _builder.newLineIfNotEmpty();
    HintAttribute _hintAttribute = view.getHintAttribute();
    StringConcatenation _generate_10 = this._viewPropertiesGenerator.generate(_hintAttribute);
    _builder.append(_generate_10, "");
    _builder.newLineIfNotEmpty();
    IsScrollContainerAttribute _isScrollContainerAttribute = view.getIsScrollContainerAttribute();
    StringConcatenation _generate_11 = this._viewPropertiesGenerator.generate(_isScrollContainerAttribute);
    _builder.append(_generate_11, "");
    _builder.newLineIfNotEmpty();
    NumericAttribute _numericAttribute = view.getNumericAttribute();
    StringConcatenation _generate_12 = this._viewPropertiesGenerator.generate(_numericAttribute);
    _builder.append(_generate_12, "");
    _builder.newLineIfNotEmpty();
    PaddingAttribute _paddingAttribute = view.getPaddingAttribute();
    StringConcatenation _generate_13 = this._viewPropertiesGenerator.generate(_paddingAttribute);
    _builder.append(_generate_13, "");
    _builder.newLineIfNotEmpty();
    PasswordAttribute _passwordAttribute = view.getPasswordAttribute();
    StringConcatenation _generate_14 = this._viewPropertiesGenerator.generate(_passwordAttribute);
    _builder.append(_generate_14, "");
    _builder.newLineIfNotEmpty();
    PhoneNumberAttribute _phoneNumberAttribute = view.getPhoneNumberAttribute();
    StringConcatenation _generate_15 = this._viewPropertiesGenerator.generate(_phoneNumberAttribute);
    _builder.append(_generate_15, "");
    _builder.newLineIfNotEmpty();
    SingleLineAttribute _singleLineAttribute = view.getSingleLineAttribute();
    StringConcatenation _generate_16 = this._viewPropertiesGenerator.generate(_singleLineAttribute);
    _builder.append(_generate_16, "");
    _builder.newLineIfNotEmpty();
    TextColorAttribute _textColorAttribute = view.getTextColorAttribute();
    StringConcatenation _generate_17 = this._viewPropertiesGenerator.generate(_textColorAttribute);
    _builder.append(_generate_17, "");
    _builder.newLineIfNotEmpty();
    TextSizeAttribute _textSizeAttribute = view.getTextSizeAttribute();
    StringConcatenation _generate_18 = this._viewPropertiesGenerator.generate(_textSizeAttribute);
    _builder.append(_generate_18, "");
    _builder.newLineIfNotEmpty();
    TextStyleAttribute _textStyleAttribute = view.getTextStyleAttribute();
    StringConcatenation _generate_19 = this._viewPropertiesGenerator.generate(_textStyleAttribute);
    _builder.append(_generate_19, "");
    _builder.newLineIfNotEmpty();
    TypefaceAttribute _typefaceAttribute = view.getTypefaceAttribute();
    StringConcatenation _generate_20 = this._viewPropertiesGenerator.generate(_typefaceAttribute);
    _builder.append(_generate_20, "");
    _builder.newLineIfNotEmpty();
    WidthAttribute _widthAttribute = view.getWidthAttribute();
    StringConcatenation _generate_21 = this._viewPropertiesGenerator.generate(_widthAttribute);
    _builder.append(_generate_21, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final GridView view) {
    StringConcatenation _builder = new StringConcatenation();
    ColumnWidthAttribute _columnWidthAttribute = view.getColumnWidthAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_columnWidthAttribute);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    GravityAttribute _gravityAttribute = view.getGravityAttribute();
    StringConcatenation _generate_1 = this._viewPropertiesGenerator.generate(_gravityAttribute);
    _builder.append(_generate_1, "");
    _builder.newLineIfNotEmpty();
    HorizontalSpacingAttribute _horizontalSpacingAttribute = view.getHorizontalSpacingAttribute();
    StringConcatenation _generate_2 = this._viewPropertiesGenerator.generate(_horizontalSpacingAttribute);
    _builder.append(_generate_2, "");
    _builder.newLineIfNotEmpty();
    NumColumnsAttribute _numColumnsAttribute = view.getNumColumnsAttribute();
    StringConcatenation _generate_3 = this._viewPropertiesGenerator.generate(_numColumnsAttribute);
    _builder.append(_generate_3, "");
    _builder.newLineIfNotEmpty();
    StretchModeAttribute _stretchModeAttribute = view.getStretchModeAttribute();
    StringConcatenation _generate_4 = this._viewPropertiesGenerator.generate(_stretchModeAttribute);
    _builder.append(_generate_4, "");
    _builder.newLineIfNotEmpty();
    VerticalSpacingAttribute _verticalSpacingAttribute = view.getVerticalSpacingAttribute();
    StringConcatenation _generate_5 = this._viewPropertiesGenerator.generate(_verticalSpacingAttribute);
    _builder.append(_generate_5, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final ImageView view) {
    StringConcatenation _builder = new StringConcatenation();
    BackgroundAttribute _backgroundAttribute = view.getBackgroundAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_backgroundAttribute);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    ClickableAttribute _clickableAttribute = view.getClickableAttribute();
    StringConcatenation _generate_1 = this._viewPropertiesGenerator.generate(_clickableAttribute);
    _builder.append(_generate_1, "");
    _builder.newLineIfNotEmpty();
    FadeScrollBarsAttribute _fadeScrollBarsAttribute = view.getFadeScrollBarsAttribute();
    StringConcatenation _generate_2 = this._viewPropertiesGenerator.generate(_fadeScrollBarsAttribute);
    _builder.append(_generate_2, "");
    _builder.newLineIfNotEmpty();
    HeightAttribute _heightAttribute = view.getHeightAttribute();
    StringConcatenation _generate_3 = this._viewPropertiesGenerator.generate(_heightAttribute);
    _builder.append(_generate_3, "");
    _builder.newLineIfNotEmpty();
    IsScrollContainerAttribute _isScrollContainerAttribute = view.getIsScrollContainerAttribute();
    StringConcatenation _generate_4 = this._viewPropertiesGenerator.generate(_isScrollContainerAttribute);
    _builder.append(_generate_4, "");
    _builder.newLineIfNotEmpty();
    WidthAttribute _widthAttribute = view.getWidthAttribute();
    StringConcatenation _generate_5 = this._viewPropertiesGenerator.generate(_widthAttribute);
    _builder.append(_generate_5, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final ListView view) {
    StringConcatenation _builder = new StringConcatenation();
    EntriesAttribute _entriesAttribute = view.getEntriesAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_entriesAttribute);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final RadioGroup view) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final RatingBar view) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final Spinner view) {
    StringConcatenation _builder = new StringConcatenation();
    BackgroundAttribute _backgroundAttribute = view.getBackgroundAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_backgroundAttribute);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    ClickableAttribute _clickableAttribute = view.getClickableAttribute();
    StringConcatenation _generate_1 = this._viewPropertiesGenerator.generate(_clickableAttribute);
    _builder.append(_generate_1, "");
    _builder.newLineIfNotEmpty();
    EntriesAttribute _entriesAttribute = view.getEntriesAttribute();
    StringConcatenation _generate_2 = this._viewPropertiesGenerator.generate(_entriesAttribute);
    _builder.append(_generate_2, "");
    _builder.newLineIfNotEmpty();
    FadeScrollBarsAttribute _fadeScrollBarsAttribute = view.getFadeScrollBarsAttribute();
    StringConcatenation _generate_3 = this._viewPropertiesGenerator.generate(_fadeScrollBarsAttribute);
    _builder.append(_generate_3, "");
    _builder.newLineIfNotEmpty();
    HeightAttribute _heightAttribute = view.getHeightAttribute();
    StringConcatenation _generate_4 = this._viewPropertiesGenerator.generate(_heightAttribute);
    _builder.append(_generate_4, "");
    _builder.newLineIfNotEmpty();
    IsScrollContainerAttribute _isScrollContainerAttribute = view.getIsScrollContainerAttribute();
    StringConcatenation _generate_5 = this._viewPropertiesGenerator.generate(_isScrollContainerAttribute);
    _builder.append(_generate_5, "");
    _builder.newLineIfNotEmpty();
    WidthAttribute _widthAttribute = view.getWidthAttribute();
    StringConcatenation _generate_6 = this._viewPropertiesGenerator.generate(_widthAttribute);
    _builder.append(_generate_6, "");
    _builder.newLineIfNotEmpty();
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
        StringConcatenation _stringValue = this._propertyValueGenerator.stringValue(_text_1);
        String _string = _stringValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    AutoLinkAttribute _autoLinkAttribute = view.getAutoLinkAttribute();
    StringConcatenation _generate = this._viewPropertiesGenerator.generate(_autoLinkAttribute);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    AutoTextAttribute _autoTextAttribute = view.getAutoTextAttribute();
    StringConcatenation _generate_1 = this._viewPropertiesGenerator.generate(_autoTextAttribute);
    _builder.append(_generate_1, "");
    _builder.newLineIfNotEmpty();
    BackgroundAttribute _backgroundAttribute = view.getBackgroundAttribute();
    StringConcatenation _generate_2 = this._viewPropertiesGenerator.generate(_backgroundAttribute);
    _builder.append(_generate_2, "");
    _builder.newLineIfNotEmpty();
    CapitalizeAttribute _capitalizeAttribute = view.getCapitalizeAttribute();
    StringConcatenation _generate_3 = this._viewPropertiesGenerator.generate(_capitalizeAttribute);
    _builder.append(_generate_3, "");
    _builder.newLineIfNotEmpty();
    ClickableAttribute _clickableAttribute = view.getClickableAttribute();
    StringConcatenation _generate_4 = this._viewPropertiesGenerator.generate(_clickableAttribute);
    _builder.append(_generate_4, "");
    _builder.newLineIfNotEmpty();
    DigitsAttribute _digitsAttribute = view.getDigitsAttribute();
    StringConcatenation _generate_5 = this._viewPropertiesGenerator.generate(_digitsAttribute);
    _builder.append(_generate_5, "");
    _builder.newLineIfNotEmpty();
    EditableAttribute _editableAttribute = view.getEditableAttribute();
    StringConcatenation _generate_6 = this._viewPropertiesGenerator.generate(_editableAttribute);
    _builder.append(_generate_6, "");
    _builder.newLineIfNotEmpty();
    FadeScrollBarsAttribute _fadeScrollBarsAttribute = view.getFadeScrollBarsAttribute();
    StringConcatenation _generate_7 = this._viewPropertiesGenerator.generate(_fadeScrollBarsAttribute);
    _builder.append(_generate_7, "");
    _builder.newLineIfNotEmpty();
    GravityAttribute _gravityAttribute = view.getGravityAttribute();
    StringConcatenation _generate_8 = this._viewPropertiesGenerator.generate(_gravityAttribute);
    _builder.append(_generate_8, "");
    _builder.newLineIfNotEmpty();
    HeightAttribute _heightAttribute = view.getHeightAttribute();
    StringConcatenation _generate_9 = this._viewPropertiesGenerator.generate(_heightAttribute);
    _builder.append(_generate_9, "");
    _builder.newLineIfNotEmpty();
    HintAttribute _hintAttribute = view.getHintAttribute();
    StringConcatenation _generate_10 = this._viewPropertiesGenerator.generate(_hintAttribute);
    _builder.append(_generate_10, "");
    _builder.newLineIfNotEmpty();
    IsScrollContainerAttribute _isScrollContainerAttribute = view.getIsScrollContainerAttribute();
    StringConcatenation _generate_11 = this._viewPropertiesGenerator.generate(_isScrollContainerAttribute);
    _builder.append(_generate_11, "");
    _builder.newLineIfNotEmpty();
    NumericAttribute _numericAttribute = view.getNumericAttribute();
    StringConcatenation _generate_12 = this._viewPropertiesGenerator.generate(_numericAttribute);
    _builder.append(_generate_12, "");
    _builder.newLineIfNotEmpty();
    PaddingAttribute _paddingAttribute = view.getPaddingAttribute();
    StringConcatenation _generate_13 = this._viewPropertiesGenerator.generate(_paddingAttribute);
    _builder.append(_generate_13, "");
    _builder.newLineIfNotEmpty();
    PasswordAttribute _passwordAttribute = view.getPasswordAttribute();
    StringConcatenation _generate_14 = this._viewPropertiesGenerator.generate(_passwordAttribute);
    _builder.append(_generate_14, "");
    _builder.newLineIfNotEmpty();
    PhoneNumberAttribute _phoneNumberAttribute = view.getPhoneNumberAttribute();
    StringConcatenation _generate_15 = this._viewPropertiesGenerator.generate(_phoneNumberAttribute);
    _builder.append(_generate_15, "");
    _builder.newLineIfNotEmpty();
    SingleLineAttribute _singleLineAttribute = view.getSingleLineAttribute();
    StringConcatenation _generate_16 = this._viewPropertiesGenerator.generate(_singleLineAttribute);
    _builder.append(_generate_16, "");
    _builder.newLineIfNotEmpty();
    TextColorAttribute _textColorAttribute = view.getTextColorAttribute();
    StringConcatenation _generate_17 = this._viewPropertiesGenerator.generate(_textColorAttribute);
    _builder.append(_generate_17, "");
    _builder.newLineIfNotEmpty();
    TextSizeAttribute _textSizeAttribute = view.getTextSizeAttribute();
    StringConcatenation _generate_18 = this._viewPropertiesGenerator.generate(_textSizeAttribute);
    _builder.append(_generate_18, "");
    _builder.newLineIfNotEmpty();
    TextStyleAttribute _textStyleAttribute = view.getTextStyleAttribute();
    StringConcatenation _generate_19 = this._viewPropertiesGenerator.generate(_textStyleAttribute);
    _builder.append(_generate_19, "");
    _builder.newLineIfNotEmpty();
    TypefaceAttribute _typefaceAttribute = view.getTypefaceAttribute();
    StringConcatenation _generate_20 = this._viewPropertiesGenerator.generate(_typefaceAttribute);
    _builder.append(_generate_20, "");
    _builder.newLineIfNotEmpty();
    WidthAttribute _widthAttribute = view.getWidthAttribute();
    StringConcatenation _generate_21 = this._viewPropertiesGenerator.generate(_widthAttribute);
    _builder.append(_generate_21, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final ToggleButton view) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _specificAttributes(final WebView view) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public StringConcatenation specificAttributes(final View view) {
    if (view instanceof Button) {
      return _specificAttributes((Button)view);
    } else if (view instanceof EditText) {
      return _specificAttributes((EditText)view);
    } else if (view instanceof GridView) {
      return _specificAttributes((GridView)view);
    } else if (view instanceof ImageView) {
      return _specificAttributes((ImageView)view);
    } else if (view instanceof LinearLayout) {
      return _specificAttributes((LinearLayout)view);
    } else if (view instanceof ListView) {
      return _specificAttributes((ListView)view);
    } else if (view instanceof RadioGroup) {
      return _specificAttributes((RadioGroup)view);
    } else if (view instanceof RatingBar) {
      return _specificAttributes((RatingBar)view);
    } else if (view instanceof Spinner) {
      return _specificAttributes((Spinner)view);
    } else if (view instanceof TableLayout) {
      return _specificAttributes((TableLayout)view);
    } else if (view instanceof TextView) {
      return _specificAttributes((TextView)view);
    } else if (view instanceof ToggleButton) {
      return _specificAttributes((ToggleButton)view);
    } else if (view instanceof ViewElement) {
      return _specificAttributes((ViewElement)view);
    } else if (view instanceof WebView) {
      return _specificAttributes((WebView)view);
    } else {
      return _specificAttributes(view);
    }
  }
}
