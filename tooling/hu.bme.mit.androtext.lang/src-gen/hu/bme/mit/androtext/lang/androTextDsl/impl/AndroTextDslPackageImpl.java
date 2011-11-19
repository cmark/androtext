/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslFactory;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.ApiLevel;
import hu.bme.mit.androtext.lang.androTextDsl.ArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.BaseLayout;
import hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.CheckBox;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResource;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypes;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.FrameLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Import;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResource;
import hu.bme.mit.androtext.lang.androTextDsl.Layout;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.ModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.RadioButton;
import hu.bme.mit.androtext.lang.androTextDsl.RadioGroup;
import hu.bme.mit.androtext.lang.androTextDsl.RatingBar;
import hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Resource;
import hu.bme.mit.androtext.lang.androTextDsl.RootLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Spinner;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.StringResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;
import hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.UIElement;
import hu.bme.mit.androtext.lang.androTextDsl.Widget;

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
  private EClass tabActivityEClass = null;

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
  private EClass uiElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseLayoutEClass = null;

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
  private EClass widgetEClass = null;

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
  private EClass preferenceScreenEClass = null;

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
  private EEnum apiLevelEEnum = null;

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
  private EEnum layoutStyleEEnum = null;

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
  public EReference getActivity_Layout()
  {
    return (EReference)activityEClass.getEStructuralFeatures().get(0);
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
  public EReference getAndroGuiModelRoot_RootLayout()
  {
    return (EReference)androGuiModelRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIElement()
  {
    return uiElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayout()
  {
    return layoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRootLayout()
  {
    return rootLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRootLayout_Name()
  {
    return (EAttribute)rootLayoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseLayout()
  {
    return baseLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBaseLayout_LayoutStyle()
  {
    return (EAttribute)baseLayoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseLayout_Elements()
  {
    return (EReference)baseLayoutEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getLinearLayout_Orientation()
  {
    return (EAttribute)linearLayoutEClass.getEStructuralFeatures().get(0);
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
  public EClass getWidget()
  {
    return widgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidget_Name()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidget_LayoutStyle()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
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
  public EClass getPreferenceScreen()
  {
    return preferenceScreenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceScreen_Title()
  {
    return (EAttribute)preferenceScreenEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getDimensionResource_Value()
  {
    return (EAttribute)dimensionResourceEClass.getEStructuralFeatures().get(0);
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
  public EEnum getApiLevel()
  {
    return apiLevelEEnum;
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
  public EEnum getLayoutStyle()
  {
    return layoutStyleEEnum;
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
    createEReference(activityEClass, ACTIVITY__LAYOUT);

    tabActivityEClass = createEClass(TAB_ACTIVITY);

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
    createEReference(androGuiModelRootEClass, ANDRO_GUI_MODEL_ROOT__ROOT_LAYOUT);

    uiElementEClass = createEClass(UI_ELEMENT);

    layoutEClass = createEClass(LAYOUT);

    rootLayoutEClass = createEClass(ROOT_LAYOUT);
    createEAttribute(rootLayoutEClass, ROOT_LAYOUT__NAME);

    baseLayoutEClass = createEClass(BASE_LAYOUT);
    createEAttribute(baseLayoutEClass, BASE_LAYOUT__LAYOUT_STYLE);
    createEReference(baseLayoutEClass, BASE_LAYOUT__ELEMENTS);

    absoluteLayoutEClass = createEClass(ABSOLUTE_LAYOUT);

    linearLayoutEClass = createEClass(LINEAR_LAYOUT);
    createEAttribute(linearLayoutEClass, LINEAR_LAYOUT__ORIENTATION);

    frameLayoutEClass = createEClass(FRAME_LAYOUT);

    relativeLayoutEClass = createEClass(RELATIVE_LAYOUT);

    widgetEClass = createEClass(WIDGET);
    createEAttribute(widgetEClass, WIDGET__NAME);
    createEAttribute(widgetEClass, WIDGET__LAYOUT_STYLE);

    textViewEClass = createEClass(TEXT_VIEW);
    createEAttribute(textViewEClass, TEXT_VIEW__TEXT);

    editTextEClass = createEClass(EDIT_TEXT);
    createEAttribute(editTextEClass, EDIT_TEXT__TEXT);

    buttonEClass = createEClass(BUTTON);
    createEAttribute(buttonEClass, BUTTON__TEXT);

    listViewEClass = createEClass(LIST_VIEW);
    createEReference(listViewEClass, LIST_VIEW__ENTRIES);
    createEReference(listViewEClass, LIST_VIEW__LAYOUT);

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

    preferenceScreenEClass = createEClass(PREFERENCE_SCREEN);
    createEAttribute(preferenceScreenEClass, PREFERENCE_SCREEN__TITLE);

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
    createEAttribute(dimensionResourceEClass, DIMENSION_RESOURCE__VALUE);

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

    // Create enums
    apiLevelEEnum = createEEnum(API_LEVEL);
    dataTypesEEnum = createEEnum(DATA_TYPES);
    layoutStyleEEnum = createEEnum(LAYOUT_STYLE);
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
    tabActivityEClass.getESuperTypes().add(this.getAndroidApplicationModelElement());
    androDataModelRootEClass.getESuperTypes().add(this.getModelRoot());
    dataTypesRefEClass.getESuperTypes().add(this.getTypeRef());
    entityTypeRefEClass.getESuperTypes().add(this.getTypeRef());
    androGuiModelRootEClass.getESuperTypes().add(this.getModelRoot());
    layoutEClass.getESuperTypes().add(this.getUIElement());
    rootLayoutEClass.getESuperTypes().add(this.getLayout());
    baseLayoutEClass.getESuperTypes().add(this.getRootLayout());
    absoluteLayoutEClass.getESuperTypes().add(this.getBaseLayout());
    linearLayoutEClass.getESuperTypes().add(this.getBaseLayout());
    frameLayoutEClass.getESuperTypes().add(this.getBaseLayout());
    relativeLayoutEClass.getESuperTypes().add(this.getBaseLayout());
    widgetEClass.getESuperTypes().add(this.getUIElement());
    textViewEClass.getESuperTypes().add(this.getWidget());
    editTextEClass.getESuperTypes().add(this.getWidget());
    buttonEClass.getESuperTypes().add(this.getWidget());
    listViewEClass.getESuperTypes().add(this.getWidget());
    spinnerEClass.getESuperTypes().add(this.getWidget());
    checkBoxEClass.getESuperTypes().add(this.getWidget());
    radioGroupEClass.getESuperTypes().add(this.getWidget());
    ratingBarEClass.getESuperTypes().add(this.getWidget());
    toggleButtonEClass.getESuperTypes().add(this.getWidget());
    preferenceScreenEClass.getESuperTypes().add(this.getRootLayout());
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
    initEReference(getActivity_Layout(), this.getRootLayout(), null, "layout", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabActivityEClass, TabActivity.class, "TabActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
    initEReference(getAndroGuiModelRoot_RootLayout(), this.getRootLayout(), null, "rootLayout", null, 0, -1, AndroGuiModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiElementEClass, UIElement.class, "UIElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rootLayoutEClass, RootLayout.class, "RootLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRootLayout_Name(), ecorePackage.getEString(), "name", null, 0, 1, RootLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseLayoutEClass, BaseLayout.class, "BaseLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBaseLayout_LayoutStyle(), this.getLayoutStyle(), "layoutStyle", null, 0, 1, BaseLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseLayout_Elements(), this.getUIElement(), null, "elements", null, 0, -1, BaseLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(absoluteLayoutEClass, AbsoluteLayout.class, "AbsoluteLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linearLayoutEClass, LinearLayout.class, "LinearLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinearLayout_Orientation(), ecorePackage.getEBoolean(), "orientation", null, 0, 1, LinearLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(frameLayoutEClass, FrameLayout.class, "FrameLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relativeLayoutEClass, RelativeLayout.class, "RelativeLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWidget_Name(), ecorePackage.getEString(), "name", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWidget_LayoutStyle(), this.getLayoutStyle(), "layoutStyle", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textViewEClass, TextView.class, "TextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextView_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editTextEClass, EditText.class, "EditText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEditText_Text(), ecorePackage.getEString(), "text", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButton_Text(), ecorePackage.getEString(), "text", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listViewEClass, ListView.class, "ListView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListView_Entries(), this.getArrayResource(), null, "entries", null, 0, 1, ListView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListView_Layout(), this.getLayout(), null, "layout", null, 0, 1, ListView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinnerEClass, Spinner.class, "Spinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpinner_Entries(), this.getResource(), null, "entries", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEAttribute(getRadioButton_LayoutStyle(), this.getLayoutStyle(), "layoutStyle", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceScreenEClass, PreferenceScreen.class, "PreferenceScreen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreferenceScreen_Title(), ecorePackage.getEString(), "title", null, 0, 1, PreferenceScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEAttribute(getDimensionResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, DimensionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    // Initialize enums and add enum literals
    initEEnum(apiLevelEEnum, ApiLevel.class, "ApiLevel");
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API8);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API9);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API10);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API11);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API12);
    addEEnumLiteral(apiLevelEEnum, ApiLevel.API14);

    initEEnum(dataTypesEEnum, DataTypes.class, "DataTypes");
    addEEnumLiteral(dataTypesEEnum, DataTypes.STRING);
    addEEnumLiteral(dataTypesEEnum, DataTypes.FLOAT);
    addEEnumLiteral(dataTypesEEnum, DataTypes.BOOLEAN);
    addEEnumLiteral(dataTypesEEnum, DataTypes.INT);

    initEEnum(layoutStyleEEnum, LayoutStyle.class, "LayoutStyle");
    addEEnumLiteral(layoutStyleEEnum, LayoutStyle.FILL);
    addEEnumLiteral(layoutStyleEEnum, LayoutStyle.WRAP);
    addEEnumLiteral(layoutStyleEEnum, LayoutStyle.FILL_WRAP);
    addEEnumLiteral(layoutStyleEEnum, LayoutStyle.WRAP_FILL);

    // Create resource
    createResource(eNS_URI);
  }

} //AndroTextDslPackageImpl
