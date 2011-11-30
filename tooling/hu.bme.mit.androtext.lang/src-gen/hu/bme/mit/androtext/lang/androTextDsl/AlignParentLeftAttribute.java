/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Align Parent Left Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute#getAlignParentLeft <em>Align Parent Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAlignParentLeftAttribute()
 * @model
 * @generated
 */
public interface AlignParentLeftAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Align Parent Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Parent Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Parent Left</em>' containment reference.
   * @see #setAlignParentLeft(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAlignParentLeftAttribute_AlignParentLeft()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getAlignParentLeft();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute#getAlignParentLeft <em>Align Parent Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Parent Left</em>' containment reference.
   * @see #getAlignParentLeft()
   * @generated
   */
  void setAlignParentLeft(BooleanPropertyValue value);

} // AlignParentLeftAttribute
