/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute#getSpan <em>Span</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSpanAttribute()
 * @model
 * @generated
 */
public interface SpanAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Span</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span</em>' containment reference.
   * @see #setSpan(IntegerPropertyValue)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSpanAttribute_Span()
   * @model containment="true"
   * @generated
   */
  IntegerPropertyValue getSpan();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute#getSpan <em>Span</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span</em>' containment reference.
   * @see #getSpan()
   * @generated
   */
  void setSpan(IntegerPropertyValue value);

} // SpanAttribute
