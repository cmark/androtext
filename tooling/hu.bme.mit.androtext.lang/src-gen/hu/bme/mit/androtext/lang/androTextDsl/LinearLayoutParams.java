/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Layout Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getLayoutParams <em>Layout Params</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLinearLayoutParams()
 * @model
 * @generated
 */
public interface LinearLayoutParams extends EObject
{
  /**
   * Returns the value of the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Params</em>' containment reference.
   * @see #setLayoutParams(LayoutParams)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLinearLayoutParams_LayoutParams()
   * @model containment="true"
   * @generated
   */
  LayoutParams getLayoutParams();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getLayoutParams <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Params</em>' containment reference.
   * @see #getLayoutParams()
   * @generated
   */
  void setLayoutParams(LayoutParams value);

  /**
   * Returns the value of the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' containment reference.
   * @see #setGravity(LayoutGravityAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLinearLayoutParams_Gravity()
   * @model containment="true"
   * @generated
   */
  LayoutGravityAttribute getGravity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getGravity <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity</em>' containment reference.
   * @see #getGravity()
   * @generated
   */
  void setGravity(LayoutGravityAttribute value);

} // LinearLayoutParams
