/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResourceLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabImpl#getDrawable <em>Drawable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabImpl extends MinimalEObjectImpl.Container implements Tab
{
  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

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
   * The cached value of the '{@link #getDrawable() <em>Drawable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrawable()
   * @generated
   * @ordered
   */
  protected TabDrawableResourceLink drawable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabImpl()
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
    return AndroTextDslPackage.eINSTANCE.getTab();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(String newTag)
  {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TAB__TAG, oldTag, tag));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.TAB__ACTIVITY, oldActivity, activity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TAB__ACTIVITY, oldActivity, activity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabDrawableResourceLink getDrawable()
  {
    return drawable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDrawable(TabDrawableResourceLink newDrawable, NotificationChain msgs)
  {
    TabDrawableResourceLink oldDrawable = drawable;
    drawable = newDrawable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TAB__DRAWABLE, oldDrawable, newDrawable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDrawable(TabDrawableResourceLink newDrawable)
  {
    if (newDrawable != drawable)
    {
      NotificationChain msgs = null;
      if (drawable != null)
        msgs = ((InternalEObject)drawable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TAB__DRAWABLE, null, msgs);
      if (newDrawable != null)
        msgs = ((InternalEObject)newDrawable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TAB__DRAWABLE, null, msgs);
      msgs = basicSetDrawable(newDrawable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TAB__DRAWABLE, newDrawable, newDrawable));
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
      case AndroTextDslPackage.TAB__DRAWABLE:
        return basicSetDrawable(null, msgs);
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
      case AndroTextDslPackage.TAB__TAG:
        return getTag();
      case AndroTextDslPackage.TAB__ACTIVITY:
        if (resolve) return getActivity();
        return basicGetActivity();
      case AndroTextDslPackage.TAB__DRAWABLE:
        return getDrawable();
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
      case AndroTextDslPackage.TAB__TAG:
        setTag((String)newValue);
        return;
      case AndroTextDslPackage.TAB__ACTIVITY:
        setActivity((Activity)newValue);
        return;
      case AndroTextDslPackage.TAB__DRAWABLE:
        setDrawable((TabDrawableResourceLink)newValue);
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
      case AndroTextDslPackage.TAB__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case AndroTextDslPackage.TAB__ACTIVITY:
        setActivity((Activity)null);
        return;
      case AndroTextDslPackage.TAB__DRAWABLE:
        setDrawable((TabDrawableResourceLink)null);
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
      case AndroTextDslPackage.TAB__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case AndroTextDslPackage.TAB__ACTIVITY:
        return activity != null;
      case AndroTextDslPackage.TAB__DRAWABLE:
        return drawable != null;
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
    result.append(" (tag: ");
    result.append(tag);
    result.append(')');
    return result.toString();
  }

} //TabImpl
