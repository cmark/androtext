/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Preference Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl#getEntryValues <em>Entry Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListPreferenceAttributesImpl extends MinimalEObjectImpl.Container implements ListPreferenceAttributes
{
  /**
   * The cached value of the '{@link #getEntries() <em>Entries</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntries()
   * @generated
   * @ordered
   */
  protected StringArrayEntry entries;

  /**
   * The cached value of the '{@link #getEntryValues() <em>Entry Values</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryValues()
   * @generated
   * @ordered
   */
  protected StringArrayEntry entryValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListPreferenceAttributesImpl()
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
    return AndroTextDslPackage.Literals.LIST_PREFERENCE_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayEntry getEntries()
  {
    if (entries != null && entries.eIsProxy())
    {
      InternalEObject oldEntries = (InternalEObject)entries;
      entries = (StringArrayEntry)eResolveProxy(oldEntries);
      if (entries != oldEntries)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES, oldEntries, entries));
      }
    }
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayEntry basicGetEntries()
  {
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntries(StringArrayEntry newEntries)
  {
    StringArrayEntry oldEntries = entries;
    entries = newEntries;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES, oldEntries, entries));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayEntry getEntryValues()
  {
    if (entryValues != null && entryValues.eIsProxy())
    {
      InternalEObject oldEntryValues = (InternalEObject)entryValues;
      entryValues = (StringArrayEntry)eResolveProxy(oldEntryValues);
      if (entryValues != oldEntryValues)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES, oldEntryValues, entryValues));
      }
    }
    return entryValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayEntry basicGetEntryValues()
  {
    return entryValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryValues(StringArrayEntry newEntryValues)
  {
    StringArrayEntry oldEntryValues = entryValues;
    entryValues = newEntryValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES, oldEntryValues, entryValues));
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES:
        if (resolve) return getEntries();
        return basicGetEntries();
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES:
        if (resolve) return getEntryValues();
        return basicGetEntryValues();
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES:
        setEntries((StringArrayEntry)newValue);
        return;
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES:
        setEntryValues((StringArrayEntry)newValue);
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES:
        setEntries((StringArrayEntry)null);
        return;
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES:
        setEntryValues((StringArrayEntry)null);
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES:
        return entries != null;
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES:
        return entryValues != null;
    }
    return super.eIsSet(featureID);
  }

} //ListPreferenceAttributesImpl
