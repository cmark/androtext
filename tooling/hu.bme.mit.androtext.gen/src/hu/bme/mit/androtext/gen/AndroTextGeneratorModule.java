package hu.bme.mit.androtext.gen;

import org.eclipse.xtext.service.AbstractGenericModule;

public class AndroTextGeneratorModule extends AbstractGenericModule {

	public Class<? extends IMainGenerator> bindIMainGenerator() {
		return hu.bme.mit.androtext.gen.AndroTextGeneratorMain.class;
	}
	
	public Class<? extends IAbstractActivityGenerator> bindIAbstractActivityGenerator() {
		return hu.bme.mit.androtext.gen.activity.AbstractActivityClassGenerator.class;
	}
	
}
