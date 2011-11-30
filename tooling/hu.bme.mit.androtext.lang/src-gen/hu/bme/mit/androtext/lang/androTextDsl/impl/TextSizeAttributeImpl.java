/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Size Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextSizeAttributeImpl#getTextSize <em>Text Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextSizeAttributeImpl extends MinimalEObjectImpl.Container implements TextSizeAttribute
{
  /**
   * The cached value of the '{@link #getTextSize() <em>Text Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextSize()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue textSize;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextSizeAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getTextSizeAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getTextSize()
  {
    return textSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextSize(DimensionPropertyValue newTextSize, NotificationChain msgs)
  {
    DimensionPropertyValue oldTextSize = textSize;
    textSize = newTextSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE, oldTextSize, newTextSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextSize(DimensionPropertyValue newTextSize)
  {
    if (newTextSize != textSize)
    {
      NotificationChain msgs = null;
      if (textSize != null)
        msgs = ((InternalEObject)textSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE, null, msgs);
      if (newTextSize != null)
        msgs = ((InternalEObject)newTextSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE, null, msgs);
      msgs = basicSetTextSize(newTextSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE, newTextSize, newTextSize));
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
      case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE:
        return basicSetTextSize(null, msgs);
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
      case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE:
        return getTextSize();
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
      case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE:
        setTextSize((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE:
        setTextSize((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE:
        return textSize != null;
    }
    return super.eIsSet(featureID);
  }

} //TextSizeAttributeImpl
