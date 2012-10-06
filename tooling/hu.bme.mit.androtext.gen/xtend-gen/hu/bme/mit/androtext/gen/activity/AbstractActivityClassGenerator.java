package hu.bme.mit.androtext.gen.activity;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IAbstractActivityGenerator;
import hu.bme.mit.androtext.gen.IActivityMethodGenerator;
import hu.bme.mit.androtext.gen.activity.AbstractActivityFieldGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AbstractActivityClassGenerator implements IAbstractActivityGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private AbstractActivityFieldGenerator _abstractActivityFieldGenerator;
  
  @Inject
  private IActivityMethodGenerator _iActivityMethodGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
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
    for (final AbstractActivity activity : _flatten) {
      String _abstractClassName = this._generatorExtensions.abstractClassName(activity);
      String _plus = (_abstractClassName + ".java");
      CharSequence _generate = this.generate(activity, androidApplication);
      fsa.generateFile(_plus, _generate);
    }
  }
  
  public CharSequence generate(final AbstractActivity activity, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    final CharSequence body = this.body(activity, importManager);
    _builder.newLineIfNotEmpty();
    {
      String _findPackageName = this._generatorExtensions.findPackageName(application);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_findPackageName);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
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
    CharSequence _importActivity = this.importActivity(activity);
    String _string = _importActivity.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    CharSequence _extraImports = this.extraImports(activity);
    String _string_1 = _extraImports.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _genDepImports = this.genDepImports(activity, application);
    String _string_2 = _genDepImports.toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genDepImports(final AbstractActivity activity, final TargetApplication app) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _genDepImports(final Activity activity, final TargetApplication app) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      DataBinding _databinding = activity.getDatabinding();
      boolean _notEquals = (!Objects.equal(_databinding, null));
      if (!_notEquals) {
        _and = false;
      } else {
        DataBinding _databinding_1 = activity.getDatabinding();
        Entity _entity = _databinding_1.getEntity();
        boolean _notEquals_1 = (!Objects.equal(_entity, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("import ");
        String _dataPackageName = this._generatorExtensions.dataPackageName(app);
        _builder.append(_dataPackageName, "");
        _builder.append(".");
        String _dataInformationClassName = this._generatorExtensions.dataInformationClassName(app);
        _builder.append(_dataInformationClassName, "");
        _builder.append(".");
        DataBinding _databinding_2 = activity.getDatabinding();
        Entity _entity_1 = _databinding_2.getEntity();
        String _columnsClassName = this._generatorExtensions.columnsClassName(_entity_1);
        _builder.append(_columnsClassName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genDepImports(final ListActivity activity, final TargetApplication app) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      DataBinding _databinding = activity.getDatabinding();
      boolean _notEquals = (!Objects.equal(_databinding, null));
      if (!_notEquals) {
        _and = false;
      } else {
        DataBinding _databinding_1 = activity.getDatabinding();
        Entity _entity = _databinding_1.getEntity();
        boolean _notEquals_1 = (!Objects.equal(_entity, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("import ");
        String _dataPackageName = this._generatorExtensions.dataPackageName(app);
        _builder.append(_dataPackageName, "");
        _builder.append(".");
        String _dataInformationClassName = this._generatorExtensions.dataInformationClassName(app);
        _builder.append(_dataInformationClassName, "");
        _builder.append(".");
        DataBinding _databinding_2 = activity.getDatabinding();
        Entity _entity_1 = _databinding_2.getEntity();
        String _columnsClassName = this._generatorExtensions.columnsClassName(_entity_1);
        _builder.append(_columnsClassName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence basicImports(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.net.Uri;");
    _builder.newLine();
    _builder.append("import android.util.Log;");
    _builder.newLine();
    _builder.append("import android.widget.Button;");
    _builder.newLine();
    _builder.append("import android.widget.TextView;");
    _builder.newLine();
    _builder.append("import android.widget.EditText;");
    _builder.newLine();
    _builder.append("import android.widget.AutoCompleteTextView;");
    _builder.newLine();
    _builder.append("import android.widget.GridView;");
    _builder.newLine();
    _builder.append("import android.widget.TableRow;");
    _builder.newLine();
    _builder.append("import android.widget.LinearLayout;");
    _builder.newLine();
    _builder.append("import android.view.View;");
    _builder.newLine();
    _builder.append("import android.view.View.OnClickListener;");
    _builder.newLine();
    _builder.append("import android.content.Intent;");
    _builder.newLine();
    _builder.append("import android.content.ContentUris;");
    _builder.newLine();
    {
      ActivityMenu _menu = activity.getMenu();
      boolean _notEquals = (!Objects.equal(_menu, null));
      if (_notEquals) {
        _builder.append("import android.view.Menu;");
        _builder.newLine();
        _builder.append("import android.view.MenuItem;");
        _builder.newLine();
      }
    }
    {
      ActivityMenu _contextMenu = activity.getContextMenu();
      boolean _notEquals_1 = (!Objects.equal(_contextMenu, null));
      if (_notEquals_1) {
        _builder.append("import android.view.ContextMenu;");
        _builder.newLine();
        _builder.append("import android.view.ContextMenu.ContextMenuInfo;");
        _builder.newLine();
      }
    }
    {
      boolean _or = false;
      ActivityMenu _contextMenu_1 = activity.getContextMenu();
      boolean _notEquals_2 = (!Objects.equal(_contextMenu_1, null));
      if (_notEquals_2) {
        _or = true;
      } else {
        ActivityMenu _menu_1 = activity.getMenu();
        boolean _notEquals_3 = (!Objects.equal(_menu_1, null));
        _or = (_notEquals_2 || _notEquals_3);
      }
      if (_or) {
        _builder.append("import android.view.MenuInflater;");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _extraImports(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicImports = this.basicImports(activity);
    String _string = _basicImports.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import android.database.Cursor;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _extraImports(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicImports = this.basicImports(activity);
    String _string = _basicImports.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import android.widget.ArrayAdapter;");
    _builder.newLine();
    _builder.append("import android.widget.AdapterView;");
    _builder.newLine();
    _builder.append("import android.widget.AdapterView.OnItemClickListener;");
    _builder.newLine();
    _builder.append("import android.database.Cursor;");
    _builder.newLine();
    _builder.append("import android.widget.SimpleCursorAdapter;");
    _builder.newLine();
    _builder.append("import android.widget.ListView;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _extraImports(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicImports = this.basicImports(activity);
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
  
  protected CharSequence _extraImports(final PreferenceActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicImports = this.basicImports(activity);
    String _string = _basicImports.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _importActivity(final AbstractActivity a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.app.");
    EClass _eClass = a.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _importActivity(final PreferenceActivity a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.preference.PreferenceActivity;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final AbstractActivity activity, final ImportManager manager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public abstract class ");
    String _abstractClassName = this._generatorExtensions.abstractClassName(activity);
    _builder.append(_abstractClassName, "");
    _builder.append(" extends ");
    EClass _eClass = activity.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    CharSequence _interfaces = this.interfaces(activity);
    String _string = _interfaces.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateFields = this._abstractActivityFieldGenerator.generateFields(activity);
    _builder.append(_generateFields, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateMethods = this._iActivityMethodGenerator.generateMethods(activity);
    _builder.append(_generateMethods, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _interfaces(final AbstractActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence genDepImports(final AbstractActivity activity, final TargetApplication app) {
    if (activity instanceof Activity) {
      return _genDepImports((Activity)activity, app);
    } else if (activity instanceof ListActivity) {
      return _genDepImports((ListActivity)activity, app);
    } else if (activity != null) {
      return _genDepImports(activity, app);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity, app).toString());
    }
  }
  
  public CharSequence extraImports(final AbstractActivity activity) {
    if (activity instanceof Activity) {
      return _extraImports((Activity)activity);
    } else if (activity instanceof ListActivity) {
      return _extraImports((ListActivity)activity);
    } else if (activity instanceof PreferenceActivity) {
      return _extraImports((PreferenceActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _extraImports((TabActivity)activity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(activity).toString());
    }
  }
  
  public CharSequence importActivity(final AbstractActivity a) {
    if (a instanceof PreferenceActivity) {
      return _importActivity((PreferenceActivity)a);
    } else if (a != null) {
      return _importActivity(a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
  
  public CharSequence interfaces(final AbstractActivity activity) {
    {
      return _interfaces(activity);
    }
  }
}
