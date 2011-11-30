/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.View#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutStyle <em>Layout Style</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutProperties <em>Layout Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getView_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.View#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Style</em>' containment reference.
   * @see #setLayoutStyle(LayoutStyle)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getView_LayoutStyle()
   * @model containment="true"
   * @generated
   */
  LayoutStyle getLayoutStyle();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutStyle <em>Layout Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Style</em>' containment reference.
   * @see #getLayoutStyle()
   * @generated
   */
  void setLayoutStyle(LayoutStyle value);

  /**
   * Returns the value of the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Properties</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Properties</em>' reference.
   * @see #setLayoutProperties(LayoutProperties)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getView_LayoutProperties()
   * @model
   * @generated
   */
  LayoutProperties getLayoutProperties();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutProperties <em>Layout Properties</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Properties</em>' reference.
   * @see #getLayoutProperties()
   * @generated
   */
  void setLayoutProperties(LayoutProperties value);

} // View
