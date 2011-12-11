/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getValue <em>Value</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDimensionValue()
 * @model
 * @generated
 */
public interface DimensionValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDimensionValue_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

  /**
   * Returns the value of the '<em><b>Metric</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric
   * @see #setMetric(DimensionMetric)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDimensionValue_Metric()
   * @model
   * @generated
   */
  DimensionMetric getMetric();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getMetric <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metric</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric
   * @see #getMetric()
   * @generated
   */
  void setMetric(DimensionMetric value);

} // DimensionValue
