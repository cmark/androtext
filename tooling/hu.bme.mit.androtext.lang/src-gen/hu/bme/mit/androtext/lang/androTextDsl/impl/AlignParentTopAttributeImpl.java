/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute;
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
 * An implementation of the model object '<em><b>Align Parent Top Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentTopAttributeImpl#getAlignParentTop <em>Align Parent Top</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignParentTopAttributeImpl extends MinimalEObjectImpl.Container implements AlignParentTopAttribute
{
  /**
   * The cached value of the '{@link #getAlignParentTop() <em>Align Parent Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentTop()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentTop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlignParentTopAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAlignParentTopAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAlignParentTop()
  {
    return alignParentTop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentTop(BooleanPropertyValue newAlignParentTop, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentTop = alignParentTop;
    alignParentTop = newAlignParentTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP, oldAlignParentTop, newAlignParentTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentTop(BooleanPropertyValue newAlignParentTop)
  {
    if (newAlignParentTop != alignParentTop)
    {
      NotificationChain msgs = null;
      if (alignParentTop != null)
        msgs = ((InternalEObject)alignParentTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP, null, msgs);
      if (newAlignParentTop != null)
        msgs = ((InternalEObject)newAlignParentTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP, null, msgs);
      msgs = basicSetAlignParentTop(newAlignParentTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP, newAlignParentTop, newAlignParentTop));
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
      case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP:
        return basicSetAlignParentTop(null, msgs);
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
      case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP:
        return getAlignParentTop();
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
      case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP:
        setAlignParentTop((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP:
        setAlignParentTop((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP:
        return alignParentTop != null;
    }
    return super.eIsSet(featureID);
  }

} //AlignParentTopAttributeImpl
