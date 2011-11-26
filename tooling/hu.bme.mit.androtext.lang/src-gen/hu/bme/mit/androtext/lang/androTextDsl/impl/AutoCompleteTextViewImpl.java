/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl#isIsMulti <em>Is Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutoCompleteTextViewImpl extends SimpleViewImpl implements AutoCompleteTextView
{
  /**
   * The cached value of the '{@link #getEntries() <em>Entries</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntries()
   * @generated
   * @ordered
   */
  protected StringArrayResource entries;

  /**
   * The default value of the '{@link #isIsMulti() <em>Is Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMulti()
   * @generated
   * @ordered
   */
  protected static final boolean IS_MULTI_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsMulti() <em>Is Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMulti()
   * @generated
   * @ordered
   */
  protected boolean isMulti = IS_MULTI_EDEFAULT;

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
    return AndroTextDslPackage.Literals.AUTO_COMPLETE_TEXT_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayResource getEntries()
  {
    if (entries != null && entries.eIsProxy())
    {
      InternalEObject oldEntries = (InternalEObject)entries;
      entries = (StringArrayResource)eResolveProxy(oldEntries);
      if (entries != oldEntries)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES, oldEntries, entries));
      }
    }
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayResource basicGetEntries()
  {
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntries(StringArrayResource newEntries)
  {
    StringArrayResource oldEntries = entries;
    entries = newEntries;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES, oldEntries, entries));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsMulti()
  {
    return isMulti;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsMulti(boolean newIsMulti)
  {
    boolean oldIsMulti = isMulti;
    isMulti = newIsMulti;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__IS_MULTI, oldIsMulti, isMulti));
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES:
        if (resolve) return getEntries();
        return basicGetEntries();
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__IS_MULTI:
        return isIsMulti();
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES:
        setEntries((StringArrayResource)newValue);
        return;
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__IS_MULTI:
        setIsMulti((Boolean)newValue);
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES:
        setEntries((StringArrayResource)null);
        return;
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__IS_MULTI:
        setIsMulti(IS_MULTI_EDEFAULT);
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
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__ENTRIES:
        return entries != null;
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW__IS_MULTI:
        return isMulti != IS_MULTI_EDEFAULT;
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
    result.append(" (isMulti: ");
    result.append(isMulti);
    result.append(')');
    return result.toString();
  }

} //AutoCompleteTextViewImpl
