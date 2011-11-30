/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Line Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SingleLineAttributeImpl#getSingleLine <em>Single Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleLineAttributeImpl extends MinimalEObjectImpl.Container implements SingleLineAttribute
{
  /**
   * The cached value of the '{@link #getSingleLine() <em>Single Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleLine()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue singleLine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleLineAttributeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getSingleLineAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getSingleLine()
  {
    return singleLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleLine(BooleanPropertyValue newSingleLine, NotificationChain msgs)
  {
    BooleanPropertyValue oldSingleLine = singleLine;
    singleLine = newSingleLine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE, oldSingleLine, newSingleLine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleLine(BooleanPropertyValue newSingleLine)
  {
    if (newSingleLine != singleLine)
    {
      NotificationChain msgs = null;
      if (singleLine != null)
        msgs = ((InternalEObject)singleLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE, null, msgs);
      if (newSingleLine != null)
        msgs = ((InternalEObject)newSingleLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE, null, msgs);
      msgs = basicSetSingleLine(newSingleLine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE, newSingleLine, newSingleLine));
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
      case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE:
        return basicSetSingleLine(null, msgs);
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
      case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE:
        return getSingleLine();
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
      case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE:
        setSingleLine((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE:
        setSingleLine((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE__SINGLE_LINE:
        return singleLine != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleLineAttributeImpl
