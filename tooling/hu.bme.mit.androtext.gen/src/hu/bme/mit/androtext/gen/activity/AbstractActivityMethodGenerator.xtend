package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.Activity
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity

class AbstractActivityMethodGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension BaseGameActivityMethodGenerator
	
	def dispatch generateMethods(Activity activity) ''''''
	def dispatch generateMethods(BaseGameActivity activity) {
		activity.methods
	}
	
}