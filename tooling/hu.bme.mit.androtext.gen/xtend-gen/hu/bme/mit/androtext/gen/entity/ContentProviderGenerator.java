package hu.bme.mit.androtext.gen.entity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationComponent;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ContentProviderGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions generatorExtensions;
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    AndroidApplication _application = androidApplication.getApplication();
    EList<AndroidApplicationComponent> _components = _application.getComponents();
    Iterable<DatabaseContentProvider> _filter = IterableExtensions.<DatabaseContentProvider>filter(_components, hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider.class);
    for (final DatabaseContentProvider databaseContentProvider : _filter) {
      String _javaFileName = this.generatorExtensions.javaFileName(databaseContentProvider);
      StringConcatenation _generate = this.generate(databaseContentProvider, androidApplication);
      fsa.generateFile(_javaFileName, IGeneratorSlots.SRC_DATA_SLOT, _generate);
    }
  }
  
  public StringConcatenation generate(final DatabaseContentProvider contentProvider, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _dataPackageName = this.generatorExtensions.dataPackageName(application);
    _builder.append(_dataPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.content.ContentValues;");
    _builder.newLine();
    _builder.append("import android.net.Uri;");
    _builder.newLine();
    _builder.newLine();
    StringConcatenation _body = this.body(contentProvider, application);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation body(final DatabaseContentProvider contentProvider, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _className = this.generatorExtensions.className(contentProvider);
    _builder.append(_className, "");
    _builder.append(" extends ");
    String _abstractClassName = this.generatorExtensions.abstractClassName(contentProvider);
    _builder.append(_abstractClassName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void setDefaultValuesFor(Uri uri, ContentValues values) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// set default content values when inserting a new entity, called when insert called in provider");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String getNullColumnHack(Uri uri) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// specify the nullcolumnhack if needed when inserting new entity");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
