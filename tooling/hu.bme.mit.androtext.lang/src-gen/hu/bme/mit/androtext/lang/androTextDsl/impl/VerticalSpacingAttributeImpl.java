/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical Spacing Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.VerticalSpacingAttributeImpl#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerticalSpacingAttributeImpl extends MinimalEObjectImpl.Container implements VerticalSpacingAttribute
{
  /**
   * The cached value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalSpacing()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue verticalSpacing;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerticalSpacingAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getVerticalSpacingAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getVerticalSpacing()
  {
    return verticalSpacing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerticalSpacing(DimensionPropertyValue newVerticalSpacing, NotificationChain msgs)
  {
    DimensionPropertyValue oldVerticalSpacing = verticalSpacing;
    verticalSpacing = newVerticalSpacing;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING, oldVerticalSpacing, newVerticalSpacing);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerticalSpacing(DimensionPropertyValue newVerticalSpacing)
  {
    if (newVerticalSpacing != verticalSpacing)
    {
      NotificationChain msgs = null;
      if (verticalSpacing != null)
        msgs = ((InternalEObject)verticalSpacing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING, null, msgs);
      if (newVerticalSpacing != null)
        msgs = ((InternalEObject)newVerticalSpacing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING, null, msgs);
      msgs = basicSetVerticalSpacing(newVerticalSpacing, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING, newVerticalSpacing, newVerticalSpacing));
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
      case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING:
        return basicSetVerticalSpacing(null, msgs);
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
      case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING:
        return getVerticalSpacing();
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
      case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING:
        setVerticalSpacing((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING:
        setVerticalSpacing((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING:
        return verticalSpacing != null;
    }
    return super.eIsSet(featureID);
  }

} //VerticalSpacingAttributeImpl
