/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Size Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute#getTextSize <em>Text Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextSizeAttribute()
 * @model
 * @generated
 */
public interface TextSizeAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Text Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Size</em>' containment reference.
   * @see #setTextSize(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextSizeAttribute_TextSize()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getTextSize();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute#getTextSize <em>Text Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Size</em>' containment reference.
   * @see #getTextSize()
   * @generated
   */
  void setTextSize(DimensionPropertyValue value);

} // TextSizeAttribute
