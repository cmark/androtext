/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSimpleEntity()
 * @model
 * @generated
 */
public interface SimpleEntity extends GameEntity
{
  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Position)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSimpleEntity_Position()
   * @model containment="true"
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Position value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Size)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSimpleEntity_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.GameEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSimpleEntity_Children()
   * @model containment="true"
   * @generated
   */
  EList<GameEntity> getChildren();

} // SimpleEntity
