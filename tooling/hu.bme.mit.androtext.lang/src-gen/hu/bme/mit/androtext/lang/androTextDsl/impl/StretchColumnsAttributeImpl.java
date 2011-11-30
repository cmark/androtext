/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute;

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
 * An implementation of the model object '<em><b>Stretch Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StretchColumnsAttributeImpl#getStretchColumns <em>Stretch Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StretchColumnsAttributeImpl extends MinimalEObjectImpl.Container implements StretchColumnsAttribute
{
  /**
   * The cached value of the '{@link #getStretchColumns() <em>Stretch Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchColumns()
   * @generated
   * @ordered
   */
  protected EList<IntegerPropertyValue> stretchColumns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StretchColumnsAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getStretchColumnsAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerPropertyValue> getStretchColumns()
  {
    if (stretchColumns == null)
    {
      stretchColumns = new EObjectContainmentEList<IntegerPropertyValue>(IntegerPropertyValue.class, this, AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE__STRETCH_COLUMNS);
    }
    return stretchColumns;
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
      case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE__STRETCH_COLUMNS:
        return ((InternalEList<?>)getStretchColumns()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE__STRETCH_COLUMNS:
        return getStretchColumns();
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
      case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE__STRETCH_COLUMNS:
        getStretchColumns().clear();
        getStretchColumns().addAll((Collection<? extends IntegerPropertyValue>)newValue);
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
      case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE__STRETCH_COLUMNS:
        getStretchColumns().clear();
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
      case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE__STRETCH_COLUMNS:
        return stretchColumns != null && !stretchColumns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StretchColumnsAttributeImpl
