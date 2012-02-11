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
      case AndroTextDslPackage.TAB: return createTab();
      case AndroTextDslPackage.LIST_ACTIVITY: return createListActivity();
      case AndroTextDslPackage.PREFERENCE_ACTIVITY: return createPreferenceActivity();
      case AndroTextDslPackage.CONTENT_PROVIDER: return createContentProvider();
      case AndroTextDslPackage.RESOURCE_CONTENT_PROVIDER: return createResourceContentProvider();
      case AndroTextDslPackage.ACTION: return createAction();
      case AndroTextDslPackage.INVOKE_ACTIVITY: return createInvokeActivity();
      case AndroTextDslPackage.ANDRO_DATA_MODEL_ROOT: return createAndroDataModelRoot();
      case AndroTextDslPackage.ENTITY: return createEntity();
      case AndroTextDslPackage.PROPERTY: return createProperty();
      case AndroTextDslPackage.TYPE_REF: return createTypeRef();
      case AndroTextDslPackage.DATA_TYPES_REF: return createDataTypesRef();
      case AndroTextDslPackage.ENTITY_TYPE_REF: return createEntityTypeRef();
      case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT: return createAndroGuiModelRoot();
      case AndroTextDslPackage.VIEW: return createView();
      case AndroTextDslPackage.VIEW_GROUP: return createViewGroup();
      case AndroTextDslPackage.LAYOUT_PROPERTIES: return createLayoutProperties();
      case AndroTextDslPackage.LAYOUT_STYLE: return createLayoutStyle();
      case AndroTextDslPackage.REGULAR_LAYOUT_STYLE: return createRegularLayoutStyle();
      case AndroTextDslPackage.FAST_LAYOUT_STYLE: return createFastLayoutStyle();
      case AndroTextDslPackage.ABSOLUTE_LAYOUT: return createAbsoluteLayout();
      case AndroTextDslPackage.LINEAR_LAYOUT: return createLinearLayout();
      case AndroTextDslPackage.FRAME_LAYOUT: return createFrameLayout();
      case AndroTextDslPackage.RELATIVE_LAYOUT: return createRelativeLayout();
      case AndroTextDslPackage.GRID_LAYOUT: return createGridLayout();
      case AndroTextDslPackage.TABLE_LAYOUT: return createTableLayout();
      case AndroTextDslPackage.TABLE_ROW: return createTableRow();
      case AndroTextDslPackage.SIMPLE_VIEW: return createSimpleView();
      case AndroTextDslPackage.VIEW_ELEMENT: return createViewElement();
      case AndroTextDslPackage.TEXT_VIEW: return createTextView();
      case AndroTextDslPackage.EDIT_TEXT: return createEditText();
      case AndroTextDslPackage.BUTTON: return createButton();
      case AndroTextDslPackage.GALLERY: return createGallery();
      case AndroTextDslPackage.EXPANDABLE_LIST_VIEW: return createExpandableListView();
      case AndroTextDslPackage.WEB_VIEW: return createWebView();
      case AndroTextDslPackage.IMAGE_VIEW: return createImageView();
      case AndroTextDslPackage.LIST_VIEW: return createListView();
      case AndroTextDslPackage.GRID_VIEW: return createGridView();
      case AndroTextDslPackage.SPINNER: return createSpinner();
      case AndroTextDslPackage.CHECK_BOX: return createCheckBox();
      case AndroTextDslPackage.RADIO_GROUP: return createRadioGroup();
      case AndroTextDslPackage.RATING_BAR: return createRatingBar();
      case AndroTextDslPackage.TOGGLE_BUTTON: return createToggleButton();
      case AndroTextDslPackage.RADIO_BUTTON: return createRadioButton();
      case AndroTextDslPackage.CHECKED_TEXT_VIEW: return createCheckedTextView();
      case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW: return createAutoCompleteTextView();
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
      case AndroTextDslPackage.ON_CLICK_ATTRIBUTE: return createOnClickAttribute();
      case AndroTextDslPackage.SPAN_ATTRIBUTE: return createSpanAttribute();
      case AndroTextDslPackage.COLUMN_ATTRIBUTE: return createColumnAttribute();
      case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE: return createCenterVerticalAttribute();
      case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE: return createCenterInParentAttribute();
      case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE: return createCenterHorizontalAttribute();
      case AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE: return createToRightOfAttribute();
      case AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE: return createToLeftOfAttribute();
      case AndroTextDslPackage.ABOVE_ATTRIBUTE: return createAboveAttribute();
      case AndroTextDslPackage.BELOW_ATTRIBUTE: return createBelowAttribute();
      case AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE: return createAlignLeftAttribute();
      case AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE: return createAlignBottomAttribute();
      case AndroTextDslPackage.ALIGN_TOP_ATTRIBUTE: return createAlignTopAttribute();
      case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE: return createAlignParentLeftAttribute();
      case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE: return createAlignParentTopAttribute();
      case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE: return createAlignParentRightAttribute();
      case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE: return createAlignParentBottomAttribute();
      case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE: return createMarginBottomAttribute();
      case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE: return createMarginRightAttribute();
      case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE: return createMarginTopAttribute();
      case AndroTextDslPackage.WEIGHT_ATTRIBUTE: return createWeightAttribute();
      case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE: return createMarginLeftAttribute();
      case AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE: return createTextStyleAttribute();
      case AndroTextDslPackage.TYPEFACE_ATTRIBUTE: return createTypefaceAttribute();
      case AndroTextDslPackage.TEXT_COLOR_ATTRIBUTE: return createTextColorAttribute();
      case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE: return createSingleLineAttribute();
      case AndroTextDslPackage.PHONE_NUMBER_ATTRIBUTE: return createPhoneNumberAttribute();
      case AndroTextDslPackage.PASSWORD_ATTRIBUTE: return createPasswordAttribute();
      case AndroTextDslPackage.NUMERIC_ATTRIBUTE: return createNumericAttribute();
      case AndroTextDslPackage.HINT_ATTRIBUTE: return createHintAttribute();
      case AndroTextDslPackage.EDITABLE_ATTRIBUTE: return createEditableAttribute();
      case AndroTextDslPackage.DIGITS_ATTRIBUTE: return createDigitsAttribute();
      case AndroTextDslPackage.CAPITALIZE_ATTRIBUTE: return createCapitalizeAttribute();
      case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE: return createAutoTextAttribute();
      case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE: return createIsScrollContainerAttribute();
      case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE: return createFadeScrollBarsAttribute();
      case AndroTextDslPackage.CLICKABLE_ATTRIBUTE: return createClickableAttribute();
      case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE: return createAutoLinkAttribute();
      case AndroTextDslPackage.WIDTH_ATTRIBUTE: return createWidthAttribute();
      case AndroTextDslPackage.HEIGHT_ATTRIBUTE: return createHeightAttribute();
      case AndroTextDslPackage.PADDING_ATTRIBUTE: return createPaddingAttribute();
      case AndroTextDslPackage.GRAVITY_ATTRIBUTE: return createGravityAttribute();
      case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE: return createTextSizeAttribute();
      case AndroTextDslPackage.BACKGROUND_ATTRIBUTE: return createBackgroundAttribute();
      case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE: return createColumnWidthAttribute();
      case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE: return createHorizontalSpacingAttribute();
      case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE: return createNumColumnsAttribute();
      case AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE: return createStretchModeAttribute();
      case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE: return createVerticalSpacingAttribute();
      case AndroTextDslPackage.ENTRIES_ATTRIBUTE: return createEntriesAttribute();
      case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE: return createStretchColumnsAttribute();
      case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE: return createShrinkColumnsAttribute();
      case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE: return createCollapseColumnsAttribute();
      case AndroTextDslPackage.ANDRO_RES_MODEL_ROOT: return createAndroResModelRoot();
      case AndroTextDslPackage.PROPERTY_VALUE: return createPropertyValue();
      case AndroTextDslPackage.ANY_DRAWABLE_PROPERTY_VALUE: return createAnyDrawablePropertyValue();
      case AndroTextDslPackage.STRING_PROPERTY_VALUE: return createStringPropertyValue();
      case AndroTextDslPackage.INTEGER_PROPERTY_VALUE: return createIntegerPropertyValue();
      case AndroTextDslPackage.BOOLEAN_PROPERTY_VALUE: return createBooleanPropertyValue();
      case AndroTextDslPackage.COLOR_PROPERTY_VALUE: return createColorPropertyValue();
      case AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE: return createLayoutDimensionPropertyValue();
      case AndroTextDslPackage.DIMENSION_PROPERTY_VALUE: return createDimensionPropertyValue();
      case AndroTextDslPackage.DRAWABLE_RESOURCE_LINK: return createDrawableResourceLink();
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE_LINK: return createTabDrawableResourceLink();
      case AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK: return createExternalDrawableResourceLink();
      case AndroTextDslPackage.STRING_RESOURCE_LINK: return createStringResourceLink();
      case AndroTextDslPackage.INTEGER_RESOURCE_LINK: return createIntegerResourceLink();
      case AndroTextDslPackage.BOOLEAN_RESOURCE_LINK: return createBooleanResourceLink();
      case AndroTextDslPackage.COLOR_RESOURCE_LINK: return createColorResourceLink();
      case AndroTextDslPackage.DIMENSION_RESOURCE_LINK: return createDimensionResourceLink();
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
      case AndroTextDslPackage.TAB_DRAWABLE_RESOURCE: return createTabDrawableResource();
      case AndroTextDslPackage.DIMENSION_VALUE: return createDimensionValue();
      case AndroTextDslPackage.BASE_GAME_ACTIVITY: return createBaseGameActivity();
      case AndroTextDslPackage.ANDRO_GAME_ROOT: return createAndroGameRoot();
      case AndroTextDslPackage.ANDRO_GAME_COMPONENT: return createAndroGameComponent();
      case AndroTextDslPackage.ANDRO_GAME_GUI: return createAndroGameGui();
      case AndroTextDslPackage.ANDRO_GAME_LOGIC: return createAndroGameLogic();
      case AndroTextDslPackage.BOX2_DOPTIONS: return createBox2DOptions();
      case AndroTextDslPackage.JOINT: return createJoint();
      case AndroTextDslPackage.REVOLUTE_JOINT: return createRevoluteJoint();
      case AndroTextDslPackage.DISTANCE_JOINT: return createDistanceJoint();
      case AndroTextDslPackage.BODY: return createBody();
      case AndroTextDslPackage.LINE_BODY: return createLineBody();
      case AndroTextDslPackage.CIRCLE_BODY: return createCircleBody();
      case AndroTextDslPackage.BOX_BODY: return createBoxBody();
      case AndroTextDslPackage.FIXTURE: return createFixture();
      case AndroTextDslPackage.LOGIC_COMPONENT: return createLogicComponent();
      case AndroTextDslPackage.BINDING: return createBinding();
      case AndroTextDslPackage.BINDABLE: return createBindable();
      case AndroTextDslPackage.GAME_COMPONENT: return createGameComponent();
      case AndroTextDslPackage.SCENE: return createScene();
      case AndroTextDslPackage.MENU_SCENE: return createMenuScene();
      case AndroTextDslPackage.GAME_BACKGROUND: return createGameBackground();
      case AndroTextDslPackage.GAME_MENU_ITEM: return createGameMenuItem();
      case AndroTextDslPackage.GAME_ENTITY: return createGameEntity();
      case AndroTextDslPackage.SIMPLE_ENTITY: return createSimpleEntity();
      case AndroTextDslPackage.BINDING_TARGET: return createBindingTarget();
      case AndroTextDslPackage.ENTITY_BINDING_TARGET: return createEntityBindingTarget();
      case AndroTextDslPackage.ENTITY_MODIFIER: return createEntityModifier();
      case AndroTextDslPackage.SEQUENCE_ENTITY_MODIFIER: return createSequenceEntityModifier();
      case AndroTextDslPackage.LOOP_ENTITY_MODIFIER: return createLoopEntityModifier();
      case AndroTextDslPackage.MOVE_MODIFIER: return createMoveModifier();
      case AndroTextDslPackage.MOVE_BY_MODIFIER: return createMoveByModifier();
      case AndroTextDslPackage.SCALE_MODIFIER: return createScaleModifier();
      case AndroTextDslPackage.ALPHA_MODIFIER: return createAlphaModifier();
      case AndroTextDslPackage.ROTATION_BY_MODIFIER: return createRotationByModifier();
      case AndroTextDslPackage.ROTATION_MODIFIER: return createRotationModifier();
      case AndroTextDslPackage.COLOR_MODIFIER: return createColorModifier();
      case AndroTextDslPackage.TO_TRIPLE: return createToTriple();
      case AndroTextDslPackage.FROM_TRIPLE: return createFromTriple();
      case AndroTextDslPackage.TO_DOUBLE: return createToDouble();
      case AndroTextDslPackage.FROM_DOUBLE: return createFromDouble();
      case AndroTextDslPackage.TO_SINGLE: return createToSingle();
      case AndroTextDslPackage.FROM_SINGLE: return createFromSingle();
      case AndroTextDslPackage.BY_DOUBLE: return createByDouble();
      case AndroTextDslPackage.BY_SINGLE: return createBySingle();
      case AndroTextDslPackage.LINE: return createLine();
      case AndroTextDslPackage.TEXT: return createText();
      case AndroTextDslPackage.RECTANGLE: return createRectangle();
      case AndroTextDslPackage.SPRITE: return createSprite();
      case AndroTextDslPackage.ANIMATED_SPRITE: return createAnimatedSprite();
      case AndroTextDslPackage.COLOR: return createColor();
      case AndroTextDslPackage.POSITION: return createPosition();
      case AndroTextDslPackage.SIZE: return createSize();
      case AndroTextDslPackage.TEXTURE_REGION: return createTextureRegion();
      case AndroTextDslPackage.TILED: return createTiled();
      case AndroTextDslPackage.FONT: return createFont();
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
      case AndroTextDslPackage.ACTIVITY_THEME:
        return createActivityThemeFromString(eDataType, initialValue);
      case AndroTextDslPackage.DATA_TYPES:
        return createDataTypesFromString(eDataType, initialValue);
      case AndroTextDslPackage.NUMERIC_KIND:
        return createNumericKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.TYPEFACE_KIND:
        return createTypefaceKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.TEXT_STYLE_KIND:
        return createTextStyleKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.CAPITALIZE_KIND:
        return createCapitalizeKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.AUTO_LINK_KIND:
        return createAutoLinkKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.STRETCH_MODE_KIND:
        return createStretchModeKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.GRAVITY_KIND:
        return createGravityKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.FAST_LAYOUT_DIMENSION_KIND:
        return createFastLayoutDimensionKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.LAYOUT_DIMENSION_KIND:
        return createLayoutDimensionKindFromString(eDataType, initialValue);
      case AndroTextDslPackage.ANDROID_DRAWABLE_RESOURCE:
        return createAndroidDrawableResourceFromString(eDataType, initialValue);
      case AndroTextDslPackage.DIMENSION_METRIC:
        return createDimensionMetricFromString(eDataType, initialValue);
      case AndroTextDslPackage.BODY_TYPE:
        return createBodyTypeFromString(eDataType, initialValue);
      case AndroTextDslPackage.CONSTANT_COLOR:
        return createConstantColorFromString(eDataType, initialValue);
      case AndroTextDslPackage.HORIZONTAL_ALIGN:
        return createHorizontalAlignFromString(eDataType, initialValue);
      case AndroTextDslPackage.FONT_TYPE:
        return createFontTypeFromString(eDataType, initialValue);
      case AndroTextDslPackage.SCREEN_ORIENTATION:
        return createScreenOrientationFromString(eDataType, initialValue);
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
      case AndroTextDslPackage.ACTIVITY_THEME:
        return convertActivityThemeToString(eDataType, instanceValue);
      case AndroTextDslPackage.DATA_TYPES:
        return convertDataTypesToString(eDataType, instanceValue);
      case AndroTextDslPackage.NUMERIC_KIND:
        return convertNumericKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.TYPEFACE_KIND:
        return convertTypefaceKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.TEXT_STYLE_KIND:
        return convertTextStyleKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.CAPITALIZE_KIND:
        return convertCapitalizeKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.AUTO_LINK_KIND:
        return convertAutoLinkKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.STRETCH_MODE_KIND:
        return convertStretchModeKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.GRAVITY_KIND:
        return convertGravityKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.FAST_LAYOUT_DIMENSION_KIND:
        return convertFastLayoutDimensionKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.LAYOUT_DIMENSION_KIND:
        return convertLayoutDimensionKindToString(eDataType, instanceValue);
      case AndroTextDslPackage.ANDROID_DRAWABLE_RESOURCE:
        return convertAndroidDrawableResourceToString(eDataType, instanceValue);
      case AndroTextDslPackage.DIMENSION_METRIC:
        return convertDimensionMetricToString(eDataType, instanceValue);
      case AndroTextDslPackage.BODY_TYPE:
        return convertBodyTypeToString(eDataType, instanceValue);
      case AndroTextDslPackage.CONSTANT_COLOR:
        return convertConstantColorToString(eDataType, instanceValue);
      case AndroTextDslPackage.HORIZONTAL_ALIGN:
        return convertHorizontalAlignToString(eDataType, instanceValue);
      case AndroTextDslPackage.FONT_TYPE:
        return convertFontTypeToString(eDataType, instanceValue);
      case AndroTextDslPackage.SCREEN_ORIENTATION:
        return convertScreenOrientationToString(eDataType, instanceValue);
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
  public Tab createTab()
  {
    TabImpl tab = new TabImpl();
    return tab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListActivity createListActivity()
  {
    ListActivityImpl listActivity = new ListActivityImpl();
    return listActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceActivity createPreferenceActivity()
  {
    PreferenceActivityImpl preferenceActivity = new PreferenceActivityImpl();
    return preferenceActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider createContentProvider()
  {
    ContentProviderImpl contentProvider = new ContentProviderImpl();
    return contentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceContentProvider createResourceContentProvider()
  {
    ResourceContentProviderImpl resourceContentProvider = new ResourceContentProviderImpl();
    return resourceContentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokeActivity createInvokeActivity()
  {
    InvokeActivityImpl invokeActivity = new InvokeActivityImpl();
    return invokeActivity;
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
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewGroup createViewGroup()
  {
    ViewGroupImpl viewGroup = new ViewGroupImpl();
    return viewGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutProperties createLayoutProperties()
  {
    LayoutPropertiesImpl layoutProperties = new LayoutPropertiesImpl();
    return layoutProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutStyle createLayoutStyle()
  {
    LayoutStyleImpl layoutStyle = new LayoutStyleImpl();
    return layoutStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegularLayoutStyle createRegularLayoutStyle()
  {
    RegularLayoutStyleImpl regularLayoutStyle = new RegularLayoutStyleImpl();
    return regularLayoutStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastLayoutStyle createFastLayoutStyle()
  {
    FastLayoutStyleImpl fastLayoutStyle = new FastLayoutStyleImpl();
    return fastLayoutStyle;
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
  public GridLayout createGridLayout()
  {
    GridLayoutImpl gridLayout = new GridLayoutImpl();
    return gridLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableLayout createTableLayout()
  {
    TableLayoutImpl tableLayout = new TableLayoutImpl();
    return tableLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRow createTableRow()
  {
    TableRowImpl tableRow = new TableRowImpl();
    return tableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleView createSimpleView()
  {
    SimpleViewImpl simpleView = new SimpleViewImpl();
    return simpleView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewElement createViewElement()
  {
    ViewElementImpl viewElement = new ViewElementImpl();
    return viewElement;
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
  public Gallery createGallery()
  {
    GalleryImpl gallery = new GalleryImpl();
    return gallery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpandableListView createExpandableListView()
  {
    ExpandableListViewImpl expandableListView = new ExpandableListViewImpl();
    return expandableListView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebView createWebView()
  {
    WebViewImpl webView = new WebViewImpl();
    return webView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageView createImageView()
  {
    ImageViewImpl imageView = new ImageViewImpl();
    return imageView;
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
  public GridView createGridView()
  {
    GridViewImpl gridView = new GridViewImpl();
    return gridView;
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
  public CheckedTextView createCheckedTextView()
  {
    CheckedTextViewImpl checkedTextView = new CheckedTextViewImpl();
    return checkedTextView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoCompleteTextView createAutoCompleteTextView()
  {
    AutoCompleteTextViewImpl autoCompleteTextView = new AutoCompleteTextViewImpl();
    return autoCompleteTextView;
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
  public OnClickAttribute createOnClickAttribute()
  {
    OnClickAttributeImpl onClickAttribute = new OnClickAttributeImpl();
    return onClickAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanAttribute createSpanAttribute()
  {
    SpanAttributeImpl spanAttribute = new SpanAttributeImpl();
    return spanAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnAttribute createColumnAttribute()
  {
    ColumnAttributeImpl columnAttribute = new ColumnAttributeImpl();
    return columnAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterVerticalAttribute createCenterVerticalAttribute()
  {
    CenterVerticalAttributeImpl centerVerticalAttribute = new CenterVerticalAttributeImpl();
    return centerVerticalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterInParentAttribute createCenterInParentAttribute()
  {
    CenterInParentAttributeImpl centerInParentAttribute = new CenterInParentAttributeImpl();
    return centerInParentAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterHorizontalAttribute createCenterHorizontalAttribute()
  {
    CenterHorizontalAttributeImpl centerHorizontalAttribute = new CenterHorizontalAttributeImpl();
    return centerHorizontalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToRightOfAttribute createToRightOfAttribute()
  {
    ToRightOfAttributeImpl toRightOfAttribute = new ToRightOfAttributeImpl();
    return toRightOfAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToLeftOfAttribute createToLeftOfAttribute()
  {
    ToLeftOfAttributeImpl toLeftOfAttribute = new ToLeftOfAttributeImpl();
    return toLeftOfAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AboveAttribute createAboveAttribute()
  {
    AboveAttributeImpl aboveAttribute = new AboveAttributeImpl();
    return aboveAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BelowAttribute createBelowAttribute()
  {
    BelowAttributeImpl belowAttribute = new BelowAttributeImpl();
    return belowAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignLeftAttribute createAlignLeftAttribute()
  {
    AlignLeftAttributeImpl alignLeftAttribute = new AlignLeftAttributeImpl();
    return alignLeftAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignBottomAttribute createAlignBottomAttribute()
  {
    AlignBottomAttributeImpl alignBottomAttribute = new AlignBottomAttributeImpl();
    return alignBottomAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignTopAttribute createAlignTopAttribute()
  {
    AlignTopAttributeImpl alignTopAttribute = new AlignTopAttributeImpl();
    return alignTopAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentLeftAttribute createAlignParentLeftAttribute()
  {
    AlignParentLeftAttributeImpl alignParentLeftAttribute = new AlignParentLeftAttributeImpl();
    return alignParentLeftAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentTopAttribute createAlignParentTopAttribute()
  {
    AlignParentTopAttributeImpl alignParentTopAttribute = new AlignParentTopAttributeImpl();
    return alignParentTopAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentRightAttribute createAlignParentRightAttribute()
  {
    AlignParentRightAttributeImpl alignParentRightAttribute = new AlignParentRightAttributeImpl();
    return alignParentRightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignParentBottomAttribute createAlignParentBottomAttribute()
  {
    AlignParentBottomAttributeImpl alignParentBottomAttribute = new AlignParentBottomAttributeImpl();
    return alignParentBottomAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginBottomAttribute createMarginBottomAttribute()
  {
    MarginBottomAttributeImpl marginBottomAttribute = new MarginBottomAttributeImpl();
    return marginBottomAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginRightAttribute createMarginRightAttribute()
  {
    MarginRightAttributeImpl marginRightAttribute = new MarginRightAttributeImpl();
    return marginRightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginTopAttribute createMarginTopAttribute()
  {
    MarginTopAttributeImpl marginTopAttribute = new MarginTopAttributeImpl();
    return marginTopAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeightAttribute createWeightAttribute()
  {
    WeightAttributeImpl weightAttribute = new WeightAttributeImpl();
    return weightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarginLeftAttribute createMarginLeftAttribute()
  {
    MarginLeftAttributeImpl marginLeftAttribute = new MarginLeftAttributeImpl();
    return marginLeftAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextStyleAttribute createTextStyleAttribute()
  {
    TextStyleAttributeImpl textStyleAttribute = new TextStyleAttributeImpl();
    return textStyleAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypefaceAttribute createTypefaceAttribute()
  {
    TypefaceAttributeImpl typefaceAttribute = new TypefaceAttributeImpl();
    return typefaceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextColorAttribute createTextColorAttribute()
  {
    TextColorAttributeImpl textColorAttribute = new TextColorAttributeImpl();
    return textColorAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleLineAttribute createSingleLineAttribute()
  {
    SingleLineAttributeImpl singleLineAttribute = new SingleLineAttributeImpl();
    return singleLineAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhoneNumberAttribute createPhoneNumberAttribute()
  {
    PhoneNumberAttributeImpl phoneNumberAttribute = new PhoneNumberAttributeImpl();
    return phoneNumberAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PasswordAttribute createPasswordAttribute()
  {
    PasswordAttributeImpl passwordAttribute = new PasswordAttributeImpl();
    return passwordAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericAttribute createNumericAttribute()
  {
    NumericAttributeImpl numericAttribute = new NumericAttributeImpl();
    return numericAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HintAttribute createHintAttribute()
  {
    HintAttributeImpl hintAttribute = new HintAttributeImpl();
    return hintAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditableAttribute createEditableAttribute()
  {
    EditableAttributeImpl editableAttribute = new EditableAttributeImpl();
    return editableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DigitsAttribute createDigitsAttribute()
  {
    DigitsAttributeImpl digitsAttribute = new DigitsAttributeImpl();
    return digitsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapitalizeAttribute createCapitalizeAttribute()
  {
    CapitalizeAttributeImpl capitalizeAttribute = new CapitalizeAttributeImpl();
    return capitalizeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoTextAttribute createAutoTextAttribute()
  {
    AutoTextAttributeImpl autoTextAttribute = new AutoTextAttributeImpl();
    return autoTextAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsScrollContainerAttribute createIsScrollContainerAttribute()
  {
    IsScrollContainerAttributeImpl isScrollContainerAttribute = new IsScrollContainerAttributeImpl();
    return isScrollContainerAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FadeScrollBarsAttribute createFadeScrollBarsAttribute()
  {
    FadeScrollBarsAttributeImpl fadeScrollBarsAttribute = new FadeScrollBarsAttributeImpl();
    return fadeScrollBarsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickableAttribute createClickableAttribute()
  {
    ClickableAttributeImpl clickableAttribute = new ClickableAttributeImpl();
    return clickableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoLinkAttribute createAutoLinkAttribute()
  {
    AutoLinkAttributeImpl autoLinkAttribute = new AutoLinkAttributeImpl();
    return autoLinkAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WidthAttribute createWidthAttribute()
  {
    WidthAttributeImpl widthAttribute = new WidthAttributeImpl();
    return widthAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeightAttribute createHeightAttribute()
  {
    HeightAttributeImpl heightAttribute = new HeightAttributeImpl();
    return heightAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PaddingAttribute createPaddingAttribute()
  {
    PaddingAttributeImpl paddingAttribute = new PaddingAttributeImpl();
    return paddingAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GravityAttribute createGravityAttribute()
  {
    GravityAttributeImpl gravityAttribute = new GravityAttributeImpl();
    return gravityAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextSizeAttribute createTextSizeAttribute()
  {
    TextSizeAttributeImpl textSizeAttribute = new TextSizeAttributeImpl();
    return textSizeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BackgroundAttribute createBackgroundAttribute()
  {
    BackgroundAttributeImpl backgroundAttribute = new BackgroundAttributeImpl();
    return backgroundAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnWidthAttribute createColumnWidthAttribute()
  {
    ColumnWidthAttributeImpl columnWidthAttribute = new ColumnWidthAttributeImpl();
    return columnWidthAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalSpacingAttribute createHorizontalSpacingAttribute()
  {
    HorizontalSpacingAttributeImpl horizontalSpacingAttribute = new HorizontalSpacingAttributeImpl();
    return horizontalSpacingAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumColumnsAttribute createNumColumnsAttribute()
  {
    NumColumnsAttributeImpl numColumnsAttribute = new NumColumnsAttributeImpl();
    return numColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StretchModeAttribute createStretchModeAttribute()
  {
    StretchModeAttributeImpl stretchModeAttribute = new StretchModeAttributeImpl();
    return stretchModeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalSpacingAttribute createVerticalSpacingAttribute()
  {
    VerticalSpacingAttributeImpl verticalSpacingAttribute = new VerticalSpacingAttributeImpl();
    return verticalSpacingAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntriesAttribute createEntriesAttribute()
  {
    EntriesAttributeImpl entriesAttribute = new EntriesAttributeImpl();
    return entriesAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StretchColumnsAttribute createStretchColumnsAttribute()
  {
    StretchColumnsAttributeImpl stretchColumnsAttribute = new StretchColumnsAttributeImpl();
    return stretchColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShrinkColumnsAttribute createShrinkColumnsAttribute()
  {
    ShrinkColumnsAttributeImpl shrinkColumnsAttribute = new ShrinkColumnsAttributeImpl();
    return shrinkColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollapseColumnsAttribute createCollapseColumnsAttribute()
  {
    CollapseColumnsAttributeImpl collapseColumnsAttribute = new CollapseColumnsAttributeImpl();
    return collapseColumnsAttribute;
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
  public PropertyValue createPropertyValue()
  {
    PropertyValueImpl propertyValue = new PropertyValueImpl();
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyDrawablePropertyValue createAnyDrawablePropertyValue()
  {
    AnyDrawablePropertyValueImpl anyDrawablePropertyValue = new AnyDrawablePropertyValueImpl();
    return anyDrawablePropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue createStringPropertyValue()
  {
    StringPropertyValueImpl stringPropertyValue = new StringPropertyValueImpl();
    return stringPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPropertyValue createIntegerPropertyValue()
  {
    IntegerPropertyValueImpl integerPropertyValue = new IntegerPropertyValueImpl();
    return integerPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue createBooleanPropertyValue()
  {
    BooleanPropertyValueImpl booleanPropertyValue = new BooleanPropertyValueImpl();
    return booleanPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorPropertyValue createColorPropertyValue()
  {
    ColorPropertyValueImpl colorPropertyValue = new ColorPropertyValueImpl();
    return colorPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutDimensionPropertyValue createLayoutDimensionPropertyValue()
  {
    LayoutDimensionPropertyValueImpl layoutDimensionPropertyValue = new LayoutDimensionPropertyValueImpl();
    return layoutDimensionPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue createDimensionPropertyValue()
  {
    DimensionPropertyValueImpl dimensionPropertyValue = new DimensionPropertyValueImpl();
    return dimensionPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableResourceLink createDrawableResourceLink()
  {
    DrawableResourceLinkImpl drawableResourceLink = new DrawableResourceLinkImpl();
    return drawableResourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabDrawableResourceLink createTabDrawableResourceLink()
  {
    TabDrawableResourceLinkImpl tabDrawableResourceLink = new TabDrawableResourceLinkImpl();
    return tabDrawableResourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDrawableResourceLink createExternalDrawableResourceLink()
  {
    ExternalDrawableResourceLinkImpl externalDrawableResourceLink = new ExternalDrawableResourceLinkImpl();
    return externalDrawableResourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringResourceLink createStringResourceLink()
  {
    StringResourceLinkImpl stringResourceLink = new StringResourceLinkImpl();
    return stringResourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerResourceLink createIntegerResourceLink()
  {
    IntegerResourceLinkImpl integerResourceLink = new IntegerResourceLinkImpl();
    return integerResourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanResourceLink createBooleanResourceLink()
  {
    BooleanResourceLinkImpl booleanResourceLink = new BooleanResourceLinkImpl();
    return booleanResourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorResourceLink createColorResourceLink()
  {
    ColorResourceLinkImpl colorResourceLink = new ColorResourceLinkImpl();
    return colorResourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionResourceLink createDimensionResourceLink()
  {
    DimensionResourceLinkImpl dimensionResourceLink = new DimensionResourceLinkImpl();
    return dimensionResourceLink;
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
  public TabDrawableResource createTabDrawableResource()
  {
    TabDrawableResourceImpl tabDrawableResource = new TabDrawableResourceImpl();
    return tabDrawableResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionValue createDimensionValue()
  {
    DimensionValueImpl dimensionValue = new DimensionValueImpl();
    return dimensionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseGameActivity createBaseGameActivity()
  {
    BaseGameActivityImpl baseGameActivity = new BaseGameActivityImpl();
    return baseGameActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroGameRoot createAndroGameRoot()
  {
    AndroGameRootImpl androGameRoot = new AndroGameRootImpl();
    return androGameRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroGameComponent createAndroGameComponent()
  {
    AndroGameComponentImpl androGameComponent = new AndroGameComponentImpl();
    return androGameComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroGameGui createAndroGameGui()
  {
    AndroGameGuiImpl androGameGui = new AndroGameGuiImpl();
    return androGameGui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroGameLogic createAndroGameLogic()
  {
    AndroGameLogicImpl androGameLogic = new AndroGameLogicImpl();
    return androGameLogic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Box2DOptions createBox2DOptions()
  {
    Box2DOptionsImpl box2DOptions = new Box2DOptionsImpl();
    return box2DOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint createJoint()
  {
    JointImpl joint = new JointImpl();
    return joint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RevoluteJoint createRevoluteJoint()
  {
    RevoluteJointImpl revoluteJoint = new RevoluteJointImpl();
    return revoluteJoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistanceJoint createDistanceJoint()
  {
    DistanceJointImpl distanceJoint = new DistanceJointImpl();
    return distanceJoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineBody createLineBody()
  {
    LineBodyImpl lineBody = new LineBodyImpl();
    return lineBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CircleBody createCircleBody()
  {
    CircleBodyImpl circleBody = new CircleBodyImpl();
    return circleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxBody createBoxBody()
  {
    BoxBodyImpl boxBody = new BoxBodyImpl();
    return boxBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fixture createFixture()
  {
    FixtureImpl fixture = new FixtureImpl();
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicComponent createLogicComponent()
  {
    LogicComponentImpl logicComponent = new LogicComponentImpl();
    return logicComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bindable createBindable()
  {
    BindableImpl bindable = new BindableImpl();
    return bindable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameComponent createGameComponent()
  {
    GameComponentImpl gameComponent = new GameComponentImpl();
    return gameComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene createScene()
  {
    SceneImpl scene = new SceneImpl();
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuScene createMenuScene()
  {
    MenuSceneImpl menuScene = new MenuSceneImpl();
    return menuScene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameBackground createGameBackground()
  {
    GameBackgroundImpl gameBackground = new GameBackgroundImpl();
    return gameBackground;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameMenuItem createGameMenuItem()
  {
    GameMenuItemImpl gameMenuItem = new GameMenuItemImpl();
    return gameMenuItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameEntity createGameEntity()
  {
    GameEntityImpl gameEntity = new GameEntityImpl();
    return gameEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleEntity createSimpleEntity()
  {
    SimpleEntityImpl simpleEntity = new SimpleEntityImpl();
    return simpleEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingTarget createBindingTarget()
  {
    BindingTargetImpl bindingTarget = new BindingTargetImpl();
    return bindingTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityBindingTarget createEntityBindingTarget()
  {
    EntityBindingTargetImpl entityBindingTarget = new EntityBindingTargetImpl();
    return entityBindingTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityModifier createEntityModifier()
  {
    EntityModifierImpl entityModifier = new EntityModifierImpl();
    return entityModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceEntityModifier createSequenceEntityModifier()
  {
    SequenceEntityModifierImpl sequenceEntityModifier = new SequenceEntityModifierImpl();
    return sequenceEntityModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopEntityModifier createLoopEntityModifier()
  {
    LoopEntityModifierImpl loopEntityModifier = new LoopEntityModifierImpl();
    return loopEntityModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveModifier createMoveModifier()
  {
    MoveModifierImpl moveModifier = new MoveModifierImpl();
    return moveModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveByModifier createMoveByModifier()
  {
    MoveByModifierImpl moveByModifier = new MoveByModifierImpl();
    return moveByModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleModifier createScaleModifier()
  {
    ScaleModifierImpl scaleModifier = new ScaleModifierImpl();
    return scaleModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlphaModifier createAlphaModifier()
  {
    AlphaModifierImpl alphaModifier = new AlphaModifierImpl();
    return alphaModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotationByModifier createRotationByModifier()
  {
    RotationByModifierImpl rotationByModifier = new RotationByModifierImpl();
    return rotationByModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotationModifier createRotationModifier()
  {
    RotationModifierImpl rotationModifier = new RotationModifierImpl();
    return rotationModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorModifier createColorModifier()
  {
    ColorModifierImpl colorModifier = new ColorModifierImpl();
    return colorModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToTriple createToTriple()
  {
    ToTripleImpl toTriple = new ToTripleImpl();
    return toTriple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromTriple createFromTriple()
  {
    FromTripleImpl fromTriple = new FromTripleImpl();
    return fromTriple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToDouble createToDouble()
  {
    ToDoubleImpl toDouble = new ToDoubleImpl();
    return toDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromDouble createFromDouble()
  {
    FromDoubleImpl fromDouble = new FromDoubleImpl();
    return fromDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToSingle createToSingle()
  {
    ToSingleImpl toSingle = new ToSingleImpl();
    return toSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromSingle createFromSingle()
  {
    FromSingleImpl fromSingle = new FromSingleImpl();
    return fromSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ByDouble createByDouble()
  {
    ByDoubleImpl byDouble = new ByDoubleImpl();
    return byDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BySingle createBySingle()
  {
    BySingleImpl bySingle = new BySingleImpl();
    return bySingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle createRectangle()
  {
    RectangleImpl rectangle = new RectangleImpl();
    return rectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sprite createSprite()
  {
    SpriteImpl sprite = new SpriteImpl();
    return sprite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnimatedSprite createAnimatedSprite()
  {
    AnimatedSpriteImpl animatedSprite = new AnimatedSpriteImpl();
    return animatedSprite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position createPosition()
  {
    PositionImpl position = new PositionImpl();
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextureRegion createTextureRegion()
  {
    TextureRegionImpl textureRegion = new TextureRegionImpl();
    return textureRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tiled createTiled()
  {
    TiledImpl tiled = new TiledImpl();
    return tiled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font createFont()
  {
    FontImpl font = new FontImpl();
    return font;
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
  public ActivityTheme createActivityThemeFromString(EDataType eDataType, String initialValue)
  {
    ActivityTheme result = ActivityTheme.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertActivityThemeToString(EDataType eDataType, Object instanceValue)
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
  public NumericKind createNumericKindFromString(EDataType eDataType, String initialValue)
  {
    NumericKind result = NumericKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNumericKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypefaceKind createTypefaceKindFromString(EDataType eDataType, String initialValue)
  {
    TypefaceKind result = TypefaceKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypefaceKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextStyleKind createTextStyleKindFromString(EDataType eDataType, String initialValue)
  {
    TextStyleKind result = TextStyleKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTextStyleKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapitalizeKind createCapitalizeKindFromString(EDataType eDataType, String initialValue)
  {
    CapitalizeKind result = CapitalizeKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCapitalizeKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoLinkKind createAutoLinkKindFromString(EDataType eDataType, String initialValue)
  {
    AutoLinkKind result = AutoLinkKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAutoLinkKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StretchModeKind createStretchModeKindFromString(EDataType eDataType, String initialValue)
  {
    StretchModeKind result = StretchModeKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStretchModeKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GravityKind createGravityKindFromString(EDataType eDataType, String initialValue)
  {
    GravityKind result = GravityKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGravityKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastLayoutDimensionKind createFastLayoutDimensionKindFromString(EDataType eDataType, String initialValue)
  {
    FastLayoutDimensionKind result = FastLayoutDimensionKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFastLayoutDimensionKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutDimensionKind createLayoutDimensionKindFromString(EDataType eDataType, String initialValue)
  {
    LayoutDimensionKind result = LayoutDimensionKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLayoutDimensionKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidDrawableResource createAndroidDrawableResourceFromString(EDataType eDataType, String initialValue)
  {
    AndroidDrawableResource result = AndroidDrawableResource.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAndroidDrawableResourceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionMetric createDimensionMetricFromString(EDataType eDataType, String initialValue)
  {
    DimensionMetric result = DimensionMetric.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDimensionMetricToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType createBodyTypeFromString(EDataType eDataType, String initialValue)
  {
    BodyType result = BodyType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBodyTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantColor createConstantColorFromString(EDataType eDataType, String initialValue)
  {
    ConstantColor result = ConstantColor.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstantColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalAlign createHorizontalAlignFromString(EDataType eDataType, String initialValue)
  {
    HorizontalAlign result = HorizontalAlign.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHorizontalAlignToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontType createFontTypeFromString(EDataType eDataType, String initialValue)
  {
    FontType result = FontType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFontTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenOrientation createScreenOrientationFromString(EDataType eDataType, String initialValue)
  {
    ScreenOrientation result = ScreenOrientation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScreenOrientationToString(EDataType eDataType, Object instanceValue)
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
