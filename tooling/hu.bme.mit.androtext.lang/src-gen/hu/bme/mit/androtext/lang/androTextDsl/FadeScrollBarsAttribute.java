/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fade Scroll Bars Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFadeScrollBarsAttribute()
 * @model
 * @generated
 */
public interface FadeScrollBarsAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fade Scroll Bars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fade Scroll Bars</em>' containment reference.
   * @see #setFadeScrollBars(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFadeScrollBarsAttribute_FadeScrollBars()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getFadeScrollBars();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute#getFadeScrollBars <em>Fade Scroll Bars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fade Scroll Bars</em>' containment reference.
   * @see #getFadeScrollBars()
   * @generated
   */
  void setFadeScrollBars(BooleanPropertyValue value);

} // FadeScrollBarsAttribute
