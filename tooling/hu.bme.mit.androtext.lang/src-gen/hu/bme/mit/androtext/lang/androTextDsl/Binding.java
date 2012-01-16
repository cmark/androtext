/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Binding#getBindable <em>Bindable</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Binding#getBindingTarget <em>Binding Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends LogicComponent
{
  /**
   * Returns the value of the '<em><b>Bindable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindable</em>' reference.
   * @see #setBindable(Bindable)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBinding_Bindable()
   * @model
   * @generated
   */
  Bindable getBindable();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Binding#getBindable <em>Bindable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bindable</em>' reference.
   * @see #getBindable()
   * @generated
   */
  void setBindable(Bindable value);

  /**
   * Returns the value of the '<em><b>Binding Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding Target</em>' containment reference.
   * @see #setBindingTarget(BindingTarget)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBinding_BindingTarget()
   * @model containment="true"
   * @generated
   */
  BindingTarget getBindingTarget();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Binding#getBindingTarget <em>Binding Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding Target</em>' containment reference.
   * @see #getBindingTarget()
   * @generated
   */
  void setBindingTarget(BindingTarget value);

} // Binding
