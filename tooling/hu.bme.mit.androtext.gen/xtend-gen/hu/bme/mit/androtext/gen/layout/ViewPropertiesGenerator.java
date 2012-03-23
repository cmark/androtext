package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViewPropertiesGenerator {
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  public StringConcatenation generate(final EntriesAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(attribute, null);
      if (_operator_notEquals) {
        _builder.append("android:entries=\"@array/");
        ArrayResource _entries = attribute.getEntries();
        String _name = _entries.getName();
        _builder.append(_name, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
