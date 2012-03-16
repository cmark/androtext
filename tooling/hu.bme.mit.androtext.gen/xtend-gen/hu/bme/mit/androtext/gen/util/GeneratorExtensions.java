package hu.bme.mit.androtext.gen.util;

import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityContextMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Body;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypes;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.Font;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.LogicComponent;
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceContainer;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceElement;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GeneratorExtensions {
  public StringConcatenation xmlHeader(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation androidSchema(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    return _builder;
  }
  
  public String authority(final TargetApplication application) {
    String _dataPackageName = this.dataPackageName(application);
    String _operator_plus = StringExtensions.operator_plus(_dataPackageName, ".");
    String _dataInformationClassName = this.dataInformationClassName(application);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _dataInformationClassName);
    return _operator_plus_1;
  }
  
  public String findPackageName(final TargetApplication targetApplication) {
    boolean _operator_or = false;
    String _packageName = targetApplication.getPackageName();
    boolean _operator_equals = ObjectExtensions.operator_equals(_packageName, null);
    if (_operator_equals) {
      _operator_or = true;
    } else {
      String _packageName_1 = targetApplication.getPackageName();
      boolean _isEmpty = _packageName_1.isEmpty();
      _operator_or = BooleanExtensions.operator_or(_operator_equals, _isEmpty);
    }
    if (_operator_or) {
      String _projectName = targetApplication.getProjectName();
      return _projectName;
    } else {
      String _packageName_2 = targetApplication.getPackageName();
      return _packageName_2;
    }
  }
  
  public String path_uri(final Entity e) {
    String _name = e.getName();
    String _upperCase = _name.toUpperCase();
    String _operator_plus = StringExtensions.operator_plus("PATH_", _upperCase);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "S");
    return _operator_plus_1;
  }
  
  public String path_id_uri(final Entity e) {
    String _name = e.getName();
    String _upperCase = _name.toUpperCase();
    String _operator_plus = StringExtensions.operator_plus("PATH_", _upperCase);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "_ID");
    return _operator_plus_1;
  }
  
  public String contentType(final Entity e, final TargetApplication application) {
    String _findPackageName = this.findPackageName(application);
    String _operator_plus = StringExtensions.operator_plus("vnd.android.cursor.dir/vnd.", _findPackageName);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".");
    String _name = e.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _lowerCase);
    return _operator_plus_2;
  }
  
  public String contentItemType(final Entity e, final TargetApplication application) {
    String _findPackageName = this.findPackageName(application);
    String _operator_plus = StringExtensions.operator_plus("vnd.android.cursor.item/vnd.", _findPackageName);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".");
    String _name = e.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _lowerCase);
    return _operator_plus_2;
  }
  
  /**
   * computes the class name if its a Entity
   * returns null otherwise
   */
  public String className(final Object o) {
    String _switchResult = null;
    final Object o_1 = o;
    boolean matched = false;
    if (!matched) {
      if (o_1 instanceof Entity) {
        final Entity o_2 = (Entity) o_1;
        matched=true;
        String _name = o_2.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _switchResult = _firstUpper;
      }
    }
    if (!matched) {
      if (o_1 instanceof AbstractActivity) {
        final AbstractActivity o_3 = (AbstractActivity) o_1;
        matched=true;
        String _name_1 = o_3.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        _switchResult = _firstUpper_1;
      }
    }
    if (!matched) {
      if (o_1 instanceof ContentProvider) {
        final ContentProvider o_4 = (ContentProvider) o_1;
        matched=true;
        String _name_2 = o_4.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        _switchResult = _firstUpper_2;
      }
    }
    if (!matched) {
      Class<? extends Object> _class = o.getClass();
      String _name_3 = _class.getName();
      String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
      _switchResult = _firstUpper_3;
    }
    return _switchResult;
  }
  
  public String abstractClassName(final Object o) {
    String _className = this.className(o);
    String _operator_plus = StringExtensions.operator_plus("Abstract", _className);
    return _operator_plus;
  }
  
  public String abstractJavaFileName(final Object o) {
    String _javaFileName = this.javaFileName(o);
    String _operator_plus = StringExtensions.operator_plus("Abstract", _javaFileName);
    return _operator_plus;
  }
  
  public String columnsClassName(final Entity entity) {
    String _className = this.className(entity);
    String _operator_plus = StringExtensions.operator_plus(_className, "Columns");
    return _operator_plus;
  }
  
  public String name(final TypeRef ref) {
    String _switchResult = null;
    final TypeRef ref_1 = ref;
    boolean matched = false;
    if (!matched) {
      if (ref_1 instanceof EntityTypeRef) {
        final EntityTypeRef ref_2 = (EntityTypeRef) ref_1;
        matched=true;
        Entity _type = ref_2.getType();
        String _className = this.className(_type);
        _switchResult = _className;
      }
    }
    if (!matched) {
      if (ref_1 instanceof DataTypesRef) {
        final DataTypesRef ref_3 = (DataTypesRef) ref_1;
        matched=true;
        DataTypes _type_1 = ref_3.getType();
        String _literal = _type_1.getLiteral();
        _switchResult = _literal;
      }
    }
    if (!matched) {
      _switchResult = "Object";
    }
    return _switchResult;
  }
  
  public ArrayList<GameMenuItem> findAllGameMenuItems(final BaseGameActivity activity) {
      ArrayList<GameMenuItem> _arrayList = new ArrayList<GameMenuItem>();
      ArrayList<GameMenuItem> menuItems = _arrayList;
      Scene _scene = activity.getScene();
      Resource _eResource = _scene.eResource();
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
      Iterable<GameMenuItem> _filter = IterableExtensions.<GameMenuItem>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem.class);
      for (final GameMenuItem item : _filter) {
        menuItems.add(item);
      }
      return menuItems;
  }
  
  public List<AbstractPreference> getPreferencesWithKeys(final PreferenceContainer container) {
      ArrayList<AbstractPreference> _arrayList = new ArrayList<AbstractPreference>();
      final ArrayList<AbstractPreference> prefList = _arrayList;
      if ((container instanceof PreferenceScreen)) {
        String _name = ((PreferenceScreen) container).getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
        if (_operator_not) {
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
  
  public StringConcatenation menuSceneFieldName(final MenuScene menu) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mMenuScene");
    String _name = menu.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation createMenuMethodName(final MenuScene menu) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("createMenuScene");
    String _name = menu.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation variableName(final GameMenuItem item) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = item.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append("MenuItem");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String tabActivityLayout(final TabActivity activity) {
    String _name = activity.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_layout");
    return _operator_plus;
  }
  
  public String preferenceXmlFileName(final PreferenceActivity activity) {
    String _name = activity.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_preflayout");
    return _operator_plus;
  }
  
  protected String _preferenceKeyName(final PreferenceElement p) {
    String _name = p.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Key");
    return _operator_plus;
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
      String _operator_plus = StringExtensions.operator_plus(_name_1, "Key");
      _xblockexpression = (_operator_plus);
    }
    return _xblockexpression;
  }
  
  public String abstractClassName(final AbstractActivity activity) {
    String _className = this.className(activity);
    String _operator_plus = StringExtensions.operator_plus("Abstract", _className);
    return _operator_plus;
  }
  
  public String javaFileName(final Object o) {
    String _className = this.className(o);
    String _operator_plus = StringExtensions.operator_plus(_className, ".java");
    return _operator_plus;
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
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_title");
    return _operator_plus;
  }
  
  public String dataPackageName(final TargetApplication androidApplication) {
    String _findPackageName = this.findPackageName(androidApplication);
    String _operator_plus = StringExtensions.operator_plus(_findPackageName, ".data");
    return _operator_plus;
  }
  
  public String dataInformationClassName(final TargetApplication androidApplication) {
    AndroidApplication _application = androidApplication.getApplication();
    String _name = _application.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Data");
    return _operator_plus;
  }
  
  public String layoutName(final View root) {
    String _name = root.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_layout");
    return _operator_plus;
  }
  
  protected String _menuResourceFileName(final ActivityMenu menu) {
    String _name = menu.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_menu");
    return _operator_plus;
  }
  
  protected String _menuResourceFileName(final ActivityContextMenu menu) {
    String _name = menu.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_menu");
    return _operator_plus;
  }
  
  public StringConcatenation textureRegionFieldName(final TextureRegion region) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("m");
    String _name = region.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("TextureRegion");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation fontFieldName(final Font font) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("m");
    String _name = font.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Font");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation textureVariableName(final Font font) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = font.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append("Texture");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation entityFieldName(final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("m");
    String _name = entity.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Entity");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _type(final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    EClass _eClass = entity.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _type(final SimpleEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Entity");
    _builder.newLine();
    return _builder;
  }
  
  public boolean containsBox2DObject(final AndroGameLogic logic) {
      EList<LogicComponent> _logicComponent = logic.getLogicComponent();
      for (final LogicComponent comp : _logicComponent) {
        if ((comp instanceof Body)) {
          return true;
        }
      }
      return false;
  }
  
  public String columnType(final Property f) {
    String _xblockexpression = null;
    {
      TypeRef _type = f.getType();
      final TypeRef t = _type;
      String _switchResult = null;
      final TypeRef t_1 = t;
      boolean matched = false;
      if (!matched) {
        if (t_1 instanceof EntityTypeRef) {
          final EntityTypeRef t_2 = (EntityTypeRef) t_1;
          matched=true;
          _switchResult = "INTEGER";
        }
      }
      if (!matched) {
        if (t_1 instanceof DataTypesRef) {
          final DataTypesRef t_3 = (DataTypesRef) t_1;
          matched=true;
          String _columnType = this.columnType(t_3);
          _switchResult = _columnType;
        }
      }
      if (!matched) {
        _switchResult = null;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public String columnType(final DataTypesRef ref) {
    String _switchResult = null;
    DataTypes _type = ref.getType();
    final DataTypes __valOfSwitchOver = _type;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,DataTypes.BOOLEAN)) {
        matched=true;
        _switchResult = "BOOLEAN";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,DataTypes.FLOAT)) {
        matched=true;
        _switchResult = "REAL";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,DataTypes.STRING)) {
        matched=true;
        _switchResult = "TEXT";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,DataTypes.INT)) {
        matched=true;
        _switchResult = "INTEGER";
      }
    }
    if (!matched) {
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
  
  public String menuResourceFileName(final EObject menu) {
    if (menu instanceof ActivityContextMenu) {
      return _menuResourceFileName((ActivityContextMenu)menu);
    } else if (menu instanceof ActivityMenu) {
      return _menuResourceFileName((ActivityMenu)menu);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(menu).toString());
    }
  }
  
  public StringConcatenation type(final GameEntity entity) {
    if (entity instanceof SimpleEntity) {
      return _type((SimpleEntity)entity);
    } else {
      return _type(entity);
    }
  }
}
