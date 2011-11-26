/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutParams;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl#getGravityAttribute <em>Gravity Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl#getTextSizeAttribute <em>Text Size Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextViewImpl extends SimpleViewImpl implements TextView
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getGravityAttribute() <em>Gravity Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravityAttribute()
   * @generated
   * @ordered
   */
  protected GravityAttribute gravityAttribute;

  /**
   * The cached value of the '{@link #getTextSizeAttribute() <em>Text Size Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextSizeAttribute()
   * @generated
   * @ordered
   */
  protected TextSizeAttribute textSizeAttribute;

  /**
   * The cached value of the '{@link #getLayoutParams() <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutParams()
   * @generated
   * @ordered
   */
  protected LayoutParams layoutParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextViewImpl()
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
    return AndroTextDslPackage.Literals.TEXT_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_VIEW__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GravityAttribute getGravityAttribute()
  {
    return gravityAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGravityAttribute(GravityAttribute newGravityAttribute, NotificationChain msgs)
  {
    GravityAttribute oldGravityAttribute = gravityAttribute;
    gravityAttribute = newGravityAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE, oldGravityAttribute, newGravityAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGravityAttribute(GravityAttribute newGravityAttribute)
  {
    if (newGravityAttribute != gravityAttribute)
    {
      NotificationChain msgs = null;
      if (gravityAttribute != null)
        msgs = ((InternalEObject)gravityAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE, null, msgs);
      if (newGravityAttribute != null)
        msgs = ((InternalEObject)newGravityAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE, null, msgs);
      msgs = basicSetGravityAttribute(newGravityAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE, newGravityAttribute, newGravityAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextSizeAttribute getTextSizeAttribute()
  {
    return textSizeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextSizeAttribute(TextSizeAttribute newTextSizeAttribute, NotificationChain msgs)
  {
    TextSizeAttribute oldTextSizeAttribute = textSizeAttribute;
    textSizeAttribute = newTextSizeAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE, oldTextSizeAttribute, newTextSizeAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextSizeAttribute(TextSizeAttribute newTextSizeAttribute)
  {
    if (newTextSizeAttribute != textSizeAttribute)
    {
      NotificationChain msgs = null;
      if (textSizeAttribute != null)
        msgs = ((InternalEObject)textSizeAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE, null, msgs);
      if (newTextSizeAttribute != null)
        msgs = ((InternalEObject)newTextSizeAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE, null, msgs);
      msgs = basicSetTextSizeAttribute(newTextSizeAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE, newTextSizeAttribute, newTextSizeAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutParams getLayoutParams()
  {
    return layoutParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayoutParams(LayoutParams newLayoutParams, NotificationChain msgs)
  {
    LayoutParams oldLayoutParams = layoutParams;
    layoutParams = newLayoutParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS, oldLayoutParams, newLayoutParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutParams(LayoutParams newLayoutParams)
  {
    if (newLayoutParams != layoutParams)
    {
      NotificationChain msgs = null;
      if (layoutParams != null)
        msgs = ((InternalEObject)layoutParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS, null, msgs);
      if (newLayoutParams != null)
        msgs = ((InternalEObject)newLayoutParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS, null, msgs);
      msgs = basicSetLayoutParams(newLayoutParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS, newLayoutParams, newLayoutParams));
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
      case AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE:
        return basicSetGravityAttribute(null, msgs);
      case AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE:
        return basicSetTextSizeAttribute(null, msgs);
      case AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS:
        return basicSetLayoutParams(null, msgs);
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
      case AndroTextDslPackage.TEXT_VIEW__TEXT:
        return getText();
      case AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE:
        return getGravityAttribute();
      case AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE:
        return getTextSizeAttribute();
      case AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS:
        return getLayoutParams();
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
      case AndroTextDslPackage.TEXT_VIEW__TEXT:
        setText((String)newValue);
        return;
      case AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE:
        setGravityAttribute((GravityAttribute)newValue);
        return;
      case AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE:
        setTextSizeAttribute((TextSizeAttribute)newValue);
        return;
      case AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS:
        setLayoutParams((LayoutParams)newValue);
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
      case AndroTextDslPackage.TEXT_VIEW__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE:
        setGravityAttribute((GravityAttribute)null);
        return;
      case AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE:
        setTextSizeAttribute((TextSizeAttribute)null);
        return;
      case AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS:
        setLayoutParams((LayoutParams)null);
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
      case AndroTextDslPackage.TEXT_VIEW__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case AndroTextDslPackage.TEXT_VIEW__GRAVITY_ATTRIBUTE:
        return gravityAttribute != null;
      case AndroTextDslPackage.TEXT_VIEW__TEXT_SIZE_ATTRIBUTE:
        return textSizeAttribute != null;
      case AndroTextDslPackage.TEXT_VIEW__LAYOUT_PARAMS:
        return layoutParams != null;
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
    result.append(" (text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //TextViewImpl
