/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animated Sprite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getTextureRegion <em>Texture Region</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getAnimate <em>Animate</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAnimatedSprite()
 * @model
 * @generated
 */
public interface AnimatedSprite extends GameEntity
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAnimatedSprite_Position()
   * @model containment="true"
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getPosition <em>Position</em>}' containment reference.
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAnimatedSprite_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getSize <em>Size</em>}' containment reference.
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAnimatedSprite_TextureRegion()
   * @model
   * @generated
   */
  TextureRegion getTextureRegion();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getTextureRegion <em>Texture Region</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture Region</em>' reference.
   * @see #getTextureRegion()
   * @generated
   */
  void setTextureRegion(TextureRegion value);

  /**
   * Returns the value of the '<em><b>Animate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Animate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Animate</em>' attribute.
   * @see #setAnimate(int)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAnimatedSprite_Animate()
   * @model
   * @generated
   */
  int getAnimate();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite#getAnimate <em>Animate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Animate</em>' attribute.
   * @see #getAnimate()
   * @generated
   */
  void setAnimate(int value);

} // AnimatedSprite
