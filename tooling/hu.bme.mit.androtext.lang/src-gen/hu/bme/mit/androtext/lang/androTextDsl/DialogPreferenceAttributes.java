/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Preference Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDialogTitle <em>Dialog Title</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDialogPreferenceAttributes()
 * @model
 * @generated
 */
public interface DialogPreferenceAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Dialog Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dialog Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dialog Title</em>' attribute.
   * @see #setDialogTitle(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDialogPreferenceAttributes_DialogTitle()
   * @model
   * @generated
   */
  String getDialogTitle();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDialogTitle <em>Dialog Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dialog Title</em>' attribute.
   * @see #getDialogTitle()
   * @generated
   */
  void setDialogTitle(String value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDialogPreferenceAttributes_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

} // DialogPreferenceAttributes
