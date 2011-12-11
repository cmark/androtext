/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Andro Game Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameRoot#getAndroGameComponents <em>Andro Game Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameRoot()
 * @model
 * @generated
 */
public interface AndroGameRoot extends ModelRoot
{
  /**
   * Returns the value of the '<em><b>Andro Game Components</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Andro Game Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Andro Game Components</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameRoot_AndroGameComponents()
   * @model containment="true"
   * @generated
   */
  EList<AndroGameComponent> getAndroGameComponents();

} // AndroGameRoot
