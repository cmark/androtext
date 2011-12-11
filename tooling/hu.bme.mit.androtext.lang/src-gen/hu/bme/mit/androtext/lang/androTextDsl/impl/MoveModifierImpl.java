/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.FromDouble;
import hu.bme.mit.androtext.lang.androTextDsl.MoveModifier;
import hu.bme.mit.androtext.lang.androTextDsl.ToDouble;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MoveModifierImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MoveModifierImpl#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MoveModifierImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveModifierImpl extends EntityModifierImpl implements MoveModifier
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
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected FromDouble from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected ToDouble to;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveModifierImpl()
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
    return AndroTextDslPackage.eINSTANCE.getMoveModifier();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_MODIFIER__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromDouble getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(FromDouble newFrom, NotificationChain msgs)
  {
    FromDouble oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_MODIFIER__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(FromDouble newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MOVE_MODIFIER__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MOVE_MODIFIER__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_MODIFIER__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToDouble getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo(ToDouble newTo, NotificationChain msgs)
  {
    ToDouble oldTo = to;
    to = newTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_MODIFIER__TO, oldTo, newTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(ToDouble newTo)
  {
    if (newTo != to)
    {
      NotificationChain msgs = null;
      if (to != null)
        msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MOVE_MODIFIER__TO, null, msgs);
      if (newTo != null)
        msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.MOVE_MODIFIER__TO, null, msgs);
      msgs = basicSetTo(newTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.MOVE_MODIFIER__TO, newTo, newTo));
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
      case AndroTextDslPackage.MOVE_MODIFIER__FROM:
        return basicSetFrom(null, msgs);
      case AndroTextDslPackage.MOVE_MODIFIER__TO:
        return basicSetTo(null, msgs);
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
      case AndroTextDslPackage.MOVE_MODIFIER__DURATION:
        return getDuration();
      case AndroTextDslPackage.MOVE_MODIFIER__FROM:
        return getFrom();
      case AndroTextDslPackage.MOVE_MODIFIER__TO:
        return getTo();
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
      case AndroTextDslPackage.MOVE_MODIFIER__DURATION:
        setDuration((Float)newValue);
        return;
      case AndroTextDslPackage.MOVE_MODIFIER__FROM:
        setFrom((FromDouble)newValue);
        return;
      case AndroTextDslPackage.MOVE_MODIFIER__TO:
        setTo((ToDouble)newValue);
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
      case AndroTextDslPackage.MOVE_MODIFIER__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case AndroTextDslPackage.MOVE_MODIFIER__FROM:
        setFrom((FromDouble)null);
        return;
      case AndroTextDslPackage.MOVE_MODIFIER__TO:
        setTo((ToDouble)null);
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
      case AndroTextDslPackage.MOVE_MODIFIER__DURATION:
        return duration != DURATION_EDEFAULT;
      case AndroTextDslPackage.MOVE_MODIFIER__FROM:
        return from != null;
      case AndroTextDslPackage.MOVE_MODIFIER__TO:
        return to != null;
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

} //MoveModifierImpl
