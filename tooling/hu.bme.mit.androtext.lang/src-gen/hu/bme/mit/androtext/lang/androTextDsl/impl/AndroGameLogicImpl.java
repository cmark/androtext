/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LogicComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Andro Game Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGameLogicImpl#getLogicComponent <em>Logic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroGameLogicImpl extends AndroGameComponentImpl implements AndroGameLogic
{
  /**
   * The cached value of the '{@link #getLogicComponent() <em>Logic Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicComponent()
   * @generated
   * @ordered
   */
  protected EList<LogicComponent> logicComponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroGameLogicImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAndroGameLogic();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LogicComponent> getLogicComponent()
  {
    if (logicComponent == null)
    {
      logicComponent = new EObjectContainmentEList<LogicComponent>(LogicComponent.class, this, AndroTextDslPackage.ANDRO_GAME_LOGIC__LOGIC_COMPONENT);
    }
    return logicComponent;
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
      case AndroTextDslPackage.ANDRO_GAME_LOGIC__LOGIC_COMPONENT:
        return ((InternalEList<?>)getLogicComponent()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.ANDRO_GAME_LOGIC__LOGIC_COMPONENT:
        return getLogicComponent();
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
      case AndroTextDslPackage.ANDRO_GAME_LOGIC__LOGIC_COMPONENT:
        getLogicComponent().clear();
        getLogicComponent().addAll((Collection<? extends LogicComponent>)newValue);
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
      case AndroTextDslPackage.ANDRO_GAME_LOGIC__LOGIC_COMPONENT:
        getLogicComponent().clear();
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
      case AndroTextDslPackage.ANDRO_GAME_LOGIC__LOGIC_COMPONENT:
        return logicComponent != null && !logicComponent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AndroGameLogicImpl
