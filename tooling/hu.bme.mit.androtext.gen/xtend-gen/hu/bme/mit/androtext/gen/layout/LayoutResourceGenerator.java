package hu.bme.mit.androtext.gen.layout;

import com.google.common.collect.Iterables;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

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
          TreeIterator<EObject> _allContents = r.getAllContents();
          Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
          Iterable<AndroGuiModelRoot> _filter = Iterables.<AndroGuiModelRoot>filter(_iterable, AndroGuiModelRoot.class);
          return _filter;
        }
      };
    List<Iterable<AndroGuiModelRoot>> _map = ListExtensions.<Resource, Iterable<AndroGuiModelRoot>>map(_resources, _function);
    Iterable<AndroGuiModelRoot> _flatten = Iterables.<AndroGuiModelRoot>concat(_map);
    for (final AndroGuiModelRoot guimodel : _flatten) {
      EList<View> _roots = guimodel.getRoots();
      for (final View root : _roots) {
        String _layoutName = this._generatorExtensions.layoutName(root);
        String _plus = (_layoutName + ".xml");
        CharSequence _generate = this.generate(root);
        fsa.generateFile(_plus, IGeneratorSlots.LAYOUT_SLOT, _generate);
      }
    }
  }
  
  public CharSequence generate(final View root) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xmlHeader = this._generatorExtensions.xmlHeader(root);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    EClass _eClass = root.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    CharSequence _androidSchema = this._generatorExtensions.androidSchema(root);
    _builder.append(_androidSchema, "");
    _builder.append(" ");
    CharSequence _generateAttributes = this._viewAttributeGenerator.generateAttributes(root);
    String _string = _generateAttributes.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateElements = this.generateElements(root);
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
  
  public CharSequence uielement(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _startTag = this.startTag(element);
    _builder.append(_startTag, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateElements = this.generateElements(element);
    _builder.append(_generateElements, "	");
    _builder.newLineIfNotEmpty();
    CharSequence _endTag = this.endTag(element);
    _builder.append(_endTag, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _startTag(final ViewElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<View ");
    CharSequence _generateAttributes = this._viewAttributeGenerator.generateAttributes(element);
    String _string = _generateAttributes.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _startTag(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    EClass _eClass = element.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    CharSequence _generateAttributes = this._viewAttributeGenerator.generateAttributes(element);
    String _string = _generateAttributes.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _endTag(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</");
    EClass _eClass = element.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _endTag(final ViewElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</View>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateElements(final View element) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateElements(final ViewGroup layout) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<View> _views = layout.getViews();
      for(final View e : _views) {
        CharSequence _uielement = this.uielement(e);
        _builder.append(_uielement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence startTag(final View element) {
    if (element instanceof ViewElement) {
      return _startTag((ViewElement)element);
    } else if (element != null) {
      return _startTag(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
  
  public CharSequence endTag(final View element) {
    if (element instanceof ViewElement) {
      return _endTag((ViewElement)element);
    } else if (element != null) {
      return _endTag(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
  
  public CharSequence generateElements(final View layout) {
    if (layout instanceof ViewGroup) {
      return _generateElements((ViewGroup)layout);
    } else if (layout != null) {
      return _generateElements(layout);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(layout).toString());
    }
  }
}
