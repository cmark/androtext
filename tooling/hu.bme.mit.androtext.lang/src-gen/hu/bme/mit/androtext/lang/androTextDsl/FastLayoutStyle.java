/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fast Layout Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFastLayoutStyle()
 * @model
 * @generated
 */
public interface FastLayoutStyle extends LayoutStyle
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind
   * @see #setValue(FastLayoutDimensionKind)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFastLayoutStyle_Value()
   * @model
   * @generated
   */
  FastLayoutDimensionKind getValue();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind
   * @see #getValue()
   * @generated
   */
  void setValue(FastLayoutDimensionKind value);

} // FastLayoutStyle
