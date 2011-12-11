/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Andro Game Gui</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameGui#getGameElements <em>Game Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameGui()
 * @model
 * @generated
 */
public interface AndroGameGui extends AndroGameComponent
{
  /**
   * Returns the value of the '<em><b>Game Elements</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.GameElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Game Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Game Elements</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameGui_GameElements()
   * @model containment="true"
   * @generated
   */
  EList<GameElement> getGameElements();

} // AndroGameGui
