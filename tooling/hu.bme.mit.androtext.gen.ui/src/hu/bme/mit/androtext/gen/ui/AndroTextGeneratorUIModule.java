package hu.bme.mit.androtext.gen.ui;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;

public class AndroTextGeneratorUIModule extends AbstractGenericModule {

private final AbstractUIPlugin plugin;
    
    public AndroTextGeneratorUIModule (AbstractUIPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        binder.bind(AbstractUIPlugin.class).toInstance(plugin);
        binder.bind(IDialogSettings.class).toInstance(plugin.getDialogSettings());
    }
    /**
     * Bind the JavaProjectBasedBuilderParticipant in order to invoke the generator during the build.
     */
	public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return hu.bme.mit.androtext.gen.ui.builder.AndroTextBuilderParticipant.class;
	}
	
}
