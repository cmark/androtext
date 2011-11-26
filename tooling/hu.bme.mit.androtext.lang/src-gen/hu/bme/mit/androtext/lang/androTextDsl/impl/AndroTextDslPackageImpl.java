/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference;
import hu.bme.mit.androtext.lang.androTextDsl.Action;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslFactory;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ApiLevel;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.CheckBox;
import hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference;
import hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView;
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResource;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypes;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionValue;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.ExpandableListView;
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.FrameLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Gallery;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GridLayout;
import hu.bme.mit.androtext.lang.androTextDsl.GridView;
import hu.bme.mit.androtext.lang.androTextDsl.ImageView;
import hu.bme.mit.androtext.lang.androTextDsl.Import;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity;
import hu.bme.mit.androtext.lang.androTextDsl.InvokeWebUrl;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutParams;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.ModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.Preference;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.PropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.RadioButton;
import hu.bme.mit.androtext.lang.androTextDsl.RadioGroup;
import hu.bme.mit.androtext.lang.androTextDsl.RatingBar;
import hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Resource;
import hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleView;
import hu.bme.mit.androtext.lang.androTextDsl.Spinner;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.StringResource;
import hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;
import hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;
import hu.bme.mit.androtext.lang.androTextDsl.WebView;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroTextDslPackageImpl extends EPackageImpl implements AndroTextDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androTextModelRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androGenModelRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androidApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androidApplicationModelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferenceActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeWebUrlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androDataModelRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypesRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androGuiModelRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutParamsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutGravityAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absoluteLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linearLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linearLayoutParamsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frameLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativeLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gridLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass galleryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expandableListViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gravityAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textSizeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backgroundAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gridViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radioGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ratingBarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toggleButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radioButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkedTextViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autoCompleteTextViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractPreferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferenceScreenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferenceCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editTextPreferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listPreferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkBoxPreferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ringtonePrefenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferenceAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialogPreferenceAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listPreferenceAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyDrawablePropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawableResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localDrawableResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalDrawableResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androResModelRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerArrayResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerArrayEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringArrayResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringArrayEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawableResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitmapDrawableResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDrawableResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum apiLevelEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum activityThemeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dataTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum layoutGravityKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum layoutDimensionKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum androidDrawableResourceEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dimensionMetricEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AndroTextDslPackageImpl()
  {
    super(eNS_URI, AndroTextDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AndroTextDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AndroTextDslPackage init()
  {
    if (isInited) return (AndroTextDslPackage)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI);

    // Obtain or create and register package
    AndroTextDslPackageImpl theAndroTextDslPackage = (AndroTextDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AndroTextDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AndroTextDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAndroTextDslPackage.createPackageContents();

    // Initialize created meta-data
    theAndroTextDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAndroTextDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AndroTextDslPackage.eNS_URI, theAndroTextDslPackage);
    return theAndroTextDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroTextModelRoot()
  {
    return androTextModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroTextModelRoot_Name()
  {
    return (EAttribute)androTextModelRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroTextModelRoot_Imports()
  {
    return (EReference)androTextModelRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroTextModelRoot_ActualModelRoot()
  {
    return (EReference)androTextModelRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelRoot()
  {
    return modelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelRoot_Name()
  {
    return (EAttribute)modelRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGenModelRoot()
  {
    return androGenModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGenModelRoot_TargetApplications()
  {
    return (EReference)androGenModelRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetApplication()
  {
    return targetApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTargetApplication_Application()
  {
    return (EReference)targetApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_ProjectName()
  {
    return (EAttribute)targetApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_PackageName()
  {
    return (EAttribute)targetApplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_Target()
  {
    return (EAttribute)targetApplicationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_Version()
  {
    return (EAttribute)targetApplicationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroidApplication()
  {
    return androidApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroidApplication_Dataroot()
  {
    return (EReference)androidApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroidApplication_MainActivity()
  {
    return (EReference)androidApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroidApplication_ModelElements()
  {
    return (EReference)androidApplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroidApplicationModelElement()
  {
    return androidApplicationModelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroidApplicationModelElement_Name()
  {
    return (EAttribute)androidApplicationModelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivity()
  {
    return activityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleActivity()
  {
    return simpleActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleActivity_Layout()
  {
    return (EReference)simpleActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleActivity_Theme()
  {
    return (EAttribute)simpleActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabActivity()
  {
    return tabActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabActivity_Tabs()
  {
    return (EReference)tabActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTab()
  {
    return tabEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTab_Tag()
  {
    return (EAttribute)tabEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Activity()
  {
    return (EReference)tabEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListActivity()
  {
    return listActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_Listitem()
  {
    return (EReference)listActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceActivity()
  {
    return preferenceActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceActivity_Layout()
  {
    return (EReference)preferenceActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeActivity()
  {
    return invokeActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeActivity_Activity()
  {
    return (EReference)invokeActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeWebUrl()
  {
    return invokeWebUrlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInvokeWebUrl_Url()
  {
    return (EAttribute)invokeWebUrlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroDataModelRoot()
  {
    return androDataModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroDataModelRoot_Entities()
  {
    return (EReference)androDataModelRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperType()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Properties()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Type()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRef()
  {
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypesRef()
  {
    return dataTypesRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypesRef_Type()
  {
    return (EAttribute)dataTypesRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityTypeRef()
  {
    return entityTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityTypeRef_Type()
  {
    return (EReference)entityTypeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGuiModelRoot()
  {
    return androGuiModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGuiModelRoot_Roots()
  {
    return (EReference)androGuiModelRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getView()
  {
    return viewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getView_Name()
  {
    return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getView_LayoutStyle()
  {
    return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewGroup()
  {
    return viewGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewGroup_Views()
  {
    return (EReference)viewGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutParams()
  {
    return layoutParamsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_Weight()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_MarginLeft()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_MarginTop()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_MarginRight()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_MarginBottom()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_AlignParentleft()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_AlignParentTop()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_AlignParentRight()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_AlignParentBottom()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_AlignTop()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_AlignBottom()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_AlignLeft()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_Below()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_Above()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_ToLeftOf()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_ToRightOf()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_CenterHorizontal()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_CenterInParent()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_CenterVertical()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutParams_BackgroundAttribute()
  {
    return (EReference)layoutParamsEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutGravityAttribute()
  {
    return layoutGravityAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayoutGravityAttribute_Gravity()
  {
    return (EAttribute)layoutGravityAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsoluteLayout()
  {
    return absoluteLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearLayout()
  {
    return linearLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearLayout_Vertical()
  {
    return (EAttribute)linearLayoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearLayout_LayoutParams()
  {
    return (EReference)linearLayoutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearLayoutParams()
  {
    return linearLayoutParamsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearLayoutParams_LayoutParams()
  {
    return (EReference)linearLayoutParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearLayoutParams_Gravity()
  {
    return (EReference)linearLayoutParamsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrameLayout()
  {
    return frameLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeLayout()
  {
    return relativeLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGridLayout()
  {
    return gridLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableLayout()
  {
    return tableLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleView()
  {
    return simpleViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGallery()
  {
    return galleryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpandableListView()
  {
    return expandableListViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebView()
  {
    return webViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageView()
  {
    return imageViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_Src()
  {
    return (EReference)imageViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextView()
  {
    return textViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextView_Text()
  {
    return (EAttribute)textViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_GravityAttribute()
  {
    return (EReference)textViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TextSizeAttribute()
  {
    return (EReference)textViewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_LayoutParams()
  {
    return (EReference)textViewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGravityAttribute()
  {
    return gravityAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGravityAttribute_Gravity()
  {
    return (EAttribute)gravityAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextSizeAttribute()
  {
    return textSizeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextSizeAttribute_TextSize()
  {
    return (EReference)textSizeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackgroundAttribute()
  {
    return backgroundAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBackgroundAttribute_Background()
  {
    return (EReference)backgroundAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditText()
  {
    return editTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditText_Text()
  {
    return (EAttribute)editTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_GravityAttribute()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TextSizeAttribute()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_LayoutParams()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_Text()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_LayoutParams()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListView()
  {
    return listViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListView_Entries()
  {
    return (EReference)listViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListView_Layout()
  {
    return (EReference)listViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGridView()
  {
    return gridViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpinner()
  {
    return spinnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_Entries()
  {
    return (EReference)spinnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckBox()
  {
    return checkBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBox_Text()
  {
    return (EAttribute)checkBoxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadioGroup()
  {
    return radioGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioGroup_Orientation()
  {
    return (EAttribute)radioGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadioGroup_Radiobuttons()
  {
    return (EReference)radioGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRatingBar()
  {
    return ratingBarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRatingBar_NumStars()
  {
    return (EAttribute)ratingBarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToggleButton()
  {
    return toggleButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToggleButton_TextOn()
  {
    return (EAttribute)toggleButtonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToggleButton_TextOff()
  {
    return (EAttribute)toggleButtonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadioButton()
  {
    return radioButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioButton_Name()
  {
    return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioButton_Text()
  {
    return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioButton_LayoutStyle()
  {
    return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckedTextView()
  {
    return checkedTextViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckedTextView_Text()
  {
    return (EAttribute)checkedTextViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutoCompleteTextView()
  {
    return autoCompleteTextViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAutoCompleteTextView_Entries()
  {
    return (EReference)autoCompleteTextViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAutoCompleteTextView_IsMulti()
  {
    return (EAttribute)autoCompleteTextViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractPreference()
  {
    return abstractPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractPreference_Title()
  {
    return (EAttribute)abstractPreferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreference()
  {
    return preferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreference_Name()
  {
    return (EAttribute)preferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreference_PreferenceAttributes()
  {
    return (EReference)preferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceScreen()
  {
    return preferenceScreenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceScreen_Name()
  {
    return (EAttribute)preferenceScreenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceScreen_PreferenceAttributes()
  {
    return (EReference)preferenceScreenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceScreen_Preferences()
  {
    return (EReference)preferenceScreenEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceCategory()
  {
    return preferenceCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceCategory_Preferences()
  {
    return (EReference)preferenceCategoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditTextPreference()
  {
    return editTextPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditTextPreference_Name()
  {
    return (EAttribute)editTextPreferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditTextPreference_PreferenceAttributes()
  {
    return (EReference)editTextPreferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditTextPreference_DialogPreferenceAttributes()
  {
    return (EReference)editTextPreferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListPreference()
  {
    return listPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListPreference_Name()
  {
    return (EAttribute)listPreferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreference_PreferenceAttributes()
  {
    return (EReference)listPreferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreference_DialogPreferenceAttributes()
  {
    return (EReference)listPreferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreference_ListPreferenceAttributes()
  {
    return (EReference)listPreferenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckBoxPreference()
  {
    return checkBoxPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBoxPreference_Name()
  {
    return (EAttribute)checkBoxPreferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBoxPreference_PreferenceAttributes()
  {
    return (EReference)checkBoxPreferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRingtonePrefence()
  {
    return ringtonePrefenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRingtonePrefence_Name()
  {
    return (EAttribute)ringtonePrefenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRingtonePrefence_PreferenceAttributes()
  {
    return (EReference)ringtonePrefenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceAttributes()
  {
    return preferenceAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceAttributes_Summary()
  {
    return (EAttribute)preferenceAttributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceAttributes_Enabled()
  {
    return (EAttribute)preferenceAttributesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceAttributes_Persistent()
  {
    return (EAttribute)preferenceAttributesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDialogPreferenceAttributes()
  {
    return dialogPreferenceAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDialogPreferenceAttributes_DialogTitle()
  {
    return (EAttribute)dialogPreferenceAttributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDialogPreferenceAttributes_DefaultValue()
  {
    return (EAttribute)dialogPreferenceAttributesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListPreferenceAttributes()
  {
    return listPreferenceAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreferenceAttributes_Entries()
  {
    return (EReference)listPreferenceAttributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreferenceAttributes_EntryValues()
  {
    return (EReference)listPreferenceAttributesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValue()
  {
    return propertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyDrawablePropertyValue()
  {
    return anyDrawablePropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringPropertyValue()
  {
    return stringPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringPropertyValue_Value()
  {
    return (EAttribute)stringPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerPropertyValue()
  {
    return integerPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerPropertyValue_Value()
  {
    return (EAttribute)integerPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanPropertyValue()
  {
    return booleanPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanPropertyValue_Value()
  {
    return (EAttribute)booleanPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorPropertyValue()
  {
    return colorPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorPropertyValue_Value()
  {
    return (EAttribute)colorPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionPropertyValue()
  {
    return dimensionPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionPropertyValue_Value()
  {
    return (EReference)dimensionPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableResourceLink()
  {
    return drawableResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalDrawableResourceLink()
  {
    return localDrawableResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalDrawableResourceLink_Link()
  {
    return (EReference)localDrawableResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalDrawableResourceLink()
  {
    return externalDrawableResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalDrawableResourceLink_ExternalResource()
  {
    return (EAttribute)externalDrawableResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringResourceLink()
  {
    return stringResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringResourceLink_Link()
  {
    return (EReference)stringResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerResourceLink()
  {
    return integerResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerResourceLink_Link()
  {
    return (EReference)integerResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanResourceLink()
  {
    return booleanResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanResourceLink_Link()
  {
    return (EReference)booleanResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorResourceLink()
  {
    return colorResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorResourceLink_Link()
  {
    return (EReference)colorResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionResourceLink()
  {
    return dimensionResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionResourceLink_Link()
  {
    return (EReference)dimensionResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroResModelRoot()
  {
    return androResModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroResModelRoot_Resources()
  {
    return (EReference)androResModelRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Name()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringResource()
  {
    return stringResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringResource_Value()
  {
    return (EAttribute)stringResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerResource()
  {
    return integerResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerResource_Value()
  {
    return (EAttribute)integerResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanResource()
  {
    return booleanResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanResource_Value()
  {
    return (EAttribute)booleanResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorResource()
  {
    return colorResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorResource_Value()
  {
    return (EAttribute)colorResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionResource()
  {
    return dimensionResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionResource_Value()
  {
    return (EReference)dimensionResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayResource()
  {
    return arrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerArrayResource()
  {
    return integerArrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerArrayResource_Entries()
  {
    return (EReference)integerArrayResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerArrayEntry()
  {
    return integerArrayEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerArrayEntry_Name()
  {
    return (EAttribute)integerArrayEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerArrayEntry_Value()
  {
    return (EAttribute)integerArrayEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringArrayResource()
  {
    return stringArrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringArrayResource_Entries()
  {
    return (EReference)stringArrayResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringArrayEntry()
  {
    return stringArrayEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringArrayEntry_Name()
  {
    return (EAttribute)stringArrayEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringArrayEntry_Value()
  {
    return (EAttribute)stringArrayEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableResource()
  {
    return drawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitmapDrawableResource()
  {
    return bitmapDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitmapDrawableResource_Filename()
  {
    return (EAttribute)bitmapDrawableResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDrawableResource()
  {
    return transitionDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_From()
  {
    return (EReference)transitionDrawableResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_To()
  {
    return (EReference)transitionDrawableResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionValue()
  {
    return dimensionValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionValue_Value()
  {
    return (EAttribute)dimensionValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionValue_Metric()
  {
    return (EAttribute)dimensionValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getApiLevel()
  {
    return apiLevelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActivityTheme()
  {
    return activityThemeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataTypes()
  {
    return dataTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLayoutGravityKind()
  {
    return layoutGravityKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLayoutDimensionKind()
  {
    return layoutDimensionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAndroidDrawableResource()
  {
    return androidDrawableResourceEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDimensionMetric()
  {
    return dimensionMetricEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroTextDslFactory getAndroTextDslFactory()
  {
    return (AndroTextDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    androTextModelRootEClass = createEClass(ANDRO_TEXT_MODEL_ROOT);
    createEAttribute(androTextModelRootEClass, ANDRO_TEXT_MODEL_ROOT__NAME);
    createEReference(androTextModelRootEClass, ANDRO_TEXT_MODEL_ROOT__IMPORTS);
    createEReference(androTextModelRootEClass, ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT);

    modelRootEClass = createEClass(MODEL_ROOT);
    createEAttribute(modelRootEClass, MODEL_ROOT__NAME);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    androGenModelRootEClass = createEClass(ANDRO_GEN_MODEL_ROOT);
    createEReference(androGenModelRootEClass, ANDRO_GEN_MODEL_ROOT__TARGET_APPLICATIONS);

    targetApplicationEClass = createEClass(TARGET_APPLICATION);
    createEReference(targetApplicationEClass, TARGET_APPLICATION__APPLICATION);
    createEAttribute(targetApplicationEClass, TARGET_APPLICATION__PROJECT_NAME);
    createEAttribute(targetApplicationEClass, TARGET_APPLICATION__PACKAGE_NAME);
    createEAttribute(targetApplicationEClass, TARGET_APPLICATION__TARGET);
    createEAttribute(targetApplicationEClass, TARGET_APPLICATION__VERSION);

    androidApplicationEClass = createEClass(ANDROID_APPLICATION);
    createEReference(androidApplicationEClass, ANDROID_APPLICATION__DATAROOT);
    createEReference(androidApplicationEClass, ANDROID_APPLICATION__MAIN_ACTIVITY);
    createEReference(androidApplicationEClass, ANDROID_APPLICATION__MODEL_ELEMENTS);

    androidApplicationModelElementEClass = createEClass(ANDROID_APPLICATION_MODEL_ELEMENT);
    createEAttribute(androidApplicationModelElementEClass, ANDROID_APPLICATION_MODEL_ELEMENT__NAME);

    activityEClass = createEClass(ACTIVITY);

    simpleActivityEClass = createEClass(SIMPLE_ACTIVITY);
    createEReference(simpleActivityEClass, SIMPLE_ACTIVITY__LAYOUT);
    createEAttribute(simpleActivityEClass, SIMPLE_ACTIVITY__THEME);

    tabActivityEClass = createEClass(TAB_ACTIVITY);
    createEReference(tabActivityEClass, TAB_ACTIVITY__TABS);

    tabEClass = createEClass(TAB);
    createEAttribute(tabEClass, TAB__TAG);
    createEReference(tabEClass, TAB__ACTIVITY);

    listActivityEClass = createEClass(LIST_ACTIVITY);
    createEReference(listActivityEClass, LIST_ACTIVITY__LISTITEM);

    preferenceActivityEClass = createEClass(PREFERENCE_ACTIVITY);
    createEReference(preferenceActivityEClass, PREFERENCE_ACTIVITY__LAYOUT);

    actionEClass = createEClass(ACTION);

    invokeActivityEClass = createEClass(INVOKE_ACTIVITY);
    createEReference(invokeActivityEClass, INVOKE_ACTIVITY__ACTIVITY);

    invokeWebUrlEClass = createEClass(INVOKE_WEB_URL);
    createEAttribute(invokeWebUrlEClass, INVOKE_WEB_URL__URL);

    androDataModelRootEClass = createEClass(ANDRO_DATA_MODEL_ROOT);
    createEReference(androDataModelRootEClass, ANDRO_DATA_MODEL_ROOT__ENTITIES);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);
    createEReference(entityEClass, ENTITY__SUPER_TYPE);
    createEReference(entityEClass, ENTITY__PROPERTIES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__TYPE);

    typeRefEClass = createEClass(TYPE_REF);

    dataTypesRefEClass = createEClass(DATA_TYPES_REF);
    createEAttribute(dataTypesRefEClass, DATA_TYPES_REF__TYPE);

    entityTypeRefEClass = createEClass(ENTITY_TYPE_REF);
    createEReference(entityTypeRefEClass, ENTITY_TYPE_REF__TYPE);

    androGuiModelRootEClass = createEClass(ANDRO_GUI_MODEL_ROOT);
    createEReference(androGuiModelRootEClass, ANDRO_GUI_MODEL_ROOT__ROOTS);

    viewEClass = createEClass(VIEW);
    createEAttribute(viewEClass, VIEW__NAME);
    createEAttribute(viewEClass, VIEW__LAYOUT_STYLE);

    viewGroupEClass = createEClass(VIEW_GROUP);
    createEReference(viewGroupEClass, VIEW_GROUP__VIEWS);

    layoutParamsEClass = createEClass(LAYOUT_PARAMS);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__WEIGHT);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__MARGIN_LEFT);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__MARGIN_TOP);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__MARGIN_RIGHT);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__MARGIN_BOTTOM);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ALIGN_PARENTLEFT);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ALIGN_PARENT_TOP);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ALIGN_PARENT_RIGHT);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ALIGN_TOP);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ALIGN_BOTTOM);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ALIGN_LEFT);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__BELOW);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__ABOVE);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__TO_LEFT_OF);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__TO_RIGHT_OF);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__CENTER_HORIZONTAL);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__CENTER_IN_PARENT);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__CENTER_VERTICAL);
    createEReference(layoutParamsEClass, LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE);

    layoutGravityAttributeEClass = createEClass(LAYOUT_GRAVITY_ATTRIBUTE);
    createEAttribute(layoutGravityAttributeEClass, LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY);

    absoluteLayoutEClass = createEClass(ABSOLUTE_LAYOUT);

    linearLayoutEClass = createEClass(LINEAR_LAYOUT);
    createEAttribute(linearLayoutEClass, LINEAR_LAYOUT__VERTICAL);
    createEReference(linearLayoutEClass, LINEAR_LAYOUT__LAYOUT_PARAMS);

    linearLayoutParamsEClass = createEClass(LINEAR_LAYOUT_PARAMS);
    createEReference(linearLayoutParamsEClass, LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS);
    createEReference(linearLayoutParamsEClass, LINEAR_LAYOUT_PARAMS__GRAVITY);

    frameLayoutEClass = createEClass(FRAME_LAYOUT);

    relativeLayoutEClass = createEClass(RELATIVE_LAYOUT);

    gridLayoutEClass = createEClass(GRID_LAYOUT);

    tableLayoutEClass = createEClass(TABLE_LAYOUT);

    simpleViewEClass = createEClass(SIMPLE_VIEW);

    galleryEClass = createEClass(GALLERY);

    expandableListViewEClass = createEClass(EXPANDABLE_LIST_VIEW);

    webViewEClass = createEClass(WEB_VIEW);

    imageViewEClass = createEClass(IMAGE_VIEW);
    createEReference(imageViewEClass, IMAGE_VIEW__SRC);

    textViewEClass = createEClass(TEXT_VIEW);
    createEAttribute(textViewEClass, TEXT_VIEW__TEXT);
    createEReference(textViewEClass, TEXT_VIEW__GRAVITY_ATTRIBUTE);
    createEReference(textViewEClass, TEXT_VIEW__TEXT_SIZE_ATTRIBUTE);
    createEReference(textViewEClass, TEXT_VIEW__LAYOUT_PARAMS);

    gravityAttributeEClass = createEClass(GRAVITY_ATTRIBUTE);
    createEAttribute(gravityAttributeEClass, GRAVITY_ATTRIBUTE__GRAVITY);

    textSizeAttributeEClass = createEClass(TEXT_SIZE_ATTRIBUTE);
    createEReference(textSizeAttributeEClass, TEXT_SIZE_ATTRIBUTE__TEXT_SIZE);

    backgroundAttributeEClass = createEClass(BACKGROUND_ATTRIBUTE);
    createEReference(backgroundAttributeEClass, BACKGROUND_ATTRIBUTE__BACKGROUND);

    editTextEClass = createEClass(EDIT_TEXT);
    createEAttribute(editTextEClass, EDIT_TEXT__TEXT);
    createEReference(editTextEClass, EDIT_TEXT__GRAVITY_ATTRIBUTE);
    createEReference(editTextEClass, EDIT_TEXT__TEXT_SIZE_ATTRIBUTE);
    createEReference(editTextEClass, EDIT_TEXT__LAYOUT_PARAMS);

    buttonEClass = createEClass(BUTTON);
    createEAttribute(buttonEClass, BUTTON__TEXT);
    createEReference(buttonEClass, BUTTON__LAYOUT_PARAMS);

    listViewEClass = createEClass(LIST_VIEW);
    createEReference(listViewEClass, LIST_VIEW__ENTRIES);
    createEReference(listViewEClass, LIST_VIEW__LAYOUT);

    gridViewEClass = createEClass(GRID_VIEW);

    spinnerEClass = createEClass(SPINNER);
    createEReference(spinnerEClass, SPINNER__ENTRIES);

    checkBoxEClass = createEClass(CHECK_BOX);
    createEAttribute(checkBoxEClass, CHECK_BOX__TEXT);

    radioGroupEClass = createEClass(RADIO_GROUP);
    createEAttribute(radioGroupEClass, RADIO_GROUP__ORIENTATION);
    createEReference(radioGroupEClass, RADIO_GROUP__RADIOBUTTONS);

    ratingBarEClass = createEClass(RATING_BAR);
    createEAttribute(ratingBarEClass, RATING_BAR__NUM_STARS);

    toggleButtonEClass = createEClass(TOGGLE_BUTTON);
    createEAttribute(toggleButtonEClass, TOGGLE_BUTTON__TEXT_ON);
    createEAttribute(toggleButtonEClass, TOGGLE_BUTTON__TEXT_OFF);

    radioButtonEClass = createEClass(RADIO_BUTTON);
    createEAttribute(radioButtonEClass, RADIO_BUTTON__NAME);
    createEAttribute(radioButtonEClass, RADIO_BUTTON__TEXT);
    createEAttribute(radioButtonEClass, RADIO_BUTTON__LAYOUT_STYLE);

    checkedTextViewEClass = createEClass(CHECKED_TEXT_VIEW);
    createEAttribute(checkedTextViewEClass, CHECKED_TEXT_VIEW__TEXT);

    autoCompleteTextViewEClass = createEClass(AUTO_COMPLETE_TEXT_VIEW);
    createEReference(autoCompleteTextViewEClass, AUTO_COMPLETE_TEXT_VIEW__ENTRIES);
    createEAttribute(autoCompleteTextViewEClass, AUTO_COMPLETE_TEXT_VIEW__IS_MULTI);

    abstractPreferenceEClass = createEClass(ABSTRACT_PREFERENCE);
    createEAttribute(abstractPreferenceEClass, ABSTRACT_PREFERENCE__TITLE);

    preferenceEClass = createEClass(PREFERENCE);
    createEAttribute(preferenceEClass, PREFERENCE__NAME);
    createEReference(preferenceEClass, PREFERENCE__PREFERENCE_ATTRIBUTES);

    preferenceScreenEClass = createEClass(PREFERENCE_SCREEN);
    createEAttribute(preferenceScreenEClass, PREFERENCE_SCREEN__NAME);
    createEReference(preferenceScreenEClass, PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES);
    createEReference(preferenceScreenEClass, PREFERENCE_SCREEN__PREFERENCES);

    preferenceCategoryEClass = createEClass(PREFERENCE_CATEGORY);
    createEReference(preferenceCategoryEClass, PREFERENCE_CATEGORY__PREFERENCES);

    editTextPreferenceEClass = createEClass(EDIT_TEXT_PREFERENCE);
    createEAttribute(editTextPreferenceEClass, EDIT_TEXT_PREFERENCE__NAME);
    createEReference(editTextPreferenceEClass, EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES);
    createEReference(editTextPreferenceEClass, EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES);

    listPreferenceEClass = createEClass(LIST_PREFERENCE);
    createEAttribute(listPreferenceEClass, LIST_PREFERENCE__NAME);
    createEReference(listPreferenceEClass, LIST_PREFERENCE__PREFERENCE_ATTRIBUTES);
    createEReference(listPreferenceEClass, LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES);
    createEReference(listPreferenceEClass, LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES);

    checkBoxPreferenceEClass = createEClass(CHECK_BOX_PREFERENCE);
    createEAttribute(checkBoxPreferenceEClass, CHECK_BOX_PREFERENCE__NAME);
    createEReference(checkBoxPreferenceEClass, CHECK_BOX_PREFERENCE__PREFERENCE_ATTRIBUTES);

    ringtonePrefenceEClass = createEClass(RINGTONE_PREFENCE);
    createEAttribute(ringtonePrefenceEClass, RINGTONE_PREFENCE__NAME);
    createEReference(ringtonePrefenceEClass, RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES);

    preferenceAttributesEClass = createEClass(PREFERENCE_ATTRIBUTES);
    createEAttribute(preferenceAttributesEClass, PREFERENCE_ATTRIBUTES__SUMMARY);
    createEAttribute(preferenceAttributesEClass, PREFERENCE_ATTRIBUTES__ENABLED);
    createEAttribute(preferenceAttributesEClass, PREFERENCE_ATTRIBUTES__PERSISTENT);

    dialogPreferenceAttributesEClass = createEClass(DIALOG_PREFERENCE_ATTRIBUTES);
    createEAttribute(dialogPreferenceAttributesEClass, DIALOG_PREFERENCE_ATTRIBUTES__DIALOG_TITLE);
    createEAttribute(dialogPreferenceAttributesEClass, DIALOG_PREFERENCE_ATTRIBUTES__DEFAULT_VALUE);

    listPreferenceAttributesEClass = createEClass(LIST_PREFERENCE_ATTRIBUTES);
    createEReference(listPreferenceAttributesEClass, LIST_PREFERENCE_ATTRIBUTES__ENTRIES);
    createEReference(listPreferenceAttributesEClass, LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES);

    propertyValueEClass = createEClass(PROPERTY_VALUE);

    anyDrawablePropertyValueEClass = createEClass(ANY_DRAWABLE_PROPERTY_VALUE);

    stringPropertyValueEClass = createEClass(STRING_PROPERTY_VALUE);
    createEAttribute(stringPropertyValueEClass, STRING_PROPERTY_VALUE__VALUE);

    integerPropertyValueEClass = createEClass(INTEGER_PROPERTY_VALUE);
    createEAttribute(integerPropertyValueEClass, INTEGER_PROPERTY_VALUE__VALUE);

    booleanPropertyValueEClass = createEClass(BOOLEAN_PROPERTY_VALUE);
    createEAttribute(booleanPropertyValueEClass, BOOLEAN_PROPERTY_VALUE__VALUE);

    colorPropertyValueEClass = createEClass(COLOR_PROPERTY_VALUE);
    createEAttribute(colorPropertyValueEClass, COLOR_PROPERTY_VALUE__VALUE);

    dimensionPropertyValueEClass = createEClass(DIMENSION_PROPERTY_VALUE);
    createEReference(dimensionPropertyValueEClass, DIMENSION_PROPERTY_VALUE__VALUE);

    drawableResourceLinkEClass = createEClass(DRAWABLE_RESOURCE_LINK);

    localDrawableResourceLinkEClass = createEClass(LOCAL_DRAWABLE_RESOURCE_LINK);
    createEReference(localDrawableResourceLinkEClass, LOCAL_DRAWABLE_RESOURCE_LINK__LINK);

    externalDrawableResourceLinkEClass = createEClass(EXTERNAL_DRAWABLE_RESOURCE_LINK);
    createEAttribute(externalDrawableResourceLinkEClass, EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE);

    stringResourceLinkEClass = createEClass(STRING_RESOURCE_LINK);
    createEReference(stringResourceLinkEClass, STRING_RESOURCE_LINK__LINK);

    integerResourceLinkEClass = createEClass(INTEGER_RESOURCE_LINK);
    createEReference(integerResourceLinkEClass, INTEGER_RESOURCE_LINK__LINK);

    booleanResourceLinkEClass = createEClass(BOOLEAN_RESOURCE_LINK);
    createEReference(booleanResourceLinkEClass, BOOLEAN_RESOURCE_LINK__LINK);

    colorResourceLinkEClass = createEClass(COLOR_RESOURCE_LINK);
    createEReference(colorResourceLinkEClass, COLOR_RESOURCE_LINK__LINK);

    dimensionResourceLinkEClass = createEClass(DIMENSION_RESOURCE_LINK);
    createEReference(dimensionResourceLinkEClass, DIMENSION_RESOURCE_LINK__LINK);

    androResModelRootEClass = createEClass(ANDRO_RES_MODEL_ROOT);
    createEReference(androResModelRootEClass, ANDRO_RES_MODEL_ROOT__RESOURCES);

    resourceEClass = createEClass(RESOURCE);
    createEAttribute(resourceEClass, RESOURCE__NAME);

    stringResourceEClass = createEClass(STRING_RESOURCE);
    createEAttribute(stringResourceEClass, STRING_RESOURCE__VALUE);

    integerResourceEClass = createEClass(INTEGER_RESOURCE);
    createEAttribute(integerResourceEClass, INTEGER_RESOURCE__VALUE);

    booleanResourceEClass = createEClass(BOOLEAN_RESOURCE);
    createEAttribute(booleanResourceEClass, BOOLEAN_RESOURCE__VALUE);

    colorResourceEClass = createEClass(COLOR_RESOURCE);
    createEAttribute(colorResourceEClass, COLOR_RESOURCE__VALUE);

    dimensionResourceEClass = createEClass(DIMENSION_RESOURCE);
    createEReference(dimensionResourceEClass, DIMENSION_RESOURCE__VALUE);

    arrayResourceEClass = createEClass(ARRAY_RESOURCE);

    integerArrayResourceEClass = createEClass(INTEGER_ARRAY_RESOURCE);
    createEReference(integerArrayResourceEClass, INTEGER_ARRAY_RESOURCE__ENTRIES);

    integerArrayEntryEClass = createEClass(INTEGER_ARRAY_ENTRY);
    createEAttribute(integerArrayEntryEClass, INTEGER_ARRAY_ENTRY__NAME);
    createEAttribute(integerArrayEntryEClass, INTEGER_ARRAY_ENTRY__VALUE);

    stringArrayResourceEClass = createEClass(STRING_ARRAY_RESOURCE);
    createEReference(stringArrayResourceEClass, STRING_ARRAY_RESOURCE__ENTRIES);

    stringArrayEntryEClass = createEClass(STRING_ARRAY_ENTRY);
    createEAttribute(stringArrayEntryEClass, STRING_ARRAY_ENTRY__NAME);
    createEAttribute(stringArrayEntryEClass, STRING_ARRAY_ENTRY__VALUE);

    drawableResourceEClass = createEClass(DRAWABLE_RESOURCE);

    bitmapDrawableResourceEClass = createEClass(BITMAP_DRAWABLE_RESOURCE);
    createEAttribute(bitmapDrawableResourceEClass, BITMAP_DRAWABLE_RESOURCE__FILENAME);

    transitionDrawableResourceEClass = createEClass(TRANSITION_DRAWABLE_RESOURCE);
    createEReference(transitionDrawableResourceEClass, TRANSITION_DRAWABLE_RESOURCE__FROM);
    createEReference(transitionDrawableResourceEClass, TRANSITION_DRAWABLE_RESOURCE__TO);

    dimensionValueEClass = createEClass(DIMENSION_VALUE);
    createEAttribute(dimensionValueEClass, DIMENSION_VALUE__VALUE);
    createEAttribute(dimensionValueEClass, DIMENSION_VALUE__METRIC);

    // Create enums
    apiLevelEEnum = createEEnum(API_LEVEL);
    activityThemeEEnum = createEEnum(ACTIVITY_THEME);
    dataTypesEEnum = createEEnum(DATA_TYPES);
    layoutGravityKindEEnum = createEEnum(LAYOUT_GRAVITY_KIND);
    layoutDimensionKindEEnum = createEEnum(LAYOUT_DIMENSION_KIND);
    androidDrawableResourceEEnum = createEEnum(ANDROID_DRAWABLE_RESOURCE);
    dimensionMetricEEnum = createEEnum(DIMENSION_METRIC);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    androGenModelRootEClass.getESuperTypes().add(this.getModelRoot());
    androidApplicationEClass.getESuperTypes().add(this.getModelRoot());
    activityEClass.getESuperTypes().add(this.getAndroidApplicationModelElement());
    simpleActivityEClass.getESuperTypes().add(this.getActivity());
    tabActivityEClass.getESuperTypes().add(this.getActivity());
    listActivityEClass.getESuperTypes().add(this.getActivity());
    preferenceActivityEClass.getESuperTypes().add(this.getAndroidApplicationModelElement());
    invokeActivityEClass.getESuperTypes().add(this.getAction());
    invokeWebUrlEClass.getESuperTypes().add(this.getAction());
    androDataModelRootEClass.getESuperTypes().add(this.getModelRoot());
    dataTypesRefEClass.getESuperTypes().add(this.getTypeRef());
    entityTypeRefEClass.getESuperTypes().add(this.getTypeRef());
    androGuiModelRootEClass.getESuperTypes().add(this.getModelRoot());
    viewGroupEClass.getESuperTypes().add(this.getView());
    absoluteLayoutEClass.getESuperTypes().add(this.getViewGroup());
    linearLayoutEClass.getESuperTypes().add(this.getViewGroup());
    frameLayoutEClass.getESuperTypes().add(this.getViewGroup());
    relativeLayoutEClass.getESuperTypes().add(this.getViewGroup());
    gridLayoutEClass.getESuperTypes().add(this.getViewGroup());
    tableLayoutEClass.getESuperTypes().add(this.getViewGroup());
    simpleViewEClass.getESuperTypes().add(this.getView());
    galleryEClass.getESuperTypes().add(this.getSimpleView());
    expandableListViewEClass.getESuperTypes().add(this.getSimpleView());
    webViewEClass.getESuperTypes().add(this.getSimpleView());
    imageViewEClass.getESuperTypes().add(this.getSimpleView());
    textViewEClass.getESuperTypes().add(this.getSimpleView());
    editTextEClass.getESuperTypes().add(this.getSimpleView());
    buttonEClass.getESuperTypes().add(this.getSimpleView());
    listViewEClass.getESuperTypes().add(this.getSimpleView());
    gridViewEClass.getESuperTypes().add(this.getSimpleView());
    spinnerEClass.getESuperTypes().add(this.getSimpleView());
    checkBoxEClass.getESuperTypes().add(this.getSimpleView());
    radioGroupEClass.getESuperTypes().add(this.getSimpleView());
    ratingBarEClass.getESuperTypes().add(this.getSimpleView());
    toggleButtonEClass.getESuperTypes().add(this.getSimpleView());
    checkedTextViewEClass.getESuperTypes().add(this.getSimpleView());
    autoCompleteTextViewEClass.getESuperTypes().add(this.getSimpleView());
    preferenceEClass.getESuperTypes().add(this.getAbstractPreference());
    preferenceScreenEClass.getESuperTypes().add(this.getAbstractPreference());
    preferenceCategoryEClass.getESuperTypes().add(this.getAbstractPreference());
    editTextPreferenceEClass.getESuperTypes().add(this.getAbstractPreference());
    listPreferenceEClass.getESuperTypes().add(this.getAbstractPreference());
    checkBoxPreferenceEClass.getESuperTypes().add(this.getAbstractPreference());
    ringtonePrefenceEClass.getESuperTypes().add(this.getAbstractPreference());
    anyDrawablePropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    stringPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    integerPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    booleanPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    colorPropertyValueEClass.getESuperTypes().add(this.getAnyDrawablePropertyValue());
    dimensionPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    drawableResourceLinkEClass.getESuperTypes().add(this.getAnyDrawablePropertyValue());
    localDrawableResourceLinkEClass.getESuperTypes().add(this.getDrawableResourceLink());
    externalDrawableResourceLinkEClass.getESuperTypes().add(this.getDrawableResourceLink());
    stringResourceLinkEClass.getESuperTypes().add(this.getStringPropertyValue());
    integerResourceLinkEClass.getESuperTypes().add(this.getIntegerPropertyValue());
    booleanResourceLinkEClass.getESuperTypes().add(this.getBooleanPropertyValue());
    colorResourceLinkEClass.getESuperTypes().add(this.getColorPropertyValue());
    dimensionResourceLinkEClass.getESuperTypes().add(this.getDimensionPropertyValue());
    androResModelRootEClass.getESuperTypes().add(this.getModelRoot());
    stringResourceEClass.getESuperTypes().add(this.getResource());
    integerResourceEClass.getESuperTypes().add(this.getResource());
    booleanResourceEClass.getESuperTypes().add(this.getResource());
    colorResourceEClass.getESuperTypes().add(this.getResource());
    dimensionResourceEClass.getESuperTypes().add(this.getResource());
    arrayResourceEClass.getESuperTypes().add(this.getResource());
    integerArrayResourceEClass.getESuperTypes().add(this.getArrayResource());
    stringArrayResourceEClass.getESuperTypes().add(this.getArrayResource());
    drawableResourceEClass.getESuperTypes().add(this.getResource());
    bitmapDrawableResourceEClass.getESuperTypes().add(this.getDrawableResource());
    transitionDrawableResourceEClass.getESuperTypes().add(this.getDrawableResource());

    // Initialize classes and features; add operations and parameters
    initEClass(androTextModelRootEClass, AndroTextModelRoot.class, "AndroTextModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAndroTextModelRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, AndroTextModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndroTextModelRoot_Imports(), this.getImport(), null, "imports", null, 0, -1, AndroTextModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndroTextModelRoot_ActualModelRoot(), this.getModelRoot(), null, "actualModelRoot", null, 0, 1, AndroTextModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelRootEClass, ModelRoot.class, "ModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(androGenModelRootEClass, AndroGenModelRoot.class, "AndroGenModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndroGenModelRoot_TargetApplications(), this.getTargetApplication(), null, "targetApplications", null, 0, -1, AndroGenModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetApplicationEClass, TargetApplication.class, "TargetApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTargetApplication_Application(), this.getAndroidApplication(), null, "application", null, 0, 1, TargetApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTargetApplication_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, TargetApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTargetApplication_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, TargetApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTargetApplication_Target(), this.getApiLevel(), "target", null, 0, 1, TargetApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTargetApplication_Version(), ecorePackage.getEString(), "version", null, 0, 1, TargetApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(androidApplicationEClass, AndroidApplication.class, "AndroidApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndroidApplication_Dataroot(), this.getAndroDataModelRoot(), null, "dataroot", null, 0, 1, AndroidApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndroidApplication_MainActivity(), this.getActivity(), null, "mainActivity", null, 0, 1, AndroidApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndroidApplication_ModelElements(), this.getAndroidApplicationModelElement(), null, "modelElements", null, 0, -1, AndroidApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(androidApplicationModelElementEClass, AndroidApplicationModelElement.class, "AndroidApplicationModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAndroidApplicationModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AndroidApplicationModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleActivityEClass, SimpleActivity.class, "SimpleActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleActivity_Layout(), this.getViewGroup(), null, "layout", null, 0, 1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleActivity_Theme(), this.getActivityTheme(), "theme", null, 0, 1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabActivityEClass, TabActivity.class, "TabActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTabActivity_Tabs(), this.getTab(), null, "tabs", null, 0, -1, TabActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTab_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTab_Activity(), this.getActivity(), null, "activity", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listActivityEClass, ListActivity.class, "ListActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListActivity_Listitem(), this.getView(), null, "listitem", null, 0, 1, ListActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceActivityEClass, PreferenceActivity.class, "PreferenceActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreferenceActivity_Layout(), this.getPreferenceScreen(), null, "layout", null, 0, 1, PreferenceActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(invokeActivityEClass, InvokeActivity.class, "InvokeActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvokeActivity_Activity(), this.getActivity(), null, "activity", null, 0, 1, InvokeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invokeWebUrlEClass, InvokeWebUrl.class, "InvokeWebUrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInvokeWebUrl_Url(), ecorePackage.getEString(), "url", null, 0, 1, InvokeWebUrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(androDataModelRootEClass, AndroDataModelRoot.class, "AndroDataModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndroDataModelRoot_Entities(), this.getEntity(), null, "entities", null, 0, -1, AndroDataModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_SuperType(), this.getEntity(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Properties(), this.getProperty(), null, "properties", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Type(), this.getTypeRef(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypesRefEClass, DataTypesRef.class, "DataTypesRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypesRef_Type(), this.getDataTypes(), "type", null, 0, 1, DataTypesRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityTypeRefEClass, EntityTypeRef.class, "EntityTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityTypeRef_Type(), this.getEntity(), null, "type", null, 0, 1, EntityTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(androGuiModelRootEClass, AndroGuiModelRoot.class, "AndroGuiModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndroGuiModelRoot_Roots(), this.getView(), null, "roots", null, 0, -1, AndroGuiModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getView_LayoutStyle(), this.getLayoutDimensionKind(), "layoutStyle", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewGroupEClass, ViewGroup.class, "ViewGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewGroup_Views(), this.getView(), null, "views", null, 0, -1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layoutParamsEClass, LayoutParams.class, "LayoutParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLayoutParams_Weight(), this.getIntegerPropertyValue(), null, "weight", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_MarginLeft(), this.getDimensionPropertyValue(), null, "marginLeft", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_MarginTop(), this.getDimensionPropertyValue(), null, "marginTop", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_MarginRight(), this.getDimensionPropertyValue(), null, "marginRight", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_MarginBottom(), this.getDimensionPropertyValue(), null, "marginBottom", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_AlignParentleft(), this.getBooleanPropertyValue(), null, "alignParentleft", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_AlignParentTop(), this.getBooleanPropertyValue(), null, "alignParentTop", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_AlignParentRight(), this.getBooleanPropertyValue(), null, "alignParentRight", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_AlignParentBottom(), this.getBooleanPropertyValue(), null, "alignParentBottom", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_AlignTop(), this.getView(), null, "alignTop", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_AlignBottom(), this.getView(), null, "alignBottom", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_AlignLeft(), this.getView(), null, "alignLeft", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_Below(), this.getView(), null, "below", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_Above(), this.getView(), null, "above", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_ToLeftOf(), this.getView(), null, "toLeftOf", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_ToRightOf(), this.getView(), null, "toRightOf", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_CenterHorizontal(), this.getBooleanPropertyValue(), null, "centerHorizontal", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_CenterInParent(), this.getBooleanPropertyValue(), null, "centerInParent", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_CenterVertical(), this.getBooleanPropertyValue(), null, "centerVertical", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayoutParams_BackgroundAttribute(), this.getBackgroundAttribute(), null, "backgroundAttribute", null, 0, 1, LayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layoutGravityAttributeEClass, LayoutGravityAttribute.class, "LayoutGravityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLayoutGravityAttribute_Gravity(), this.getLayoutGravityKind(), "gravity", null, 0, -1, LayoutGravityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(absoluteLayoutEClass, AbsoluteLayout.class, "AbsoluteLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linearLayoutEClass, LinearLayout.class, "LinearLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinearLayout_Vertical(), ecorePackage.getEBoolean(), "vertical", null, 0, 1, LinearLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinearLayout_LayoutParams(), this.getLinearLayoutParams(), null, "layoutParams", null, 0, 1, LinearLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linearLayoutParamsEClass, LinearLayoutParams.class, "LinearLayoutParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinearLayoutParams_LayoutParams(), this.getLayoutParams(), null, "layoutParams", null, 0, 1, LinearLayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinearLayoutParams_Gravity(), this.getLayoutGravityAttribute(), null, "gravity", null, 0, 1, LinearLayoutParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(frameLayoutEClass, FrameLayout.class, "FrameLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relativeLayoutEClass, RelativeLayout.class, "RelativeLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gridLayoutEClass, GridLayout.class, "GridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableLayoutEClass, TableLayout.class, "TableLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleViewEClass, SimpleView.class, "SimpleView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(galleryEClass, Gallery.class, "Gallery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expandableListViewEClass, ExpandableListView.class, "ExpandableListView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(webViewEClass, WebView.class, "WebView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(imageViewEClass, ImageView.class, "ImageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImageView_Src(), this.getDrawableResource(), null, "src", null, 0, 1, ImageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textViewEClass, TextView.class, "TextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextView_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextView_GravityAttribute(), this.getGravityAttribute(), null, "gravityAttribute", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextView_TextSizeAttribute(), this.getTextSizeAttribute(), null, "textSizeAttribute", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextView_LayoutParams(), this.getLayoutParams(), null, "layoutParams", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gravityAttributeEClass, GravityAttribute.class, "GravityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGravityAttribute_Gravity(), this.getLayoutGravityKind(), "gravity", null, 0, 1, GravityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textSizeAttributeEClass, TextSizeAttribute.class, "TextSizeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextSizeAttribute_TextSize(), this.getDimensionPropertyValue(), null, "textSize", null, 0, 1, TextSizeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(backgroundAttributeEClass, BackgroundAttribute.class, "BackgroundAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBackgroundAttribute_Background(), this.getAnyDrawablePropertyValue(), null, "background", null, 0, 1, BackgroundAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editTextEClass, EditText.class, "EditText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEditText_Text(), ecorePackage.getEString(), "text", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_GravityAttribute(), this.getGravityAttribute(), null, "gravityAttribute", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_TextSizeAttribute(), this.getTextSizeAttribute(), null, "textSizeAttribute", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_LayoutParams(), this.getLayoutParams(), null, "layoutParams", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButton_Text(), ecorePackage.getEString(), "text", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_LayoutParams(), this.getLayoutParams(), null, "layoutParams", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listViewEClass, ListView.class, "ListView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListView_Entries(), this.getArrayResource(), null, "entries", null, 0, 1, ListView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListView_Layout(), this.getView(), null, "layout", null, 0, 1, ListView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gridViewEClass, GridView.class, "GridView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(spinnerEClass, Spinner.class, "Spinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpinner_Entries(), this.getArrayResource(), null, "entries", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCheckBox_Text(), ecorePackage.getEString(), "text", null, 0, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(radioGroupEClass, RadioGroup.class, "RadioGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRadioGroup_Orientation(), ecorePackage.getEBoolean(), "orientation", null, 0, 1, RadioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRadioGroup_Radiobuttons(), this.getRadioButton(), null, "radiobuttons", null, 0, -1, RadioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ratingBarEClass, RatingBar.class, "RatingBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRatingBar_NumStars(), ecorePackage.getEInt(), "numStars", null, 0, 1, RatingBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toggleButtonEClass, ToggleButton.class, "ToggleButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getToggleButton_TextOn(), ecorePackage.getEString(), "textOn", null, 0, 1, ToggleButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getToggleButton_TextOff(), ecorePackage.getEString(), "textOff", null, 0, 1, ToggleButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRadioButton_Name(), ecorePackage.getEString(), "name", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRadioButton_Text(), ecorePackage.getEString(), "text", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRadioButton_LayoutStyle(), this.getLayoutDimensionKind(), "layoutStyle", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkedTextViewEClass, CheckedTextView.class, "CheckedTextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCheckedTextView_Text(), ecorePackage.getEString(), "text", null, 0, 1, CheckedTextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(autoCompleteTextViewEClass, AutoCompleteTextView.class, "AutoCompleteTextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAutoCompleteTextView_Entries(), this.getStringArrayResource(), null, "entries", null, 0, 1, AutoCompleteTextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAutoCompleteTextView_IsMulti(), ecorePackage.getEBoolean(), "isMulti", null, 0, 1, AutoCompleteTextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractPreferenceEClass, AbstractPreference.class, "AbstractPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractPreference_Title(), ecorePackage.getEString(), "title", null, 0, 1, AbstractPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreference_PreferenceAttributes(), this.getPreferenceAttributes(), null, "preferenceAttributes", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceScreenEClass, PreferenceScreen.class, "PreferenceScreen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreferenceScreen_Name(), ecorePackage.getEString(), "name", null, 0, 1, PreferenceScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreferenceScreen_PreferenceAttributes(), this.getPreferenceAttributes(), null, "preferenceAttributes", null, 0, 1, PreferenceScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreferenceScreen_Preferences(), this.getAbstractPreference(), null, "preferences", null, 0, -1, PreferenceScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceCategoryEClass, PreferenceCategory.class, "PreferenceCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreferenceCategory_Preferences(), this.getAbstractPreference(), null, "preferences", null, 0, -1, PreferenceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editTextPreferenceEClass, EditTextPreference.class, "EditTextPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEditTextPreference_Name(), ecorePackage.getEString(), "name", null, 0, 1, EditTextPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditTextPreference_PreferenceAttributes(), this.getPreferenceAttributes(), null, "preferenceAttributes", null, 0, 1, EditTextPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditTextPreference_DialogPreferenceAttributes(), this.getDialogPreferenceAttributes(), null, "dialogPreferenceAttributes", null, 0, 1, EditTextPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listPreferenceEClass, ListPreference.class, "ListPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListPreference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ListPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListPreference_PreferenceAttributes(), this.getPreferenceAttributes(), null, "preferenceAttributes", null, 0, 1, ListPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListPreference_DialogPreferenceAttributes(), this.getDialogPreferenceAttributes(), null, "dialogPreferenceAttributes", null, 0, 1, ListPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListPreference_ListPreferenceAttributes(), this.getListPreferenceAttributes(), null, "listPreferenceAttributes", null, 0, 1, ListPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkBoxPreferenceEClass, CheckBoxPreference.class, "CheckBoxPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCheckBoxPreference_Name(), ecorePackage.getEString(), "name", null, 0, 1, CheckBoxPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheckBoxPreference_PreferenceAttributes(), this.getPreferenceAttributes(), null, "preferenceAttributes", null, 0, 1, CheckBoxPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ringtonePrefenceEClass, RingtonePrefence.class, "RingtonePrefence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRingtonePrefence_Name(), ecorePackage.getEString(), "name", null, 0, 1, RingtonePrefence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRingtonePrefence_PreferenceAttributes(), this.getPreferenceAttributes(), null, "preferenceAttributes", null, 0, 1, RingtonePrefence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceAttributesEClass, PreferenceAttributes.class, "PreferenceAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreferenceAttributes_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, PreferenceAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPreferenceAttributes_Enabled(), ecorePackage.getEString(), "enabled", null, 0, 1, PreferenceAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPreferenceAttributes_Persistent(), ecorePackage.getEString(), "persistent", null, 0, 1, PreferenceAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialogPreferenceAttributesEClass, DialogPreferenceAttributes.class, "DialogPreferenceAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDialogPreferenceAttributes_DialogTitle(), ecorePackage.getEString(), "dialogTitle", null, 0, 1, DialogPreferenceAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDialogPreferenceAttributes_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, DialogPreferenceAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listPreferenceAttributesEClass, ListPreferenceAttributes.class, "ListPreferenceAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListPreferenceAttributes_Entries(), this.getStringArrayEntry(), null, "entries", null, 0, 1, ListPreferenceAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListPreferenceAttributes_EntryValues(), this.getStringArrayEntry(), null, "entryValues", null, 0, 1, ListPreferenceAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anyDrawablePropertyValueEClass, AnyDrawablePropertyValue.class, "AnyDrawablePropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringPropertyValueEClass, StringPropertyValue.class, "StringPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerPropertyValueEClass, IntegerPropertyValue.class, "IntegerPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerPropertyValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanPropertyValueEClass, BooleanPropertyValue.class, "BooleanPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorPropertyValueEClass, ColorPropertyValue.class, "ColorPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ColorPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionPropertyValueEClass, DimensionPropertyValue.class, "DimensionPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDimensionPropertyValue_Value(), this.getDimensionValue(), null, "value", null, 0, 1, DimensionPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawableResourceLinkEClass, DrawableResourceLink.class, "DrawableResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localDrawableResourceLinkEClass, LocalDrawableResourceLink.class, "LocalDrawableResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalDrawableResourceLink_Link(), this.getDrawableResource(), null, "link", null, 0, 1, LocalDrawableResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalDrawableResourceLinkEClass, ExternalDrawableResourceLink.class, "ExternalDrawableResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalDrawableResourceLink_ExternalResource(), this.getAndroidDrawableResource(), "externalResource", null, 0, 1, ExternalDrawableResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringResourceLinkEClass, StringResourceLink.class, "StringResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringResourceLink_Link(), this.getStringResource(), null, "link", null, 0, 1, StringResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerResourceLinkEClass, IntegerResourceLink.class, "IntegerResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerResourceLink_Link(), this.getIntegerResource(), null, "link", null, 0, 1, IntegerResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanResourceLinkEClass, BooleanResourceLink.class, "BooleanResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanResourceLink_Link(), this.getBooleanResource(), null, "link", null, 0, 1, BooleanResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorResourceLinkEClass, ColorResourceLink.class, "ColorResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorResourceLink_Link(), this.getColorResource(), null, "link", null, 0, 1, ColorResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionResourceLinkEClass, DimensionResourceLink.class, "DimensionResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDimensionResourceLink_Link(), this.getDimensionResource(), null, "link", null, 0, 1, DimensionResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(androResModelRootEClass, AndroResModelRoot.class, "AndroResModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndroResModelRoot_Resources(), this.getResource(), null, "resources", null, 0, -1, AndroResModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringResourceEClass, StringResource.class, "StringResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerResourceEClass, IntegerResource.class, "IntegerResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerResource_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanResourceEClass, BooleanResource.class, "BooleanResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorResourceEClass, ColorResource.class, "ColorResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, ColorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionResourceEClass, DimensionResource.class, "DimensionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDimensionResource_Value(), this.getDimensionValue(), null, "value", null, 0, 1, DimensionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayResourceEClass, ArrayResource.class, "ArrayResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerArrayResourceEClass, IntegerArrayResource.class, "IntegerArrayResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerArrayResource_Entries(), this.getIntegerArrayEntry(), null, "entries", null, 0, -1, IntegerArrayResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerArrayEntryEClass, IntegerArrayEntry.class, "IntegerArrayEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerArrayEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntegerArrayEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerArrayEntry_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerArrayEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringArrayResourceEClass, StringArrayResource.class, "StringArrayResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringArrayResource_Entries(), this.getStringArrayEntry(), null, "entries", null, 0, -1, StringArrayResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringArrayEntryEClass, StringArrayEntry.class, "StringArrayEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringArrayEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, StringArrayEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringArrayEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringArrayEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawableResourceEClass, DrawableResource.class, "DrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bitmapDrawableResourceEClass, BitmapDrawableResource.class, "BitmapDrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBitmapDrawableResource_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, BitmapDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDrawableResourceEClass, TransitionDrawableResource.class, "TransitionDrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionDrawableResource_From(), this.getBitmapDrawableResource(), null, "from", null, 0, 1, TransitionDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDrawableResource_To(), this.getBitmapDrawableResource(), null, "to", null, 0, 1, TransitionDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionValueEClass, DimensionValue.class, "DimensionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensionValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DimensionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionValue_Metric(), this.getDimensionMetric(), "metric", null, 0, 1, DimensionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(apiLevelEEnum, ApiLevel.class, "ApiLevel");
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API8);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API9);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API10);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API11);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API12);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API14);

    initEEnum(activityThemeEEnum, ActivityTheme.class, "ActivityTheme");
    addEEnumLiteral(activityThemeEEnum, ActivityTheme.DIALOG);
    addEEnumLiteral(activityThemeEEnum, ActivityTheme.NOTITLE);
    addEEnumLiteral(activityThemeEEnum, ActivityTheme.FULLSCREEN);

    initEEnum(dataTypesEEnum, DataTypes.class, "DataTypes");
    addEEnumLiteral(dataTypesEEnum, DataTypes.STRING);
    addEEnumLiteral(dataTypesEEnum, DataTypes.FLOAT);
    addEEnumLiteral(dataTypesEEnum, DataTypes.BOOLEAN);
    addEEnumLiteral(dataTypesEEnum, DataTypes.INT);

    initEEnum(layoutGravityKindEEnum, LayoutGravityKind.class, "LayoutGravityKind");
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.TOP);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.BOTTOM);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.LEFT);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.RIGHT);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CENTER);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CENTER_VERTICAL);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CENTER_HORIZONTAL);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.FILL);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.FILL_VERTICAL);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.FILL_HORIZONTAL);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CLIP_VERTICAL);
    addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CLIP_HORIZONTAL);

    initEEnum(layoutDimensionKindEEnum, LayoutDimensionKind.class, "LayoutDimensionKind");
    addEEnumLiteral(layoutDimensionKindEEnum, LayoutDimensionKind.FILL);
    addEEnumLiteral(layoutDimensionKindEEnum, LayoutDimensionKind.WRAP);
    addEEnumLiteral(layoutDimensionKindEEnum, LayoutDimensionKind.FILL_WRAP);
    addEEnumLiteral(layoutDimensionKindEEnum, LayoutDimensionKind.WRAP_FILL);

    initEEnum(androidDrawableResourceEEnum, AndroidDrawableResource.class, "AndroidDrawableResource");
    addEEnumLiteral(androidDrawableResourceEEnum, AndroidDrawableResource.ANDROID_EDITBOX_BACKGROUND);

    initEEnum(dimensionMetricEEnum, DimensionMetric.class, "DimensionMetric");
    addEEnumLiteral(dimensionMetricEEnum, DimensionMetric.DP);
    addEEnumLiteral(dimensionMetricEEnum, DimensionMetric.SP);
    addEEnumLiteral(dimensionMetricEEnum, DimensionMetric.PT);
    addEEnumLiteral(dimensionMetricEEnum, DimensionMetric.PX);
    addEEnumLiteral(dimensionMetricEEnum, DimensionMetric.MM);
    addEEnumLiteral(dimensionMetricEEnum, DimensionMetric.IN);

    // Create resource
    createResource(eNS_URI);
  }

} //AndroTextDslPackageImpl
