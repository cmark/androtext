/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#isAutofit <em>Autofit</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#getNumColumns <em>Num Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getNumColumnsAttribute()
 * @model
 * @generated
 */
public interface NumColumnsAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Autofit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autofit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autofit</em>' attribute.
   * @see #setAutofit(boolean)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getNumColumnsAttribute_Autofit()
   * @model
   * @generated
   */
  boolean isAutofit();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#isAutofit <em>Autofit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autofit</em>' attribute.
   * @see #isAutofit()
   * @generated
   */
  void setAutofit(boolean value);

  /**
   * Returns the value of the '<em><b>Num Columns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Columns</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Columns</em>' containment reference.
   * @see #setNumColumns(IntegerPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getNumColumnsAttribute_NumColumns()
   * @model containment="true"
   * @generated
   */
  IntegerPropertyValue getNumColumns();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#getNumColumns <em>Num Columns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Columns</em>' containment reference.
   * @see #getNumColumns()
   * @generated
   */
  void setNumColumns(IntegerPropertyValue value);

} // NumColumnsAttribute
