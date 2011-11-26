/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeActivityImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeActivityImpl extends ActionImpl implements InvokeActivity
{
  /**
   * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivity()
   * @generated
   * @ordered
   */
  protected Activity activity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvokeActivityImpl()
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
    return AndroTextDslPackage.Literals.INVOKE_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity getActivity()
  {
    if (activity != null && activity.eIsProxy())
    {
      InternalEObject oldActivity = (InternalEObject)activity;
      activity = (Activity)eResolveProxy(oldActivity);
      if (activity != oldActivity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.INVOKE_ACTIVITY__ACTIVITY, oldActivity, activity));
      }
    }
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity basicGetActivity()
  {
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivity(Activity newActivity)
  {
    Activity oldActivity = activity;
    activity = newActivity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.INVOKE_ACTIVITY__ACTIVITY, oldActivity, activity));
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
      case AndroTextDslPackage.INVOKE_ACTIVITY__ACTIVITY:
        if (resolve) return getActivity();
        return basicGetActivity();
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
      case AndroTextDslPackage.INVOKE_ACTIVITY__ACTIVITY:
        setActivity((Activity)newValue);
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
      case AndroTextDslPackage.INVOKE_ACTIVITY__ACTIVITY:
        setActivity((Activity)null);
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
      case AndroTextDslPackage.INVOKE_ACTIVITY__ACTIVITY:
        return activity != null;
    }
    return super.eIsSet(featureID);
  }

} //InvokeActivityImpl
