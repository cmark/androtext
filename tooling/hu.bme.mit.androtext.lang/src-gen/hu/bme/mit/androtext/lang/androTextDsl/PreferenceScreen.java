/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preference Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getPreferences <em>Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPreferenceScreen()
 * @model
 * @generated
 */
public interface PreferenceScreen extends RootLayout, AbstractPreference
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPreferenceScreen_PreferenceAttributes()
   * @model containment="true"
   * @generated
   */
  PreferenceAttributes getPreferenceAttributes();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getPreferenceAttributes <em>Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preference Attributes</em>' containment reference.
   * @see #getPreferenceAttributes()
   * @generated
   */
  void setPreferenceAttributes(PreferenceAttributes value);

  /**
   * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preferences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preferences</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPreferenceScreen_Preferences()
   * @model containment="true"
   * @generated
   */
  EList<AbstractPreference> getPreferences();

} // PreferenceScreen
