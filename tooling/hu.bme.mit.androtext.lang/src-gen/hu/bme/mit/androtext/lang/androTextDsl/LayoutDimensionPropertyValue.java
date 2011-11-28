/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Dimension Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue#getConstValue <em>Const Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutDimensionPropertyValue()
 * @model
 * @generated
 */
public interface LayoutDimensionPropertyValue extends PropertyValue
{
  /**
   * Returns the value of the '<em><b>Const Value</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Value</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
   * @see #setConstValue(LayoutDimensionKind)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutDimensionPropertyValue_ConstValue()
   * @model
   * @generated
   */
  LayoutDimensionKind getConstValue();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue#getConstValue <em>Const Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Value</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
   * @see #getConstValue()
   * @generated
   */
  void setConstValue(LayoutDimensionKind value);

} // LayoutDimensionPropertyValue
