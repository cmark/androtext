/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AboveAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties;
import hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.WeightAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getWeightAttribute <em>Weight Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getMarginLeftAttribute <em>Margin Left Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getMarginTopAttribute <em>Margin Top Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getMarginRightAttribute <em>Margin Right Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getMarginBottomAttribute <em>Margin Bottom Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAlignParentLeftAttribute <em>Align Parent Left Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAlignParentTopAttribute <em>Align Parent Top Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAlignParentRightAttribute <em>Align Parent Right Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAlignParentBottomAttribute <em>Align Parent Bottom Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAlignTopAttribute <em>Align Top Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAlignBottomAttribute <em>Align Bottom Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAlignLeftAttribute <em>Align Left Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getBelowAttribute <em>Below Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getAboveAttribute <em>Above Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getToLeftOfAttribute <em>To Left Of Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getToRightOfAttribute <em>To Right Of Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getCenterHorizontalAttribute <em>Center Horizontal Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getCenterInParentAttribute <em>Center In Parent Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getCenterVerticalAttribute <em>Center Vertical Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getColumnAttribute <em>Column Attribute</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl#getSpanAttribute <em>Span Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutPropertiesImpl extends MinimalEObjectImpl.Container implements LayoutProperties
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWeightAttribute() <em>Weight Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightAttribute()
   * @generated
   * @ordered
   */
  protected WeightAttribute weightAttribute;

  /**
   * The cached value of the '{@link #getMarginLeftAttribute() <em>Margin Left Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginLeftAttribute()
   * @generated
   * @ordered
   */
  protected MarginLeftAttribute marginLeftAttribute;

  /**
   * The cached value of the '{@link #getMarginTopAttribute() <em>Margin Top Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginTopAttribute()
   * @generated
   * @ordered
   */
  protected MarginTopAttribute marginTopAttribute;

  /**
   * The cached value of the '{@link #getMarginRightAttribute() <em>Margin Right Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginRightAttribute()
   * @generated
   * @ordered
   */
  protected MarginRightAttribute marginRightAttribute;

  /**
   * The cached value of the '{@link #getMarginBottomAttribute() <em>Margin Bottom Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginBottomAttribute()
   * @generated
   * @ordered
   */
  protected MarginBottomAttribute marginBottomAttribute;

  /**
   * The cached value of the '{@link #getAlignParentLeftAttribute() <em>Align Parent Left Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentLeftAttribute()
   * @generated
   * @ordered
   */
  protected AlignParentLeftAttribute alignParentLeftAttribute;

  /**
   * The cached value of the '{@link #getAlignParentTopAttribute() <em>Align Parent Top Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentTopAttribute()
   * @generated
   * @ordered
   */
  protected AlignParentTopAttribute alignParentTopAttribute;

  /**
   * The cached value of the '{@link #getAlignParentRightAttribute() <em>Align Parent Right Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentRightAttribute()
   * @generated
   * @ordered
   */
  protected AlignParentRightAttribute alignParentRightAttribute;

  /**
   * The cached value of the '{@link #getAlignParentBottomAttribute() <em>Align Parent Bottom Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignParentBottomAttribute()
   * @generated
   * @ordered
   */
  protected AlignParentBottomAttribute alignParentBottomAttribute;

  /**
   * The cached value of the '{@link #getAlignTopAttribute() <em>Align Top Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignTopAttribute()
   * @generated
   * @ordered
   */
  protected AlignTopAttribute alignTopAttribute;

  /**
   * The cached value of the '{@link #getAlignBottomAttribute() <em>Align Bottom Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignBottomAttribute()
   * @generated
   * @ordered
   */
  protected AlignBottomAttribute alignBottomAttribute;

  /**
   * The cached value of the '{@link #getAlignLeftAttribute() <em>Align Left Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignLeftAttribute()
   * @generated
   * @ordered
   */
  protected AlignLeftAttribute alignLeftAttribute;

  /**
   * The cached value of the '{@link #getBelowAttribute() <em>Below Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelowAttribute()
   * @generated
   * @ordered
   */
  protected BelowAttribute belowAttribute;

  /**
   * The cached value of the '{@link #getAboveAttribute() <em>Above Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAboveAttribute()
   * @generated
   * @ordered
   */
  protected AboveAttribute aboveAttribute;

  /**
   * The cached value of the '{@link #getToLeftOfAttribute() <em>To Left Of Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToLeftOfAttribute()
   * @generated
   * @ordered
   */
  protected ToLeftOfAttribute toLeftOfAttribute;

  /**
   * The cached value of the '{@link #getToRightOfAttribute() <em>To Right Of Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToRightOfAttribute()
   * @generated
   * @ordered
   */
  protected ToRightOfAttribute toRightOfAttribute;

  /**
   * The cached value of the '{@link #getCenterHorizontalAttribute() <em>Center Horizontal Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterHorizontalAttribute()
   * @generated
   * @ordered
   */
  protected CenterHorizontalAttribute centerHorizontalAttribute;

  /**
   * The cached value of the '{@link #getCenterInParentAttribute() <em>Center In Parent Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterInParentAttribute()
   * @generated
   * @ordered
   */
  protected CenterInParentAttribute centerInParentAttribute;

  /**
   * The cached value of the '{@link #getCenterVerticalAttribute() <em>Center Vertical Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterVerticalAttribute()
   * @generated
   * @ordered
   */
  protected CenterVerticalAttribute centerVerticalAttribute;

  /**
   * The cached value of the '{@link #getColumnAttribute() <em>Column Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnAttribute()
   * @generated
   * @ordered
   */
  protected ColumnAttribute columnAttribute;

  /**
   * The cached value of the '{@link #getSpanAttribute() <em>Span Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanAttribute()
   * @generated
   * @ordered
   */
  protected SpanAttribute spanAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayoutPropertiesImpl()
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
    return AndroTextDslPackage.eINSTANCE.getLayoutProperties();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeightAttribute getWeightAttribute()
  {
    return weightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeightAttribute(WeightAttribute newWeightAttribute, NotificationChain msgs)
  {
    WeightAttribute oldWeightAttribute = weightAttribute;
    weightAttribute = newWeightAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE, oldWeightAttribute, newWeightAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeightAttribute(WeightAttribute newWeightAttribute)
  {
    if (newWeightAttribute != weightAttribute)
    {
      NotificationChain msgs = null;
      if (weightAttribute != null)
        msgs = ((InternalEObject)weightAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE, null, msgs);
      if (newWeightAttribute != null)
        msgs = ((InternalEObject)newWeightAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE, null, msgs);
      msgs = basicSetWeightAttribute(newWeightAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE, newWeightAttribute, newWeightAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginLeftAttribute getMarginLeftAttribute()
  {
    return marginLeftAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginLeftAttribute(MarginLeftAttribute newMarginLeftAttribute, NotificationChain msgs)
  {
    MarginLeftAttribute oldMarginLeftAttribute = marginLeftAttribute;
    marginLeftAttribute = newMarginLeftAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE, oldMarginLeftAttribute, newMarginLeftAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginLeftAttribute(MarginLeftAttribute newMarginLeftAttribute)
  {
    if (newMarginLeftAttribute != marginLeftAttribute)
    {
      NotificationChain msgs = null;
      if (marginLeftAttribute != null)
        msgs = ((InternalEObject)marginLeftAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE, null, msgs);
      if (newMarginLeftAttribute != null)
        msgs = ((InternalEObject)newMarginLeftAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE, null, msgs);
      msgs = basicSetMarginLeftAttribute(newMarginLeftAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE, newMarginLeftAttribute, newMarginLeftAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginTopAttribute getMarginTopAttribute()
  {
    return marginTopAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginTopAttribute(MarginTopAttribute newMarginTopAttribute, NotificationChain msgs)
  {
    MarginTopAttribute oldMarginTopAttribute = marginTopAttribute;
    marginTopAttribute = newMarginTopAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE, oldMarginTopAttribute, newMarginTopAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginTopAttribute(MarginTopAttribute newMarginTopAttribute)
  {
    if (newMarginTopAttribute != marginTopAttribute)
    {
      NotificationChain msgs = null;
      if (marginTopAttribute != null)
        msgs = ((InternalEObject)marginTopAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE, null, msgs);
      if (newMarginTopAttribute != null)
        msgs = ((InternalEObject)newMarginTopAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE, null, msgs);
      msgs = basicSetMarginTopAttribute(newMarginTopAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE, newMarginTopAttribute, newMarginTopAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginRightAttribute getMarginRightAttribute()
  {
    return marginRightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginRightAttribute(MarginRightAttribute newMarginRightAttribute, NotificationChain msgs)
  {
    MarginRightAttribute oldMarginRightAttribute = marginRightAttribute;
    marginRightAttribute = newMarginRightAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE, oldMarginRightAttribute, newMarginRightAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginRightAttribute(MarginRightAttribute newMarginRightAttribute)
  {
    if (newMarginRightAttribute != marginRightAttribute)
    {
      NotificationChain msgs = null;
      if (marginRightAttribute != null)
        msgs = ((InternalEObject)marginRightAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE, null, msgs);
      if (newMarginRightAttribute != null)
        msgs = ((InternalEObject)newMarginRightAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE, null, msgs);
      msgs = basicSetMarginRightAttribute(newMarginRightAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE, newMarginRightAttribute, newMarginRightAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginBottomAttribute getMarginBottomAttribute()
  {
    return marginBottomAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarginBottomAttribute(MarginBottomAttribute newMarginBottomAttribute, NotificationChain msgs)
  {
    MarginBottomAttribute oldMarginBottomAttribute = marginBottomAttribute;
    marginBottomAttribute = newMarginBottomAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE, oldMarginBottomAttribute, newMarginBottomAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginBottomAttribute(MarginBottomAttribute newMarginBottomAttribute)
  {
    if (newMarginBottomAttribute != marginBottomAttribute)
    {
      NotificationChain msgs = null;
      if (marginBottomAttribute != null)
        msgs = ((InternalEObject)marginBottomAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE, null, msgs);
      if (newMarginBottomAttribute != null)
        msgs = ((InternalEObject)newMarginBottomAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE, null, msgs);
      msgs = basicSetMarginBottomAttribute(newMarginBottomAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE, newMarginBottomAttribute, newMarginBottomAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentLeftAttribute getAlignParentLeftAttribute()
  {
    return alignParentLeftAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentLeftAttribute(AlignParentLeftAttribute newAlignParentLeftAttribute, NotificationChain msgs)
  {
    AlignParentLeftAttribute oldAlignParentLeftAttribute = alignParentLeftAttribute;
    alignParentLeftAttribute = newAlignParentLeftAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE, oldAlignParentLeftAttribute, newAlignParentLeftAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentLeftAttribute(AlignParentLeftAttribute newAlignParentLeftAttribute)
  {
    if (newAlignParentLeftAttribute != alignParentLeftAttribute)
    {
      NotificationChain msgs = null;
      if (alignParentLeftAttribute != null)
        msgs = ((InternalEObject)alignParentLeftAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE, null, msgs);
      if (newAlignParentLeftAttribute != null)
        msgs = ((InternalEObject)newAlignParentLeftAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE, null, msgs);
      msgs = basicSetAlignParentLeftAttribute(newAlignParentLeftAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE, newAlignParentLeftAttribute, newAlignParentLeftAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentTopAttribute getAlignParentTopAttribute()
  {
    return alignParentTopAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentTopAttribute(AlignParentTopAttribute newAlignParentTopAttribute, NotificationChain msgs)
  {
    AlignParentTopAttribute oldAlignParentTopAttribute = alignParentTopAttribute;
    alignParentTopAttribute = newAlignParentTopAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE, oldAlignParentTopAttribute, newAlignParentTopAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentTopAttribute(AlignParentTopAttribute newAlignParentTopAttribute)
  {
    if (newAlignParentTopAttribute != alignParentTopAttribute)
    {
      NotificationChain msgs = null;
      if (alignParentTopAttribute != null)
        msgs = ((InternalEObject)alignParentTopAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE, null, msgs);
      if (newAlignParentTopAttribute != null)
        msgs = ((InternalEObject)newAlignParentTopAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE, null, msgs);
      msgs = basicSetAlignParentTopAttribute(newAlignParentTopAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE, newAlignParentTopAttribute, newAlignParentTopAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentRightAttribute getAlignParentRightAttribute()
  {
    return alignParentRightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentRightAttribute(AlignParentRightAttribute newAlignParentRightAttribute, NotificationChain msgs)
  {
    AlignParentRightAttribute oldAlignParentRightAttribute = alignParentRightAttribute;
    alignParentRightAttribute = newAlignParentRightAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE, oldAlignParentRightAttribute, newAlignParentRightAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentRightAttribute(AlignParentRightAttribute newAlignParentRightAttribute)
  {
    if (newAlignParentRightAttribute != alignParentRightAttribute)
    {
      NotificationChain msgs = null;
      if (alignParentRightAttribute != null)
        msgs = ((InternalEObject)alignParentRightAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE, null, msgs);
      if (newAlignParentRightAttribute != null)
        msgs = ((InternalEObject)newAlignParentRightAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE, null, msgs);
      msgs = basicSetAlignParentRightAttribute(newAlignParentRightAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE, newAlignParentRightAttribute, newAlignParentRightAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentBottomAttribute getAlignParentBottomAttribute()
  {
    return alignParentBottomAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignParentBottomAttribute(AlignParentBottomAttribute newAlignParentBottomAttribute, NotificationChain msgs)
  {
    AlignParentBottomAttribute oldAlignParentBottomAttribute = alignParentBottomAttribute;
    alignParentBottomAttribute = newAlignParentBottomAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE, oldAlignParentBottomAttribute, newAlignParentBottomAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignParentBottomAttribute(AlignParentBottomAttribute newAlignParentBottomAttribute)
  {
    if (newAlignParentBottomAttribute != alignParentBottomAttribute)
    {
      NotificationChain msgs = null;
      if (alignParentBottomAttribute != null)
        msgs = ((InternalEObject)alignParentBottomAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE, null, msgs);
      if (newAlignParentBottomAttribute != null)
        msgs = ((InternalEObject)newAlignParentBottomAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE, null, msgs);
      msgs = basicSetAlignParentBottomAttribute(newAlignParentBottomAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE, newAlignParentBottomAttribute, newAlignParentBottomAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignTopAttribute getAlignTopAttribute()
  {
    return alignTopAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignTopAttribute(AlignTopAttribute newAlignTopAttribute, NotificationChain msgs)
  {
    AlignTopAttribute oldAlignTopAttribute = alignTopAttribute;
    alignTopAttribute = newAlignTopAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE, oldAlignTopAttribute, newAlignTopAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignTopAttribute(AlignTopAttribute newAlignTopAttribute)
  {
    if (newAlignTopAttribute != alignTopAttribute)
    {
      NotificationChain msgs = null;
      if (alignTopAttribute != null)
        msgs = ((InternalEObject)alignTopAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE, null, msgs);
      if (newAlignTopAttribute != null)
        msgs = ((InternalEObject)newAlignTopAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE, null, msgs);
      msgs = basicSetAlignTopAttribute(newAlignTopAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE, newAlignTopAttribute, newAlignTopAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignBottomAttribute getAlignBottomAttribute()
  {
    return alignBottomAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignBottomAttribute(AlignBottomAttribute newAlignBottomAttribute, NotificationChain msgs)
  {
    AlignBottomAttribute oldAlignBottomAttribute = alignBottomAttribute;
    alignBottomAttribute = newAlignBottomAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE, oldAlignBottomAttribute, newAlignBottomAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignBottomAttribute(AlignBottomAttribute newAlignBottomAttribute)
  {
    if (newAlignBottomAttribute != alignBottomAttribute)
    {
      NotificationChain msgs = null;
      if (alignBottomAttribute != null)
        msgs = ((InternalEObject)alignBottomAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE, null, msgs);
      if (newAlignBottomAttribute != null)
        msgs = ((InternalEObject)newAlignBottomAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE, null, msgs);
      msgs = basicSetAlignBottomAttribute(newAlignBottomAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE, newAlignBottomAttribute, newAlignBottomAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignLeftAttribute getAlignLeftAttribute()
  {
    return alignLeftAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignLeftAttribute(AlignLeftAttribute newAlignLeftAttribute, NotificationChain msgs)
  {
    AlignLeftAttribute oldAlignLeftAttribute = alignLeftAttribute;
    alignLeftAttribute = newAlignLeftAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE, oldAlignLeftAttribute, newAlignLeftAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignLeftAttribute(AlignLeftAttribute newAlignLeftAttribute)
  {
    if (newAlignLeftAttribute != alignLeftAttribute)
    {
      NotificationChain msgs = null;
      if (alignLeftAttribute != null)
        msgs = ((InternalEObject)alignLeftAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE, null, msgs);
      if (newAlignLeftAttribute != null)
        msgs = ((InternalEObject)newAlignLeftAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE, null, msgs);
      msgs = basicSetAlignLeftAttribute(newAlignLeftAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE, newAlignLeftAttribute, newAlignLeftAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BelowAttribute getBelowAttribute()
  {
    return belowAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBelowAttribute(BelowAttribute newBelowAttribute, NotificationChain msgs)
  {
    BelowAttribute oldBelowAttribute = belowAttribute;
    belowAttribute = newBelowAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE, oldBelowAttribute, newBelowAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBelowAttribute(BelowAttribute newBelowAttribute)
  {
    if (newBelowAttribute != belowAttribute)
    {
      NotificationChain msgs = null;
      if (belowAttribute != null)
        msgs = ((InternalEObject)belowAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE, null, msgs);
      if (newBelowAttribute != null)
        msgs = ((InternalEObject)newBelowAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE, null, msgs);
      msgs = basicSetBelowAttribute(newBelowAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE, newBelowAttribute, newBelowAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AboveAttribute getAboveAttribute()
  {
    return aboveAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAboveAttribute(AboveAttribute newAboveAttribute, NotificationChain msgs)
  {
    AboveAttribute oldAboveAttribute = aboveAttribute;
    aboveAttribute = newAboveAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE, oldAboveAttribute, newAboveAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAboveAttribute(AboveAttribute newAboveAttribute)
  {
    if (newAboveAttribute != aboveAttribute)
    {
      NotificationChain msgs = null;
      if (aboveAttribute != null)
        msgs = ((InternalEObject)aboveAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE, null, msgs);
      if (newAboveAttribute != null)
        msgs = ((InternalEObject)newAboveAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE, null, msgs);
      msgs = basicSetAboveAttribute(newAboveAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE, newAboveAttribute, newAboveAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToLeftOfAttribute getToLeftOfAttribute()
  {
    return toLeftOfAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToLeftOfAttribute(ToLeftOfAttribute newToLeftOfAttribute, NotificationChain msgs)
  {
    ToLeftOfAttribute oldToLeftOfAttribute = toLeftOfAttribute;
    toLeftOfAttribute = newToLeftOfAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE, oldToLeftOfAttribute, newToLeftOfAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToLeftOfAttribute(ToLeftOfAttribute newToLeftOfAttribute)
  {
    if (newToLeftOfAttribute != toLeftOfAttribute)
    {
      NotificationChain msgs = null;
      if (toLeftOfAttribute != null)
        msgs = ((InternalEObject)toLeftOfAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE, null, msgs);
      if (newToLeftOfAttribute != null)
        msgs = ((InternalEObject)newToLeftOfAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE, null, msgs);
      msgs = basicSetToLeftOfAttribute(newToLeftOfAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE, newToLeftOfAttribute, newToLeftOfAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToRightOfAttribute getToRightOfAttribute()
  {
    return toRightOfAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToRightOfAttribute(ToRightOfAttribute newToRightOfAttribute, NotificationChain msgs)
  {
    ToRightOfAttribute oldToRightOfAttribute = toRightOfAttribute;
    toRightOfAttribute = newToRightOfAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE, oldToRightOfAttribute, newToRightOfAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToRightOfAttribute(ToRightOfAttribute newToRightOfAttribute)
  {
    if (newToRightOfAttribute != toRightOfAttribute)
    {
      NotificationChain msgs = null;
      if (toRightOfAttribute != null)
        msgs = ((InternalEObject)toRightOfAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE, null, msgs);
      if (newToRightOfAttribute != null)
        msgs = ((InternalEObject)newToRightOfAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE, null, msgs);
      msgs = basicSetToRightOfAttribute(newToRightOfAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE, newToRightOfAttribute, newToRightOfAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterHorizontalAttribute getCenterHorizontalAttribute()
  {
    return centerHorizontalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterHorizontalAttribute(CenterHorizontalAttribute newCenterHorizontalAttribute, NotificationChain msgs)
  {
    CenterHorizontalAttribute oldCenterHorizontalAttribute = centerHorizontalAttribute;
    centerHorizontalAttribute = newCenterHorizontalAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE, oldCenterHorizontalAttribute, newCenterHorizontalAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterHorizontalAttribute(CenterHorizontalAttribute newCenterHorizontalAttribute)
  {
    if (newCenterHorizontalAttribute != centerHorizontalAttribute)
    {
      NotificationChain msgs = null;
      if (centerHorizontalAttribute != null)
        msgs = ((InternalEObject)centerHorizontalAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE, null, msgs);
      if (newCenterHorizontalAttribute != null)
        msgs = ((InternalEObject)newCenterHorizontalAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE, null, msgs);
      msgs = basicSetCenterHorizontalAttribute(newCenterHorizontalAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE, newCenterHorizontalAttribute, newCenterHorizontalAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterInParentAttribute getCenterInParentAttribute()
  {
    return centerInParentAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterInParentAttribute(CenterInParentAttribute newCenterInParentAttribute, NotificationChain msgs)
  {
    CenterInParentAttribute oldCenterInParentAttribute = centerInParentAttribute;
    centerInParentAttribute = newCenterInParentAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE, oldCenterInParentAttribute, newCenterInParentAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterInParentAttribute(CenterInParentAttribute newCenterInParentAttribute)
  {
    if (newCenterInParentAttribute != centerInParentAttribute)
    {
      NotificationChain msgs = null;
      if (centerInParentAttribute != null)
        msgs = ((InternalEObject)centerInParentAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE, null, msgs);
      if (newCenterInParentAttribute != null)
        msgs = ((InternalEObject)newCenterInParentAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE, null, msgs);
      msgs = basicSetCenterInParentAttribute(newCenterInParentAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE, newCenterInParentAttribute, newCenterInParentAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterVerticalAttribute getCenterVerticalAttribute()
  {
    return centerVerticalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenterVerticalAttribute(CenterVerticalAttribute newCenterVerticalAttribute, NotificationChain msgs)
  {
    CenterVerticalAttribute oldCenterVerticalAttribute = centerVerticalAttribute;
    centerVerticalAttribute = newCenterVerticalAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE, oldCenterVerticalAttribute, newCenterVerticalAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenterVerticalAttribute(CenterVerticalAttribute newCenterVerticalAttribute)
  {
    if (newCenterVerticalAttribute != centerVerticalAttribute)
    {
      NotificationChain msgs = null;
      if (centerVerticalAttribute != null)
        msgs = ((InternalEObject)centerVerticalAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE, null, msgs);
      if (newCenterVerticalAttribute != null)
        msgs = ((InternalEObject)newCenterVerticalAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE, null, msgs);
      msgs = basicSetCenterVerticalAttribute(newCenterVerticalAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE, newCenterVerticalAttribute, newCenterVerticalAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnAttribute getColumnAttribute()
  {
    return columnAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnAttribute(ColumnAttribute newColumnAttribute, NotificationChain msgs)
  {
    ColumnAttribute oldColumnAttribute = columnAttribute;
    columnAttribute = newColumnAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE, oldColumnAttribute, newColumnAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnAttribute(ColumnAttribute newColumnAttribute)
  {
    if (newColumnAttribute != columnAttribute)
    {
      NotificationChain msgs = null;
      if (columnAttribute != null)
        msgs = ((InternalEObject)columnAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE, null, msgs);
      if (newColumnAttribute != null)
        msgs = ((InternalEObject)newColumnAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE, null, msgs);
      msgs = basicSetColumnAttribute(newColumnAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE, newColumnAttribute, newColumnAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanAttribute getSpanAttribute()
  {
    return spanAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanAttribute(SpanAttribute newSpanAttribute, NotificationChain msgs)
  {
    SpanAttribute oldSpanAttribute = spanAttribute;
    spanAttribute = newSpanAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE, oldSpanAttribute, newSpanAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanAttribute(SpanAttribute newSpanAttribute)
  {
    if (newSpanAttribute != spanAttribute)
    {
      NotificationChain msgs = null;
      if (spanAttribute != null)
        msgs = ((InternalEObject)spanAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE, null, msgs);
      if (newSpanAttribute != null)
        msgs = ((InternalEObject)newSpanAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE, null, msgs);
      msgs = basicSetSpanAttribute(newSpanAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE, newSpanAttribute, newSpanAttribute));
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
      case AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE:
        return basicSetWeightAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE:
        return basicSetMarginLeftAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE:
        return basicSetMarginTopAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE:
        return basicSetMarginRightAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE:
        return basicSetMarginBottomAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE:
        return basicSetAlignParentLeftAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE:
        return basicSetAlignParentTopAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE:
        return basicSetAlignParentRightAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE:
        return basicSetAlignParentBottomAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE:
        return basicSetAlignTopAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE:
        return basicSetAlignBottomAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE:
        return basicSetAlignLeftAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE:
        return basicSetBelowAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE:
        return basicSetAboveAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE:
        return basicSetToLeftOfAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE:
        return basicSetToRightOfAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE:
        return basicSetCenterHorizontalAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE:
        return basicSetCenterInParentAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE:
        return basicSetCenterVerticalAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE:
        return basicSetColumnAttribute(null, msgs);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE:
        return basicSetSpanAttribute(null, msgs);
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
      case AndroTextDslPackage.LAYOUT_PROPERTIES__NAME:
        return getName();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE:
        return getWeightAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE:
        return getMarginLeftAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE:
        return getMarginTopAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE:
        return getMarginRightAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE:
        return getMarginBottomAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE:
        return getAlignParentLeftAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE:
        return getAlignParentTopAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE:
        return getAlignParentRightAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE:
        return getAlignParentBottomAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE:
        return getAlignTopAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE:
        return getAlignBottomAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE:
        return getAlignLeftAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE:
        return getBelowAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE:
        return getAboveAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE:
        return getToLeftOfAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE:
        return getToRightOfAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE:
        return getCenterHorizontalAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE:
        return getCenterInParentAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE:
        return getCenterVerticalAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE:
        return getColumnAttribute();
      case AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE:
        return getSpanAttribute();
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
      case AndroTextDslPackage.LAYOUT_PROPERTIES__NAME:
        setName((String)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE:
        setWeightAttribute((WeightAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE:
        setMarginLeftAttribute((MarginLeftAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE:
        setMarginTopAttribute((MarginTopAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE:
        setMarginRightAttribute((MarginRightAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE:
        setMarginBottomAttribute((MarginBottomAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE:
        setAlignParentLeftAttribute((AlignParentLeftAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE:
        setAlignParentTopAttribute((AlignParentTopAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE:
        setAlignParentRightAttribute((AlignParentRightAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE:
        setAlignParentBottomAttribute((AlignParentBottomAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE:
        setAlignTopAttribute((AlignTopAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE:
        setAlignBottomAttribute((AlignBottomAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE:
        setAlignLeftAttribute((AlignLeftAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE:
        setBelowAttribute((BelowAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE:
        setAboveAttribute((AboveAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE:
        setToLeftOfAttribute((ToLeftOfAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE:
        setToRightOfAttribute((ToRightOfAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE:
        setCenterHorizontalAttribute((CenterHorizontalAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE:
        setCenterInParentAttribute((CenterInParentAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE:
        setCenterVerticalAttribute((CenterVerticalAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE:
        setColumnAttribute((ColumnAttribute)newValue);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE:
        setSpanAttribute((SpanAttribute)newValue);
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
      case AndroTextDslPackage.LAYOUT_PROPERTIES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE:
        setWeightAttribute((WeightAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE:
        setMarginLeftAttribute((MarginLeftAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE:
        setMarginTopAttribute((MarginTopAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE:
        setMarginRightAttribute((MarginRightAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE:
        setMarginBottomAttribute((MarginBottomAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE:
        setAlignParentLeftAttribute((AlignParentLeftAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE:
        setAlignParentTopAttribute((AlignParentTopAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE:
        setAlignParentRightAttribute((AlignParentRightAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE:
        setAlignParentBottomAttribute((AlignParentBottomAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE:
        setAlignTopAttribute((AlignTopAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE:
        setAlignBottomAttribute((AlignBottomAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE:
        setAlignLeftAttribute((AlignLeftAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE:
        setBelowAttribute((BelowAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE:
        setAboveAttribute((AboveAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE:
        setToLeftOfAttribute((ToLeftOfAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE:
        setToRightOfAttribute((ToRightOfAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE:
        setCenterHorizontalAttribute((CenterHorizontalAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE:
        setCenterInParentAttribute((CenterInParentAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE:
        setCenterVerticalAttribute((CenterVerticalAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE:
        setColumnAttribute((ColumnAttribute)null);
        return;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE:
        setSpanAttribute((SpanAttribute)null);
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
      case AndroTextDslPackage.LAYOUT_PROPERTIES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroTextDslPackage.LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE:
        return weightAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE:
        return marginLeftAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE:
        return marginTopAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE:
        return marginRightAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE:
        return marginBottomAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE:
        return alignParentLeftAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE:
        return alignParentTopAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE:
        return alignParentRightAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE:
        return alignParentBottomAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE:
        return alignTopAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE:
        return alignBottomAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE:
        return alignLeftAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__BELOW_ATTRIBUTE:
        return belowAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE:
        return aboveAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE:
        return toLeftOfAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE:
        return toRightOfAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE:
        return centerHorizontalAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE:
        return centerInParentAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE:
        return centerVerticalAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE:
        return columnAttribute != null;
      case AndroTextDslPackage.LAYOUT_PROPERTIES__SPAN_ATTRIBUTE:
        return spanAttribute != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LayoutPropertiesImpl
