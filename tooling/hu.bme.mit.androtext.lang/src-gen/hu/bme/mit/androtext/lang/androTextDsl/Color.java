/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getR <em>R</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getG <em>G</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getB <em>B</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getA <em>A</em>}</li>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getConstantColor <em>Constant Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject
{
  /**
   * Returns the value of the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' attribute.
   * @see #setR(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColor_R()
   * @model
   * @generated
   */
  float getR();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getR <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' attribute.
   * @see #getR()
   * @generated
   */
  void setR(float value);

  /**
   * Returns the value of the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>G</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>G</em>' attribute.
   * @see #setG(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColor_G()
   * @model
   * @generated
   */
  float getG();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getG <em>G</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>G</em>' attribute.
   * @see #getG()
   * @generated
   */
  void setG(float value);

  /**
   * Returns the value of the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' attribute.
   * @see #setB(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColor_B()
   * @model
   * @generated
   */
  float getB();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getB <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' attribute.
   * @see #getB()
   * @generated
   */
  void setB(float value);

  /**
   * Returns the value of the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' attribute.
   * @see #setA(float)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColor_A()
   * @model
   * @generated
   */
  float getA();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getA <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' attribute.
   * @see #getA()
   * @generated
   */
  void setA(float value);

  /**
   * Returns the value of the '<em><b>Constant Color</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.androtext.lang.androTextDsl.ConstantColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Color</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ConstantColor
   * @see #setConstantColor(ConstantColor)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getColor_ConstantColor()
   * @model
   * @generated
   */
  ConstantColor getConstantColor();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.Color#getConstantColor <em>Constant Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Color</em>' attribute.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ConstantColor
   * @see #getConstantColor()
   * @generated
   */
  void setConstantColor(ConstantColor value);

} // Color
