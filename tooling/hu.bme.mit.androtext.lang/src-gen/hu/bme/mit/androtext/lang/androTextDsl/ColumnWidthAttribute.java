/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Width Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute#getColumnWidth <em>Column Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColumnWidthAttribute()
 * @model
 * @generated
 */
public interface ColumnWidthAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Column Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Width</em>' containment reference.
   * @see #setColumnWidth(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColumnWidthAttribute_ColumnWidth()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getColumnWidth();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute#getColumnWidth <em>Column Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Width</em>' containment reference.
   * @see #getColumnWidth()
   * @generated
   */
  void setColumnWidth(DimensionPropertyValue value);

} // ColumnWidthAttribute
