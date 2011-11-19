/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.util;

import hu.bme.mit.androtext.lang.androTextDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage
 * @generated
 */
public class AndroTextDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AndroTextDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroTextDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AndroTextDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT:
      {
        AndroTextModelRoot androTextModelRoot = (AndroTextModelRoot)theEObject;
        T result = caseAndroTextModelRoot(androTextModelRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MODEL_ROOT:
      {
        ModelRoot modelRoot = (ModelRoot)theEObject;
        T result = caseModelRoot(modelRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_GEN_MODEL_ROOT:
      {
        AndroGenModelRoot androGenModelRoot = (AndroGenModelRoot)theEObject;
        T result = caseAndroGenModelRoot(androGenModelRoot);
        if (result == null) result = caseModelRoot(androGenModelRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TARGET_APPLICATION:
      {
        TargetApplication targetApplication = (TargetApplication)theEObject;
        T result = caseTargetApplication(targetApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDROID_APPLICATION:
      {
        AndroidApplication androidApplication = (AndroidApplication)theEObject;
        T result = caseAndroidApplication(androidApplication);
        if (result == null) result = caseModelRoot(androidApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDROID_APPLICATION_MODEL_ELEMENT:
      {
        AndroidApplicationModelElement androidApplicationModelElement = (AndroidApplicationModelElement)theEObject;
        T result = caseAndroidApplicationModelElement(androidApplicationModelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = caseAndroidApplicationModelElement(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TAB_ACTIVITY:
      {
        TabActivity tabActivity = (TabActivity)theEObject;
        T result = caseTabActivity(tabActivity);
        if (result == null) result = caseAndroidApplicationModelElement(tabActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_DATA_MODEL_ROOT:
      {
        AndroDataModelRoot androDataModelRoot = (AndroDataModelRoot)theEObject;
        T result = caseAndroDataModelRoot(androDataModelRoot);
        if (result == null) result = caseModelRoot(androDataModelRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DATA_TYPES_REF:
      {
        DataTypesRef dataTypesRef = (DataTypesRef)theEObject;
        T result = caseDataTypesRef(dataTypesRef);
        if (result == null) result = caseTypeRef(dataTypesRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ENTITY_TYPE_REF:
      {
        EntityTypeRef entityTypeRef = (EntityTypeRef)theEObject;
        T result = caseEntityTypeRef(entityTypeRef);
        if (result == null) result = caseTypeRef(entityTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT:
      {
        AndroGuiModelRoot androGuiModelRoot = (AndroGuiModelRoot)theEObject;
        T result = caseAndroGuiModelRoot(androGuiModelRoot);
        if (result == null) result = caseModelRoot(androGuiModelRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.UI_ELEMENT:
      {
        UIElement uiElement = (UIElement)theEObject;
        T result = caseUIElement(uiElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = caseUIElement(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ROOT_LAYOUT:
      {
        RootLayout rootLayout = (RootLayout)theEObject;
        T result = caseRootLayout(rootLayout);
        if (result == null) result = caseLayout(rootLayout);
        if (result == null) result = caseUIElement(rootLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BASE_LAYOUT:
      {
        BaseLayout baseLayout = (BaseLayout)theEObject;
        T result = caseBaseLayout(baseLayout);
        if (result == null) result = caseRootLayout(baseLayout);
        if (result == null) result = caseLayout(baseLayout);
        if (result == null) result = caseUIElement(baseLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ABSOLUTE_LAYOUT:
      {
        AbsoluteLayout absoluteLayout = (AbsoluteLayout)theEObject;
        T result = caseAbsoluteLayout(absoluteLayout);
        if (result == null) result = caseBaseLayout(absoluteLayout);
        if (result == null) result = caseRootLayout(absoluteLayout);
        if (result == null) result = caseLayout(absoluteLayout);
        if (result == null) result = caseUIElement(absoluteLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LINEAR_LAYOUT:
      {
        LinearLayout linearLayout = (LinearLayout)theEObject;
        T result = caseLinearLayout(linearLayout);
        if (result == null) result = caseBaseLayout(linearLayout);
        if (result == null) result = caseRootLayout(linearLayout);
        if (result == null) result = caseLayout(linearLayout);
        if (result == null) result = caseUIElement(linearLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FRAME_LAYOUT:
      {
        FrameLayout frameLayout = (FrameLayout)theEObject;
        T result = caseFrameLayout(frameLayout);
        if (result == null) result = caseBaseLayout(frameLayout);
        if (result == null) result = caseRootLayout(frameLayout);
        if (result == null) result = caseLayout(frameLayout);
        if (result == null) result = caseUIElement(frameLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RELATIVE_LAYOUT:
      {
        RelativeLayout relativeLayout = (RelativeLayout)theEObject;
        T result = caseRelativeLayout(relativeLayout);
        if (result == null) result = caseBaseLayout(relativeLayout);
        if (result == null) result = caseRootLayout(relativeLayout);
        if (result == null) result = caseLayout(relativeLayout);
        if (result == null) result = caseUIElement(relativeLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.WIDGET:
      {
        Widget widget = (Widget)theEObject;
        T result = caseWidget(widget);
        if (result == null) result = caseUIElement(widget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TEXT_VIEW:
      {
        TextView textView = (TextView)theEObject;
        T result = caseTextView(textView);
        if (result == null) result = caseWidget(textView);
        if (result == null) result = caseUIElement(textView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.EDIT_TEXT:
      {
        EditText editText = (EditText)theEObject;
        T result = caseEditText(editText);
        if (result == null) result = caseWidget(editText);
        if (result == null) result = caseUIElement(editText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseWidget(button);
        if (result == null) result = caseUIElement(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LIST_VIEW:
      {
        ListView listView = (ListView)theEObject;
        T result = caseListView(listView);
        if (result == null) result = caseWidget(listView);
        if (result == null) result = caseUIElement(listView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SPINNER:
      {
        Spinner spinner = (Spinner)theEObject;
        T result = caseSpinner(spinner);
        if (result == null) result = caseWidget(spinner);
        if (result == null) result = caseUIElement(spinner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CHECK_BOX:
      {
        CheckBox checkBox = (CheckBox)theEObject;
        T result = caseCheckBox(checkBox);
        if (result == null) result = caseWidget(checkBox);
        if (result == null) result = caseUIElement(checkBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RADIO_GROUP:
      {
        RadioGroup radioGroup = (RadioGroup)theEObject;
        T result = caseRadioGroup(radioGroup);
        if (result == null) result = caseWidget(radioGroup);
        if (result == null) result = caseUIElement(radioGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RATING_BAR:
      {
        RatingBar ratingBar = (RatingBar)theEObject;
        T result = caseRatingBar(ratingBar);
        if (result == null) result = caseWidget(ratingBar);
        if (result == null) result = caseUIElement(ratingBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TOGGLE_BUTTON:
      {
        ToggleButton toggleButton = (ToggleButton)theEObject;
        T result = caseToggleButton(toggleButton);
        if (result == null) result = caseWidget(toggleButton);
        if (result == null) result = caseUIElement(toggleButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RADIO_BUTTON:
      {
        RadioButton radioButton = (RadioButton)theEObject;
        T result = caseRadioButton(radioButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ABSTRACT_PREFERENCE:
      {
        AbstractPreference abstractPreference = (AbstractPreference)theEObject;
        T result = caseAbstractPreference(abstractPreference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PREFERENCE:
      {
        Preference preference = (Preference)theEObject;
        T result = casePreference(preference);
        if (result == null) result = caseAbstractPreference(preference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PREFERENCE_SCREEN:
      {
        PreferenceScreen preferenceScreen = (PreferenceScreen)theEObject;
        T result = casePreferenceScreen(preferenceScreen);
        if (result == null) result = caseRootLayout(preferenceScreen);
        if (result == null) result = caseAbstractPreference(preferenceScreen);
        if (result == null) result = caseLayout(preferenceScreen);
        if (result == null) result = caseUIElement(preferenceScreen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PREFERENCE_CATEGORY:
      {
        PreferenceCategory preferenceCategory = (PreferenceCategory)theEObject;
        T result = casePreferenceCategory(preferenceCategory);
        if (result == null) result = caseAbstractPreference(preferenceCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE:
      {
        EditTextPreference editTextPreference = (EditTextPreference)theEObject;
        T result = caseEditTextPreference(editTextPreference);
        if (result == null) result = caseAbstractPreference(editTextPreference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LIST_PREFERENCE:
      {
        ListPreference listPreference = (ListPreference)theEObject;
        T result = caseListPreference(listPreference);
        if (result == null) result = caseAbstractPreference(listPreference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CHECK_BOX_PREFERENCE:
      {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference)theEObject;
        T result = caseCheckBoxPreference(checkBoxPreference);
        if (result == null) result = caseAbstractPreference(checkBoxPreference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RINGTONE_PREFENCE:
      {
        RingtonePrefence ringtonePrefence = (RingtonePrefence)theEObject;
        T result = caseRingtonePrefence(ringtonePrefence);
        if (result == null) result = caseAbstractPreference(ringtonePrefence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES:
      {
        PreferenceAttributes preferenceAttributes = (PreferenceAttributes)theEObject;
        T result = casePreferenceAttributes(preferenceAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DIALOG_PREFERENCE_ATTRIBUTES:
      {
        DialogPreferenceAttributes dialogPreferenceAttributes = (DialogPreferenceAttributes)theEObject;
        T result = caseDialogPreferenceAttributes(dialogPreferenceAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES:
      {
        ListPreferenceAttributes listPreferenceAttributes = (ListPreferenceAttributes)theEObject;
        T result = caseListPreferenceAttributes(listPreferenceAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_RES_MODEL_ROOT:
      {
        AndroResModelRoot androResModelRoot = (AndroResModelRoot)theEObject;
        T result = caseAndroResModelRoot(androResModelRoot);
        if (result == null) result = caseModelRoot(androResModelRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.STRING_RESOURCE:
      {
        StringResource stringResource = (StringResource)theEObject;
        T result = caseStringResource(stringResource);
        if (result == null) result = caseResource(stringResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.INTEGER_RESOURCE:
      {
        IntegerResource integerResource = (IntegerResource)theEObject;
        T result = caseIntegerResource(integerResource);
        if (result == null) result = caseResource(integerResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BOOLEAN_RESOURCE:
      {
        BooleanResource booleanResource = (BooleanResource)theEObject;
        T result = caseBooleanResource(booleanResource);
        if (result == null) result = caseResource(booleanResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLOR_RESOURCE:
      {
        ColorResource colorResource = (ColorResource)theEObject;
        T result = caseColorResource(colorResource);
        if (result == null) result = caseResource(colorResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DIMENSION_RESOURCE:
      {
        DimensionResource dimensionResource = (DimensionResource)theEObject;
        T result = caseDimensionResource(dimensionResource);
        if (result == null) result = caseResource(dimensionResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ARRAY_RESOURCE:
      {
        ArrayResource arrayResource = (ArrayResource)theEObject;
        T result = caseArrayResource(arrayResource);
        if (result == null) result = caseResource(arrayResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.INTEGER_ARRAY_RESOURCE:
      {
        IntegerArrayResource integerArrayResource = (IntegerArrayResource)theEObject;
        T result = caseIntegerArrayResource(integerArrayResource);
        if (result == null) result = caseArrayResource(integerArrayResource);
        if (result == null) result = caseResource(integerArrayResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.INTEGER_ARRAY_ENTRY:
      {
        IntegerArrayEntry integerArrayEntry = (IntegerArrayEntry)theEObject;
        T result = caseIntegerArrayEntry(integerArrayEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.STRING_ARRAY_RESOURCE:
      {
        StringArrayResource stringArrayResource = (StringArrayResource)theEObject;
        T result = caseStringArrayResource(stringArrayResource);
        if (result == null) result = caseArrayResource(stringArrayResource);
        if (result == null) result = caseResource(stringArrayResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.STRING_ARRAY_ENTRY:
      {
        StringArrayEntry stringArrayEntry = (StringArrayEntry)theEObject;
        T result = caseStringArrayEntry(stringArrayEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DRAWABLE_RESOURCE:
      {
        DrawableResource drawableResource = (DrawableResource)theEObject;
        T result = caseDrawableResource(drawableResource);
        if (result == null) result = caseResource(drawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BITMAP_DRAWABLE_RESOURCE:
      {
        BitmapDrawableResource bitmapDrawableResource = (BitmapDrawableResource)theEObject;
        T result = caseBitmapDrawableResource(bitmapDrawableResource);
        if (result == null) result = caseDrawableResource(bitmapDrawableResource);
        if (result == null) result = caseResource(bitmapDrawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TRANSITION_DRAWABLE_RESOURCE:
      {
        TransitionDrawableResource transitionDrawableResource = (TransitionDrawableResource)theEObject;
        T result = caseTransitionDrawableResource(transitionDrawableResource);
        if (result == null) result = caseDrawableResource(transitionDrawableResource);
        if (result == null) result = caseResource(transitionDrawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Text Model Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Text Model Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroTextModelRoot(AndroTextModelRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelRoot(ModelRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Gen Model Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Gen Model Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroGenModelRoot(AndroGenModelRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetApplication(TargetApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Android Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Android Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroidApplication(AndroidApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Android Application Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Android Application Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroidApplicationModelElement(AndroidApplicationModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivity(Activity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabActivity(TabActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Data Model Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Data Model Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroDataModelRoot(AndroDataModelRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Types Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Types Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypesRef(DataTypesRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityTypeRef(EntityTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Gui Model Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Gui Model Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroGuiModelRoot(AndroGuiModelRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIElement(UIElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRootLayout(RootLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseLayout(BaseLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Absolute Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Absolute Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbsoluteLayout(AbsoluteLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linear Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinearLayout(LinearLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Frame Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frame Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrameLayout(FrameLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativeLayout(RelativeLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidget(Widget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextView(TextView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edit Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edit Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditText(EditText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListView(ListView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpinner(Spinner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckBox(CheckBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioGroup(RadioGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rating Bar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rating Bar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRatingBar(RatingBar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Toggle Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Toggle Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToggleButton(ToggleButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioButton(RadioButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Preference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Preference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractPreference(AbstractPreference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreference(Preference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preference Screen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preference Screen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreferenceScreen(PreferenceScreen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preference Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preference Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreferenceCategory(PreferenceCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edit Text Preference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edit Text Preference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditTextPreference(EditTextPreference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Preference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Preference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListPreference(ListPreference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Box Preference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Box Preference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckBoxPreference(CheckBoxPreference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ringtone Prefence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ringtone Prefence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRingtonePrefence(RingtonePrefence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preference Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preference Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreferenceAttributes(PreferenceAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialog Preference Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialog Preference Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialogPreferenceAttributes(DialogPreferenceAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Preference Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Preference Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListPreferenceAttributes(ListPreferenceAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Res Model Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Res Model Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroResModelRoot(AndroResModelRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringResource(StringResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerResource(IntegerResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanResource(BooleanResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorResource(ColorResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionResource(DimensionResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayResource(ArrayResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Array Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Array Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerArrayResource(IntegerArrayResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Array Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Array Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerArrayEntry(IntegerArrayEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Array Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Array Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringArrayResource(StringArrayResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Array Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Array Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringArrayEntry(StringArrayEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawable Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawableResource(DrawableResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitmap Drawable Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitmap Drawable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitmapDrawableResource(BitmapDrawableResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Drawable Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Drawable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionDrawableResource(TransitionDrawableResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AndroTextDslSwitch
