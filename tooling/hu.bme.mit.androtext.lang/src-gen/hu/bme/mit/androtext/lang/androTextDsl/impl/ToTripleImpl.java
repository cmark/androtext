/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ToTriple;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Triple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToTripleImpl#getFirst <em>First</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToTripleImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToTripleImpl#getThird <em>Third</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToTripleImpl extends MinimalEObjectImpl.Container implements ToTriple
{
  /**
   * The default value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected static final float FIRST_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected float first = FIRST_EDEFAULT;

  /**
   * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected static final float SECOND_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected float second = SECOND_EDEFAULT;

  /**
   * The default value of the '{@link #getThird() <em>Third</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThird()
   * @generated
   * @ordered
   */
  protected static final float THIRD_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getThird() <em>Third</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThird()
   * @generated
   * @ordered
   */
  protected float third = THIRD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ToTripleImpl()
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
    return AndroTextDslPackage.eINSTANCE.getToTriple();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(float newFirst)
  {
    float oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TO_TRIPLE__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(float newSecond)
  {
    float oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TO_TRIPLE__SECOND, oldSecond, second));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getThird()
  {
    return third;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThird(float newThird)
  {
    float oldThird = third;
    third = newThird;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TO_TRIPLE__THIRD, oldThird, third));
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
      case AndroTextDslPackage.TO_TRIPLE__FIRST:
        return getFirst();
      case AndroTextDslPackage.TO_TRIPLE__SECOND:
        return getSecond();
      case AndroTextDslPackage.TO_TRIPLE__THIRD:
        return getThird();
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
      case AndroTextDslPackage.TO_TRIPLE__FIRST:
        setFirst((Float)newValue);
        return;
      case AndroTextDslPackage.TO_TRIPLE__SECOND:
        setSecond((Float)newValue);
        return;
      case AndroTextDslPackage.TO_TRIPLE__THIRD:
        setThird((Float)newValue);
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
      case AndroTextDslPackage.TO_TRIPLE__FIRST:
        setFirst(FIRST_EDEFAULT);
        return;
      case AndroTextDslPackage.TO_TRIPLE__SECOND:
        setSecond(SECOND_EDEFAULT);
        return;
      case AndroTextDslPackage.TO_TRIPLE__THIRD:
        setThird(THIRD_EDEFAULT);
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
      case AndroTextDslPackage.TO_TRIPLE__FIRST:
        return first != FIRST_EDEFAULT;
      case AndroTextDslPackage.TO_TRIPLE__SECOND:
        return second != SECOND_EDEFAULT;
      case AndroTextDslPackage.TO_TRIPLE__THIRD:
        return third != THIRD_EDEFAULT;
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
    result.append(" (first: ");
    result.append(first);
    result.append(", second: ");
    result.append(second);
    result.append(", third: ");
    result.append(third);
    result.append(')');
    return result.toString();
  }

} //ToTripleImpl
