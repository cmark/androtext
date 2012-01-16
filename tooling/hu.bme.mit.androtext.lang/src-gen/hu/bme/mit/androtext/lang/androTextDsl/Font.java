/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Font#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Font#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Font#getColor <em>Color</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Font#isAntialias <em>Antialias</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFont()
 * @model
 * @generated
 */
public interface Font extends GameComponent
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.FontType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FontType
   * @see #setType(FontType)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFont_Type()
   * @model
   * @generated
   */
  FontType getType();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Font#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FontType
   * @see #getType()
   * @generated
   */
  void setType(FontType value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFont_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Font#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFont_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Font#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

  /**
   * Returns the value of the '<em><b>Antialias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Antialias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Antialias</em>' attribute.
   * @see #setAntialias(boolean)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFont_Antialias()
   * @model
   * @generated
   */
  boolean isAntialias();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Font#isAntialias <em>Antialias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Antialias</em>' attribute.
   * @see #isAntialias()
   * @generated
   */
  void setAntialias(boolean value);

} // Font
