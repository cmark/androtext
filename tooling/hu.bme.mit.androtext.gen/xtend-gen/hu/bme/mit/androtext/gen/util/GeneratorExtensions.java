package hu.bme.mit.androtext.gen.util;

import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.Font;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;
import hu.bme.mit.androtext.lang.androTextDsl.SensorBinding;
import hu.bme.mit.androtext.lang.androTextDsl.SensorTarget;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;
import hu.bme.mit.androtext.lang.androTextDsl.View;
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
      if (o_1 instanceof Activity) {
        final Activity o_3 = (Activity) o_1;
        matched=true;
        String _name_1 = o_3.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        _switchResult = _firstUpper_1;
      }
    }
    if (!matched) {
      Class<? extends Object> _class = o.getClass();
      String _name_2 = _class.getName();
      String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
      _switchResult = _firstUpper_2;
    }
    return _switchResult;
  }
  
  public String tabActivityLayout(final TabActivity activity) {
    String _name = activity.getName();
    String _lowerCase = _name.toLowerCase();
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_layout");
    return _operator_plus;
  }
  
  public String abstractClassName(final Activity activity) {
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
  
  public String activityNameValue(final Activity a) {
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
  
  public boolean findSensorUsage(final BaseGameActivity activity) {
      Scene _scene = activity.getScene();
      Resource _eResource = _scene.eResource();
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
      Iterable<SensorBinding> _filter = IterableExtensions.<SensorBinding>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.SensorBinding.class);
      for (final SensorBinding sb : _filter) {
        SensorTarget _to = sb.getTo();
        boolean _operator_equals = ObjectExtensions.operator_equals(_to, SensorTarget.GRAVITY);
        if (_operator_equals) {
          return true;
        }
      }
      return false;
  }
  
  public StringConcatenation type(final GameEntity entity) {
    if (entity instanceof SimpleEntity) {
      return _type((SimpleEntity)entity);
    } else {
      return _type(entity);
    }
  }
}
