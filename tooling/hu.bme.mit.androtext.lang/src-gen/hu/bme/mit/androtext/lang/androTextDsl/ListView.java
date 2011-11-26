/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListView#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListView#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListView()
 * @model
 * @generated
 */
public interface ListView extends SimpleView
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
   * @see #setEntries(ArrayResource)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListView_Entries()
   * @model
   * @generated
   */
  ArrayResource getEntries();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListView#getEntries <em>Entries</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entries</em>' reference.
   * @see #getEntries()
   * @generated
   */
  void setEntries(ArrayResource value);

  /**
   * Returns the value of the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' reference.
   * @see #setLayout(View)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListView_Layout()
   * @model
   * @generated
   */
  View getLayout();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListView#getLayout <em>Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' reference.
   * @see #getLayout()
   * @generated
   */
  void setLayout(View value);

} // ListView
