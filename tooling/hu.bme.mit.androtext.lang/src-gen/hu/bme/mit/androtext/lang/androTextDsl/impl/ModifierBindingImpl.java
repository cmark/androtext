/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.EntityModifier;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.ModifierBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ModifierBindingImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ModifierBindingImpl#getGameEntity <em>Game Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifierBindingImpl extends LogicImpl implements ModifierBinding
{
  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected EntityModifier modifier;

  /**
   * The cached value of the '{@link #getGameEntity() <em>Game Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGameEntity()
   * @generated
   * @ordered
   */
  protected GameEntity gameEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModifierBindingImpl()
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
    return AndroTextDslPackage.eINSTANCE.getModifierBinding();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityModifier getModifier()
  {
    if (modifier != null && modifier.eIsProxy())
    {
      InternalEObject oldModifier = (InternalEObject)modifier;
      modifier = (EntityModifier)eResolveProxy(oldModifier);
      if (modifier != oldModifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.MODIFIER_BINDING__MODIFIER, oldModifier, modifier));
      }
    }
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityModifier basicGetModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(EntityModifier newModifier)
  {
    EntityModifier oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MODIFIER_BINDING__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameEntity getGameEntity()
  {
    if (gameEntity != null && gameEntity.eIsProxy())
    {
      InternalEObject oldGameEntity = (InternalEObject)gameEntity;
      gameEntity = (GameEntity)eResolveProxy(oldGameEntity);
      if (gameEntity != oldGameEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.MODIFIER_BINDING__GAME_ENTITY, oldGameEntity, gameEntity));
      }
    }
    return gameEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameEntity basicGetGameEntity()
  {
    return gameEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGameEntity(GameEntity newGameEntity)
  {
    GameEntity oldGameEntity = gameEntity;
    gameEntity = newGameEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MODIFIER_BINDING__GAME_ENTITY, oldGameEntity, gameEntity));
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
      case AndroTextDslPackage.MODIFIER_BINDING__MODIFIER:
        if (resolve) return getModifier();
        return basicGetModifier();
      case AndroTextDslPackage.MODIFIER_BINDING__GAME_ENTITY:
        if (resolve) return getGameEntity();
        return basicGetGameEntity();
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
      case AndroTextDslPackage.MODIFIER_BINDING__MODIFIER:
        setModifier((EntityModifier)newValue);
        return;
      case AndroTextDslPackage.MODIFIER_BINDING__GAME_ENTITY:
        setGameEntity((GameEntity)newValue);
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
      case AndroTextDslPackage.MODIFIER_BINDING__MODIFIER:
        setModifier((EntityModifier)null);
        return;
      case AndroTextDslPackage.MODIFIER_BINDING__GAME_ENTITY:
        setGameEntity((GameEntity)null);
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
      case AndroTextDslPackage.MODIFIER_BINDING__MODIFIER:
        return modifier != null;
      case AndroTextDslPackage.MODIFIER_BINDING__GAME_ENTITY:
        return gameEntity != null;
    }
    return super.eIsSet(featureID);
  }

} //ModifierBindingImpl
