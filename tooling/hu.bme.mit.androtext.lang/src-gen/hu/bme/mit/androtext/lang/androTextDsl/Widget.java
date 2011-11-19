/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Widget#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Widget#getLayoutStyle <em>Layout Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends UIElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getWidget_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Widget#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getWidget_LayoutStyle()
   * @model
   * @generated
   */
  LayoutStyle getLayoutStyle();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Widget#getLayoutStyle <em>Layout Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Style</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
   * @see #getLayoutStyle()
   * @generated
   */
  void setLayoutStyle(LayoutStyle value);

} // Widget
