/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextureRegion#getFileName <em>File Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextureRegion#getTiled <em>Tiled</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextureRegion()
 * @model
 * @generated
 */
public interface TextureRegion extends GameElement
{
  /**
   * Returns the value of the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' attribute.
   * @see #setFileName(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextureRegion_FileName()
   * @model
   * @generated
   */
  String getFileName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextureRegion#getFileName <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' attribute.
   * @see #getFileName()
   * @generated
   */
  void setFileName(String value);

  /**
   * Returns the value of the '<em><b>Tiled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tiled</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tiled</em>' containment reference.
   * @see #setTiled(Tiled)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextureRegion_Tiled()
   * @model containment="true"
   * @generated
   */
  Tiled getTiled();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextureRegion#getTiled <em>Tiled</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tiled</em>' containment reference.
   * @see #getTiled()
   * @generated
   */
  void setTiled(Tiled value);

} // TextureRegion
