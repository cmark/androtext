package handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.validation.core.Constraint;

import patternmatchers.androtext.ApplicationMainActivityIsTabActivityMatcher;
import signatures.androtext.ApplicationMainActivityIsTabActivitySignature;

public class ActivityConstraint extends Constraint<ApplicationMainActivityIsTabActivitySignature> {

	@Override
	public String getMessage(ApplicationMainActivityIsTabActivitySignature arg0) {
		return "This is an Android Application with tabbed main Activity!";
	}

	@Override
	public IMatcherFactory<ApplicationMainActivityIsTabActivitySignature, ? extends IncQueryMatcher<ApplicationMainActivityIsTabActivitySignature>> matcherFactory() {
		return ApplicationMainActivityIsTabActivityMatcher.FACTORY;
	}

	@Override
	public EObject getLocationObject(
			ApplicationMainActivityIsTabActivitySignature arg0) {
		if (arg0.getValueOfApplication() instanceof EObject) {
			return (EObject) arg0.getValueOfApplication();
		}
		return null;
	}

}