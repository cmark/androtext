/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.BaseLayout#getLayoutStyle <em>Layout Style</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.BaseLayout#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBaseLayout()
 * @model
 * @generated
 */
public interface BaseLayout extends RootLayout
{
  /**
   * Returns the value of the '<em><b>Layout Style</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Style</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
   * @see #setLayoutStyle(LayoutStyle)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBaseLayout_LayoutStyle()
   * @model
   * @generated
   */
  LayoutStyle getLayoutStyle();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseLayout#getLayoutStyle <em>Layout Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Style</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
   * @see #getLayoutStyle()
   * @generated
   */
  void setLayoutStyle(LayoutStyle value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.UIElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBaseLayout_Elements()
   * @model containment="true"
   * @generated
   */
  EList<UIElement> getElements();

} // BaseLayout
