/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getCollapseColumnsAttribute <em>Collapse Columns Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getShrinkColumnsAttribute <em>Shrink Columns Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getStretchColumnsAttribute <em>Stretch Columns Attribute</em>}</li>
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
   * Returns the value of the '<em><b>Collapse Columns Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collapse Columns Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collapse Columns Attribute</em>' containment reference.
   * @see #setCollapseColumnsAttribute(CollapseColumnsAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTableLayout_CollapseColumnsAttribute()
   * @model containment="true"
   * @generated
   */
  CollapseColumnsAttribute getCollapseColumnsAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getCollapseColumnsAttribute <em>Collapse Columns Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collapse Columns Attribute</em>' containment reference.
   * @see #getCollapseColumnsAttribute()
   * @generated
   */
  void setCollapseColumnsAttribute(CollapseColumnsAttribute value);

  /**
   * Returns the value of the '<em><b>Shrink Columns Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shrink Columns Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shrink Columns Attribute</em>' containment reference.
   * @see #setShrinkColumnsAttribute(ShrinkColumnsAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTableLayout_ShrinkColumnsAttribute()
   * @model containment="true"
   * @generated
   */
  ShrinkColumnsAttribute getShrinkColumnsAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getShrinkColumnsAttribute <em>Shrink Columns Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shrink Columns Attribute</em>' containment reference.
   * @see #getShrinkColumnsAttribute()
   * @generated
   */
  void setShrinkColumnsAttribute(ShrinkColumnsAttribute value);

  /**
   * Returns the value of the '<em><b>Stretch Columns Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stretch Columns Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stretch Columns Attribute</em>' containment reference.
   * @see #setStretchColumnsAttribute(StretchColumnsAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTableLayout_StretchColumnsAttribute()
   * @model containment="true"
   * @generated
   */
  StretchColumnsAttribute getStretchColumnsAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getStretchColumnsAttribute <em>Stretch Columns Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stretch Columns Attribute</em>' containment reference.
   * @see #getStretchColumnsAttribute()
   * @generated
   */
  void setStretchColumnsAttribute(StretchColumnsAttribute value);

} // TableLayout
