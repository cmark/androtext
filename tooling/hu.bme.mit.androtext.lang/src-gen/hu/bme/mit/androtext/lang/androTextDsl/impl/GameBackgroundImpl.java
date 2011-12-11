/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Color;
import hu.bme.mit.androtext.lang.androTextDsl.GameBackground;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Background</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GameBackgroundImpl#getColor <em>Color</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GameBackgroundImpl#getTextureRegion <em>Texture Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameBackgroundImpl extends MinimalEObjectImpl.Container implements GameBackground
{
  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * The cached value of the '{@link #getTextureRegion() <em>Texture Region</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextureRegion()
   * @generated
   * @ordered
   */
  protected TextureRegion textureRegion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameBackgroundImpl()
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
    return AndroTextDslPackage.eINSTANCE.getGameBackground();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GAME_BACKGROUND__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GAME_BACKGROUND__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.GAME_BACKGROUND__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GAME_BACKGROUND__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextureRegion getTextureRegion()
  {
    if (textureRegion != null && textureRegion.eIsProxy())
    {
      InternalEObject oldTextureRegion = (InternalEObject)textureRegion;
      textureRegion = (TextureRegion)eResolveProxy(oldTextureRegion);
      if (textureRegion != oldTextureRegion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.GAME_BACKGROUND__TEXTURE_REGION, oldTextureRegion, textureRegion));
      }
    }
    return textureRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextureRegion basicGetTextureRegion()
  {
    return textureRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextureRegion(TextureRegion newTextureRegion)
  {
    TextureRegion oldTextureRegion = textureRegion;
    textureRegion = newTextureRegion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GAME_BACKGROUND__TEXTURE_REGION, oldTextureRegion, textureRegion));
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
      case AndroTextDslPackage.GAME_BACKGROUND__COLOR:
        return basicSetColor(null, msgs);
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
      case AndroTextDslPackage.GAME_BACKGROUND__COLOR:
        return getColor();
      case AndroTextDslPackage.GAME_BACKGROUND__TEXTURE_REGION:
        if (resolve) return getTextureRegion();
        return basicGetTextureRegion();
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
      case AndroTextDslPackage.GAME_BACKGROUND__COLOR:
        setColor((Color)newValue);
        return;
      case AndroTextDslPackage.GAME_BACKGROUND__TEXTURE_REGION:
        setTextureRegion((TextureRegion)newValue);
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
      case AndroTextDslPackage.GAME_BACKGROUND__COLOR:
        setColor((Color)null);
        return;
      case AndroTextDslPackage.GAME_BACKGROUND__TEXTURE_REGION:
        setTextureRegion((TextureRegion)null);
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
      case AndroTextDslPackage.GAME_BACKGROUND__COLOR:
        return color != null;
      case AndroTextDslPackage.GAME_BACKGROUND__TEXTURE_REGION:
        return textureRegion != null;
    }
    return super.eIsSet(featureID);
  }

} //GameBackgroundImpl
