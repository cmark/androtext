/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ActivityImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ActivityImpl#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends AndroidApplicationModelElementImpl implements Activity
{
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
   * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheme()
   * @generated
   * @ordered
   */
  protected static final ActivityTheme THEME_EDEFAULT = ActivityTheme.DIALOG;

  /**
   * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheme()
   * @generated
   * @ordered
   */
  protected ActivityTheme theme = THEME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityImpl()
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
    return AndroTextDslPackage.eINSTANCE.getActivity();
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.ACTIVITY__LAYOUT, oldLayout, layout));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ACTIVITY__LAYOUT, oldLayout, layout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityTheme getTheme()
  {
    return theme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTheme(ActivityTheme newTheme)
  {
    ActivityTheme oldTheme = theme;
    theme = newTheme == null ? THEME_EDEFAULT : newTheme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ACTIVITY__THEME, oldTheme, theme));
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
      case AndroTextDslPackage.ACTIVITY__LAYOUT:
        if (resolve) return getLayout();
        return basicGetLayout();
      case AndroTextDslPackage.ACTIVITY__THEME:
        return getTheme();
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
      case AndroTextDslPackage.ACTIVITY__LAYOUT:
        setLayout((View)newValue);
        return;
      case AndroTextDslPackage.ACTIVITY__THEME:
        setTheme((ActivityTheme)newValue);
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
      case AndroTextDslPackage.ACTIVITY__LAYOUT:
        setLayout((View)null);
        return;
      case AndroTextDslPackage.ACTIVITY__THEME:
        setTheme(THEME_EDEFAULT);
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
      case AndroTextDslPackage.ACTIVITY__LAYOUT:
        return layout != null;
      case AndroTextDslPackage.ACTIVITY__THEME:
        return theme != THEME_EDEFAULT;
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
    result.append(" (theme: ");
    result.append(theme);
    result.append(')');
    return result.toString();
  }

} //ActivityImpl
