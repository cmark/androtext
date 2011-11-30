/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typeface Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute#getTypeface <em>Typeface</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTypefaceAttribute()
 * @model
 * @generated
 */
public interface TypefaceAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Typeface</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeface</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind
   * @see #setTypeface(TypefaceKind)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTypefaceAttribute_Typeface()
   * @model
   * @generated
   */
  TypefaceKind getTypeface();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute#getTypeface <em>Typeface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeface</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind
   * @see #getTypeface()
   * @generated
   */
  void setTypeface(TypefaceKind value);

} // TypefaceAttribute
