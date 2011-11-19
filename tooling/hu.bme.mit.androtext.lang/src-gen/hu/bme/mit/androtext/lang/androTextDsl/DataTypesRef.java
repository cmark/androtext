/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Types Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDataTypesRef()
 * @model
 * @generated
 */
public interface DataTypesRef extends TypeRef
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.DataTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypes
   * @see #setType(DataTypes)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDataTypesRef_Type()
   * @model
   * @generated
   */
  DataTypes getType();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypes
   * @see #getType()
   * @generated
   */
  void setType(DataTypes value);

} // DataTypesRef
