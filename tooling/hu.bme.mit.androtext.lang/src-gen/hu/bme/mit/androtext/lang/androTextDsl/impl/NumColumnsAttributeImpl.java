/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Columns Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.NumColumnsAttributeImpl#isAutofit <em>Autofit</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.NumColumnsAttributeImpl#getNumColumns <em>Num Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumColumnsAttributeImpl extends MinimalEObjectImpl.Container implements NumColumnsAttribute
{
  /**
   * The default value of the '{@link #isAutofit() <em>Autofit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutofit()
   * @generated
   * @ordered
   */
  protected static final boolean AUTOFIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutofit() <em>Autofit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutofit()
   * @generated
   * @ordered
   */
  protected boolean autofit = AUTOFIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getNumColumns() <em>Num Columns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumColumns()
   * @generated
   * @ordered
   */
  protected IntegerPropertyValue numColumns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumColumnsAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getNumColumnsAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutofit()
  {
    return autofit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutofit(boolean newAutofit)
  {
    boolean oldAutofit = autofit;
    autofit = newAutofit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__AUTOFIT, oldAutofit, autofit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPropertyValue getNumColumns()
  {
    return numColumns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumColumns(IntegerPropertyValue newNumColumns, NotificationChain msgs)
  {
    IntegerPropertyValue oldNumColumns = numColumns;
    numColumns = newNumColumns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS, oldNumColumns, newNumColumns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumColumns(IntegerPropertyValue newNumColumns)
  {
    if (newNumColumns != numColumns)
    {
      NotificationChain msgs = null;
      if (numColumns != null)
        msgs = ((InternalEObject)numColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS, null, msgs);
      if (newNumColumns != null)
        msgs = ((InternalEObject)newNumColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS, null, msgs);
      msgs = basicSetNumColumns(newNumColumns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS, newNumColumns, newNumColumns));
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
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS:
        return basicSetNumColumns(null, msgs);
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
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__AUTOFIT:
        return isAutofit();
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS:
        return getNumColumns();
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
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__AUTOFIT:
        setAutofit((Boolean)newValue);
        return;
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS:
        setNumColumns((IntegerPropertyValue)newValue);
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
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__AUTOFIT:
        setAutofit(AUTOFIT_EDEFAULT);
        return;
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS:
        setNumColumns((IntegerPropertyValue)null);
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
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__AUTOFIT:
        return autofit != AUTOFIT_EDEFAULT;
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS:
        return numColumns != null;
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
    result.append(" (autofit: ");
    result.append(autofit);
    result.append(')');
    return result.toString();
  }

} //NumColumnsAttributeImpl
