/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Game Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity#getScene <em>Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBaseGameActivity()
 * @model
 * @generated
 */
public interface BaseGameActivity extends Activity
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Size)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBaseGameActivity_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.ScreenOrientation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ScreenOrientation
   * @see #setOrientation(ScreenOrientation)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBaseGameActivity_Orientation()
   * @model
   * @generated
   */
  ScreenOrientation getOrientation();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity#getOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ScreenOrientation
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(ScreenOrientation value);

  /**
   * Returns the value of the '<em><b>Scene</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scene</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scene</em>' reference.
   * @see #setScene(Scene)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getBaseGameActivity_Scene()
   * @model
   * @generated
   */
  Scene getScene();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity#getScene <em>Scene</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scene</em>' reference.
   * @see #getScene()
   * @generated
   */
  void setScene(Scene value);

} // BaseGameActivity
