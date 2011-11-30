/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin Right Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute#getMarginRight <em>Margin Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginRightAttribute()
 * @model
 * @generated
 */
public interface MarginRightAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Margin Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Right</em>' containment reference.
   * @see #setMarginRight(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginRightAttribute_MarginRight()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getMarginRight();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute#getMarginRight <em>Margin Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Right</em>' containment reference.
   * @see #getMarginRight()
   * @generated
   */
  void setMarginRight(DimensionPropertyValue value);

} // MarginRightAttribute
