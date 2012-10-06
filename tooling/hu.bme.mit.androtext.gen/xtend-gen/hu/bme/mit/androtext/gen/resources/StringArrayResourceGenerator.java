package hu.bme.mit.androtext.gen.resources;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class StringArrayResourceGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions extensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    EList<Resource> _resources = resourceSet.getResources();
    final Function1<Resource,Iterable<StringArrayResource>> _function = new Function1<Resource,Iterable<StringArrayResource>>() {
        public Iterable<StringArrayResource> apply(final Resource r) {
          TreeIterator<EObject> _allContents = r.getAllContents();
          Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
          Iterable<StringArrayResource> _filter = Iterables.<StringArrayResource>filter(_iterable, StringArrayResource.class);
          return _filter;
        }
      };
    List<Iterable<StringArrayResource>> _map = ListExtensions.<Resource, Iterable<StringArrayResource>>map(_resources, _function);
    Iterable<StringArrayResource> _flatten = Iterables.<StringArrayResource>concat(_map);
    for (final StringArrayResource entries : _flatten) {
      String _name = entries.getName();
      String _plus = (_name + ".xml");
      CharSequence _generate = this.generate(entries);
      fsa.generateFile(_plus, IGeneratorSlots.VALUES_SLOT, _generate);
    }
  }
  
  public CharSequence generate(final StringArrayResource stringArrayResource) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xmlHeader = this.extensions.xmlHeader(stringArrayResource);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<resources>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string-array name=\"");
    String _name = stringArrayResource.getName();
    _builder.append(_name, "	");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<StringArrayEntry> _entries = stringArrayResource.getEntries();
      for(final StringArrayEntry entry : _entries) {
        _builder.append("\t\t");
        CharSequence _generate = this.generate(entry);
        String _string = _generate.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</string-array>");
    _builder.newLine();
    _builder.append("</resources>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final StringArrayEntry entry) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = entry.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("<item name=\"");
        String _name_1 = entry.getName();
        _builder.append(_name_1, "");
        _builder.append("\">");
        String _value = entry.getValue();
        _builder.append(_value, "");
        _builder.append("</item>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<item>");
        String _value_1 = entry.getValue();
        _builder.append(_value_1, "");
        _builder.append("</item>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
}
