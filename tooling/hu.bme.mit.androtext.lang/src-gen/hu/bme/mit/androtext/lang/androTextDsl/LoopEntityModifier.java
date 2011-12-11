/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Entity Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LoopEntityModifier#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.LoopEntityModifier#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLoopEntityModifier()
 * @model
 * @generated
 */
public interface LoopEntityModifier extends EntityModifier
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.EntityModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLoopEntityModifier_Modifiers()
   * @model
   * @generated
   */
  EList<EntityModifier> getModifiers();

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(int)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLoopEntityModifier_Count()
   * @model
   * @generated
   */
  int getCount();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.LoopEntityModifier#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(int value);

} // LoopEntityModifier
