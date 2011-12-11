/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.MenuScene#getMenuItems <em>Menu Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMenuScene()
 * @model
 * @generated
 */
public interface MenuScene extends Scene
{
  /**
   * Returns the value of the '<em><b>Menu Items</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menu Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menu Items</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getMenuScene_MenuItems()
   * @model containment="true"
   * @generated
   */
  EList<GameMenuItem> getMenuItems();

} // MenuScene
