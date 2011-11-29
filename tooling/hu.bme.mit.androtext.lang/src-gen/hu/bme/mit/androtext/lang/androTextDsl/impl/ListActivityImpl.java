/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListActivityImpl#getListitem <em>Listitem</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListActivityImpl#getContentProvider <em>Content Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListActivityImpl extends ActivityImpl implements ListActivity
{
  /**
   * The cached value of the '{@link #getListitem() <em>Listitem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListitem()
   * @generated
   * @ordered
   */
  protected View listitem;

  /**
   * The cached value of the '{@link #getContentProvider() <em>Content Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentProvider()
   * @generated
   * @ordered
   */
  protected ContentProvider contentProvider;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListActivityImpl()
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
    return AndroTextDslPackage.Literals.LIST_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getListitem()
  {
    if (listitem != null && listitem.eIsProxy())
    {
      InternalEObject oldListitem = (InternalEObject)listitem;
      listitem = (View)eResolveProxy(oldListitem);
      if (listitem != oldListitem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LIST_ACTIVITY__LISTITEM, oldListitem, listitem));
      }
    }
    return listitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetListitem()
  {
    return listitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListitem(View newListitem)
  {
    View oldListitem = listitem;
    listitem = newListitem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_ACTIVITY__LISTITEM, oldListitem, listitem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider getContentProvider()
  {
    return contentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContentProvider(ContentProvider newContentProvider, NotificationChain msgs)
  {
    ContentProvider oldContentProvider = contentProvider;
    contentProvider = newContentProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER, oldContentProvider, newContentProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContentProvider(ContentProvider newContentProvider)
  {
    if (newContentProvider != contentProvider)
    {
      NotificationChain msgs = null;
      if (contentProvider != null)
        msgs = ((InternalEObject)contentProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER, null, msgs);
      if (newContentProvider != null)
        msgs = ((InternalEObject)newContentProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER, null, msgs);
      msgs = basicSetContentProvider(newContentProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER, newContentProvider, newContentProvider));
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
      case AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER:
        return basicSetContentProvider(null, msgs);
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
      case AndroTextDslPackage.LIST_ACTIVITY__LISTITEM:
        if (resolve) return getListitem();
        return basicGetListitem();
      case AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER:
        return getContentProvider();
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
      case AndroTextDslPackage.LIST_ACTIVITY__LISTITEM:
        setListitem((View)newValue);
        return;
      case AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER:
        setContentProvider((ContentProvider)newValue);
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
      case AndroTextDslPackage.LIST_ACTIVITY__LISTITEM:
        setListitem((View)null);
        return;
      case AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER:
        setContentProvider((ContentProvider)null);
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
      case AndroTextDslPackage.LIST_ACTIVITY__LISTITEM:
        return listitem != null;
      case AndroTextDslPackage.LIST_ACTIVITY__CONTENT_PROVIDER:
        return contentProvider != null;
    }
    return super.eIsSet(featureID);
  }

} //ListActivityImpl
