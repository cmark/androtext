/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute;
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
 * An implementation of the model object '<em><b>Align Parent Right Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentRightAttributeImpl#getAlignParentRight <em>Align Parent Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignParentRightAttributeImpl extends MinimalEObjectImpl.Container implements AlignParentRightAttribute
{
  /**
   * The cached value of the '{@link #getAlignParentRight() <em>Align Parent Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentRight()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentRight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlignParentRightAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAlignParentRightAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAlignParentRight()
  {
    return alignParentRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentRight(BooleanPropertyValue newAlignParentRight, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentRight = alignParentRight;
    alignParentRight = newAlignParentRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT, oldAlignParentRight, newAlignParentRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentRight(BooleanPropertyValue newAlignParentRight)
  {
    if (newAlignParentRight != alignParentRight)
    {
      NotificationChain msgs = null;
      if (alignParentRight != null)
        msgs = ((InternalEObject)alignParentRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT, null, msgs);
      if (newAlignParentRight != null)
        msgs = ((InternalEObject)newAlignParentRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT, null, msgs);
      msgs = basicSetAlignParentRight(newAlignParentRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT, newAlignParentRight, newAlignParentRight));
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
      case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT:
        return basicSetAlignParentRight(null, msgs);
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
      case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT:
        return getAlignParentRight();
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
      case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT:
        setAlignParentRight((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT:
        setAlignParentRight((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT:
        return alignParentRight != null;
    }
    return super.eIsSet(featureID);
  }

} //AlignParentRightAttributeImpl
