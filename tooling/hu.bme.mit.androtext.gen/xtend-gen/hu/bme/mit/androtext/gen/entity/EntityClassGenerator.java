package hu.bme.mit.androtext.gen.entity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityClassGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions generatorExtensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    AndroidApplication _application = androidApplication.getApplication();
    EList<AndroidApplicationModelElement> _modelElements = _application.getModelElements();
    Iterable<DatabaseContentProvider> _filter = IterableExtensions.<DatabaseContentProvider>filter(_modelElements, hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider.class);
    for (final DatabaseContentProvider databaseContentProvider : _filter) {
      AndroDataModelRoot _datamodel = databaseContentProvider.getDatamodel();
      EList<Entity> _entities = _datamodel.getEntities();
      for (final Entity entity : _entities) {
        String _javaFileName = this.generatorExtensions.javaFileName(entity);
        StringConcatenation _generate = this.generate(entity, androidApplication);
        fsa.generateFile(_javaFileName, IGeneratorSlots.DATA_SLOT, _generate);
      }
    }
  }
  
  public StringConcatenation generate(final Entity e, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _body = this.body(e, importManager);
    final StringConcatenation body = _body;
    _builder.newLineIfNotEmpty();
    {
      String _findPackageName = this.generatorExtensions.findPackageName(application);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_findPackageName);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("package ");
        String _findPackageName_1 = this.generatorExtensions.findPackageName(application);
        _builder.append(_findPackageName_1, "");
        _builder.append(".data;");
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
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation body(final Entity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _className = this.generatorExtensions.className(e);
    _builder.append(_className, "");
    _builder.append(" ");
    String _superTypeClause = this.superTypeClause(e, importManager);
    _builder.append(_superTypeClause, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _properties = e.getProperties();
      for(final Property f : _properties) {
        _builder.append("\t");
        StringConcatenation _feature = this.feature(f, importManager);
        _builder.append(_feature, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _properties_1 = e.getProperties();
      for(final Property f_1 : _properties_1) {
        _builder.append("\t");
        StringConcatenation _ter = this.getter(f_1);
        _builder.append(_ter, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _properties_2 = e.getProperties();
      for(final Property f_2 : _properties_2) {
        _builder.append("\t");
        StringConcatenation _setter = this.setter(f_2);
        _builder.append(_setter, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String superTypeClause(final Entity e, final ImportManager importManager) {
    String _xifexpression = null;
    Entity _superType = e.getSuperType();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
    if (_operator_notEquals) {
      Entity _superType_1 = e.getSuperType();
      String _className = this.generatorExtensions.className(_superType_1);
      String _operator_plus = StringExtensions.operator_plus("extends ", _className);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " ");
      _xifexpression = _operator_plus_1;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public StringConcatenation feature(final Property f, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    TypeRef _type = f.getType();
    String _name = this.generatorExtensions.name(_type);
    _builder.append(_name, "");
    _builder.append(" ");
    String _featureName = this.generatorExtensions.featureName(f);
    _builder.append(_featureName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation getter(final Property f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    TypeRef _type = f.getType();
    String _name = this.generatorExtensions.name(_type);
    _builder.append(_name, "");
    _builder.append(" get");
    String _name_1 = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_2 = f.getName();
    _builder.append(_name_2, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation setter(final Property f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _name = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("(");
    TypeRef _type = f.getType();
    String _name_1 = this.generatorExtensions.name(_type);
    _builder.append(_name_1, "");
    _builder.append(" ");
    String _name_2 = f.getName();
    _builder.append(_name_2, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _featureName = this.generatorExtensions.featureName(f);
    _builder.append(_featureName, "	");
    _builder.append(" = ");
    String _name_3 = f.getName();
    _builder.append(_name_3, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
