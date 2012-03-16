package hu.bme.mit.androtext.gen.menu;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityContextMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuElement;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuGroup;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
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
      Iterable<AbstractActivity> _filter = IterableExtensions.<AbstractActivity>filter(_modelElements, hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity.class);
      List<AbstractActivity> _list = IterableExtensions.<AbstractActivity>toList(_filter);
      final List<AbstractActivity> activities = _list;
      AndroidApplication _application_1 = androidApplication.getApplication();
      AbstractActivity _mainActivity = _application_1.getMainActivity();
      List<AbstractActivity> _singletonList = Collections.<AbstractActivity>singletonList(_mainActivity);
      Iterables.<AbstractActivity>addAll(activities, _singletonList);
      for (final AbstractActivity activity : activities) {
        {
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
          ActivityContextMenu _contextMenu = activity.getContextMenu();
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_contextMenu, null);
          if (_operator_notEquals_1) {
            ActivityContextMenu _contextMenu_1 = activity.getContextMenu();
            String _menuResourceFileName_1 = this._generatorExtensions.menuResourceFileName(_contextMenu_1);
            String _operator_plus_1 = StringExtensions.operator_plus(_menuResourceFileName_1, ".xml");
            ActivityContextMenu _contextMenu_2 = activity.getContextMenu();
            StringConcatenation _generate_1 = this.generate(_contextMenu_2, true);
            fsa.generateFile(_operator_plus_1, IGeneratorSlots.MENU_SLOT, _generate_1);
          }
        }
      }
  }
  
  protected StringConcatenation _generate(final ActivityMenu menu, final boolean isRoot) {
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
  
  protected StringConcatenation _generate(final ActivityContextMenu menu, final boolean isRoot) {
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
    {
      String _title = element.getTitle();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_title);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("android:title=\"");
        String _title_1 = element.getTitle();
        _builder.append(_title_1, "	  ");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    {
      AnyDrawablePropertyValue _icon = element.getIcon();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_icon, null);
      if (_operator_notEquals) {
        _builder.append("android:icon=\"");
        AnyDrawablePropertyValue _icon_1 = element.getIcon();
        StringConcatenation _backgroundValue = this._propertyValueGenerator.backgroundValue(_icon_1);
        String _string = _backgroundValue.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "	  ");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      ActivityMenu _subMenu = element.getSubMenu();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_subMenu, null);
      if (_operator_notEquals_1) {
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
    _builder.append("<group ");
    {
      String _name = element.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("android:id=\"@+id/");
        String _name_1 = element.getName();
        _builder.append(_name_1, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<ActivityMenuElement> _menuItems = element.getMenuItems();
      for(final ActivityMenuElement item : _menuItems) {
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
  
  public StringConcatenation generate(final EObject menu, final boolean isRoot) {
    if (menu instanceof ActivityContextMenu) {
      return _generate((ActivityContextMenu)menu, isRoot);
    } else if (menu instanceof ActivityMenu) {
      return _generate((ActivityMenu)menu, isRoot);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(menu, isRoot).toString());
    }
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
