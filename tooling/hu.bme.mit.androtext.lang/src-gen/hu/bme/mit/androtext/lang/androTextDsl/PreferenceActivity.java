/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preference Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPreferenceActivity()
 * @model
 * @generated
 */
public interface PreferenceActivity extends AndroidApplicationModelElement
{
  /**
   * Returns the value of the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' reference.
   * @see #setLayout(PreferenceScreen)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPreferenceActivity_Layout()
   * @model
   * @generated
   */
  PreferenceScreen getLayout();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity#getLayout <em>Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' reference.
   * @see #getLayout()
   * @generated
   */
  void setLayout(PreferenceScreen value);

} // PreferenceActivity
