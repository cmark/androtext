/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Link Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoLinkAttributeImpl#isAll <em>All</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoLinkAttributeImpl#getAutoLinkMask <em>Auto Link Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutoLinkAttributeImpl extends MinimalEObjectImpl.Container implements AutoLinkAttribute
{
  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getAutoLinkMask() <em>Auto Link Mask</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoLinkMask()
   * @generated
   * @ordered
   */
  protected EList<AutoLinkKind> autoLinkMask;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutoLinkAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAutoLinkAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AutoLinkKind> getAutoLinkMask()
  {
    if (autoLinkMask == null)
    {
      autoLinkMask = new EDataTypeEList<AutoLinkKind>(AutoLinkKind.class, this, AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__AUTO_LINK_MASK);
    }
    return autoLinkMask;
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
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__ALL:
        return isAll();
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__AUTO_LINK_MASK:
        return getAutoLinkMask();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__ALL:
        setAll((Boolean)newValue);
        return;
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__AUTO_LINK_MASK:
        getAutoLinkMask().clear();
        getAutoLinkMask().addAll((Collection<? extends AutoLinkKind>)newValue);
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
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__AUTO_LINK_MASK:
        getAutoLinkMask().clear();
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
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__ALL:
        return all != ALL_EDEFAULT;
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE__AUTO_LINK_MASK:
        return autoLinkMask != null && !autoLinkMask.isEmpty();
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
    result.append(" (all: ");
    result.append(all);
    result.append(", autoLinkMask: ");
    result.append(autoLinkMask);
    result.append(')');
    return result.toString();
  }

} //AutoLinkAttributeImpl
