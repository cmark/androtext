package hu.bme.mit.androtext.gen.layout;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
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
public class TabLayoutGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication application) {
    EList<Resource> _resources = resourceSet.getResources();
    final Function1<Resource,Iterable<TabActivity>> _function = new Function1<Resource,Iterable<TabActivity>>() {
        public Iterable<TabActivity> apply(final Resource r) {
          Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(r);
          Iterable<TabActivity> _filter = IterableExtensions.<TabActivity>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.TabActivity.class);
          return _filter;
        }
      };
    List<Iterable<TabActivity>> _map = ListExtensions.<Resource, Iterable<TabActivity>>map(_resources, _function);
    Iterable<TabActivity> _flatten = IterableExtensions.<TabActivity>flatten(_map);
    for (final TabActivity tabactivity : _flatten) {
      String _tabActivityLayout = this._generatorExtensions.tabActivityLayout(tabactivity);
      String _operator_plus = StringExtensions.operator_plus(_tabActivityLayout, ".xml");
      StringConcatenation _generateLayout = this.generateLayout(tabactivity);
      fsa.generateFile(_operator_plus, IGeneratorSlots.LAYOUT_SLOT, _generateLayout);
    }
  }
  
  public StringConcatenation generateLayout(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<TabHost xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@android:id/tabhost\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_height=\"fill_parent\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:orientation=\"vertical\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"fill_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:padding=\"5dp\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<TabWidget");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:id=\"@android:id/tabs\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_height=\"wrap_content\" />");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<FrameLayout");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:id=\"@android:id/tabcontent\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_width=\"fill_parent\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_height=\"fill_parent\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:padding=\"5dp\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</LinearLayout>");
    _builder.newLine();
    _builder.append("</TabHost>");
    _builder.newLine();
    return _builder;
  }
}
