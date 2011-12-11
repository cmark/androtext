/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tiled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Tiled#getColumn <em>Column</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Tiled#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTiled()
 * @model
 * @generated
 */
public interface Tiled extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' attribute.
   * @see #setColumn(int)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTiled_Column()
   * @model
   * @generated
   */
  int getColumn();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Tiled#getColumn <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' attribute.
   * @see #getColumn()
   * @generated
   */
  void setColumn(int value);

  /**
   * Returns the value of the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row</em>' attribute.
   * @see #setRow(int)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTiled_Row()
   * @model
   * @generated
   */
  int getRow();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Tiled#getRow <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row</em>' attribute.
   * @see #getRow()
   * @generated
   */
  void setRow(int value);

} // Tiled
