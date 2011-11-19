/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ringtone Prefence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RingtonePrefenceImpl#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RingtonePrefenceImpl extends AbstractPreferenceImpl implements RingtonePrefence
{
  /**
   * The cached value of the '{@link #getPreferenceAttributes() <em>Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreferenceAttributes()
   * @generated
   * @ordered
   */
  protected PreferenceAttributes preferenceAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RingtonePrefenceImpl()
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
    return AndroTextDslPackage.Literals.RINGTONE_PREFENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceAttributes getPreferenceAttributes()
  {
    return preferenceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreferenceAttributes(PreferenceAttributes newPreferenceAttributes, NotificationChain msgs)
  {
    PreferenceAttributes oldPreferenceAttributes = preferenceAttributes;
    preferenceAttributes = newPreferenceAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES, oldPreferenceAttributes, newPreferenceAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreferenceAttributes(PreferenceAttributes newPreferenceAttributes)
  {
    if (newPreferenceAttributes != preferenceAttributes)
    {
      NotificationChain msgs = null;
      if (preferenceAttributes != null)
        msgs = ((InternalEObject)preferenceAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES, null, msgs);
      if (newPreferenceAttributes != null)
        msgs = ((InternalEObject)newPreferenceAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES, null, msgs);
      msgs = basicSetPreferenceAttributes(newPreferenceAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES, newPreferenceAttributes, newPreferenceAttributes));
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
      case AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES:
        return basicSetPreferenceAttributes(null, msgs);
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
      case AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES:
        return getPreferenceAttributes();
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
      case AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)newValue);
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
      case AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)null);
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
      case AndroTextDslPackage.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES:
        return preferenceAttributes != null;
    }
    return super.eIsSet(featureID);
  }

} //RingtonePrefenceImpl
