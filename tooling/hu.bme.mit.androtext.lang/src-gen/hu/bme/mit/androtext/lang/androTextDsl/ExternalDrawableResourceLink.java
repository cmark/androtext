/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Drawable Resource Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink#getExternalResource <em>External Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getExternalDrawableResourceLink()
 * @model
 * @generated
 */
public interface ExternalDrawableResourceLink extends DrawableResourceLink
{
  /**
   * Returns the value of the '<em><b>External Resource</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Resource</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Resource</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource
   * @see #setExternalResource(AndroidDrawableResource)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getExternalDrawableResourceLink_ExternalResource()
   * @model
   * @generated
   */
  AndroidDrawableResource getExternalResource();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink#getExternalResource <em>External Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Resource</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource
   * @see #getExternalResource()
   * @generated
   */
  void setExternalResource(AndroidDrawableResource value);

} // ExternalDrawableResourceLink
