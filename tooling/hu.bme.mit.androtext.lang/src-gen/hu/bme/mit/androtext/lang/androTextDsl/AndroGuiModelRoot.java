/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Andro Gui Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot#getRootLayout <em>Root Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGuiModelRoot()
 * @model
 * @generated
 */
public interface AndroGuiModelRoot extends ModelRoot
{
  /**
   * Returns the value of the '<em><b>Root Layout</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.RootLayout}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Layout</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Layout</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGuiModelRoot_RootLayout()
   * @model containment="true"
   * @generated
   */
  EList<RootLayout> getRootLayout();

} // AndroGuiModelRoot
