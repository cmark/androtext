/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin Left Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute#getMarginLeft <em>Margin Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginLeftAttribute()
 * @model
 * @generated
 */
public interface MarginLeftAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Margin Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Left</em>' containment reference.
   * @see #setMarginLeft(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginLeftAttribute_MarginLeft()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getMarginLeft();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute#getMarginLeft <em>Margin Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Left</em>' containment reference.
   * @see #getMarginLeft()
   * @generated
   */
  void setMarginLeft(DimensionPropertyValue value);

} // MarginLeftAttribute
