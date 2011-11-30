/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Width Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColumnWidthAttributeImpl#getColumnWidth <em>Column Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnWidthAttributeImpl extends MinimalEObjectImpl.Container implements ColumnWidthAttribute
{
  /**
   * The cached value of the '{@link #getColumnWidth() <em>Column Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnWidth()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue columnWidth;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColumnWidthAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getColumnWidthAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getColumnWidth()
  {
    return columnWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnWidth(DimensionPropertyValue newColumnWidth, NotificationChain msgs)
  {
    DimensionPropertyValue oldColumnWidth = columnWidth;
    columnWidth = newColumnWidth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH, oldColumnWidth, newColumnWidth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnWidth(DimensionPropertyValue newColumnWidth)
  {
    if (newColumnWidth != columnWidth)
    {
      NotificationChain msgs = null;
      if (columnWidth != null)
        msgs = ((InternalEObject)columnWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH, null, msgs);
      if (newColumnWidth != null)
        msgs = ((InternalEObject)newColumnWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH, null, msgs);
      msgs = basicSetColumnWidth(newColumnWidth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH, newColumnWidth, newColumnWidth));
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
      case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH:
        return basicSetColumnWidth(null, msgs);
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
      case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH:
        return getColumnWidth();
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
      case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH:
        setColumnWidth((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH:
        setColumnWidth((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH:
        return columnWidth != null;
    }
    return super.eIsSet(featureID);
  }

} //ColumnWidthAttributeImpl
