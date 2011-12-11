/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Andro Game Logic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic#getLogicComponent <em>Logic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameLogic()
 * @model
 * @generated
 */
public interface AndroGameLogic extends AndroGameComponent
{
  /**
   * Returns the value of the '<em><b>Logic Component</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.LogicComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic Component</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameLogic_LogicComponent()
   * @model containment="true"
   * @generated
   */
  EList<LogicComponent> getLogicComponent();

} // AndroGameLogic
