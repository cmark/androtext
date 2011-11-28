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
import hu.bme.mit.androtext.lang.androTextDsl.View;

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
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAlignParentLeft <em>Align Parent Left</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAlignParentTop <em>Align Parent Top</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAlignParentRight <em>Align Parent Right</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAlignParentBottom <em>Align Parent Bottom</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAlignTop <em>Align Top</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAlignBottom <em>Align Bottom</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAlignLeft <em>Align Left</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getBelow <em>Below</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getAbove <em>Above</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getToLeftOf <em>To Left Of</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getToRightOf <em>To Right Of</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getCenterHorizontal <em>Center Horizontal</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getCenterInParent <em>Center In Parent</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl#getCenterVertical <em>Center Vertical</em>}</li>
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
   * The cached value of the '{@link #getAlignParentLeft() <em>Align Parent Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentLeft()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentLeft;

  /**
   * The cached value of the '{@link #getAlignParentTop() <em>Align Parent Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentTop()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentTop;

  /**
   * The cached value of the '{@link #getAlignParentRight() <em>Align Parent Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentRight()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentRight;

  /**
   * The cached value of the '{@link #getAlignParentBottom() <em>Align Parent Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentBottom()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue alignParentBottom;

  /**
   * The cached value of the '{@link #getAlignTop() <em>Align Top</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignTop()
   * @generated
   * @ordered
   */
  protected View alignTop;

  /**
   * The cached value of the '{@link #getAlignBottom() <em>Align Bottom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignBottom()
   * @generated
   * @ordered
   */
  protected View alignBottom;

  /**
   * The cached value of the '{@link #getAlignLeft() <em>Align Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignLeft()
   * @generated
   * @ordered
   */
  protected View alignLeft;

  /**
   * The cached value of the '{@link #getBelow() <em>Below</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelow()
   * @generated
   * @ordered
   */
  protected View below;

  /**
   * The cached value of the '{@link #getAbove() <em>Above</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbove()
   * @generated
   * @ordered
   */
  protected View above;

  /**
   * The cached value of the '{@link #getToLeftOf() <em>To Left Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToLeftOf()
   * @generated
   * @ordered
   */
  protected View toLeftOf;

  /**
   * The cached value of the '{@link #getToRightOf() <em>To Right Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToRightOf()
   * @generated
   * @ordered
   */
  protected View toRightOf;

  /**
   * The cached value of the '{@link #getCenterHorizontal() <em>Center Horizontal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterHorizontal()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue centerHorizontal;

  /**
   * The cached value of the '{@link #getCenterInParent() <em>Center In Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterInParent()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue centerInParent;

  /**
   * The cached value of the '{@link #getCenterVertical() <em>Center Vertical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterVertical()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue centerVertical;

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
  public BooleanPropertyValue getAlignParentLeft()
  {
    return alignParentLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentLeft(BooleanPropertyValue newAlignParentLeft, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentLeft = alignParentLeft;
    alignParentLeft = newAlignParentLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT, oldAlignParentLeft, newAlignParentLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentLeft(BooleanPropertyValue newAlignParentLeft)
  {
    if (newAlignParentLeft != alignParentLeft)
    {
      NotificationChain msgs = null;
      if (alignParentLeft != null)
        msgs = ((InternalEObject)alignParentLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT, null, msgs);
      if (newAlignParentLeft != null)
        msgs = ((InternalEObject)newAlignParentLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT, null, msgs);
      msgs = basicSetAlignParentLeft(newAlignParentLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT, newAlignParentLeft, newAlignParentLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAlignParentTop()
  {
    return alignParentTop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentTop(BooleanPropertyValue newAlignParentTop, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentTop = alignParentTop;
    alignParentTop = newAlignParentTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP, oldAlignParentTop, newAlignParentTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentTop(BooleanPropertyValue newAlignParentTop)
  {
    if (newAlignParentTop != alignParentTop)
    {
      NotificationChain msgs = null;
      if (alignParentTop != null)
        msgs = ((InternalEObject)alignParentTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP, null, msgs);
      if (newAlignParentTop != null)
        msgs = ((InternalEObject)newAlignParentTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP, null, msgs);
      msgs = basicSetAlignParentTop(newAlignParentTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP, newAlignParentTop, newAlignParentTop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAlignParentRight()
  {
    return alignParentRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentRight(BooleanPropertyValue newAlignParentRight, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentRight = alignParentRight;
    alignParentRight = newAlignParentRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT, oldAlignParentRight, newAlignParentRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentRight(BooleanPropertyValue newAlignParentRight)
  {
    if (newAlignParentRight != alignParentRight)
    {
      NotificationChain msgs = null;
      if (alignParentRight != null)
        msgs = ((InternalEObject)alignParentRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT, null, msgs);
      if (newAlignParentRight != null)
        msgs = ((InternalEObject)newAlignParentRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT, null, msgs);
      msgs = basicSetAlignParentRight(newAlignParentRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT, newAlignParentRight, newAlignParentRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getAlignParentBottom()
  {
    return alignParentBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentBottom(BooleanPropertyValue newAlignParentBottom, NotificationChain msgs)
  {
    BooleanPropertyValue oldAlignParentBottom = alignParentBottom;
    alignParentBottom = newAlignParentBottom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM, oldAlignParentBottom, newAlignParentBottom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentBottom(BooleanPropertyValue newAlignParentBottom)
  {
    if (newAlignParentBottom != alignParentBottom)
    {
      NotificationChain msgs = null;
      if (alignParentBottom != null)
        msgs = ((InternalEObject)alignParentBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM, null, msgs);
      if (newAlignParentBottom != null)
        msgs = ((InternalEObject)newAlignParentBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM, null, msgs);
      msgs = basicSetAlignParentBottom(newAlignParentBottom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM, newAlignParentBottom, newAlignParentBottom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getAlignTop()
  {
    if (alignTop != null && alignTop.eIsProxy())
    {
      InternalEObject oldAlignTop = (InternalEObject)alignTop;
      alignTop = (View)eResolveProxy(oldAlignTop);
      if (alignTop != oldAlignTop)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_TOP, oldAlignTop, alignTop));
      }
    }
    return alignTop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetAlignTop()
  {
    return alignTop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignTop(View newAlignTop)
  {
    View oldAlignTop = alignTop;
    alignTop = newAlignTop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_TOP, oldAlignTop, alignTop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getAlignBottom()
  {
    if (alignBottom != null && alignBottom.eIsProxy())
    {
      InternalEObject oldAlignBottom = (InternalEObject)alignBottom;
      alignBottom = (View)eResolveProxy(oldAlignBottom);
      if (alignBottom != oldAlignBottom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_BOTTOM, oldAlignBottom, alignBottom));
      }
    }
    return alignBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetAlignBottom()
  {
    return alignBottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignBottom(View newAlignBottom)
  {
    View oldAlignBottom = alignBottom;
    alignBottom = newAlignBottom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_BOTTOM, oldAlignBottom, alignBottom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getAlignLeft()
  {
    if (alignLeft != null && alignLeft.eIsProxy())
    {
      InternalEObject oldAlignLeft = (InternalEObject)alignLeft;
      alignLeft = (View)eResolveProxy(oldAlignLeft);
      if (alignLeft != oldAlignLeft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_LEFT, oldAlignLeft, alignLeft));
      }
    }
    return alignLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetAlignLeft()
  {
    return alignLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignLeft(View newAlignLeft)
  {
    View oldAlignLeft = alignLeft;
    alignLeft = newAlignLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_LEFT, oldAlignLeft, alignLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getBelow()
  {
    if (below != null && below.eIsProxy())
    {
      InternalEObject oldBelow = (InternalEObject)below;
      below = (View)eResolveProxy(oldBelow);
      if (below != oldBelow)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LAYOUT_PARAMS__BELOW, oldBelow, below));
      }
    }
    return below;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetBelow()
  {
    return below;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBelow(View newBelow)
  {
    View oldBelow = below;
    below = newBelow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__BELOW, oldBelow, below));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getAbove()
  {
    if (above != null && above.eIsProxy())
    {
      InternalEObject oldAbove = (InternalEObject)above;
      above = (View)eResolveProxy(oldAbove);
      if (above != oldAbove)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LAYOUT_PARAMS__ABOVE, oldAbove, above));
      }
    }
    return above;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetAbove()
  {
    return above;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbove(View newAbove)
  {
    View oldAbove = above;
    above = newAbove;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__ABOVE, oldAbove, above));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getToLeftOf()
  {
    if (toLeftOf != null && toLeftOf.eIsProxy())
    {
      InternalEObject oldToLeftOf = (InternalEObject)toLeftOf;
      toLeftOf = (View)eResolveProxy(oldToLeftOf);
      if (toLeftOf != oldToLeftOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LAYOUT_PARAMS__TO_LEFT_OF, oldToLeftOf, toLeftOf));
      }
    }
    return toLeftOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetToLeftOf()
  {
    return toLeftOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToLeftOf(View newToLeftOf)
  {
    View oldToLeftOf = toLeftOf;
    toLeftOf = newToLeftOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__TO_LEFT_OF, oldToLeftOf, toLeftOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getToRightOf()
  {
    if (toRightOf != null && toRightOf.eIsProxy())
    {
      InternalEObject oldToRightOf = (InternalEObject)toRightOf;
      toRightOf = (View)eResolveProxy(oldToRightOf);
      if (toRightOf != oldToRightOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.LAYOUT_PARAMS__TO_RIGHT_OF, oldToRightOf, toRightOf));
      }
    }
    return toRightOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetToRightOf()
  {
    return toRightOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToRightOf(View newToRightOf)
  {
    View oldToRightOf = toRightOf;
    toRightOf = newToRightOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__TO_RIGHT_OF, oldToRightOf, toRightOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getCenterHorizontal()
  {
    return centerHorizontal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterHorizontal(BooleanPropertyValue newCenterHorizontal, NotificationChain msgs)
  {
    BooleanPropertyValue oldCenterHorizontal = centerHorizontal;
    centerHorizontal = newCenterHorizontal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL, oldCenterHorizontal, newCenterHorizontal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterHorizontal(BooleanPropertyValue newCenterHorizontal)
  {
    if (newCenterHorizontal != centerHorizontal)
    {
      NotificationChain msgs = null;
      if (centerHorizontal != null)
        msgs = ((InternalEObject)centerHorizontal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL, null, msgs);
      if (newCenterHorizontal != null)
        msgs = ((InternalEObject)newCenterHorizontal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL, null, msgs);
      msgs = basicSetCenterHorizontal(newCenterHorizontal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL, newCenterHorizontal, newCenterHorizontal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getCenterInParent()
  {
    return centerInParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterInParent(BooleanPropertyValue newCenterInParent, NotificationChain msgs)
  {
    BooleanPropertyValue oldCenterInParent = centerInParent;
    centerInParent = newCenterInParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT, oldCenterInParent, newCenterInParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterInParent(BooleanPropertyValue newCenterInParent)
  {
    if (newCenterInParent != centerInParent)
    {
      NotificationChain msgs = null;
      if (centerInParent != null)
        msgs = ((InternalEObject)centerInParent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT, null, msgs);
      if (newCenterInParent != null)
        msgs = ((InternalEObject)newCenterInParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT, null, msgs);
      msgs = basicSetCenterInParent(newCenterInParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT, newCenterInParent, newCenterInParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getCenterVertical()
  {
    return centerVertical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterVertical(BooleanPropertyValue newCenterVertical, NotificationChain msgs)
  {
    BooleanPropertyValue oldCenterVertical = centerVertical;
    centerVertical = newCenterVertical;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL, oldCenterVertical, newCenterVertical);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterVertical(BooleanPropertyValue newCenterVertical)
  {
    if (newCenterVertical != centerVertical)
    {
      NotificationChain msgs = null;
      if (centerVertical != null)
        msgs = ((InternalEObject)centerVertical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL, null, msgs);
      if (newCenterVertical != null)
        msgs = ((InternalEObject)newCenterVertical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL, null, msgs);
      msgs = basicSetCenterVertical(newCenterVertical, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL, newCenterVertical, newCenterVertical));
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
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT:
        return basicSetAlignParentLeft(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP:
        return basicSetAlignParentTop(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT:
        return basicSetAlignParentRight(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM:
        return basicSetAlignParentBottom(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL:
        return basicSetCenterHorizontal(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT:
        return basicSetCenterInParent(null, msgs);
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL:
        return basicSetCenterVertical(null, msgs);
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
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT:
        return getAlignParentLeft();
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP:
        return getAlignParentTop();
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT:
        return getAlignParentRight();
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM:
        return getAlignParentBottom();
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_TOP:
        if (resolve) return getAlignTop();
        return basicGetAlignTop();
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_BOTTOM:
        if (resolve) return getAlignBottom();
        return basicGetAlignBottom();
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_LEFT:
        if (resolve) return getAlignLeft();
        return basicGetAlignLeft();
      case AndroTextDslPackage.LAYOUT_PARAMS__BELOW:
        if (resolve) return getBelow();
        return basicGetBelow();
      case AndroTextDslPackage.LAYOUT_PARAMS__ABOVE:
        if (resolve) return getAbove();
        return basicGetAbove();
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_LEFT_OF:
        if (resolve) return getToLeftOf();
        return basicGetToLeftOf();
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_RIGHT_OF:
        if (resolve) return getToRightOf();
        return basicGetToRightOf();
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL:
        return getCenterHorizontal();
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT:
        return getCenterInParent();
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL:
        return getCenterVertical();
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
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT:
        setAlignParentLeft((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP:
        setAlignParentTop((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT:
        setAlignParentRight((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM:
        setAlignParentBottom((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_TOP:
        setAlignTop((View)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_BOTTOM:
        setAlignBottom((View)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_LEFT:
        setAlignLeft((View)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__BELOW:
        setBelow((View)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ABOVE:
        setAbove((View)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_LEFT_OF:
        setToLeftOf((View)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_RIGHT_OF:
        setToRightOf((View)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL:
        setCenterHorizontal((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT:
        setCenterInParent((BooleanPropertyValue)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL:
        setCenterVertical((BooleanPropertyValue)newValue);
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
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT:
        setAlignParentLeft((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP:
        setAlignParentTop((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT:
        setAlignParentRight((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM:
        setAlignParentBottom((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_TOP:
        setAlignTop((View)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_BOTTOM:
        setAlignBottom((View)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_LEFT:
        setAlignLeft((View)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__BELOW:
        setBelow((View)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__ABOVE:
        setAbove((View)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_LEFT_OF:
        setToLeftOf((View)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_RIGHT_OF:
        setToRightOf((View)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL:
        setCenterHorizontal((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT:
        setCenterInParent((BooleanPropertyValue)null);
        return;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL:
        setCenterVertical((BooleanPropertyValue)null);
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
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_LEFT:
        return alignParentLeft != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_TOP:
        return alignParentTop != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_RIGHT:
        return alignParentRight != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM:
        return alignParentBottom != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_TOP:
        return alignTop != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_BOTTOM:
        return alignBottom != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__ALIGN_LEFT:
        return alignLeft != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__BELOW:
        return below != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__ABOVE:
        return above != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_LEFT_OF:
        return toLeftOf != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__TO_RIGHT_OF:
        return toRightOf != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_HORIZONTAL:
        return centerHorizontal != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_IN_PARENT:
        return centerInParent != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__CENTER_VERTICAL:
        return centerVertical != null;
      case AndroTextDslPackage.LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE:
        return backgroundAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //LayoutParamsImpl
