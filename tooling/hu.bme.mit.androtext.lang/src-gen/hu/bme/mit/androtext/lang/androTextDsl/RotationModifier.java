/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RotationModifier#getDuration <em>Duration</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RotationModifier#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RotationModifier#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRotationModifier()
 * @model
 * @generated
 */
public interface RotationModifier extends EntityModifier
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
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRotationModifier_Duration()
   * @model
   * @generated
   */
  float getDuration();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RotationModifier#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(float value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(FromSingle)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRotationModifier_From()
   * @model containment="true"
   * @generated
   */
  FromSingle getFrom();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RotationModifier#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(FromSingle value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(ToSingle)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRotationModifier_To()
   * @model containment="true"
   * @generated
   */
  ToSingle getTo();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RotationModifier#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(ToSingle value);

} // RotationModifier
