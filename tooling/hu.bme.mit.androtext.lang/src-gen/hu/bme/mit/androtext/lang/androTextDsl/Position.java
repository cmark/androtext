/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Position#getX <em>X</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Position#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPosition_X()
   * @model
   * @generated
   */
  float getX();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Position#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(float value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPosition_Y()
   * @model
   * @generated
   */
  float getY();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Position#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(float value);

} // Position
