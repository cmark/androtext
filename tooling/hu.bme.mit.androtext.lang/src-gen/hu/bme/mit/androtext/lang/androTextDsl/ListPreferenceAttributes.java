/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Preference Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntryValues <em>Entry Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreferenceAttributes()
 * @model
 * @generated
 */
public interface ListPreferenceAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' reference.
   * @see #setEntries(StringArrayEntry)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreferenceAttributes_Entries()
   * @model
   * @generated
   */
  StringArrayEntry getEntries();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntries <em>Entries</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entries</em>' reference.
   * @see #getEntries()
   * @generated
   */
  void setEntries(StringArrayEntry value);

  /**
   * Returns the value of the '<em><b>Entry Values</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Values</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Values</em>' reference.
   * @see #setEntryValues(StringArrayEntry)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreferenceAttributes_EntryValues()
   * @model
   * @generated
   */
  StringArrayEntry getEntryValues();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntryValues <em>Entry Values</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Values</em>' reference.
   * @see #getEntryValues()
   * @generated
   */
  void setEntryValues(StringArrayEntry value);

} // ListPreferenceAttributes
