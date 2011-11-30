/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Vertical Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute#getCenterVertical <em>Center Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCenterVerticalAttribute()
 * @model
 * @generated
 */
public interface CenterVerticalAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Center Vertical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center Vertical</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center Vertical</em>' containment reference.
   * @see #setCenterVertical(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCenterVerticalAttribute_CenterVertical()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getCenterVertical();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute#getCenterVertical <em>Center Vertical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center Vertical</em>' containment reference.
   * @see #getCenterVertical()
   * @generated
   */
  void setCenterVertical(BooleanPropertyValue value);

} // CenterVerticalAttribute
