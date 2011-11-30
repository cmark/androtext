/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin Bottom Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute#getMarginBottom <em>Margin Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginBottomAttribute()
 * @model
 * @generated
 */
public interface MarginBottomAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Margin Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Bottom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Bottom</em>' containment reference.
   * @see #setMarginBottom(DimensionPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMarginBottomAttribute_MarginBottom()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getMarginBottom();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute#getMarginBottom <em>Margin Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Bottom</em>' containment reference.
   * @see #getMarginBottom()
   * @generated
   */
  void setMarginBottom(DimensionPropertyValue value);

} // MarginBottomAttribute
