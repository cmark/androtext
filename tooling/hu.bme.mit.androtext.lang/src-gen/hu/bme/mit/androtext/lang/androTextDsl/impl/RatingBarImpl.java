/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.RatingBar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RatingBarImpl#getNumStars <em>Num Stars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RatingBarImpl extends SimpleViewImpl implements RatingBar
{
  /**
   * The cached value of the '{@link #getNumStars() <em>Num Stars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumStars()
   * @generated
   * @ordered
   */
  protected IntegerPropertyValue numStars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RatingBarImpl()
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
    return AndroTextDslPackage.eINSTANCE.getRatingBar();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPropertyValue getNumStars()
  {
    return numStars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumStars(IntegerPropertyValue newNumStars, NotificationChain msgs)
  {
    IntegerPropertyValue oldNumStars = numStars;
    numStars = newNumStars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.RATING_BAR__NUM_STARS, oldNumStars, newNumStars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumStars(IntegerPropertyValue newNumStars)
  {
    if (newNumStars != numStars)
    {
      NotificationChain msgs = null;
      if (numStars != null)
        msgs = ((InternalEObject)numStars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.RATING_BAR__NUM_STARS, null, msgs);
      if (newNumStars != null)
        msgs = ((InternalEObject)newNumStars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.RATING_BAR__NUM_STARS, null, msgs);
      msgs = basicSetNumStars(newNumStars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.RATING_BAR__NUM_STARS, newNumStars, newNumStars));
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
      case AndroTextDslPackage.RATING_BAR__NUM_STARS:
        return basicSetNumStars(null, msgs);
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
      case AndroTextDslPackage.RATING_BAR__NUM_STARS:
        return getNumStars();
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
      case AndroTextDslPackage.RATING_BAR__NUM_STARS:
        setNumStars((IntegerPropertyValue)newValue);
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
      case AndroTextDslPackage.RATING_BAR__NUM_STARS:
        setNumStars((IntegerPropertyValue)null);
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
      case AndroTextDslPackage.RATING_BAR__NUM_STARS:
        return numStars != null;
    }
    return super.eIsSet(featureID);
  }

} //RatingBarImpl
