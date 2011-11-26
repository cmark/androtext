/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preference Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl#getPreferences <em>Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreferenceScreenImpl extends AbstractPreferenceImpl implements PreferenceScreen
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreferences()
   * @generated
   * @ordered
   */
  protected EList<AbstractPreference> preferences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferenceScreenImpl()
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
    return AndroTextDslPackage.Literals.PREFERENCE_SCREEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_SCREEN__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES, oldPreferenceAttributes, newPreferenceAttributes);
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
        msgs = ((InternalEObject)preferenceAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES, null, msgs);
      if (newPreferenceAttributes != null)
        msgs = ((InternalEObject)newPreferenceAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES, null, msgs);
      msgs = basicSetPreferenceAttributes(newPreferenceAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES, newPreferenceAttributes, newPreferenceAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractPreference> getPreferences()
  {
    if (preferences == null)
    {
      preferences = new EObjectContainmentEList<AbstractPreference>(AbstractPreference.class, this, AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCES);
    }
    return preferences;
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES:
        return basicSetPreferenceAttributes(null, msgs);
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCES:
        return ((InternalEList<?>)getPreferences()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__NAME:
        return getName();
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES:
        return getPreferenceAttributes();
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCES:
        return getPreferences();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.PREFERENCE_SCREEN__NAME:
        setName((String)newValue);
        return;
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)newValue);
        return;
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCES:
        getPreferences().clear();
        getPreferences().addAll((Collection<? extends AbstractPreference>)newValue);
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)null);
        return;
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCES:
        getPreferences().clear();
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES:
        return preferenceAttributes != null;
      case AndroTextDslPackage.PREFERENCE_SCREEN__PREFERENCES:
        return preferences != null && !preferences.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PreferenceScreenImpl
