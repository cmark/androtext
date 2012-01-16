/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Scene#getGameBackground <em>Game Background</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Scene#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends GameComponent
{
  /**
   * Returns the value of the '<em><b>Game Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Game Background</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Game Background</em>' containment reference.
   * @see #setGameBackground(GameBackground)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getScene_GameBackground()
   * @model containment="true"
   * @generated
   */
  GameBackground getGameBackground();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Scene#getGameBackground <em>Game Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Game Background</em>' containment reference.
   * @see #getGameBackground()
   * @generated
   */
  void setGameBackground(GameBackground value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.GameEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getScene_Entities()
   * @model containment="true"
   * @generated
   */
  EList<GameEntity> getEntities();

} // Scene
