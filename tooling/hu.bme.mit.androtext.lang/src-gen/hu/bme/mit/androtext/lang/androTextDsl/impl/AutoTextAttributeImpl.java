/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Text Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoTextAttributeImpl#getAutoText <em>Auto Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutoTextAttributeImpl extends MinimalEObjectImpl.Container implements AutoTextAttribute
{
  /**
   * The cached value of the '{@link #getAutoText() <em>Auto Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoText()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue autoText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutoTextAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAutoTextAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAutoText()
  {
    return autoText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAutoText(BooleanPropertyValue newAutoText, NotificationChain msgs)
  {
    BooleanPropertyValue oldAutoText = autoText;
    autoText = newAutoText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT, oldAutoText, newAutoText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoText(BooleanPropertyValue newAutoText)
  {
    if (newAutoText != autoText)
    {
      NotificationChain msgs = null;
      if (autoText != null)
        msgs = ((InternalEObject)autoText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT, null, msgs);
      if (newAutoText != null)
        msgs = ((InternalEObject)newAutoText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT, null, msgs);
      msgs = basicSetAutoText(newAutoText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT, newAutoText, newAutoText));
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
      case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT:
        return basicSetAutoText(null, msgs);
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
      case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT:
        return getAutoText();
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
      case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT:
        setAutoText((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT:
        setAutoText((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE__AUTO_TEXT:
        return autoText != null;
    }
    return super.eIsSet(featureID);
  }

} //AutoTextAttributeImpl
