/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preference Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceActivityImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreferenceActivityImpl extends AndroidApplicationModelElementImpl implements PreferenceActivity
{
  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected PreferenceScreen layout;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferenceActivityImpl()
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
    return AndroTextDslPackage.Literals.PREFERENCE_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceScreen getLayout()
  {
    if (layout != null && layout.eIsProxy())
    {
      InternalEObject oldLayout = (InternalEObject)layout;
      layout = (PreferenceScreen)eResolveProxy(oldLayout);
      if (layout != oldLayout)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.PREFERENCE_ACTIVITY__LAYOUT, oldLayout, layout));
      }
    }
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceScreen basicGetLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(PreferenceScreen newLayout)
  {
    PreferenceScreen oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.PREFERENCE_ACTIVITY__LAYOUT, oldLayout, layout));
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
      case AndroTextDslPackage.PREFERENCE_ACTIVITY__LAYOUT:
        if (resolve) return getLayout();
        return basicGetLayout();
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
      case AndroTextDslPackage.PREFERENCE_ACTIVITY__LAYOUT:
        setLayout((PreferenceScreen)newValue);
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
      case AndroTextDslPackage.PREFERENCE_ACTIVITY__LAYOUT:
        setLayout((PreferenceScreen)null);
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
      case AndroTextDslPackage.PREFERENCE_ACTIVITY__LAYOUT:
        return layout != null;
    }
    return super.eIsSet(featureID);
  }

} //PreferenceActivityImpl
