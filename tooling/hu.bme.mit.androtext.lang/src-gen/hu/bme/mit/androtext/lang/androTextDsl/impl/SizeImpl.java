/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Size;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SizeImpl#getW <em>W</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SizeImpl#getH <em>H</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeImpl extends MinimalEObjectImpl.Container implements Size
{
  /**
   * The default value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected static final float W_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected float w = W_EDEFAULT;

  /**
   * The default value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected static final float H_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected float h = H_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SizeImpl()
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
    return AndroTextDslPackage.eINSTANCE.getSize();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW(float newW)
  {
    float oldW = w;
    w = newW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIZE__W, oldW, w));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getH()
  {
    return h;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setH(float newH)
  {
    float oldH = h;
    h = newH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.SIZE__H, oldH, h));
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
      case AndroTextDslPackage.SIZE__W:
        return getW();
      case AndroTextDslPackage.SIZE__H:
        return getH();
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
      case AndroTextDslPackage.SIZE__W:
        setW((Float)newValue);
        return;
      case AndroTextDslPackage.SIZE__H:
        setH((Float)newValue);
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
      case AndroTextDslPackage.SIZE__W:
        setW(W_EDEFAULT);
        return;
      case AndroTextDslPackage.SIZE__H:
        setH(H_EDEFAULT);
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
      case AndroTextDslPackage.SIZE__W:
        return w != W_EDEFAULT;
      case AndroTextDslPackage.SIZE__H:
        return h != H_EDEFAULT;
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
    result.append(" (w: ");
    result.append(w);
    result.append(", h: ");
    result.append(h);
    result.append(')');
    return result.toString();
  }

} //SizeImpl
