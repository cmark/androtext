/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutParams;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Layout Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutParamsImpl#getLayoutParams <em>Layout Params</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutParamsImpl#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearLayoutParamsImpl extends MinimalEObjectImpl.Container implements LinearLayoutParams
{
  /**
   * The cached value of the '{@link #getLayoutParams() <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutParams()
   * @generated
   * @ordered
   */
  protected LayoutParams layoutParams;

  /**
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected LayoutGravityAttribute gravity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinearLayoutParamsImpl()
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
    return AndroTextDslPackage.Literals.LINEAR_LAYOUT_PARAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutParams getLayoutParams()
  {
    return layoutParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayoutParams(LayoutParams newLayoutParams, NotificationChain msgs)
  {
    LayoutParams oldLayoutParams = layoutParams;
    layoutParams = newLayoutParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS, oldLayoutParams, newLayoutParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutParams(LayoutParams newLayoutParams)
  {
    if (newLayoutParams != layoutParams)
    {
      NotificationChain msgs = null;
      if (layoutParams != null)
        msgs = ((InternalEObject)layoutParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS, null, msgs);
      if (newLayoutParams != null)
        msgs = ((InternalEObject)newLayoutParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS, null, msgs);
      msgs = basicSetLayoutParams(newLayoutParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS, newLayoutParams, newLayoutParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutGravityAttribute getGravity()
  {
    return gravity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGravity(LayoutGravityAttribute newGravity, NotificationChain msgs)
  {
    LayoutGravityAttribute oldGravity = gravity;
    gravity = newGravity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY, oldGravity, newGravity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGravity(LayoutGravityAttribute newGravity)
  {
    if (newGravity != gravity)
    {
      NotificationChain msgs = null;
      if (gravity != null)
        msgs = ((InternalEObject)gravity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY, null, msgs);
      if (newGravity != null)
        msgs = ((InternalEObject)newGravity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY, null, msgs);
      msgs = basicSetGravity(newGravity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY, newGravity, newGravity));
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
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS:
        return basicSetLayoutParams(null, msgs);
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY:
        return basicSetGravity(null, msgs);
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
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS:
        return getLayoutParams();
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY:
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
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS:
        setLayoutParams((LayoutParams)newValue);
        return;
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY:
        setGravity((LayoutGravityAttribute)newValue);
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
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS:
        setLayoutParams((LayoutParams)null);
        return;
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY:
        setGravity((LayoutGravityAttribute)null);
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
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS:
        return layoutParams != null;
      case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS__GRAVITY:
        return gravity != null;
    }
    return super.eIsSet(featureID);
  }

} //LinearLayoutParamsImpl
