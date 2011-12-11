/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Complete Text View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntriesAttribute <em>Entries Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getListItem <em>List Item</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoCompleteTextView()
 * @model
 * @generated
 */
public interface AutoCompleteTextView extends SimpleView
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoCompleteTextView_EntriesAttribute()
   * @model containment="true"
   * @generated
   */
  EntriesAttribute getEntriesAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntriesAttribute <em>Entries Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entries Attribute</em>' containment reference.
   * @see #getEntriesAttribute()
   * @generated
   */
  void setEntriesAttribute(EntriesAttribute value);

  /**
   * Returns the value of the '<em><b>List Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Item</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Item</em>' reference.
   * @see #setListItem(View)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoCompleteTextView_ListItem()
   * @model
   * @generated
   */
  View getListItem();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getListItem <em>List Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Item</em>' reference.
   * @see #getListItem()
   * @generated
   */
  void setListItem(View value);

  /**
   * Returns the value of the '<em><b>Multi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi</em>' containment reference.
   * @see #setMulti(BooleanPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoCompleteTextView_Multi()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getMulti();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getMulti <em>Multi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi</em>' containment reference.
   * @see #getMulti()
   * @generated
   */
  void setMulti(BooleanPropertyValue value);

} // AutoCompleteTextView
