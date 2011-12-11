/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;
import hu.bme.mit.androtext.lang.androTextDsl.Tiled;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextureRegionImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextureRegionImpl#getTiled <em>Tiled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextureRegionImpl extends GameElementImpl implements TextureRegion
{
  /**
   * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected static final String FILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected String fileName = FILE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTiled() <em>Tiled</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTiled()
   * @generated
   * @ordered
   */
  protected Tiled tiled;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextureRegionImpl()
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
    return AndroTextDslPackage.eINSTANCE.getTextureRegion();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFileName()
  {
    return fileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileName(String newFileName)
  {
    String oldFileName = fileName;
    fileName = newFileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXTURE_REGION__FILE_NAME, oldFileName, fileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tiled getTiled()
  {
    return tiled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTiled(Tiled newTiled, NotificationChain msgs)
  {
    Tiled oldTiled = tiled;
    tiled = newTiled;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXTURE_REGION__TILED, oldTiled, newTiled);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTiled(Tiled newTiled)
  {
    if (newTiled != tiled)
    {
      NotificationChain msgs = null;
      if (tiled != null)
        msgs = ((InternalEObject)tiled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXTURE_REGION__TILED, null, msgs);
      if (newTiled != null)
        msgs = ((InternalEObject)newTiled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXTURE_REGION__TILED, null, msgs);
      msgs = basicSetTiled(newTiled, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXTURE_REGION__TILED, newTiled, newTiled));
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
      case AndroTextDslPackage.TEXTURE_REGION__TILED:
        return basicSetTiled(null, msgs);
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
      case AndroTextDslPackage.TEXTURE_REGION__FILE_NAME:
        return getFileName();
      case AndroTextDslPackage.TEXTURE_REGION__TILED:
        return getTiled();
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
      case AndroTextDslPackage.TEXTURE_REGION__FILE_NAME:
        setFileName((String)newValue);
        return;
      case AndroTextDslPackage.TEXTURE_REGION__TILED:
        setTiled((Tiled)newValue);
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
      case AndroTextDslPackage.TEXTURE_REGION__FILE_NAME:
        setFileName(FILE_NAME_EDEFAULT);
        return;
      case AndroTextDslPackage.TEXTURE_REGION__TILED:
        setTiled((Tiled)null);
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
      case AndroTextDslPackage.TEXTURE_REGION__FILE_NAME:
        return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
      case AndroTextDslPackage.TEXTURE_REGION__TILED:
        return tiled != null;
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
    result.append(" (fileName: ");
    result.append(fileName);
    result.append(')');
    return result.toString();
  }

} //TextureRegionImpl
