/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin Top Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute#getMarginTop <em>Margin Top</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginTopAttribute()
 * @model
 * @generated
 */
public interface MarginTopAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Margin Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Top</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Top</em>' containment reference.
   * @see #setMarginTop(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginTopAttribute_MarginTop()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getMarginTop();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute#getMarginTop <em>Margin Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Top</em>' containment reference.
   * @see #getMarginTop()
   * @generated
   */
  void setMarginTop(DimensionPropertyValue value);

} // MarginTopAttribute
