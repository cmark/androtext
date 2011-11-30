/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Padding Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PaddingAttributeImpl#getPadding <em>Padding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaddingAttributeImpl extends MinimalEObjectImpl.Container implements PaddingAttribute
{
  /**
   * The cached value of the '{@link #getPadding() <em>Padding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadding()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue padding;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PaddingAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getPaddingAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getPadding()
  {
    return padding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPadding(DimensionPropertyValue newPadding, NotificationChain msgs)
  {
    DimensionPropertyValue oldPadding = padding;
    padding = newPadding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING, oldPadding, newPadding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPadding(DimensionPropertyValue newPadding)
  {
    if (newPadding != padding)
    {
      NotificationChain msgs = null;
      if (padding != null)
        msgs = ((InternalEObject)padding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING, null, msgs);
      if (newPadding != null)
        msgs = ((InternalEObject)newPadding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING, null, msgs);
      msgs = basicSetPadding(newPadding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING, newPadding, newPadding));
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
      case AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING:
        return basicSetPadding(null, msgs);
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
      case AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING:
        return getPadding();
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
      case AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING:
        setPadding((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING:
        setPadding((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.PADDING_ATTRIBUTE__PADDING:
        return padding != null;
    }
    return super.eIsSet(featureID);
  }

} //PaddingAttributeImpl
