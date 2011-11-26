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
 * A representation of the literals of the enumeration '<em><b>Layout Gravity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getLayoutGravityKind()
 * @model
 * @generated
 */
public enum LayoutGravityKind implements Enumerator
{
  /**
   * The '<em><b>Top</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOP_VALUE
   * @generated
   * @ordered
   */
  TOP(0, "top", "top"),

  /**
   * The '<em><b>Bottom</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOTTOM_VALUE
   * @generated
   * @ordered
   */
  BOTTOM(1, "bottom", "bottom"),

  /**
   * The '<em><b>Left</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_VALUE
   * @generated
   * @ordered
   */
  LEFT(2, "left", "left"),

  /**
   * The '<em><b>Right</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_VALUE
   * @generated
   * @ordered
   */
  RIGHT(3, "right", "right"),

  /**
   * The '<em><b>Center</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CENTER_VALUE
   * @generated
   * @ordered
   */
  CENTER(4, "center", "center"),

  /**
   * The '<em><b>Center vertical</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CENTER_VERTICAL_VALUE
   * @generated
   * @ordered
   */
  CENTER_VERTICAL(5, "center_vertical", "center_vertical"),

  /**
   * The '<em><b>Center horizontal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CENTER_HORIZONTAL_VALUE
   * @generated
   * @ordered
   */
  CENTER_HORIZONTAL(6, "center_horizontal", "center_horizontal"),

  /**
   * The '<em><b>Fill</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FILL_VALUE
   * @generated
   * @ordered
   */
  FILL(7, "fill", "fill"),

  /**
   * The '<em><b>Fill vertical</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FILL_VERTICAL_VALUE
   * @generated
   * @ordered
   */
  FILL_VERTICAL(8, "fill_vertical", "fill_vertical"),

  /**
   * The '<em><b>Fill horizontal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FILL_HORIZONTAL_VALUE
   * @generated
   * @ordered
   */
  FILL_HORIZONTAL(9, "fill_horizontal", "fill_horizontal"),

  /**
   * The '<em><b>Clip vertical</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLIP_VERTICAL_VALUE
   * @generated
   * @ordered
   */
  CLIP_VERTICAL(10, "clip_vertical", "clip_vertical"),

  /**
   * The '<em><b>Clip horizontal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLIP_HORIZONTAL_VALUE
   * @generated
   * @ordered
   */
  CLIP_HORIZONTAL(11, "clip_horizontal", "clip_horizontal");

  /**
   * The '<em><b>Top</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Top</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOP
   * @model name="top"
   * @generated
   * @ordered
   */
  public static final int TOP_VALUE = 0;

  /**
   * The '<em><b>Bottom</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bottom</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOTTOM
   * @model name="bottom"
   * @generated
   * @ordered
   */
  public static final int BOTTOM_VALUE = 1;

  /**
   * The '<em><b>Left</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Left</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEFT
   * @model name="left"
   * @generated
   * @ordered
   */
  public static final int LEFT_VALUE = 2;

  /**
   * The '<em><b>Right</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Right</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RIGHT
   * @model name="right"
   * @generated
   * @ordered
   */
  public static final int RIGHT_VALUE = 3;

  /**
   * The '<em><b>Center</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Center</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CENTER
   * @model name="center"
   * @generated
   * @ordered
   */
  public static final int CENTER_VALUE = 4;

  /**
   * The '<em><b>Center vertical</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Center vertical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CENTER_VERTICAL
   * @model name="center_vertical"
   * @generated
   * @ordered
   */
  public static final int CENTER_VERTICAL_VALUE = 5;

  /**
   * The '<em><b>Center horizontal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Center horizontal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CENTER_HORIZONTAL
   * @model name="center_horizontal"
   * @generated
   * @ordered
   */
  public static final int CENTER_HORIZONTAL_VALUE = 6;

  /**
   * The '<em><b>Fill</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fill</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FILL
   * @model name="fill"
   * @generated
   * @ordered
   */
  public static final int FILL_VALUE = 7;

  /**
   * The '<em><b>Fill vertical</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fill vertical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FILL_VERTICAL
   * @model name="fill_vertical"
   * @generated
   * @ordered
   */
  public static final int FILL_VERTICAL_VALUE = 8;

  /**
   * The '<em><b>Fill horizontal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fill horizontal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FILL_HORIZONTAL
   * @model name="fill_horizontal"
   * @generated
   * @ordered
   */
  public static final int FILL_HORIZONTAL_VALUE = 9;

  /**
   * The '<em><b>Clip vertical</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Clip vertical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLIP_VERTICAL
   * @model name="clip_vertical"
   * @generated
   * @ordered
   */
  public static final int CLIP_VERTICAL_VALUE = 10;

  /**
   * The '<em><b>Clip horizontal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Clip horizontal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLIP_HORIZONTAL
   * @model name="clip_horizontal"
   * @generated
   * @ordered
   */
  public static final int CLIP_HORIZONTAL_VALUE = 11;

  /**
   * An array of all the '<em><b>Layout Gravity Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LayoutGravityKind[] VALUES_ARRAY =
    new LayoutGravityKind[]
    {
      TOP,
      BOTTOM,
      LEFT,
      RIGHT,
      CENTER,
      CENTER_VERTICAL,
      CENTER_HORIZONTAL,
      FILL,
      FILL_VERTICAL,
      FILL_HORIZONTAL,
      CLIP_VERTICAL,
      CLIP_HORIZONTAL,
    };

  /**
   * A public read-only list of all the '<em><b>Layout Gravity Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LayoutGravityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Layout Gravity Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LayoutGravityKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LayoutGravityKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Layout Gravity Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LayoutGravityKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LayoutGravityKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Layout Gravity Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LayoutGravityKind get(int value)
  {
    switch (value)
    {
      case TOP_VALUE: return TOP;
      case BOTTOM_VALUE: return BOTTOM;
      case LEFT_VALUE: return LEFT;
      case RIGHT_VALUE: return RIGHT;
      case CENTER_VALUE: return CENTER;
      case CENTER_VERTICAL_VALUE: return CENTER_VERTICAL;
      case CENTER_HORIZONTAL_VALUE: return CENTER_HORIZONTAL;
      case FILL_VALUE: return FILL;
      case FILL_VERTICAL_VALUE: return FILL_VERTICAL;
      case FILL_HORIZONTAL_VALUE: return FILL_HORIZONTAL;
      case CLIP_VERTICAL_VALUE: return CLIP_VERTICAL;
      case CLIP_HORIZONTAL_VALUE: return CLIP_HORIZONTAL;
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
  private LayoutGravityKind(int value, String name, String literal)
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
  
} //LayoutGravityKind
