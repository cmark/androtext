/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Text Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextPreferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextPreferenceImpl#getPreferenceAttributes <em>Preference Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextPreferenceImpl#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditTextPreferenceImpl extends AbstractPreferenceImpl implements EditTextPreference
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
   * The cached value of the '{@link #getDialogPreferenceAttributes() <em>Dialog Preference Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialogPreferenceAttributes()
   * @generated
   * @ordered
   */
  protected DialogPreferenceAttributes dialogPreferenceAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditTextPreferenceImpl()
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
    return AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT_PREFERENCE__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES, oldPreferenceAttributes, newPreferenceAttributes);
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
        msgs = ((InternalEObject)preferenceAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES, null, msgs);
      if (newPreferenceAttributes != null)
        msgs = ((InternalEObject)newPreferenceAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES, null, msgs);
      msgs = basicSetPreferenceAttributes(newPreferenceAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES, newPreferenceAttributes, newPreferenceAttributes));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, oldDialogPreferenceAttributes, newDialogPreferenceAttributes);
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
        msgs = ((InternalEObject)dialogPreferenceAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, null, msgs);
      if (newDialogPreferenceAttributes != null)
        msgs = ((InternalEObject)newDialogPreferenceAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, null, msgs);
      msgs = basicSetDialogPreferenceAttributes(newDialogPreferenceAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES, newDialogPreferenceAttributes, newDialogPreferenceAttributes));
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
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES:
        return basicSetPreferenceAttributes(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        return basicSetDialogPreferenceAttributes(null, msgs);
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
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__NAME:
        return getName();
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES:
        return getPreferenceAttributes();
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        return getDialogPreferenceAttributes();
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
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__NAME:
        setName((String)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        setDialogPreferenceAttributes((DialogPreferenceAttributes)newValue);
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
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES:
        setPreferenceAttributes((PreferenceAttributes)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        setDialogPreferenceAttributes((DialogPreferenceAttributes)null);
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
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES:
        return preferenceAttributes != null;
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES:
        return dialogPreferenceAttributes != null;
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

} //EditTextPreferenceImpl
