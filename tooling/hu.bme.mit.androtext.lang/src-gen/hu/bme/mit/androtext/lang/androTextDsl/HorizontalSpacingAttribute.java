/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontal Spacing Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getHorizontalSpacingAttribute()
 * @model
 * @generated
 */
public interface HorizontalSpacingAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Horizontal Spacing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontal Spacing</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horizontal Spacing</em>' containment reference.
   * @see #setHorizontalSpacing(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getHorizontalSpacingAttribute_HorizontalSpacing()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getHorizontalSpacing();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute#getHorizontalSpacing <em>Horizontal Spacing</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horizontal Spacing</em>' containment reference.
   * @see #getHorizontalSpacing()
   * @generated
   */
  void setHorizontalSpacing(DimensionPropertyValue value);

} // HorizontalSpacingAttribute
