/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Horizontal Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CenterHorizontalAttributeImpl#getCenterHorizontal <em>Center Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CenterHorizontalAttributeImpl extends MinimalEObjectImpl.Container implements CenterHorizontalAttribute
{
  /**
   * The cached value of the '{@link #getCenterHorizontal() <em>Center Horizontal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterHorizontal()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue centerHorizontal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CenterHorizontalAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getCenterHorizontalAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getCenterHorizontal()
  {
    return centerHorizontal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterHorizontal(BooleanPropertyValue newCenterHorizontal, NotificationChain msgs)
  {
    BooleanPropertyValue oldCenterHorizontal = centerHorizontal;
    centerHorizontal = newCenterHorizontal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL, oldCenterHorizontal, newCenterHorizontal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterHorizontal(BooleanPropertyValue newCenterHorizontal)
  {
    if (newCenterHorizontal != centerHorizontal)
    {
      NotificationChain msgs = null;
      if (centerHorizontal != null)
        msgs = ((InternalEObject)centerHorizontal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL, null, msgs);
      if (newCenterHorizontal != null)
        msgs = ((InternalEObject)newCenterHorizontal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL, null, msgs);
      msgs = basicSetCenterHorizontal(newCenterHorizontal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL, newCenterHorizontal, newCenterHorizontal));
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
      case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL:
        return basicSetCenterHorizontal(null, msgs);
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
      case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL:
        return getCenterHorizontal();
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
      case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL:
        setCenterHorizontal((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL:
        setCenterHorizontal((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL:
        return centerHorizontal != null;
    }
    return super.eIsSet(featureID);
  }

} //CenterHorizontalAttributeImpl
