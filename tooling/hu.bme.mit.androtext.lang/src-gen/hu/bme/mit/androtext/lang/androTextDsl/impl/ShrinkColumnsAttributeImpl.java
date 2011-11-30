/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shrink Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ShrinkColumnsAttributeImpl#getShrinkColumns <em>Shrink Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShrinkColumnsAttributeImpl extends MinimalEObjectImpl.Container implements ShrinkColumnsAttribute
{
  /**
   * The cached value of the '{@link #getShrinkColumns() <em>Shrink Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShrinkColumns()
   * @generated
   * @ordered
   */
  protected EList<IntegerPropertyValue> shrinkColumns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShrinkColumnsAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getShrinkColumnsAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerPropertyValue> getShrinkColumns()
  {
    if (shrinkColumns == null)
    {
      shrinkColumns = new EObjectContainmentEList<IntegerPropertyValue>(IntegerPropertyValue.class, this, AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE__SHRINK_COLUMNS);
    }
    return shrinkColumns;
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
      case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE__SHRINK_COLUMNS:
        return ((InternalEList<?>)getShrinkColumns()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE__SHRINK_COLUMNS:
        return getShrinkColumns();
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
      case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE__SHRINK_COLUMNS:
        getShrinkColumns().clear();
        getShrinkColumns().addAll((Collection<? extends IntegerPropertyValue>)newValue);
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
      case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE__SHRINK_COLUMNS:
        getShrinkColumns().clear();
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
      case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE__SHRINK_COLUMNS:
        return shrinkColumns != null && !shrinkColumns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ShrinkColumnsAttributeImpl
