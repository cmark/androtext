/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Body;
import hu.bme.mit.androtext.lang.androTextDsl.BodyType;
import hu.bme.mit.androtext.lang.androTextDsl.Fixture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BodyImpl#getBodyType <em>Body Type</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BodyImpl#getFixture <em>Fixture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends Box2DComponentImpl implements Body
{
  /**
   * The default value of the '{@link #getBodyType() <em>Body Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyType()
   * @generated
   * @ordered
   */
  protected static final BodyType BODY_TYPE_EDEFAULT = BodyType.STATIC;

  /**
   * The cached value of the '{@link #getBodyType() <em>Body Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyType()
   * @generated
   * @ordered
   */
  protected BodyType bodyType = BODY_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFixture() <em>Fixture</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixture()
   * @generated
   * @ordered
   */
  protected Fixture fixture;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyImpl()
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
    return AndroTextDslPackage.eINSTANCE.getBody();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType getBodyType()
  {
    return bodyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBodyType(BodyType newBodyType)
  {
    BodyType oldBodyType = bodyType;
    bodyType = newBodyType == null ? BODY_TYPE_EDEFAULT : newBodyType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BODY__BODY_TYPE, oldBodyType, bodyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fixture getFixture()
  {
    if (fixture != null && fixture.eIsProxy())
    {
      InternalEObject oldFixture = (InternalEObject)fixture;
      fixture = (Fixture)eResolveProxy(oldFixture);
      if (fixture != oldFixture)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.BODY__FIXTURE, oldFixture, fixture));
      }
    }
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fixture basicGetFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixture(Fixture newFixture)
  {
    Fixture oldFixture = fixture;
    fixture = newFixture;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BODY__FIXTURE, oldFixture, fixture));
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
      case AndroTextDslPackage.BODY__BODY_TYPE:
        return getBodyType();
      case AndroTextDslPackage.BODY__FIXTURE:
        if (resolve) return getFixture();
        return basicGetFixture();
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
      case AndroTextDslPackage.BODY__BODY_TYPE:
        setBodyType((BodyType)newValue);
        return;
      case AndroTextDslPackage.BODY__FIXTURE:
        setFixture((Fixture)newValue);
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
      case AndroTextDslPackage.BODY__BODY_TYPE:
        setBodyType(BODY_TYPE_EDEFAULT);
        return;
      case AndroTextDslPackage.BODY__FIXTURE:
        setFixture((Fixture)null);
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
      case AndroTextDslPackage.BODY__BODY_TYPE:
        return bodyType != BODY_TYPE_EDEFAULT;
      case AndroTextDslPackage.BODY__FIXTURE:
        return fixture != null;
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
    result.append(" (bodyType: ");
    result.append(bodyType);
    result.append(')');
    return result.toString();
  }

} //BodyImpl
