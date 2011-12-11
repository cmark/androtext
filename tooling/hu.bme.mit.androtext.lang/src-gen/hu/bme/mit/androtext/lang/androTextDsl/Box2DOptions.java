/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box2 DOptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Box2DOptions#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBox2DOptions()
 * @model
 * @generated
 */
public interface Box2DOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Gravity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' attribute.
   * @see #setGravity(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBox2DOptions_Gravity()
   * @model
   * @generated
   */
  float getGravity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Box2DOptions#getGravity <em>Gravity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity</em>' attribute.
   * @see #getGravity()
   * @generated
   */
  void setGravity(float value);

} // Box2DOptions
