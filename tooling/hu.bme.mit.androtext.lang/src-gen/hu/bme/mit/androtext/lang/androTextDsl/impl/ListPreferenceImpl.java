/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceImpl#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceImpl#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceImpl#getListPreferenceAttributes <em>List Preference Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListPreferenceImpl extends AbstractPreferenceImpl implements ListPreference
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
   * The cached value of the '{@link #getDialogPreferenceAttributes() <em>Dialog Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialogPreferenceAttributes()
   * @generated
   * @ordered
   */
  protected DialogPreferenceAttributes dialogPreferenceAttributes;

  /**
   * The cached value of the '{@link #getListPreferenceAttributes() <em>List Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListPreferenceAttributes()
   * @generated
   * @ordered
   */
  protected ListPreferenceAttributes listPreferenceAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListPreferenceImpl()
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
    return AndroTextDslPackage.Literals.LIST_PREFERENCE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES, oldPreferenceAttributes, newPreferenceAttributes);
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
        msgs = ((InternalEObject)preferenceAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES, null, msgs);
      if (newPreferenceAttributes != null)
        msgs = ((InternalEObject)newPreferenceAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES, null, msgs);
      msgs = basicSetPreferenceAttributes(newPreferenceAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES, newPreferenceAttributes, newPreferenceAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogPreferenceAttributes getDialogPreferenceAttributes()
  {
    return dialogPreferenceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDialogPreferenceAttributes(DialogPreferenceAttributes newDialogPreferenceAttributes, NotificationChain msgs)
  {
    DialogPreferenceAttributes oldDialogPreferenceAttributes = dialogPreferenceAttributes;
    dialogPreferenceAttributes = newDialogPreferenceAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, oldDialogPreferenceAttributes, newDialogPreferenceAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDialogPreferenceAttributes(DialogPreferenceAttributes newDialogPreferenceAttributes)
  {
    if (newDialogPreferenceAttributes != dialogPreferenceAttributes)
    {
      NotificationChain msgs = null;
      if (dialogPreferenceAttributes != null)
        msgs = ((InternalEObject)dialogPreferenceAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, null, msgs);
      if (newDialogPreferenceAttributes != null)
        msgs = ((InternalEObject)newDialogPreferenceAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, null, msgs);
      msgs = basicSetDialogPreferenceAttributes(newDialogPreferenceAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, newDialogPreferenceAttributes, newDialogPreferenceAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListPreferenceAttributes getListPreferenceAttributes()
  {
    return listPreferenceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListPreferenceAttributes(ListPreferenceAttributes newListPreferenceAttributes, NotificationChain msgs)
  {
    ListPreferenceAttributes oldListPreferenceAttributes = listPreferenceAttributes;
    listPreferenceAttributes = newListPreferenceAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES, oldListPreferenceAttributes, newListPreferenceAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListPreferenceAttributes(ListPreferenceAttributes newListPreferenceAttributes)
  {
    if (newListPreferenceAttributes != listPreferenceAttributes)
    {
      NotificationChain msgs = null;
      if (listPreferenceAttributes != null)
        msgs = ((InternalEObject)listPreferenceAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES, null, msgs);
      if (newListPreferenceAttributes != null)
        msgs = ((InternalEObject)newListPreferenceAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES, null, msgs);
      msgs = basicSetListPreferenceAttributes(newListPreferenceAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES, newListPreferenceAttributes, newListPreferenceAttributes));
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
      case AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES:
        return basicSetPreferenceAttributes(null, msgs);
      case AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        return basicSetDialogPreferenceAttributes(null, msgs);
      case AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES:
        return basicSetListPreferenceAttributes(null, msgs);
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
      case AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES:
        return getPreferenceAttributes();
      case AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        return getDialogPreferenceAttributes();
      case AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES:
        return getListPreferenceAttributes();
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
      case AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)newValue);
        return;
      case AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        setDialogPreferenceAttributes((DialogPreferenceAttributes)newValue);
        return;
      case AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES:
        setListPreferenceAttributes((ListPreferenceAttributes)newValue);
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
      case AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)null);
        return;
      case AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        setDialogPreferenceAttributes((DialogPreferenceAttributes)null);
        return;
      case AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES:
        setListPreferenceAttributes((ListPreferenceAttributes)null);
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
      case AndroTextDslPackage.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES:
        return preferenceAttributes != null;
      case AndroTextDslPackage.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        return dialogPreferenceAttributes != null;
      case AndroTextDslPackage.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES:
        return listPreferenceAttributes != null;
    }
    return super.eIsSet(featureID);
  }

} //ListPreferenceImpl
