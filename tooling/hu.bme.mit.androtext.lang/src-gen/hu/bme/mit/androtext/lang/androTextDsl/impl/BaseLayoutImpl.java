/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BaseLayout;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.UIElement;

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
 * An implementation of the model object '<em><b>Base Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BaseLayoutImpl#getLayoutStyle <em>Layout Style</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BaseLayoutImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseLayoutImpl extends RootLayoutImpl implements BaseLayout
{
  /**
   * The default value of the '{@link #getLayoutStyle() <em>Layout Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutStyle()
   * @generated
   * @ordered
   */
  protected static final LayoutStyle LAYOUT_STYLE_EDEFAULT = LayoutStyle.FILL;

  /**
   * The cached value of the '{@link #getLayoutStyle() <em>Layout Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutStyle()
   * @generated
   * @ordered
   */
  protected LayoutStyle layoutStyle = LAYOUT_STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<UIElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseLayoutImpl()
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
    return AndroTextDslPackage.Literals.BASE_LAYOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutStyle getLayoutStyle()
  {
    return layoutStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutStyle(LayoutStyle newLayoutStyle)
  {
    LayoutStyle oldLayoutStyle = layoutStyle;
    layoutStyle = newLayoutStyle == null ? LAYOUT_STYLE_EDEFAULT : newLayoutStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BASE_LAYOUT__LAYOUT_STYLE, oldLayoutStyle, layoutStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UIElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<UIElement>(UIElement.class, this, AndroTextDslPackage.BASE_LAYOUT__ELEMENTS);
    }
    return elements;
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
      case AndroTextDslPackage.BASE_LAYOUT__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.BASE_LAYOUT__LAYOUT_STYLE:
        return getLayoutStyle();
      case AndroTextDslPackage.BASE_LAYOUT__ELEMENTS:
        return getElements();
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
      case AndroTextDslPackage.BASE_LAYOUT__LAYOUT_STYLE:
        setLayoutStyle((LayoutStyle)newValue);
        return;
      case AndroTextDslPackage.BASE_LAYOUT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends UIElement>)newValue);
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
      case AndroTextDslPackage.BASE_LAYOUT__LAYOUT_STYLE:
        setLayoutStyle(LAYOUT_STYLE_EDEFAULT);
        return;
      case AndroTextDslPackage.BASE_LAYOUT__ELEMENTS:
        getElements().clear();
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
      case AndroTextDslPackage.BASE_LAYOUT__LAYOUT_STYLE:
        return layoutStyle != LAYOUT_STYLE_EDEFAULT;
      case AndroTextDslPackage.BASE_LAYOUT__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (layoutStyle: ");
    result.append(layoutStyle);
    result.append(')');
    return result.toString();
  }

} //BaseLayoutImpl
