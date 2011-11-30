/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

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
   * Returns the value of the '<em><b>Gravity</b></em>' attribute list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.GravityKind}.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.GravityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' attribute list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GravityKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGravityAttribute_Gravity()
   * @model unique="false"
   * @generated
   */
  EList<GravityKind> getGravity();

} // GravityAttribute
