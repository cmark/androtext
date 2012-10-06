package hu.bme.mit.androtext.gen.resources;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationComponent;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class BasicAndroidInformationValuesGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    CharSequence _content = this.content(resourceSet, androidApplication);
    fsa.generateFile("string.xml", IGeneratorSlots.VALUES_SLOT, _content);
  }
  
  public CharSequence content(final ResourceSet resourceSet, final TargetApplication androidApplication) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xmlHeader = this._generatorExtensions.xmlHeader(androidApplication);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<resources>");
    _builder.newLine();
    _builder.append("\t");
    AndroidApplication _application = androidApplication.getApplication();
    String _name = _application.getName();
    CharSequence _stringLine = this.stringLine("app_name", _name);
    _builder.append(_stringLine, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _findPackageName = this._generatorExtensions.findPackageName(androidApplication);
    CharSequence _stringLine_1 = this.stringLine("package_name", _findPackageName);
    _builder.append(_stringLine_1, "	");
    _builder.newLineIfNotEmpty();
    {
      EList<Resource> _resources = resourceSet.getResources();
      final Function1<Resource,Iterable<AbstractActivity>> _function = new Function1<Resource,Iterable<AbstractActivity>>() {
          public Iterable<AbstractActivity> apply(final Resource r) {
            TreeIterator<EObject> _allContents = r.getAllContents();
            Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
            Iterable<AbstractActivity> _filter = Iterables.<AbstractActivity>filter(_iterable, AbstractActivity.class);
            return _filter;
          }
        };
      List<Iterable<AbstractActivity>> _map = ListExtensions.<Resource, Iterable<AbstractActivity>>map(_resources, _function);
      Iterable<AbstractActivity> _flatten = Iterables.<AbstractActivity>concat(_map);
      for(final AbstractActivity activity : _flatten) {
        _builder.append("\t");
        String _activityNameValue = this._generatorExtensions.activityNameValue(activity);
        String _name_1 = activity.getName();
        CharSequence _stringLine_2 = this.stringLine(_activityNameValue, _name_1);
        _builder.append(_stringLine_2, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AndroidApplication _application_1 = androidApplication.getApplication();
      EList<AndroidApplicationComponent> _components = _application_1.getComponents();
      Iterable<PreferenceActivity> _filter = Iterables.<PreferenceActivity>filter(_components, PreferenceActivity.class);
      for(final PreferenceActivity prefActivity : _filter) {
        {
          PreferenceScreen _screen = prefActivity.getScreen();
          List<AbstractPreference> _preferencesWithKeys = this._generatorExtensions.getPreferencesWithKeys(_screen);
          for(final AbstractPreference pref : _preferencesWithKeys) {
            _builder.append("\t");
            String _preferenceKeyName = this._generatorExtensions.preferenceKeyName(pref);
            String _preferenceKeyName_1 = this._generatorExtensions.preferenceKeyName(pref);
            CharSequence _stringLine_3 = this.stringLine(_preferenceKeyName, _preferenceKeyName_1);
            _builder.append(_stringLine_3, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</resources>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence stringLine(final String name, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<string name=\"");
    _builder.append(name, "");
    _builder.append("\">");
    _builder.append(value, "");
    _builder.append("</string>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
