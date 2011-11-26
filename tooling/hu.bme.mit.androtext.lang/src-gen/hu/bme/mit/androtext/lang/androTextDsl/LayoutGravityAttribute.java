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
 * A representation of the model object '<em><b>Layout Gravity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutGravityAttribute()
 * @model
 * @generated
 */
public interface LayoutGravityAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Gravity</b></em>' attribute list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind}.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' attribute list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutGravityAttribute_Gravity()
   * @model unique="false"
   * @generated
   */
  EList<LayoutGravityKind> getGravity();

} // LayoutGravityAttribute
