/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl#getEntriesAttribute <em>Entries Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl#getEntryValues <em>Entry Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListPreferenceAttributesImpl extends MinimalEObjectImpl.Container implements ListPreferenceAttributes
{
  /**
   * The cached value of the '{@link #getEntriesAttribute() <em>Entries Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntriesAttribute()
   * @generated
   * @ordered
   */
  protected EntriesAttribute entriesAttribute;

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
    return AndroTextDslPackage.eINSTANCE.getListPreferenceAttributes();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntriesAttribute getEntriesAttribute()
  {
    return entriesAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntriesAttribute(EntriesAttribute newEntriesAttribute, NotificationChain msgs)
  {
    EntriesAttribute oldEntriesAttribute = entriesAttribute;
    entriesAttribute = newEntriesAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE, oldEntriesAttribute, newEntriesAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntriesAttribute(EntriesAttribute newEntriesAttribute)
  {
    if (newEntriesAttribute != entriesAttribute)
    {
      NotificationChain msgs = null;
      if (entriesAttribute != null)
        msgs = ((InternalEObject)entriesAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE, null, msgs);
      if (newEntriesAttribute != null)
        msgs = ((InternalEObject)newEntriesAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE, null, msgs);
      msgs = basicSetEntriesAttribute(newEntriesAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE, newEntriesAttribute, newEntriesAttribute));
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE:
        return basicSetEntriesAttribute(null, msgs);
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE:
        return getEntriesAttribute();
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE:
        setEntriesAttribute((EntriesAttribute)newValue);
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE:
        setEntriesAttribute((EntriesAttribute)null);
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
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE:
        return entriesAttribute != null;
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES:
        return entryValues != null;
    }
    return super.eIsSet(featureID);
  }

} //ListPreferenceAttributesImpl
