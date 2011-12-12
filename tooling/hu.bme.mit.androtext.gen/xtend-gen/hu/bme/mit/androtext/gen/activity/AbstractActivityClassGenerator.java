package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IAbstractActivityGenerator;
import hu.bme.mit.androtext.gen.activity.AbstractActivityFieldGenerator;
import hu.bme.mit.androtext.gen.activity.AbstractActivityMethodGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.View;
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
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _extraImports(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _extraImports(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.widget.ArrayAdapter;");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _extraImports(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
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
    _builder.append(_interfaces, "");
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
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void onCreate(Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.onCreate(savedInstanceState);");
    _builder.newLine();
    _builder.append("\t\t");
    StringConcatenation _contentViewSet = this.contentViewSet(activity);
    _builder.append(_contentViewSet, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    StringConcatenation _logic = this.logic(activity);
    _builder.append(_logic, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
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
      boolean _findSensorUsage = this._generatorExtensions.findSensorUsage(activity);
      if (_findSensorUsage) {
        _builder.append("implements IAccelerometerListener");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _contentViewSet(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      View _layout = activity.getLayout();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_layout, null);
      if (_operator_notEquals) {
        _builder.append("setContentView(R.layout.");
        View _layout_1 = activity.getLayout();
        String _layoutName = this._generatorExtensions.layoutName(_layout_1);
        _builder.append(_layoutName, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _contentViewSet(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("setContentView(R.layout.");
    String _tabActivityLayout = this._generatorExtensions.tabActivityLayout(activity);
    _builder.append(_tabActivityLayout, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _logic(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _logic(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    View _listitem = activity.getListitem();
    String _layoutName = this._generatorExtensions.layoutName(_listitem);
    final String listItem = _layoutName;
    _builder.newLineIfNotEmpty();
    ContentProvider _contentProvider = activity.getContentProvider();
    StringConcatenation _generate = this.generate(_contentProvider, listItem);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _logic(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Resources res = getResources(); // Resource object to get Drawables");
    _builder.newLine();
    _builder.append("TabHost tabHost = getTabHost();  // The activity TabHost");
    _builder.newLine();
    _builder.append("TabHost.TabSpec spec;  // Resusable TabSpec for each tab");
    _builder.newLine();
    _builder.append("Intent intent;  // Reusable Intent for each tab");
    _builder.newLine();
    {
      EList<Tab> _tabs = activity.getTabs();
      for(final Tab tab : _tabs) {
        _builder.append("intent = new Intent().setClass(this, ");
        Activity _activity = tab.getActivity();
        String _className = this._generatorExtensions.className(_activity);
        _builder.append(_className, "");
        _builder.append(".class);");
        _builder.newLineIfNotEmpty();
        _builder.append("spec = tabHost.newTabSpec(\"");
        String _tag = tab.getTag();
        _builder.append(_tag, "");
        _builder.append("\").setIndicator(\"");
        String _tag_1 = tab.getTag();
        String _firstUpper = StringExtensions.toFirstUpper(_tag_1);
        _builder.append(_firstUpper, "");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("res.getDrawable(R.drawable.");
        TabDrawableResourceLink _drawable = tab.getDrawable();
        TabDrawableResource _link = _drawable.getLink();
        String _name = _link.getName();
        _builder.append(_name, "				");
        _builder.append("))");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append(".setContent(intent);");
        _builder.newLine();
        _builder.append("tabHost.addTab(spec);");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("tabHost.setCurrentTab(2);");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final ContentProvider provider, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final ResourceContentProvider provider, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    ArrayResource _link = provider.getLink();
    StringConcatenation _generateContentSet = this.generateContentSet(_link, listItem);
    _builder.append(_generateContentSet, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generateContentSet(final ArrayResource resource, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateContentSet(final StringArrayResource resource, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String[] ");
    String _name = resource.getName();
    _builder.append(_name, "");
    _builder.append(" = getResources().getStringArray(R.array.");
    String _name_1 = resource.getName();
    _builder.append(_name_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("setListAdapter(new ArrayAdapter<String>(this, R.layout.");
    _builder.append(listItem, "");
    _builder.append(", ");
    String _name_2 = resource.getName();
    _builder.append(_name_2, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generateContentSet(final IntegerArrayResource resource, final String listItem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
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
  
  public StringConcatenation contentViewSet(final Activity activity) {
    if (activity instanceof TabActivity) {
      return _contentViewSet((TabActivity)activity);
    } else {
      return _contentViewSet(activity);
    }
  }
  
  public StringConcatenation logic(final Activity activity) {
    if (activity instanceof ListActivity) {
      return _logic((ListActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _logic((TabActivity)activity);
    } else {
      return _logic(activity);
    }
  }
  
  public StringConcatenation generate(final ContentProvider provider, final String listItem) {
    if (provider instanceof ResourceContentProvider) {
      return _generate((ResourceContentProvider)provider, listItem);
    } else {
      return _generate(provider, listItem);
    }
  }
  
  public StringConcatenation generateContentSet(final ArrayResource resource, final String listItem) {
    if (resource instanceof IntegerArrayResource) {
      return _generateContentSet((IntegerArrayResource)resource, listItem);
    } else if (resource instanceof StringArrayResource) {
      return _generateContentSet((StringArrayResource)resource, listItem);
    } else {
      return _generateContentSet(resource, listItem);
    }
  }
}
