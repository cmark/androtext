/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation By Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RotationByModifier#getDuration <em>Duration</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RotationByModifier#getBy <em>By</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRotationByModifier()
 * @model
 * @generated
 */
public interface RotationByModifier extends EntityModifier
{
  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRotationByModifier_Duration()
   * @model
   * @generated
   */
  float getDuration();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RotationByModifier#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(float value);

  /**
   * Returns the value of the '<em><b>By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By</em>' containment reference.
   * @see #setBy(BySingle)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRotationByModifier_By()
   * @model containment="true"
   * @generated
   */
  BySingle getBy();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RotationByModifier#getBy <em>By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By</em>' containment reference.
   * @see #getBy()
   * @generated
   */
  void setBy(BySingle value);

} // RotationByModifier
