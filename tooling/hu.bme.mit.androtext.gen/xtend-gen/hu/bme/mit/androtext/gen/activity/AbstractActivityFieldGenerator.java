package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.Font;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;
import hu.bme.mit.androtext.lang.androTextDsl.Tiled;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AbstractActivityFieldGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  protected StringConcatenation _generateFields(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateFields(final ListActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_and = false;
      boolean _operator_and_1 = false;
      DataBinding _databinding = activity.getDatabinding();
      boolean _isFetchAll = _databinding.isFetchAll();
      if (!_isFetchAll) {
        _operator_and_1 = false;
      } else {
        DataBinding _databinding_1 = activity.getDatabinding();
        ContentProvider _contentProvider = _databinding_1.getContentProvider();
        _operator_and_1 = BooleanExtensions.operator_and(_isFetchAll, (_contentProvider instanceof DatabaseContentProvider));
      }
      if (!_operator_and_1) {
        _operator_and = false;
      } else {
        DataBinding _databinding_2 = activity.getDatabinding();
        Entity _entity = _databinding_2.getEntity();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_entity, null);
        _operator_and = BooleanExtensions.operator_and(_operator_and_1, _operator_notEquals);
      }
      if (_operator_and) {
        _builder.append("protected final static String[] PROJECTION = new String[] {");
        _builder.newLine();
        _builder.append("\t");
        DataBinding _databinding_3 = activity.getDatabinding();
        Entity _entity_1 = _databinding_3.getEntity();
        String _columnsClassName = this._generatorExtensions.columnsClassName(_entity_1);
        _builder.append(_columnsClassName, "	");
        _builder.append("._ID,");
        _builder.newLineIfNotEmpty();
        {
          DataBinding _databinding_4 = activity.getDatabinding();
          EList<Property> _projection = _databinding_4.getProjection();
          boolean hasAnyElements = false;
          for(final Property p : _projection) {
            if (!hasAnyElements) {
              hasAnyElements = true;
            } else {
              _builder.appendImmediate(",", "	");
            }
            _builder.append("\t");
            DataBinding _databinding_5 = activity.getDatabinding();
            Entity _entity_2 = _databinding_5.getEntity();
            String _columnsClassName_1 = this._generatorExtensions.columnsClassName(_entity_2);
            _builder.append(_columnsClassName_1, "	");
            _builder.append(".");
            String _name = p.getName();
            String _upperCase = _name.toUpperCase();
            _builder.append(_upperCase, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("};");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generateFields(final TabActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateFields(final BaseGameActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected Camera mCamera;");
    _builder.newLine();
    _builder.append("protected Scene mScene;");
    _builder.newLine();
    {
      Scene _scene = activity.getScene();
      Resource _eResource = _scene.eResource();
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
      Iterable<TextureRegion> _filter = IterableExtensions.<TextureRegion>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.TextureRegion.class);
      for(final TextureRegion t : _filter) {
        _builder.append("protected ");
        {
          Tiled _tiled = t.getTiled();
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_tiled, null);
          if (_operator_notEquals) {
            _builder.append("Tiled");
          }
        }
        _builder.append("TextureRegion ");
        StringConcatenation _textureRegionFieldName = this._generatorExtensions.textureRegionFieldName(t);
        String _string = _textureRegionFieldName.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Scene _scene_1 = activity.getScene();
      Resource _eResource_1 = _scene_1.eResource();
      Iterable<EObject> _allContentsIterable_1 = ResourceExtensions.allContentsIterable(_eResource_1);
      Iterable<Font> _filter_1 = IterableExtensions.<Font>filter(_allContentsIterable_1, hu.bme.mit.androtext.lang.androTextDsl.Font.class);
      for(final Font f : _filter_1) {
        _builder.append("protected Font ");
        StringConcatenation _fontFieldName = this._generatorExtensions.fontFieldName(f);
        String _string_1 = _fontFieldName.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Scene _scene_2 = activity.getScene();
      Resource _eResource_2 = _scene_2.eResource();
      Iterable<EObject> _allContentsIterable_2 = ResourceExtensions.allContentsIterable(_eResource_2);
      Iterable<GameEntity> _filter_2 = IterableExtensions.<GameEntity>filter(_allContentsIterable_2, hu.bme.mit.androtext.lang.androTextDsl.GameEntity.class);
      for(final GameEntity e : _filter_2) {
        _builder.append("protected ");
        StringConcatenation _type = this._generatorExtensions.type(e);
        String _string_2 = _type.toString();
        String _trim_2 = _string_2.trim();
        _builder.append(_trim_2, "");
        _builder.append(" ");
        StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(e);
        String _string_3 = _entityFieldName.toString();
        String _trim_3 = _string_3.trim();
        _builder.append(_trim_3, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Scene _scene_3 = activity.getScene();
      Resource _eResource_3 = _scene_3.eResource();
      Iterable<EObject> _allContentsIterable_3 = ResourceExtensions.allContentsIterable(_eResource_3);
      Iterable<AndroGameLogic> _filter_3 = IterableExtensions.<AndroGameLogic>filter(_allContentsIterable_3, hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic.class);
      for(final AndroGameLogic logic : _filter_3) {
        {
          boolean _containsBox2DObject = this._generatorExtensions.containsBox2DObject(logic);
          if (_containsBox2DObject) {
            _builder.append("protected PhysicsWorld mPhysicsWorld;");
            _builder.newLine();
          }
        }
      }
    }
    {
      Scene _scene_4 = activity.getScene();
      Resource _eResource_4 = _scene_4.eResource();
      Iterable<EObject> _allContentsIterable_4 = ResourceExtensions.allContentsIterable(_eResource_4);
      Iterable<MenuScene> _filter_4 = IterableExtensions.<MenuScene>filter(_allContentsIterable_4, hu.bme.mit.androtext.lang.androTextDsl.MenuScene.class);
      for(final MenuScene menu : _filter_4) {
        _builder.append("protected MenuScene ");
        StringConcatenation _menuSceneFieldName = this._generatorExtensions.menuSceneFieldName(menu);
        String _string_4 = _menuSceneFieldName.toString();
        String _trim_4 = _string_4.trim();
        _builder.append(_trim_4, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    String _menuItemFields = this.menuItemFields(activity);
    String _string_5 = _menuItemFields.toString();
    String _trim_5 = _string_5.trim();
    _builder.append(_trim_5, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String menuItemFields(final BaseGameActivity activity) {
      StringBuffer _stringBuffer = new StringBuffer();
      StringBuffer buffer = _stringBuffer;
      GameMenuItem prev = null;
      ArrayList<GameMenuItem> _findAllGameMenuItems = this._generatorExtensions.findAllGameMenuItems(activity);
      for (final GameMenuItem item : _findAllGameMenuItems) {
        {
          boolean _operator_equals = ObjectExtensions.operator_equals(prev, null);
          if (_operator_equals) {
            StringConcatenation _firstMenuItem = this.firstMenuItem(item);
            buffer.append(_firstMenuItem);
          } else {
            StringConcatenation _afterFirstMenuItem = this.afterFirstMenuItem(item, prev);
            buffer.append(_afterFirstMenuItem);
          }
          prev = item;
        }
      }
      String _string = buffer.toString();
      return _string;
  }
  
  public StringConcatenation firstMenuItem(final GameMenuItem item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static final int ");
    String _name = item.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append(" = 0;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation afterFirstMenuItem(final GameMenuItem item, final GameMenuItem prev) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static final int ");
    String _name = item.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append(" = ");
    String _name_1 = prev.getName();
    String _upperCase_1 = _name_1.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append(" + 1;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generateFields(final Activity activity) {
    if (activity instanceof BaseGameActivity) {
      return _generateFields((BaseGameActivity)activity);
    } else if (activity instanceof ListActivity) {
      return _generateFields((ListActivity)activity);
    } else if (activity instanceof TabActivity) {
      return _generateFields((TabActivity)activity);
    } else {
      return _generateFields(activity);
    }
  }
}
