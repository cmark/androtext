/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;

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
 * An implementation of the model object '<em><b>Collapse Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CollapseColumnsAttributeImpl#getCollapseColumns <em>Collapse Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollapseColumnsAttributeImpl extends MinimalEObjectImpl.Container implements CollapseColumnsAttribute
{
  /**
   * The cached value of the '{@link #getCollapseColumns() <em>Collapse Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollapseColumns()
   * @generated
   * @ordered
   */
  protected EList<IntegerPropertyValue> collapseColumns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollapseColumnsAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getCollapseColumnsAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerPropertyValue> getCollapseColumns()
  {
    if (collapseColumns == null)
    {
      collapseColumns = new EObjectContainmentEList<IntegerPropertyValue>(IntegerPropertyValue.class, this, AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE__COLLAPSE_COLUMNS);
    }
    return collapseColumns;
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
      case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE__COLLAPSE_COLUMNS:
        return ((InternalEList<?>)getCollapseColumns()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE__COLLAPSE_COLUMNS:
        return getCollapseColumns();
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
      case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE__COLLAPSE_COLUMNS:
        getCollapseColumns().clear();
        getCollapseColumns().addAll((Collection<? extends IntegerPropertyValue>)newValue);
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
      case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE__COLLAPSE_COLUMNS:
        getCollapseColumns().clear();
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
      case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE__COLLAPSE_COLUMNS:
        return collapseColumns != null && !collapseColumns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CollapseColumnsAttributeImpl
