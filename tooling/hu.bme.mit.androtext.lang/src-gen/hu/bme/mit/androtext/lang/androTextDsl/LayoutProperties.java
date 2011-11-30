/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getWeightAttribute <em>Weight Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginLeftAttribute <em>Margin Left Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginTopAttribute <em>Margin Top Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginRightAttribute <em>Margin Right Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginBottomAttribute <em>Margin Bottom Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentLeftAttribute <em>Align Parent Left Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentTopAttribute <em>Align Parent Top Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentRightAttribute <em>Align Parent Right Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentBottomAttribute <em>Align Parent Bottom Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignTopAttribute <em>Align Top Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignBottomAttribute <em>Align Bottom Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignLeftAttribute <em>Align Left Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getBelowAttribute <em>Below Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAboveAttribute <em>Above Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToLeftOfAttribute <em>To Left Of Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToRightOfAttribute <em>To Right Of Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterHorizontalAttribute <em>Center Horizontal Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterInParentAttribute <em>Center In Parent Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterVerticalAttribute <em>Center Vertical Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getColumnAttribute <em>Column Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getSpanAttribute <em>Span Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties()
 * @model
 * @generated
 */
public interface LayoutProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Weight Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight Attribute</em>' containment reference.
   * @see #setWeightAttribute(WeightAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_WeightAttribute()
   * @model containment="true"
   * @generated
   */
  WeightAttribute getWeightAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getWeightAttribute <em>Weight Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight Attribute</em>' containment reference.
   * @see #getWeightAttribute()
   * @generated
   */
  void setWeightAttribute(WeightAttribute value);

  /**
   * Returns the value of the '<em><b>Margin Left Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Left Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Left Attribute</em>' containment reference.
   * @see #setMarginLeftAttribute(MarginLeftAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_MarginLeftAttribute()
   * @model containment="true"
   * @generated
   */
  MarginLeftAttribute getMarginLeftAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginLeftAttribute <em>Margin Left Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Left Attribute</em>' containment reference.
   * @see #getMarginLeftAttribute()
   * @generated
   */
  void setMarginLeftAttribute(MarginLeftAttribute value);

  /**
   * Returns the value of the '<em><b>Margin Top Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Top Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Top Attribute</em>' containment reference.
   * @see #setMarginTopAttribute(MarginTopAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_MarginTopAttribute()
   * @model containment="true"
   * @generated
   */
  MarginTopAttribute getMarginTopAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginTopAttribute <em>Margin Top Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Top Attribute</em>' containment reference.
   * @see #getMarginTopAttribute()
   * @generated
   */
  void setMarginTopAttribute(MarginTopAttribute value);

  /**
   * Returns the value of the '<em><b>Margin Right Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Right Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Right Attribute</em>' containment reference.
   * @see #setMarginRightAttribute(MarginRightAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_MarginRightAttribute()
   * @model containment="true"
   * @generated
   */
  MarginRightAttribute getMarginRightAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginRightAttribute <em>Margin Right Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Right Attribute</em>' containment reference.
   * @see #getMarginRightAttribute()
   * @generated
   */
  void setMarginRightAttribute(MarginRightAttribute value);

  /**
   * Returns the value of the '<em><b>Margin Bottom Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Bottom Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Bottom Attribute</em>' containment reference.
   * @see #setMarginBottomAttribute(MarginBottomAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_MarginBottomAttribute()
   * @model containment="true"
   * @generated
   */
  MarginBottomAttribute getMarginBottomAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginBottomAttribute <em>Margin Bottom Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Bottom Attribute</em>' containment reference.
   * @see #getMarginBottomAttribute()
   * @generated
   */
  void setMarginBottomAttribute(MarginBottomAttribute value);

  /**
   * Returns the value of the '<em><b>Align Parent Left Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Parent Left Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Parent Left Attribute</em>' containment reference.
   * @see #setAlignParentLeftAttribute(AlignParentLeftAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AlignParentLeftAttribute()
   * @model containment="true"
   * @generated
   */
  AlignParentLeftAttribute getAlignParentLeftAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentLeftAttribute <em>Align Parent Left Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Parent Left Attribute</em>' containment reference.
   * @see #getAlignParentLeftAttribute()
   * @generated
   */
  void setAlignParentLeftAttribute(AlignParentLeftAttribute value);

  /**
   * Returns the value of the '<em><b>Align Parent Top Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Parent Top Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Parent Top Attribute</em>' containment reference.
   * @see #setAlignParentTopAttribute(AlignParentTopAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AlignParentTopAttribute()
   * @model containment="true"
   * @generated
   */
  AlignParentTopAttribute getAlignParentTopAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentTopAttribute <em>Align Parent Top Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Parent Top Attribute</em>' containment reference.
   * @see #getAlignParentTopAttribute()
   * @generated
   */
  void setAlignParentTopAttribute(AlignParentTopAttribute value);

  /**
   * Returns the value of the '<em><b>Align Parent Right Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Parent Right Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Parent Right Attribute</em>' containment reference.
   * @see #setAlignParentRightAttribute(AlignParentRightAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AlignParentRightAttribute()
   * @model containment="true"
   * @generated
   */
  AlignParentRightAttribute getAlignParentRightAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentRightAttribute <em>Align Parent Right Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Parent Right Attribute</em>' containment reference.
   * @see #getAlignParentRightAttribute()
   * @generated
   */
  void setAlignParentRightAttribute(AlignParentRightAttribute value);

  /**
   * Returns the value of the '<em><b>Align Parent Bottom Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Parent Bottom Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Parent Bottom Attribute</em>' containment reference.
   * @see #setAlignParentBottomAttribute(AlignParentBottomAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AlignParentBottomAttribute()
   * @model containment="true"
   * @generated
   */
  AlignParentBottomAttribute getAlignParentBottomAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentBottomAttribute <em>Align Parent Bottom Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Parent Bottom Attribute</em>' containment reference.
   * @see #getAlignParentBottomAttribute()
   * @generated
   */
  void setAlignParentBottomAttribute(AlignParentBottomAttribute value);

  /**
   * Returns the value of the '<em><b>Align Top Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Top Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Top Attribute</em>' containment reference.
   * @see #setAlignTopAttribute(AlignTopAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AlignTopAttribute()
   * @model containment="true"
   * @generated
   */
  AlignTopAttribute getAlignTopAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignTopAttribute <em>Align Top Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Top Attribute</em>' containment reference.
   * @see #getAlignTopAttribute()
   * @generated
   */
  void setAlignTopAttribute(AlignTopAttribute value);

  /**
   * Returns the value of the '<em><b>Align Bottom Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Bottom Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Bottom Attribute</em>' containment reference.
   * @see #setAlignBottomAttribute(AlignBottomAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AlignBottomAttribute()
   * @model containment="true"
   * @generated
   */
  AlignBottomAttribute getAlignBottomAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignBottomAttribute <em>Align Bottom Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Bottom Attribute</em>' containment reference.
   * @see #getAlignBottomAttribute()
   * @generated
   */
  void setAlignBottomAttribute(AlignBottomAttribute value);

  /**
   * Returns the value of the '<em><b>Align Left Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align Left Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align Left Attribute</em>' containment reference.
   * @see #setAlignLeftAttribute(AlignLeftAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AlignLeftAttribute()
   * @model containment="true"
   * @generated
   */
  AlignLeftAttribute getAlignLeftAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignLeftAttribute <em>Align Left Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align Left Attribute</em>' containment reference.
   * @see #getAlignLeftAttribute()
   * @generated
   */
  void setAlignLeftAttribute(AlignLeftAttribute value);

  /**
   * Returns the value of the '<em><b>Below Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Below Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Below Attribute</em>' containment reference.
   * @see #setBelowAttribute(BelowAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_BelowAttribute()
   * @model containment="true"
   * @generated
   */
  BelowAttribute getBelowAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getBelowAttribute <em>Below Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Below Attribute</em>' containment reference.
   * @see #getBelowAttribute()
   * @generated
   */
  void setBelowAttribute(BelowAttribute value);

  /**
   * Returns the value of the '<em><b>Above Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Above Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Above Attribute</em>' containment reference.
   * @see #setAboveAttribute(AboveAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_AboveAttribute()
   * @model containment="true"
   * @generated
   */
  AboveAttribute getAboveAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAboveAttribute <em>Above Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Above Attribute</em>' containment reference.
   * @see #getAboveAttribute()
   * @generated
   */
  void setAboveAttribute(AboveAttribute value);

  /**
   * Returns the value of the '<em><b>To Left Of Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Left Of Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Left Of Attribute</em>' containment reference.
   * @see #setToLeftOfAttribute(ToLeftOfAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_ToLeftOfAttribute()
   * @model containment="true"
   * @generated
   */
  ToLeftOfAttribute getToLeftOfAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToLeftOfAttribute <em>To Left Of Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Left Of Attribute</em>' containment reference.
   * @see #getToLeftOfAttribute()
   * @generated
   */
  void setToLeftOfAttribute(ToLeftOfAttribute value);

  /**
   * Returns the value of the '<em><b>To Right Of Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Right Of Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Right Of Attribute</em>' containment reference.
   * @see #setToRightOfAttribute(ToRightOfAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_ToRightOfAttribute()
   * @model containment="true"
   * @generated
   */
  ToRightOfAttribute getToRightOfAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToRightOfAttribute <em>To Right Of Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Right Of Attribute</em>' containment reference.
   * @see #getToRightOfAttribute()
   * @generated
   */
  void setToRightOfAttribute(ToRightOfAttribute value);

  /**
   * Returns the value of the '<em><b>Center Horizontal Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center Horizontal Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center Horizontal Attribute</em>' containment reference.
   * @see #setCenterHorizontalAttribute(CenterHorizontalAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_CenterHorizontalAttribute()
   * @model containment="true"
   * @generated
   */
  CenterHorizontalAttribute getCenterHorizontalAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterHorizontalAttribute <em>Center Horizontal Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center Horizontal Attribute</em>' containment reference.
   * @see #getCenterHorizontalAttribute()
   * @generated
   */
  void setCenterHorizontalAttribute(CenterHorizontalAttribute value);

  /**
   * Returns the value of the '<em><b>Center In Parent Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center In Parent Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center In Parent Attribute</em>' containment reference.
   * @see #setCenterInParentAttribute(CenterInParentAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_CenterInParentAttribute()
   * @model containment="true"
   * @generated
   */
  CenterInParentAttribute getCenterInParentAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterInParentAttribute <em>Center In Parent Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center In Parent Attribute</em>' containment reference.
   * @see #getCenterInParentAttribute()
   * @generated
   */
  void setCenterInParentAttribute(CenterInParentAttribute value);

  /**
   * Returns the value of the '<em><b>Center Vertical Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center Vertical Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center Vertical Attribute</em>' containment reference.
   * @see #setCenterVerticalAttribute(CenterVerticalAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_CenterVerticalAttribute()
   * @model containment="true"
   * @generated
   */
  CenterVerticalAttribute getCenterVerticalAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterVerticalAttribute <em>Center Vertical Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center Vertical Attribute</em>' containment reference.
   * @see #getCenterVerticalAttribute()
   * @generated
   */
  void setCenterVerticalAttribute(CenterVerticalAttribute value);

  /**
   * Returns the value of the '<em><b>Column Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Attribute</em>' containment reference.
   * @see #setColumnAttribute(ColumnAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_ColumnAttribute()
   * @model containment="true"
   * @generated
   */
  ColumnAttribute getColumnAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getColumnAttribute <em>Column Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Attribute</em>' containment reference.
   * @see #getColumnAttribute()
   * @generated
   */
  void setColumnAttribute(ColumnAttribute value);

  /**
   * Returns the value of the '<em><b>Span Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span Attribute</em>' containment reference.
   * @see #setSpanAttribute(SpanAttribute)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutProperties_SpanAttribute()
   * @model containment="true"
   * @generated
   */
  SpanAttribute getSpanAttribute();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getSpanAttribute <em>Span Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span Attribute</em>' containment reference.
   * @see #getSpanAttribute()
   * @generated
   */
  void setSpanAttribute(SpanAttribute value);

} // LayoutProperties
