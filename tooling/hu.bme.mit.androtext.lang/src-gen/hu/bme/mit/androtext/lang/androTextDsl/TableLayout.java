/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getCollapseColumns <em>Collapse Columns</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getShrinkColumns <em>Shrink Columns</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getStretchColumns <em>Stretch Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTableLayout()
 * @model
 * @generated
 */
public interface TableLayout extends ViewGroup
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTableLayout_CollapseColumns()
   * @model containment="true"
   * @generated
   */
  EList<IntegerPropertyValue> getCollapseColumns();

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTableLayout_ShrinkColumns()
   * @model containment="true"
   * @generated
   */
  EList<IntegerPropertyValue> getShrinkColumns();

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTableLayout_StretchColumns()
   * @model containment="true"
   * @generated
   */
  EList<IntegerPropertyValue> getStretchColumns();

} // TableLayout
