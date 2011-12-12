package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.activity.BaseGameActivityMethodGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AbstractActivityMethodGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  @Inject
  private BaseGameActivityMethodGenerator _baseGameActivityMethodGenerator;
  
  protected StringConcatenation _generateMethods(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateMethods(final BaseGameActivity activity) {
    StringConcatenation _methods = this._baseGameActivityMethodGenerator.methods(activity);
    return _methods;
  }
  
  public StringConcatenation generateMethods(final Activity activity) {
    if (activity instanceof BaseGameActivity) {
      return _generateMethods((BaseGameActivity)activity);
    } else {
      return _generateMethods(activity);
    }
  }
}
