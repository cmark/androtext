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
 * A representation of the model object '<em><b>Text Style Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute#getTextStyle <em>Text Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextStyleAttribute()
 * @model
 * @generated
 */
public interface TextStyleAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Text Style</b></em>' attribute list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind}.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Style</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Style</em>' attribute list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextStyleAttribute_TextStyle()
   * @model unique="false"
   * @generated
   */
  EList<TextStyleKind> getTextStyle();

} // TextStyleAttribute
