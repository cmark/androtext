/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.EntityModifier;
import hu.bme.mit.androtext.lang.androTextDsl.SequenceEntityModifier;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Entity Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SequenceEntityModifierImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceEntityModifierImpl extends EntityModifierImpl implements SequenceEntityModifier
{
  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<EntityModifier> modifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceEntityModifierImpl()
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
    return AndroTextDslPackage.eINSTANCE.getSequenceEntityModifier();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityModifier> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EObjectResolvingEList<EntityModifier>(EntityModifier.class, this, AndroTextDslPackage.SEQUENCE_ENTITY_MODIFIER__MODIFIERS);
    }
    return modifiers;
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
      case AndroTextDslPackage.SEQUENCE_ENTITY_MODIFIER__MODIFIERS:
        return getModifiers();
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
      case AndroTextDslPackage.SEQUENCE_ENTITY_MODIFIER__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends EntityModifier>)newValue);
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
      case AndroTextDslPackage.SEQUENCE_ENTITY_MODIFIER__MODIFIERS:
        getModifiers().clear();
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
      case AndroTextDslPackage.SEQUENCE_ENTITY_MODIFIER__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequenceEntityModifierImpl
