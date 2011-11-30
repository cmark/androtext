/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#isVertical <em>Vertical</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLinearLayout()
 * @model
 * @generated
 */
public interface LinearLayout extends ViewGroup
{
  /**
   * Returns the value of the '<em><b>Vertical</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertical</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertical</em>' attribute.
   * @see #setVertical(boolean)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLinearLayout_Vertical()
   * @model
   * @generated
   */
  boolean isVertical();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#isVertical <em>Vertical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertical</em>' attribute.
   * @see #isVertical()
   * @generated
   */
  void setVertical(boolean value);

  /**
   * Returns the value of the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' containment reference.
   * @see #setGravity(GravityAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLinearLayout_Gravity()
   * @model containment="true"
   * @generated
   */
  GravityAttribute getGravity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getGravity <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity</em>' containment reference.
   * @see #getGravity()
   * @generated
   */
  void setGravity(GravityAttribute value);

} // LinearLayout
