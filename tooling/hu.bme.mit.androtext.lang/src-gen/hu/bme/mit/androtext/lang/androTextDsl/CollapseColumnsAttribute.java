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
 * A representation of the model object '<em><b>Collapse Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute#getCollapseColumns <em>Collapse Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCollapseColumnsAttribute()
 * @model
 * @generated
 */
public interface CollapseColumnsAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Collapse Columns</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collapse Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collapse Columns</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCollapseColumnsAttribute_CollapseColumns()
   * @model containment="true"
   * @generated
   */
  EList<IntegerPropertyValue> getCollapseColumns();

} // CollapseColumnsAttribute
