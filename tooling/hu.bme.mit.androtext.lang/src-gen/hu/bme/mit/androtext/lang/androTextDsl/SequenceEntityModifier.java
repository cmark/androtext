/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Entity Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SequenceEntityModifier#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSequenceEntityModifier()
 * @model
 * @generated
 */
public interface SequenceEntityModifier extends EntityModifier
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSequenceEntityModifier_Modifiers()
   * @model
   * @generated
   */
  EList<EntityModifier> getModifiers();

} // SequenceEntityModifier
