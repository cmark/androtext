/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Position;
import hu.bme.mit.androtext.lang.androTextDsl.Size;
import hu.bme.mit.androtext.lang.androTextDsl.Sprite;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sprite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpriteImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpriteImpl#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpriteImpl#getTextureRegion <em>Texture Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpriteImpl extends GameEntityImpl implements Sprite
{
  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Position position;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected Size size;

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
  protected SpriteImpl()
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
    return AndroTextDslPackage.eINSTANCE.getSprite();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs)
  {
    Position oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SPRITE__POSITION, oldPosition, newPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Position newPosition)
  {
    if (newPosition != position)
    {
      NotificationChain msgs = null;
      if (position != null)
        msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SPRITE__POSITION, null, msgs);
      if (newPosition != null)
        msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SPRITE__POSITION, null, msgs);
      msgs = basicSetPosition(newPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SPRITE__POSITION, newPosition, newPosition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(Size newSize, NotificationChain msgs)
  {
    Size oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SPRITE__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(Size newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SPRITE__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SPRITE__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SPRITE__SIZE, newSize, newSize));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.SPRITE__TEXTURE_REGION, oldTextureRegion, textureRegion));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SPRITE__TEXTURE_REGION, oldTextureRegion, textureRegion));
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
      case AndroTextDslPackage.SPRITE__POSITION:
        return basicSetPosition(null, msgs);
      case AndroTextDslPackage.SPRITE__SIZE:
        return basicSetSize(null, msgs);
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
      case AndroTextDslPackage.SPRITE__POSITION:
        return getPosition();
      case AndroTextDslPackage.SPRITE__SIZE:
        return getSize();
      case AndroTextDslPackage.SPRITE__TEXTURE_REGION:
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
      case AndroTextDslPackage.SPRITE__POSITION:
        setPosition((Position)newValue);
        return;
      case AndroTextDslPackage.SPRITE__SIZE:
        setSize((Size)newValue);
        return;
      case AndroTextDslPackage.SPRITE__TEXTURE_REGION:
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
      case AndroTextDslPackage.SPRITE__POSITION:
        setPosition((Position)null);
        return;
      case AndroTextDslPackage.SPRITE__SIZE:
        setSize((Size)null);
        return;
      case AndroTextDslPackage.SPRITE__TEXTURE_REGION:
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
      case AndroTextDslPackage.SPRITE__POSITION:
        return position != null;
      case AndroTextDslPackage.SPRITE__SIZE:
        return size != null;
      case AndroTextDslPackage.SPRITE__TEXTURE_REGION:
        return textureRegion != null;
    }
    return super.eIsSet(featureID);
  }

} //SpriteImpl
