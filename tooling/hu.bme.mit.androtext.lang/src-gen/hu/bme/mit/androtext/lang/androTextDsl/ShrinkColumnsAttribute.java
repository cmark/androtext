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
 * A representation of the model object '<em><b>Shrink Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute#getShrinkColumns <em>Shrink Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getShrinkColumnsAttribute()
 * @model
 * @generated
 */
public interface ShrinkColumnsAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Shrink Columns</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shrink Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shrink Columns</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getShrinkColumnsAttribute_ShrinkColumns()
   * @model containment="true"
   * @generated
   */
  EList<IntegerPropertyValue> getShrinkColumns();

} // ShrinkColumnsAttribute
