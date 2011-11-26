/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preference Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceAttributesImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceAttributesImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceAttributesImpl#getPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreferenceAttributesImpl extends MinimalEObjectImpl.Container implements PreferenceAttributes
{
  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

  /**
   * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected static final String ENABLED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected String enabled = ENABLED_EDEFAULT;

  /**
   * The default value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistent()
   * @generated
   * @ordered
   */
  protected static final String PERSISTENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistent()
   * @generated
   * @ordered
   */
  protected String persistent = PERSISTENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferenceAttributesImpl()
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
    return AndroTextDslPackage.Literals.PREFERENCE_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_ATTRIBUTES__SUMMARY, oldSummary, summary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(String newEnabled)
  {
    String oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_ATTRIBUTES__ENABLED, oldEnabled, enabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersistent()
  {
    return persistent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersistent(String newPersistent)
  {
    String oldPersistent = persistent;
    persistent = newPersistent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_ATTRIBUTES__PERSISTENT, oldPersistent, persistent));
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
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__SUMMARY:
        return getSummary();
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__ENABLED:
        return getEnabled();
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__PERSISTENT:
        return getPersistent();
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
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__SUMMARY:
        setSummary((String)newValue);
        return;
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__ENABLED:
        setEnabled((String)newValue);
        return;
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__PERSISTENT:
        setPersistent((String)newValue);
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
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__PERSISTENT:
        setPersistent(PERSISTENT_EDEFAULT);
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
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__ENABLED:
        return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES__PERSISTENT:
        return PERSISTENT_EDEFAULT == null ? persistent != null : !PERSISTENT_EDEFAULT.equals(persistent);
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
    result.append(" (summary: ");
    result.append(summary);
    result.append(", enabled: ");
    result.append(enabled);
    result.append(", persistent: ");
    result.append(persistent);
    result.append(')');
    return result.toString();
  }

} //PreferenceAttributesImpl
