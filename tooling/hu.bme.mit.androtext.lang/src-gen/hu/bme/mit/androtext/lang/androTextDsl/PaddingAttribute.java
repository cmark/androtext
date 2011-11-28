/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Padding Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute#getPadding <em>Padding</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPaddingAttribute()
 * @model
 * @generated
 */
public interface PaddingAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Padding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Padding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Padding</em>' containment reference.
   * @see #setPadding(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPaddingAttribute_Padding()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getPadding();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute#getPadding <em>Padding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Padding</em>' containment reference.
   * @see #getPadding()
   * @generated
   */
  void setPadding(DimensionPropertyValue value);

} // PaddingAttribute
