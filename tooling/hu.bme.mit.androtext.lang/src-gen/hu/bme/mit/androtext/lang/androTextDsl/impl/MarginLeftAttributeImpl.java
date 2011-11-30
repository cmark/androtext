/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin Left Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginLeftAttributeImpl#getMarginLeft <em>Margin Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarginLeftAttributeImpl extends MinimalEObjectImpl.Container implements MarginLeftAttribute
{
  /**
   * The cached value of the '{@link #getMarginLeft() <em>Margin Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginLeft()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginLeft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarginLeftAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getMarginLeftAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginLeft()
  {
    return marginLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginLeft(DimensionPropertyValue newMarginLeft, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginLeft = marginLeft;
    marginLeft = newMarginLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT, oldMarginLeft, newMarginLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginLeft(DimensionPropertyValue newMarginLeft)
  {
    if (newMarginLeft != marginLeft)
    {
      NotificationChain msgs = null;
      if (marginLeft != null)
        msgs = ((InternalEObject)marginLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT, null, msgs);
      if (newMarginLeft != null)
        msgs = ((InternalEObject)newMarginLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT, null, msgs);
      msgs = basicSetMarginLeft(newMarginLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT, newMarginLeft, newMarginLeft));
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
      case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT:
        return basicSetMarginLeft(null, msgs);
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
      case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT:
        return getMarginLeft();
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
      case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT:
        setMarginLeft((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT:
        setMarginLeft((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT:
        return marginLeft != null;
    }
    return super.eIsSet(featureID);
  }

} //MarginLeftAttributeImpl
