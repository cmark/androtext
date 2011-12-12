/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.SensorBinding;
import hu.bme.mit.androtext.lang.androTextDsl.SensorTarget;
import hu.bme.mit.androtext.lang.androTextDsl.SensorType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SensorBindingImpl#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SensorBindingImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorBindingImpl extends LogicImpl implements SensorBinding
{
  /**
   * The default value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensorType()
   * @generated
   * @ordered
   */
  protected static final SensorType SENSOR_TYPE_EDEFAULT = SensorType.ACCELEROMETER;

  /**
   * The cached value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensorType()
   * @generated
   * @ordered
   */
  protected SensorType sensorType = SENSOR_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final SensorTarget TO_EDEFAULT = SensorTarget.GRAVITY;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected SensorTarget to = TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorBindingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AndroTextDslPackage.eINSTANCE.getSensorBinding();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorType getSensorType()
  {
    return sensorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensorType(SensorType newSensorType)
  {
    SensorType oldSensorType = sensorType;
    sensorType = newSensorType == null ? SENSOR_TYPE_EDEFAULT : newSensorType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SENSOR_BINDING__SENSOR_TYPE, oldSensorType, sensorType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorTarget getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(SensorTarget newTo)
  {
    SensorTarget oldTo = to;
    to = newTo == null ? TO_EDEFAULT : newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SENSOR_BINDING__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.SENSOR_BINDING__SENSOR_TYPE:
        return getSensorType();
      case AndroTextDslPackage.SENSOR_BINDING__TO:
        return getTo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.SENSOR_BINDING__SENSOR_TYPE:
        setSensorType((SensorType)newValue);
        return;
      case AndroTextDslPackage.SENSOR_BINDING__TO:
        setTo((SensorTarget)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.SENSOR_BINDING__SENSOR_TYPE:
        setSensorType(SENSOR_TYPE_EDEFAULT);
        return;
      case AndroTextDslPackage.SENSOR_BINDING__TO:
        setTo(TO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.SENSOR_BINDING__SENSOR_TYPE:
        return sensorType != SENSOR_TYPE_EDEFAULT;
      case AndroTextDslPackage.SENSOR_BINDING__TO:
        return to != TO_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sensorType: ");
    result.append(sensorType);
    result.append(", to: ");
    result.append(to);
    result.append(')');
    return result.toString();
  }

} //SensorBindingImpl
