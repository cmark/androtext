/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getDensity <em>Density</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getFriction <em>Friction</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getRestitution <em>Restitution</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFixture()
 * @model
 * @generated
 */
public interface Fixture extends LogicComponent
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFixture_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Density</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Density</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Density</em>' attribute.
   * @see #setDensity(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFixture_Density()
   * @model
   * @generated
   */
  float getDensity();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getDensity <em>Density</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Density</em>' attribute.
   * @see #getDensity()
   * @generated
   */
  void setDensity(float value);

  /**
   * Returns the value of the '<em><b>Friction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Friction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Friction</em>' attribute.
   * @see #setFriction(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFixture_Friction()
   * @model
   * @generated
   */
  float getFriction();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getFriction <em>Friction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Friction</em>' attribute.
   * @see #getFriction()
   * @generated
   */
  void setFriction(float value);

  /**
   * Returns the value of the '<em><b>Restitution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restitution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restitution</em>' attribute.
   * @see #setRestitution(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFixture_Restitution()
   * @model
   * @generated
   */
  float getRestitution();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Fixture#getRestitution <em>Restitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restitution</em>' attribute.
   * @see #getRestitution()
   * @generated
   */
  void setRestitution(float value);

} // Fixture
