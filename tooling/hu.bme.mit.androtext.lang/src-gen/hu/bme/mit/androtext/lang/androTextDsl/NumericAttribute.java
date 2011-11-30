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
 * A representation of the model object '<em><b>Numeric Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute#getNumeric <em>Numeric</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getNumericAttribute()
 * @model
 * @generated
 */
public interface NumericAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Numeric</b></em>' attribute list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.NumericKind}.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.NumericKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric</em>' attribute list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumericKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getNumericAttribute_Numeric()
   * @model unique="false"
   * @generated
   */
  EList<NumericKind> getNumeric();

} // NumericAttribute
