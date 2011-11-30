/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextStyleAttributeImpl#getTextStyle <em>Text Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextStyleAttributeImpl extends MinimalEObjectImpl.Container implements TextStyleAttribute
{
  /**
   * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextStyle()
   * @generated
   * @ordered
   */
  protected EList<TextStyleKind> textStyle;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextStyleAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getTextStyleAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TextStyleKind> getTextStyle()
  {
    if (textStyle == null)
    {
      textStyle = new EDataTypeEList<TextStyleKind>(TextStyleKind.class, this, AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE__TEXT_STYLE);
    }
    return textStyle;
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
      case AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE__TEXT_STYLE:
        return getTextStyle();
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
      case AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE__TEXT_STYLE:
        getTextStyle().clear();
        getTextStyle().addAll((Collection<? extends TextStyleKind>)newValue);
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
      case AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE__TEXT_STYLE:
        getTextStyle().clear();
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
      case AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE__TEXT_STYLE:
        return textStyle != null && !textStyle.isEmpty();
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
    result.append(" (textStyle: ");
    result.append(textStyle);
    result.append(')');
    return result.toString();
  }

} //TextStyleAttributeImpl
