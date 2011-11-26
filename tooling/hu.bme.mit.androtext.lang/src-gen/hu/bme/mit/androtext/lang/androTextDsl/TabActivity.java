/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.TabActivity#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTabActivity()
 * @model
 * @generated
 */
public interface TabActivity extends Activity
{
  /**
   * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.Tab}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tabs</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getTabActivity_Tabs()
   * @model containment="true"
   * @generated
   */
  EList<Tab> getTabs();

} // TabActivity
