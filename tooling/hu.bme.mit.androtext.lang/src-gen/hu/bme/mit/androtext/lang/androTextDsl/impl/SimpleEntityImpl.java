/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.Position;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity;
import hu.bme.mit.androtext.lang.androTextDsl.Size;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleEntityImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleEntityImpl#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleEntityImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleEntityImpl extends GameEntityImpl implements SimpleEntity
{
  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Position position;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected Size size;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<GameEntity> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleEntityImpl()
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
    return AndroTextDslPackage.eINSTANCE.getSimpleEntity();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs)
  {
    Position oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIMPLE_ENTITY__POSITION, oldPosition, newPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Position newPosition)
  {
    if (newPosition != position)
    {
      NotificationChain msgs = null;
      if (position != null)
        msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SIMPLE_ENTITY__POSITION, null, msgs);
      if (newPosition != null)
        msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SIMPLE_ENTITY__POSITION, null, msgs);
      msgs = basicSetPosition(newPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIMPLE_ENTITY__POSITION, newPosition, newPosition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(Size newSize, NotificationChain msgs)
  {
    Size oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIMPLE_ENTITY__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(Size newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SIMPLE_ENTITY__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.SIMPLE_ENTITY__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIMPLE_ENTITY__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GameEntity> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<GameEntity>(GameEntity.class, this, AndroTextDslPackage.SIMPLE_ENTITY__CHILDREN);
    }
    return children;
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
      case AndroTextDslPackage.SIMPLE_ENTITY__POSITION:
        return basicSetPosition(null, msgs);
      case AndroTextDslPackage.SIMPLE_ENTITY__SIZE:
        return basicSetSize(null, msgs);
      case AndroTextDslPackage.SIMPLE_ENTITY__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.SIMPLE_ENTITY__POSITION:
        return getPosition();
      case AndroTextDslPackage.SIMPLE_ENTITY__SIZE:
        return getSize();
      case AndroTextDslPackage.SIMPLE_ENTITY__CHILDREN:
        return getChildren();
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
      case AndroTextDslPackage.SIMPLE_ENTITY__POSITION:
        setPosition((Position)newValue);
        return;
      case AndroTextDslPackage.SIMPLE_ENTITY__SIZE:
        setSize((Size)newValue);
        return;
      case AndroTextDslPackage.SIMPLE_ENTITY__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends GameEntity>)newValue);
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
      case AndroTextDslPackage.SIMPLE_ENTITY__POSITION:
        setPosition((Position)null);
        return;
      case AndroTextDslPackage.SIMPLE_ENTITY__SIZE:
        setSize((Size)null);
        return;
      case AndroTextDslPackage.SIMPLE_ENTITY__CHILDREN:
        getChildren().clear();
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
      case AndroTextDslPackage.SIMPLE_ENTITY__POSITION:
        return position != null;
      case AndroTextDslPackage.SIMPLE_ENTITY__SIZE:
        return size != null;
      case AndroTextDslPackage.SIMPLE_ENTITY__CHILDREN:
        return children != null && !children.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimpleEntityImpl
