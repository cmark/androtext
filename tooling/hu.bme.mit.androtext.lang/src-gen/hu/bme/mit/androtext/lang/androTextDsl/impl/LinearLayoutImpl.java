/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;

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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl#getGravity <em>Gravity</em>}</li>
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
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected GravityAttribute gravity;

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
    return AndroTextDslPackage.eINSTANCE.getLinearLayout();
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
  public GravityAttribute getGravity()
  {
    return gravity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGravity(GravityAttribute newGravity, NotificationChain msgs)
  {
    GravityAttribute oldGravity = gravity;
    gravity = newGravity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY, oldGravity, newGravity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGravity(GravityAttribute newGravity)
  {
    if (newGravity != gravity)
    {
      NotificationChain msgs = null;
      if (gravity != null)
        msgs = ((InternalEObject)gravity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY, null, msgs);
      if (newGravity != null)
        msgs = ((InternalEObject)newGravity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY, null, msgs);
      msgs = basicSetGravity(newGravity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY, newGravity, newGravity));
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
      case AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY:
        return basicSetGravity(null, msgs);
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
      case AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY:
        return getGravity();
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
      case AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY:
        setGravity((GravityAttribute)newValue);
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
      case AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY:
        setGravity((GravityAttribute)null);
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
      case AndroTextDslPackage.LINEAR_LAYOUT__GRAVITY:
        return gravity != null;
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
