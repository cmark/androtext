/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Drawable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource#getSelected <em>Selected</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource#getUnselected <em>Unselected</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTabDrawableResource()
 * @model
 * @generated
 */
public interface TabDrawableResource extends Resource
{
  /**
   * Returns the value of the '<em><b>Selected</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected</em>' reference.
   * @see #setSelected(BitmapDrawableResource)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTabDrawableResource_Selected()
   * @model
   * @generated
   */
  BitmapDrawableResource getSelected();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource#getSelected <em>Selected</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected</em>' reference.
   * @see #getSelected()
   * @generated
   */
  void setSelected(BitmapDrawableResource value);

  /**
   * Returns the value of the '<em><b>Unselected</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unselected</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unselected</em>' reference.
   * @see #setUnselected(BitmapDrawableResource)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTabDrawableResource_Unselected()
   * @model
   * @generated
   */
  BitmapDrawableResource getUnselected();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource#getUnselected <em>Unselected</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unselected</em>' reference.
   * @see #getUnselected()
   * @generated
   */
  void setUnselected(BitmapDrawableResource value);

} // TabDrawableResource
