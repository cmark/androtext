/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.GameBackground#getColor <em>Color</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.GameBackground#getTextureRegion <em>Texture Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameBackground()
 * @model
 * @generated
 */
public interface GameBackground extends EObject
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameBackground_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.GameBackground#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameBackground_TextureRegion()
   * @model
   * @generated
   */
  TextureRegion getTextureRegion();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.GameBackground#getTextureRegion <em>Texture Region</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture Region</em>' reference.
   * @see #getTextureRegion()
   * @generated
   */
  void setTextureRegion(TextureRegion value);

} // GameBackground
