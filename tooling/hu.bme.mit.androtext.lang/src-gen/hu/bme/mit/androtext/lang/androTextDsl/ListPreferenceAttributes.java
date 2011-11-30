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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntriesAttribute <em>Entries Attribute</em>}</li>
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
   * Returns the value of the '<em><b>Entries Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries Attribute</em>' containment reference.
   * @see #setEntriesAttribute(EntriesAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListPreferenceAttributes_EntriesAttribute()
   * @model containment="true"
   * @generated
   */
  EntriesAttribute getEntriesAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntriesAttribute <em>Entries Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entries Attribute</em>' containment reference.
   * @see #getEntriesAttribute()
   * @generated
   */
  void setEntriesAttribute(EntriesAttribute value);

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
