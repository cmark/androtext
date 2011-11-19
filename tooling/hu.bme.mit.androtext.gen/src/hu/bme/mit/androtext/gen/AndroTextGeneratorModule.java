package hu.bme.mit.androtext.gen;

import org.eclipse.xtext.service.AbstractGenericModule;

public class AndroTextGeneratorModule extends AbstractGenericModule {

	public Class<? extends AndroTextGeneratorMain> bindAndroTextGeneratorMain() {
		return hu.bme.mit.androtext.gen.AndroTextGeneratorMain.class;
	}
	
}
