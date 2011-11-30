/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewElementImpl#getBackgroundAttribute <em>Background Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewElementImpl extends SimpleViewImpl implements ViewElement
{
  /**
   * The cached value of the '{@link #getBackgroundAttribute() <em>Background Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundAttribute()
   * @generated
   * @ordered
   */
  protected BackgroundAttribute backgroundAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewElementImpl()
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
    return AndroTextDslPackage.eINSTANCE.getViewElement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BackgroundAttribute getBackgroundAttribute()
  {
    return backgroundAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackgroundAttribute(BackgroundAttribute newBackgroundAttribute, NotificationChain msgs)
  {
    BackgroundAttribute oldBackgroundAttribute = backgroundAttribute;
    backgroundAttribute = newBackgroundAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE, oldBackgroundAttribute, newBackgroundAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundAttribute(BackgroundAttribute newBackgroundAttribute)
  {
    if (newBackgroundAttribute != backgroundAttribute)
    {
      NotificationChain msgs = null;
      if (backgroundAttribute != null)
        msgs = ((InternalEObject)backgroundAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE, null, msgs);
      if (newBackgroundAttribute != null)
        msgs = ((InternalEObject)newBackgroundAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE, null, msgs);
      msgs = basicSetBackgroundAttribute(newBackgroundAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE, newBackgroundAttribute, newBackgroundAttribute));
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
      case AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE:
        return basicSetBackgroundAttribute(null, msgs);
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
      case AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE:
        return getBackgroundAttribute();
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
      case AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)newValue);
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
      case AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)null);
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
      case AndroTextDslPackage.VIEW_ELEMENT__BACKGROUND_ATTRIBUTE:
        return backgroundAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewElementImpl
