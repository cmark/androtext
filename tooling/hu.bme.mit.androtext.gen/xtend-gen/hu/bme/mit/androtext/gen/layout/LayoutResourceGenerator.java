package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.layout.ViewAttributeGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LayoutResourceGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private ViewAttributeGenerator _viewAttributeGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    EList<Resource> _resources = resourceSet.getResources();
    final Function1<Resource,Iterable<AndroGuiModelRoot>> _function = new Function1<Resource,Iterable<AndroGuiModelRoot>>() {
        public Iterable<AndroGuiModelRoot> apply(final Resource r) {
          Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(r);
          Iterable<AndroGuiModelRoot> _filter = IterableExtensions.<AndroGuiModelRoot>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot.class);
          return _filter;
        }
      };
    List<Iterable<AndroGuiModelRoot>> _map = ListExtensions.<Resource, Iterable<AndroGuiModelRoot>>map(_resources, _function);
    Iterable<AndroGuiModelRoot> _flatten = IterableExtensions.<AndroGuiModelRoot>flatten(_map);
    for (final AndroGuiModelRoot guimodel : _flatten) {
      EList<View> _roots = guimodel.getRoots();
      for (final View root : _roots) {
        String _layoutName = this._generatorExtensions.layoutName(root);
        String _operator_plus = StringExtensions.operator_plus(_layoutName, ".xml");
        StringConcatenation _generate = this.generate(root);
        fsa.generateFile(_operator_plus, IGeneratorSlots.LAYOUT_SLOT, _generate);
      }
    }
  }
  
  public StringConcatenation generate(final View root) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _xmlHeader = this._generatorExtensions.xmlHeader(root);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    EClass _eClass = root.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    StringConcatenation _androidSchema = this._generatorExtensions.androidSchema(root);
    _builder.append(_androidSchema, "");
    _builder.append(" ");
    StringConcatenation _attributes = this._viewAttributeGenerator.attributes(root);
    String _string = _attributes.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _generateElements = this.generateElements(root);
    _builder.append(_generateElements, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</");
    EClass _eClass_1 = root.eClass();
    String _name_1 = _eClass_1.getName();
    _builder.append(_name_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation uielement(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _startTag = this.startTag(element);
    _builder.append(_startTag, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _generateElements = this.generateElements(element);
    _builder.append(_generateElements, "	");
    _builder.newLineIfNotEmpty();
    StringConcatenation _endTag = this.endTag(element);
    _builder.append(_endTag, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _startTag(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    EClass _eClass = element.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    StringConcatenation _attributes = this._viewAttributeGenerator.attributes(element);
    String _string = _attributes.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _startTag(final ViewElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<View ");
    StringConcatenation _attributes = this._viewAttributeGenerator.attributes(element);
    String _string = _attributes.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _endTag(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</");
    EClass _eClass = element.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _endTag(final ViewElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</View>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generateElements(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateElements(final ViewGroup layout) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<View> _views = layout.getViews();
      for(final View e : _views) {
        StringConcatenation _uielement = this.uielement(e);
        _builder.append(_uielement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation startTag(final View element) {
    if (element instanceof ViewElement) {
      return _startTag((ViewElement)element);
    } else {
      return _startTag(element);
    }
  }
  
  public StringConcatenation endTag(final View element) {
    if (element instanceof ViewElement) {
      return _endTag((ViewElement)element);
    } else {
      return _endTag(element);
    }
  }
  
  public StringConcatenation generateElements(final View layout) {
    if (layout instanceof ViewGroup) {
      return _generateElements((ViewGroup)layout);
    } else {
      return _generateElements(layout);
    }
  }
}
