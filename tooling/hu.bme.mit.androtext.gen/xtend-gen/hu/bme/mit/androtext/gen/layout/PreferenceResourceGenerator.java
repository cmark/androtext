package hu.bme.mit.androtext.gen.layout;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.layout.ViewPropertiesGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationComponent;
import hu.bme.mit.androtext.lang.androTextDsl.DialogBasedPreference;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceContainer;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceElement;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class PreferenceResourceGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private ViewPropertiesGenerator _viewPropertiesGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication targetApplication) {
    AndroidApplication _application = targetApplication.getApplication();
    EList<AndroidApplicationComponent> _components = _application.getComponents();
    Iterable<PreferenceActivity> _filter = Iterables.<PreferenceActivity>filter(_components, PreferenceActivity.class);
    for (final PreferenceActivity pref : _filter) {
      PreferenceScreen _screen = pref.getScreen();
      boolean _notEquals = (!Objects.equal(_screen, null));
      if (_notEquals) {
        String _preferenceXmlFileName = this._generatorExtensions.preferenceXmlFileName(pref);
        String _plus = (_preferenceXmlFileName + ".xml");
        PreferenceScreen _screen_1 = pref.getScreen();
        CharSequence _generate = this.generate(_screen_1);
        fsa.generateFile(_plus, IGeneratorSlots.XML_SLOT, _generate);
      }
    }
  }
  
  public CharSequence generate(final PreferenceScreen screen) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xmlHeader = this._generatorExtensions.xmlHeader(screen);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    EClass _eClass = screen.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    CharSequence _androidSchema = this._generatorExtensions.androidSchema(screen);
    String _string = _androidSchema.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _titleAttribute = this.titleAttribute(screen);
    String _string_1 = _titleAttribute.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "	");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _attributes = this.attributes(screen);
    String _string_2 = _attributes.toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _elements = this.elements(screen);
    String _string_3 = _elements.toString();
    String _trim_3 = _string_3.trim();
    _builder.append(_trim_3, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</");
    EClass _eClass_1 = screen.eClass();
    String _name_1 = _eClass_1.getName();
    _builder.append(_name_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generate(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    EClass _eClass = preference.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _titleAttribute = this.titleAttribute(preference);
    String _string = _titleAttribute.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _attributes = this.attributes(preference);
    String _string_1 = _attributes.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _elements = this.elements(preference);
    String _string_2 = _elements.toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</");
    EClass _eClass_1 = preference.eClass();
    String _name_1 = _eClass_1.getName();
    _builder.append(_name_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence basicAttributes(final PreferenceElement preference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _keyAttribute = this.keyAttribute(preference);
    _builder.append(_keyAttribute, "");
    _builder.newLineIfNotEmpty();
    {
      String _summary = preference.getSummary();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_summary);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("android:summary=\"");
        String _summary_1 = preference.getSummary();
        String _string = _summary_1.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("android:enabled=\"");
    boolean _isEnabled = preference.isEnabled();
    String _string_1 = Boolean.valueOf(_isEnabled).toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("android:persistent=\"");
    boolean _isPersistent = preference.isPersistent();
    String _string_2 = Boolean.valueOf(_isPersistent).toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _attributes(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _attributes(final PreferenceScreen preference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _keyAttribute = this.keyAttribute(preference);
    _builder.append(_keyAttribute, "");
    _builder.newLineIfNotEmpty();
    {
      String _summary = preference.getSummary();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_summary);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("android:summary=\"");
        String _summary_1 = preference.getSummary();
        String _string = _summary_1.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("android:enabled=\"");
    boolean _isEnabled = preference.isEnabled();
    String _string_1 = Boolean.valueOf(_isEnabled).toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("android:persistent=\"");
    boolean _isPersistent = preference.isPersistent();
    String _string_2 = Boolean.valueOf(_isPersistent).toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _attributes(final PreferenceElement preference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicAttributes = this.basicAttributes(preference);
    _builder.append(_basicAttributes, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _attributes(final DialogBasedPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicAttributes = this.basicAttributes(preference);
    _builder.append(_basicAttributes, "");
    _builder.newLineIfNotEmpty();
    {
      String _defaultValue = preference.getDefaultValue();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_defaultValue);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("android:defaultValue=\"");
        String _defaultValue_1 = preference.getDefaultValue();
        String _string = _defaultValue_1.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _dialogTitle = preference.getDialogTitle();
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_dialogTitle);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("android:dialogTitle=\"");
        String _dialogTitle_1 = preference.getDialogTitle();
        String _string_1 = _dialogTitle_1.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((preference instanceof ListPreference)) {
        EntriesAttribute _entriesAttribute = ((ListPreference) preference).getEntriesAttribute();
        CharSequence _generate = this._viewPropertiesGenerator.generate(_entriesAttribute);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
        _builder.append("android:entryValues=\"@array/");
        StringArrayEntry _entryValues = ((ListPreference) preference).getEntryValues();
        String _name = _entryValues.getName();
        _builder.append(_name, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _elements(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _elements(final PreferenceContainer preference) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AbstractPreference> _preferences = preference.getPreferences();
      for(final AbstractPreference e : _preferences) {
        CharSequence _generate = this.generate(e);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence titleAttribute(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _title = preference.getTitle();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_title);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("android:title=\"");
        String _title_1 = preference.getTitle();
        _builder.append(_title_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _keyAttribute(final AbstractPreference preference) {
    return null;
  }
  
  protected CharSequence _keyAttribute(final PreferenceElement preference) {
    String _preferenceKeyName = this._generatorExtensions.preferenceKeyName(preference);
    CharSequence _keyAttribute = this.keyAttribute(_preferenceKeyName);
    return _keyAttribute;
  }
  
  protected CharSequence _keyAttribute(final PreferenceScreen preference) {
    String _preferenceKeyName = this._generatorExtensions.preferenceKeyName(preference);
    CharSequence _keyAttribute = this.keyAttribute(_preferenceKeyName);
    return _keyAttribute;
  }
  
  public CharSequence keyAttribute(final String key) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(key);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("android:key=\"@string/");
        _builder.append(key, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence attributes(final AbstractPreference preference) {
    if (preference instanceof DialogBasedPreference) {
      return _attributes((DialogBasedPreference)preference);
    } else if (preference instanceof PreferenceScreen) {
      return _attributes((PreferenceScreen)preference);
    } else if (preference instanceof PreferenceElement) {
      return _attributes((PreferenceElement)preference);
    } else if (preference != null) {
      return _attributes(preference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(preference).toString());
    }
  }
  
  public CharSequence elements(final AbstractPreference preference) {
    if (preference instanceof PreferenceContainer) {
      return _elements((PreferenceContainer)preference);
    } else if (preference != null) {
      return _elements(preference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(preference).toString());
    }
  }
  
  public CharSequence keyAttribute(final AbstractPreference preference) {
    if (preference instanceof PreferenceScreen) {
      return _keyAttribute((PreferenceScreen)preference);
    } else if (preference instanceof PreferenceElement) {
      return _keyAttribute((PreferenceElement)preference);
    } else if (preference != null) {
      return _keyAttribute(preference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(preference).toString());
    }
  }
}
