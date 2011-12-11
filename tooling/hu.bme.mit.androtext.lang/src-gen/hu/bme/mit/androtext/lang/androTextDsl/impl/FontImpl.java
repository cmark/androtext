/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Color;
import hu.bme.mit.androtext.lang.androTextDsl.Font;
import hu.bme.mit.androtext.lang.androTextDsl.FontType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FontImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FontImpl#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FontImpl#getColor <em>Color</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FontImpl#isAntialias <em>Antialias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontImpl extends GameElementImpl implements Font
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final FontType TYPE_EDEFAULT = FontType.BOLD;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected FontType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * The default value of the '{@link #isAntialias() <em>Antialias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAntialias()
   * @generated
   * @ordered
   */
  protected static final boolean ANTIALIAS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAntialias() <em>Antialias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAntialias()
   * @generated
   * @ordered
   */
  protected boolean antialias = ANTIALIAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontImpl()
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
    return AndroTextDslPackage.eINSTANCE.getFont();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(FontType newType)
  {
    FontType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FONT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FONT__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FONT__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.FONT__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.FONT__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FONT__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAntialias()
  {
    return antialias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAntialias(boolean newAntialias)
  {
    boolean oldAntialias = antialias;
    antialias = newAntialias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.FONT__ANTIALIAS, oldAntialias, antialias));
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
      case AndroTextDslPackage.FONT__COLOR:
        return basicSetColor(null, msgs);
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
      case AndroTextDslPackage.FONT__TYPE:
        return getType();
      case AndroTextDslPackage.FONT__SIZE:
        return getSize();
      case AndroTextDslPackage.FONT__COLOR:
        return getColor();
      case AndroTextDslPackage.FONT__ANTIALIAS:
        return isAntialias();
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
      case AndroTextDslPackage.FONT__TYPE:
        setType((FontType)newValue);
        return;
      case AndroTextDslPackage.FONT__SIZE:
        setSize((Integer)newValue);
        return;
      case AndroTextDslPackage.FONT__COLOR:
        setColor((Color)newValue);
        return;
      case AndroTextDslPackage.FONT__ANTIALIAS:
        setAntialias((Boolean)newValue);
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
      case AndroTextDslPackage.FONT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AndroTextDslPackage.FONT__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case AndroTextDslPackage.FONT__COLOR:
        setColor((Color)null);
        return;
      case AndroTextDslPackage.FONT__ANTIALIAS:
        setAntialias(ANTIALIAS_EDEFAULT);
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
      case AndroTextDslPackage.FONT__TYPE:
        return type != TYPE_EDEFAULT;
      case AndroTextDslPackage.FONT__SIZE:
        return size != SIZE_EDEFAULT;
      case AndroTextDslPackage.FONT__COLOR:
        return color != null;
      case AndroTextDslPackage.FONT__ANTIALIAS:
        return antialias != ANTIALIAS_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", size: ");
    result.append(size);
    result.append(", antialias: ");
    result.append(antialias);
    result.append(')');
    return result.toString();
  }

} //FontImpl
