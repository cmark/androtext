/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Align Bottom Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignBottomAttributeImpl#getAlignBottom <em>Align Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignBottomAttributeImpl extends MinimalEObjectImpl.Container implements AlignBottomAttribute
{
  /**
   * The cached value of the '{@link #getAlignBottom() <em>Align Bottom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignBottom()
   * @generated
   * @ordered
   */
  protected View alignBottom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlignBottomAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAlignBottomAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getAlignBottom()
  {
    if (alignBottom != null && alignBottom.eIsProxy())
    {
      InternalEObject oldAlignBottom = (InternalEObject)alignBottom;
      alignBottom = (View)eResolveProxy(oldAlignBottom);
      if (alignBottom != oldAlignBottom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE__ALIGN_BOTTOM, oldAlignBottom, alignBottom));
      }
    }
    return alignBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetAlignBottom()
  {
    return alignBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignBottom(View newAlignBottom)
  {
    View oldAlignBottom = alignBottom;
    alignBottom = newAlignBottom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE__ALIGN_BOTTOM, oldAlignBottom, alignBottom));
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
      case AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE__ALIGN_BOTTOM:
        if (resolve) return getAlignBottom();
        return basicGetAlignBottom();
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
      case AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE__ALIGN_BOTTOM:
        setAlignBottom((View)newValue);
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
      case AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE__ALIGN_BOTTOM:
        setAlignBottom((View)null);
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
      case AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE__ALIGN_BOTTOM:
        return alignBottom != null;
    }
    return super.eIsSet(featureID);
  }

} //AlignBottomAttributeImpl
