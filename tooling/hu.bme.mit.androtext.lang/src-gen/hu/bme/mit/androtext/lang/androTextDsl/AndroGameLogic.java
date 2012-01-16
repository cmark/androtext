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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic#getBox2dOptions <em>Box2d Options</em>}</li>
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
   * Returns the value of the '<em><b>Box2d Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Box2d Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Box2d Options</em>' containment reference.
   * @see #setBox2dOptions(Box2DOptions)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameLogic_Box2dOptions()
   * @model containment="true"
   * @generated
   */
  Box2DOptions getBox2dOptions();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic#getBox2dOptions <em>Box2d Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Box2d Options</em>' containment reference.
   * @see #getBox2dOptions()
   * @generated
   */
  void setBox2dOptions(Box2DOptions value);

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
