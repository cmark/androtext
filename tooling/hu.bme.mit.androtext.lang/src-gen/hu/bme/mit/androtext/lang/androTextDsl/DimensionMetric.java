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
 * A representation of the literals of the enumeration '<em><b>Dimension Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getDimensionMetric()
 * @model
 * @generated
 */
public enum DimensionMetric implements Enumerator
{
  /**
   * The '<em><b>Dp</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DP_VALUE
   * @generated
   * @ordered
   */
  DP(0, "dp", "dp"),

  /**
   * The '<em><b>Sp</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SP_VALUE
   * @generated
   * @ordered
   */
  SP(1, "sp", "sp"),

  /**
   * The '<em><b>Pt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PT_VALUE
   * @generated
   * @ordered
   */
  PT(2, "pt", "pt"),

  /**
   * The '<em><b>Px</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PX_VALUE
   * @generated
   * @ordered
   */
  PX(3, "px", "px"),

  /**
   * The '<em><b>Mm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MM_VALUE
   * @generated
   * @ordered
   */
  MM(4, "mm", "mm"),

  /**
   * The '<em><b>In</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IN_VALUE
   * @generated
   * @ordered
   */
  IN(5, "in", "in");

  /**
   * The '<em><b>Dp</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dp</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DP
   * @model name="dp"
   * @generated
   * @ordered
   */
  public static final int DP_VALUE = 0;

  /**
   * The '<em><b>Sp</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sp</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SP
   * @model name="sp"
   * @generated
   * @ordered
   */
  public static final int SP_VALUE = 1;

  /**
   * The '<em><b>Pt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PT
   * @model name="pt"
   * @generated
   * @ordered
   */
  public static final int PT_VALUE = 2;

  /**
   * The '<em><b>Px</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Px</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PX
   * @model name="px"
   * @generated
   * @ordered
   */
  public static final int PX_VALUE = 3;

  /**
   * The '<em><b>Mm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MM
   * @model name="mm"
   * @generated
   * @ordered
   */
  public static final int MM_VALUE = 4;

  /**
   * The '<em><b>In</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IN
   * @model name="in"
   * @generated
   * @ordered
   */
  public static final int IN_VALUE = 5;

  /**
   * An array of all the '<em><b>Dimension Metric</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DimensionMetric[] VALUES_ARRAY =
    new DimensionMetric[]
    {
      DP,
      SP,
      PT,
      PX,
      MM,
      IN,
    };

  /**
   * A public read-only list of all the '<em><b>Dimension Metric</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DimensionMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dimension Metric</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DimensionMetric get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DimensionMetric result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dimension Metric</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DimensionMetric getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DimensionMetric result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dimension Metric</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DimensionMetric get(int value)
  {
    switch (value)
    {
      case DP_VALUE: return DP;
      case SP_VALUE: return SP;
      case PT_VALUE: return PT;
      case PX_VALUE: return PX;
      case MM_VALUE: return MM;
      case IN_VALUE: return IN;
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
  private DimensionMetric(int value, String name, String literal)
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
  
} //DimensionMetric
