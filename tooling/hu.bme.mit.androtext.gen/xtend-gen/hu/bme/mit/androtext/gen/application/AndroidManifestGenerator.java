package hu.bme.mit.androtext.gen.application;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IAndroidManifestPermissionGenerator;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationComponent;
import hu.bme.mit.androtext.lang.androTextDsl.CustomAction;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.IntentAction;
import hu.bme.mit.androtext.lang.androTextDsl.IntentActionType;
import hu.bme.mit.androtext.lang.androTextDsl.IntentCategory;
import hu.bme.mit.androtext.lang.androTextDsl.IntentData;
import hu.bme.mit.androtext.lang.androTextDsl.IntentDataType;
import hu.bme.mit.androtext.lang.androTextDsl.IntentFilter;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AndroidManifestGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private IAndroidManifestPermissionGenerator _iAndroidManifestPermissionGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    CharSequence _generate = this.generate(androidApplication);
    fsa.generateFile("AndroidManifest.xml", IGeneratorSlots.PROJECT_SLOT, _generate);
  }
  
  public CharSequence generate(final TargetApplication androidApplication) {
    StringConcatenation _builder = new StringConcatenation();
    final AndroidApplication application = androidApplication.getApplication();
    _builder.newLineIfNotEmpty();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("package=\"");
    String _findPackageName = this._generatorExtensions.findPackageName(androidApplication);
    _builder.append(_findPackageName, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:versionCode=\"1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:versionName=\"1.0\">");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generatePermissons = this._iAndroidManifestPermissionGenerator.generatePermissons(androidApplication);
    _builder.append(_generatePermissons, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<application android:icon=\"@drawable/icon\" android:label=\"@string/app_name\" android:debuggable=\"true\">");
    _builder.newLine();
    _builder.append("\t\t");
    AbstractActivity _mainActivity = application.getMainActivity();
    CharSequence _generateMainActivity = this.generateMainActivity(_mainActivity, androidApplication);
    _builder.append(_generateMainActivity, "		");
    _builder.newLineIfNotEmpty();
    {
      EList<AndroidApplicationComponent> _components = application.getComponents();
      Iterable<AbstractActivity> _filter = Iterables.<AbstractActivity>filter(_components, AbstractActivity.class);
      for(final AbstractActivity activity : _filter) {
        _builder.append("\t\t");
        CharSequence _generateActivity = this.generateActivity(activity, androidApplication);
        _builder.append(_generateActivity, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AndroidApplicationComponent> _components_1 = application.getComponents();
      Iterable<DatabaseContentProvider> _filter_1 = Iterables.<DatabaseContentProvider>filter(_components_1, DatabaseContentProvider.class);
      for(final DatabaseContentProvider contentProvider : _filter_1) {
        _builder.append("\t\t");
        CharSequence _generateContentProvider = this.generateContentProvider(contentProvider, androidApplication);
        _builder.append(_generateContentProvider, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</application>");
    _builder.newLine();
    _builder.append("</manifest>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateContentProvider(final DatabaseContentProvider contentProvider, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<provider android:name=\".data.");
    String _className = this._generatorExtensions.className(contentProvider);
    _builder.append(_className, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:authorities=\"");
    String _authority = this._generatorExtensions.authority(application);
    _builder.append(_authority, "	");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateMainActivity(final AbstractActivity activity, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<activity android:label=\"@string/");
    String _activityNameValue = this._generatorExtensions.activityNameValue(activity);
    _builder.append(_activityNameValue, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:name=\".");
    String _className = this._generatorExtensions.className(activity);
    _builder.append(_className, "	");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateTheme = this.generateTheme(activity);
    _builder.append(_generateTheme, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<intent-filter>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<action android:name=\"android.intent.action.MAIN\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<category android:name=\"android.intent.category.LAUNCHER\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</intent-filter>");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateFilters = this.generateFilters(activity, application);
    _builder.append(_generateFilters, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</activity>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTheme(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      ActivityTheme _theme = activity.getTheme();
      boolean _notEquals = (!Objects.equal(_theme, null));
      if (!_notEquals) {
        _and = false;
      } else {
        ActivityTheme _theme_1 = activity.getTheme();
        boolean _notEquals_1 = (!Objects.equal(_theme_1, ActivityTheme.THEME));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("android:theme=\"@android:style/Theme.");
        ActivityTheme _theme_2 = activity.getTheme();
        String _resolveTheme = this.resolveTheme(_theme_2);
        _builder.append(_resolveTheme, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateActivity(final AbstractActivity activity, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<activity android:label=\"@string/");
    String _activityNameValue = this._generatorExtensions.activityNameValue(activity);
    _builder.append(_activityNameValue, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:name=\".");
    String _className = this._generatorExtensions.className(activity);
    _builder.append(_className, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateTheme = this.generateTheme(activity);
    _builder.append(_generateTheme, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateFilters = this.generateFilters(activity, application);
    _builder.append(_generateFilters, "	");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</activity>");
    _builder.newLine();
    return _builder;
  }
  
  public String resolveTheme(final ActivityTheme theme) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(theme,ActivityTheme.FULLSCREEN)) {
        _matched=true;
        _switchResult = "NoTitleBar.FullScreen";
      }
    }
    if (!_matched) {
      if (Objects.equal(theme,ActivityTheme.NOTITLEBAR)) {
        _matched=true;
        _switchResult = "NoTitleBar";
      }
    }
    if (!_matched) {
      String _name = theme.name();
      String _lowerCase = _name.toLowerCase();
      String _firstUpper = StringExtensions.toFirstUpper(_lowerCase);
      _switchResult = _firstUpper;
    }
    return _switchResult;
  }
  
  public CharSequence generateFilters(final AbstractActivity activity, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<IntentFilter> _intentFilters = activity.getIntentFilters();
      for(final IntentFilter filter : _intentFilters) {
        _builder.append("<intent-filter ");
        {
          String _name = filter.getName();
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            _builder.append("android:label=\"");
            String _name_1 = filter.getName();
            _builder.append(_name_1, "");
            _builder.append("\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        {
          EList<IntentAction> _actions = filter.getActions();
          for(final IntentAction action : _actions) {
            _builder.append("\t");
            _builder.append("<action android:name=\"");
            {
              CustomAction _customAction = action.getCustomAction();
              boolean _notEquals = (!Objects.equal(_customAction, null));
              if (_notEquals) {
                CustomAction _customAction_1 = action.getCustomAction();
                String _name_2 = _customAction_1.getName();
                _builder.append(_name_2, "	");
              } else {
                String _actionType = this.actionType(action);
                _builder.append(_actionType, "	");
              }
            }
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<IntentCategory> _categories = filter.getCategories();
          for(final IntentCategory category : _categories) {
            _builder.append("\t");
            _builder.append("<category android:name=\"");
            String _categoryName = this.categoryName(category);
            _builder.append(_categoryName, "	");
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<IntentData> _datas = filter.getDatas();
          for(final IntentData data : _datas) {
            _builder.append("\t");
            _builder.append("<data android:mimeType=\"");
            String _mimeType = this.mimeType(data, application);
            _builder.append(_mimeType, "	");
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</intent-filter>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public String mimeType(final IntentData data, final TargetApplication application) {
    String _switchResult = null;
    IntentDataType _dataType = data.getDataType();
    final IntentDataType _switchValue = _dataType;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,IntentDataType.DIR)) {
        _matched=true;
        Entity _entity = data.getEntity();
        String _contentType = this._generatorExtensions.contentType(_entity, application);
        _switchResult = _contentType;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,IntentDataType.ITEM)) {
        _matched=true;
        Entity _entity_1 = data.getEntity();
        String _contentItemType = this._generatorExtensions.contentItemType(_entity_1, application);
        _switchResult = _contentItemType;
      }
    }
    return _switchResult;
  }
  
  public String actionType(final IntentAction action) {
    IntentActionType _type = action.getType();
    String _name = _type.name();
    String _upperCase = _name.toUpperCase();
    String _plus = ("android.intent.action." + _upperCase);
    return _plus;
  }
  
  public String categoryName(final IntentCategory category) {
    String _name = category.name();
    String _upperCase = _name.toUpperCase();
    String _plus = ("android.intent.category." + _upperCase);
    return _plus;
  }
}
