/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getGravityAttribute <em>Gravity Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextSizeAttribute <em>Text Size Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getPaddingAttribute <em>Padding Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextView()
 * @model
 * @generated
 */
public interface TextView extends SimpleView
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextView_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Gravity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity Attribute</em>' containment reference.
   * @see #setGravityAttribute(GravityAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextView_GravityAttribute()
   * @model containment="true"
   * @generated
   */
  GravityAttribute getGravityAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getGravityAttribute <em>Gravity Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity Attribute</em>' containment reference.
   * @see #getGravityAttribute()
   * @generated
   */
  void setGravityAttribute(GravityAttribute value);

  /**
   * Returns the value of the '<em><b>Text Size Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Size Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Size Attribute</em>' containment reference.
   * @see #setTextSizeAttribute(TextSizeAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextView_TextSizeAttribute()
   * @model containment="true"
   * @generated
   */
  TextSizeAttribute getTextSizeAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextSizeAttribute <em>Text Size Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Size Attribute</em>' containment reference.
   * @see #getTextSizeAttribute()
   * @generated
   */
  void setTextSizeAttribute(TextSizeAttribute value);

  /**
   * Returns the value of the '<em><b>Padding Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Padding Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Padding Attribute</em>' containment reference.
   * @see #setPaddingAttribute(PaddingAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextView_PaddingAttribute()
   * @model containment="true"
   * @generated
   */
  PaddingAttribute getPaddingAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getPaddingAttribute <em>Padding Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Padding Attribute</em>' containment reference.
   * @see #getPaddingAttribute()
   * @generated
   */
  void setPaddingAttribute(PaddingAttribute value);

  /**
   * Returns the value of the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Params</em>' containment reference.
   * @see #setLayoutParams(LayoutParams)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTextView_LayoutParams()
   * @model containment="true"
   * @generated
   */
  LayoutParams getLayoutParams();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getLayoutParams <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Params</em>' containment reference.
   * @see #getLayoutParams()
   * @generated
   */
  void setLayoutParams(LayoutParams value);

} // TextView
