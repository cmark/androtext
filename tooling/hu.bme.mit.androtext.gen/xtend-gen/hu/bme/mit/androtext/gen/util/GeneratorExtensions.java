package hu.bme.mit.androtext.gen.util;

import com.google.common.base.Objects;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypes;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceContainer;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceElement;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorExtensions {
  public CharSequence xmlHeader(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence androidSchema(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    return _builder;
  }
  
  public String authority(final TargetApplication application) {
    String _dataPackageName = this.dataPackageName(application);
    String _plus = (_dataPackageName + ".");
    String _dataInformationClassName = this.dataInformationClassName(application);
    String _plus_1 = (_plus + _dataInformationClassName);
    return _plus_1;
  }
  
  public String findPackageName(final TargetApplication targetApplication) {
    boolean _or = false;
    String _packageName = targetApplication.getPackageName();
    boolean _equals = Objects.equal(_packageName, null);
    if (_equals) {
      _or = true;
    } else {
      String _packageName_1 = targetApplication.getPackageName();
      boolean _isEmpty = _packageName_1.isEmpty();
      _or = (_equals || _isEmpty);
    }
    if (_or) {
      return targetApplication.getProjectName();
    } else {
      return targetApplication.getPackageName();
    }
  }
  
  public String fieldName(final View view) {
    String _name = view.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("m" + _firstUpper);
    return _plus;
  }
  
  public String path_uri(final Entity e) {
    String _name = e.getName();
    String _upperCase = _name.toUpperCase();
    String _plus = ("PATH_" + _upperCase);
    String _plus_1 = (_plus + "S");
    return _plus_1;
  }
  
  public String path_id_uri(final Entity e) {
    String _name = e.getName();
    String _upperCase = _name.toUpperCase();
    String _plus = ("PATH_" + _upperCase);
    String _plus_1 = (_plus + "_ID");
    return _plus_1;
  }
  
  public String contentType(final Entity e, final TargetApplication application) {
    String _findPackageName = this.findPackageName(application);
    String _plus = ("vnd.android.cursor.dir/vnd." + _findPackageName);
    String _plus_1 = (_plus + ".");
    String _name = e.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus_2 = (_plus_1 + _lowerCase);
    return _plus_2;
  }
  
  public String contentItemType(final Entity e, final TargetApplication application) {
    String _findPackageName = this.findPackageName(application);
    String _plus = ("vnd.android.cursor.item/vnd." + _findPackageName);
    String _plus_1 = (_plus + ".");
    String _name = e.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus_2 = (_plus_1 + _lowerCase);
    return _plus_2;
  }
  
  /**
   * computes the class name if its a Entity
   * returns null otherwise
   */
  public String className(final Object o) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (o instanceof Entity) {
        final Entity _entity = (Entity)o;
        _matched=true;
        String _name = _entity.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _switchResult = _firstUpper;
      }
    }
    if (!_matched) {
      if (o instanceof AbstractActivity) {
        final AbstractActivity _abstractActivity = (AbstractActivity)o;
        _matched=true;
        String _name = _abstractActivity.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _switchResult = _firstUpper;
      }
    }
    if (!_matched) {
      if (o instanceof ContentProvider) {
        final ContentProvider _contentProvider = (ContentProvider)o;
        _matched=true;
        String _name = _contentProvider.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _switchResult = _firstUpper;
      }
    }
    if (!_matched) {
      Class<? extends Object> _class = o.getClass();
      String _name = _class.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _switchResult = _firstUpper;
    }
    return _switchResult;
  }
  
  public String javaType(final EObject e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof ViewElement) {
        final ViewElement _viewElement = (ViewElement)e;
        _matched=true;
        _switchResult = "View";
      }
    }
    if (!_matched) {
      EClass _eClass = e.eClass();
      String _name = _eClass.getName();
      _switchResult = _name;
    }
    return _switchResult;
  }
  
  public String abstractClassName(final Object o) {
    String _className = this.className(o);
    String _plus = ("Abstract" + _className);
    return _plus;
  }
  
  public String abstractJavaFileName(final Object o) {
    String _javaFileName = this.javaFileName(o);
    String _plus = ("Abstract" + _javaFileName);
    return _plus;
  }
  
  public String columnsClassName(final Entity entity) {
    String _className = this.className(entity);
    String _plus = (_className + "Columns");
    return _plus;
  }
  
  public String name(final TypeRef ref) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (ref instanceof EntityTypeRef) {
        final EntityTypeRef _entityTypeRef = (EntityTypeRef)ref;
        _matched=true;
        Entity _type = _entityTypeRef.getType();
        String _className = this.className(_type);
        _switchResult = _className;
      }
    }
    if (!_matched) {
      if (ref instanceof DataTypesRef) {
        final DataTypesRef _dataTypesRef = (DataTypesRef)ref;
        _matched=true;
        DataTypes _type = _dataTypesRef.getType();
        String _literal = _type.getLiteral();
        _switchResult = _literal;
      }
    }
    if (!_matched) {
      _switchResult = "Object";
    }
    return _switchResult;
  }
  
  public List<AbstractPreference> getPreferencesWithKeys(final PreferenceContainer container) {
    ArrayList<AbstractPreference> _arrayList = new ArrayList<AbstractPreference>();
    final ArrayList<AbstractPreference> prefList = _arrayList;
    if ((container instanceof PreferenceScreen)) {
      String _name = ((PreferenceScreen) container).getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        prefList.add(container);
      }
    }
    EList<AbstractPreference> _preferences = container.getPreferences();
    for (final AbstractPreference e : _preferences) {
      if ((e instanceof PreferenceContainer)) {
        List<AbstractPreference> _preferencesWithKeys = this.getPreferencesWithKeys(((PreferenceContainer) e));
        prefList.addAll(_preferencesWithKeys);
      } else {
        prefList.add(e);
      }
    }
    return prefList;
  }
  
  public String tabActivityLayout(final TabActivity activity) {
    String _name = activity.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus = (_lowerCase + "_layout");
    return _plus;
  }
  
  public String preferenceXmlFileName(final PreferenceActivity activity) {
    String _name = activity.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus = (_lowerCase + "_preflayout");
    return _plus;
  }
  
  protected String _preferenceKeyName(final PreferenceElement p) {
    String _name = p.getName();
    String _plus = (_name + "Key");
    return _plus;
  }
  
  protected String _preferenceKeyName(final PreferenceScreen p) {
    String _xblockexpression = null;
    {
      String _name = p.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        return null;
      }
      String _name_1 = p.getName();
      String _plus = (_name_1 + "Key");
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  public String abstractClassName(final AbstractActivity activity) {
    String _className = this.className(activity);
    String _plus = ("Abstract" + _className);
    return _plus;
  }
  
  public String javaFileName(final Object o) {
    String _className = this.className(o);
    String _plus = (_className + ".java");
    return _plus;
  }
  
  public String shortName(final JvmTypeReference r, final ImportManager importManager) {
    String _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder builder = _stringBuilder;
      JvmType _type = r.getType();
      importManager.appendType(_type, builder);
      String _string = builder.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public String featureName(final Property f) {
    String _name = f.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return _firstLower;
  }
  
  public String activityNameValue(final AbstractActivity a) {
    String _name = a.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus = (_lowerCase + "_title");
    return _plus;
  }
  
  public String dataPackageName(final TargetApplication androidApplication) {
    String _findPackageName = this.findPackageName(androidApplication);
    String _plus = (_findPackageName + ".data");
    return _plus;
  }
  
  public String dataInformationClassName(final TargetApplication androidApplication) {
    AndroidApplication _application = androidApplication.getApplication();
    String _name = _application.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + "Data");
    return _plus;
  }
  
  public String layoutName(final View root) {
    String _name = root.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus = (_lowerCase + "_layout");
    return _plus;
  }
  
  public String menuResourceFileName(final ActivityMenu menu) {
    String _name = menu.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus = (_lowerCase + "_menu");
    return _plus;
  }
  
  public String columnType(final Property f) {
    String _xblockexpression = null;
    {
      final TypeRef t = f.getType();
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (t instanceof EntityTypeRef) {
          final EntityTypeRef _entityTypeRef = (EntityTypeRef)t;
          _matched=true;
          _switchResult = "INTEGER";
        }
      }
      if (!_matched) {
        if (t instanceof DataTypesRef) {
          final DataTypesRef _dataTypesRef = (DataTypesRef)t;
          _matched=true;
          String _columnType = this.columnType(_dataTypesRef);
          _switchResult = _columnType;
        }
      }
      if (!_matched) {
        _switchResult = null;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public String columnType(final DataTypesRef ref) {
    String _switchResult = null;
    DataTypes _type = ref.getType();
    final DataTypes _switchValue = _type;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,DataTypes.BOOLEAN)) {
        _matched=true;
        _switchResult = "BOOLEAN";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,DataTypes.FLOAT)) {
        _matched=true;
        _switchResult = "REAL";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,DataTypes.STRING)) {
        _matched=true;
        _switchResult = "TEXT";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,DataTypes.INT)) {
        _matched=true;
        _switchResult = "INTEGER";
      }
    }
    if (!_matched) {
      IllegalArgumentException _illegalArgumentException = new IllegalArgumentException("Unresolved column type for DataTypeReference!");
      throw _illegalArgumentException;
    }
    return _switchResult;
  }
  
  public String preferenceKeyName(final AbstractPreference p) {
    if (p instanceof PreferenceScreen) {
      return _preferenceKeyName((PreferenceScreen)p);
    } else if (p instanceof PreferenceElement) {
      return _preferenceKeyName((PreferenceElement)p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
}
