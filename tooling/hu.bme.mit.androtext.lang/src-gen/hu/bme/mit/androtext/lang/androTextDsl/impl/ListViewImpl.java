/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListViewImpl extends SimpleViewImpl implements ListView
{
  /**
   * The cached value of the '{@link #getEntries() <em>Entries</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntries()
   * @generated
   * @ordered
   */
  protected ArrayResource entries;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected View layout;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListViewImpl()
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
    return AndroTextDslPackage.Literals.LIST_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayResource getEntries()
  {
    if (entries != null && entries.eIsProxy())
    {
      InternalEObject oldEntries = (InternalEObject)entries;
      entries = (ArrayResource)eResolveProxy(oldEntries);
      if (entries != oldEntries)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LIST_VIEW__ENTRIES, oldEntries, entries));
      }
    }
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayResource basicGetEntries()
  {
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntries(ArrayResource newEntries)
  {
    ArrayResource oldEntries = entries;
    entries = newEntries;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_VIEW__ENTRIES, oldEntries, entries));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getLayout()
  {
    if (layout != null && layout.eIsProxy())
    {
      InternalEObject oldLayout = (InternalEObject)layout;
      layout = (View)eResolveProxy(oldLayout);
      if (layout != oldLayout)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LIST_VIEW__LAYOUT, oldLayout, layout));
      }
    }
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(View newLayout)
  {
    View oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LIST_VIEW__LAYOUT, oldLayout, layout));
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
      case AndroTextDslPackage.LIST_VIEW__ENTRIES:
        if (resolve) return getEntries();
        return basicGetEntries();
      case AndroTextDslPackage.LIST_VIEW__LAYOUT:
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
      case AndroTextDslPackage.LIST_VIEW__ENTRIES:
        setEntries((ArrayResource)newValue);
        return;
      case AndroTextDslPackage.LIST_VIEW__LAYOUT:
        setLayout((View)newValue);
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
      case AndroTextDslPackage.LIST_VIEW__ENTRIES:
        setEntries((ArrayResource)null);
        return;
      case AndroTextDslPackage.LIST_VIEW__LAYOUT:
        setLayout((View)null);
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
      case AndroTextDslPackage.LIST_VIEW__ENTRIES:
        return entries != null;
      case AndroTextDslPackage.LIST_VIEW__LAYOUT:
        return layout != null;
    }
    return super.eIsSet(featureID);
  }

} //ListViewImpl
