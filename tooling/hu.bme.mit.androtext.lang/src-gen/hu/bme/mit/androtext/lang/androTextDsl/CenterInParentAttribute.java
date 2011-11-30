/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center In Parent Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute#getCenterInParent <em>Center In Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCenterInParentAttribute()
 * @model
 * @generated
 */
public interface CenterInParentAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Center In Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center In Parent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center In Parent</em>' containment reference.
   * @see #setCenterInParent(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCenterInParentAttribute_CenterInParent()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getCenterInParent();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute#getCenterInParent <em>Center In Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center In Parent</em>' containment reference.
   * @see #getCenterInParent()
   * @generated
   */
  void setCenterInParent(BooleanPropertyValue value);

} // CenterInParentAttribute
