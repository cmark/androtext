/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constant Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getConstantColor()
 * @model
 * @generated
 */
public enum ConstantColor implements Enumerator
{
  /**
   * The '<em><b>BLACK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLACK_VALUE
   * @generated
   * @ordered
   */
  BLACK(0, "BLACK", "BLACK"),

  /**
   * The '<em><b>WHITE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WHITE_VALUE
   * @generated
   * @ordered
   */
  WHITE(1, "WHITE", "WHITE"),

  /**
   * The '<em><b>RED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RED_VALUE
   * @generated
   * @ordered
   */
  RED(2, "RED", "RED"),

  /**
   * The '<em><b>GREEN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREEN_VALUE
   * @generated
   * @ordered
   */
  GREEN(3, "GREEN", "GREEN"),

  /**
   * The '<em><b>BLUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLUE_VALUE
   * @generated
   * @ordered
   */
  BLUE(4, "BLUE", "BLUE"),

  /**
   * The '<em><b>YELLOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YELLOW_VALUE
   * @generated
   * @ordered
   */
  YELLOW(5, "YELLOW", "YELLOW");

  /**
   * The '<em><b>BLACK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLACK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLACK
   * @model
   * @generated
   * @ordered
   */
  public static final int BLACK_VALUE = 0;

  /**
   * The '<em><b>WHITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WHITE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WHITE
   * @model
   * @generated
   * @ordered
   */
  public static final int WHITE_VALUE = 1;

  /**
   * The '<em><b>RED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RED
   * @model
   * @generated
   * @ordered
   */
  public static final int RED_VALUE = 2;

  /**
   * The '<em><b>GREEN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GREEN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREEN
   * @model
   * @generated
   * @ordered
   */
  public static final int GREEN_VALUE = 3;

  /**
   * The '<em><b>BLUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLUE
   * @model
   * @generated
   * @ordered
   */
  public static final int BLUE_VALUE = 4;

  /**
   * The '<em><b>YELLOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>YELLOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YELLOW
   * @model
   * @generated
   * @ordered
   */
  public static final int YELLOW_VALUE = 5;

  /**
   * An array of all the '<em><b>Constant Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConstantColor[] VALUES_ARRAY =
    new ConstantColor[]
    {
      BLACK,
      WHITE,
      RED,
      GREEN,
      BLUE,
      YELLOW,
    };

  /**
   * A public read-only list of all the '<em><b>Constant Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConstantColor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Constant Color</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstantColor get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstantColor result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constant Color</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstantColor getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstantColor result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constant Color</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstantColor get(int value)
  {
    switch (value)
    {
      case BLACK_VALUE: return BLACK;
      case WHITE_VALUE: return WHITE;
      case RED_VALUE: return RED;
      case GREEN_VALUE: return GREEN;
      case BLUE_VALUE: return BLUE;
      case YELLOW_VALUE: return YELLOW;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ConstantColor(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ConstantColor
