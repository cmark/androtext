/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toggle Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl#getTextOn <em>Text On</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl#getTextOff <em>Text Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToggleButtonImpl extends WidgetImpl implements ToggleButton
{
  /**
   * The default value of the '{@link #getTextOn() <em>Text On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOn()
   * @generated
   * @ordered
   */
  protected static final String TEXT_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTextOn() <em>Text On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOn()
   * @generated
   * @ordered
   */
  protected String textOn = TEXT_ON_EDEFAULT;

  /**
   * The default value of the '{@link #getTextOff() <em>Text Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOff()
   * @generated
   * @ordered
   */
  protected static final String TEXT_OFF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTextOff() <em>Text Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOff()
   * @generated
   * @ordered
   */
  protected String textOff = TEXT_OFF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ToggleButtonImpl()
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
    return AndroTextDslPackage.Literals.TOGGLE_BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTextOn()
  {
    return textOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextOn(String newTextOn)
  {
    String oldTextOn = textOn;
    textOn = newTextOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON, oldTextOn, textOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTextOff()
  {
    return textOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextOff(String newTextOff)
  {
    String oldTextOff = textOff;
    textOff = newTextOff;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF, oldTextOff, textOff));
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
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON:
        return getTextOn();
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        return getTextOff();
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
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON:
        setTextOn((String)newValue);
        return;
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        setTextOff((String)newValue);
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
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON:
        setTextOn(TEXT_ON_EDEFAULT);
        return;
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        setTextOff(TEXT_OFF_EDEFAULT);
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
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON:
        return TEXT_ON_EDEFAULT == null ? textOn != null : !TEXT_ON_EDEFAULT.equals(textOn);
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        return TEXT_OFF_EDEFAULT == null ? textOff != null : !TEXT_OFF_EDEFAULT.equals(textOff);
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
    result.append(" (textOn: ");
    result.append(textOn);
    result.append(", textOff: ");
    result.append(textOff);
    result.append(')');
    return result.toString();
  }

} //ToggleButtonImpl
