/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ModifierBinding#getModifier <em>Modifier</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ModifierBinding#getGameEntity <em>Game Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getModifierBinding()
 * @model
 * @generated
 */
public interface ModifierBinding extends Logic
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' reference.
   * @see #setModifier(EntityModifier)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getModifierBinding_Modifier()
   * @model
   * @generated
   */
  EntityModifier getModifier();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ModifierBinding#getModifier <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(EntityModifier value);

  /**
   * Returns the value of the '<em><b>Game Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Game Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Game Entity</em>' reference.
   * @see #setGameEntity(GameEntity)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getModifierBinding_GameEntity()
   * @model
   * @generated
   */
  GameEntity getGameEntity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ModifierBinding#getGameEntity <em>Game Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Game Entity</em>' reference.
   * @see #getGameEntity()
   * @generated
   */
  void setGameEntity(GameEntity value);

} // ModifierBinding
