/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RadioGroup#isOrientation <em>Orientation</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RadioGroup#getRadiobuttons <em>Radiobuttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRadioGroup()
 * @model
 * @generated
 */
public interface RadioGroup extends SimpleView
{
  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see #setOrientation(boolean)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRadioGroup_Orientation()
   * @model
   * @generated
   */
  boolean isOrientation();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioGroup#isOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see #isOrientation()
   * @generated
   */
  void setOrientation(boolean value);

  /**
   * Returns the value of the '<em><b>Radiobuttons</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radiobuttons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radiobuttons</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRadioGroup_Radiobuttons()
   * @model containment="true"
   * @generated
   */
  EList<RadioButton> getRadiobuttons();

} // RadioGroup
