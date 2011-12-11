/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroGameComponent;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Andro Game Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGameRootImpl#getAndroGameComponents <em>Andro Game Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroGameRootImpl extends ModelRootImpl implements AndroGameRoot
{
  /**
   * The cached value of the '{@link #getAndroGameComponents() <em>Andro Game Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndroGameComponents()
   * @generated
   * @ordered
   */
  protected EList<AndroGameComponent> androGameComponents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroGameRootImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAndroGameRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AndroGameComponent> getAndroGameComponents()
  {
    if (androGameComponents == null)
    {
      androGameComponents = new EObjectContainmentEList<AndroGameComponent>(AndroGameComponent.class, this, AndroTextDslPackage.ANDRO_GAME_ROOT__ANDRO_GAME_COMPONENTS);
    }
    return androGameComponents;
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
      case AndroTextDslPackage.ANDRO_GAME_ROOT__ANDRO_GAME_COMPONENTS:
        return ((InternalEList<?>)getAndroGameComponents()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.ANDRO_GAME_ROOT__ANDRO_GAME_COMPONENTS:
        return getAndroGameComponents();
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
      case AndroTextDslPackage.ANDRO_GAME_ROOT__ANDRO_GAME_COMPONENTS:
        getAndroGameComponents().clear();
        getAndroGameComponents().addAll((Collection<? extends AndroGameComponent>)newValue);
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
      case AndroTextDslPackage.ANDRO_GAME_ROOT__ANDRO_GAME_COMPONENTS:
        getAndroGameComponents().clear();
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
      case AndroTextDslPackage.ANDRO_GAME_ROOT__ANDRO_GAME_COMPONENTS:
        return androGameComponents != null && !androGameComponents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AndroGameRootImpl
