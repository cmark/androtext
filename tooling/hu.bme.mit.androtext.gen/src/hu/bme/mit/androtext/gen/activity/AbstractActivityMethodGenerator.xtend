package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity

class AbstractActivityMethodGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension BaseGameActivityMethodGenerator
	@Inject extension SimpleActivityMethodGenerator
	
	def dispatch generateMethods(BaseGameActivity activity) {
		activity.gameMethods
	}
	
	def dispatch generateMethods(Activity activity) {
		activity.simpleMethods
	}
	
}