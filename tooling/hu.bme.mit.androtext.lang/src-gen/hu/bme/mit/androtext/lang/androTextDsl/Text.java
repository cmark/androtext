/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getFont <em>Font</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getHalign <em>Halign</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getText()
 * @model
 * @generated
 */
public interface Text extends GameEntity
{
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getText_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getText_Position()
   * @model containment="true"
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Position value);

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getText_Font()
   * @model
   * @generated
   */
  Font getFont();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getFont <em>Font</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font</em>' reference.
   * @see #getFont()
   * @generated
   */
  void setFont(Font value);

  /**
   * Returns the value of the '<em><b>Halign</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.HorizontalAlign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Halign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Halign</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HorizontalAlign
   * @see #setHalign(HorizontalAlign)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getText_Halign()
   * @model
   * @generated
   */
  HorizontalAlign getHalign();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Text#getHalign <em>Halign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Halign</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HorizontalAlign
   * @see #getHalign()
   * @generated
   */
  void setHalign(HorizontalAlign value);

} // Text
