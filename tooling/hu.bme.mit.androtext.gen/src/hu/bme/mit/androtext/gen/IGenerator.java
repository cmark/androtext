package hu.bme.mit.androtext.gen;

import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;

/**
 * Generator component, that generates content from the model.
 * 
 * @author Mark Czotter
 * 
 */
public interface IGenerator extends IGeneratorSlots {
	
	/**
	 * Generates content somewhere in the filesystem.
	 * 
	 * @param resource - the current delta
	 * @param fsa - the filesystem
	 * @param packageName - packageName used for the classes
	 */
	public void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa,
			TargetApplication androidApplication);

}
