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
 * A representation of the literals of the enumeration '<em><b>Android Drawable Resource</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getAndroidDrawableResource()
 * @model
 * @generated
 */
public enum AndroidDrawableResource implements Enumerator
{
  /**
   * The '<em><b>Edit text</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDIT_TEXT_VALUE
   * @generated
   * @ordered
   */
  EDIT_TEXT(0, "edit_text", "edit_text"),

  /**
   * The '<em><b>Editbox background</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDITBOX_BACKGROUND_VALUE
   * @generated
   * @ordered
   */
  EDITBOX_BACKGROUND(1, "editbox_background", "editbox_background"),

  /**
   * The '<em><b>Editbox background normal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDITBOX_BACKGROUND_NORMAL_VALUE
   * @generated
   * @ordered
   */
  EDITBOX_BACKGROUND_NORMAL(2, "editbox_background_normal", "editbox_background_normal"),

  /**
   * The '<em><b>Editbox dropdown dark frame</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDITBOX_DROPDOWN_DARK_FRAME_VALUE
   * @generated
   * @ordered
   */
  EDITBOX_DROPDOWN_DARK_FRAME(3, "editbox_dropdown_dark_frame", "editbox_dropdown_dark_frame"),

  /**
   * The '<em><b>Editbox dropdown light frame</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDITBOX_DROPDOWN_LIGHT_FRAME_VALUE
   * @generated
   * @ordered
   */
  EDITBOX_DROPDOWN_LIGHT_FRAME(4, "editbox_dropdown_light_frame", "editbox_dropdown_light_frame");

  /**
   * The '<em><b>Edit text</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Edit text</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDIT_TEXT
   * @model name="edit_text"
   * @generated
   * @ordered
   */
  public static final int EDIT_TEXT_VALUE = 0;

  /**
   * The '<em><b>Editbox background</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Editbox background</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDITBOX_BACKGROUND
   * @model name="editbox_background"
   * @generated
   * @ordered
   */
  public static final int EDITBOX_BACKGROUND_VALUE = 1;

  /**
   * The '<em><b>Editbox background normal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Editbox background normal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDITBOX_BACKGROUND_NORMAL
   * @model name="editbox_background_normal"
   * @generated
   * @ordered
   */
  public static final int EDITBOX_BACKGROUND_NORMAL_VALUE = 2;

  /**
   * The '<em><b>Editbox dropdown dark frame</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Editbox dropdown dark frame</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDITBOX_DROPDOWN_DARK_FRAME
   * @model name="editbox_dropdown_dark_frame"
   * @generated
   * @ordered
   */
  public static final int EDITBOX_DROPDOWN_DARK_FRAME_VALUE = 3;

  /**
   * The '<em><b>Editbox dropdown light frame</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Editbox dropdown light frame</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDITBOX_DROPDOWN_LIGHT_FRAME
   * @model name="editbox_dropdown_light_frame"
   * @generated
   * @ordered
   */
  public static final int EDITBOX_DROPDOWN_LIGHT_FRAME_VALUE = 4;

  /**
   * An array of all the '<em><b>Android Drawable Resource</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AndroidDrawableResource[] VALUES_ARRAY =
    new AndroidDrawableResource[]
    {
      EDIT_TEXT,
      EDITBOX_BACKGROUND,
      EDITBOX_BACKGROUND_NORMAL,
      EDITBOX_DROPDOWN_DARK_FRAME,
      EDITBOX_DROPDOWN_LIGHT_FRAME,
    };

  /**
   * A public read-only list of all the '<em><b>Android Drawable Resource</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AndroidDrawableResource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Android Drawable Resource</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroidDrawableResource get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AndroidDrawableResource result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Android Drawable Resource</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroidDrawableResource getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AndroidDrawableResource result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Android Drawable Resource</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroidDrawableResource get(int value)
  {
    switch (value)
    {
      case EDIT_TEXT_VALUE: return EDIT_TEXT;
      case EDITBOX_BACKGROUND_VALUE: return EDITBOX_BACKGROUND;
      case EDITBOX_BACKGROUND_NORMAL_VALUE: return EDITBOX_BACKGROUND_NORMAL;
      case EDITBOX_DROPDOWN_DARK_FRAME_VALUE: return EDITBOX_DROPDOWN_DARK_FRAME;
      case EDITBOX_DROPDOWN_LIGHT_FRAME_VALUE: return EDITBOX_DROPDOWN_LIGHT_FRAME;
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
  private AndroidDrawableResource(int value, String name, String literal)
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
  
} //AndroidDrawableResource
