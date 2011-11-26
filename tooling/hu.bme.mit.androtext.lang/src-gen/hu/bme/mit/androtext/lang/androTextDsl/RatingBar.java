/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.RatingBar#getNumStars <em>Num Stars</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRatingBar()
 * @model
 * @generated
 */
public interface RatingBar extends SimpleView
{
  /**
   * Returns the value of the '<em><b>Num Stars</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Stars</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Stars</em>' attribute.
   * @see #setNumStars(int)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getRatingBar_NumStars()
   * @model
   * @generated
   */
  int getNumStars();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.RatingBar#getNumStars <em>Num Stars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Stars</em>' attribute.
   * @see #getNumStars()
   * @generated
   */
  void setNumStars(int value);

} // RatingBar
