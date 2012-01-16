package hu.bme.mit.androtext.validation.ui.actions;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.validation.ui.editorlink.EditorBoundValidation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * @author Mark Czotter
 * Solution for any editor that is IEditingDomainProvider.
 */
public class InitValidationActionDelegate implements IEditorActionDelegate {

	IEditorPart currentEditor;
	
	@Override
	public void run(IAction action) {
		
		try {
			if(currentEditor!=null && currentEditor instanceof XtextEditor)
			{
				XtextEditor ce = (XtextEditor)currentEditor;
				ce.getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {
					@Override
					public Boolean exec(XtextResource state) throws Exception {
						try {
//							System.out.println("Registering resource: " + state);
//							for (Iterator<EObject> iter = state.getAllContents(); iter.hasNext();) {
//								EObject e = iter.next();
//								System.out.println(e);
//							}
							EditorBoundValidation.INSTANCE.initializeValidatorsOnEditor(currentEditor, state);
							return true;
						} catch (IncQueryRuntimeException e) {
							e.printStackTrace();
						}
						return false;
					}
				});
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}
		
	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.currentEditor = targetEditor;
	}



}
