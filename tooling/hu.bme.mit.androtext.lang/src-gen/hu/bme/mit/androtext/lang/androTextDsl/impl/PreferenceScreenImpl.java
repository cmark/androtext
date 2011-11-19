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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl#getPreferences <em>Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreferenceScreenImpl extends RootLayoutImpl implements PreferenceScreen
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

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
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_SCREEN__TITLE, oldTitle, title));
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__TITLE:
        return getTitle();
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__TITLE:
        setTitle((String)newValue);
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__TITLE:
        setTitle(TITLE_EDEFAULT);
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
      case AndroTextDslPackage.PREFERENCE_SCREEN__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractPreference.class)
    {
      switch (derivedFeatureID)
      {
        case AndroTextDslPackage.PREFERENCE_SCREEN__TITLE: return AndroTextDslPackage.ABSTRACT_PREFERENCE__TITLE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractPreference.class)
    {
      switch (baseFeatureID)
      {
        case AndroTextDslPackage.ABSTRACT_PREFERENCE__TITLE: return AndroTextDslPackage.PREFERENCE_SCREEN__TITLE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //PreferenceScreenImpl
