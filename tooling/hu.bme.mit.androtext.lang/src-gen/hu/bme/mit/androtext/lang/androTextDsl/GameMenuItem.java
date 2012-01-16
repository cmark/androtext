/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getFont <em>Font</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getTextureRegion <em>Texture Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameMenuItem()
 * @model
 * @generated
 */
public interface GameMenuItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameMenuItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameMenuItem_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Font</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font</em>' reference.
   * @see #setFont(Font)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameMenuItem_Font()
   * @model
   * @generated
   */
  Font getFont();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getFont <em>Font</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font</em>' reference.
   * @see #getFont()
   * @generated
   */
  void setFont(Font value);

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getGameMenuItem_TextureRegion()
   * @model
   * @generated
   */
  TextureRegion getTextureRegion();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem#getTextureRegion <em>Texture Region</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture Region</em>' reference.
   * @see #getTextureRegion()
   * @generated
   */
  void setTextureRegion(TextureRegion value);

} // GameMenuItem
