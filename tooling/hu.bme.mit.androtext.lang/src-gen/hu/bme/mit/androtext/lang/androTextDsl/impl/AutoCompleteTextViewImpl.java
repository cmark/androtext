/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Complete Text View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl#getEntriesAttribute <em>Entries Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl#getMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutoCompleteTextViewImpl extends SimpleViewImpl implements AutoCompleteTextView
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
   * The cached value of the '{@link #getMulti() <em>Multi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulti()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue multi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutoCompleteTextViewImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAutoCompleteTextView();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE, oldEntriesAttribute, newEntriesAttribute);
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
        msgs = ((InternalEObject)entriesAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE, null, msgs);
      if (newEntriesAttribute != null)
        msgs = ((InternalEObject)newEntriesAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE, null, msgs);
      msgs = basicSetEntriesAttribute(newEntriesAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE, newEntriesAttribute, newEntriesAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getMulti()
  {
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMulti(BooleanPropertyValue newMulti, NotificationChain msgs)
  {
    BooleanPropertyValue oldMulti = multi;
    multi = newMulti;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI, oldMulti, newMulti);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMulti(BooleanPropertyValue newMulti)
  {
    if (newMulti != multi)
    {
      NotificationChain msgs = null;
      if (multi != null)
        msgs = ((InternalEObject)multi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI, null, msgs);
      if (newMulti != null)
        msgs = ((InternalEObject)newMulti).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI, null, msgs);
      msgs = basicSetMulti(newMulti, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI, newMulti, newMulti));
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE:
        return basicSetEntriesAttribute(null, msgs);
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI:
        return basicSetMulti(null, msgs);
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE:
        return getEntriesAttribute();
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI:
        return getMulti();
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE:
        setEntriesAttribute((EntriesAttribute)newValue);
        return;
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI:
        setMulti((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE:
        setEntriesAttribute((EntriesAttribute)null);
        return;
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI:
        setMulti((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE:
        return entriesAttribute != null;
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__MULTI:
        return multi != null;
    }
    return super.eIsSet(featureID);
  }

} //AutoCompleteTextViewImpl
