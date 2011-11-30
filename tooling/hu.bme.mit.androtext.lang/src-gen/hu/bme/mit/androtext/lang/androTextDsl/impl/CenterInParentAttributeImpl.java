/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center In Parent Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CenterInParentAttributeImpl#getCenterInParent <em>Center In Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CenterInParentAttributeImpl extends MinimalEObjectImpl.Container implements CenterInParentAttribute
{
  /**
   * The cached value of the '{@link #getCenterInParent() <em>Center In Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterInParent()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue centerInParent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CenterInParentAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getCenterInParentAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getCenterInParent()
  {
    return centerInParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterInParent(BooleanPropertyValue newCenterInParent, NotificationChain msgs)
  {
    BooleanPropertyValue oldCenterInParent = centerInParent;
    centerInParent = newCenterInParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT, oldCenterInParent, newCenterInParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterInParent(BooleanPropertyValue newCenterInParent)
  {
    if (newCenterInParent != centerInParent)
    {
      NotificationChain msgs = null;
      if (centerInParent != null)
        msgs = ((InternalEObject)centerInParent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT, null, msgs);
      if (newCenterInParent != null)
        msgs = ((InternalEObject)newCenterInParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT, null, msgs);
      msgs = basicSetCenterInParent(newCenterInParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT, newCenterInParent, newCenterInParent));
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
      case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT:
        return basicSetCenterInParent(null, msgs);
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
      case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT:
        return getCenterInParent();
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
      case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT:
        setCenterInParent((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT:
        setCenterInParent((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT:
        return centerInParent != null;
    }
    return super.eIsSet(featureID);
  }

} //CenterInParentAttributeImpl
