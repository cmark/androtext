/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Size#getW <em>W</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Size#getH <em>H</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSize()
 * @model
 * @generated
 */
public interface Size extends EObject
{
  /**
   * Returns the value of the '<em><b>W</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' attribute.
   * @see #setW(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSize_W()
   * @model
   * @generated
   */
  float getW();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Size#getW <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W</em>' attribute.
   * @see #getW()
   * @generated
   */
  void setW(float value);

  /**
   * Returns the value of the '<em><b>H</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>H</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>H</em>' attribute.
   * @see #setH(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSize_H()
   * @model
   * @generated
   */
  float getH();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Size#getH <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>H</em>' attribute.
   * @see #getH()
   * @generated
   */
  void setH(float value);

} // Size
