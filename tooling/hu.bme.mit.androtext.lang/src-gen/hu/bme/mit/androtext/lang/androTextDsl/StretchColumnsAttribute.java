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
 * A representation of the model object '<em><b>Stretch Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute#getStretchColumns <em>Stretch Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getStretchColumnsAttribute()
 * @model
 * @generated
 */
public interface StretchColumnsAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Stretch Columns</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stretch Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stretch Columns</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getStretchColumnsAttribute_StretchColumns()
   * @model containment="true"
   * @generated
   */
  EList<IntegerPropertyValue> getStretchColumns();

} // StretchColumnsAttribute
