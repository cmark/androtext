package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ActivityClassGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions extensions;
  
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
      String _className = this.extensions.className(activity);
      String _operator_plus = StringExtensions.operator_plus(_className, ".java");
      StringConcatenation _generate = this.generate(activity, androidApplication);
      fsa.generateFile(_operator_plus, IGeneratorSlots.DEFAULT_SRC, _generate);
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
      String _findPackageName = this.extensions.findPackageName(application);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_findPackageName);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("package ");
        String _findPackageName_1 = this.extensions.findPackageName(application);
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
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation body(final Activity activity, final ImportManager manager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _className = this.extensions.className(activity);
    _builder.append(_className, "");
    _builder.append(" extends ");
    String _abstractClassName = this.extensions.abstractClassName(activity);
    _builder.append(_abstractClassName, "");
    _builder.append(" {");
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
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
}
