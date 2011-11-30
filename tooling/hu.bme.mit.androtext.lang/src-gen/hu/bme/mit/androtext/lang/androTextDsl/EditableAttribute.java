/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editable Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute#getEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getEditableAttribute()
 * @model
 * @generated
 */
public interface EditableAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Editable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editable</em>' containment reference.
   * @see #setEditable(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getEditableAttribute_Editable()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getEditable();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute#getEditable <em>Editable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editable</em>' containment reference.
   * @see #getEditable()
   * @generated
   */
  void setEditable(BooleanPropertyValue value);

} // EditableAttribute
