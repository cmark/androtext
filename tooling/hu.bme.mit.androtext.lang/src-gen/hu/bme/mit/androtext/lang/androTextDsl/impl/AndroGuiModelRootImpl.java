/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties;
import hu.bme.mit.androtext.lang.androTextDsl.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Andro Gui Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGuiModelRootImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGuiModelRootImpl#getLayoutAttributes <em>Layout Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroGuiModelRootImpl extends ModelRootImpl implements AndroGuiModelRoot
{
  /**
   * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoots()
   * @generated
   * @ordered
   */
  protected EList<View> roots;

  /**
   * The cached value of the '{@link #getLayoutAttributes() <em>Layout Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutAttributes()
   * @generated
   * @ordered
   */
  protected EList<LayoutProperties> layoutAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroGuiModelRootImpl()
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
    return AndroTextDslPackage.eINSTANCE.getAndroGuiModelRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<View> getRoots()
  {
    if (roots == null)
    {
      roots = new EObjectContainmentEList<View>(View.class, this, AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__ROOTS);
    }
    return roots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LayoutProperties> getLayoutAttributes()
  {
    if (layoutAttributes == null)
    {
      layoutAttributes = new EObjectContainmentEList<LayoutProperties>(LayoutProperties.class, this, AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__LAYOUT_ATTRIBUTES);
    }
    return layoutAttributes;
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
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__ROOTS:
        return ((InternalEList<?>)getRoots()).basicRemove(otherEnd, msgs);
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__LAYOUT_ATTRIBUTES:
        return ((InternalEList<?>)getLayoutAttributes()).basicRemove(otherEnd, msgs);
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
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__ROOTS:
        return getRoots();
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__LAYOUT_ATTRIBUTES:
        return getLayoutAttributes();
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
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__ROOTS:
        getRoots().clear();
        getRoots().addAll((Collection<? extends View>)newValue);
        return;
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__LAYOUT_ATTRIBUTES:
        getLayoutAttributes().clear();
        getLayoutAttributes().addAll((Collection<? extends LayoutProperties>)newValue);
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
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__ROOTS:
        getRoots().clear();
        return;
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__LAYOUT_ATTRIBUTES:
        getLayoutAttributes().clear();
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
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__ROOTS:
        return roots != null && !roots.isEmpty();
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT__LAYOUT_ATTRIBUTES:
        return layoutAttributes != null && !layoutAttributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AndroGuiModelRootImpl
