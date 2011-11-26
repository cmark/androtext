/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBackgroundAttribute()
 * @model
 * @generated
 */
public interface BackgroundAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' containment reference.
   * @see #setBackground(AnyDrawablePropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBackgroundAttribute_Background()
   * @model containment="true"
   * @generated
   */
  AnyDrawablePropertyValue getBackground();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute#getBackground <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' containment reference.
   * @see #getBackground()
   * @generated
   */
  void setBackground(AnyDrawablePropertyValue value);

} // BackgroundAttribute
