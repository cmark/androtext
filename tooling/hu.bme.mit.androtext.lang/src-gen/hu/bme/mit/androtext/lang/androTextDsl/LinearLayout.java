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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getLayoutParams <em>Layout Params</em>}</li>
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
   * Returns the value of the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Params</em>' containment reference.
   * @see #setLayoutParams(LinearLayoutParams)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLinearLayout_LayoutParams()
   * @model containment="true"
   * @generated
   */
  LinearLayoutParams getLayoutParams();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getLayoutParams <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Params</em>' containment reference.
   * @see #getLayoutParams()
   * @generated
   */
  void setLayoutParams(LinearLayoutParams value);

} // LinearLayout
