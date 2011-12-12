/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Body;
import hu.bme.mit.androtext.lang.androTextDsl.Box2DBinding;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box2 DBinding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.Box2DBindingImpl#getBody <em>Body</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.Box2DBindingImpl#getGameEntity <em>Game Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Box2DBindingImpl extends LogicImpl implements Box2DBinding
{
  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Body body;

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
  protected Box2DBindingImpl()
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
    return AndroTextDslPackage.eINSTANCE.getBox2DBinding();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getBody()
  {
    if (body != null && body.eIsProxy())
    {
      InternalEObject oldBody = (InternalEObject)body;
      body = (Body)eResolveProxy(oldBody);
      if (body != oldBody)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.BOX2_DBINDING__BODY, oldBody, body));
      }
    }
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body basicGetBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Body newBody)
  {
    Body oldBody = body;
    body = newBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BOX2_DBINDING__BODY, oldBody, body));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.BOX2_DBINDING__GAME_ENTITY, oldGameEntity, gameEntity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BOX2_DBINDING__GAME_ENTITY, oldGameEntity, gameEntity));
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
      case AndroTextDslPackage.BOX2_DBINDING__BODY:
        if (resolve) return getBody();
        return basicGetBody();
      case AndroTextDslPackage.BOX2_DBINDING__GAME_ENTITY:
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
      case AndroTextDslPackage.BOX2_DBINDING__BODY:
        setBody((Body)newValue);
        return;
      case AndroTextDslPackage.BOX2_DBINDING__GAME_ENTITY:
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
      case AndroTextDslPackage.BOX2_DBINDING__BODY:
        setBody((Body)null);
        return;
      case AndroTextDslPackage.BOX2_DBINDING__GAME_ENTITY:
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
      case AndroTextDslPackage.BOX2_DBINDING__BODY:
        return body != null;
      case AndroTextDslPackage.BOX2_DBINDING__GAME_ENTITY:
        return gameEntity != null;
    }
    return super.eIsSet(featureID);
  }

} //Box2DBindingImpl
