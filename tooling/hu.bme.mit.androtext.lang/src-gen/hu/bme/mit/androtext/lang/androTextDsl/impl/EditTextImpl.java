/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HintAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getWidthAttribute <em>Width Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getHeightAttribute <em>Height Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getBackgroundAttribute <em>Background Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getClickableAttribute <em>Clickable Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getFadeScrollBarsAttribute <em>Fade Scroll Bars Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getIsScrollContainerAttribute <em>Is Scroll Container Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getAutoLinkAttribute <em>Auto Link Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getAutoTextAttribute <em>Auto Text Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getCapitalizeAttribute <em>Capitalize Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getDigitsAttribute <em>Digits Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getEditableAttribute <em>Editable Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getHintAttribute <em>Hint Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getNumericAttribute <em>Numeric Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getPasswordAttribute <em>Password Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getPhoneNumberAttribute <em>Phone Number Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getSingleLineAttribute <em>Single Line Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getTextColorAttribute <em>Text Color Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getTypefaceAttribute <em>Typeface Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getTextStyleAttribute <em>Text Style Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getGravityAttribute <em>Gravity Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getTextSizeAttribute <em>Text Size Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl#getPaddingAttribute <em>Padding Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditTextImpl extends SimpleViewImpl implements EditText
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
   * The cached value of the '{@link #getFadeScrollBarsAttribute() <em>Fade Scroll Bars Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFadeScrollBarsAttribute()
   * @generated
   * @ordered
   */
  protected FadeScrollBarsAttribute fadeScrollBarsAttribute;

  /**
   * The cached value of the '{@link #getIsScrollContainerAttribute() <em>Is Scroll Container Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsScrollContainerAttribute()
   * @generated
   * @ordered
   */
  protected IsScrollContainerAttribute isScrollContainerAttribute;

  /**
   * The cached value of the '{@link #getAutoLinkAttribute() <em>Auto Link Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoLinkAttribute()
   * @generated
   * @ordered
   */
  protected AutoLinkAttribute autoLinkAttribute;

  /**
   * The cached value of the '{@link #getAutoTextAttribute() <em>Auto Text Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoTextAttribute()
   * @generated
   * @ordered
   */
  protected AutoTextAttribute autoTextAttribute;

  /**
   * The cached value of the '{@link #getCapitalizeAttribute() <em>Capitalize Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapitalizeAttribute()
   * @generated
   * @ordered
   */
  protected CapitalizeAttribute capitalizeAttribute;

  /**
   * The cached value of the '{@link #getDigitsAttribute() <em>Digits Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDigitsAttribute()
   * @generated
   * @ordered
   */
  protected DigitsAttribute digitsAttribute;

  /**
   * The cached value of the '{@link #getEditableAttribute() <em>Editable Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditableAttribute()
   * @generated
   * @ordered
   */
  protected EditableAttribute editableAttribute;

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
   * The cached value of the '{@link #getNumericAttribute() <em>Numeric Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericAttribute()
   * @generated
   * @ordered
   */
  protected NumericAttribute numericAttribute;

  /**
   * The cached value of the '{@link #getPasswordAttribute() <em>Password Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPasswordAttribute()
   * @generated
   * @ordered
   */
  protected PasswordAttribute passwordAttribute;

  /**
   * The cached value of the '{@link #getPhoneNumberAttribute() <em>Phone Number Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhoneNumberAttribute()
   * @generated
   * @ordered
   */
  protected PhoneNumberAttribute phoneNumberAttribute;

  /**
   * The cached value of the '{@link #getSingleLineAttribute() <em>Single Line Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleLineAttribute()
   * @generated
   * @ordered
   */
  protected SingleLineAttribute singleLineAttribute;

  /**
   * The cached value of the '{@link #getTextColorAttribute() <em>Text Color Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextColorAttribute()
   * @generated
   * @ordered
   */
  protected TextColorAttribute textColorAttribute;

  /**
   * The cached value of the '{@link #getTypefaceAttribute() <em>Typeface Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypefaceAttribute()
   * @generated
   * @ordered
   */
  protected TypefaceAttribute typefaceAttribute;

  /**
   * The cached value of the '{@link #getTextStyleAttribute() <em>Text Style Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextStyleAttribute()
   * @generated
   * @ordered
   */
  protected TextStyleAttribute textStyleAttribute;

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
   * The cached value of the '{@link #getPaddingAttribute() <em>Padding Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaddingAttribute()
   * @generated
   * @ordered
   */
  protected PaddingAttribute paddingAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditTextImpl()
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
    return AndroTextDslPackage.eINSTANCE.getEditText();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT, oldText, newText);
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
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT, newText, newText));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE, oldWidthAttribute, newWidthAttribute);
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
        msgs = ((InternalEObject)widthAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE, null, msgs);
      if (newWidthAttribute != null)
        msgs = ((InternalEObject)newWidthAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE, null, msgs);
      msgs = basicSetWidthAttribute(newWidthAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE, newWidthAttribute, newWidthAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE, oldHeightAttribute, newHeightAttribute);
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
        msgs = ((InternalEObject)heightAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE, null, msgs);
      if (newHeightAttribute != null)
        msgs = ((InternalEObject)newHeightAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE, null, msgs);
      msgs = basicSetHeightAttribute(newHeightAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE, newHeightAttribute, newHeightAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE, oldBackgroundAttribute, newBackgroundAttribute);
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
        msgs = ((InternalEObject)backgroundAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE, null, msgs);
      if (newBackgroundAttribute != null)
        msgs = ((InternalEObject)newBackgroundAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE, null, msgs);
      msgs = basicSetBackgroundAttribute(newBackgroundAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE, newBackgroundAttribute, newBackgroundAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE, oldClickableAttribute, newClickableAttribute);
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
        msgs = ((InternalEObject)clickableAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE, null, msgs);
      if (newClickableAttribute != null)
        msgs = ((InternalEObject)newClickableAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE, null, msgs);
      msgs = basicSetClickableAttribute(newClickableAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE, newClickableAttribute, newClickableAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FadeScrollBarsAttribute getFadeScrollBarsAttribute()
  {
    return fadeScrollBarsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFadeScrollBarsAttribute(FadeScrollBarsAttribute newFadeScrollBarsAttribute, NotificationChain msgs)
  {
    FadeScrollBarsAttribute oldFadeScrollBarsAttribute = fadeScrollBarsAttribute;
    fadeScrollBarsAttribute = newFadeScrollBarsAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE, oldFadeScrollBarsAttribute, newFadeScrollBarsAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFadeScrollBarsAttribute(FadeScrollBarsAttribute newFadeScrollBarsAttribute)
  {
    if (newFadeScrollBarsAttribute != fadeScrollBarsAttribute)
    {
      NotificationChain msgs = null;
      if (fadeScrollBarsAttribute != null)
        msgs = ((InternalEObject)fadeScrollBarsAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE, null, msgs);
      if (newFadeScrollBarsAttribute != null)
        msgs = ((InternalEObject)newFadeScrollBarsAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE, null, msgs);
      msgs = basicSetFadeScrollBarsAttribute(newFadeScrollBarsAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE, newFadeScrollBarsAttribute, newFadeScrollBarsAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsScrollContainerAttribute getIsScrollContainerAttribute()
  {
    return isScrollContainerAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsScrollContainerAttribute(IsScrollContainerAttribute newIsScrollContainerAttribute, NotificationChain msgs)
  {
    IsScrollContainerAttribute oldIsScrollContainerAttribute = isScrollContainerAttribute;
    isScrollContainerAttribute = newIsScrollContainerAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE, oldIsScrollContainerAttribute, newIsScrollContainerAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsScrollContainerAttribute(IsScrollContainerAttribute newIsScrollContainerAttribute)
  {
    if (newIsScrollContainerAttribute != isScrollContainerAttribute)
    {
      NotificationChain msgs = null;
      if (isScrollContainerAttribute != null)
        msgs = ((InternalEObject)isScrollContainerAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE, null, msgs);
      if (newIsScrollContainerAttribute != null)
        msgs = ((InternalEObject)newIsScrollContainerAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE, null, msgs);
      msgs = basicSetIsScrollContainerAttribute(newIsScrollContainerAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE, newIsScrollContainerAttribute, newIsScrollContainerAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoLinkAttribute getAutoLinkAttribute()
  {
    return autoLinkAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAutoLinkAttribute(AutoLinkAttribute newAutoLinkAttribute, NotificationChain msgs)
  {
    AutoLinkAttribute oldAutoLinkAttribute = autoLinkAttribute;
    autoLinkAttribute = newAutoLinkAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE, oldAutoLinkAttribute, newAutoLinkAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoLinkAttribute(AutoLinkAttribute newAutoLinkAttribute)
  {
    if (newAutoLinkAttribute != autoLinkAttribute)
    {
      NotificationChain msgs = null;
      if (autoLinkAttribute != null)
        msgs = ((InternalEObject)autoLinkAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE, null, msgs);
      if (newAutoLinkAttribute != null)
        msgs = ((InternalEObject)newAutoLinkAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE, null, msgs);
      msgs = basicSetAutoLinkAttribute(newAutoLinkAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE, newAutoLinkAttribute, newAutoLinkAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoTextAttribute getAutoTextAttribute()
  {
    return autoTextAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAutoTextAttribute(AutoTextAttribute newAutoTextAttribute, NotificationChain msgs)
  {
    AutoTextAttribute oldAutoTextAttribute = autoTextAttribute;
    autoTextAttribute = newAutoTextAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE, oldAutoTextAttribute, newAutoTextAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoTextAttribute(AutoTextAttribute newAutoTextAttribute)
  {
    if (newAutoTextAttribute != autoTextAttribute)
    {
      NotificationChain msgs = null;
      if (autoTextAttribute != null)
        msgs = ((InternalEObject)autoTextAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE, null, msgs);
      if (newAutoTextAttribute != null)
        msgs = ((InternalEObject)newAutoTextAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE, null, msgs);
      msgs = basicSetAutoTextAttribute(newAutoTextAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE, newAutoTextAttribute, newAutoTextAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapitalizeAttribute getCapitalizeAttribute()
  {
    return capitalizeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCapitalizeAttribute(CapitalizeAttribute newCapitalizeAttribute, NotificationChain msgs)
  {
    CapitalizeAttribute oldCapitalizeAttribute = capitalizeAttribute;
    capitalizeAttribute = newCapitalizeAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE, oldCapitalizeAttribute, newCapitalizeAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapitalizeAttribute(CapitalizeAttribute newCapitalizeAttribute)
  {
    if (newCapitalizeAttribute != capitalizeAttribute)
    {
      NotificationChain msgs = null;
      if (capitalizeAttribute != null)
        msgs = ((InternalEObject)capitalizeAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE, null, msgs);
      if (newCapitalizeAttribute != null)
        msgs = ((InternalEObject)newCapitalizeAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE, null, msgs);
      msgs = basicSetCapitalizeAttribute(newCapitalizeAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE, newCapitalizeAttribute, newCapitalizeAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DigitsAttribute getDigitsAttribute()
  {
    return digitsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDigitsAttribute(DigitsAttribute newDigitsAttribute, NotificationChain msgs)
  {
    DigitsAttribute oldDigitsAttribute = digitsAttribute;
    digitsAttribute = newDigitsAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE, oldDigitsAttribute, newDigitsAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDigitsAttribute(DigitsAttribute newDigitsAttribute)
  {
    if (newDigitsAttribute != digitsAttribute)
    {
      NotificationChain msgs = null;
      if (digitsAttribute != null)
        msgs = ((InternalEObject)digitsAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE, null, msgs);
      if (newDigitsAttribute != null)
        msgs = ((InternalEObject)newDigitsAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE, null, msgs);
      msgs = basicSetDigitsAttribute(newDigitsAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE, newDigitsAttribute, newDigitsAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditableAttribute getEditableAttribute()
  {
    return editableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEditableAttribute(EditableAttribute newEditableAttribute, NotificationChain msgs)
  {
    EditableAttribute oldEditableAttribute = editableAttribute;
    editableAttribute = newEditableAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE, oldEditableAttribute, newEditableAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditableAttribute(EditableAttribute newEditableAttribute)
  {
    if (newEditableAttribute != editableAttribute)
    {
      NotificationChain msgs = null;
      if (editableAttribute != null)
        msgs = ((InternalEObject)editableAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE, null, msgs);
      if (newEditableAttribute != null)
        msgs = ((InternalEObject)newEditableAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE, null, msgs);
      msgs = basicSetEditableAttribute(newEditableAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE, newEditableAttribute, newEditableAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE, oldHintAttribute, newHintAttribute);
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
        msgs = ((InternalEObject)hintAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE, null, msgs);
      if (newHintAttribute != null)
        msgs = ((InternalEObject)newHintAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE, null, msgs);
      msgs = basicSetHintAttribute(newHintAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE, newHintAttribute, newHintAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericAttribute getNumericAttribute()
  {
    return numericAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumericAttribute(NumericAttribute newNumericAttribute, NotificationChain msgs)
  {
    NumericAttribute oldNumericAttribute = numericAttribute;
    numericAttribute = newNumericAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE, oldNumericAttribute, newNumericAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumericAttribute(NumericAttribute newNumericAttribute)
  {
    if (newNumericAttribute != numericAttribute)
    {
      NotificationChain msgs = null;
      if (numericAttribute != null)
        msgs = ((InternalEObject)numericAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE, null, msgs);
      if (newNumericAttribute != null)
        msgs = ((InternalEObject)newNumericAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE, null, msgs);
      msgs = basicSetNumericAttribute(newNumericAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE, newNumericAttribute, newNumericAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PasswordAttribute getPasswordAttribute()
  {
    return passwordAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPasswordAttribute(PasswordAttribute newPasswordAttribute, NotificationChain msgs)
  {
    PasswordAttribute oldPasswordAttribute = passwordAttribute;
    passwordAttribute = newPasswordAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE, oldPasswordAttribute, newPasswordAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPasswordAttribute(PasswordAttribute newPasswordAttribute)
  {
    if (newPasswordAttribute != passwordAttribute)
    {
      NotificationChain msgs = null;
      if (passwordAttribute != null)
        msgs = ((InternalEObject)passwordAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE, null, msgs);
      if (newPasswordAttribute != null)
        msgs = ((InternalEObject)newPasswordAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE, null, msgs);
      msgs = basicSetPasswordAttribute(newPasswordAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE, newPasswordAttribute, newPasswordAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhoneNumberAttribute getPhoneNumberAttribute()
  {
    return phoneNumberAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPhoneNumberAttribute(PhoneNumberAttribute newPhoneNumberAttribute, NotificationChain msgs)
  {
    PhoneNumberAttribute oldPhoneNumberAttribute = phoneNumberAttribute;
    phoneNumberAttribute = newPhoneNumberAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE, oldPhoneNumberAttribute, newPhoneNumberAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPhoneNumberAttribute(PhoneNumberAttribute newPhoneNumberAttribute)
  {
    if (newPhoneNumberAttribute != phoneNumberAttribute)
    {
      NotificationChain msgs = null;
      if (phoneNumberAttribute != null)
        msgs = ((InternalEObject)phoneNumberAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE, null, msgs);
      if (newPhoneNumberAttribute != null)
        msgs = ((InternalEObject)newPhoneNumberAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE, null, msgs);
      msgs = basicSetPhoneNumberAttribute(newPhoneNumberAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE, newPhoneNumberAttribute, newPhoneNumberAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleLineAttribute getSingleLineAttribute()
  {
    return singleLineAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleLineAttribute(SingleLineAttribute newSingleLineAttribute, NotificationChain msgs)
  {
    SingleLineAttribute oldSingleLineAttribute = singleLineAttribute;
    singleLineAttribute = newSingleLineAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE, oldSingleLineAttribute, newSingleLineAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleLineAttribute(SingleLineAttribute newSingleLineAttribute)
  {
    if (newSingleLineAttribute != singleLineAttribute)
    {
      NotificationChain msgs = null;
      if (singleLineAttribute != null)
        msgs = ((InternalEObject)singleLineAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE, null, msgs);
      if (newSingleLineAttribute != null)
        msgs = ((InternalEObject)newSingleLineAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE, null, msgs);
      msgs = basicSetSingleLineAttribute(newSingleLineAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE, newSingleLineAttribute, newSingleLineAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextColorAttribute getTextColorAttribute()
  {
    return textColorAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextColorAttribute(TextColorAttribute newTextColorAttribute, NotificationChain msgs)
  {
    TextColorAttribute oldTextColorAttribute = textColorAttribute;
    textColorAttribute = newTextColorAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE, oldTextColorAttribute, newTextColorAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextColorAttribute(TextColorAttribute newTextColorAttribute)
  {
    if (newTextColorAttribute != textColorAttribute)
    {
      NotificationChain msgs = null;
      if (textColorAttribute != null)
        msgs = ((InternalEObject)textColorAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE, null, msgs);
      if (newTextColorAttribute != null)
        msgs = ((InternalEObject)newTextColorAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE, null, msgs);
      msgs = basicSetTextColorAttribute(newTextColorAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE, newTextColorAttribute, newTextColorAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypefaceAttribute getTypefaceAttribute()
  {
    return typefaceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypefaceAttribute(TypefaceAttribute newTypefaceAttribute, NotificationChain msgs)
  {
    TypefaceAttribute oldTypefaceAttribute = typefaceAttribute;
    typefaceAttribute = newTypefaceAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE, oldTypefaceAttribute, newTypefaceAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypefaceAttribute(TypefaceAttribute newTypefaceAttribute)
  {
    if (newTypefaceAttribute != typefaceAttribute)
    {
      NotificationChain msgs = null;
      if (typefaceAttribute != null)
        msgs = ((InternalEObject)typefaceAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE, null, msgs);
      if (newTypefaceAttribute != null)
        msgs = ((InternalEObject)newTypefaceAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE, null, msgs);
      msgs = basicSetTypefaceAttribute(newTypefaceAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE, newTypefaceAttribute, newTypefaceAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextStyleAttribute getTextStyleAttribute()
  {
    return textStyleAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextStyleAttribute(TextStyleAttribute newTextStyleAttribute, NotificationChain msgs)
  {
    TextStyleAttribute oldTextStyleAttribute = textStyleAttribute;
    textStyleAttribute = newTextStyleAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE, oldTextStyleAttribute, newTextStyleAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextStyleAttribute(TextStyleAttribute newTextStyleAttribute)
  {
    if (newTextStyleAttribute != textStyleAttribute)
    {
      NotificationChain msgs = null;
      if (textStyleAttribute != null)
        msgs = ((InternalEObject)textStyleAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE, null, msgs);
      if (newTextStyleAttribute != null)
        msgs = ((InternalEObject)newTextStyleAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE, null, msgs);
      msgs = basicSetTextStyleAttribute(newTextStyleAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE, newTextStyleAttribute, newTextStyleAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE, oldGravityAttribute, newGravityAttribute);
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
        msgs = ((InternalEObject)gravityAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE, null, msgs);
      if (newGravityAttribute != null)
        msgs = ((InternalEObject)newGravityAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE, null, msgs);
      msgs = basicSetGravityAttribute(newGravityAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE, newGravityAttribute, newGravityAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE, oldTextSizeAttribute, newTextSizeAttribute);
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
        msgs = ((InternalEObject)textSizeAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE, null, msgs);
      if (newTextSizeAttribute != null)
        msgs = ((InternalEObject)newTextSizeAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE, null, msgs);
      msgs = basicSetTextSizeAttribute(newTextSizeAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE, newTextSizeAttribute, newTextSizeAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PaddingAttribute getPaddingAttribute()
  {
    return paddingAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPaddingAttribute(PaddingAttribute newPaddingAttribute, NotificationChain msgs)
  {
    PaddingAttribute oldPaddingAttribute = paddingAttribute;
    paddingAttribute = newPaddingAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE, oldPaddingAttribute, newPaddingAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPaddingAttribute(PaddingAttribute newPaddingAttribute)
  {
    if (newPaddingAttribute != paddingAttribute)
    {
      NotificationChain msgs = null;
      if (paddingAttribute != null)
        msgs = ((InternalEObject)paddingAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE, null, msgs);
      if (newPaddingAttribute != null)
        msgs = ((InternalEObject)newPaddingAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE, null, msgs);
      msgs = basicSetPaddingAttribute(newPaddingAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE, newPaddingAttribute, newPaddingAttribute));
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
      case AndroTextDslPackage.EDIT_TEXT__TEXT:
        return basicSetText(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE:
        return basicSetWidthAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE:
        return basicSetHeightAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE:
        return basicSetBackgroundAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE:
        return basicSetClickableAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE:
        return basicSetFadeScrollBarsAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE:
        return basicSetIsScrollContainerAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE:
        return basicSetAutoLinkAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE:
        return basicSetAutoTextAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE:
        return basicSetCapitalizeAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE:
        return basicSetDigitsAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE:
        return basicSetEditableAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE:
        return basicSetHintAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE:
        return basicSetNumericAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE:
        return basicSetPasswordAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE:
        return basicSetPhoneNumberAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE:
        return basicSetSingleLineAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE:
        return basicSetTextColorAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE:
        return basicSetTypefaceAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE:
        return basicSetTextStyleAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE:
        return basicSetGravityAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE:
        return basicSetTextSizeAttribute(null, msgs);
      case AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE:
        return basicSetPaddingAttribute(null, msgs);
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
      case AndroTextDslPackage.EDIT_TEXT__TEXT:
        return getText();
      case AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE:
        return getWidthAttribute();
      case AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE:
        return getHeightAttribute();
      case AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE:
        return getBackgroundAttribute();
      case AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE:
        return getClickableAttribute();
      case AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE:
        return getFadeScrollBarsAttribute();
      case AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE:
        return getIsScrollContainerAttribute();
      case AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE:
        return getAutoLinkAttribute();
      case AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE:
        return getAutoTextAttribute();
      case AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE:
        return getCapitalizeAttribute();
      case AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE:
        return getDigitsAttribute();
      case AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE:
        return getEditableAttribute();
      case AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE:
        return getHintAttribute();
      case AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE:
        return getNumericAttribute();
      case AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE:
        return getPasswordAttribute();
      case AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE:
        return getPhoneNumberAttribute();
      case AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE:
        return getSingleLineAttribute();
      case AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE:
        return getTextColorAttribute();
      case AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE:
        return getTypefaceAttribute();
      case AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE:
        return getTextStyleAttribute();
      case AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE:
        return getGravityAttribute();
      case AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE:
        return getTextSizeAttribute();
      case AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE:
        return getPaddingAttribute();
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
      case AndroTextDslPackage.EDIT_TEXT__TEXT:
        setText((StringPropertyValue)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE:
        setWidthAttribute((WidthAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE:
        setHeightAttribute((HeightAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE:
        setClickableAttribute((ClickableAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE:
        setFadeScrollBarsAttribute((FadeScrollBarsAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE:
        setIsScrollContainerAttribute((IsScrollContainerAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE:
        setAutoLinkAttribute((AutoLinkAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE:
        setAutoTextAttribute((AutoTextAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE:
        setCapitalizeAttribute((CapitalizeAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE:
        setDigitsAttribute((DigitsAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE:
        setEditableAttribute((EditableAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE:
        setHintAttribute((HintAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE:
        setNumericAttribute((NumericAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE:
        setPasswordAttribute((PasswordAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE:
        setPhoneNumberAttribute((PhoneNumberAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE:
        setSingleLineAttribute((SingleLineAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE:
        setTextColorAttribute((TextColorAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE:
        setTypefaceAttribute((TypefaceAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE:
        setTextStyleAttribute((TextStyleAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE:
        setGravityAttribute((GravityAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE:
        setTextSizeAttribute((TextSizeAttribute)newValue);
        return;
      case AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE:
        setPaddingAttribute((PaddingAttribute)newValue);
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
      case AndroTextDslPackage.EDIT_TEXT__TEXT:
        setText((StringPropertyValue)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE:
        setWidthAttribute((WidthAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE:
        setHeightAttribute((HeightAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE:
        setClickableAttribute((ClickableAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE:
        setFadeScrollBarsAttribute((FadeScrollBarsAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE:
        setIsScrollContainerAttribute((IsScrollContainerAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE:
        setAutoLinkAttribute((AutoLinkAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE:
        setAutoTextAttribute((AutoTextAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE:
        setCapitalizeAttribute((CapitalizeAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE:
        setDigitsAttribute((DigitsAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE:
        setEditableAttribute((EditableAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE:
        setHintAttribute((HintAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE:
        setNumericAttribute((NumericAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE:
        setPasswordAttribute((PasswordAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE:
        setPhoneNumberAttribute((PhoneNumberAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE:
        setSingleLineAttribute((SingleLineAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE:
        setTextColorAttribute((TextColorAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE:
        setTypefaceAttribute((TypefaceAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE:
        setTextStyleAttribute((TextStyleAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE:
        setGravityAttribute((GravityAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE:
        setTextSizeAttribute((TextSizeAttribute)null);
        return;
      case AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE:
        setPaddingAttribute((PaddingAttribute)null);
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
      case AndroTextDslPackage.EDIT_TEXT__TEXT:
        return text != null;
      case AndroTextDslPackage.EDIT_TEXT__WIDTH_ATTRIBUTE:
        return widthAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__HEIGHT_ATTRIBUTE:
        return heightAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__BACKGROUND_ATTRIBUTE:
        return backgroundAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__CLICKABLE_ATTRIBUTE:
        return clickableAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE:
        return fadeScrollBarsAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE:
        return isScrollContainerAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__AUTO_LINK_ATTRIBUTE:
        return autoLinkAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__AUTO_TEXT_ATTRIBUTE:
        return autoTextAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__CAPITALIZE_ATTRIBUTE:
        return capitalizeAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__DIGITS_ATTRIBUTE:
        return digitsAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__EDITABLE_ATTRIBUTE:
        return editableAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__HINT_ATTRIBUTE:
        return hintAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__NUMERIC_ATTRIBUTE:
        return numericAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__PASSWORD_ATTRIBUTE:
        return passwordAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE:
        return phoneNumberAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__SINGLE_LINE_ATTRIBUTE:
        return singleLineAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_COLOR_ATTRIBUTE:
        return textColorAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__TYPEFACE_ATTRIBUTE:
        return typefaceAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_STYLE_ATTRIBUTE:
        return textStyleAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__GRAVITY_ATTRIBUTE:
        return gravityAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__TEXT_SIZE_ATTRIBUTE:
        return textSizeAttribute != null;
      case AndroTextDslPackage.EDIT_TEXT__PADDING_ATTRIBUTE:
        return paddingAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //EditTextImpl
