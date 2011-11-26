/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gravity Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GravityAttributeImpl#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GravityAttributeImpl extends MinimalEObjectImpl.Container implements GravityAttribute
{
  /**
   * The default value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected static final LayoutGravityKind GRAVITY_EDEFAULT = LayoutGravityKind.TOP;

  /**
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected LayoutGravityKind gravity = GRAVITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GravityAttributeImpl()
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
    return AndroTextDslPackage.Literals.GRAVITY_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutGravityKind getGravity()
  {
    return gravity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGravity(LayoutGravityKind newGravity)
  {
    LayoutGravityKind oldGravity = gravity;
    gravity = newGravity == null ? GRAVITY_EDEFAULT : newGravity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRAVITY_ATTRIBUTE__GRAVITY, oldGravity, gravity));
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
      case AndroTextDslPackage.GRAVITY_ATTRIBUTE__GRAVITY:
        return getGravity();
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
      case AndroTextDslPackage.GRAVITY_ATTRIBUTE__GRAVITY:
        setGravity((LayoutGravityKind)newValue);
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
      case AndroTextDslPackage.GRAVITY_ATTRIBUTE__GRAVITY:
        setGravity(GRAVITY_EDEFAULT);
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
      case AndroTextDslPackage.GRAVITY_ATTRIBUTE__GRAVITY:
        return gravity != GRAVITY_EDEFAULT;
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
    result.append(" (gravity: ");
    result.append(gravity);
    result.append(')');
    return result.toString();
  }

} //GravityAttributeImpl
