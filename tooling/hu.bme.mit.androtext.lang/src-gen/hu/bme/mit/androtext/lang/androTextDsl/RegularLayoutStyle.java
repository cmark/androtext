/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Layout Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRegularLayoutStyle()
 * @model
 * @generated
 */
public interface RegularLayoutStyle extends LayoutStyle
{
  /**
   * Returns the value of the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' containment reference.
   * @see #setWidth(LayoutDimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRegularLayoutStyle_Width()
   * @model containment="true"
   * @generated
   */
  LayoutDimensionPropertyValue getWidth();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getWidth <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' containment reference.
   * @see #getWidth()
   * @generated
   */
  void setWidth(LayoutDimensionPropertyValue value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' containment reference.
   * @see #setHeight(LayoutDimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRegularLayoutStyle_Height()
   * @model containment="true"
   * @generated
   */
  LayoutDimensionPropertyValue getHeight();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getHeight <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' containment reference.
   * @see #getHeight()
   * @generated
   */
  void setHeight(LayoutDimensionPropertyValue value);

} // RegularLayoutStyle
