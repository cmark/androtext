/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capitalize Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CapitalizeAttributeImpl#getCapitalize <em>Capitalize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapitalizeAttributeImpl extends MinimalEObjectImpl.Container implements CapitalizeAttribute
{
  /**
   * The default value of the '{@link #getCapitalize() <em>Capitalize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapitalize()
   * @generated
   * @ordered
   */
  protected static final CapitalizeKind CAPITALIZE_EDEFAULT = CapitalizeKind.NONE;

  /**
   * The cached value of the '{@link #getCapitalize() <em>Capitalize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapitalize()
   * @generated
   * @ordered
   */
  protected CapitalizeKind capitalize = CAPITALIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapitalizeAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getCapitalizeAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapitalizeKind getCapitalize()
  {
    return capitalize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapitalize(CapitalizeKind newCapitalize)
  {
    CapitalizeKind oldCapitalize = capitalize;
    capitalize = newCapitalize == null ? CAPITALIZE_EDEFAULT : newCapitalize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.CAPITALIZE_ATTRIBUTE__CAPITALIZE, oldCapitalize, capitalize));
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
      case AndroTextDslPackage.CAPITALIZE_ATTRIBUTE__CAPITALIZE:
        return getCapitalize();
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
      case AndroTextDslPackage.CAPITALIZE_ATTRIBUTE__CAPITALIZE:
        setCapitalize((CapitalizeKind)newValue);
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
      case AndroTextDslPackage.CAPITALIZE_ATTRIBUTE__CAPITALIZE:
        setCapitalize(CAPITALIZE_EDEFAULT);
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
      case AndroTextDslPackage.CAPITALIZE_ATTRIBUTE__CAPITALIZE:
        return capitalize != CAPITALIZE_EDEFAULT;
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
    result.append(" (capitalize: ");
    result.append(capitalize);
    result.append(')');
    return result.toString();
  }

} //CapitalizeAttributeImpl
