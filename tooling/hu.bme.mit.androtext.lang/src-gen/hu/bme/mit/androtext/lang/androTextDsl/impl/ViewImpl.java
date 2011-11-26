/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl#getLayoutStyle <em>Layout Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLayoutStyle() <em>Layout Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutStyle()
   * @generated
   * @ordered
   */
  protected static final LayoutDimensionKind LAYOUT_STYLE_EDEFAULT = LayoutDimensionKind.FILL;

  /**
   * The cached value of the '{@link #getLayoutStyle() <em>Layout Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutStyle()
   * @generated
   * @ordered
   */
  protected LayoutDimensionKind layoutStyle = LAYOUT_STYLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewImpl()
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
    return AndroTextDslPackage.Literals.VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VIEW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutDimensionKind getLayoutStyle()
  {
    return layoutStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutStyle(LayoutDimensionKind newLayoutStyle)
  {
    LayoutDimensionKind oldLayoutStyle = layoutStyle;
    layoutStyle = newLayoutStyle == null ? LAYOUT_STYLE_EDEFAULT : newLayoutStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VIEW__LAYOUT_STYLE, oldLayoutStyle, layoutStyle));
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
      case AndroTextDslPackage.VIEW__NAME:
        return getName();
      case AndroTextDslPackage.VIEW__LAYOUT_STYLE:
        return getLayoutStyle();
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
      case AndroTextDslPackage.VIEW__NAME:
        setName((String)newValue);
        return;
      case AndroTextDslPackage.VIEW__LAYOUT_STYLE:
        setLayoutStyle((LayoutDimensionKind)newValue);
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
      case AndroTextDslPackage.VIEW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroTextDslPackage.VIEW__LAYOUT_STYLE:
        setLayoutStyle(LAYOUT_STYLE_EDEFAULT);
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
      case AndroTextDslPackage.VIEW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroTextDslPackage.VIEW__LAYOUT_STYLE:
        return layoutStyle != LAYOUT_STYLE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", layoutStyle: ");
    result.append(layoutStyle);
    result.append(')');
    return result.toString();
  }

} //ViewImpl
