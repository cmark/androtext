/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stretch Mode Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StretchModeAttributeImpl#getStretchMode <em>Stretch Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StretchModeAttributeImpl extends MinimalEObjectImpl.Container implements StretchModeAttribute
{
  /**
   * The default value of the '{@link #getStretchMode() <em>Stretch Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchMode()
   * @generated
   * @ordered
   */
  protected static final StretchModeKind STRETCH_MODE_EDEFAULT = StretchModeKind.NONE;

  /**
   * The cached value of the '{@link #getStretchMode() <em>Stretch Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchMode()
   * @generated
   * @ordered
   */
  protected StretchModeKind stretchMode = STRETCH_MODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StretchModeAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getStretchModeAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StretchModeKind getStretchMode()
  {
    return stretchMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStretchMode(StretchModeKind newStretchMode)
  {
    StretchModeKind oldStretchMode = stretchMode;
    stretchMode = newStretchMode == null ? STRETCH_MODE_EDEFAULT : newStretchMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE__STRETCH_MODE, oldStretchMode, stretchMode));
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
      case AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE__STRETCH_MODE:
        return getStretchMode();
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
      case AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE__STRETCH_MODE:
        setStretchMode((StretchModeKind)newValue);
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
      case AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE__STRETCH_MODE:
        setStretchMode(STRETCH_MODE_EDEFAULT);
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
      case AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE__STRETCH_MODE:
        return stretchMode != STRETCH_MODE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (stretchMode: ");
    result.append(stretchMode);
    result.append(')');
    return result.toString();
  }

} //StretchModeAttributeImpl
