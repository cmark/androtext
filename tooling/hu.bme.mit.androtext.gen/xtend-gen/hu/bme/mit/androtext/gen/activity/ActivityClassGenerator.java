package hu.bme.mit.androtext.gen.activity;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
public class ActivityClassGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions extensions;
  
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
      String _className = this.extensions.className(activity);
      String _plus = (_className + ".java");
      CharSequence _generate = this.generate(activity, androidApplication);
      fsa.generateFile(_plus, IGeneratorSlots.DEFAULT_SRC, _generate);
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
      String _findPackageName = this.extensions.findPackageName(application);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_findPackageName);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
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
  
  public CharSequence body(final AbstractActivity activity, final ImportManager manager) {
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
