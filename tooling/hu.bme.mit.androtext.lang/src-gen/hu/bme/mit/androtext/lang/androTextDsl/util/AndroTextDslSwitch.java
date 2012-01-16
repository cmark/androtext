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
        if (result == null) result = caseActivity(tabActivity);
        if (result == null) result = caseAndroidApplicationModelElement(tabActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TAB:
      {
        Tab tab = (Tab)theEObject;
        T result = caseTab(tab);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LIST_ACTIVITY:
      {
        ListActivity listActivity = (ListActivity)theEObject;
        T result = caseListActivity(listActivity);
        if (result == null) result = caseActivity(listActivity);
        if (result == null) result = caseAndroidApplicationModelElement(listActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PREFERENCE_ACTIVITY:
      {
        PreferenceActivity preferenceActivity = (PreferenceActivity)theEObject;
        T result = casePreferenceActivity(preferenceActivity);
        if (result == null) result = caseAndroidApplicationModelElement(preferenceActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CONTENT_PROVIDER:
      {
        ContentProvider contentProvider = (ContentProvider)theEObject;
        T result = caseContentProvider(contentProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RESOURCE_CONTENT_PROVIDER:
      {
        ResourceContentProvider resourceContentProvider = (ResourceContentProvider)theEObject;
        T result = caseResourceContentProvider(resourceContentProvider);
        if (result == null) result = caseContentProvider(resourceContentProvider);
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
      case AndroTextDslPackage.VIEW:
      {
        View view = (View)theEObject;
        T result = caseView(view);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.VIEW_GROUP:
      {
        ViewGroup viewGroup = (ViewGroup)theEObject;
        T result = caseViewGroup(viewGroup);
        if (result == null) result = caseView(viewGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LAYOUT_PROPERTIES:
      {
        LayoutProperties layoutProperties = (LayoutProperties)theEObject;
        T result = caseLayoutProperties(layoutProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LAYOUT_STYLE:
      {
        LayoutStyle layoutStyle = (LayoutStyle)theEObject;
        T result = caseLayoutStyle(layoutStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.REGULAR_LAYOUT_STYLE:
      {
        RegularLayoutStyle regularLayoutStyle = (RegularLayoutStyle)theEObject;
        T result = caseRegularLayoutStyle(regularLayoutStyle);
        if (result == null) result = caseLayoutStyle(regularLayoutStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FAST_LAYOUT_STYLE:
      {
        FastLayoutStyle fastLayoutStyle = (FastLayoutStyle)theEObject;
        T result = caseFastLayoutStyle(fastLayoutStyle);
        if (result == null) result = caseLayoutStyle(fastLayoutStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ABSOLUTE_LAYOUT:
      {
        AbsoluteLayout absoluteLayout = (AbsoluteLayout)theEObject;
        T result = caseAbsoluteLayout(absoluteLayout);
        if (result == null) result = caseViewGroup(absoluteLayout);
        if (result == null) result = caseView(absoluteLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LINEAR_LAYOUT:
      {
        LinearLayout linearLayout = (LinearLayout)theEObject;
        T result = caseLinearLayout(linearLayout);
        if (result == null) result = caseViewGroup(linearLayout);
        if (result == null) result = caseView(linearLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FRAME_LAYOUT:
      {
        FrameLayout frameLayout = (FrameLayout)theEObject;
        T result = caseFrameLayout(frameLayout);
        if (result == null) result = caseViewGroup(frameLayout);
        if (result == null) result = caseView(frameLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RELATIVE_LAYOUT:
      {
        RelativeLayout relativeLayout = (RelativeLayout)theEObject;
        T result = caseRelativeLayout(relativeLayout);
        if (result == null) result = caseViewGroup(relativeLayout);
        if (result == null) result = caseView(relativeLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GRID_LAYOUT:
      {
        GridLayout gridLayout = (GridLayout)theEObject;
        T result = caseGridLayout(gridLayout);
        if (result == null) result = caseViewGroup(gridLayout);
        if (result == null) result = caseView(gridLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TABLE_LAYOUT:
      {
        TableLayout tableLayout = (TableLayout)theEObject;
        T result = caseTableLayout(tableLayout);
        if (result == null) result = caseViewGroup(tableLayout);
        if (result == null) result = caseView(tableLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TABLE_ROW:
      {
        TableRow tableRow = (TableRow)theEObject;
        T result = caseTableRow(tableRow);
        if (result == null) result = caseViewGroup(tableRow);
        if (result == null) result = caseView(tableRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SIMPLE_VIEW:
      {
        SimpleView simpleView = (SimpleView)theEObject;
        T result = caseSimpleView(simpleView);
        if (result == null) result = caseView(simpleView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.VIEW_ELEMENT:
      {
        ViewElement viewElement = (ViewElement)theEObject;
        T result = caseViewElement(viewElement);
        if (result == null) result = caseSimpleView(viewElement);
        if (result == null) result = caseView(viewElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TEXT_VIEW:
      {
        TextView textView = (TextView)theEObject;
        T result = caseTextView(textView);
        if (result == null) result = caseSimpleView(textView);
        if (result == null) result = caseView(textView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.EDIT_TEXT:
      {
        EditText editText = (EditText)theEObject;
        T result = caseEditText(editText);
        if (result == null) result = caseSimpleView(editText);
        if (result == null) result = caseView(editText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseSimpleView(button);
        if (result == null) result = caseView(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GALLERY:
      {
        Gallery gallery = (Gallery)theEObject;
        T result = caseGallery(gallery);
        if (result == null) result = caseSimpleView(gallery);
        if (result == null) result = caseView(gallery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.EXPANDABLE_LIST_VIEW:
      {
        ExpandableListView expandableListView = (ExpandableListView)theEObject;
        T result = caseExpandableListView(expandableListView);
        if (result == null) result = caseSimpleView(expandableListView);
        if (result == null) result = caseView(expandableListView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.WEB_VIEW:
      {
        WebView webView = (WebView)theEObject;
        T result = caseWebView(webView);
        if (result == null) result = caseSimpleView(webView);
        if (result == null) result = caseView(webView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.IMAGE_VIEW:
      {
        ImageView imageView = (ImageView)theEObject;
        T result = caseImageView(imageView);
        if (result == null) result = caseSimpleView(imageView);
        if (result == null) result = caseView(imageView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LIST_VIEW:
      {
        ListView listView = (ListView)theEObject;
        T result = caseListView(listView);
        if (result == null) result = caseSimpleView(listView);
        if (result == null) result = caseView(listView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GRID_VIEW:
      {
        GridView gridView = (GridView)theEObject;
        T result = caseGridView(gridView);
        if (result == null) result = caseSimpleView(gridView);
        if (result == null) result = caseView(gridView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SPINNER:
      {
        Spinner spinner = (Spinner)theEObject;
        T result = caseSpinner(spinner);
        if (result == null) result = caseSimpleView(spinner);
        if (result == null) result = caseView(spinner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CHECK_BOX:
      {
        CheckBox checkBox = (CheckBox)theEObject;
        T result = caseCheckBox(checkBox);
        if (result == null) result = caseSimpleView(checkBox);
        if (result == null) result = caseView(checkBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RADIO_GROUP:
      {
        RadioGroup radioGroup = (RadioGroup)theEObject;
        T result = caseRadioGroup(radioGroup);
        if (result == null) result = caseSimpleView(radioGroup);
        if (result == null) result = caseView(radioGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RATING_BAR:
      {
        RatingBar ratingBar = (RatingBar)theEObject;
        T result = caseRatingBar(ratingBar);
        if (result == null) result = caseSimpleView(ratingBar);
        if (result == null) result = caseView(ratingBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TOGGLE_BUTTON:
      {
        ToggleButton toggleButton = (ToggleButton)theEObject;
        T result = caseToggleButton(toggleButton);
        if (result == null) result = caseSimpleView(toggleButton);
        if (result == null) result = caseView(toggleButton);
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
      case AndroTextDslPackage.CHECKED_TEXT_VIEW:
      {
        CheckedTextView checkedTextView = (CheckedTextView)theEObject;
        T result = caseCheckedTextView(checkedTextView);
        if (result == null) result = caseSimpleView(checkedTextView);
        if (result == null) result = caseView(checkedTextView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW:
      {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)theEObject;
        T result = caseAutoCompleteTextView(autoCompleteTextView);
        if (result == null) result = caseSimpleView(autoCompleteTextView);
        if (result == null) result = caseView(autoCompleteTextView);
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
        if (result == null) result = caseAbstractPreference(preferenceScreen);
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
      case AndroTextDslPackage.SPAN_ATTRIBUTE:
      {
        SpanAttribute spanAttribute = (SpanAttribute)theEObject;
        T result = caseSpanAttribute(spanAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLUMN_ATTRIBUTE:
      {
        ColumnAttribute columnAttribute = (ColumnAttribute)theEObject;
        T result = caseColumnAttribute(columnAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE:
      {
        CenterVerticalAttribute centerVerticalAttribute = (CenterVerticalAttribute)theEObject;
        T result = caseCenterVerticalAttribute(centerVerticalAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE:
      {
        CenterInParentAttribute centerInParentAttribute = (CenterInParentAttribute)theEObject;
        T result = caseCenterInParentAttribute(centerInParentAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE:
      {
        CenterHorizontalAttribute centerHorizontalAttribute = (CenterHorizontalAttribute)theEObject;
        T result = caseCenterHorizontalAttribute(centerHorizontalAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE:
      {
        ToRightOfAttribute toRightOfAttribute = (ToRightOfAttribute)theEObject;
        T result = caseToRightOfAttribute(toRightOfAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE:
      {
        ToLeftOfAttribute toLeftOfAttribute = (ToLeftOfAttribute)theEObject;
        T result = caseToLeftOfAttribute(toLeftOfAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ABOVE_ATTRIBUTE:
      {
        AboveAttribute aboveAttribute = (AboveAttribute)theEObject;
        T result = caseAboveAttribute(aboveAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BELOW_ATTRIBUTE:
      {
        BelowAttribute belowAttribute = (BelowAttribute)theEObject;
        T result = caseBelowAttribute(belowAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE:
      {
        AlignLeftAttribute alignLeftAttribute = (AlignLeftAttribute)theEObject;
        T result = caseAlignLeftAttribute(alignLeftAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE:
      {
        AlignBottomAttribute alignBottomAttribute = (AlignBottomAttribute)theEObject;
        T result = caseAlignBottomAttribute(alignBottomAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALIGN_TOP_ATTRIBUTE:
      {
        AlignTopAttribute alignTopAttribute = (AlignTopAttribute)theEObject;
        T result = caseAlignTopAttribute(alignTopAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE:
      {
        AlignParentLeftAttribute alignParentLeftAttribute = (AlignParentLeftAttribute)theEObject;
        T result = caseAlignParentLeftAttribute(alignParentLeftAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE:
      {
        AlignParentTopAttribute alignParentTopAttribute = (AlignParentTopAttribute)theEObject;
        T result = caseAlignParentTopAttribute(alignParentTopAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE:
      {
        AlignParentRightAttribute alignParentRightAttribute = (AlignParentRightAttribute)theEObject;
        T result = caseAlignParentRightAttribute(alignParentRightAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE:
      {
        AlignParentBottomAttribute alignParentBottomAttribute = (AlignParentBottomAttribute)theEObject;
        T result = caseAlignParentBottomAttribute(alignParentBottomAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE:
      {
        MarginBottomAttribute marginBottomAttribute = (MarginBottomAttribute)theEObject;
        T result = caseMarginBottomAttribute(marginBottomAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE:
      {
        MarginRightAttribute marginRightAttribute = (MarginRightAttribute)theEObject;
        T result = caseMarginRightAttribute(marginRightAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE:
      {
        MarginTopAttribute marginTopAttribute = (MarginTopAttribute)theEObject;
        T result = caseMarginTopAttribute(marginTopAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.WEIGHT_ATTRIBUTE:
      {
        WeightAttribute weightAttribute = (WeightAttribute)theEObject;
        T result = caseWeightAttribute(weightAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE:
      {
        MarginLeftAttribute marginLeftAttribute = (MarginLeftAttribute)theEObject;
        T result = caseMarginLeftAttribute(marginLeftAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE:
      {
        TextStyleAttribute textStyleAttribute = (TextStyleAttribute)theEObject;
        T result = caseTextStyleAttribute(textStyleAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TYPEFACE_ATTRIBUTE:
      {
        TypefaceAttribute typefaceAttribute = (TypefaceAttribute)theEObject;
        T result = caseTypefaceAttribute(typefaceAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TEXT_COLOR_ATTRIBUTE:
      {
        TextColorAttribute textColorAttribute = (TextColorAttribute)theEObject;
        T result = caseTextColorAttribute(textColorAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE:
      {
        SingleLineAttribute singleLineAttribute = (SingleLineAttribute)theEObject;
        T result = caseSingleLineAttribute(singleLineAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PHONE_NUMBER_ATTRIBUTE:
      {
        PhoneNumberAttribute phoneNumberAttribute = (PhoneNumberAttribute)theEObject;
        T result = casePhoneNumberAttribute(phoneNumberAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PASSWORD_ATTRIBUTE:
      {
        PasswordAttribute passwordAttribute = (PasswordAttribute)theEObject;
        T result = casePasswordAttribute(passwordAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.NUMERIC_ATTRIBUTE:
      {
        NumericAttribute numericAttribute = (NumericAttribute)theEObject;
        T result = caseNumericAttribute(numericAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.HINT_ATTRIBUTE:
      {
        HintAttribute hintAttribute = (HintAttribute)theEObject;
        T result = caseHintAttribute(hintAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.EDITABLE_ATTRIBUTE:
      {
        EditableAttribute editableAttribute = (EditableAttribute)theEObject;
        T result = caseEditableAttribute(editableAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DIGITS_ATTRIBUTE:
      {
        DigitsAttribute digitsAttribute = (DigitsAttribute)theEObject;
        T result = caseDigitsAttribute(digitsAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CAPITALIZE_ATTRIBUTE:
      {
        CapitalizeAttribute capitalizeAttribute = (CapitalizeAttribute)theEObject;
        T result = caseCapitalizeAttribute(capitalizeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE:
      {
        AutoTextAttribute autoTextAttribute = (AutoTextAttribute)theEObject;
        T result = caseAutoTextAttribute(autoTextAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE:
      {
        IsScrollContainerAttribute isScrollContainerAttribute = (IsScrollContainerAttribute)theEObject;
        T result = caseIsScrollContainerAttribute(isScrollContainerAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE:
      {
        FadeScrollBarsAttribute fadeScrollBarsAttribute = (FadeScrollBarsAttribute)theEObject;
        T result = caseFadeScrollBarsAttribute(fadeScrollBarsAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CLICKABLE_ATTRIBUTE:
      {
        ClickableAttribute clickableAttribute = (ClickableAttribute)theEObject;
        T result = caseClickableAttribute(clickableAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE:
      {
        AutoLinkAttribute autoLinkAttribute = (AutoLinkAttribute)theEObject;
        T result = caseAutoLinkAttribute(autoLinkAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.WIDTH_ATTRIBUTE:
      {
        WidthAttribute widthAttribute = (WidthAttribute)theEObject;
        T result = caseWidthAttribute(widthAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.HEIGHT_ATTRIBUTE:
      {
        HeightAttribute heightAttribute = (HeightAttribute)theEObject;
        T result = caseHeightAttribute(heightAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.PADDING_ATTRIBUTE:
      {
        PaddingAttribute paddingAttribute = (PaddingAttribute)theEObject;
        T result = casePaddingAttribute(paddingAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GRAVITY_ATTRIBUTE:
      {
        GravityAttribute gravityAttribute = (GravityAttribute)theEObject;
        T result = caseGravityAttribute(gravityAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE:
      {
        TextSizeAttribute textSizeAttribute = (TextSizeAttribute)theEObject;
        T result = caseTextSizeAttribute(textSizeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BACKGROUND_ATTRIBUTE:
      {
        BackgroundAttribute backgroundAttribute = (BackgroundAttribute)theEObject;
        T result = caseBackgroundAttribute(backgroundAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE:
      {
        ColumnWidthAttribute columnWidthAttribute = (ColumnWidthAttribute)theEObject;
        T result = caseColumnWidthAttribute(columnWidthAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE:
      {
        HorizontalSpacingAttribute horizontalSpacingAttribute = (HorizontalSpacingAttribute)theEObject;
        T result = caseHorizontalSpacingAttribute(horizontalSpacingAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE:
      {
        NumColumnsAttribute numColumnsAttribute = (NumColumnsAttribute)theEObject;
        T result = caseNumColumnsAttribute(numColumnsAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE:
      {
        StretchModeAttribute stretchModeAttribute = (StretchModeAttribute)theEObject;
        T result = caseStretchModeAttribute(stretchModeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE:
      {
        VerticalSpacingAttribute verticalSpacingAttribute = (VerticalSpacingAttribute)theEObject;
        T result = caseVerticalSpacingAttribute(verticalSpacingAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ENTRIES_ATTRIBUTE:
      {
        EntriesAttribute entriesAttribute = (EntriesAttribute)theEObject;
        T result = caseEntriesAttribute(entriesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE:
      {
        StretchColumnsAttribute stretchColumnsAttribute = (StretchColumnsAttribute)theEObject;
        T result = caseStretchColumnsAttribute(stretchColumnsAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE:
      {
        ShrinkColumnsAttribute shrinkColumnsAttribute = (ShrinkColumnsAttribute)theEObject;
        T result = caseShrinkColumnsAttribute(shrinkColumnsAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE:
      {
        CollapseColumnsAttribute collapseColumnsAttribute = (CollapseColumnsAttribute)theEObject;
        T result = caseCollapseColumnsAttribute(collapseColumnsAttribute);
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
      case AndroTextDslPackage.PROPERTY_VALUE:
      {
        PropertyValue propertyValue = (PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANY_DRAWABLE_PROPERTY_VALUE:
      {
        AnyDrawablePropertyValue anyDrawablePropertyValue = (AnyDrawablePropertyValue)theEObject;
        T result = caseAnyDrawablePropertyValue(anyDrawablePropertyValue);
        if (result == null) result = casePropertyValue(anyDrawablePropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.STRING_PROPERTY_VALUE:
      {
        StringPropertyValue stringPropertyValue = (StringPropertyValue)theEObject;
        T result = caseStringPropertyValue(stringPropertyValue);
        if (result == null) result = casePropertyValue(stringPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.INTEGER_PROPERTY_VALUE:
      {
        IntegerPropertyValue integerPropertyValue = (IntegerPropertyValue)theEObject;
        T result = caseIntegerPropertyValue(integerPropertyValue);
        if (result == null) result = casePropertyValue(integerPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BOOLEAN_PROPERTY_VALUE:
      {
        BooleanPropertyValue booleanPropertyValue = (BooleanPropertyValue)theEObject;
        T result = caseBooleanPropertyValue(booleanPropertyValue);
        if (result == null) result = casePropertyValue(booleanPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLOR_PROPERTY_VALUE:
      {
        ColorPropertyValue colorPropertyValue = (ColorPropertyValue)theEObject;
        T result = caseColorPropertyValue(colorPropertyValue);
        if (result == null) result = caseAnyDrawablePropertyValue(colorPropertyValue);
        if (result == null) result = casePropertyValue(colorPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE:
      {
        LayoutDimensionPropertyValue layoutDimensionPropertyValue = (LayoutDimensionPropertyValue)theEObject;
        T result = caseLayoutDimensionPropertyValue(layoutDimensionPropertyValue);
        if (result == null) result = casePropertyValue(layoutDimensionPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DIMENSION_PROPERTY_VALUE:
      {
        DimensionPropertyValue dimensionPropertyValue = (DimensionPropertyValue)theEObject;
        T result = caseDimensionPropertyValue(dimensionPropertyValue);
        if (result == null) result = caseLayoutDimensionPropertyValue(dimensionPropertyValue);
        if (result == null) result = casePropertyValue(dimensionPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DRAWABLE_RESOURCE_LINK:
      {
        DrawableResourceLink drawableResourceLink = (DrawableResourceLink)theEObject;
        T result = caseDrawableResourceLink(drawableResourceLink);
        if (result == null) result = caseAnyDrawablePropertyValue(drawableResourceLink);
        if (result == null) result = casePropertyValue(drawableResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE_LINK:
      {
        TabDrawableResourceLink tabDrawableResourceLink = (TabDrawableResourceLink)theEObject;
        T result = caseTabDrawableResourceLink(tabDrawableResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK:
      {
        ExternalDrawableResourceLink externalDrawableResourceLink = (ExternalDrawableResourceLink)theEObject;
        T result = caseExternalDrawableResourceLink(externalDrawableResourceLink);
        if (result == null) result = caseAnyDrawablePropertyValue(externalDrawableResourceLink);
        if (result == null) result = casePropertyValue(externalDrawableResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.STRING_RESOURCE_LINK:
      {
        StringResourceLink stringResourceLink = (StringResourceLink)theEObject;
        T result = caseStringResourceLink(stringResourceLink);
        if (result == null) result = caseStringPropertyValue(stringResourceLink);
        if (result == null) result = casePropertyValue(stringResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.INTEGER_RESOURCE_LINK:
      {
        IntegerResourceLink integerResourceLink = (IntegerResourceLink)theEObject;
        T result = caseIntegerResourceLink(integerResourceLink);
        if (result == null) result = caseIntegerPropertyValue(integerResourceLink);
        if (result == null) result = casePropertyValue(integerResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BOOLEAN_RESOURCE_LINK:
      {
        BooleanResourceLink booleanResourceLink = (BooleanResourceLink)theEObject;
        T result = caseBooleanResourceLink(booleanResourceLink);
        if (result == null) result = caseBooleanPropertyValue(booleanResourceLink);
        if (result == null) result = casePropertyValue(booleanResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLOR_RESOURCE_LINK:
      {
        ColorResourceLink colorResourceLink = (ColorResourceLink)theEObject;
        T result = caseColorResourceLink(colorResourceLink);
        if (result == null) result = caseColorPropertyValue(colorResourceLink);
        if (result == null) result = caseAnyDrawablePropertyValue(colorResourceLink);
        if (result == null) result = casePropertyValue(colorResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DIMENSION_RESOURCE_LINK:
      {
        DimensionResourceLink dimensionResourceLink = (DimensionResourceLink)theEObject;
        T result = caseDimensionResourceLink(dimensionResourceLink);
        if (result == null) result = caseDimensionPropertyValue(dimensionResourceLink);
        if (result == null) result = caseLayoutDimensionPropertyValue(dimensionResourceLink);
        if (result == null) result = casePropertyValue(dimensionResourceLink);
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
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE:
      {
        TabDrawableResource tabDrawableResource = (TabDrawableResource)theEObject;
        T result = caseTabDrawableResource(tabDrawableResource);
        if (result == null) result = caseResource(tabDrawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DIMENSION_VALUE:
      {
        DimensionValue dimensionValue = (DimensionValue)theEObject;
        T result = caseDimensionValue(dimensionValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BASE_GAME_ACTIVITY:
      {
        BaseGameActivity baseGameActivity = (BaseGameActivity)theEObject;
        T result = caseBaseGameActivity(baseGameActivity);
        if (result == null) result = caseActivity(baseGameActivity);
        if (result == null) result = caseAndroidApplicationModelElement(baseGameActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_GAME_ROOT:
      {
        AndroGameRoot androGameRoot = (AndroGameRoot)theEObject;
        T result = caseAndroGameRoot(androGameRoot);
        if (result == null) result = caseModelRoot(androGameRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_GAME_COMPONENT:
      {
        AndroGameComponent androGameComponent = (AndroGameComponent)theEObject;
        T result = caseAndroGameComponent(androGameComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_GAME_GUI:
      {
        AndroGameGui androGameGui = (AndroGameGui)theEObject;
        T result = caseAndroGameGui(androGameGui);
        if (result == null) result = caseAndroGameComponent(androGameGui);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANDRO_GAME_LOGIC:
      {
        AndroGameLogic androGameLogic = (AndroGameLogic)theEObject;
        T result = caseAndroGameLogic(androGameLogic);
        if (result == null) result = caseAndroGameComponent(androGameLogic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BOX2_DOPTIONS:
      {
        Box2DOptions box2DOptions = (Box2DOptions)theEObject;
        T result = caseBox2DOptions(box2DOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.JOINT:
      {
        Joint joint = (Joint)theEObject;
        T result = caseJoint(joint);
        if (result == null) result = caseLogicComponent(joint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.REVOLUTE_JOINT:
      {
        RevoluteJoint revoluteJoint = (RevoluteJoint)theEObject;
        T result = caseRevoluteJoint(revoluteJoint);
        if (result == null) result = caseJoint(revoluteJoint);
        if (result == null) result = caseLogicComponent(revoluteJoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.DISTANCE_JOINT:
      {
        DistanceJoint distanceJoint = (DistanceJoint)theEObject;
        T result = caseDistanceJoint(distanceJoint);
        if (result == null) result = caseJoint(distanceJoint);
        if (result == null) result = caseLogicComponent(distanceJoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = caseBindable(body);
        if (result == null) result = caseLogicComponent(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LINE_BODY:
      {
        LineBody lineBody = (LineBody)theEObject;
        T result = caseLineBody(lineBody);
        if (result == null) result = caseBody(lineBody);
        if (result == null) result = caseBindable(lineBody);
        if (result == null) result = caseLogicComponent(lineBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.CIRCLE_BODY:
      {
        CircleBody circleBody = (CircleBody)theEObject;
        T result = caseCircleBody(circleBody);
        if (result == null) result = caseBody(circleBody);
        if (result == null) result = caseBindable(circleBody);
        if (result == null) result = caseLogicComponent(circleBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BOX_BODY:
      {
        BoxBody boxBody = (BoxBody)theEObject;
        T result = caseBoxBody(boxBody);
        if (result == null) result = caseBody(boxBody);
        if (result == null) result = caseBindable(boxBody);
        if (result == null) result = caseLogicComponent(boxBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FIXTURE:
      {
        Fixture fixture = (Fixture)theEObject;
        T result = caseFixture(fixture);
        if (result == null) result = caseLogicComponent(fixture);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LOGIC_COMPONENT:
      {
        LogicComponent logicComponent = (LogicComponent)theEObject;
        T result = caseLogicComponent(logicComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
        if (result == null) result = caseLogicComponent(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BINDABLE:
      {
        Bindable bindable = (Bindable)theEObject;
        T result = caseBindable(bindable);
        if (result == null) result = caseLogicComponent(bindable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GAME_COMPONENT:
      {
        GameComponent gameComponent = (GameComponent)theEObject;
        T result = caseGameComponent(gameComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SCENE:
      {
        Scene scene = (Scene)theEObject;
        T result = caseScene(scene);
        if (result == null) result = caseGameComponent(scene);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MENU_SCENE:
      {
        MenuScene menuScene = (MenuScene)theEObject;
        T result = caseMenuScene(menuScene);
        if (result == null) result = caseScene(menuScene);
        if (result == null) result = caseGameComponent(menuScene);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GAME_BACKGROUND:
      {
        GameBackground gameBackground = (GameBackground)theEObject;
        T result = caseGameBackground(gameBackground);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GAME_MENU_ITEM:
      {
        GameMenuItem gameMenuItem = (GameMenuItem)theEObject;
        T result = caseGameMenuItem(gameMenuItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.GAME_ENTITY:
      {
        GameEntity gameEntity = (GameEntity)theEObject;
        T result = caseGameEntity(gameEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SIMPLE_ENTITY:
      {
        SimpleEntity simpleEntity = (SimpleEntity)theEObject;
        T result = caseSimpleEntity(simpleEntity);
        if (result == null) result = caseGameEntity(simpleEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BINDING_TARGET:
      {
        BindingTarget bindingTarget = (BindingTarget)theEObject;
        T result = caseBindingTarget(bindingTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ENTITY_BINDING_TARGET:
      {
        EntityBindingTarget entityBindingTarget = (EntityBindingTarget)theEObject;
        T result = caseEntityBindingTarget(entityBindingTarget);
        if (result == null) result = caseBindingTarget(entityBindingTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ENTITY_MODIFIER:
      {
        EntityModifier entityModifier = (EntityModifier)theEObject;
        T result = caseEntityModifier(entityModifier);
        if (result == null) result = caseBindable(entityModifier);
        if (result == null) result = caseLogicComponent(entityModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SEQUENCE_ENTITY_MODIFIER:
      {
        SequenceEntityModifier sequenceEntityModifier = (SequenceEntityModifier)theEObject;
        T result = caseSequenceEntityModifier(sequenceEntityModifier);
        if (result == null) result = caseEntityModifier(sequenceEntityModifier);
        if (result == null) result = caseBindable(sequenceEntityModifier);
        if (result == null) result = caseLogicComponent(sequenceEntityModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LOOP_ENTITY_MODIFIER:
      {
        LoopEntityModifier loopEntityModifier = (LoopEntityModifier)theEObject;
        T result = caseLoopEntityModifier(loopEntityModifier);
        if (result == null) result = caseEntityModifier(loopEntityModifier);
        if (result == null) result = caseBindable(loopEntityModifier);
        if (result == null) result = caseLogicComponent(loopEntityModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MOVE_MODIFIER:
      {
        MoveModifier moveModifier = (MoveModifier)theEObject;
        T result = caseMoveModifier(moveModifier);
        if (result == null) result = caseEntityModifier(moveModifier);
        if (result == null) result = caseBindable(moveModifier);
        if (result == null) result = caseLogicComponent(moveModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.MOVE_BY_MODIFIER:
      {
        MoveByModifier moveByModifier = (MoveByModifier)theEObject;
        T result = caseMoveByModifier(moveByModifier);
        if (result == null) result = caseEntityModifier(moveByModifier);
        if (result == null) result = caseBindable(moveByModifier);
        if (result == null) result = caseLogicComponent(moveByModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SCALE_MODIFIER:
      {
        ScaleModifier scaleModifier = (ScaleModifier)theEObject;
        T result = caseScaleModifier(scaleModifier);
        if (result == null) result = caseEntityModifier(scaleModifier);
        if (result == null) result = caseBindable(scaleModifier);
        if (result == null) result = caseLogicComponent(scaleModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ALPHA_MODIFIER:
      {
        AlphaModifier alphaModifier = (AlphaModifier)theEObject;
        T result = caseAlphaModifier(alphaModifier);
        if (result == null) result = caseEntityModifier(alphaModifier);
        if (result == null) result = caseBindable(alphaModifier);
        if (result == null) result = caseLogicComponent(alphaModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ROTATION_BY_MODIFIER:
      {
        RotationByModifier rotationByModifier = (RotationByModifier)theEObject;
        T result = caseRotationByModifier(rotationByModifier);
        if (result == null) result = caseEntityModifier(rotationByModifier);
        if (result == null) result = caseBindable(rotationByModifier);
        if (result == null) result = caseLogicComponent(rotationByModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ROTATION_MODIFIER:
      {
        RotationModifier rotationModifier = (RotationModifier)theEObject;
        T result = caseRotationModifier(rotationModifier);
        if (result == null) result = caseEntityModifier(rotationModifier);
        if (result == null) result = caseBindable(rotationModifier);
        if (result == null) result = caseLogicComponent(rotationModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLOR_MODIFIER:
      {
        ColorModifier colorModifier = (ColorModifier)theEObject;
        T result = caseColorModifier(colorModifier);
        if (result == null) result = caseEntityModifier(colorModifier);
        if (result == null) result = caseBindable(colorModifier);
        if (result == null) result = caseLogicComponent(colorModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TO_TRIPLE:
      {
        ToTriple toTriple = (ToTriple)theEObject;
        T result = caseToTriple(toTriple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FROM_TRIPLE:
      {
        FromTriple fromTriple = (FromTriple)theEObject;
        T result = caseFromTriple(fromTriple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TO_DOUBLE:
      {
        ToDouble toDouble = (ToDouble)theEObject;
        T result = caseToDouble(toDouble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FROM_DOUBLE:
      {
        FromDouble fromDouble = (FromDouble)theEObject;
        T result = caseFromDouble(fromDouble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TO_SINGLE:
      {
        ToSingle toSingle = (ToSingle)theEObject;
        T result = caseToSingle(toSingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FROM_SINGLE:
      {
        FromSingle fromSingle = (FromSingle)theEObject;
        T result = caseFromSingle(fromSingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BY_DOUBLE:
      {
        ByDouble byDouble = (ByDouble)theEObject;
        T result = caseByDouble(byDouble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.BY_SINGLE:
      {
        BySingle bySingle = (BySingle)theEObject;
        T result = caseBySingle(bySingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.LINE:
      {
        Line line = (Line)theEObject;
        T result = caseLine(line);
        if (result == null) result = caseGameEntity(line);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseGameEntity(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.RECTANGLE:
      {
        Rectangle rectangle = (Rectangle)theEObject;
        T result = caseRectangle(rectangle);
        if (result == null) result = caseGameEntity(rectangle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SPRITE:
      {
        Sprite sprite = (Sprite)theEObject;
        T result = caseSprite(sprite);
        if (result == null) result = caseGameEntity(sprite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.ANIMATED_SPRITE:
      {
        AnimatedSprite animatedSprite = (AnimatedSprite)theEObject;
        T result = caseAnimatedSprite(animatedSprite);
        if (result == null) result = caseGameEntity(animatedSprite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.POSITION:
      {
        Position position = (Position)theEObject;
        T result = casePosition(position);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.SIZE:
      {
        Size size = (Size)theEObject;
        T result = caseSize(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TEXTURE_REGION:
      {
        TextureRegion textureRegion = (TextureRegion)theEObject;
        T result = caseTextureRegion(textureRegion);
        if (result == null) result = caseGameComponent(textureRegion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.TILED:
      {
        Tiled tiled = (Tiled)theEObject;
        T result = caseTiled(tiled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroTextDslPackage.FONT:
      {
        Font font = (Font)theEObject;
        T result = caseFont(font);
        if (result == null) result = caseGameComponent(font);
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
   * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTab(Tab object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListActivity(ListActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preference Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preference Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreferenceActivity(PreferenceActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentProvider(ContentProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Content Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Content Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceContentProvider(ResourceContentProvider object)
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
   * Returns the result of interpreting the object as an instance of '<em>View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseView(View object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewGroup(ViewGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutProperties(LayoutProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutStyle(LayoutStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regular Layout Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regular Layout Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegularLayoutStyle(RegularLayoutStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fast Layout Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fast Layout Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFastLayoutStyle(FastLayoutStyle object)
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
   * Returns the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGridLayout(GridLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableLayout(TableLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableRow(TableRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleView(SimpleView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewElement(ViewElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Gallery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gallery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGallery(Gallery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expandable List View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expandable List View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpandableListView(ExpandableListView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebView(WebView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageView(ImageView object)
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
   * Returns the result of interpreting the object as an instance of '<em>Grid View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGridView(GridView object)
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
   * Returns the result of interpreting the object as an instance of '<em>Checked Text View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checked Text View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckedTextView(CheckedTextView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Auto Complete Text View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Auto Complete Text View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutoCompleteTextView(AutoCompleteTextView object)
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
   * Returns the result of interpreting the object as an instance of '<em>Span Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanAttribute(SpanAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnAttribute(ColumnAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Center Vertical Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Center Vertical Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCenterVerticalAttribute(CenterVerticalAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Center In Parent Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Center In Parent Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCenterInParentAttribute(CenterInParentAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Center Horizontal Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Center Horizontal Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCenterHorizontalAttribute(CenterHorizontalAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Right Of Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Right Of Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToRightOfAttribute(ToRightOfAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Left Of Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Left Of Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToLeftOfAttribute(ToLeftOfAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Above Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Above Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAboveAttribute(AboveAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Below Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Below Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBelowAttribute(BelowAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Left Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Left Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignLeftAttribute(AlignLeftAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Bottom Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Bottom Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignBottomAttribute(AlignBottomAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Top Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Top Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignTopAttribute(AlignTopAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Parent Left Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Parent Left Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignParentLeftAttribute(AlignParentLeftAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Parent Top Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Parent Top Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignParentTopAttribute(AlignParentTopAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Parent Right Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Parent Right Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignParentRightAttribute(AlignParentRightAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Parent Bottom Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Parent Bottom Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignParentBottomAttribute(AlignParentBottomAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Margin Bottom Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Margin Bottom Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarginBottomAttribute(MarginBottomAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Margin Right Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Margin Right Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarginRightAttribute(MarginRightAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Margin Top Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Margin Top Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarginTopAttribute(MarginTopAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weight Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weight Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeightAttribute(WeightAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Margin Left Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Margin Left Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarginLeftAttribute(MarginLeftAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Style Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Style Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextStyleAttribute(TextStyleAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typeface Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typeface Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypefaceAttribute(TypefaceAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Color Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Color Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextColorAttribute(TextColorAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Line Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Line Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleLineAttribute(SingleLineAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phone Number Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phone Number Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhoneNumberAttribute(PhoneNumberAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Password Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Password Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePasswordAttribute(PasswordAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericAttribute(NumericAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hint Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hint Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHintAttribute(HintAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Editable Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Editable Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditableAttribute(EditableAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Digits Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digits Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDigitsAttribute(DigitsAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capitalize Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capitalize Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapitalizeAttribute(CapitalizeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Auto Text Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Auto Text Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutoTextAttribute(AutoTextAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Scroll Container Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Scroll Container Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsScrollContainerAttribute(IsScrollContainerAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fade Scroll Bars Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fade Scroll Bars Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFadeScrollBarsAttribute(FadeScrollBarsAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clickable Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clickable Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClickableAttribute(ClickableAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Auto Link Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Auto Link Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutoLinkAttribute(AutoLinkAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Width Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Width Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidthAttribute(WidthAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Height Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Height Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeightAttribute(HeightAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Padding Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Padding Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePaddingAttribute(PaddingAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gravity Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gravity Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGravityAttribute(GravityAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Size Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Size Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextSizeAttribute(TextSizeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Background Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Background Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBackgroundAttribute(BackgroundAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Width Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Width Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnWidthAttribute(ColumnWidthAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Horizontal Spacing Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Horizontal Spacing Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHorizontalSpacingAttribute(HorizontalSpacingAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Num Columns Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Num Columns Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumColumnsAttribute(NumColumnsAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stretch Mode Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stretch Mode Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStretchModeAttribute(StretchModeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vertical Spacing Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vertical Spacing Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerticalSpacingAttribute(VerticalSpacingAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entries Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entries Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntriesAttribute(EntriesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stretch Columns Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stretch Columns Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStretchColumnsAttribute(StretchColumnsAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shrink Columns Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shrink Columns Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShrinkColumnsAttribute(ShrinkColumnsAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collapse Columns Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collapse Columns Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollapseColumnsAttribute(CollapseColumnsAttribute object)
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
   * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValue(PropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Drawable Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Drawable Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyDrawablePropertyValue(AnyDrawablePropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringPropertyValue(StringPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerPropertyValue(IntegerPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanPropertyValue(BooleanPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorPropertyValue(ColorPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Dimension Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Dimension Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutDimensionPropertyValue(LayoutDimensionPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionPropertyValue(DimensionPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawable Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawable Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawableResourceLink(DrawableResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Drawable Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Drawable Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabDrawableResourceLink(TabDrawableResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Drawable Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Drawable Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalDrawableResourceLink(ExternalDrawableResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringResourceLink(StringResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerResourceLink(IntegerResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanResourceLink(BooleanResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorResourceLink(ColorResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionResourceLink(DimensionResourceLink object)
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
   * Returns the result of interpreting the object as an instance of '<em>Tab Drawable Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Drawable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabDrawableResource(TabDrawableResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionValue(DimensionValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Game Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Game Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseGameActivity(BaseGameActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Game Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Game Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroGameRoot(AndroGameRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Game Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Game Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroGameComponent(AndroGameComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Game Gui</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Game Gui</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroGameGui(AndroGameGui object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Andro Game Logic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Andro Game Logic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroGameLogic(AndroGameLogic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box2 DOptions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box2 DOptions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBox2DOptions(Box2DOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoint(Joint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Revolute Joint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Revolute Joint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRevoluteJoint(RevoluteJoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distance Joint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distance Joint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistanceJoint(DistanceJoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineBody(LineBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Circle Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Circle Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCircleBody(CircleBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxBody(BoxBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fixture</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fixture</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixture(Fixture object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicComponent(LogicComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding(Binding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bindable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bindable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindable(Bindable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameComponent(GameComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScene(Scene object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Scene</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Scene</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuScene(MenuScene object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Background</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Background</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameBackground(GameBackground object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Menu Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Menu Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameMenuItem(GameMenuItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameEntity(GameEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleEntity(SimpleEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingTarget(BindingTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Binding Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Binding Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityBindingTarget(EntityBindingTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityModifier(EntityModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Entity Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Entity Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceEntityModifier(SequenceEntityModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Entity Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Entity Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopEntityModifier(LoopEntityModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoveModifier(MoveModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move By Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move By Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoveByModifier(MoveByModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleModifier(ScaleModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlphaModifier(AlphaModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotation By Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotation By Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotationByModifier(RotationByModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotation Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotation Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotationModifier(RotationModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorModifier(ColorModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Triple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Triple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToTriple(ToTriple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Triple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Triple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromTriple(FromTriple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToDouble(ToDouble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromDouble(FromDouble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToSingle(ToSingle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromSingle(FromSingle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>By Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>By Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseByDouble(ByDouble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>By Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>By Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBySingle(BySingle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRectangle(Rectangle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sprite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sprite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSprite(Sprite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Animated Sprite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animated Sprite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimatedSprite(AnimatedSprite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePosition(Position object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSize(Size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Texture Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextureRegion(TextureRegion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tiled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tiled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTiled(Tiled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFont(Font object)
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
