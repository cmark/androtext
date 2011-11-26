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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#isIsMulti <em>Is Multi</em>}</li>
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
   * Returns the value of the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' reference.
   * @see #setEntries(StringArrayResource)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoCompleteTextView_Entries()
   * @model
   * @generated
   */
  StringArrayResource getEntries();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntries <em>Entries</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entries</em>' reference.
   * @see #getEntries()
   * @generated
   */
  void setEntries(StringArrayResource value);

  /**
   * Returns the value of the '<em><b>Is Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Multi</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Multi</em>' attribute.
   * @see #setIsMulti(boolean)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoCompleteTextView_IsMulti()
   * @model
   * @generated
   */
  boolean isIsMulti();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#isIsMulti <em>Is Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Multi</em>' attribute.
   * @see #isIsMulti()
   * @generated
   */
  void setIsMulti(boolean value);

} // AutoCompleteTextView
