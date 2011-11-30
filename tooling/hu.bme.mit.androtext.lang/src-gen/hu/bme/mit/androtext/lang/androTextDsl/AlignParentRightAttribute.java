/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Align Parent Right Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute#getAlignParentRight <em>Align Parent Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAlignParentRightAttribute()
 * @model
 * @generated
 */
public interface AlignParentRightAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Align Parent Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Parent Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Parent Right</em>' containment reference.
   * @see #setAlignParentRight(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAlignParentRightAttribute_AlignParentRight()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getAlignParentRight();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute#getAlignParentRight <em>Align Parent Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Parent Right</em>' containment reference.
   * @see #getAlignParentRight()
   * @generated
   */
  void setAlignParentRight(BooleanPropertyValue value);

} // AlignParentRightAttribute
