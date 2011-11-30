/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabDrawableResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Drawable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabDrawableResourceImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabDrawableResourceImpl#getUnselected <em>Unselected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabDrawableResourceImpl extends ResourceImpl implements TabDrawableResource
{
  /**
   * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelected()
   * @generated
   * @ordered
   */
  protected BitmapDrawableResource selected;

  /**
   * The cached value of the '{@link #getUnselected() <em>Unselected</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnselected()
   * @generated
   * @ordered
   */
  protected BitmapDrawableResource unselected;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabDrawableResourceImpl()
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
    return AndroTextDslPackage.eINSTANCE.getTabDrawableResource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitmapDrawableResource getSelected()
  {
    if (selected != null && selected.eIsProxy())
    {
      InternalEObject oldSelected = (InternalEObject)selected;
      selected = (BitmapDrawableResource)eResolveProxy(oldSelected);
      if (selected != oldSelected)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__SELECTED, oldSelected, selected));
      }
    }
    return selected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitmapDrawableResource basicGetSelected()
  {
    return selected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelected(BitmapDrawableResource newSelected)
  {
    BitmapDrawableResource oldSelected = selected;
    selected = newSelected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__SELECTED, oldSelected, selected));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitmapDrawableResource getUnselected()
  {
    if (unselected != null && unselected.eIsProxy())
    {
      InternalEObject oldUnselected = (InternalEObject)unselected;
      unselected = (BitmapDrawableResource)eResolveProxy(oldUnselected);
      if (unselected != oldUnselected)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__UNSELECTED, oldUnselected, unselected));
      }
    }
    return unselected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitmapDrawableResource basicGetUnselected()
  {
    return unselected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnselected(BitmapDrawableResource newUnselected)
  {
    BitmapDrawableResource oldUnselected = unselected;
    unselected = newUnselected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__UNSELECTED, oldUnselected, unselected));
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
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__SELECTED:
        if (resolve) return getSelected();
        return basicGetSelected();
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__UNSELECTED:
        if (resolve) return getUnselected();
        return basicGetUnselected();
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
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__SELECTED:
        setSelected((BitmapDrawableResource)newValue);
        return;
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__UNSELECTED:
        setUnselected((BitmapDrawableResource)newValue);
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
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__SELECTED:
        setSelected((BitmapDrawableResource)null);
        return;
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__UNSELECTED:
        setUnselected((BitmapDrawableResource)null);
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
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__SELECTED:
        return selected != null;
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE__UNSELECTED:
        return unselected != null;
    }
    return super.eIsSet(featureID);
  }

} //TabDrawableResourceImpl
