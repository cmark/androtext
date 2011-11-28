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
 * A representation of the literals of the enumeration '<em><b>Fast Layout Dimension Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getFastLayoutDimensionKind()
 * @model
 * @generated
 */
public enum FastLayoutDimensionKind implements Enumerator
{
  /**
   * The '<em><b>FILL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FILL_VALUE
   * @generated
   * @ordered
   */
  FILL(0, "FILL", "fill"),

  /**
   * The '<em><b>WRAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRAP_VALUE
   * @generated
   * @ordered
   */
  WRAP(1, "WRAP", "wrap"),

  /**
   * The '<em><b>FILL WRAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FILL_WRAP_VALUE
   * @generated
   * @ordered
   */
  FILL_WRAP(2, "FILL_WRAP", "fill&wrap"),

  /**
   * The '<em><b>WRAP FILL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRAP_FILL_VALUE
   * @generated
   * @ordered
   */
  WRAP_FILL(3, "WRAP_FILL", "wrap&fill");

  /**
   * The '<em><b>FILL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FILL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FILL
   * @model literal="fill"
   * @generated
   * @ordered
   */
  public static final int FILL_VALUE = 0;

  /**
   * The '<em><b>WRAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WRAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WRAP
   * @model literal="wrap"
   * @generated
   * @ordered
   */
  public static final int WRAP_VALUE = 1;

  /**
   * The '<em><b>FILL WRAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FILL WRAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FILL_WRAP
   * @model literal="fill&wrap"
   * @generated
   * @ordered
   */
  public static final int FILL_WRAP_VALUE = 2;

  /**
   * The '<em><b>WRAP FILL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WRAP FILL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WRAP_FILL
   * @model literal="wrap&fill"
   * @generated
   * @ordered
   */
  public static final int WRAP_FILL_VALUE = 3;

  /**
   * An array of all the '<em><b>Fast Layout Dimension Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FastLayoutDimensionKind[] VALUES_ARRAY =
    new FastLayoutDimensionKind[]
    {
      FILL,
      WRAP,
      FILL_WRAP,
      WRAP_FILL,
    };

  /**
   * A public read-only list of all the '<em><b>Fast Layout Dimension Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FastLayoutDimensionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Fast Layout Dimension Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FastLayoutDimensionKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FastLayoutDimensionKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Fast Layout Dimension Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FastLayoutDimensionKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FastLayoutDimensionKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Fast Layout Dimension Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FastLayoutDimensionKind get(int value)
  {
    switch (value)
    {
      case FILL_VALUE: return FILL;
      case WRAP_VALUE: return WRAP;
      case FILL_WRAP_VALUE: return FILL_WRAP;
      case WRAP_FILL_VALUE: return WRAP_FILL;
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
  private FastLayoutDimensionKind(int value, String name, String literal)
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
  
} //FastLayoutDimensionKind
