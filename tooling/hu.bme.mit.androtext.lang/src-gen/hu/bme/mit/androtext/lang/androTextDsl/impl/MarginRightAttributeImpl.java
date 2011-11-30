/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin Right Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginRightAttributeImpl#getMarginRight <em>Margin Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarginRightAttributeImpl extends MinimalEObjectImpl.Container implements MarginRightAttribute
{
  /**
   * The cached value of the '{@link #getMarginRight() <em>Margin Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginRight()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginRight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarginRightAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getMarginRightAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginRight()
  {
    return marginRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginRight(DimensionPropertyValue newMarginRight, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginRight = marginRight;
    marginRight = newMarginRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT, oldMarginRight, newMarginRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginRight(DimensionPropertyValue newMarginRight)
  {
    if (newMarginRight != marginRight)
    {
      NotificationChain msgs = null;
      if (marginRight != null)
        msgs = ((InternalEObject)marginRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT, null, msgs);
      if (newMarginRight != null)
        msgs = ((InternalEObject)newMarginRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT, null, msgs);
      msgs = basicSetMarginRight(newMarginRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT, newMarginRight, newMarginRight));
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
      case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT:
        return basicSetMarginRight(null, msgs);
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
      case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT:
        return getMarginRight();
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
      case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT:
        setMarginRight((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT:
        setMarginRight((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT:
        return marginRight != null;
    }
    return super.eIsSet(featureID);
  }

} //MarginRightAttributeImpl
