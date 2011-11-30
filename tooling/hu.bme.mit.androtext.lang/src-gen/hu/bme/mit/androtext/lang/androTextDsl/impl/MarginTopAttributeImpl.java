/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin Top Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginTopAttributeImpl#getMarginTop <em>Margin Top</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarginTopAttributeImpl extends MinimalEObjectImpl.Container implements MarginTopAttribute
{
  /**
   * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginTop()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginTop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarginTopAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getMarginTopAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginTop()
  {
    return marginTop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginTop(DimensionPropertyValue newMarginTop, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginTop = marginTop;
    marginTop = newMarginTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP, oldMarginTop, newMarginTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginTop(DimensionPropertyValue newMarginTop)
  {
    if (newMarginTop != marginTop)
    {
      NotificationChain msgs = null;
      if (marginTop != null)
        msgs = ((InternalEObject)marginTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP, null, msgs);
      if (newMarginTop != null)
        msgs = ((InternalEObject)newMarginTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP, null, msgs);
      msgs = basicSetMarginTop(newMarginTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP, newMarginTop, newMarginTop));
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
      case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP:
        return basicSetMarginTop(null, msgs);
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
      case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP:
        return getMarginTop();
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
      case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP:
        setMarginTop((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP:
        setMarginTop((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE__MARGIN_TOP:
        return marginTop != null;
    }
    return super.eIsSet(featureID);
  }

} //MarginTopAttributeImpl
