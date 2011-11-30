/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl#getCollapseColumnsAttribute <em>Collapse Columns Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl#getShrinkColumnsAttribute <em>Shrink Columns Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl#getStretchColumnsAttribute <em>Stretch Columns Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableLayoutImpl extends ViewGroupImpl implements TableLayout
{
  /**
   * The cached value of the '{@link #getCollapseColumnsAttribute() <em>Collapse Columns Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollapseColumnsAttribute()
   * @generated
   * @ordered
   */
  protected CollapseColumnsAttribute collapseColumnsAttribute;

  /**
   * The cached value of the '{@link #getShrinkColumnsAttribute() <em>Shrink Columns Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShrinkColumnsAttribute()
   * @generated
   * @ordered
   */
  protected ShrinkColumnsAttribute shrinkColumnsAttribute;

  /**
   * The cached value of the '{@link #getStretchColumnsAttribute() <em>Stretch Columns Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchColumnsAttribute()
   * @generated
   * @ordered
   */
  protected StretchColumnsAttribute stretchColumnsAttribute;

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
    return AndroTextDslPackage.eINSTANCE.getTableLayout();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollapseColumnsAttribute getCollapseColumnsAttribute()
  {
    return collapseColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollapseColumnsAttribute(CollapseColumnsAttribute newCollapseColumnsAttribute, NotificationChain msgs)
  {
    CollapseColumnsAttribute oldCollapseColumnsAttribute = collapseColumnsAttribute;
    collapseColumnsAttribute = newCollapseColumnsAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE, oldCollapseColumnsAttribute, newCollapseColumnsAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollapseColumnsAttribute(CollapseColumnsAttribute newCollapseColumnsAttribute)
  {
    if (newCollapseColumnsAttribute != collapseColumnsAttribute)
    {
      NotificationChain msgs = null;
      if (collapseColumnsAttribute != null)
        msgs = ((InternalEObject)collapseColumnsAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE, null, msgs);
      if (newCollapseColumnsAttribute != null)
        msgs = ((InternalEObject)newCollapseColumnsAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE, null, msgs);
      msgs = basicSetCollapseColumnsAttribute(newCollapseColumnsAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE, newCollapseColumnsAttribute, newCollapseColumnsAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShrinkColumnsAttribute getShrinkColumnsAttribute()
  {
    return shrinkColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShrinkColumnsAttribute(ShrinkColumnsAttribute newShrinkColumnsAttribute, NotificationChain msgs)
  {
    ShrinkColumnsAttribute oldShrinkColumnsAttribute = shrinkColumnsAttribute;
    shrinkColumnsAttribute = newShrinkColumnsAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE, oldShrinkColumnsAttribute, newShrinkColumnsAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShrinkColumnsAttribute(ShrinkColumnsAttribute newShrinkColumnsAttribute)
  {
    if (newShrinkColumnsAttribute != shrinkColumnsAttribute)
    {
      NotificationChain msgs = null;
      if (shrinkColumnsAttribute != null)
        msgs = ((InternalEObject)shrinkColumnsAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE, null, msgs);
      if (newShrinkColumnsAttribute != null)
        msgs = ((InternalEObject)newShrinkColumnsAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE, null, msgs);
      msgs = basicSetShrinkColumnsAttribute(newShrinkColumnsAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE, newShrinkColumnsAttribute, newShrinkColumnsAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StretchColumnsAttribute getStretchColumnsAttribute()
  {
    return stretchColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStretchColumnsAttribute(StretchColumnsAttribute newStretchColumnsAttribute, NotificationChain msgs)
  {
    StretchColumnsAttribute oldStretchColumnsAttribute = stretchColumnsAttribute;
    stretchColumnsAttribute = newStretchColumnsAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE, oldStretchColumnsAttribute, newStretchColumnsAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStretchColumnsAttribute(StretchColumnsAttribute newStretchColumnsAttribute)
  {
    if (newStretchColumnsAttribute != stretchColumnsAttribute)
    {
      NotificationChain msgs = null;
      if (stretchColumnsAttribute != null)
        msgs = ((InternalEObject)stretchColumnsAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE, null, msgs);
      if (newStretchColumnsAttribute != null)
        msgs = ((InternalEObject)newStretchColumnsAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE, null, msgs);
      msgs = basicSetStretchColumnsAttribute(newStretchColumnsAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE, newStretchColumnsAttribute, newStretchColumnsAttribute));
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE:
        return basicSetCollapseColumnsAttribute(null, msgs);
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE:
        return basicSetShrinkColumnsAttribute(null, msgs);
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE:
        return basicSetStretchColumnsAttribute(null, msgs);
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE:
        return getCollapseColumnsAttribute();
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE:
        return getShrinkColumnsAttribute();
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE:
        return getStretchColumnsAttribute();
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE:
        setCollapseColumnsAttribute((CollapseColumnsAttribute)newValue);
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE:
        setShrinkColumnsAttribute((ShrinkColumnsAttribute)newValue);
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE:
        setStretchColumnsAttribute((StretchColumnsAttribute)newValue);
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE:
        setCollapseColumnsAttribute((CollapseColumnsAttribute)null);
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE:
        setShrinkColumnsAttribute((ShrinkColumnsAttribute)null);
        return;
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE:
        setStretchColumnsAttribute((StretchColumnsAttribute)null);
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
      case AndroTextDslPackage.TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE:
        return collapseColumnsAttribute != null;
      case AndroTextDslPackage.TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE:
        return shrinkColumnsAttribute != null;
      case AndroTextDslPackage.TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE:
        return stretchColumnsAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //TableLayoutImpl
