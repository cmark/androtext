/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin Bottom Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginBottomAttributeImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarginBottomAttributeImpl extends MinimalEObjectImpl.Container implements MarginBottomAttribute
{
  /**
   * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginBottom()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginBottom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarginBottomAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getMarginBottomAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginBottom()
  {
    return marginBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginBottom(DimensionPropertyValue newMarginBottom, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginBottom = marginBottom;
    marginBottom = newMarginBottom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM, oldMarginBottom, newMarginBottom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginBottom(DimensionPropertyValue newMarginBottom)
  {
    if (newMarginBottom != marginBottom)
    {
      NotificationChain msgs = null;
      if (marginBottom != null)
        msgs = ((InternalEObject)marginBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM, null, msgs);
      if (newMarginBottom != null)
        msgs = ((InternalEObject)newMarginBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM, null, msgs);
      msgs = basicSetMarginBottom(newMarginBottom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM, newMarginBottom, newMarginBottom));
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
      case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM:
        return basicSetMarginBottom(null, msgs);
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
      case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM:
        return getMarginBottom();
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
      case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM:
        setMarginBottom((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM:
        setMarginBottom((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM:
        return marginBottom != null;
    }
    return super.eIsSet(featureID);
  }

} //MarginBottomAttributeImpl
