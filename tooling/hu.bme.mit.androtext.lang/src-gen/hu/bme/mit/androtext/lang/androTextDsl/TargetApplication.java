/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getApplication <em>Application</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTargetApplication()
 * @model
 * @generated
 */
public interface TargetApplication extends EObject
{
  /**
   * Returns the value of the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' reference.
   * @see #setApplication(AndroidApplication)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTargetApplication_Application()
   * @model
   * @generated
   */
  AndroidApplication getApplication();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getApplication <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(AndroidApplication value);

  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTargetApplication_ProjectName()
   * @model
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTargetApplication_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.ApiLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ApiLevel
   * @see #setTarget(ApiLevel)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTargetApplication_Target()
   * @model
   * @generated
   */
  ApiLevel getTarget();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ApiLevel
   * @see #getTarget()
   * @generated
   */
  void setTarget(ApiLevel value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTargetApplication_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

} // TargetApplication
