/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Gravity Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutGravityAttributeImpl#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutGravityAttributeImpl extends MinimalEObjectImpl.Container implements LayoutGravityAttribute
{
  /**
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected EList<LayoutGravityKind> gravity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayoutGravityAttributeImpl()
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
    return AndroTextDslPackage.Literals.LAYOUT_GRAVITY_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LayoutGravityKind> getGravity()
  {
    if (gravity == null)
    {
      gravity = new EDataTypeEList<LayoutGravityKind>(LayoutGravityKind.class, this, AndroTextDslPackage.LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY);
    }
    return gravity;
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
      case AndroTextDslPackage.LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY:
        return getGravity();
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
      case AndroTextDslPackage.LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY:
        getGravity().clear();
        getGravity().addAll((Collection<? extends LayoutGravityKind>)newValue);
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
      case AndroTextDslPackage.LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY:
        getGravity().clear();
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
      case AndroTextDslPackage.LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY:
        return gravity != null && !gravity.isEmpty();
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

} //LayoutGravityAttributeImpl
