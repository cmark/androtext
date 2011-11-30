/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Scroll Container Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IsScrollContainerAttributeImpl#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsScrollContainerAttributeImpl extends MinimalEObjectImpl.Container implements IsScrollContainerAttribute
{
  /**
   * The cached value of the '{@link #getIsScrollContainer() <em>Is Scroll Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsScrollContainer()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue isScrollContainer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IsScrollContainerAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getIsScrollContainerAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getIsScrollContainer()
  {
    return isScrollContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsScrollContainer(BooleanPropertyValue newIsScrollContainer, NotificationChain msgs)
  {
    BooleanPropertyValue oldIsScrollContainer = isScrollContainer;
    isScrollContainer = newIsScrollContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER, oldIsScrollContainer, newIsScrollContainer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsScrollContainer(BooleanPropertyValue newIsScrollContainer)
  {
    if (newIsScrollContainer != isScrollContainer)
    {
      NotificationChain msgs = null;
      if (isScrollContainer != null)
        msgs = ((InternalEObject)isScrollContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER, null, msgs);
      if (newIsScrollContainer != null)
        msgs = ((InternalEObject)newIsScrollContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER, null, msgs);
      msgs = basicSetIsScrollContainer(newIsScrollContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER, newIsScrollContainer, newIsScrollContainer));
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
      case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER:
        return basicSetIsScrollContainer(null, msgs);
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
      case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER:
        return getIsScrollContainer();
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
      case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER:
        setIsScrollContainer((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER:
        setIsScrollContainer((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER:
        return isScrollContainer != null;
    }
    return super.eIsSet(featureID);
  }

} //IsScrollContainerAttributeImpl
