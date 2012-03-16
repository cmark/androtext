package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.AboveAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties;
import hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.WeightAttribute;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LayoutPropertiesGenerator {
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  public StringConcatenation generate(final LayoutProperties properties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      WeightAttribute _weightAttribute = properties.getWeightAttribute();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_weightAttribute, null);
      if (_operator_notEquals) {
        WeightAttribute _weightAttribute_1 = properties.getWeightAttribute();
        IntegerPropertyValue _weight = _weightAttribute_1.getWeight();
        StringConcatenation _integerValue = this._propertyValueGenerator.integerValue(_weight);
        final StringConcatenation weightValue = _integerValue;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_weight=\"");
        String _string = weightValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AboveAttribute _aboveAttribute = properties.getAboveAttribute();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_aboveAttribute, null);
      if (_operator_notEquals_1) {
        _builder.append("android:layout_above=\"@id/");
        AboveAttribute _aboveAttribute_1 = properties.getAboveAttribute();
        View _above = _aboveAttribute_1.getAbove();
        String _name = _above.getName();
        _builder.append(_name, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      BelowAttribute _belowAttribute = properties.getBelowAttribute();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_belowAttribute, null);
      if (_operator_notEquals_2) {
        _builder.append("android:layout_below=\"@id/");
        BelowAttribute _belowAttribute_1 = properties.getBelowAttribute();
        View _below = _belowAttribute_1.getBelow();
        String _name_1 = _below.getName();
        _builder.append(_name_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AlignBottomAttribute _alignBottomAttribute = properties.getAlignBottomAttribute();
      boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_alignBottomAttribute, null);
      if (_operator_notEquals_3) {
        _builder.append("android:layout_alignBottom=\"@id/");
        AlignBottomAttribute _alignBottomAttribute_1 = properties.getAlignBottomAttribute();
        View _alignBottom = _alignBottomAttribute_1.getAlignBottom();
        String _name_2 = _alignBottom.getName();
        _builder.append(_name_2, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AlignLeftAttribute _alignLeftAttribute = properties.getAlignLeftAttribute();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(_alignLeftAttribute, null);
      if (_operator_notEquals_4) {
        _builder.append("android:layout_alignLeft=\"@id/");
        AlignLeftAttribute _alignLeftAttribute_1 = properties.getAlignLeftAttribute();
        View _alignLeft = _alignLeftAttribute_1.getAlignLeft();
        String _name_3 = _alignLeft.getName();
        _builder.append(_name_3, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AlignTopAttribute _alignTopAttribute = properties.getAlignTopAttribute();
      boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(_alignTopAttribute, null);
      if (_operator_notEquals_5) {
        _builder.append("android:layout_alignTop=\"@id/");
        AlignTopAttribute _alignTopAttribute_1 = properties.getAlignTopAttribute();
        View _alignTop = _alignTopAttribute_1.getAlignTop();
        String _name_4 = _alignTop.getName();
        _builder.append(_name_4, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AlignParentLeftAttribute _alignParentLeftAttribute = properties.getAlignParentLeftAttribute();
      boolean _operator_notEquals_6 = ObjectExtensions.operator_notEquals(_alignParentLeftAttribute, null);
      if (_operator_notEquals_6) {
        AlignParentLeftAttribute _alignParentLeftAttribute_1 = properties.getAlignParentLeftAttribute();
        BooleanPropertyValue _alignParentLeft = _alignParentLeftAttribute_1.getAlignParentLeft();
        StringConcatenation _booleanValue = this._propertyValueGenerator.booleanValue(_alignParentLeft);
        final StringConcatenation aplValue = _booleanValue;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_alignParentLeft=\"");
        String _string_1 = aplValue.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AlignParentTopAttribute _alignParentTopAttribute = properties.getAlignParentTopAttribute();
      boolean _operator_notEquals_7 = ObjectExtensions.operator_notEquals(_alignParentTopAttribute, null);
      if (_operator_notEquals_7) {
        AlignParentTopAttribute _alignParentTopAttribute_1 = properties.getAlignParentTopAttribute();
        BooleanPropertyValue _alignParentTop = _alignParentTopAttribute_1.getAlignParentTop();
        StringConcatenation _booleanValue_1 = this._propertyValueGenerator.booleanValue(_alignParentTop);
        final StringConcatenation aptValue = _booleanValue_1;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_alignParentTop=\"");
        String _string_2 = aptValue.toString();
        String _trim_2 = _string_2.trim();
        _builder.append(_trim_2, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AlignParentRightAttribute _alignParentRightAttribute = properties.getAlignParentRightAttribute();
      boolean _operator_notEquals_8 = ObjectExtensions.operator_notEquals(_alignParentRightAttribute, null);
      if (_operator_notEquals_8) {
        AlignParentRightAttribute _alignParentRightAttribute_1 = properties.getAlignParentRightAttribute();
        BooleanPropertyValue _alignParentRight = _alignParentRightAttribute_1.getAlignParentRight();
        StringConcatenation _booleanValue_2 = this._propertyValueGenerator.booleanValue(_alignParentRight);
        final StringConcatenation aprValue = _booleanValue_2;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_alignParentRight=\"");
        String _string_3 = aprValue.toString();
        String _trim_3 = _string_3.trim();
        _builder.append(_trim_3, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AlignParentBottomAttribute _alignParentBottomAttribute = properties.getAlignParentBottomAttribute();
      boolean _operator_notEquals_9 = ObjectExtensions.operator_notEquals(_alignParentBottomAttribute, null);
      if (_operator_notEquals_9) {
        AlignParentBottomAttribute _alignParentBottomAttribute_1 = properties.getAlignParentBottomAttribute();
        BooleanPropertyValue _alignParentBottom = _alignParentBottomAttribute_1.getAlignParentBottom();
        StringConcatenation _booleanValue_3 = this._propertyValueGenerator.booleanValue(_alignParentBottom);
        final StringConcatenation apbValue = _booleanValue_3;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_alignParentBottom=\"");
        String _string_4 = apbValue.toString();
        String _trim_4 = _string_4.trim();
        _builder.append(_trim_4, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      ToLeftOfAttribute _leftOfAttribute = properties.getToLeftOfAttribute();
      boolean _operator_notEquals_10 = ObjectExtensions.operator_notEquals(_leftOfAttribute, null);
      if (_operator_notEquals_10) {
        _builder.append("android:layout_toLeftOf=\"@id/");
        ToLeftOfAttribute _leftOfAttribute_1 = properties.getToLeftOfAttribute();
        View _leftOf = _leftOfAttribute_1.getToLeftOf();
        String _name_5 = _leftOf.getName();
        _builder.append(_name_5, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      ToRightOfAttribute _rightOfAttribute = properties.getToRightOfAttribute();
      boolean _operator_notEquals_11 = ObjectExtensions.operator_notEquals(_rightOfAttribute, null);
      if (_operator_notEquals_11) {
        _builder.append("android:layout_toRightOf=\"@id/");
        ToRightOfAttribute _rightOfAttribute_1 = properties.getToRightOfAttribute();
        View _rightOf = _rightOfAttribute_1.getToRightOf();
        String _name_6 = _rightOf.getName();
        _builder.append(_name_6, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      CenterHorizontalAttribute _centerHorizontalAttribute = properties.getCenterHorizontalAttribute();
      boolean _operator_notEquals_12 = ObjectExtensions.operator_notEquals(_centerHorizontalAttribute, null);
      if (_operator_notEquals_12) {
        CenterHorizontalAttribute _centerHorizontalAttribute_1 = properties.getCenterHorizontalAttribute();
        BooleanPropertyValue _centerHorizontal = _centerHorizontalAttribute_1.getCenterHorizontal();
        StringConcatenation _booleanValue_4 = this._propertyValueGenerator.booleanValue(_centerHorizontal);
        final StringConcatenation chValue = _booleanValue_4;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_toLeftOf=\"@id/");
        String _string_5 = chValue.toString();
        String _trim_5 = _string_5.trim();
        _builder.append(_trim_5, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      CenterInParentAttribute _centerInParentAttribute = properties.getCenterInParentAttribute();
      boolean _operator_notEquals_13 = ObjectExtensions.operator_notEquals(_centerInParentAttribute, null);
      if (_operator_notEquals_13) {
        CenterInParentAttribute _centerInParentAttribute_1 = properties.getCenterInParentAttribute();
        BooleanPropertyValue _centerInParent = _centerInParentAttribute_1.getCenterInParent();
        StringConcatenation _booleanValue_5 = this._propertyValueGenerator.booleanValue(_centerInParent);
        final StringConcatenation cipValue = _booleanValue_5;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_toLeftOf=\"@id/");
        String _string_6 = cipValue.toString();
        String _trim_6 = _string_6.trim();
        _builder.append(_trim_6, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      CenterVerticalAttribute _centerVerticalAttribute = properties.getCenterVerticalAttribute();
      boolean _operator_notEquals_14 = ObjectExtensions.operator_notEquals(_centerVerticalAttribute, null);
      if (_operator_notEquals_14) {
        CenterVerticalAttribute _centerVerticalAttribute_1 = properties.getCenterVerticalAttribute();
        BooleanPropertyValue _centerVertical = _centerVerticalAttribute_1.getCenterVertical();
        StringConcatenation _booleanValue_6 = this._propertyValueGenerator.booleanValue(_centerVertical);
        final StringConcatenation cvValue = _booleanValue_6;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_toLeftOf=\"@id/");
        String _string_7 = cvValue.toString();
        String _trim_7 = _string_7.trim();
        _builder.append(_trim_7, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MarginLeftAttribute _marginLeftAttribute = properties.getMarginLeftAttribute();
      boolean _operator_notEquals_15 = ObjectExtensions.operator_notEquals(_marginLeftAttribute, null);
      if (_operator_notEquals_15) {
        MarginLeftAttribute _marginLeftAttribute_1 = properties.getMarginLeftAttribute();
        DimensionPropertyValue _marginLeft = _marginLeftAttribute_1.getMarginLeft();
        String _dimensionValue = this._propertyValueGenerator.dimensionValue(_marginLeft);
        final String marginValue = _dimensionValue;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_marginLeft=\"");
        String _string_8 = marginValue.toString();
        String _trim_8 = _string_8.trim();
        _builder.append(_trim_8, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MarginTopAttribute _marginTopAttribute = properties.getMarginTopAttribute();
      boolean _operator_notEquals_16 = ObjectExtensions.operator_notEquals(_marginTopAttribute, null);
      if (_operator_notEquals_16) {
        MarginTopAttribute _marginTopAttribute_1 = properties.getMarginTopAttribute();
        DimensionPropertyValue _marginTop = _marginTopAttribute_1.getMarginTop();
        String _dimensionValue_1 = this._propertyValueGenerator.dimensionValue(_marginTop);
        final String marginValue_1 = _dimensionValue_1;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_marginLeft=\"");
        String _string_9 = marginValue_1.toString();
        String _trim_9 = _string_9.trim();
        _builder.append(_trim_9, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MarginRightAttribute _marginRightAttribute = properties.getMarginRightAttribute();
      boolean _operator_notEquals_17 = ObjectExtensions.operator_notEquals(_marginRightAttribute, null);
      if (_operator_notEquals_17) {
        MarginRightAttribute _marginRightAttribute_1 = properties.getMarginRightAttribute();
        DimensionPropertyValue _marginRight = _marginRightAttribute_1.getMarginRight();
        String _dimensionValue_2 = this._propertyValueGenerator.dimensionValue(_marginRight);
        final String marginValue_2 = _dimensionValue_2;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_marginLeft=\"");
        String _string_10 = marginValue_2.toString();
        String _trim_10 = _string_10.trim();
        _builder.append(_trim_10, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MarginBottomAttribute _marginBottomAttribute = properties.getMarginBottomAttribute();
      boolean _operator_notEquals_18 = ObjectExtensions.operator_notEquals(_marginBottomAttribute, null);
      if (_operator_notEquals_18) {
        MarginBottomAttribute _marginBottomAttribute_1 = properties.getMarginBottomAttribute();
        DimensionPropertyValue _marginBottom = _marginBottomAttribute_1.getMarginBottom();
        String _dimensionValue_3 = this._propertyValueGenerator.dimensionValue(_marginBottom);
        final String marginValue_3 = _dimensionValue_3;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_marginLeft=\"");
        String _string_11 = marginValue_3.toString();
        String _trim_11 = _string_11.trim();
        _builder.append(_trim_11, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      ColumnAttribute _columnAttribute = properties.getColumnAttribute();
      boolean _operator_notEquals_19 = ObjectExtensions.operator_notEquals(_columnAttribute, null);
      if (_operator_notEquals_19) {
        ColumnAttribute _columnAttribute_1 = properties.getColumnAttribute();
        IntegerPropertyValue _column = _columnAttribute_1.getColumn();
        StringConcatenation _integerValue_1 = this._propertyValueGenerator.integerValue(_column);
        final StringConcatenation columnValue = _integerValue_1;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_column=\"");
        String _string_12 = columnValue.toString();
        String _trim_12 = _string_12.trim();
        _builder.append(_trim_12, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      SpanAttribute _spanAttribute = properties.getSpanAttribute();
      boolean _operator_notEquals_20 = ObjectExtensions.operator_notEquals(_spanAttribute, null);
      if (_operator_notEquals_20) {
        SpanAttribute _spanAttribute_1 = properties.getSpanAttribute();
        IntegerPropertyValue _span = _spanAttribute_1.getSpan();
        StringConcatenation _integerValue_2 = this._propertyValueGenerator.integerValue(_span);
        final StringConcatenation spanValue = _integerValue_2;
        _builder.newLineIfNotEmpty();
        _builder.append("android:layout_span=\"");
        String _string_13 = spanValue.toString();
        String _trim_13 = _string_13.trim();
        _builder.append(_trim_13, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
