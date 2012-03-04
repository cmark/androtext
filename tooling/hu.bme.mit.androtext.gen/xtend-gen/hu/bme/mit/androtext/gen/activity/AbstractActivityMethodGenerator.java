package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.activity.BaseGameActivityMethodGenerator;
import hu.bme.mit.androtext.gen.activity.SimpleActivityMethodGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AbstractActivityMethodGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private BaseGameActivityMethodGenerator _baseGameActivityMethodGenerator;
  
  @Inject
  private SimpleActivityMethodGenerator _simpleActivityMethodGenerator;
  
  protected StringConcatenation _generateMethods(final BaseGameActivity activity) {
    StringConcatenation _gameMethods = this._baseGameActivityMethodGenerator.gameMethods(activity);
    return _gameMethods;
  }
  
  protected StringConcatenation _generateMethods(final AbstractActivity activity) {
    StringConcatenation _simpleMethods = this._simpleActivityMethodGenerator.simpleMethods(activity);
    return _simpleMethods;
  }
  
  public StringConcatenation generateMethods(final AbstractActivity activity) {
    if (activity instanceof BaseGameActivity) {
      return _generateMethods((BaseGameActivity)activity);
    } else {
      return _generateMethods(activity);
    }
  }
}
