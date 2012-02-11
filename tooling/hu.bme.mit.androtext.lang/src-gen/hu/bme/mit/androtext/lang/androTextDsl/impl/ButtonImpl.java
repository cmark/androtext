/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HintAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.OnClickAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl#getWidthAttribute <em>Width Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl#getHeightAttribute <em>Height Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl#getBackgroundAttribute <em>Background Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl#getClickableAttribute <em>Clickable Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl#getHintAttribute <em>Hint Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl#getOnClickAttribute <em>On Click Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends SimpleViewImpl implements Button
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected StringPropertyValue text;

  /**
   * The cached value of the '{@link #getWidthAttribute() <em>Width Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthAttribute()
   * @generated
   * @ordered
   */
  protected WidthAttribute widthAttribute;

  /**
   * The cached value of the '{@link #getHeightAttribute() <em>Height Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeightAttribute()
   * @generated
   * @ordered
   */
  protected HeightAttribute heightAttribute;

  /**
   * The cached value of the '{@link #getBackgroundAttribute() <em>Background Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundAttribute()
   * @generated
   * @ordered
   */
  protected BackgroundAttribute backgroundAttribute;

  /**
   * The cached value of the '{@link #getClickableAttribute() <em>Clickable Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickableAttribute()
   * @generated
   * @ordered
   */
  protected ClickableAttribute clickableAttribute;

  /**
   * The cached value of the '{@link #getHintAttribute() <em>Hint Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHintAttribute()
   * @generated
   * @ordered
   */
  protected HintAttribute hintAttribute;

  /**
   * The cached value of the '{@link #getOnClickAttribute() <em>On Click Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnClickAttribute()
   * @generated
   * @ordered
   */
  protected OnClickAttribute onClickAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonImpl()
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
    return AndroTextDslPackage.eINSTANCE.getButton();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(StringPropertyValue newText, NotificationChain msgs)
  {
    StringPropertyValue oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(StringPropertyValue newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WidthAttribute getWidthAttribute()
  {
    return widthAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWidthAttribute(WidthAttribute newWidthAttribute, NotificationChain msgs)
  {
    WidthAttribute oldWidthAttribute = widthAttribute;
    widthAttribute = newWidthAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE, oldWidthAttribute, newWidthAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidthAttribute(WidthAttribute newWidthAttribute)
  {
    if (newWidthAttribute != widthAttribute)
    {
      NotificationChain msgs = null;
      if (widthAttribute != null)
        msgs = ((InternalEObject)widthAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE, null, msgs);
      if (newWidthAttribute != null)
        msgs = ((InternalEObject)newWidthAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE, null, msgs);
      msgs = basicSetWidthAttribute(newWidthAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE, newWidthAttribute, newWidthAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeightAttribute getHeightAttribute()
  {
    return heightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeightAttribute(HeightAttribute newHeightAttribute, NotificationChain msgs)
  {
    HeightAttribute oldHeightAttribute = heightAttribute;
    heightAttribute = newHeightAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE, oldHeightAttribute, newHeightAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeightAttribute(HeightAttribute newHeightAttribute)
  {
    if (newHeightAttribute != heightAttribute)
    {
      NotificationChain msgs = null;
      if (heightAttribute != null)
        msgs = ((InternalEObject)heightAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE, null, msgs);
      if (newHeightAttribute != null)
        msgs = ((InternalEObject)newHeightAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE, null, msgs);
      msgs = basicSetHeightAttribute(newHeightAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE, newHeightAttribute, newHeightAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BackgroundAttribute getBackgroundAttribute()
  {
    return backgroundAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackgroundAttribute(BackgroundAttribute newBackgroundAttribute, NotificationChain msgs)
  {
    BackgroundAttribute oldBackgroundAttribute = backgroundAttribute;
    backgroundAttribute = newBackgroundAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE, oldBackgroundAttribute, newBackgroundAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundAttribute(BackgroundAttribute newBackgroundAttribute)
  {
    if (newBackgroundAttribute != backgroundAttribute)
    {
      NotificationChain msgs = null;
      if (backgroundAttribute != null)
        msgs = ((InternalEObject)backgroundAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE, null, msgs);
      if (newBackgroundAttribute != null)
        msgs = ((InternalEObject)newBackgroundAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE, null, msgs);
      msgs = basicSetBackgroundAttribute(newBackgroundAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE, newBackgroundAttribute, newBackgroundAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickableAttribute getClickableAttribute()
  {
    return clickableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClickableAttribute(ClickableAttribute newClickableAttribute, NotificationChain msgs)
  {
    ClickableAttribute oldClickableAttribute = clickableAttribute;
    clickableAttribute = newClickableAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE, oldClickableAttribute, newClickableAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClickableAttribute(ClickableAttribute newClickableAttribute)
  {
    if (newClickableAttribute != clickableAttribute)
    {
      NotificationChain msgs = null;
      if (clickableAttribute != null)
        msgs = ((InternalEObject)clickableAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE, null, msgs);
      if (newClickableAttribute != null)
        msgs = ((InternalEObject)newClickableAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE, null, msgs);
      msgs = basicSetClickableAttribute(newClickableAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE, newClickableAttribute, newClickableAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HintAttribute getHintAttribute()
  {
    return hintAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHintAttribute(HintAttribute newHintAttribute, NotificationChain msgs)
  {
    HintAttribute oldHintAttribute = hintAttribute;
    hintAttribute = newHintAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE, oldHintAttribute, newHintAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHintAttribute(HintAttribute newHintAttribute)
  {
    if (newHintAttribute != hintAttribute)
    {
      NotificationChain msgs = null;
      if (hintAttribute != null)
        msgs = ((InternalEObject)hintAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE, null, msgs);
      if (newHintAttribute != null)
        msgs = ((InternalEObject)newHintAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE, null, msgs);
      msgs = basicSetHintAttribute(newHintAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE, newHintAttribute, newHintAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnClickAttribute getOnClickAttribute()
  {
    return onClickAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnClickAttribute(OnClickAttribute newOnClickAttribute, NotificationChain msgs)
  {
    OnClickAttribute oldOnClickAttribute = onClickAttribute;
    onClickAttribute = newOnClickAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE, oldOnClickAttribute, newOnClickAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnClickAttribute(OnClickAttribute newOnClickAttribute)
  {
    if (newOnClickAttribute != onClickAttribute)
    {
      NotificationChain msgs = null;
      if (onClickAttribute != null)
        msgs = ((InternalEObject)onClickAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE, null, msgs);
      if (newOnClickAttribute != null)
        msgs = ((InternalEObject)newOnClickAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE, null, msgs);
      msgs = basicSetOnClickAttribute(newOnClickAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE, newOnClickAttribute, newOnClickAttribute));
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
      case AndroTextDslPackage.BUTTON__TEXT:
        return basicSetText(null, msgs);
      case AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE:
        return basicSetWidthAttribute(null, msgs);
      case AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE:
        return basicSetHeightAttribute(null, msgs);
      case AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE:
        return basicSetBackgroundAttribute(null, msgs);
      case AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE:
        return basicSetClickableAttribute(null, msgs);
      case AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE:
        return basicSetHintAttribute(null, msgs);
      case AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE:
        return basicSetOnClickAttribute(null, msgs);
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
      case AndroTextDslPackage.BUTTON__TEXT:
        return getText();
      case AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE:
        return getWidthAttribute();
      case AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE:
        return getHeightAttribute();
      case AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE:
        return getBackgroundAttribute();
      case AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE:
        return getClickableAttribute();
      case AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE:
        return getHintAttribute();
      case AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE:
        return getOnClickAttribute();
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
      case AndroTextDslPackage.BUTTON__TEXT:
        setText((StringPropertyValue)newValue);
        return;
      case AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE:
        setWidthAttribute((WidthAttribute)newValue);
        return;
      case AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE:
        setHeightAttribute((HeightAttribute)newValue);
        return;
      case AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)newValue);
        return;
      case AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE:
        setClickableAttribute((ClickableAttribute)newValue);
        return;
      case AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE:
        setHintAttribute((HintAttribute)newValue);
        return;
      case AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE:
        setOnClickAttribute((OnClickAttribute)newValue);
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
      case AndroTextDslPackage.BUTTON__TEXT:
        setText((StringPropertyValue)null);
        return;
      case AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE:
        setWidthAttribute((WidthAttribute)null);
        return;
      case AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE:
        setHeightAttribute((HeightAttribute)null);
        return;
      case AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)null);
        return;
      case AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE:
        setClickableAttribute((ClickableAttribute)null);
        return;
      case AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE:
        setHintAttribute((HintAttribute)null);
        return;
      case AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE:
        setOnClickAttribute((OnClickAttribute)null);
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
      case AndroTextDslPackage.BUTTON__TEXT:
        return text != null;
      case AndroTextDslPackage.BUTTON__WIDTH_ATTRIBUTE:
        return widthAttribute != null;
      case AndroTextDslPackage.BUTTON__HEIGHT_ATTRIBUTE:
        return heightAttribute != null;
      case AndroTextDslPackage.BUTTON__BACKGROUND_ATTRIBUTE:
        return backgroundAttribute != null;
      case AndroTextDslPackage.BUTTON__CLICKABLE_ATTRIBUTE:
        return clickableAttribute != null;
      case AndroTextDslPackage.BUTTON__HINT_ATTRIBUTE:
        return hintAttribute != null;
      case AndroTextDslPackage.BUTTON__ON_CLICK_ATTRIBUTE:
        return onClickAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //ButtonImpl
