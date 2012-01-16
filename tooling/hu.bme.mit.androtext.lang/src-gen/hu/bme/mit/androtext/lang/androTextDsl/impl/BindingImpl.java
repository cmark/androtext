/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Bindable;
import hu.bme.mit.androtext.lang.androTextDsl.Binding;
import hu.bme.mit.androtext.lang.androTextDsl.BindingTarget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BindingImpl#getBindable <em>Bindable</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BindingImpl#getBindingTarget <em>Binding Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends LogicComponentImpl implements Binding
{
  /**
   * The cached value of the '{@link #getBindable() <em>Bindable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindable()
   * @generated
   * @ordered
   */
  protected Bindable bindable;

  /**
   * The cached value of the '{@link #getBindingTarget() <em>Binding Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindingTarget()
   * @generated
   * @ordered
   */
  protected BindingTarget bindingTarget;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return AndroTextDslPackage.eINSTANCE.getBinding();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bindable getBindable()
  {
    if (bindable != null && bindable.eIsProxy())
    {
      InternalEObject oldBindable = (InternalEObject)bindable;
      bindable = (Bindable)eResolveProxy(oldBindable);
      if (bindable != oldBindable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.BINDING__BINDABLE, oldBindable, bindable));
      }
    }
    return bindable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bindable basicGetBindable()
  {
    return bindable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindable(Bindable newBindable)
  {
    Bindable oldBindable = bindable;
    bindable = newBindable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BINDING__BINDABLE, oldBindable, bindable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingTarget getBindingTarget()
  {
    return bindingTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBindingTarget(BindingTarget newBindingTarget, NotificationChain msgs)
  {
    BindingTarget oldBindingTarget = bindingTarget;
    bindingTarget = newBindingTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BINDING__BINDING_TARGET, oldBindingTarget, newBindingTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindingTarget(BindingTarget newBindingTarget)
  {
    if (newBindingTarget != bindingTarget)
    {
      NotificationChain msgs = null;
      if (bindingTarget != null)
        msgs = ((InternalEObject)bindingTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BINDING__BINDING_TARGET, null, msgs);
      if (newBindingTarget != null)
        msgs = ((InternalEObject)newBindingTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BINDING__BINDING_TARGET, null, msgs);
      msgs = basicSetBindingTarget(newBindingTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BINDING__BINDING_TARGET, newBindingTarget, newBindingTarget));
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
      case AndroTextDslPackage.BINDING__BINDING_TARGET:
        return basicSetBindingTarget(null, msgs);
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
      case AndroTextDslPackage.BINDING__BINDABLE:
        if (resolve) return getBindable();
        return basicGetBindable();
      case AndroTextDslPackage.BINDING__BINDING_TARGET:
        return getBindingTarget();
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
      case AndroTextDslPackage.BINDING__BINDABLE:
        setBindable((Bindable)newValue);
        return;
      case AndroTextDslPackage.BINDING__BINDING_TARGET:
        setBindingTarget((BindingTarget)newValue);
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
      case AndroTextDslPackage.BINDING__BINDABLE:
        setBindable((Bindable)null);
        return;
      case AndroTextDslPackage.BINDING__BINDING_TARGET:
        setBindingTarget((BindingTarget)null);
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
      case AndroTextDslPackage.BINDING__BINDABLE:
        return bindable != null;
      case AndroTextDslPackage.BINDING__BINDING_TARGET:
        return bindingTarget != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl
