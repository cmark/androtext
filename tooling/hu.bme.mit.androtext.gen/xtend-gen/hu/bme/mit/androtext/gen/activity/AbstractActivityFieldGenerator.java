package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameBox2DLogic;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Font;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;
import hu.bme.mit.androtext.lang.androTextDsl.Tiled;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
      Iterable<AndroGameBox2DLogic> _filter_3 = IterableExtensions.<AndroGameBox2DLogic>filter(_allContentsIterable_3, hu.bme.mit.androtext.lang.androTextDsl.AndroGameBox2DLogic.class);
      for(final AndroGameBox2DLogic t_1 : _filter_3) {
        _builder.append("protected PhysicsWorld mPhysicsWorld;");
        _builder.newLine();
      }
    }
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
