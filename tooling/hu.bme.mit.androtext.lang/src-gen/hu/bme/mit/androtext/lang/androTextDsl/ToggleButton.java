/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toggle Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOn <em>Text On</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOff <em>Text Off</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getToggleButton()
 * @model
 * @generated
 */
public interface ToggleButton extends SimpleView
{
  /**
   * Returns the value of the '<em><b>Text On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text On</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text On</em>' attribute.
   * @see #setTextOn(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getToggleButton_TextOn()
   * @model
   * @generated
   */
  String getTextOn();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOn <em>Text On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text On</em>' attribute.
   * @see #getTextOn()
   * @generated
   */
  void setTextOn(String value);

  /**
   * Returns the value of the '<em><b>Text Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Off</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Off</em>' attribute.
   * @see #setTextOff(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getToggleButton_TextOff()
   * @model
   * @generated
   */
  String getTextOff();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOff <em>Text Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Off</em>' attribute.
   * @see #getTextOff()
   * @generated
   */
  void setTextOff(String value);

} // ToggleButton
