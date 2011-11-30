/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Text Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute#getAutoText <em>Auto Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoTextAttribute()
 * @model
 * @generated
 */
public interface AutoTextAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Auto Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auto Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auto Text</em>' containment reference.
   * @see #setAutoText(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoTextAttribute_AutoText()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getAutoText();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute#getAutoText <em>Auto Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Auto Text</em>' containment reference.
   * @see #getAutoText()
   * @generated
   */
  void setAutoText(BooleanPropertyValue value);

} // AutoTextAttribute
