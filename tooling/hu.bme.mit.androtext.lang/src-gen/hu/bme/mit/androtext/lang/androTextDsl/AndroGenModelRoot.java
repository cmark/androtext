/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Andro Gen Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot#getTargetApplications <em>Target Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGenModelRoot()
 * @model
 * @generated
 */
public interface AndroGenModelRoot extends ModelRoot
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGenModelRoot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Applications</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Applications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Applications</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroGenModelRoot_TargetApplications()
   * @model containment="true"
   * @generated
   */
  EList<TargetApplication> getTargetApplications();

} // AndroGenModelRoot
