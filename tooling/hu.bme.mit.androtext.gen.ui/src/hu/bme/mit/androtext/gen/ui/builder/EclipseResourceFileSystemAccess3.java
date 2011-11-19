package hu.bme.mit.androtext.gen.ui.builder;

import hu.bme.mit.androtext.gen.IGeneratorSlots;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2.IFileCallback;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.StringInputStream;

public class EclipseResourceFileSystemAccess3 extends AbstractFileSystemAccess {
	
	private IProject project;
	
	private IProgressMonitor monitor;
	
	private IFileCallback callBack;
	
	public void setProject(IProject project) {
		this.project = project;
	}
	
	public void setMonitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}
	
	public void setPostProcessor(IFileCallback callBack) {
		this.callBack = callBack;
	}
	
	protected IProgressMonitor getMonitor() {
		return monitor;
	}

	public void generateFile(String fileName, String outputName, CharSequence contents) {
		if (monitor.isCanceled())
			throw new OperationCanceledException();
		OutputConfiguration outputConfig = getOutputConfig(outputName);
		
		// check output folder exists
		IContainer output = getFolder(outputConfig);
		if (!output.exists()) {
			if (outputConfig.isCreateOutputDirectory()) {
				try {
					if (output instanceof IFolder) {
						createFolder((IFolder) output);
					}
				} catch (CoreException e) {
					throw new RuntimeException(e);
				}
			}
		}
		
		IFile file = getFile(fileName, outputName);
		String contentsAsString = contents.toString(); 
		if (file.exists()) {
			if (outputConfig.isOverrideExistingResources()) {
				try {
					StringInputStream newContent = getInputStream(contentsAsString, file.getCharset(true));
					if (hasContentsChanged(file, newContent)) {
						// reset to offset zero allows to reuse internal byte[]
						// no need to convert the string twice
						newContent.reset();
						file.setContents(newContent, true, true, monitor);
						if (file.isDerived() != outputConfig.isSetDerivedProperty()) {
							file.setDerived(outputConfig.isSetDerivedProperty());
						}
					}
				} catch (CoreException e) {
					throw new RuntimeException(e);
				}
				callBack.afterFileUpdate(file);
			}
		} else {
			try {
				ensureParentExists(file);
				file.create(getInputStream(contentsAsString, file.getCharset(true)), true, monitor);
				if (outputConfig.isSetDerivedProperty()) {
					file.setDerived(true);
				}
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
			callBack.afterFileCreation(file);
		}
	}

	protected void createFolder(IFolder folder) throws CoreException {
		ensureExists(folder);
	}

	protected void ensureParentExists(IFile file) throws CoreException {
		if (!file.exists()) {
			ensureExists(file.getParent());
		}
	}
	
	protected void ensureExists(IContainer container) throws CoreException {
		if (container.exists())
			return;
		if (container instanceof IFolder) {
			ensureExists(container.getParent());
			((IFolder)container).create(true, true, monitor);
		}
	}

	protected StringInputStream getInputStream(String contentsAsString, String encoding) {
		try {
			return new StringInputStream(contentsAsString, encoding);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	protected IContainer getFolder(OutputConfiguration outputConfig) {
		if (outputConfig.getName().equals(IGeneratorSlots.PROJECT_SLOT)) {
			return project;
		}
		return project.getFolder(new Path(outputConfig.getOutputDirectory()));
	}

	protected boolean hasContentsChanged(IFile file, StringInputStream newContent) {
		boolean contentChanged = false;
		BufferedInputStream oldContent = null;
		try {
			oldContent = new BufferedInputStream(file.getContents());
			int newByte = newContent.read();
			int oldByte = oldContent.read();
			while(newByte != -1 && oldByte != -1 && newByte == oldByte) {
				newByte = newContent.read();
				oldByte = oldContent.read();
			}
			contentChanged = newByte != oldByte;
		} catch (CoreException e) {
			contentChanged = true;
		} catch (IOException e) {
			contentChanged = true;
		} finally {
			if (oldContent != null) {
				try {
					oldContent.close();
				} catch (IOException e) {
					// ignore
				}
			}
		}
		return contentChanged;
	}

	@Override
	public void deleteFile(String fileName, String outputName) {
		try {
			IFile file = getFile(fileName, outputName);
			if (callBack.beforeFileDeletion(file) && file.exists())
				file.delete(IResource.KEEP_HISTORY,	monitor); 
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected IFile getFile(String fileName, String outputName) {
		OutputConfiguration configuration = getOutputConfig(outputName);
		final Path path = new Path(configuration.getOutputDirectory()+"/"+fileName);
		return project.getFile(path);
	}
	
}
