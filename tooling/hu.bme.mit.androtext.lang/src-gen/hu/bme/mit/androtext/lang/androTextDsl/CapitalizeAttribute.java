/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capitalize Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute#getCapitalize <em>Capitalize</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCapitalizeAttribute()
 * @model
 * @generated
 */
public interface CapitalizeAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Capitalize</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capitalize</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capitalize</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind
   * @see #setCapitalize(CapitalizeKind)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getCapitalizeAttribute_Capitalize()
   * @model
   * @generated
   */
  CapitalizeKind getCapitalize();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute#getCapitalize <em>Capitalize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capitalize</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind
   * @see #getCapitalize()
   * @generated
   */
  void setCapitalize(CapitalizeKind value);

} // CapitalizeAttribute
