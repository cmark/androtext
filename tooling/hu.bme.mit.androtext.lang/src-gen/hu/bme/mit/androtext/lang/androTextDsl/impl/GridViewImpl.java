/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GridView;
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl#getColumnWidthAttribute <em>Column Width Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl#getHorizontalSpacingAttribute <em>Horizontal Spacing Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl#getVerticalSpacingAttribute <em>Vertical Spacing Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl#getNumColumnsAttribute <em>Num Columns Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl#getStretchModeAttribute <em>Stretch Mode Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl#getGravityAttribute <em>Gravity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridViewImpl extends SimpleViewImpl implements GridView
{
  /**
   * The cached value of the '{@link #getColumnWidthAttribute() <em>Column Width Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnWidthAttribute()
   * @generated
   * @ordered
   */
  protected ColumnWidthAttribute columnWidthAttribute;

  /**
   * The cached value of the '{@link #getHorizontalSpacingAttribute() <em>Horizontal Spacing Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalSpacingAttribute()
   * @generated
   * @ordered
   */
  protected HorizontalSpacingAttribute horizontalSpacingAttribute;

  /**
   * The cached value of the '{@link #getVerticalSpacingAttribute() <em>Vertical Spacing Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalSpacingAttribute()
   * @generated
   * @ordered
   */
  protected VerticalSpacingAttribute verticalSpacingAttribute;

  /**
   * The cached value of the '{@link #getNumColumnsAttribute() <em>Num Columns Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumColumnsAttribute()
   * @generated
   * @ordered
   */
  protected NumColumnsAttribute numColumnsAttribute;

  /**
   * The cached value of the '{@link #getStretchModeAttribute() <em>Stretch Mode Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchModeAttribute()
   * @generated
   * @ordered
   */
  protected StretchModeAttribute stretchModeAttribute;

  /**
   * The cached value of the '{@link #getGravityAttribute() <em>Gravity Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravityAttribute()
   * @generated
   * @ordered
   */
  protected GravityAttribute gravityAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GridViewImpl()
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
    return AndroTextDslPackage.eINSTANCE.getGridView();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnWidthAttribute getColumnWidthAttribute()
  {
    return columnWidthAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnWidthAttribute(ColumnWidthAttribute newColumnWidthAttribute, NotificationChain msgs)
  {
    ColumnWidthAttribute oldColumnWidthAttribute = columnWidthAttribute;
    columnWidthAttribute = newColumnWidthAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE, oldColumnWidthAttribute, newColumnWidthAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnWidthAttribute(ColumnWidthAttribute newColumnWidthAttribute)
  {
    if (newColumnWidthAttribute != columnWidthAttribute)
    {
      NotificationChain msgs = null;
      if (columnWidthAttribute != null)
        msgs = ((InternalEObject)columnWidthAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE, null, msgs);
      if (newColumnWidthAttribute != null)
        msgs = ((InternalEObject)newColumnWidthAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE, null, msgs);
      msgs = basicSetColumnWidthAttribute(newColumnWidthAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE, newColumnWidthAttribute, newColumnWidthAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalSpacingAttribute getHorizontalSpacingAttribute()
  {
    return horizontalSpacingAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorizontalSpacingAttribute(HorizontalSpacingAttribute newHorizontalSpacingAttribute, NotificationChain msgs)
  {
    HorizontalSpacingAttribute oldHorizontalSpacingAttribute = horizontalSpacingAttribute;
    horizontalSpacingAttribute = newHorizontalSpacingAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE, oldHorizontalSpacingAttribute, newHorizontalSpacingAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontalSpacingAttribute(HorizontalSpacingAttribute newHorizontalSpacingAttribute)
  {
    if (newHorizontalSpacingAttribute != horizontalSpacingAttribute)
    {
      NotificationChain msgs = null;
      if (horizontalSpacingAttribute != null)
        msgs = ((InternalEObject)horizontalSpacingAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE, null, msgs);
      if (newHorizontalSpacingAttribute != null)
        msgs = ((InternalEObject)newHorizontalSpacingAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE, null, msgs);
      msgs = basicSetHorizontalSpacingAttribute(newHorizontalSpacingAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE, newHorizontalSpacingAttribute, newHorizontalSpacingAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalSpacingAttribute getVerticalSpacingAttribute()
  {
    return verticalSpacingAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerticalSpacingAttribute(VerticalSpacingAttribute newVerticalSpacingAttribute, NotificationChain msgs)
  {
    VerticalSpacingAttribute oldVerticalSpacingAttribute = verticalSpacingAttribute;
    verticalSpacingAttribute = newVerticalSpacingAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE, oldVerticalSpacingAttribute, newVerticalSpacingAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerticalSpacingAttribute(VerticalSpacingAttribute newVerticalSpacingAttribute)
  {
    if (newVerticalSpacingAttribute != verticalSpacingAttribute)
    {
      NotificationChain msgs = null;
      if (verticalSpacingAttribute != null)
        msgs = ((InternalEObject)verticalSpacingAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE, null, msgs);
      if (newVerticalSpacingAttribute != null)
        msgs = ((InternalEObject)newVerticalSpacingAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE, null, msgs);
      msgs = basicSetVerticalSpacingAttribute(newVerticalSpacingAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE, newVerticalSpacingAttribute, newVerticalSpacingAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumColumnsAttribute getNumColumnsAttribute()
  {
    return numColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumColumnsAttribute(NumColumnsAttribute newNumColumnsAttribute, NotificationChain msgs)
  {
    NumColumnsAttribute oldNumColumnsAttribute = numColumnsAttribute;
    numColumnsAttribute = newNumColumnsAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE, oldNumColumnsAttribute, newNumColumnsAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumColumnsAttribute(NumColumnsAttribute newNumColumnsAttribute)
  {
    if (newNumColumnsAttribute != numColumnsAttribute)
    {
      NotificationChain msgs = null;
      if (numColumnsAttribute != null)
        msgs = ((InternalEObject)numColumnsAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE, null, msgs);
      if (newNumColumnsAttribute != null)
        msgs = ((InternalEObject)newNumColumnsAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE, null, msgs);
      msgs = basicSetNumColumnsAttribute(newNumColumnsAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE, newNumColumnsAttribute, newNumColumnsAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StretchModeAttribute getStretchModeAttribute()
  {
    return stretchModeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStretchModeAttribute(StretchModeAttribute newStretchModeAttribute, NotificationChain msgs)
  {
    StretchModeAttribute oldStretchModeAttribute = stretchModeAttribute;
    stretchModeAttribute = newStretchModeAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE, oldStretchModeAttribute, newStretchModeAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStretchModeAttribute(StretchModeAttribute newStretchModeAttribute)
  {
    if (newStretchModeAttribute != stretchModeAttribute)
    {
      NotificationChain msgs = null;
      if (stretchModeAttribute != null)
        msgs = ((InternalEObject)stretchModeAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE, null, msgs);
      if (newStretchModeAttribute != null)
        msgs = ((InternalEObject)newStretchModeAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE, null, msgs);
      msgs = basicSetStretchModeAttribute(newStretchModeAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE, newStretchModeAttribute, newStretchModeAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GravityAttribute getGravityAttribute()
  {
    return gravityAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGravityAttribute(GravityAttribute newGravityAttribute, NotificationChain msgs)
  {
    GravityAttribute oldGravityAttribute = gravityAttribute;
    gravityAttribute = newGravityAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE, oldGravityAttribute, newGravityAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGravityAttribute(GravityAttribute newGravityAttribute)
  {
    if (newGravityAttribute != gravityAttribute)
    {
      NotificationChain msgs = null;
      if (gravityAttribute != null)
        msgs = ((InternalEObject)gravityAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE, null, msgs);
      if (newGravityAttribute != null)
        msgs = ((InternalEObject)newGravityAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE, null, msgs);
      msgs = basicSetGravityAttribute(newGravityAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE, newGravityAttribute, newGravityAttribute));
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
      case AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE:
        return basicSetColumnWidthAttribute(null, msgs);
      case AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE:
        return basicSetHorizontalSpacingAttribute(null, msgs);
      case AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE:
        return basicSetVerticalSpacingAttribute(null, msgs);
      case AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE:
        return basicSetNumColumnsAttribute(null, msgs);
      case AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE:
        return basicSetStretchModeAttribute(null, msgs);
      case AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE:
        return basicSetGravityAttribute(null, msgs);
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
      case AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE:
        return getColumnWidthAttribute();
      case AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE:
        return getHorizontalSpacingAttribute();
      case AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE:
        return getVerticalSpacingAttribute();
      case AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE:
        return getNumColumnsAttribute();
      case AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE:
        return getStretchModeAttribute();
      case AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE:
        return getGravityAttribute();
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
      case AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE:
        setColumnWidthAttribute((ColumnWidthAttribute)newValue);
        return;
      case AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE:
        setHorizontalSpacingAttribute((HorizontalSpacingAttribute)newValue);
        return;
      case AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE:
        setVerticalSpacingAttribute((VerticalSpacingAttribute)newValue);
        return;
      case AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE:
        setNumColumnsAttribute((NumColumnsAttribute)newValue);
        return;
      case AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE:
        setStretchModeAttribute((StretchModeAttribute)newValue);
        return;
      case AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE:
        setGravityAttribute((GravityAttribute)newValue);
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
      case AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE:
        setColumnWidthAttribute((ColumnWidthAttribute)null);
        return;
      case AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE:
        setHorizontalSpacingAttribute((HorizontalSpacingAttribute)null);
        return;
      case AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE:
        setVerticalSpacingAttribute((VerticalSpacingAttribute)null);
        return;
      case AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE:
        setNumColumnsAttribute((NumColumnsAttribute)null);
        return;
      case AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE:
        setStretchModeAttribute((StretchModeAttribute)null);
        return;
      case AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE:
        setGravityAttribute((GravityAttribute)null);
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
      case AndroTextDslPackage.GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE:
        return columnWidthAttribute != null;
      case AndroTextDslPackage.GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE:
        return horizontalSpacingAttribute != null;
      case AndroTextDslPackage.GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE:
        return verticalSpacingAttribute != null;
      case AndroTextDslPackage.GRID_VIEW__NUM_COLUMNS_ATTRIBUTE:
        return numColumnsAttribute != null;
      case AndroTextDslPackage.GRID_VIEW__STRETCH_MODE_ATTRIBUTE:
        return stretchModeAttribute != null;
      case AndroTextDslPackage.GRID_VIEW__GRAVITY_ATTRIBUTE:
        return gravityAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //GridViewImpl
