/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stretch Mode Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute#getStretchMode <em>Stretch Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getStretchModeAttribute()
 * @model
 * @generated
 */
public interface StretchModeAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Stretch Mode</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stretch Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stretch Mode</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind
   * @see #setStretchMode(StretchModeKind)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getStretchModeAttribute_StretchMode()
   * @model
   * @generated
   */
  StretchModeKind getStretchMode();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute#getStretchMode <em>Stretch Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stretch Mode</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind
   * @see #getStretchMode()
   * @generated
   */
  void setStretchMode(StretchModeKind value);

} // StretchModeAttribute
