
package hu.bme.mit.androtext.lang;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AndroTextDslStandaloneSetup extends AndroTextDslStandaloneSetupGenerated{

	public static void doSetup() {
		new AndroTextDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

