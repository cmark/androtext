/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ByDouble;
import hu.bme.mit.androtext.lang.androTextDsl.MoveByModifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move By Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MoveByModifierImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MoveByModifierImpl#getBy <em>By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveByModifierImpl extends EntityModifierImpl implements MoveByModifier
{
  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final float DURATION_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected float duration = DURATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBy() <em>By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBy()
   * @generated
   * @ordered
   */
  protected ByDouble by;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveByModifierImpl()
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
    return AndroTextDslPackage.eINSTANCE.getMoveByModifier();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(float newDuration)
  {
    float oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_BY_MODIFIER__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ByDouble getBy()
  {
    return by;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBy(ByDouble newBy, NotificationChain msgs)
  {
    ByDouble oldBy = by;
    by = newBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_BY_MODIFIER__BY, oldBy, newBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBy(ByDouble newBy)
  {
    if (newBy != by)
    {
      NotificationChain msgs = null;
      if (by != null)
        msgs = ((InternalEObject)by).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MOVE_BY_MODIFIER__BY, null, msgs);
      if (newBy != null)
        msgs = ((InternalEObject)newBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MOVE_BY_MODIFIER__BY, null, msgs);
      msgs = basicSetBy(newBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_BY_MODIFIER__BY, newBy, newBy));
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
      case AndroTextDslPackage.MOVE_BY_MODIFIER__BY:
        return basicSetBy(null, msgs);
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
      case AndroTextDslPackage.MOVE_BY_MODIFIER__DURATION:
        return getDuration();
      case AndroTextDslPackage.MOVE_BY_MODIFIER__BY:
        return getBy();
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
      case AndroTextDslPackage.MOVE_BY_MODIFIER__DURATION:
        setDuration((Float)newValue);
        return;
      case AndroTextDslPackage.MOVE_BY_MODIFIER__BY:
        setBy((ByDouble)newValue);
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
      case AndroTextDslPackage.MOVE_BY_MODIFIER__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case AndroTextDslPackage.MOVE_BY_MODIFIER__BY:
        setBy((ByDouble)null);
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
      case AndroTextDslPackage.MOVE_BY_MODIFIER__DURATION:
        return duration != DURATION_EDEFAULT;
      case AndroTextDslPackage.MOVE_BY_MODIFIER__BY:
        return by != null;
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
    result.append(" (duration: ");
    result.append(duration);
    result.append(')');
    return result.toString();
  }

} //MoveByModifierImpl
