/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Resource Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceLinkImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanResourceLinkImpl extends BooleanPropertyValueImpl implements BooleanResourceLink
{
  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected BooleanResource link;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanResourceLinkImpl()
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
    return AndroTextDslPackage.Literals.BOOLEAN_RESOURCE_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanResource getLink()
  {
    if (link != null && link.eIsProxy())
    {
      InternalEObject oldLink = (InternalEObject)link;
      link = (BooleanResource)eResolveProxy(oldLink);
      if (link != oldLink)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.BOOLEAN_RESOURCE_LINK__LINK, oldLink, link));
      }
    }
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanResource basicGetLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(BooleanResource newLink)
  {
    BooleanResource oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BOOLEAN_RESOURCE_LINK__LINK, oldLink, link));
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
      case AndroTextDslPackage.BOOLEAN_RESOURCE_LINK__LINK:
        if (resolve) return getLink();
        return basicGetLink();
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
      case AndroTextDslPackage.BOOLEAN_RESOURCE_LINK__LINK:
        setLink((BooleanResource)newValue);
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
      case AndroTextDslPackage.BOOLEAN_RESOURCE_LINK__LINK:
        setLink((BooleanResource)null);
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
      case AndroTextDslPackage.BOOLEAN_RESOURCE_LINK__LINK:
        return link != null;
    }
    return super.eIsSet(featureID);
  }

} //BooleanResourceLinkImpl
