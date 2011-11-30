/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Right Of Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToRightOfAttributeImpl#getToRightOf <em>To Right Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToRightOfAttributeImpl extends MinimalEObjectImpl.Container implements ToRightOfAttribute
{
  /**
   * The cached value of the '{@link #getToRightOf() <em>To Right Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToRightOf()
   * @generated
   * @ordered
   */
  protected View toRightOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ToRightOfAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getToRightOfAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getToRightOf()
  {
    if (toRightOf != null && toRightOf.eIsProxy())
    {
      InternalEObject oldToRightOf = (InternalEObject)toRightOf;
      toRightOf = (View)eResolveProxy(oldToRightOf);
      if (toRightOf != oldToRightOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE__TO_RIGHT_OF, oldToRightOf, toRightOf));
      }
    }
    return toRightOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetToRightOf()
  {
    return toRightOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToRightOf(View newToRightOf)
  {
    View oldToRightOf = toRightOf;
    toRightOf = newToRightOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE__TO_RIGHT_OF, oldToRightOf, toRightOf));
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
      case AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE__TO_RIGHT_OF:
        if (resolve) return getToRightOf();
        return basicGetToRightOf();
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
      case AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE__TO_RIGHT_OF:
        setToRightOf((View)newValue);
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
      case AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE__TO_RIGHT_OF:
        setToRightOf((View)null);
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
      case AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE__TO_RIGHT_OF:
        return toRightOf != null;
    }
    return super.eIsSet(featureID);
  }

} //ToRightOfAttributeImpl
