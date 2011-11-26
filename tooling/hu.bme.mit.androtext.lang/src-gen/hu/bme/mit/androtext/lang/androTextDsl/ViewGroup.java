/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.ViewGroup#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getViewGroup()
 * @model
 * @generated
 */
public interface ViewGroup extends View
{
  /**
   * Returns the value of the '<em><b>Views</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.View}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getViewGroup_Views()
   * @model containment="true"
   * @generated
   */
  EList<View> getViews();

} // ViewGroup
