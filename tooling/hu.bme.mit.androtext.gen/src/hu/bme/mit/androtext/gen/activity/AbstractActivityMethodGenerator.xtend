package hu.bme.mit.androtext.gen.activity

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.util.GeneratorExtensions
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity

class AbstractActivityMethodGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension BaseGameActivityMethodGenerator
	@Inject extension SimpleActivityMethodGenerator
	
	def dispatch generateMethods(BaseGameActivity activity) {
		activity.gameMethods
	}
	
	def dispatch generateMethods(AbstractActivity activity) {
		activity.simpleMethods
	}
	
}