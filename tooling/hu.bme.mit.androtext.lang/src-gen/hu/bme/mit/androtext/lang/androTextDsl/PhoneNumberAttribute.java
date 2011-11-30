/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone Number Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPhoneNumberAttribute()
 * @model
 * @generated
 */
public interface PhoneNumberAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Phone Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phone Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phone Number</em>' containment reference.
   * @see #setPhoneNumber(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPhoneNumberAttribute_PhoneNumber()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getPhoneNumber();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute#getPhoneNumber <em>Phone Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phone Number</em>' containment reference.
   * @see #getPhoneNumber()
   * @generated
   */
  void setPhoneNumber(BooleanPropertyValue value);

} // PhoneNumberAttribute
