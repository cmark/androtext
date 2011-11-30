/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
public class ToggleButtonImpl extends SimpleViewImpl implements ToggleButton
{
  /**
   * The cached value of the '{@link #getTextOn() <em>Text On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOn()
   * @generated
   * @ordered
   */
  protected StringPropertyValue textOn;

  /**
   * The cached value of the '{@link #getTextOff() <em>Text Off</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOff()
   * @generated
   * @ordered
   */
  protected StringPropertyValue textOff;

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
    return AndroTextDslPackage.eINSTANCE.getToggleButton();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue getTextOn()
  {
    return textOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextOn(StringPropertyValue newTextOn, NotificationChain msgs)
  {
    StringPropertyValue oldTextOn = textOn;
    textOn = newTextOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON, oldTextOn, newTextOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextOn(StringPropertyValue newTextOn)
  {
    if (newTextOn != textOn)
    {
      NotificationChain msgs = null;
      if (textOn != null)
        msgs = ((InternalEObject)textOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON, null, msgs);
      if (newTextOn != null)
        msgs = ((InternalEObject)newTextOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON, null, msgs);
      msgs = basicSetTextOn(newTextOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON, newTextOn, newTextOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue getTextOff()
  {
    return textOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextOff(StringPropertyValue newTextOff, NotificationChain msgs)
  {
    StringPropertyValue oldTextOff = textOff;
    textOff = newTextOff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF, oldTextOff, newTextOff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextOff(StringPropertyValue newTextOff)
  {
    if (newTextOff != textOff)
    {
      NotificationChain msgs = null;
      if (textOff != null)
        msgs = ((InternalEObject)textOff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF, null, msgs);
      if (newTextOff != null)
        msgs = ((InternalEObject)newTextOff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF, null, msgs);
      msgs = basicSetTextOff(newTextOff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF, newTextOff, newTextOff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_ON:
        return basicSetTextOn(null, msgs);
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        return basicSetTextOff(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
        setTextOn((StringPropertyValue)newValue);
        return;
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        setTextOff((StringPropertyValue)newValue);
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
        setTextOn((StringPropertyValue)null);
        return;
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        setTextOff((StringPropertyValue)null);
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
        return textOn != null;
      case AndroTextDslPackage.TOGGLE_BUTTON__TEXT_OFF:
        return textOff != null;
    }
    return super.eIsSet(featureID);
  }

} //ToggleButtonImpl
