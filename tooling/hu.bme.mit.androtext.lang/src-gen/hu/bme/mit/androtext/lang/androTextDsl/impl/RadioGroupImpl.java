/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.RadioButton;
import hu.bme.mit.androtext.lang.androTextDsl.RadioGroup;

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
 * An implementation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl#isOrientation <em>Orientation</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl#getRadiobuttons <em>Radiobuttons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioGroupImpl extends SimpleViewImpl implements RadioGroup
{
  /**
   * The default value of the '{@link #isOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOrientation()
   * @generated
   * @ordered
   */
  protected static final boolean ORIENTATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOrientation()
   * @generated
   * @ordered
   */
  protected boolean orientation = ORIENTATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRadiobuttons() <em>Radiobuttons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadiobuttons()
   * @generated
   * @ordered
   */
  protected EList<RadioButton> radiobuttons;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadioGroupImpl()
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
    return AndroTextDslPackage.Literals.RADIO_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOrientation()
  {
    return orientation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrientation(boolean newOrientation)
  {
    boolean oldOrientation = orientation;
    orientation = newOrientation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.RADIO_GROUP__ORIENTATION, oldOrientation, orientation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RadioButton> getRadiobuttons()
  {
    if (radiobuttons == null)
    {
      radiobuttons = new EObjectContainmentEList<RadioButton>(RadioButton.class, this, AndroTextDslPackage.RADIO_GROUP__RADIOBUTTONS);
    }
    return radiobuttons;
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
      case AndroTextDslPackage.RADIO_GROUP__RADIOBUTTONS:
        return ((InternalEList<?>)getRadiobuttons()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.RADIO_GROUP__ORIENTATION:
        return isOrientation();
      case AndroTextDslPackage.RADIO_GROUP__RADIOBUTTONS:
        return getRadiobuttons();
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
      case AndroTextDslPackage.RADIO_GROUP__ORIENTATION:
        setOrientation((Boolean)newValue);
        return;
      case AndroTextDslPackage.RADIO_GROUP__RADIOBUTTONS:
        getRadiobuttons().clear();
        getRadiobuttons().addAll((Collection<? extends RadioButton>)newValue);
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
      case AndroTextDslPackage.RADIO_GROUP__ORIENTATION:
        setOrientation(ORIENTATION_EDEFAULT);
        return;
      case AndroTextDslPackage.RADIO_GROUP__RADIOBUTTONS:
        getRadiobuttons().clear();
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
      case AndroTextDslPackage.RADIO_GROUP__ORIENTATION:
        return orientation != ORIENTATION_EDEFAULT;
      case AndroTextDslPackage.RADIO_GROUP__RADIOBUTTONS:
        return radiobuttons != null && !radiobuttons.isEmpty();
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
    result.append(" (orientation: ");
    result.append(orientation);
    result.append(')');
    return result.toString();
  }

} //RadioGroupImpl
