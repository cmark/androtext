package hu.bme.mit.androtext.lang.attributes;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultAndroidAttributeProvider.class)
public interface IAndroidAttributeProvider {

	/**
	 * Provides an attribute list for the given eObject.
	 * @param eObject
	 * @return
	 */
	public Iterable<String> provideAttribute(EObject eObject); 
	
}
