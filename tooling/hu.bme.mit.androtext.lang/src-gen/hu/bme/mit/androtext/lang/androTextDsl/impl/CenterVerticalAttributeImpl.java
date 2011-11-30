/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Vertical Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CenterVerticalAttributeImpl#getCenterVertical <em>Center Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CenterVerticalAttributeImpl extends MinimalEObjectImpl.Container implements CenterVerticalAttribute
{
  /**
   * The cached value of the '{@link #getCenterVertical() <em>Center Vertical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterVertical()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue centerVertical;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CenterVerticalAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getCenterVerticalAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getCenterVertical()
  {
    return centerVertical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterVertical(BooleanPropertyValue newCenterVertical, NotificationChain msgs)
  {
    BooleanPropertyValue oldCenterVertical = centerVertical;
    centerVertical = newCenterVertical;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL, oldCenterVertical, newCenterVertical);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterVertical(BooleanPropertyValue newCenterVertical)
  {
    if (newCenterVertical != centerVertical)
    {
      NotificationChain msgs = null;
      if (centerVertical != null)
        msgs = ((InternalEObject)centerVertical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL, null, msgs);
      if (newCenterVertical != null)
        msgs = ((InternalEObject)newCenterVertical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL, null, msgs);
      msgs = basicSetCenterVertical(newCenterVertical, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL, newCenterVertical, newCenterVertical));
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
      case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL:
        return basicSetCenterVertical(null, msgs);
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
      case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL:
        return getCenterVertical();
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
      case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL:
        setCenterVertical((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL:
        setCenterVertical((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL:
        return centerVertical != null;
    }
    return super.eIsSet(featureID);
  }

} //CenterVerticalAttributeImpl
