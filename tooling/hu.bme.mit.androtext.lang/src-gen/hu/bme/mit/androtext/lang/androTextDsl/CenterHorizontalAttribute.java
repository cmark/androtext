/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Horizontal Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute#getCenterHorizontal <em>Center Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCenterHorizontalAttribute()
 * @model
 * @generated
 */
public interface CenterHorizontalAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Center Horizontal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center Horizontal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center Horizontal</em>' containment reference.
   * @see #setCenterHorizontal(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCenterHorizontalAttribute_CenterHorizontal()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getCenterHorizontal();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute#getCenterHorizontal <em>Center Horizontal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center Horizontal</em>' containment reference.
   * @see #getCenterHorizontal()
   * @generated
   */
  void setCenterHorizontal(BooleanPropertyValue value);

} // CenterHorizontalAttribute
