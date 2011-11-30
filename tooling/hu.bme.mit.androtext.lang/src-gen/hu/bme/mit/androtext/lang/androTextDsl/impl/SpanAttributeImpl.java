/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpanAttributeImpl#getSpan <em>Span</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanAttributeImpl extends MinimalEObjectImpl.Container implements SpanAttribute
{
  /**
   * The cached value of the '{@link #getSpan() <em>Span</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpan()
   * @generated
   * @ordered
   */
  protected IntegerPropertyValue span;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpanAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getSpanAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPropertyValue getSpan()
  {
    return span;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpan(IntegerPropertyValue newSpan, NotificationChain msgs)
  {
    IntegerPropertyValue oldSpan = span;
    span = newSpan;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN, oldSpan, newSpan);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpan(IntegerPropertyValue newSpan)
  {
    if (newSpan != span)
    {
      NotificationChain msgs = null;
      if (span != null)
        msgs = ((InternalEObject)span).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN, null, msgs);
      if (newSpan != null)
        msgs = ((InternalEObject)newSpan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN, null, msgs);
      msgs = basicSetSpan(newSpan, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN, newSpan, newSpan));
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
      case AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN:
        return basicSetSpan(null, msgs);
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
      case AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN:
        return getSpan();
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
      case AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN:
        setSpan((IntegerPropertyValue)newValue);
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
      case AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN:
        setSpan((IntegerPropertyValue)null);
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
      case AndroTextDslPackage.SPAN_ATTRIBUTE__SPAN:
        return span != null;
    }
    return super.eIsSet(featureID);
  }

} //SpanAttributeImpl
