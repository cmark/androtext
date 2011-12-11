/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GameMenuItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GameMenuItemImpl#getTextureRegion <em>Texture Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameMenuItemImpl extends MinimalEObjectImpl.Container implements GameMenuItem
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

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
  protected GameMenuItemImpl()
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
    return AndroTextDslPackage.eINSTANCE.getGameMenuItem();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GAME_MENU_ITEM__TEXT, oldText, text));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.GAME_MENU_ITEM__TEXTURE_REGION, oldTextureRegion, textureRegion));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.GAME_MENU_ITEM__TEXTURE_REGION, oldTextureRegion, textureRegion));
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
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXT:
        return getText();
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXTURE_REGION:
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
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXT:
        setText((String)newValue);
        return;
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXTURE_REGION:
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
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXTURE_REGION:
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
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case AndroTextDslPackage.GAME_MENU_ITEM__TEXTURE_REGION:
        return textureRegion != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //GameMenuItemImpl
