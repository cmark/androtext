/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Line Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute#getSingleLine <em>Single Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSingleLineAttribute()
 * @model
 * @generated
 */
public interface SingleLineAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Single Line</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Line</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Line</em>' containment reference.
   * @see #setSingleLine(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSingleLineAttribute_SingleLine()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getSingleLine();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute#getSingleLine <em>Single Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Line</em>' containment reference.
   * @see #getSingleLine()
   * @generated
   */
  void setSingleLine(BooleanPropertyValue value);

} // SingleLineAttribute
