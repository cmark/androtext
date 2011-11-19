/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.Import;
import hu.bme.mit.androtext.lang.androTextDsl.ModelRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Andro Text Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextModelRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextModelRootImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextModelRootImpl#getActualModelRoot <em>Actual Model Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroTextModelRootImpl extends MinimalEObjectImpl.Container implements AndroTextModelRoot
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getActualModelRoot() <em>Actual Model Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualModelRoot()
   * @generated
   * @ordered
   */
  protected ModelRoot actualModelRoot;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroTextModelRootImpl()
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
    return AndroTextDslPackage.Literals.ANDRO_TEXT_MODEL_ROOT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelRoot getActualModelRoot()
  {
    return actualModelRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActualModelRoot(ModelRoot newActualModelRoot, NotificationChain msgs)
  {
    ModelRoot oldActualModelRoot = actualModelRoot;
    actualModelRoot = newActualModelRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT, oldActualModelRoot, newActualModelRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActualModelRoot(ModelRoot newActualModelRoot)
  {
    if (newActualModelRoot != actualModelRoot)
    {
      NotificationChain msgs = null;
      if (actualModelRoot != null)
        msgs = ((InternalEObject)actualModelRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT, null, msgs);
      if (newActualModelRoot != null)
        msgs = ((InternalEObject)newActualModelRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT, null, msgs);
      msgs = basicSetActualModelRoot(newActualModelRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT, newActualModelRoot, newActualModelRoot));
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
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT:
        return basicSetActualModelRoot(null, msgs);
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
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__NAME:
        return getName();
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__IMPORTS:
        return getImports();
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT:
        return getActualModelRoot();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__NAME:
        setName((String)newValue);
        return;
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT:
        setActualModelRoot((ModelRoot)newValue);
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
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__IMPORTS:
        getImports().clear();
        return;
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT:
        setActualModelRoot((ModelRoot)null);
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
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT:
        return actualModelRoot != null;
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

} //AndroTextModelRootImpl
