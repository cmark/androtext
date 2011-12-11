/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.Font;
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalAlign;
import hu.bme.mit.androtext.lang.androTextDsl.Position;
import hu.bme.mit.androtext.lang.androTextDsl.Text;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextImpl#getText <em>Text</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextImpl#getFont <em>Font</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextImpl#getHalign <em>Halign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends GameEntityImpl implements Text
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
   * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Position position;

  /**
   * The cached value of the '{@link #getFont() <em>Font</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected Font font;

  /**
   * The default value of the '{@link #getHalign() <em>Halign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHalign()
   * @generated
   * @ordered
   */
  protected static final HorizontalAlign HALIGN_EDEFAULT = HorizontalAlign.LEFT;

  /**
   * The cached value of the '{@link #getHalign() <em>Halign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHalign()
   * @generated
   * @ordered
   */
  protected HorizontalAlign halign = HALIGN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextImpl()
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
    return AndroTextDslPackage.eINSTANCE.getText();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs)
  {
    Position oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT__POSITION, oldPosition, newPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Position newPosition)
  {
    if (newPosition != position)
    {
      NotificationChain msgs = null;
      if (position != null)
        msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT__POSITION, null, msgs);
      if (newPosition != null)
        msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.TEXT__POSITION, null, msgs);
      msgs = basicSetPosition(newPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT__POSITION, newPosition, newPosition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font getFont()
  {
    if (font != null && font.eIsProxy())
    {
      InternalEObject oldFont = (InternalEObject)font;
      font = (Font)eResolveProxy(oldFont);
      if (font != oldFont)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.TEXT__FONT, oldFont, font));
      }
    }
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font basicGetFont()
  {
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFont(Font newFont)
  {
    Font oldFont = font;
    font = newFont;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT__FONT, oldFont, font));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalAlign getHalign()
  {
    return halign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHalign(HorizontalAlign newHalign)
  {
    HorizontalAlign oldHalign = halign;
    halign = newHalign == null ? HALIGN_EDEFAULT : newHalign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.TEXT__HALIGN, oldHalign, halign));
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
      case AndroTextDslPackage.TEXT__POSITION:
        return basicSetPosition(null, msgs);
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
      case AndroTextDslPackage.TEXT__TEXT:
        return getText();
      case AndroTextDslPackage.TEXT__POSITION:
        return getPosition();
      case AndroTextDslPackage.TEXT__FONT:
        if (resolve) return getFont();
        return basicGetFont();
      case AndroTextDslPackage.TEXT__HALIGN:
        return getHalign();
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
      case AndroTextDslPackage.TEXT__TEXT:
        setText((String)newValue);
        return;
      case AndroTextDslPackage.TEXT__POSITION:
        setPosition((Position)newValue);
        return;
      case AndroTextDslPackage.TEXT__FONT:
        setFont((Font)newValue);
        return;
      case AndroTextDslPackage.TEXT__HALIGN:
        setHalign((HorizontalAlign)newValue);
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
      case AndroTextDslPackage.TEXT__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case AndroTextDslPackage.TEXT__POSITION:
        setPosition((Position)null);
        return;
      case AndroTextDslPackage.TEXT__FONT:
        setFont((Font)null);
        return;
      case AndroTextDslPackage.TEXT__HALIGN:
        setHalign(HALIGN_EDEFAULT);
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
      case AndroTextDslPackage.TEXT__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case AndroTextDslPackage.TEXT__POSITION:
        return position != null;
      case AndroTextDslPackage.TEXT__FONT:
        return font != null;
      case AndroTextDslPackage.TEXT__HALIGN:
        return halign != HALIGN_EDEFAULT;
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
    result.append(", halign: ");
    result.append(halign);
    result.append(')');
    return result.toString();
  }

} //TextImpl
