/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertical Spacing Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getVerticalSpacingAttribute()
 * @model
 * @generated
 */
public interface VerticalSpacingAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Vertical Spacing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertical Spacing</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertical Spacing</em>' containment reference.
   * @see #setVerticalSpacing(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getVerticalSpacingAttribute_VerticalSpacing()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getVerticalSpacing();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute#getVerticalSpacing <em>Vertical Spacing</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertical Spacing</em>' containment reference.
   * @see #getVerticalSpacing()
   * @generated
   */
  void setVerticalSpacing(DimensionPropertyValue value);

} // VerticalSpacingAttribute
