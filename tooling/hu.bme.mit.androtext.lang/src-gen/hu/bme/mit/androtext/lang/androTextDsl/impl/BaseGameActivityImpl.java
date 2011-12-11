/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;
import hu.bme.mit.androtext.lang.androTextDsl.ScreenOrientation;
import hu.bme.mit.androtext.lang.androTextDsl.Size;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Game Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BaseGameActivityImpl#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BaseGameActivityImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BaseGameActivityImpl#getScene <em>Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseGameActivityImpl extends ActivityImpl implements BaseGameActivity
{
  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected Size size;

  /**
   * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected static final ScreenOrientation ORIENTATION_EDEFAULT = ScreenOrientation.LANDSCAPE;

  /**
   * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected ScreenOrientation orientation = ORIENTATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getScene() <em>Scene</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScene()
   * @generated
   * @ordered
   */
  protected Scene scene;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseGameActivityImpl()
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
    return AndroTextDslPackage.eINSTANCE.getBaseGameActivity();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(Size newSize, NotificationChain msgs)
  {
    Size oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(Size newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenOrientation getOrientation()
  {
    return orientation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrientation(ScreenOrientation newOrientation)
  {
    ScreenOrientation oldOrientation = orientation;
    orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BASE_GAME_ACTIVITY__ORIENTATION, oldOrientation, orientation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene getScene()
  {
    if (scene != null && scene.eIsProxy())
    {
      InternalEObject oldScene = (InternalEObject)scene;
      scene = (Scene)eResolveProxy(oldScene);
      if (scene != oldScene)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroTextDslPackage.BASE_GAME_ACTIVITY__SCENE, oldScene, scene));
      }
    }
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene basicGetScene()
  {
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScene(Scene newScene)
  {
    Scene oldScene = scene;
    scene = newScene;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.BASE_GAME_ACTIVITY__SCENE, oldScene, scene));
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
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE:
        return basicSetSize(null, msgs);
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
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE:
        return getSize();
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__ORIENTATION:
        return getOrientation();
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SCENE:
        if (resolve) return getScene();
        return basicGetScene();
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
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE:
        setSize((Size)newValue);
        return;
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__ORIENTATION:
        setOrientation((ScreenOrientation)newValue);
        return;
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SCENE:
        setScene((Scene)newValue);
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
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE:
        setSize((Size)null);
        return;
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__ORIENTATION:
        setOrientation(ORIENTATION_EDEFAULT);
        return;
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SCENE:
        setScene((Scene)null);
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
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SIZE:
        return size != null;
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__ORIENTATION:
        return orientation != ORIENTATION_EDEFAULT;
      case AndroTextDslPackage.BASE_GAME_ACTIVITY__SCENE:
        return scene != null;
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
    result.append(" (orientation: ");
    result.append(orientation);
    result.append(')');
    return result.toString();
  }

} //BaseGameActivityImpl
