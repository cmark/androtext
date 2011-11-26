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
 * A representation of the literals of the enumeration '<em><b>Activity Theme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getActivityTheme()
 * @model
 * @generated
 */
public enum ActivityTheme implements Enumerator
{
  /**
   * The '<em><b>DIALOG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIALOG_VALUE
   * @generated
   * @ordered
   */
  DIALOG(0, "DIALOG", "DIALOG"),

  /**
   * The '<em><b>NOTITLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOTITLE_VALUE
   * @generated
   * @ordered
   */
  NOTITLE(1, "NOTITLE", "NOTITLE"),

  /**
   * The '<em><b>FULLSCREEN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULLSCREEN_VALUE
   * @generated
   * @ordered
   */
  FULLSCREEN(2, "FULLSCREEN", "FULLSCREEN");

  /**
   * The '<em><b>DIALOG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DIALOG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIALOG
   * @model
   * @generated
   * @ordered
   */
  public static final int DIALOG_VALUE = 0;

  /**
   * The '<em><b>NOTITLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOTITLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOTITLE
   * @model
   * @generated
   * @ordered
   */
  public static final int NOTITLE_VALUE = 1;

  /**
   * The '<em><b>FULLSCREEN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FULLSCREEN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FULLSCREEN
   * @model
   * @generated
   * @ordered
   */
  public static final int FULLSCREEN_VALUE = 2;

  /**
   * An array of all the '<em><b>Activity Theme</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ActivityTheme[] VALUES_ARRAY =
    new ActivityTheme[]
    {
      DIALOG,
      NOTITLE,
      FULLSCREEN,
    };

  /**
   * A public read-only list of all the '<em><b>Activity Theme</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ActivityTheme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Activity Theme</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ActivityTheme get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ActivityTheme result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Activity Theme</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ActivityTheme getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ActivityTheme result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Activity Theme</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ActivityTheme get(int value)
  {
    switch (value)
    {
      case DIALOG_VALUE: return DIALOG;
      case NOTITLE_VALUE: return NOTITLE;
      case FULLSCREEN_VALUE: return FULLSCREEN;
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
  private ActivityTheme(int value, String name, String literal)
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
  
} //ActivityTheme
