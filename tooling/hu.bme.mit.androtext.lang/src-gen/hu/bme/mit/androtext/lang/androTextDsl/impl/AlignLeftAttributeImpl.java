/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Align Left Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignLeftAttributeImpl#getAlignLeft <em>Align Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignLeftAttributeImpl extends MinimalEObjectImpl.Container implements AlignLeftAttribute
{
  /**
   * The cached value of the '{@link #getAlignLeft() <em>Align Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignLeft()
   * @generated
   * @ordered
   */
  protected View alignLeft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlignLeftAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAlignLeftAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getAlignLeft()
  {
    if (alignLeft != null && alignLeft.eIsProxy())
    {
      InternalEObject oldAlignLeft = (InternalEObject)alignLeft;
      alignLeft = (View)eResolveProxy(oldAlignLeft);
      if (alignLeft != oldAlignLeft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE__ALIGN_LEFT, oldAlignLeft, alignLeft));
      }
    }
    return alignLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetAlignLeft()
  {
    return alignLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignLeft(View newAlignLeft)
  {
    View oldAlignLeft = alignLeft;
    alignLeft = newAlignLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE__ALIGN_LEFT, oldAlignLeft, alignLeft));
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
      case AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE__ALIGN_LEFT:
        if (resolve) return getAlignLeft();
        return basicGetAlignLeft();
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
      case AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE__ALIGN_LEFT:
        setAlignLeft((View)newValue);
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
      case AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE__ALIGN_LEFT:
        setAlignLeft((View)null);
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
      case AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE__ALIGN_LEFT:
        return alignLeft != null;
    }
    return super.eIsSet(featureID);
  }

} //AlignLeftAttributeImpl
