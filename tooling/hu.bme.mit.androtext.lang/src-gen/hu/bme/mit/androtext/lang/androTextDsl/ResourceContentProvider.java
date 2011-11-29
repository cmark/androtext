/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getResourceContentProvider()
 * @model
 * @generated
 */
public interface ResourceContentProvider extends ContentProvider
{
  /**
   * Returns the value of the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' reference.
   * @see #setLink(ArrayResource)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getResourceContentProvider_Link()
   * @model
   * @generated
   */
  ArrayResource getLink();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider#getLink <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' reference.
   * @see #getLink()
   * @generated
   */
  void setLink(ArrayResource value);

} // ResourceContentProvider
