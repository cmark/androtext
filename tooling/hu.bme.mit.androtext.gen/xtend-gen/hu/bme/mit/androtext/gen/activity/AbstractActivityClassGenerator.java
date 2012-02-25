package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IAbstractActivityGenerator;
import hu.bme.mit.androtext.gen.activity.AbstractActivityFieldGenerator;
import hu.bme.mit.androtext.gen.activity.AbstractActivityMethodGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AbstractActivityClassGenerator implements IAbstractActivityGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private AbstractActivityFieldGenerator _abstractActivityFieldGenerator;
  
  @Inject
  private AbstractActivityMethodGenerator _abstractActivityMethodGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    EList<Resource> _resources = resourceSet.getResources();
    final Function1<Resource,Iterable<Activity>> _function = new Function1<Resource,Iterable<Activity>>() {
        public Iterable<Activity> apply(final Resource r) {
          Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(r);
          Iterable<Activity> _filter = IterableExtensions.<Activity>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.Activity.class);
          return _filter;
        }
      };
    List<Iterable<Activity>> _map = ListExtensions.<Resource, Iterable<Activity>>map(_resources, _function);
    Iterable<Activity> _flatten = IterableExtensions.<Activity>flatten(_map);
    for (final Activity activity : _flatten) {
      String _abstractClassName = this._generatorExtensions.abstractClassName(activity);
      String _operator_plus = StringExtensions.operator_plus(_abstractClassName, ".java");
      StringConcatenation _generate = this.generate(activity, androidApplication);
      fsa.generateFile(_operator_plus, _generate);
    }
  }
  
  public StringConcatenation generate(final Activity activity, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _body = this.body(activity, importManager);
    final StringConcatenation body = _body;
    _builder.newLineIfNotEmpty();
    {
      String _findPackageName = this._generatorExtensions.findPackageName(application);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_findPackageName);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("package ");
        String _findPackageName_1 = this._generatorExtensions.findPackageName(application);
        _builder.append(_findPackageName_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      List<String> _imports = importManager.getImports();
      for(final String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import android.os.Bundle;");
    _builder.newLine();
    StringConcatenation _importActivity = this.importActivity(activity);
    String _string = _importActivity.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _extraImports = this.extraImports(activity);
    String _string_1 = _extraImports.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _genDepImports = this.genDepImports(activity, application);
    String _string_2 = _genDepImports.toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _genDepImports(final Activity activity, final TargetApplication app) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _genDepImports(final ListActivity activity, final TargetApplication app) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DataBinding _databinding = activity.getDatabinding();
      Entity _entity = _databinding.getEntity();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_entity, null);
      if (_operator_notEquals) {
        _builder.append("import ");
        String _dataPackageName = this._generatorExtensions.dataPackageName(app);
        _builder.append(_dataPackageName, "");
        _builder.append(".");
        String _dataInformationClassName = this._generatorExtensions.dataInformationClassName(app);
        _builder.append(_dataInformationClassName, "");
        _builder.append(".");
        DataBinding _databinding_1 = activity.getDatabinding();
        Entity _entity_1 = _databinding_1.getEntity();
        String _columnsClassName = this._generatorExtensions.columnsClassName(_entity_1);
        _builder.append(_columnsClassName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation basicImports(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.widget.Button;");
    _builder.newLine();
    _builder.append("import android.view.View;");
    _builder.newLine();
    _builder.append("import android.view.View.OnClickListener;");
    _builder.newLine();
    _builder.append("import android.content.Intent;");
    _builder.newLine();
    {
      ActivityMenu _menu = activity.getMenu();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_menu, null);
      if (_operator_notEquals) {
        _builder.append("import android.view.Menu;");
        _builder.newLine();
        _builder.append("import android.view.MenuInflater;");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _extraImports(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _basicImports = this.basicImports(activity);
    String _string = _basicImports.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _extraImports(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _basicImports = this.basicImports(activity);
    String _string = _basicImports.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import android.widget.ArrayAdapter;");
    _builder.newLine();
    _builder.append("import android.widget.AdapterView.OnItemClickListener;");
    _builder.newLine();
    _builder.append("import android.database.Cursor;");
    _builder.newLine();
    _builder.append("import android.widget.SimpleCursorAdapter;");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _extraImports(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _basicImports = this.basicImports(activity);
    String _string = _basicImports.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import android.widget.TabHost;");
    _builder.newLine();
    _builder.append("import android.content.Intent;");
    _builder.newLine();
    _builder.append("import android.content.res.Resources;");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _extraImports(final BaseGameActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _basicImports = this.basicImports(activity);
    String _string = _basicImports.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import android.graphics.Color;");
    _builder.newLine();
    _builder.append("import android.graphics.Typeface;");
    _builder.newLine();
    _builder.append("import android.hardware.SensorManager;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.engine.Engine;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.engine.options.EngineOptions;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.Entity;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.text.Text;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.sprite.Sprite;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.scene.Scene;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.scene.menu.MenuScene;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.scene.menu.MenuScene.IOnMenuItemClickListener;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.scene.menu.item.SpriteMenuItem;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.scene.menu.item.TextMenuItem;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.scene.background.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.engine.camera.Camera;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.util.HorizontalAlign;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.primitive.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.opengl.font.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.opengl.texture.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.opengl.texture.region.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.opengl.texture.atlas.bitmap.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.entity.modifier.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.extension.physics.box2d.*;");
    _builder.newLine();
    _builder.append("import com.badlogic.gdx.math.*;");
    _builder.newLine();
    _builder.append("import com.badlogic.gdx.physics.box2d.*;");
    _builder.newLine();
    _builder.append("import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;");
    _builder.newLine();
    _builder.append("import com.badlogic.gdx.physics.box2d.joints.*;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.extension.physics.box2d.util.Vector2Pool;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.sensor.accelerometer.AccelerometerData;");
    _builder.newLine();
    _builder.append("import org.anddev.andengine.sensor.accelerometer.IAccelerometerListener;");
    _builder.newLine();
    _builder.append("import javax.microedition.khronos.opengles.GL10;");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _importActivity(final Activity a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.app.");
    EClass _eClass = a.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _importActivity(final BaseGameActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.anddev.andengine.ui.activity.BaseGameActivity;");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _importActivity(final PreferenceActivity a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.preference.PreferenceActivity;");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation body(final Activity activity, final ImportManager manager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public abstract class ");
    String _abstractClassName = this._generatorExtensions.abstractClassName(activity);
    _builder.append(_abstractClassName, "");
    _builder.append(" extends ");
    EClass _eClass = activity.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    StringConcatenation _interfaces = this.interfaces(activity);
    String _string = _interfaces.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _generateFields = this._abstractActivityFieldGenerator.generateFields(activity);
    _builder.append(_generateFields, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _generateMethods = this._abstractActivityMethodGenerator.generateMethods(activity);
    _builder.append(_generateMethods, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _interfaces(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _interfaces(final BaseGameActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Scene _scene = activity.getScene();
      if ((_scene instanceof MenuScene)) {
        _builder.append("implements IOnMenuItemClickListener");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation genDepImports(final Activity activity, final TargetApplication app) {
    if (activity instanceof ListActivity) {
      return _genDepImports((ListActivity)activity, app);
    } else {
      return _genDepImports(activity, app);
    }
  }
  
  public StringConcatenation extraImports(final Activity activity) {
    if (activity instanceof BaseGameActivity) {
      return _extraImports((BaseGameActivity)activity);
    } else if (activity instanceof ListActivity) {
      return _extraImports((ListActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _extraImports((TabActivity)activity);
    } else {
      return _extraImports(activity);
    }
  }
  
  public StringConcatenation importActivity(final AndroidApplicationModelElement activity) {
    if (activity instanceof BaseGameActivity) {
      return _importActivity((BaseGameActivity)activity);
    } else if (activity instanceof Activity) {
      return _importActivity((Activity)activity);
    } else if (activity instanceof PreferenceActivity) {
      return _importActivity((PreferenceActivity)activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
  
  public StringConcatenation interfaces(final Activity activity) {
    if (activity instanceof BaseGameActivity) {
      return _interfaces((BaseGameActivity)activity);
    } else {
      return _interfaces(activity);
    }
  }
}
