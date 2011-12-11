/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroGameBox2DLogic;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Box2DComponent;
import hu.bme.mit.androtext.lang.androTextDsl.Box2DOptions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Andro Game Box2 DLogic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGameBox2DLogicImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGameBox2DLogicImpl#getBox2dComponent <em>Box2d Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroGameBox2DLogicImpl extends AndroGameComponentImpl implements AndroGameBox2DLogic
{
  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected Box2DOptions options;

  /**
   * The cached value of the '{@link #getBox2dComponent() <em>Box2d Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBox2dComponent()
   * @generated
   * @ordered
   */
  protected EList<Box2DComponent> box2dComponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroGameBox2DLogicImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAndroGameBox2DLogic();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Box2DOptions getOptions()
  {
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptions(Box2DOptions newOptions, NotificationChain msgs)
  {
    Box2DOptions oldOptions = options;
    options = newOptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS, oldOptions, newOptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptions(Box2DOptions newOptions)
  {
    if (newOptions != options)
    {
      NotificationChain msgs = null;
      if (options != null)
        msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS, null, msgs);
      if (newOptions != null)
        msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS, null, msgs);
      msgs = basicSetOptions(newOptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS, newOptions, newOptions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Box2DComponent> getBox2dComponent()
  {
    if (box2dComponent == null)
    {
      box2dComponent = new EObjectContainmentEList<Box2DComponent>(Box2DComponent.class, this, AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__BOX2D_COMPONENT);
    }
    return box2dComponent;
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
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS:
        return basicSetOptions(null, msgs);
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__BOX2D_COMPONENT:
        return ((InternalEList<?>)getBox2dComponent()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS:
        return getOptions();
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__BOX2D_COMPONENT:
        return getBox2dComponent();
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
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS:
        setOptions((Box2DOptions)newValue);
        return;
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__BOX2D_COMPONENT:
        getBox2dComponent().clear();
        getBox2dComponent().addAll((Collection<? extends Box2DComponent>)newValue);
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
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS:
        setOptions((Box2DOptions)null);
        return;
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__BOX2D_COMPONENT:
        getBox2dComponent().clear();
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
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__OPTIONS:
        return options != null;
      case AndroTextDslPackage.ANDRO_GAME_BOX2_DLOGIC__BOX2D_COMPONENT:
        return box2dComponent != null && !box2dComponent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AndroGameBox2DLogicImpl
