package hu.bme.mit.androtext.lang.attributes;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultAndroidAttributeProvider.class)
public interface IAndroidAttributeProvider {

	/**
	 * Provides an attribute list for the given eObject.
	 * @param eObject
	 * @return
	 */
	public List<String> provideAttribute(EObject eObject); 
	
}
