package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.layout.ViewPropertiesGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.DialogBasedPreference;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceContainer;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceElement;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PreferenceResourceGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private ViewPropertiesGenerator _viewPropertiesGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication targetApplication) {
    AndroidApplication _application = targetApplication.getApplication();
    EList<AndroidApplicationModelElement> _modelElements = _application.getModelElements();
    Iterable<PreferenceActivity> _filter = IterableExtensions.<PreferenceActivity>filter(_modelElements, hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity.class);
    for (final PreferenceActivity pref : _filter) {
      PreferenceScreen _screen = pref.getScreen();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_screen, null);
      if (_operator_notEquals) {
        String _preferenceXmlFileName = this._generatorExtensions.preferenceXmlFileName(pref);
        String _operator_plus = StringExtensions.operator_plus(_preferenceXmlFileName, ".xml");
        PreferenceScreen _screen_1 = pref.getScreen();
        StringConcatenation _generate = this.generate(_screen_1);
        fsa.generateFile(_operator_plus, IGeneratorSlots.XML_SLOT, _generate);
      }
    }
  }
  
  public StringConcatenation generate(final PreferenceScreen screen) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _xmlHeader = this._generatorExtensions.xmlHeader(screen);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    EClass _eClass = screen.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    StringConcatenation _androidSchema = this._generatorExtensions.androidSchema(screen);
    String _string = _androidSchema.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _titleAttribute = this.titleAttribute(screen);
    String _string_1 = _titleAttribute.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "	");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _attributes = this.attributes(screen);
    String _string_2 = _attributes.toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _elements = this.elements(screen);
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
  
  public StringConcatenation generate(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    EClass _eClass = preference.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _titleAttribute = this.titleAttribute(preference);
    String _string = _titleAttribute.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _attributes = this.attributes(preference);
    String _string_1 = _attributes.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _elements = this.elements(preference);
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
  
  public StringConcatenation basicAttributes(final PreferenceElement preference) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _keyAttribute = this.keyAttribute(preference);
    _builder.append(_keyAttribute, "");
    _builder.newLineIfNotEmpty();
    {
      String _summary = preference.getSummary();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_summary);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
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
    String _string_1 = ((Boolean)_isEnabled).toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("android:persistent=\"");
    boolean _isPersistent = preference.isPersistent();
    String _string_2 = ((Boolean)_isPersistent).toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _attributes(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _attributes(final PreferenceScreen preference) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _keyAttribute = this.keyAttribute(preference);
    _builder.append(_keyAttribute, "");
    _builder.newLineIfNotEmpty();
    {
      String _summary = preference.getSummary();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_summary);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
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
    String _string_1 = ((Boolean)_isEnabled).toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("android:persistent=\"");
    boolean _isPersistent = preference.isPersistent();
    String _string_2 = ((Boolean)_isPersistent).toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _attributes(final PreferenceElement preference) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _basicAttributes = this.basicAttributes(preference);
    _builder.append(_basicAttributes, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _attributes(final DialogBasedPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _basicAttributes = this.basicAttributes(preference);
    _builder.append(_basicAttributes, "");
    _builder.newLineIfNotEmpty();
    {
      String _defaultValue = preference.getDefaultValue();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_defaultValue);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
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
      boolean _operator_not_1 = BooleanExtensions.operator_not(_isNullOrEmpty_1);
      if (_operator_not_1) {
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
        StringConcatenation _generate = this._viewPropertiesGenerator.generate(_entriesAttribute);
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
  
  protected StringConcatenation _elements(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _elements(final PreferenceContainer preference) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AbstractPreference> _preferences = preference.getPreferences();
      for(final AbstractPreference e : _preferences) {
        StringConcatenation _generate = this.generate(e);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation titleAttribute(final AbstractPreference preference) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _title = preference.getTitle();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_title);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("android:title=\"");
        String _title_1 = preference.getTitle();
        _builder.append(_title_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _keyAttribute(final AbstractPreference preference) {
    return null;
  }
  
  protected StringConcatenation _keyAttribute(final PreferenceElement preference) {
    String _preferenceKeyName = this._generatorExtensions.preferenceKeyName(preference);
    StringConcatenation _keyAttribute = this.keyAttribute(_preferenceKeyName);
    return _keyAttribute;
  }
  
  protected StringConcatenation _keyAttribute(final PreferenceScreen preference) {
    String _preferenceKeyName = this._generatorExtensions.preferenceKeyName(preference);
    StringConcatenation _keyAttribute = this.keyAttribute(_preferenceKeyName);
    return _keyAttribute;
  }
  
  public StringConcatenation keyAttribute(final String key) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(key);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("android:key=\"@string/");
        _builder.append(key, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation attributes(final AbstractPreference preference) {
    if (preference instanceof DialogBasedPreference) {
      return _attributes((DialogBasedPreference)preference);
    } else if (preference instanceof PreferenceScreen) {
      return _attributes((PreferenceScreen)preference);
    } else if (preference instanceof PreferenceElement) {
      return _attributes((PreferenceElement)preference);
    } else {
      return _attributes(preference);
    }
  }
  
  public StringConcatenation elements(final AbstractPreference preference) {
    if (preference instanceof PreferenceContainer) {
      return _elements((PreferenceContainer)preference);
    } else {
      return _elements(preference);
    }
  }
  
  public StringConcatenation keyAttribute(final AbstractPreference preference) {
    if (preference instanceof PreferenceScreen) {
      return _keyAttribute((PreferenceScreen)preference);
    } else if (preference instanceof PreferenceElement) {
      return _keyAttribute((PreferenceElement)preference);
    } else {
      return _keyAttribute(preference);
    }
  }
}
