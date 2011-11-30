/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Dimension Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutDimensionPropertyValueImpl#getConstValue <em>Const Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutDimensionPropertyValueImpl extends PropertyValueImpl implements LayoutDimensionPropertyValue
{
  /**
   * The default value of the '{@link #getConstValue() <em>Const Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstValue()
   * @generated
   * @ordered
   */
  protected static final LayoutDimensionKind CONST_VALUE_EDEFAULT = LayoutDimensionKind.FILL;

  /**
   * The cached value of the '{@link #getConstValue() <em>Const Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstValue()
   * @generated
   * @ordered
   */
  protected LayoutDimensionKind constValue = CONST_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayoutDimensionPropertyValueImpl()
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
    return AndroTextDslPackage.eINSTANCE.getLayoutDimensionPropertyValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutDimensionKind getConstValue()
  {
    return constValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstValue(LayoutDimensionKind newConstValue)
  {
    LayoutDimensionKind oldConstValue = constValue;
    constValue = newConstValue == null ? CONST_VALUE_EDEFAULT : newConstValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE, oldConstValue, constValue));
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
      case AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE:
        return getConstValue();
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
      case AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE:
        setConstValue((LayoutDimensionKind)newValue);
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
      case AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE:
        setConstValue(CONST_VALUE_EDEFAULT);
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
      case AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE:
        return constValue != CONST_VALUE_EDEFAULT;
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
    result.append(" (constValue: ");
    result.append(constValue);
    result.append(')');
    return result.toString();
  }

} //LayoutDimensionPropertyValueImpl
