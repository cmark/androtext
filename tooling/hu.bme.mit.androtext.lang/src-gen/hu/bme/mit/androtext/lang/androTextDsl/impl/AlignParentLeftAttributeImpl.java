/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Align Parent Left Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentLeftAttributeImpl#getAlignParentLeft <em>Align Parent Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignParentLeftAttributeImpl extends MinimalEObjectImpl.Container implements AlignParentLeftAttribute
{
  /**
   * The cached value of the '{@link #getAlignParentLeft() <em>Align Parent Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentLeft()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentLeft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlignParentLeftAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAlignParentLeftAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAlignParentLeft()
  {
    return alignParentLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentLeft(BooleanPropertyValue newAlignParentLeft, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentLeft = alignParentLeft;
    alignParentLeft = newAlignParentLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT, oldAlignParentLeft, newAlignParentLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentLeft(BooleanPropertyValue newAlignParentLeft)
  {
    if (newAlignParentLeft != alignParentLeft)
    {
      NotificationChain msgs = null;
      if (alignParentLeft != null)
        msgs = ((InternalEObject)alignParentLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT, null, msgs);
      if (newAlignParentLeft != null)
        msgs = ((InternalEObject)newAlignParentLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT, null, msgs);
      msgs = basicSetAlignParentLeft(newAlignParentLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT, newAlignParentLeft, newAlignParentLeft));
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
      case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT:
        return basicSetAlignParentLeft(null, msgs);
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
      case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT:
        return getAlignParentLeft();
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
      case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT:
        setAlignParentLeft((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT:
        setAlignParentLeft((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT:
        return alignParentLeft != null;
    }
    return super.eIsSet(featureID);
  }

} //AlignParentLeftAttributeImpl
