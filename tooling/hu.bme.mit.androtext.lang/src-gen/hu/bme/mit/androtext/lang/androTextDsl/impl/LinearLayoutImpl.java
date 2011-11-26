/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearLayoutImpl extends ViewGroupImpl implements LinearLayout
{
  /**
   * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVertical()
   * @generated
   * @ordered
   */
  protected static final boolean VERTICAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVertical()
   * @generated
   * @ordered
   */
  protected boolean vertical = VERTICAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getLayoutParams() <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutParams()
   * @generated
   * @ordered
   */
  protected LinearLayoutParams layoutParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinearLayoutImpl()
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
    return AndroTextDslPackage.Literals.LINEAR_LAYOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVertical()
  {
    return vertical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVertical(boolean newVertical)
  {
    boolean oldVertical = vertical;
    vertical = newVertical;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT__VERTICAL, oldVertical, vertical));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinearLayoutParams getLayoutParams()
  {
    return layoutParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayoutParams(LinearLayoutParams newLayoutParams, NotificationChain msgs)
  {
    LinearLayoutParams oldLayoutParams = layoutParams;
    layoutParams = newLayoutParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, oldLayoutParams, newLayoutParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutParams(LinearLayoutParams newLayoutParams)
  {
    if (newLayoutParams != layoutParams)
    {
      NotificationChain msgs = null;
      if (layoutParams != null)
        msgs = ((InternalEObject)layoutParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, null, msgs);
      if (newLayoutParams != null)
        msgs = ((InternalEObject)newLayoutParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, null, msgs);
      msgs = basicSetLayoutParams(newLayoutParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, newLayoutParams, newLayoutParams));
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
      case AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
        return basicSetLayoutParams(null, msgs);
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
      case AndroTextDslPackage.LINEAR_LAYOUT__VERTICAL:
        return isVertical();
      case AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
        return getLayoutParams();
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
      case AndroTextDslPackage.LINEAR_LAYOUT__VERTICAL:
        setVertical((Boolean)newValue);
        return;
      case AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
        setLayoutParams((LinearLayoutParams)newValue);
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
      case AndroTextDslPackage.LINEAR_LAYOUT__VERTICAL:
        setVertical(VERTICAL_EDEFAULT);
        return;
      case AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
        setLayoutParams((LinearLayoutParams)null);
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
      case AndroTextDslPackage.LINEAR_LAYOUT__VERTICAL:
        return vertical != VERTICAL_EDEFAULT;
      case AndroTextDslPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
        return layoutParams != null;
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
    result.append(" (vertical: ");
    result.append(vertical);
    result.append(')');
    return result.toString();
  }

} //LinearLayoutImpl
