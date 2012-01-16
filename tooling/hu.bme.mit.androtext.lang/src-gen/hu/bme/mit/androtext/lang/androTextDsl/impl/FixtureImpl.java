/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Fixture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FixtureImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FixtureImpl#getDensity <em>Density</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FixtureImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FixtureImpl#getRestitution <em>Restitution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixtureImpl extends LogicComponentImpl implements Fixture
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
   * The default value of the '{@link #getDensity() <em>Density</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDensity()
   * @generated
   * @ordered
   */
  protected static final float DENSITY_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getDensity() <em>Density</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDensity()
   * @generated
   * @ordered
   */
  protected float density = DENSITY_EDEFAULT;

  /**
   * The default value of the '{@link #getFriction() <em>Friction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFriction()
   * @generated
   * @ordered
   */
  protected static final float FRICTION_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getFriction() <em>Friction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFriction()
   * @generated
   * @ordered
   */
  protected float friction = FRICTION_EDEFAULT;

  /**
   * The default value of the '{@link #getRestitution() <em>Restitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestitution()
   * @generated
   * @ordered
   */
  protected static final float RESTITUTION_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getRestitution() <em>Restitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestitution()
   * @generated
   * @ordered
   */
  protected float restitution = RESTITUTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FixtureImpl()
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
    return AndroTextDslPackage.eINSTANCE.getFixture();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FIXTURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getDensity()
  {
    return density;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDensity(float newDensity)
  {
    float oldDensity = density;
    density = newDensity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FIXTURE__DENSITY, oldDensity, density));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getFriction()
  {
    return friction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFriction(float newFriction)
  {
    float oldFriction = friction;
    friction = newFriction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FIXTURE__FRICTION, oldFriction, friction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getRestitution()
  {
    return restitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestitution(float newRestitution)
  {
    float oldRestitution = restitution;
    restitution = newRestitution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FIXTURE__RESTITUTION, oldRestitution, restitution));
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
      case AndroTextDslPackage.FIXTURE__NAME:
        return getName();
      case AndroTextDslPackage.FIXTURE__DENSITY:
        return getDensity();
      case AndroTextDslPackage.FIXTURE__FRICTION:
        return getFriction();
      case AndroTextDslPackage.FIXTURE__RESTITUTION:
        return getRestitution();
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
      case AndroTextDslPackage.FIXTURE__NAME:
        setName((String)newValue);
        return;
      case AndroTextDslPackage.FIXTURE__DENSITY:
        setDensity((Float)newValue);
        return;
      case AndroTextDslPackage.FIXTURE__FRICTION:
        setFriction((Float)newValue);
        return;
      case AndroTextDslPackage.FIXTURE__RESTITUTION:
        setRestitution((Float)newValue);
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
      case AndroTextDslPackage.FIXTURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroTextDslPackage.FIXTURE__DENSITY:
        setDensity(DENSITY_EDEFAULT);
        return;
      case AndroTextDslPackage.FIXTURE__FRICTION:
        setFriction(FRICTION_EDEFAULT);
        return;
      case AndroTextDslPackage.FIXTURE__RESTITUTION:
        setRestitution(RESTITUTION_EDEFAULT);
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
      case AndroTextDslPackage.FIXTURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroTextDslPackage.FIXTURE__DENSITY:
        return density != DENSITY_EDEFAULT;
      case AndroTextDslPackage.FIXTURE__FRICTION:
        return friction != FRICTION_EDEFAULT;
      case AndroTextDslPackage.FIXTURE__RESTITUTION:
        return restitution != RESTITUTION_EDEFAULT;
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
    result.append(", density: ");
    result.append(density);
    result.append(", friction: ");
    result.append(friction);
    result.append(", restitution: ");
    result.append(restitution);
    result.append(')');
    return result.toString();
  }

} //FixtureImpl
