/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Tab#getTag <em>Tag</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Tab#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTab()
 * @model
 * @generated
 */
public interface Tab extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTab_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Tab#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

  /**
   * Returns the value of the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity</em>' reference.
   * @see #setActivity(Activity)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTab_Activity()
   * @model
   * @generated
   */
  Activity getActivity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Tab#getActivity <em>Activity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' reference.
   * @see #getActivity()
   * @generated
   */
  void setActivity(Activity value);

} // Tab
