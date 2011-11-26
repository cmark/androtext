/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getListPreferenceAttributes <em>List Preference Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreference()
 * @model
 * @generated
 */
public interface ListPreference extends AbstractPreference
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreference_PreferenceAttributes()
   * @model containment="true"
   * @generated
   */
  PreferenceAttributes getPreferenceAttributes();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getPreferenceAttributes <em>Preference Attributes</em>}' containment reference.
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreference_DialogPreferenceAttributes()
   * @model containment="true"
   * @generated
   */
  DialogPreferenceAttributes getDialogPreferenceAttributes();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dialog Preference Attributes</em>' containment reference.
   * @see #getDialogPreferenceAttributes()
   * @generated
   */
  void setDialogPreferenceAttributes(DialogPreferenceAttributes value);

  /**
   * Returns the value of the '<em><b>List Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Preference Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Preference Attributes</em>' containment reference.
   * @see #setListPreferenceAttributes(ListPreferenceAttributes)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreference_ListPreferenceAttributes()
   * @model containment="true"
   * @generated
   */
  ListPreferenceAttributes getListPreferenceAttributes();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getListPreferenceAttributes <em>List Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Preference Attributes</em>' containment reference.
   * @see #getListPreferenceAttributes()
   * @generated
   */
  void setListPreferenceAttributes(ListPreferenceAttributes value);

} // ListPreference
