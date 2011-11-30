/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute;
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
 * An implementation of the model object '<em><b>Align Parent Bottom Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentBottomAttributeImpl#getAlignParentBottom <em>Align Parent Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignParentBottomAttributeImpl extends MinimalEObjectImpl.Container implements AlignParentBottomAttribute
{
  /**
   * The cached value of the '{@link #getAlignParentBottom() <em>Align Parent Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentBottom()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentBottom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlignParentBottomAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAlignParentBottomAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAlignParentBottom()
  {
    return alignParentBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentBottom(BooleanPropertyValue newAlignParentBottom, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentBottom = alignParentBottom;
    alignParentBottom = newAlignParentBottom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM, oldAlignParentBottom, newAlignParentBottom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentBottom(BooleanPropertyValue newAlignParentBottom)
  {
    if (newAlignParentBottom != alignParentBottom)
    {
      NotificationChain msgs = null;
      if (alignParentBottom != null)
        msgs = ((InternalEObject)alignParentBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM, null, msgs);
      if (newAlignParentBottom != null)
        msgs = ((InternalEObject)newAlignParentBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM, null, msgs);
      msgs = basicSetAlignParentBottom(newAlignParentBottom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM, newAlignParentBottom, newAlignParentBottom));
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
      case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM:
        return basicSetAlignParentBottom(null, msgs);
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
      case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM:
        return getAlignParentBottom();
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
      case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM:
        setAlignParentBottom((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM:
        setAlignParentBottom((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM:
        return alignParentBottom != null;
    }
    return super.eIsSet(featureID);
  }

} //AlignParentBottomAttributeImpl
