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
 * A representation of the literals of the enumeration '<em><b>Api Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getApiLevel()
 * @model
 * @generated
 */
public enum ApiLevel implements Enumerator
{
  /**
   * The '<em><b>API8</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #API8_VALUE
   * @generated
   * @ordered
   */
  API8(0, "API8", "Android 2.2"),

  /**
   * The '<em><b>API9</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #API9_VALUE
   * @generated
   * @ordered
   */
  API9(1, "API9", "Android 2.3.1"),

  /**
   * The '<em><b>API10</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #API10_VALUE
   * @generated
   * @ordered
   */
  API10(2, "API10", "Android 2.3.3"),

  /**
   * The '<em><b>API11</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #API11_VALUE
   * @generated
   * @ordered
   */
  API11(3, "API11", "Android 3.0"),

  /**
   * The '<em><b>API12</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #API12_VALUE
   * @generated
   * @ordered
   */
  API12(4, "API12", "Android 3.1"),

  /**
   * The '<em><b>API14</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #API14_VALUE
   * @generated
   * @ordered
   */
  API14(5, "API14", "Android 4.0");

  /**
   * The '<em><b>API8</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>API8</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #API8
   * @model literal="Android 2.2"
   * @generated
   * @ordered
   */
  public static final int API8_VALUE = 0;

  /**
   * The '<em><b>API9</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>API9</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #API9
   * @model literal="Android 2.3.1"
   * @generated
   * @ordered
   */
  public static final int API9_VALUE = 1;

  /**
   * The '<em><b>API10</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>API10</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #API10
   * @model literal="Android 2.3.3"
   * @generated
   * @ordered
   */
  public static final int API10_VALUE = 2;

  /**
   * The '<em><b>API11</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>API11</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #API11
   * @model literal="Android 3.0"
   * @generated
   * @ordered
   */
  public static final int API11_VALUE = 3;

  /**
   * The '<em><b>API12</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>API12</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #API12
   * @model literal="Android 3.1"
   * @generated
   * @ordered
   */
  public static final int API12_VALUE = 4;

  /**
   * The '<em><b>API14</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>API14</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #API14
   * @model literal="Android 4.0"
   * @generated
   * @ordered
   */
  public static final int API14_VALUE = 5;

  /**
   * An array of all the '<em><b>Api Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ApiLevel[] VALUES_ARRAY =
    new ApiLevel[]
    {
      API8,
      API9,
      API10,
      API11,
      API12,
      API14,
    };

  /**
   * A public read-only list of all the '<em><b>Api Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ApiLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Api Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApiLevel get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ApiLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Api Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApiLevel getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ApiLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Api Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApiLevel get(int value)
  {
    switch (value)
    {
      case API8_VALUE: return API8;
      case API9_VALUE: return API9;
      case API10_VALUE: return API10;
      case API11_VALUE: return API11;
      case API12_VALUE: return API12;
      case API14_VALUE: return API14;
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
  private ApiLevel(int value, String name, String literal)
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
  
} //ApiLevel
