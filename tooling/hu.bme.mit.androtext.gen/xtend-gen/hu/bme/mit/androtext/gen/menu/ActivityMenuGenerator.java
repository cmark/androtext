package hu.bme.mit.androtext.gen.menu;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuElement;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuGroup;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ActivityMenuGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    AndroidApplication _application = androidApplication.getApplication();
    EList<AndroidApplicationModelElement> _modelElements = _application.getModelElements();
    Iterable<Activity> _filter = IterableExtensions.<Activity>filter(_modelElements, hu.bme.mit.androtext.lang.androTextDsl.Activity.class);
    for (final Activity activity : _filter) {
      ActivityMenu _menu = activity.getMenu();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_menu, null);
      if (_operator_notEquals) {
        ActivityMenu _menu_1 = activity.getMenu();
        String _menuResourceFileName = this._generatorExtensions.menuResourceFileName(_menu_1);
        String _operator_plus = StringExtensions.operator_plus(_menuResourceFileName, ".xml");
        ActivityMenu _menu_2 = activity.getMenu();
        StringConcatenation _generate = this.generate(_menu_2, true);
        fsa.generateFile(_operator_plus, IGeneratorSlots.MENU_SLOT, _generate);
      }
    }
  }
  
  public StringConcatenation generate(final ActivityMenu menu, final boolean isRoot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (isRoot) {
        StringConcatenation _xmlHeader = this._generatorExtensions.xmlHeader(menu);
        _builder.append(_xmlHeader, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("<menu ");
    {
      if (isRoot) {
        StringConcatenation _androidSchema = this._generatorExtensions.androidSchema(menu);
        String _string = _androidSchema.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<ActivityMenuElement> _menuElements = menu.getMenuElements();
      for(final ActivityMenuElement element : _menuElements) {
        _builder.append("\t");
        StringConcatenation _generate = this.generate(element);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</menu>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final ActivityMenuElement element) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final ActivityMenuItem element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<item android:id=\"@+id/");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    _builder.append("android:title=\"");
    String _title = element.getTitle();
    _builder.append(_title, "	  ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    _builder.append("android:icon=\"");
    AnyDrawablePropertyValue _icon = element.getIcon();
    StringConcatenation _backgroundValue = this._propertyValueGenerator.backgroundValue(_icon);
    String _string = _backgroundValue.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "	  ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      ActivityMenu _subMenu = element.getSubMenu();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_subMenu, null);
      if (_operator_notEquals) {
        _builder.append("\t  ");
        ActivityMenu _subMenu_1 = element.getSubMenu();
        StringConcatenation _generate = this.generate(_subMenu_1, false);
        _builder.append(_generate, "	  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</item>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final ActivityMenuGroup element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<group android:id=\"@+id/");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<ActivityMenuItem> _menuItems = element.getMenuItems();
      for(final ActivityMenuItem item : _menuItems) {
        _builder.append("\t");
        StringConcatenation _generate = this.generate(item);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</group>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate(final ActivityMenuElement element) {
    if (element instanceof ActivityMenuGroup) {
      return _generate((ActivityMenuGroup)element);
    } else if (element instanceof ActivityMenuItem) {
      return _generate((ActivityMenuItem)element);
    } else {
      return _generate(element);
    }
  }
}
