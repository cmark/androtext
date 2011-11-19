package hu.bme.mit.androtext.gen.ui.internal;

import hu.bme.mit.androtext.gen.AndroTextGeneratorModule;
import hu.bme.mit.androtext.gen.ui.AndroTextGeneratorUIModule;
import hu.bme.mit.androtext.lang.AndroTextDslRuntimeModule;
import hu.bme.mit.androtext.lang.ui.AndroTextDslUiModule;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Activator extends AbstractUIPlugin {
	private Injector injector;
	private static Activator INSTANCE;

	public Injector getInjector() {
		return injector;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			AndroTextGeneratorModule genModule = new AndroTextGeneratorModule();
			AndroTextGeneratorUIModule genUiModule = new AndroTextGeneratorUIModule(this);
			SharedStateModule shared = new SharedStateModule();
		    injector = Guice.createInjector(Modules2.mixin(new AndroTextDslRuntimeModule(), shared, new AndroTextDslUiModule(this), genModule, genUiModule));
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injector = null;
		super.stop(context);
	}
	
	public static Activator getInstance() {
		return INSTANCE;
	}
	
}