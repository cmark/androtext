package hu.bme.mit.androtext.gen.menu;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.layout.PropertyValueGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuElement;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuGroup;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationComponent;
import hu.bme.mit.androtext.lang.androTextDsl.PropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ActivityMenuGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private PropertyValueGenerator _propertyValueGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    AndroidApplication _application = androidApplication.getApplication();
    EList<AndroidApplicationComponent> _components = _application.getComponents();
    Iterable<AbstractActivity> _filter = Iterables.<AbstractActivity>filter(_components, AbstractActivity.class);
    final List<AbstractActivity> activities = IterableExtensions.<AbstractActivity>toList(_filter);
    AndroidApplication _application_1 = androidApplication.getApplication();
    AbstractActivity _mainActivity = _application_1.getMainActivity();
    List<AbstractActivity> _singletonList = Collections.<AbstractActivity>singletonList(_mainActivity);
    Iterables.<AbstractActivity>addAll(activities, _singletonList);
    for (final AbstractActivity activity : activities) {
      {
        ActivityMenu _menu = activity.getMenu();
        boolean _notEquals = (!Objects.equal(_menu, null));
        if (_notEquals) {
          ActivityMenu _menu_1 = activity.getMenu();
          String _menuResourceFileName = this._generatorExtensions.menuResourceFileName(_menu_1);
          String _plus = (_menuResourceFileName + ".xml");
          ActivityMenu _menu_2 = activity.getMenu();
          CharSequence _generate = this.generate(_menu_2, true);
          fsa.generateFile(_plus, IGeneratorSlots.MENU_SLOT, _generate);
        }
        ActivityMenu _contextMenu = activity.getContextMenu();
        boolean _notEquals_1 = (!Objects.equal(_contextMenu, null));
        if (_notEquals_1) {
          ActivityMenu _contextMenu_1 = activity.getContextMenu();
          String _menuResourceFileName_1 = this._generatorExtensions.menuResourceFileName(_contextMenu_1);
          String _plus_1 = (_menuResourceFileName_1 + ".xml");
          ActivityMenu _contextMenu_2 = activity.getContextMenu();
          CharSequence _generate_1 = this.generate(_contextMenu_2, true);
          fsa.generateFile(_plus_1, IGeneratorSlots.MENU_SLOT, _generate_1);
        }
      }
    }
  }
  
  protected CharSequence _generate(final ActivityMenu menu, final boolean isRoot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (isRoot) {
        CharSequence _xmlHeader = this._generatorExtensions.xmlHeader(menu);
        _builder.append(_xmlHeader, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("<menu ");
    {
      if (isRoot) {
        CharSequence _androidSchema = this._generatorExtensions.androidSchema(menu);
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
        CharSequence _generate = this.generate(element);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</menu>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final ActivityMenuElement element) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generate(final ActivityMenuItem element) {
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
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("android:title=\"");
        String _title_1 = element.getTitle();
        _builder.append(_title_1, "	  ");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    {
      PropertyValue _icon = element.getIcon();
      boolean _notEquals = (!Objects.equal(_icon, null));
      if (_notEquals) {
        _builder.append("android:icon=\"");
        PropertyValue _icon_1 = element.getIcon();
        Object _generateValue = this._propertyValueGenerator.generateValue(_icon_1);
        _builder.append(_generateValue, "	  ");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      ActivityMenu _subMenu = element.getSubMenu();
      boolean _notEquals_1 = (!Objects.equal(_subMenu, null));
      if (_notEquals_1) {
        _builder.append("\t  ");
        ActivityMenu _subMenu_1 = element.getSubMenu();
        CharSequence _generate = this.generate(_subMenu_1, false);
        _builder.append(_generate, "	  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</item>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final ActivityMenuGroup element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<group ");
    {
      String _name = element.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
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
        CharSequence _generate = this.generate(item);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</group>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final ActivityMenu menu, final boolean isRoot) {
    {
      return _generate(menu, isRoot);
    }
  }
  
  public CharSequence generate(final ActivityMenuElement element) {
    if (element instanceof ActivityMenuGroup) {
      return _generate((ActivityMenuGroup)element);
    } else if (element instanceof ActivityMenuItem) {
      return _generate((ActivityMenuItem)element);
    } else if (element != null) {
      return _generate(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
