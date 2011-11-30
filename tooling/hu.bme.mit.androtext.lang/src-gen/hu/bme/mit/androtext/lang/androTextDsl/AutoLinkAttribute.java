/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Link Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute#isAll <em>All</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute#getAutoLinkMask <em>Auto Link Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoLinkAttribute()
 * @model
 * @generated
 */
public interface AutoLinkAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoLinkAttribute_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>Auto Link Mask</b></em>' attribute list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind}.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auto Link Mask</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auto Link Mask</em>' attribute list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAutoLinkAttribute_AutoLinkMask()
   * @model unique="false"
   * @generated
   */
  EList<AutoLinkKind> getAutoLinkMask();

} // AutoLinkAttribute
