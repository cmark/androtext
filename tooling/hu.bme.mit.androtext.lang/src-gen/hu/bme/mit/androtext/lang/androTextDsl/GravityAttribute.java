/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gravity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGravityAttribute()
 * @model
 * @generated
 */
public interface GravityAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Gravity</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind
   * @see #setGravity(LayoutGravityKind)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGravityAttribute_Gravity()
   * @model
   * @generated
   */
  LayoutGravityKind getGravity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute#getGravity <em>Gravity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind
   * @see #getGravity()
   * @generated
   */
  void setGravity(LayoutGravityKind value);

} // GravityAttribute
