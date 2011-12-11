/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Line#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Line#getTo <em>To</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Line#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GameEntity
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(FromDouble)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLine_From()
   * @model containment="true"
   * @generated
   */
  FromDouble getFrom();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Line#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(FromDouble value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(ToDouble)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLine_To()
   * @model containment="true"
   * @generated
   */
  ToDouble getTo();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Line#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(ToDouble value);

  /**
   * Returns the value of the '<em><b>Line Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Width</em>' attribute.
   * @see #setLineWidth(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLine_LineWidth()
   * @model
   * @generated
   */
  float getLineWidth();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Line#getLineWidth <em>Line Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Width</em>' attribute.
   * @see #getLineWidth()
   * @generated
   */
  void setLineWidth(float value);

} // Line
