/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Body#getBodyType <em>Body Type</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Body#getFixture <em>Fixture</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends Box2DComponent
{
  /**
   * Returns the value of the '<em><b>Body Type</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.BodyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BodyType
   * @see #setBodyType(BodyType)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBody_BodyType()
   * @model
   * @generated
   */
  BodyType getBodyType();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Body#getBodyType <em>Body Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body Type</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BodyType
   * @see #getBodyType()
   * @generated
   */
  void setBodyType(BodyType value);

  /**
   * Returns the value of the '<em><b>Fixture</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixture</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixture</em>' reference.
   * @see #setFixture(Fixture)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBody_Fixture()
   * @model
   * @generated
   */
  Fixture getFixture();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Body#getFixture <em>Fixture</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixture</em>' reference.
   * @see #getFixture()
   * @generated
   */
  void setFixture(Fixture value);

} // Body
