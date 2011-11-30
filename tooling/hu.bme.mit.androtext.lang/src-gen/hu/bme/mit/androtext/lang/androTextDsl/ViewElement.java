/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ViewElement#getBackgroundAttribute <em>Background Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getViewElement()
 * @model
 * @generated
 */
public interface ViewElement extends SimpleView
{
  /**
   * Returns the value of the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background Attribute</em>' containment reference.
   * @see #setBackgroundAttribute(BackgroundAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getViewElement_BackgroundAttribute()
   * @model containment="true"
   * @generated
   */
  BackgroundAttribute getBackgroundAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ViewElement#getBackgroundAttribute <em>Background Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background Attribute</em>' containment reference.
   * @see #getBackgroundAttribute()
   * @generated
   */
  void setBackgroundAttribute(BackgroundAttribute value);

} // ViewElement
