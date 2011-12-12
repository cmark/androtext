/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Andro Game Box2 DLogic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameBox2DLogic#getOptions <em>Options</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameBox2DLogic#getBox2dComponents <em>Box2d Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameBox2DLogic()
 * @model
 * @generated
 */
public interface AndroGameBox2DLogic extends AndroGameComponent
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(Box2DOptions)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameBox2DLogic_Options()
   * @model containment="true"
   * @generated
   */
  Box2DOptions getOptions();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGameBox2DLogic#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(Box2DOptions value);

  /**
   * Returns the value of the '<em><b>Box2d Components</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.Box2DComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Box2d Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Box2d Components</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGameBox2DLogic_Box2dComponents()
   * @model containment="true"
   * @generated
   */
  EList<Box2DComponent> getBox2dComponents();

} // AndroGameBox2DLogic
