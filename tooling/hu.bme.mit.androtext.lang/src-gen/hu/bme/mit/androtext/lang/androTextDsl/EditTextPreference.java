/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Text Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getEditTextPreference()
 * @model
 * @generated
 */
public interface EditTextPreference extends AbstractPreference
{
  /**
   * Returns the value of the '<em><b>Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preference Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preference Attributes</em>' containment reference.
   * @see #setPreferenceAttributes(PreferenceAttributes)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getEditTextPreference_PreferenceAttributes()
   * @model containment="true"
   * @generated
   */
  PreferenceAttributes getPreferenceAttributes();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getPreferenceAttributes <em>Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preference Attributes</em>' containment reference.
   * @see #getPreferenceAttributes()
   * @generated
   */
  void setPreferenceAttributes(PreferenceAttributes value);

  /**
   * Returns the value of the '<em><b>Dialog Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dialog Preference Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dialog Preference Attributes</em>' containment reference.
   * @see #setDialogPreferenceAttributes(DialogPreferenceAttributes)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getEditTextPreference_DialogPreferenceAttributes()
   * @model containment="true"
   * @generated
   */
  DialogPreferenceAttributes getDialogPreferenceAttributes();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dialog Preference Attributes</em>' containment reference.
   * @see #getDialogPreferenceAttributes()
   * @generated
   */
  void setDialogPreferenceAttributes(DialogPreferenceAttributes value);

} // EditTextPreference
