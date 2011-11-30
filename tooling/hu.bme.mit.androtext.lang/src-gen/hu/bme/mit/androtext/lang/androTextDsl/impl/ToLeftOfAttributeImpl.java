/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Left Of Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToLeftOfAttributeImpl#getToLeftOf <em>To Left Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToLeftOfAttributeImpl extends MinimalEObjectImpl.Container implements ToLeftOfAttribute
{
  /**
   * The cached value of the '{@link #getToLeftOf() <em>To Left Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToLeftOf()
   * @generated
   * @ordered
   */
  protected View toLeftOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ToLeftOfAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getToLeftOfAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getToLeftOf()
  {
    if (toLeftOf != null && toLeftOf.eIsProxy())
    {
      InternalEObject oldToLeftOf = (InternalEObject)toLeftOf;
      toLeftOf = (View)eResolveProxy(oldToLeftOf);
      if (toLeftOf != oldToLeftOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE__TO_LEFT_OF, oldToLeftOf, toLeftOf));
      }
    }
    return toLeftOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetToLeftOf()
  {
    return toLeftOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToLeftOf(View newToLeftOf)
  {
    View oldToLeftOf = toLeftOf;
    toLeftOf = newToLeftOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE__TO_LEFT_OF, oldToLeftOf, toLeftOf));
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
      case AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE__TO_LEFT_OF:
        if (resolve) return getToLeftOf();
        return basicGetToLeftOf();
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
      case AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE__TO_LEFT_OF:
        setToLeftOf((View)newValue);
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
      case AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE__TO_LEFT_OF:
        setToLeftOf((View)null);
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
      case AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE__TO_LEFT_OF:
        return toLeftOf != null;
    }
    return super.eIsSet(featureID);
  }

} //ToLeftOfAttributeImpl
