/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Drawable Resource Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ExternalDrawableResourceLinkImpl#getExternalResource <em>External Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDrawableResourceLinkImpl extends AnyDrawablePropertyValueImpl implements ExternalDrawableResourceLink
{
  /**
   * The default value of the '{@link #getExternalResource() <em>External Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalResource()
   * @generated
   * @ordered
   */
  protected static final AndroidDrawableResource EXTERNAL_RESOURCE_EDEFAULT = AndroidDrawableResource.EDIT_TEXT;

  /**
   * The cached value of the '{@link #getExternalResource() <em>External Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalResource()
   * @generated
   * @ordered
   */
  protected AndroidDrawableResource externalResource = EXTERNAL_RESOURCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalDrawableResourceLinkImpl()
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
    return AndroTextDslPackage.eINSTANCE.getExternalDrawableResourceLink();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidDrawableResource getExternalResource()
  {
    return externalResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalResource(AndroidDrawableResource newExternalResource)
  {
    AndroidDrawableResource oldExternalResource = externalResource;
    externalResource = newExternalResource == null ? EXTERNAL_RESOURCE_EDEFAULT : newExternalResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE, oldExternalResource, externalResource));
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
      case AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE:
        return getExternalResource();
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
      case AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE:
        setExternalResource((AndroidDrawableResource)newValue);
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
      case AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE:
        setExternalResource(EXTERNAL_RESOURCE_EDEFAULT);
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
      case AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE:
        return externalResource != EXTERNAL_RESOURCE_EDEFAULT;
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
    result.append(" (externalResource: ");
    result.append(externalResource);
    result.append(')');
    return result.toString();
  }

} //ExternalDrawableResourceLinkImpl
