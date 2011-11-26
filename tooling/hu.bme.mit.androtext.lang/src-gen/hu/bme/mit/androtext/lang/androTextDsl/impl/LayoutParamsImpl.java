/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutParams;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getTop <em>Top</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getRight <em>Right</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getBackgroundAttribute <em>Background Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutParamsImpl extends MinimalEObjectImpl.Container implements LayoutParams
{
  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected IntegerPropertyValue weight;

  /**
   * The cached value of the '{@link #getMarginLeft() <em>Margin Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginLeft()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginLeft;

  /**
   * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginTop()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginTop;

  /**
   * The cached value of the '{@link #getMarginRight() <em>Margin Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginRight()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginRight;

  /**
   * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginBottom()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue marginBottom;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue left;

  /**
   * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue top;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue right;

  /**
   * The cached value of the '{@link #getBottom() <em>Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottom()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue bottom;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayoutParamsImpl()
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
    return AndroTextDslPackage.Literals.LAYOUT_PARAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPropertyValue getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeight(IntegerPropertyValue newWeight, NotificationChain msgs)
  {
    IntegerPropertyValue oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT, oldWeight, newWeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(IntegerPropertyValue newWeight)
  {
    if (newWeight != weight)
    {
      NotificationChain msgs = null;
      if (weight != null)
        msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT, null, msgs);
      if (newWeight != null)
        msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT, null, msgs);
      msgs = basicSetWeight(newWeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT, newWeight, newWeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginLeft()
  {
    return marginLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginLeft(DimensionPropertyValue newMarginLeft, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginLeft = marginLeft;
    marginLeft = newMarginLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT, oldMarginLeft, newMarginLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginLeft(DimensionPropertyValue newMarginLeft)
  {
    if (newMarginLeft != marginLeft)
    {
      NotificationChain msgs = null;
      if (marginLeft != null)
        msgs = ((InternalEObject)marginLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT, null, msgs);
      if (newMarginLeft != null)
        msgs = ((InternalEObject)newMarginLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT, null, msgs);
      msgs = basicSetMarginLeft(newMarginLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT, newMarginLeft, newMarginLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginTop()
  {
    return marginTop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginTop(DimensionPropertyValue newMarginTop, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginTop = marginTop;
    marginTop = newMarginTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP, oldMarginTop, newMarginTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginTop(DimensionPropertyValue newMarginTop)
  {
    if (newMarginTop != marginTop)
    {
      NotificationChain msgs = null;
      if (marginTop != null)
        msgs = ((InternalEObject)marginTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP, null, msgs);
      if (newMarginTop != null)
        msgs = ((InternalEObject)newMarginTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP, null, msgs);
      msgs = basicSetMarginTop(newMarginTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP, newMarginTop, newMarginTop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginRight()
  {
    return marginRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginRight(DimensionPropertyValue newMarginRight, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginRight = marginRight;
    marginRight = newMarginRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT, oldMarginRight, newMarginRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginRight(DimensionPropertyValue newMarginRight)
  {
    if (newMarginRight != marginRight)
    {
      NotificationChain msgs = null;
      if (marginRight != null)
        msgs = ((InternalEObject)marginRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT, null, msgs);
      if (newMarginRight != null)
        msgs = ((InternalEObject)newMarginRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT, null, msgs);
      msgs = basicSetMarginRight(newMarginRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT, newMarginRight, newMarginRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getMarginBottom()
  {
    return marginBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginBottom(DimensionPropertyValue newMarginBottom, NotificationChain msgs)
  {
    DimensionPropertyValue oldMarginBottom = marginBottom;
    marginBottom = newMarginBottom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM, oldMarginBottom, newMarginBottom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginBottom(DimensionPropertyValue newMarginBottom)
  {
    if (newMarginBottom != marginBottom)
    {
      NotificationChain msgs = null;
      if (marginBottom != null)
        msgs = ((InternalEObject)marginBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM, null, msgs);
      if (newMarginBottom != null)
        msgs = ((InternalEObject)newMarginBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM, null, msgs);
      msgs = basicSetMarginBottom(newMarginBottom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM, newMarginBottom, newMarginBottom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(BooleanPropertyValue newLeft, NotificationChain msgs)
  {
    BooleanPropertyValue oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(BooleanPropertyValue newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTop(BooleanPropertyValue newTop, NotificationChain msgs)
  {
    BooleanPropertyValue oldTop = top;
    top = newTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__TOP, oldTop, newTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTop(BooleanPropertyValue newTop)
  {
    if (newTop != top)
    {
      NotificationChain msgs = null;
      if (top != null)
        msgs = ((InternalEObject)top).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__TOP, null, msgs);
      if (newTop != null)
        msgs = ((InternalEObject)newTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__TOP, null, msgs);
      msgs = basicSetTop(newTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__TOP, newTop, newTop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(BooleanPropertyValue newRight, NotificationChain msgs)
  {
    BooleanPropertyValue oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(BooleanPropertyValue newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getBottom()
  {
    return bottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBottom(BooleanPropertyValue newBottom, NotificationChain msgs)
  {
    BooleanPropertyValue oldBottom = bottom;
    bottom = newBottom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM, oldBottom, newBottom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBottom(BooleanPropertyValue newBottom)
  {
    if (newBottom != bottom)
    {
      NotificationChain msgs = null;
      if (bottom != null)
        msgs = ((InternalEObject)bottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM, null, msgs);
      if (newBottom != null)
        msgs = ((InternalEObject)newBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM, null, msgs);
      msgs = basicSetBottom(newBottom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM, newBottom, newBottom));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE, oldBackgroundAttribute, newBackgroundAttribute);
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
        msgs = ((InternalEObject)backgroundAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE, null, msgs);
      if (newBackgroundAttribute != null)
        msgs = ((InternalEObject)newBackgroundAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE, null, msgs);
      msgs = basicSetBackgroundAttribute(newBackgroundAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE, newBackgroundAttribute, newBackgroundAttribute));
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
      case AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT:
        return basicSetWeight(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT:
        return basicSetMarginLeft(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP:
        return basicSetMarginTop(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT:
        return basicSetMarginRight(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM:
        return basicSetMarginBottom(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__LEFT:
        return basicSetLeft(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__TOP:
        return basicSetTop(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__RIGHT:
        return basicSetRight(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM:
        return basicSetBottom(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE:
        return basicSetBackgroundAttribute(null, msgs);
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
      case AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT:
        return getWeight();
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT:
        return getMarginLeft();
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP:
        return getMarginTop();
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT:
        return getMarginRight();
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM:
        return getMarginBottom();
      case AndroTextDslPackage.LAYOUT_PARAMS__LEFT:
        return getLeft();
      case AndroTextDslPackage.LAYOUT_PARAMS__TOP:
        return getTop();
      case AndroTextDslPackage.LAYOUT_PARAMS__RIGHT:
        return getRight();
      case AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM:
        return getBottom();
      case AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE:
        return getBackgroundAttribute();
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
      case AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT:
        setWeight((IntegerPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT:
        setMarginLeft((DimensionPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP:
        setMarginTop((DimensionPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT:
        setMarginRight((DimensionPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM:
        setMarginBottom((DimensionPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__LEFT:
        setLeft((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__TOP:
        setTop((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__RIGHT:
        setRight((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM:
        setBottom((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)newValue);
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
      case AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT:
        setWeight((IntegerPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT:
        setMarginLeft((DimensionPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP:
        setMarginTop((DimensionPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT:
        setMarginRight((DimensionPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM:
        setMarginBottom((DimensionPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__LEFT:
        setLeft((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__TOP:
        setTop((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__RIGHT:
        setRight((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM:
        setBottom((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE:
        setBackgroundAttribute((BackgroundAttribute)null);
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
      case AndroTextDslPackage.LAYOUT_PARAMS__WEIGHT:
        return weight != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_LEFT:
        return marginLeft != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_TOP:
        return marginTop != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_RIGHT:
        return marginRight != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__MARGIN_BOTTOM:
        return marginBottom != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__LEFT:
        return left != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__TOP:
        return top != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__RIGHT:
        return right != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__BOTTOM:
        return bottom != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE:
        return backgroundAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //LayoutParamsImpl
