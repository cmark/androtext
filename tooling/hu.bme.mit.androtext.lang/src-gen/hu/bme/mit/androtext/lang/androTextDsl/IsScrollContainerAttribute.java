/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Scroll Container Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getIsScrollContainerAttribute()
 * @model
 * @generated
 */
public interface IsScrollContainerAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Scroll Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Scroll Container</em>' containment reference.
   * @see #setIsScrollContainer(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getIsScrollContainerAttribute_IsScrollContainer()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getIsScrollContainer();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute#getIsScrollContainer <em>Is Scroll Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Scroll Container</em>' containment reference.
   * @see #getIsScrollContainer()
   * @generated
   */
  void setIsScrollContainer(BooleanPropertyValue value);

} // IsScrollContainerAttribute
