/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl#getCollapseColumns <em>Collapse Columns</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl#getShrinkColumns <em>Shrink Columns</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl#getStretchColumns <em>Stretch Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableLayoutImpl extends ViewGroupImpl implements TableLayout
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
   * The cached value of the '{@link #getShrinkColumns() <em>Shrink Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShrinkColumns()
   * @generated
   * @ordered
   */
  protected EList<IntegerPropertyValue> shrinkColumns;

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
  protected TableLayoutImpl()
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
    return AndroTextDslPackage.Literals.TABLE_LAYOUT;
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
      collapseColumns = new EObjectContainmentEList<IntegerPropertyValue>(IntegerPropertyValue.class, this, AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS);
    }
    return collapseColumns;
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
      shrinkColumns = new EObjectContainmentEList<IntegerPropertyValue>(IntegerPropertyValue.class, this, AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS);
    }
    return shrinkColumns;
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
      stretchColumns = new EObjectContainmentEList<IntegerPropertyValue>(IntegerPropertyValue.class, this, AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS);
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS:
        return ((InternalEList<?>)getCollapseColumns()).basicRemove(otherEnd, msgs);
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS:
        return ((InternalEList<?>)getShrinkColumns()).basicRemove(otherEnd, msgs);
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS:
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS:
        return getCollapseColumns();
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS:
        return getShrinkColumns();
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS:
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS:
        getCollapseColumns().clear();
        getCollapseColumns().addAll((Collection<? extends IntegerPropertyValue>)newValue);
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS:
        getShrinkColumns().clear();
        getShrinkColumns().addAll((Collection<? extends IntegerPropertyValue>)newValue);
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS:
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS:
        getCollapseColumns().clear();
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS:
        getShrinkColumns().clear();
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS:
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS:
        return collapseColumns != null && !collapseColumns.isEmpty();
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS:
        return shrinkColumns != null && !shrinkColumns.isEmpty();
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS:
        return stretchColumns != null && !stretchColumns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TableLayoutImpl
