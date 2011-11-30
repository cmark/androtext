/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Below Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute#getBelow <em>Below</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBelowAttribute()
 * @model
 * @generated
 */
public interface BelowAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Below</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Below</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Below</em>' reference.
   * @see #setBelow(View)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBelowAttribute_Below()
   * @model
   * @generated
   */
  View getBelow();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute#getBelow <em>Below</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Below</em>' reference.
   * @see #getBelow()
   * @generated
   */
  void setBelow(View value);

} // BelowAttribute
