/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typeface Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TypefaceAttributeImpl#getTypeface <em>Typeface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypefaceAttributeImpl extends MinimalEObjectImpl.Container implements TypefaceAttribute
{
  /**
   * The default value of the '{@link #getTypeface() <em>Typeface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeface()
   * @generated
   * @ordered
   */
  protected static final TypefaceKind TYPEFACE_EDEFAULT = TypefaceKind.NORMAL;

  /**
   * The cached value of the '{@link #getTypeface() <em>Typeface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeface()
   * @generated
   * @ordered
   */
  protected TypefaceKind typeface = TYPEFACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypefaceAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getTypefaceAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypefaceKind getTypeface()
  {
    return typeface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeface(TypefaceKind newTypeface)
  {
    TypefaceKind oldTypeface = typeface;
    typeface = newTypeface == null ? TYPEFACE_EDEFAULT : newTypeface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TYPEFACE_ATTRIBUTE__TYPEFACE, oldTypeface, typeface));
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
      case AndroTextDslPackage.TYPEFACE_ATTRIBUTE__TYPEFACE:
        return getTypeface();
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
      case AndroTextDslPackage.TYPEFACE_ATTRIBUTE__TYPEFACE:
        setTypeface((TypefaceKind)newValue);
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
      case AndroTextDslPackage.TYPEFACE_ATTRIBUTE__TYPEFACE:
        setTypeface(TYPEFACE_EDEFAULT);
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
      case AndroTextDslPackage.TYPEFACE_ATTRIBUTE__TYPEFACE:
        return typeface != TYPEFACE_EDEFAULT;
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
    result.append(" (typeface: ");
    result.append(typeface);
    result.append(')');
    return result.toString();
  }

} //TypefaceAttributeImpl
