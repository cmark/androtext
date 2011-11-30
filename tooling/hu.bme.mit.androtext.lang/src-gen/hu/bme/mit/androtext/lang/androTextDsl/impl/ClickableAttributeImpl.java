/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clickable Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ClickableAttributeImpl#getClickable <em>Clickable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClickableAttributeImpl extends MinimalEObjectImpl.Container implements ClickableAttribute
{
  /**
   * The cached value of the '{@link #getClickable() <em>Clickable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickable()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue clickable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClickableAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getClickableAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getClickable()
  {
    return clickable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClickable(BooleanPropertyValue newClickable, NotificationChain msgs)
  {
    BooleanPropertyValue oldClickable = clickable;
    clickable = newClickable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE, oldClickable, newClickable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClickable(BooleanPropertyValue newClickable)
  {
    if (newClickable != clickable)
    {
      NotificationChain msgs = null;
      if (clickable != null)
        msgs = ((InternalEObject)clickable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE, null, msgs);
      if (newClickable != null)
        msgs = ((InternalEObject)newClickable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE, null, msgs);
      msgs = basicSetClickable(newClickable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE, newClickable, newClickable));
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
      case AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE:
        return basicSetClickable(null, msgs);
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
      case AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE:
        return getClickable();
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
      case AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE:
        setClickable((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE:
        setClickable((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.CLICKABLE_ATTRIBUTE__CLICKABLE:
        return clickable != null;
    }
    return super.eIsSet(featureID);
  }

} //ClickableAttributeImpl
