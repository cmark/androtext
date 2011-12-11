/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Color;
import hu.bme.mit.androtext.lang.androTextDsl.ConstantColor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorImpl#getR <em>R</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorImpl#getG <em>G</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorImpl#getB <em>B</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorImpl#getA <em>A</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorImpl#getConstantColor <em>Constant Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color
{
  /**
   * The default value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected static final float R_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected float r = R_EDEFAULT;

  /**
   * The default value of the '{@link #getG() <em>G</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected static final float G_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getG() <em>G</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected float g = G_EDEFAULT;

  /**
   * The default value of the '{@link #getB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected static final float B_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected float b = B_EDEFAULT;

  /**
   * The default value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected static final float A_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected float a = A_EDEFAULT;

  /**
   * The default value of the '{@link #getConstantColor() <em>Constant Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantColor()
   * @generated
   * @ordered
   */
  protected static final ConstantColor CONSTANT_COLOR_EDEFAULT = ConstantColor.BLACK;

  /**
   * The cached value of the '{@link #getConstantColor() <em>Constant Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantColor()
   * @generated
   * @ordered
   */
  protected ConstantColor constantColor = CONSTANT_COLOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorImpl()
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
    return AndroTextDslPackage.eINSTANCE.getColor();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(float newR)
  {
    float oldR = r;
    r = newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.COLOR__R, oldR, r));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getG()
  {
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setG(float newG)
  {
    float oldG = g;
    g = newG;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.COLOR__G, oldG, g));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(float newB)
  {
    float oldB = b;
    b = newB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.COLOR__B, oldB, b));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(float newA)
  {
    float oldA = a;
    a = newA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.COLOR__A, oldA, a));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantColor getConstantColor()
  {
    return constantColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantColor(ConstantColor newConstantColor)
  {
    ConstantColor oldConstantColor = constantColor;
    constantColor = newConstantColor == null ? CONSTANT_COLOR_EDEFAULT : newConstantColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.COLOR__CONSTANT_COLOR, oldConstantColor, constantColor));
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
      case AndroTextDslPackage.COLOR__R:
        return getR();
      case AndroTextDslPackage.COLOR__G:
        return getG();
      case AndroTextDslPackage.COLOR__B:
        return getB();
      case AndroTextDslPackage.COLOR__A:
        return getA();
      case AndroTextDslPackage.COLOR__CONSTANT_COLOR:
        return getConstantColor();
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
      case AndroTextDslPackage.COLOR__R:
        setR((Float)newValue);
        return;
      case AndroTextDslPackage.COLOR__G:
        setG((Float)newValue);
        return;
      case AndroTextDslPackage.COLOR__B:
        setB((Float)newValue);
        return;
      case AndroTextDslPackage.COLOR__A:
        setA((Float)newValue);
        return;
      case AndroTextDslPackage.COLOR__CONSTANT_COLOR:
        setConstantColor((ConstantColor)newValue);
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
      case AndroTextDslPackage.COLOR__R:
        setR(R_EDEFAULT);
        return;
      case AndroTextDslPackage.COLOR__G:
        setG(G_EDEFAULT);
        return;
      case AndroTextDslPackage.COLOR__B:
        setB(B_EDEFAULT);
        return;
      case AndroTextDslPackage.COLOR__A:
        setA(A_EDEFAULT);
        return;
      case AndroTextDslPackage.COLOR__CONSTANT_COLOR:
        setConstantColor(CONSTANT_COLOR_EDEFAULT);
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
      case AndroTextDslPackage.COLOR__R:
        return r != R_EDEFAULT;
      case AndroTextDslPackage.COLOR__G:
        return g != G_EDEFAULT;
      case AndroTextDslPackage.COLOR__B:
        return b != B_EDEFAULT;
      case AndroTextDslPackage.COLOR__A:
        return a != A_EDEFAULT;
      case AndroTextDslPackage.COLOR__CONSTANT_COLOR:
        return constantColor != CONSTANT_COLOR_EDEFAULT;
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
    result.append(" (r: ");
    result.append(r);
    result.append(", g: ");
    result.append(g);
    result.append(", b: ");
    result.append(b);
    result.append(", a: ");
    result.append(a);
    result.append(", constantColor: ");
    result.append(constantColor);
    result.append(')');
    return result.toString();
  }

} //ColorImpl
