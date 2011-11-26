/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getLayout <em>Layout</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSimpleActivity()
 * @model
 * @generated
 */
public interface SimpleActivity extends Activity
{
  /**
   * Returns the value of the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' reference.
   * @see #setLayout(ViewGroup)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSimpleActivity_Layout()
   * @model
   * @generated
   */
  ViewGroup getLayout();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getLayout <em>Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' reference.
   * @see #getLayout()
   * @generated
   */
  void setLayout(ViewGroup value);

  /**
   * Returns the value of the '<em><b>Theme</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Theme</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theme</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme
   * @see #setTheme(ActivityTheme)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getSimpleActivity_Theme()
   * @model
   * @generated
   */
  ActivityTheme getTheme();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getTheme <em>Theme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Theme</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme
   * @see #getTheme()
   * @generated
   */
  void setTheme(ActivityTheme value);

} // SimpleActivity
