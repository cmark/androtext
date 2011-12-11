/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Android Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getDataroot <em>Dataroot</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getMainActivity <em>Main Activity</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroidApplication()
 * @model
 * @generated
 */
public interface AndroidApplication extends ModelRoot
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroidApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dataroot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataroot</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataroot</em>' reference.
   * @see #setDataroot(AndroDataModelRoot)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroidApplication_Dataroot()
   * @model
   * @generated
   */
  AndroDataModelRoot getDataroot();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getDataroot <em>Dataroot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataroot</em>' reference.
   * @see #getDataroot()
   * @generated
   */
  void setDataroot(AndroDataModelRoot value);

  /**
   * Returns the value of the '<em><b>Main Activity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Activity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Activity</em>' containment reference.
   * @see #setMainActivity(Activity)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroidApplication_MainActivity()
   * @model containment="true"
   * @generated
   */
  Activity getMainActivity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getMainActivity <em>Main Activity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Activity</em>' containment reference.
   * @see #getMainActivity()
   * @generated
   */
  void setMainActivity(Activity value);

  /**
   * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Elements</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroidApplication_ModelElements()
   * @model containment="true"
   * @generated
   */
  EList<AndroidApplicationModelElement> getModelElements();

} // AndroidApplication
