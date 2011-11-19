/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;

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
 * An implementation of the model object '<em><b>Android Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationImpl#getDataroot <em>Dataroot</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationImpl#getMainActivity <em>Main Activity</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationImpl#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroidApplicationImpl extends ModelRootImpl implements AndroidApplication
{
  /**
   * The cached value of the '{@link #getDataroot() <em>Dataroot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataroot()
   * @generated
   * @ordered
   */
  protected AndroDataModelRoot dataroot;

  /**
   * The cached value of the '{@link #getMainActivity() <em>Main Activity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainActivity()
   * @generated
   * @ordered
   */
  protected Activity mainActivity;

  /**
   * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelElements()
   * @generated
   * @ordered
   */
  protected EList<AndroidApplicationModelElement> modelElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroidApplicationImpl()
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
    return AndroTextDslPackage.Literals.ANDROID_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroDataModelRoot getDataroot()
  {
    if (dataroot != null && dataroot.eIsProxy())
    {
      InternalEObject oldDataroot = (InternalEObject)dataroot;
      dataroot = (AndroDataModelRoot)eResolveProxy(oldDataroot);
      if (dataroot != oldDataroot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.ANDROID_APPLICATION__DATAROOT, oldDataroot, dataroot));
      }
    }
    return dataroot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroDataModelRoot basicGetDataroot()
  {
    return dataroot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataroot(AndroDataModelRoot newDataroot)
  {
    AndroDataModelRoot oldDataroot = dataroot;
    dataroot = newDataroot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDROID_APPLICATION__DATAROOT, oldDataroot, dataroot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity getMainActivity()
  {
    return mainActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainActivity(Activity newMainActivity, NotificationChain msgs)
  {
    Activity oldMainActivity = mainActivity;
    mainActivity = newMainActivity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY, oldMainActivity, newMainActivity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainActivity(Activity newMainActivity)
  {
    if (newMainActivity != mainActivity)
    {
      NotificationChain msgs = null;
      if (mainActivity != null)
        msgs = ((InternalEObject)mainActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY, null, msgs);
      if (newMainActivity != null)
        msgs = ((InternalEObject)newMainActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY, null, msgs);
      msgs = basicSetMainActivity(newMainActivity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY, newMainActivity, newMainActivity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AndroidApplicationModelElement> getModelElements()
  {
    if (modelElements == null)
    {
      modelElements = new EObjectContainmentEList<AndroidApplicationModelElement>(AndroidApplicationModelElement.class, this, AndroTextDslPackage.ANDROID_APPLICATION__MODEL_ELEMENTS);
    }
    return modelElements;
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
      case AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY:
        return basicSetMainActivity(null, msgs);
      case AndroTextDslPackage.ANDROID_APPLICATION__MODEL_ELEMENTS:
        return ((InternalEList<?>)getModelElements()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.ANDROID_APPLICATION__DATAROOT:
        if (resolve) return getDataroot();
        return basicGetDataroot();
      case AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY:
        return getMainActivity();
      case AndroTextDslPackage.ANDROID_APPLICATION__MODEL_ELEMENTS:
        return getModelElements();
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
      case AndroTextDslPackage.ANDROID_APPLICATION__DATAROOT:
        setDataroot((AndroDataModelRoot)newValue);
        return;
      case AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY:
        setMainActivity((Activity)newValue);
        return;
      case AndroTextDslPackage.ANDROID_APPLICATION__MODEL_ELEMENTS:
        getModelElements().clear();
        getModelElements().addAll((Collection<? extends AndroidApplicationModelElement>)newValue);
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
      case AndroTextDslPackage.ANDROID_APPLICATION__DATAROOT:
        setDataroot((AndroDataModelRoot)null);
        return;
      case AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY:
        setMainActivity((Activity)null);
        return;
      case AndroTextDslPackage.ANDROID_APPLICATION__MODEL_ELEMENTS:
        getModelElements().clear();
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
      case AndroTextDslPackage.ANDROID_APPLICATION__DATAROOT:
        return dataroot != null;
      case AndroTextDslPackage.ANDROID_APPLICATION__MAIN_ACTIVITY:
        return mainActivity != null;
      case AndroTextDslPackage.ANDROID_APPLICATION__MODEL_ELEMENTS:
        return modelElements != null && !modelElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AndroidApplicationImpl
