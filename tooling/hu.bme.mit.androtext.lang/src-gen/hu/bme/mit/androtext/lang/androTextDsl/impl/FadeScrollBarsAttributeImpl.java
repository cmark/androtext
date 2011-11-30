/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fade Scroll Bars Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FadeScrollBarsAttributeImpl#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FadeScrollBarsAttributeImpl extends MinimalEObjectImpl.Container implements FadeScrollBarsAttribute
{
  /**
   * The cached value of the '{@link #getFadeScrollBars() <em>Fade Scroll Bars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFadeScrollBars()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue fadeScrollBars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FadeScrollBarsAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getFadeScrollBarsAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getFadeScrollBars()
  {
    return fadeScrollBars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFadeScrollBars(BooleanPropertyValue newFadeScrollBars, NotificationChain msgs)
  {
    BooleanPropertyValue oldFadeScrollBars = fadeScrollBars;
    fadeScrollBars = newFadeScrollBars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS, oldFadeScrollBars, newFadeScrollBars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFadeScrollBars(BooleanPropertyValue newFadeScrollBars)
  {
    if (newFadeScrollBars != fadeScrollBars)
    {
      NotificationChain msgs = null;
      if (fadeScrollBars != null)
        msgs = ((InternalEObject)fadeScrollBars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS, null, msgs);
      if (newFadeScrollBars != null)
        msgs = ((InternalEObject)newFadeScrollBars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS, null, msgs);
      msgs = basicSetFadeScrollBars(newFadeScrollBars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS, newFadeScrollBars, newFadeScrollBars));
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
      case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS:
        return basicSetFadeScrollBars(null, msgs);
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
      case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS:
        return getFadeScrollBars();
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
      case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS:
        setFadeScrollBars((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS:
        setFadeScrollBars((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS:
        return fadeScrollBars != null;
    }
    return super.eIsSet(featureID);
  }

} //FadeScrollBarsAttributeImpl
