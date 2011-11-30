/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ImageView;
import hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl#getWidthAttribute <em>Width Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl#getHeightAttribute <em>Height Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl#getBackgroundAttribute <em>Background Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl#getClickableAttribute <em>Clickable Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl#getFadeScrollBarsAttribute <em>Fade Scroll Bars Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl#getIsScrollContainerAttribute <em>Is Scroll Container Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageViewImpl extends SimpleViewImpl implements ImageView
{
  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected AnyDrawablePropertyValue src;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageViewImpl()
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
    return AndroTextDslPackage.eINSTANCE.getImageView();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyDrawablePropertyValue getSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc(AnyDrawablePropertyValue newSrc, NotificationChain msgs)
  {
    AnyDrawablePropertyValue oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(AnyDrawablePropertyValue newSrc)
  {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__SRC, newSrc, newSrc));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE, oldWidthAttribute, newWidthAttribute);
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
        msgs = ((InternalEObject)widthAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE, null, msgs);
      if (newWidthAttribute != null)
        msgs = ((InternalEObject)newWidthAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE, null, msgs);
      msgs = basicSetWidthAttribute(newWidthAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE, newWidthAttribute, newWidthAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE, oldHeightAttribute, newHeightAttribute);
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
        msgs = ((InternalEObject)heightAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE, null, msgs);
      if (newHeightAttribute != null)
        msgs = ((InternalEObject)newHeightAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE, null, msgs);
      msgs = basicSetHeightAttribute(newHeightAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE, newHeightAttribute, newHeightAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE, oldBackgroundAttribute, newBackgroundAttribute);
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
        msgs = ((InternalEObject)backgroundAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE, null, msgs);
      if (newBackgroundAttribute != null)
        msgs = ((InternalEObject)newBackgroundAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE, null, msgs);
      msgs = basicSetBackgroundAttribute(newBackgroundAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE, newBackgroundAttribute, newBackgroundAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE, oldClickableAttribute, newClickableAttribute);
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
        msgs = ((InternalEObject)clickableAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE, null, msgs);
      if (newClickableAttribute != null)
        msgs = ((InternalEObject)newClickableAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE, null, msgs);
      msgs = basicSetClickableAttribute(newClickableAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE, newClickableAttribute, newClickableAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE, oldFadeScrollBarsAttribute, newFadeScrollBarsAttribute);
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
        msgs = ((InternalEObject)fadeScrollBarsAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE, null, msgs);
      if (newFadeScrollBarsAttribute != null)
        msgs = ((InternalEObject)newFadeScrollBarsAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE, null, msgs);
      msgs = basicSetFadeScrollBarsAttribute(newFadeScrollBarsAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE, newFadeScrollBarsAttribute, newFadeScrollBarsAttribute));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE, oldIsScrollContainerAttribute, newIsScrollContainerAttribute);
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
        msgs = ((InternalEObject)isScrollContainerAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE, null, msgs);
      if (newIsScrollContainerAttribute != null)
        msgs = ((InternalEObject)newIsScrollContainerAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE, null, msgs);
      msgs = basicSetIsScrollContainerAttribute(newIsScrollContainerAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE, newIsScrollContainerAttribute, newIsScrollContainerAttribute));
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
      case AndroTextDslPackage.IMAGE_VIEW__SRC:
        return basicSetSrc(null, msgs);
      case AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE:
        return basicSetWidthAttribute(null, msgs);
      case AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE:
        return basicSetHeightAttribute(null, msgs);
      case AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE:
        return basicSetBackgroundAttribute(null, msgs);
      case AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE:
        return basicSetClickableAttribute(null, msgs);
      case AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE:
        return basicSetFadeScrollBarsAttribute(null, msgs);
      case AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE:
        return basicSetIsScrollContainerAttribute(null, msgs);
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
      case AndroTextDslPackage.IMAGE_VIEW__SRC:
        return getSrc();
      case AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE:
        return getWidthAttribute();
      case AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE:
        return getHeightAttribute();
      case AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE:
        return getBackgroundAttribute();
      case AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE:
        return getClickableAttribute();
      case AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE:
        return getFadeScrollBarsAttribute();
      case AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE:
        return getIsScrollContainerAttribute();
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
      case AndroTextDslPackage.IMAGE_VIEW__SRC:
        setSrc((AnyDrawablePropertyValue)newValue);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE:
        setWidthAttribute((WidthAttribute)newValue);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE:
        setHeightAttribute((HeightAttribute)newValue);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)newValue);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE:
        setClickableAttribute((ClickableAttribute)newValue);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE:
        setFadeScrollBarsAttribute((FadeScrollBarsAttribute)newValue);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE:
        setIsScrollContainerAttribute((IsScrollContainerAttribute)newValue);
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
      case AndroTextDslPackage.IMAGE_VIEW__SRC:
        setSrc((AnyDrawablePropertyValue)null);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE:
        setWidthAttribute((WidthAttribute)null);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE:
        setHeightAttribute((HeightAttribute)null);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)null);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE:
        setClickableAttribute((ClickableAttribute)null);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE:
        setFadeScrollBarsAttribute((FadeScrollBarsAttribute)null);
        return;
      case AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE:
        setIsScrollContainerAttribute((IsScrollContainerAttribute)null);
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
      case AndroTextDslPackage.IMAGE_VIEW__SRC:
        return src != null;
      case AndroTextDslPackage.IMAGE_VIEW__WIDTH_ATTRIBUTE:
        return widthAttribute != null;
      case AndroTextDslPackage.IMAGE_VIEW__HEIGHT_ATTRIBUTE:
        return heightAttribute != null;
      case AndroTextDslPackage.IMAGE_VIEW__BACKGROUND_ATTRIBUTE:
        return backgroundAttribute != null;
      case AndroTextDslPackage.IMAGE_VIEW__CLICKABLE_ATTRIBUTE:
        return clickableAttribute != null;
      case AndroTextDslPackage.IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE:
        return fadeScrollBarsAttribute != null;
      case AndroTextDslPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE:
        return isScrollContainerAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //ImageViewImpl
