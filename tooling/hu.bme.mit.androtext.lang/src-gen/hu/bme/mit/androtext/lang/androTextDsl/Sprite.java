/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Sprite#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Sprite#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Sprite#getTextureRegion <em>Texture Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSprite()
 * @model
 * @generated
 */
public interface Sprite extends GameEntity
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSprite_Position()
   * @model containment="true"
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Sprite#getPosition <em>Position</em>}' containment reference.
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSprite_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Sprite#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

  /**
   * Returns the value of the '<em><b>Texture Region</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Texture Region</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texture Region</em>' reference.
   * @see #setTextureRegion(TextureRegion)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSprite_TextureRegion()
   * @model
   * @generated
   */
  TextureRegion getTextureRegion();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Sprite#getTextureRegion <em>Texture Region</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture Region</em>' reference.
   * @see #getTextureRegion()
   * @generated
   */
  void setTextureRegion(TextureRegion value);

} // Sprite
