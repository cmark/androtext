package hu.bme.mit.androtext.lang.scoping;

import java.util.Collections;

import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

/**
 * Custom strategy for computing ResourceDescription for androtext resources.
 * Adds boolean user data for View EObjectDescription (it is root or not).
 * @author Mark Czotter
 *
 */
public class AndroTextResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof View) {
			boolean isRoot = isRoot((View)eObject);
			QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
			if (qualifiedName != null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, eObject, Collections.singletonMap("root", String.valueOf(isRoot))));
			}
			return true;
		}
		return super.createEObjectDescriptions(eObject, acceptor);
	}

	private boolean isRoot(View view) {
		return view.eContainer() instanceof AndroGuiModelRoot;
	}
	
}

