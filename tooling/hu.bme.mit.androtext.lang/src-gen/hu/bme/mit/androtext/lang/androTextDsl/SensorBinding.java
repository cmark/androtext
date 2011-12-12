/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SensorBinding#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SensorBinding#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSensorBinding()
 * @model
 * @generated
 */
public interface SensorBinding extends Logic
{
  /**
   * Returns the value of the '<em><b>Sensor Type</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.SensorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SensorType
   * @see #setSensorType(SensorType)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSensorBinding_SensorType()
   * @model
   * @generated
   */
  SensorType getSensorType();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SensorBinding#getSensorType <em>Sensor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SensorType
   * @see #getSensorType()
   * @generated
   */
  void setSensorType(SensorType value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.SensorTarget}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SensorTarget
   * @see #setTo(SensorTarget)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSensorBinding_To()
   * @model
   * @generated
   */
  SensorTarget getTo();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SensorBinding#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SensorTarget
   * @see #getTo()
   * @generated
   */
  void setTo(SensorTarget value);

} // SensorBinding
