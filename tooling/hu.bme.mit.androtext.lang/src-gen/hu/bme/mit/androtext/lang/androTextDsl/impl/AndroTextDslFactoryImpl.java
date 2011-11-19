/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroTextDslFactoryImpl extends EFactoryImpl implements AndroTextDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroTextDslFactory init()
  {
    try
    {
      AndroTextDslFactory theAndroTextDslFactory = (AndroTextDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bme.hu/mit/androtext/lang/AndroTextDsl"); 
      if (theAndroTextDslFactory != null)
      {
        return theAndroTextDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AndroTextDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroTextDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT: return createAndroTextModelRoot();
      case AndroTextDslPackage.MODEL_ROOT: return createModelRoot();
      case AndroTextDslPackage.IMPORT: return createImport();
      case AndroTextDslPackage.ANDRO_GEN_MODEL_ROOT: return createAndroGenModelRoot();
      case AndroTextDslPackage.TARGET_APPLICATION: return createTargetApplication();
      case AndroTextDslPackage.ANDROID_APPLICATION: return createAndroidApplication();
      case AndroTextDslPackage.ANDROID_APPLICATION_MODEL_ELEMENT: return createAndroidApplicationModelElement();
      case AndroTextDslPackage.ACTIVITY: return createActivity();
      case AndroTextDslPackage.TAB_ACTIVITY: return createTabActivity();
      case AndroTextDslPackage.ANDRO_DATA_MODEL_ROOT: return createAndroDataModelRoot();
      case AndroTextDslPackage.ENTITY: return createEntity();
      case AndroTextDslPackage.PROPERTY: return createProperty();
      case AndroTextDslPackage.TYPE_REF: return createTypeRef();
      case AndroTextDslPackage.DATA_TYPES_REF: return createDataTypesRef();
      case AndroTextDslPackage.ENTITY_TYPE_REF: return createEntityTypeRef();
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT: return createAndroGuiModelRoot();
      case AndroTextDslPackage.UI_ELEMENT: return createUIElement();
      case AndroTextDslPackage.LAYOUT: return createLayout();
      case AndroTextDslPackage.ROOT_LAYOUT: return createRootLayout();
      case AndroTextDslPackage.BASE_LAYOUT: return createBaseLayout();
      case AndroTextDslPackage.ABSOLUTE_LAYOUT: return createAbsoluteLayout();
      case AndroTextDslPackage.LINEAR_LAYOUT: return createLinearLayout();
      case AndroTextDslPackage.FRAME_LAYOUT: return createFrameLayout();
      case AndroTextDslPackage.RELATIVE_LAYOUT: return createRelativeLayout();
      case AndroTextDslPackage.WIDGET: return createWidget();
      case AndroTextDslPackage.TEXT_VIEW: return createTextView();
      case AndroTextDslPackage.EDIT_TEXT: return createEditText();
      case AndroTextDslPackage.BUTTON: return createButton();
      case AndroTextDslPackage.LIST_VIEW: return createListView();
      case AndroTextDslPackage.SPINNER: return createSpinner();
      case AndroTextDslPackage.CHECK_BOX: return createCheckBox();
      case AndroTextDslPackage.RADIO_GROUP: return createRadioGroup();
      case AndroTextDslPackage.RATING_BAR: return createRatingBar();
      case AndroTextDslPackage.TOGGLE_BUTTON: return createToggleButton();
      case AndroTextDslPackage.RADIO_BUTTON: return createRadioButton();
      case AndroTextDslPackage.ABSTRACT_PREFERENCE: return createAbstractPreference();
      case AndroTextDslPackage.PREFERENCE: return createPreference();
      case AndroTextDslPackage.PREFERENCE_SCREEN: return createPreferenceScreen();
      case AndroTextDslPackage.PREFERENCE_CATEGORY: return createPreferenceCategory();
      case AndroTextDslPackage.EDIT_TEXT_PREFERENCE: return createEditTextPreference();
      case AndroTextDslPackage.LIST_PREFERENCE: return createListPreference();
      case AndroTextDslPackage.CHECK_BOX_PREFERENCE: return createCheckBoxPreference();
      case AndroTextDslPackage.RINGTONE_PREFENCE: return createRingtonePrefence();
      case AndroTextDslPackage.PREFERENCE_ATTRIBUTES: return createPreferenceAttributes();
      case AndroTextDslPackage.DIALOG_PREFERENCE_ATTRIBUTES: return createDialogPreferenceAttributes();
      case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES: return createListPreferenceAttributes();
      case AndroTextDslPackage.ANDRO_RES_MODEL_ROOT: return createAndroResModelRoot();
      case AndroTextDslPackage.RESOURCE: return createResource();
      case AndroTextDslPackage.STRING_RESOURCE: return createStringResource();
      case AndroTextDslPackage.INTEGER_RESOURCE: return createIntegerResource();
      case AndroTextDslPackage.BOOLEAN_RESOURCE: return createBooleanResource();
      case AndroTextDslPackage.COLOR_RESOURCE: return createColorResource();
      case AndroTextDslPackage.DIMENSION_RESOURCE: return createDimensionResource();
      case AndroTextDslPackage.ARRAY_RESOURCE: return createArrayResource();
      case AndroTextDslPackage.INTEGER_ARRAY_RESOURCE: return createIntegerArrayResource();
      case AndroTextDslPackage.INTEGER_ARRAY_ENTRY: return createIntegerArrayEntry();
      case AndroTextDslPackage.STRING_ARRAY_RESOURCE: return createStringArrayResource();
      case AndroTextDslPackage.STRING_ARRAY_ENTRY: return createStringArrayEntry();
      case AndroTextDslPackage.DRAWABLE_RESOURCE: return createDrawableResource();
      case AndroTextDslPackage.BITMAP_DRAWABLE_RESOURCE: return createBitmapDrawableResource();
      case AndroTextDslPackage.TRANSITION_DRAWABLE_RESOURCE: return createTransitionDrawableResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AndroTextDslPackage.API_LEVEL:
        return createApiLevelFromString(eDataType, initialValue);
      case AndroTextDslPackage.DATA_TYPES:
        return createDataTypesFromString(eDataType, initialValue);
      case AndroTextDslPackage.LAYOUT_STYLE:
        return createLayoutStyleFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AndroTextDslPackage.API_LEVEL:
        return convertApiLevelToString(eDataType, instanceValue);
      case AndroTextDslPackage.DATA_TYPES:
        return convertDataTypesToString(eDataType, instanceValue);
      case AndroTextDslPackage.LAYOUT_STYLE:
        return convertLayoutStyleToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroTextModelRoot createAndroTextModelRoot()
  {
    AndroTextModelRootImpl androTextModelRoot = new AndroTextModelRootImpl();
    return androTextModelRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelRoot createModelRoot()
  {
    ModelRootImpl modelRoot = new ModelRootImpl();
    return modelRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroGenModelRoot createAndroGenModelRoot()
  {
    AndroGenModelRootImpl androGenModelRoot = new AndroGenModelRootImpl();
    return androGenModelRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetApplication createTargetApplication()
  {
    TargetApplicationImpl targetApplication = new TargetApplicationImpl();
    return targetApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidApplication createAndroidApplication()
  {
    AndroidApplicationImpl androidApplication = new AndroidApplicationImpl();
    return androidApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidApplicationModelElement createAndroidApplicationModelElement()
  {
    AndroidApplicationModelElementImpl androidApplicationModelElement = new AndroidApplicationModelElementImpl();
    return androidApplicationModelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabActivity createTabActivity()
  {
    TabActivityImpl tabActivity = new TabActivityImpl();
    return tabActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroDataModelRoot createAndroDataModelRoot()
  {
    AndroDataModelRootImpl androDataModelRoot = new AndroDataModelRootImpl();
    return androDataModelRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypesRef createDataTypesRef()
  {
    DataTypesRefImpl dataTypesRef = new DataTypesRefImpl();
    return dataTypesRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityTypeRef createEntityTypeRef()
  {
    EntityTypeRefImpl entityTypeRef = new EntityTypeRefImpl();
    return entityTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroGuiModelRoot createAndroGuiModelRoot()
  {
    AndroGuiModelRootImpl androGuiModelRoot = new AndroGuiModelRootImpl();
    return androGuiModelRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIElement createUIElement()
  {
    UIElementImpl uiElement = new UIElementImpl();
    return uiElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootLayout createRootLayout()
  {
    RootLayoutImpl rootLayout = new RootLayoutImpl();
    return rootLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseLayout createBaseLayout()
  {
    BaseLayoutImpl baseLayout = new BaseLayoutImpl();
    return baseLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsoluteLayout createAbsoluteLayout()
  {
    AbsoluteLayoutImpl absoluteLayout = new AbsoluteLayoutImpl();
    return absoluteLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinearLayout createLinearLayout()
  {
    LinearLayoutImpl linearLayout = new LinearLayoutImpl();
    return linearLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FrameLayout createFrameLayout()
  {
    FrameLayoutImpl frameLayout = new FrameLayoutImpl();
    return frameLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeLayout createRelativeLayout()
  {
    RelativeLayoutImpl relativeLayout = new RelativeLayoutImpl();
    return relativeLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Widget createWidget()
  {
    WidgetImpl widget = new WidgetImpl();
    return widget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextView createTextView()
  {
    TextViewImpl textView = new TextViewImpl();
    return textView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditText createEditText()
  {
    EditTextImpl editText = new EditTextImpl();
    return editText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListView createListView()
  {
    ListViewImpl listView = new ListViewImpl();
    return listView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spinner createSpinner()
  {
    SpinnerImpl spinner = new SpinnerImpl();
    return spinner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBox createCheckBox()
  {
    CheckBoxImpl checkBox = new CheckBoxImpl();
    return checkBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadioGroup createRadioGroup()
  {
    RadioGroupImpl radioGroup = new RadioGroupImpl();
    return radioGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RatingBar createRatingBar()
  {
    RatingBarImpl ratingBar = new RatingBarImpl();
    return ratingBar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToggleButton createToggleButton()
  {
    ToggleButtonImpl toggleButton = new ToggleButtonImpl();
    return toggleButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadioButton createRadioButton()
  {
    RadioButtonImpl radioButton = new RadioButtonImpl();
    return radioButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPreference createAbstractPreference()
  {
    AbstractPreferenceImpl abstractPreference = new AbstractPreferenceImpl();
    return abstractPreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preference createPreference()
  {
    PreferenceImpl preference = new PreferenceImpl();
    return preference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceScreen createPreferenceScreen()
  {
    PreferenceScreenImpl preferenceScreen = new PreferenceScreenImpl();
    return preferenceScreen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceCategory createPreferenceCategory()
  {
    PreferenceCategoryImpl preferenceCategory = new PreferenceCategoryImpl();
    return preferenceCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditTextPreference createEditTextPreference()
  {
    EditTextPreferenceImpl editTextPreference = new EditTextPreferenceImpl();
    return editTextPreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListPreference createListPreference()
  {
    ListPreferenceImpl listPreference = new ListPreferenceImpl();
    return listPreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBoxPreference createCheckBoxPreference()
  {
    CheckBoxPreferenceImpl checkBoxPreference = new CheckBoxPreferenceImpl();
    return checkBoxPreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RingtonePrefence createRingtonePrefence()
  {
    RingtonePrefenceImpl ringtonePrefence = new RingtonePrefenceImpl();
    return ringtonePrefence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceAttributes createPreferenceAttributes()
  {
    PreferenceAttributesImpl preferenceAttributes = new PreferenceAttributesImpl();
    return preferenceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogPreferenceAttributes createDialogPreferenceAttributes()
  {
    DialogPreferenceAttributesImpl dialogPreferenceAttributes = new DialogPreferenceAttributesImpl();
    return dialogPreferenceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListPreferenceAttributes createListPreferenceAttributes()
  {
    ListPreferenceAttributesImpl listPreferenceAttributes = new ListPreferenceAttributesImpl();
    return listPreferenceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroResModelRoot createAndroResModelRoot()
  {
    AndroResModelRootImpl androResModelRoot = new AndroResModelRootImpl();
    return androResModelRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringResource createStringResource()
  {
    StringResourceImpl stringResource = new StringResourceImpl();
    return stringResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerResource createIntegerResource()
  {
    IntegerResourceImpl integerResource = new IntegerResourceImpl();
    return integerResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanResource createBooleanResource()
  {
    BooleanResourceImpl booleanResource = new BooleanResourceImpl();
    return booleanResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorResource createColorResource()
  {
    ColorResourceImpl colorResource = new ColorResourceImpl();
    return colorResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionResource createDimensionResource()
  {
    DimensionResourceImpl dimensionResource = new DimensionResourceImpl();
    return dimensionResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayResource createArrayResource()
  {
    ArrayResourceImpl arrayResource = new ArrayResourceImpl();
    return arrayResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerArrayResource createIntegerArrayResource()
  {
    IntegerArrayResourceImpl integerArrayResource = new IntegerArrayResourceImpl();
    return integerArrayResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerArrayEntry createIntegerArrayEntry()
  {
    IntegerArrayEntryImpl integerArrayEntry = new IntegerArrayEntryImpl();
    return integerArrayEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayResource createStringArrayResource()
  {
    StringArrayResourceImpl stringArrayResource = new StringArrayResourceImpl();
    return stringArrayResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringArrayEntry createStringArrayEntry()
  {
    StringArrayEntryImpl stringArrayEntry = new StringArrayEntryImpl();
    return stringArrayEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableResource createDrawableResource()
  {
    DrawableResourceImpl drawableResource = new DrawableResourceImpl();
    return drawableResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitmapDrawableResource createBitmapDrawableResource()
  {
    BitmapDrawableResourceImpl bitmapDrawableResource = new BitmapDrawableResourceImpl();
    return bitmapDrawableResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDrawableResource createTransitionDrawableResource()
  {
    TransitionDrawableResourceImpl transitionDrawableResource = new TransitionDrawableResourceImpl();
    return transitionDrawableResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApiLevel createApiLevelFromString(EDataType eDataType, String initialValue)
  {
    ApiLevel result = ApiLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertApiLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypes createDataTypesFromString(EDataType eDataType, String initialValue)
  {
    DataTypes result = DataTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutStyle createLayoutStyleFromString(EDataType eDataType, String initialValue)
  {
    LayoutStyle result = LayoutStyle.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLayoutStyleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroTextDslPackage getAndroTextDslPackage()
  {
    return (AndroTextDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AndroTextDslPackage getPackage()
  {
    return AndroTextDslPackage.eINSTANCE;
  }

} //AndroTextDslFactoryImpl
