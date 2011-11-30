/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontal Spacing Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.HorizontalSpacingAttributeImpl#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorizontalSpacingAttributeImpl extends MinimalEObjectImpl.Container implements HorizontalSpacingAttribute
{
  /**
   * The cached value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalSpacing()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue horizontalSpacing;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HorizontalSpacingAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getHorizontalSpacingAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getHorizontalSpacing()
  {
    return horizontalSpacing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorizontalSpacing(DimensionPropertyValue newHorizontalSpacing, NotificationChain msgs)
  {
    DimensionPropertyValue oldHorizontalSpacing = horizontalSpacing;
    horizontalSpacing = newHorizontalSpacing;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING, oldHorizontalSpacing, newHorizontalSpacing);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontalSpacing(DimensionPropertyValue newHorizontalSpacing)
  {
    if (newHorizontalSpacing != horizontalSpacing)
    {
      NotificationChain msgs = null;
      if (horizontalSpacing != null)
        msgs = ((InternalEObject)horizontalSpacing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING, null, msgs);
      if (newHorizontalSpacing != null)
        msgs = ((InternalEObject)newHorizontalSpacing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING, null, msgs);
      msgs = basicSetHorizontalSpacing(newHorizontalSpacing, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING, newHorizontalSpacing, newHorizontalSpacing));
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
      case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING:
        return basicSetHorizontalSpacing(null, msgs);
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
      case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING:
        return getHorizontalSpacing();
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
      case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING:
        setHorizontalSpacing((DimensionPropertyValue)newValue);
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
      case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING:
        setHorizontalSpacing((DimensionPropertyValue)null);
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
      case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING:
        return horizontalSpacing != null;
    }
    return super.eIsSet(featureID);
  }

} //HorizontalSpacingAttributeImpl
