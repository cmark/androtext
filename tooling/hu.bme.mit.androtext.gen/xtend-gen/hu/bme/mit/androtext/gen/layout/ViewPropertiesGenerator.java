package hu.bme.mit.androtext.gen.layout;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViewPropertiesGenerator {
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  public CharSequence generate(final EntriesAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(attribute, null));
      if (_notEquals) {
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
