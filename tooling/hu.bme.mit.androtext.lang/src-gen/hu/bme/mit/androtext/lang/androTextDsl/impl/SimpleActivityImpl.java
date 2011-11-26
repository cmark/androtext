/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleActivityImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleActivityImpl#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleActivityImpl extends ActivityImpl implements SimpleActivity
{
  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected ViewGroup layout;

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
  protected SimpleActivityImpl()
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
    return AndroTextDslPackage.Literals.SIMPLE_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewGroup getLayout()
  {
    if (layout != null && layout.eIsProxy())
    {
      InternalEObject oldLayout = (InternalEObject)layout;
      layout = (ViewGroup)eResolveProxy(oldLayout);
      if (layout != oldLayout)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.SIMPLE_ACTIVITY__LAYOUT, oldLayout, layout));
      }
    }
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewGroup basicGetLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(ViewGroup newLayout)
  {
    ViewGroup oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIMPLE_ACTIVITY__LAYOUT, oldLayout, layout));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIMPLE_ACTIVITY__THEME, oldTheme, theme));
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
      case AndroTextDslPackage.SIMPLE_ACTIVITY__LAYOUT:
        if (resolve) return getLayout();
        return basicGetLayout();
      case AndroTextDslPackage.SIMPLE_ACTIVITY__THEME:
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
      case AndroTextDslPackage.SIMPLE_ACTIVITY__LAYOUT:
        setLayout((ViewGroup)newValue);
        return;
      case AndroTextDslPackage.SIMPLE_ACTIVITY__THEME:
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
      case AndroTextDslPackage.SIMPLE_ACTIVITY__LAYOUT:
        setLayout((ViewGroup)null);
        return;
      case AndroTextDslPackage.SIMPLE_ACTIVITY__THEME:
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
      case AndroTextDslPackage.SIMPLE_ACTIVITY__LAYOUT:
        return layout != null;
      case AndroTextDslPackage.SIMPLE_ACTIVITY__THEME:
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

} //SimpleActivityImpl
