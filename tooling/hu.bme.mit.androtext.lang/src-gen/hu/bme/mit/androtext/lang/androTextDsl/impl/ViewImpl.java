/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl#getLayoutProperties <em>Layout Properties</em>}</li>
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
   * The cached value of the '{@link #getLayoutStyle() <em>Layout Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutStyle()
   * @generated
   * @ordered
   */
  protected LayoutStyle layoutStyle;

  /**
   * The cached value of the '{@link #getLayoutProperties() <em>Layout Properties</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutProperties()
   * @generated
   * @ordered
   */
  protected LayoutProperties layoutProperties;

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
    return AndroTextDslPackage.eINSTANCE.getView();
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
  public LayoutStyle getLayoutStyle()
  {
    return layoutStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayoutStyle(LayoutStyle newLayoutStyle, NotificationChain msgs)
  {
    LayoutStyle oldLayoutStyle = layoutStyle;
    layoutStyle = newLayoutStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VIEW__LAYOUT_STYLE, oldLayoutStyle, newLayoutStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutStyle(LayoutStyle newLayoutStyle)
  {
    if (newLayoutStyle != layoutStyle)
    {
      NotificationChain msgs = null;
      if (layoutStyle != null)
        msgs = ((InternalEObject)layoutStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.VIEW__LAYOUT_STYLE, null, msgs);
      if (newLayoutStyle != null)
        msgs = ((InternalEObject)newLayoutStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.VIEW__LAYOUT_STYLE, null, msgs);
      msgs = basicSetLayoutStyle(newLayoutStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VIEW__LAYOUT_STYLE, newLayoutStyle, newLayoutStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutProperties getLayoutProperties()
  {
    if (layoutProperties != null && layoutProperties.eIsProxy())
    {
      InternalEObject oldLayoutProperties = (InternalEObject)layoutProperties;
      layoutProperties = (LayoutProperties)eResolveProxy(oldLayoutProperties);
      if (layoutProperties != oldLayoutProperties)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.VIEW__LAYOUT_PROPERTIES, oldLayoutProperties, layoutProperties));
      }
    }
    return layoutProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutProperties basicGetLayoutProperties()
  {
    return layoutProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutProperties(LayoutProperties newLayoutProperties)
  {
    LayoutProperties oldLayoutProperties = layoutProperties;
    layoutProperties = newLayoutProperties;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VIEW__LAYOUT_PROPERTIES, oldLayoutProperties, layoutProperties));
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
      case AndroTextDslPackage.VIEW__LAYOUT_STYLE:
        return basicSetLayoutStyle(null, msgs);
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
      case AndroTextDslPackage.VIEW__NAME:
        return getName();
      case AndroTextDslPackage.VIEW__LAYOUT_STYLE:
        return getLayoutStyle();
      case AndroTextDslPackage.VIEW__LAYOUT_PROPERTIES:
        if (resolve) return getLayoutProperties();
        return basicGetLayoutProperties();
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
        setLayoutStyle((LayoutStyle)newValue);
        return;
      case AndroTextDslPackage.VIEW__LAYOUT_PROPERTIES:
        setLayoutProperties((LayoutProperties)newValue);
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
        setLayoutStyle((LayoutStyle)null);
        return;
      case AndroTextDslPackage.VIEW__LAYOUT_PROPERTIES:
        setLayoutProperties((LayoutProperties)null);
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
        return layoutStyle != null;
      case AndroTextDslPackage.VIEW__LAYOUT_PROPERTIES:
        return layoutProperties != null;
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
    result.append(')');
    return result.toString();
  }

} //ViewImpl
