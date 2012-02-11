/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getListitem <em>Listitem</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListActivity()
 * @model
 * @generated
 */
public interface ListActivity extends Activity
{
  /**
   * Returns the value of the '<em><b>Listitem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listitem</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listitem</em>' reference.
   * @see #setListitem(View)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListActivity_Listitem()
   * @model
   * @generated
   */
  View getListitem();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getListitem <em>Listitem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Listitem</em>' reference.
   * @see #getListitem()
   * @generated
   */
  void setListitem(View value);

  /**
   * Returns the value of the '<em><b>Content Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content Provider</em>' containment reference.
   * @see #setContentProvider(ContentProvider)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListActivity_ContentProvider()
   * @model containment="true"
   * @generated
   */
  ContentProvider getContentProvider();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getContentProvider <em>Content Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content Provider</em>' containment reference.
   * @see #getContentProvider()
   * @generated
   */
  void setContentProvider(ContentProvider value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getListActivity_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

} // ListActivity
