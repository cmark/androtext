/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.GameBackground;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;

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
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SceneImpl#getGameBackground <em>Game Background</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SceneImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneImpl extends GameElementImpl implements Scene
{
  /**
   * The cached value of the '{@link #getGameBackground() <em>Game Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGameBackground()
   * @generated
   * @ordered
   */
  protected GameBackground gameBackground;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<GameEntity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SceneImpl()
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
    return AndroTextDslPackage.eINSTANCE.getScene();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameBackground getGameBackground()
  {
    return gameBackground;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGameBackground(GameBackground newGameBackground, NotificationChain msgs)
  {
    GameBackground oldGameBackground = gameBackground;
    gameBackground = newGameBackground;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SCENE__GAME_BACKGROUND, oldGameBackground, newGameBackground);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGameBackground(GameBackground newGameBackground)
  {
    if (newGameBackground != gameBackground)
    {
      NotificationChain msgs = null;
      if (gameBackground != null)
        msgs = ((InternalEObject)gameBackground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SCENE__GAME_BACKGROUND, null, msgs);
      if (newGameBackground != null)
        msgs = ((InternalEObject)newGameBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SCENE__GAME_BACKGROUND, null, msgs);
      msgs = basicSetGameBackground(newGameBackground, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SCENE__GAME_BACKGROUND, newGameBackground, newGameBackground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GameEntity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<GameEntity>(GameEntity.class, this, AndroTextDslPackage.SCENE__ENTITIES);
    }
    return entities;
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
      case AndroTextDslPackage.SCENE__GAME_BACKGROUND:
        return basicSetGameBackground(null, msgs);
      case AndroTextDslPackage.SCENE__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.SCENE__GAME_BACKGROUND:
        return getGameBackground();
      case AndroTextDslPackage.SCENE__ENTITIES:
        return getEntities();
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
      case AndroTextDslPackage.SCENE__GAME_BACKGROUND:
        setGameBackground((GameBackground)newValue);
        return;
      case AndroTextDslPackage.SCENE__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends GameEntity>)newValue);
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
      case AndroTextDslPackage.SCENE__GAME_BACKGROUND:
        setGameBackground((GameBackground)null);
        return;
      case AndroTextDslPackage.SCENE__ENTITIES:
        getEntities().clear();
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
      case AndroTextDslPackage.SCENE__GAME_BACKGROUND:
        return gameBackground != null;
      case AndroTextDslPackage.SCENE__ENTITIES:
        return entities != null && !entities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SceneImpl
