/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clickable Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute#getClickable <em>Clickable</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getClickableAttribute()
 * @model
 * @generated
 */
public interface ClickableAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clickable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clickable</em>' containment reference.
   * @see #setClickable(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getClickableAttribute_Clickable()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getClickable();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute#getClickable <em>Clickable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clickable</em>' containment reference.
   * @see #getClickable()
   * @generated
   */
  void setClickable(BooleanPropertyValue value);

} // ClickableAttribute
