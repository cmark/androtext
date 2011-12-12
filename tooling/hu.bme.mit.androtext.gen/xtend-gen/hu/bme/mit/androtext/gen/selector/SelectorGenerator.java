package hu.bme.mit.androtext.gen.selector;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.List;
import org.eclipse.emf.common.util.EList;
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
public class SelectorGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication application) {
    EList<Resource> _resources = resourceSet.getResources();
    final Function1<Resource,Iterable<Tab>> _function = new Function1<Resource,Iterable<Tab>>() {
        public Iterable<Tab> apply(final Resource r) {
          Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(r);
          Iterable<Tab> _filter = IterableExtensions.<Tab>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.Tab.class);
          return _filter;
        }
      };
    List<Iterable<Tab>> _map = ListExtensions.<Resource, Iterable<Tab>>map(_resources, _function);
    Iterable<Tab> _flatten = IterableExtensions.<Tab>flatten(_map);
    for (final Tab tab : _flatten) {
      TabDrawableResourceLink _drawable = tab.getDrawable();
      TabDrawableResource _link = _drawable.getLink();
      String _name = _link.getName();
      String _operator_plus = StringExtensions.operator_plus(_name, ".xml");
      TabDrawableResourceLink _drawable_1 = tab.getDrawable();
      TabDrawableResource _link_1 = _drawable_1.getLink();
      StringConcatenation _generate = this.generate(_link_1);
      fsa.generateFile(_operator_plus, IGeneratorSlots.DRAWABLE_SLOT, _generate);
    }
  }
  
  public StringConcatenation generate(final TabDrawableResource resource) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _xmlHeader = this._generatorExtensions.xmlHeader(resource);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<selector ");
    StringConcatenation _androidSchema = this._generatorExtensions.androidSchema(resource);
    _builder.append(_androidSchema, "");
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<item android:drawable=\"@drawable/");
    BitmapDrawableResource _selected = resource.getSelected();
    String _filename = _selected.getFilename();
    _builder.append(_filename, "    ");
    _builder.append("\" android:state_selected=\"true\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<item android:drawable=\"@drawable/");
    BitmapDrawableResource _unselected = resource.getUnselected();
    String _filename_1 = _unselected.getFilename();
    _builder.append(_filename_1, "    ");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("</selector>");
    _builder.newLine();
    return _builder;
  }
}
