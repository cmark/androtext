/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.util;

import hu.bme.mit.androtext.lang.androTextDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage
 * @generated
 */
public class AndroTextDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AndroTextDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroTextDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AndroTextDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroTextDslSwitch<Adapter> modelSwitch =
    new AndroTextDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseAndroTextModelRoot(AndroTextModelRoot object)
      {
        return createAndroTextModelRootAdapter();
      }
      @Override
      public Adapter caseModelRoot(ModelRoot object)
      {
        return createModelRootAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseAndroGenModelRoot(AndroGenModelRoot object)
      {
        return createAndroGenModelRootAdapter();
      }
      @Override
      public Adapter caseTargetApplication(TargetApplication object)
      {
        return createTargetApplicationAdapter();
      }
      @Override
      public Adapter caseAndroidApplication(AndroidApplication object)
      {
        return createAndroidApplicationAdapter();
      }
      @Override
      public Adapter caseAndroidApplicationModelElement(AndroidApplicationModelElement object)
      {
        return createAndroidApplicationModelElementAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter caseSimpleActivity(SimpleActivity object)
      {
        return createSimpleActivityAdapter();
      }
      @Override
      public Adapter caseTabActivity(TabActivity object)
      {
        return createTabActivityAdapter();
      }
      @Override
      public Adapter caseTab(Tab object)
      {
        return createTabAdapter();
      }
      @Override
      public Adapter caseListActivity(ListActivity object)
      {
        return createListActivityAdapter();
      }
      @Override
      public Adapter casePreferenceActivity(PreferenceActivity object)
      {
        return createPreferenceActivityAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseInvokeActivity(InvokeActivity object)
      {
        return createInvokeActivityAdapter();
      }
      @Override
      public Adapter caseInvokeWebUrl(InvokeWebUrl object)
      {
        return createInvokeWebUrlAdapter();
      }
      @Override
      public Adapter caseAndroDataModelRoot(AndroDataModelRoot object)
      {
        return createAndroDataModelRootAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseTypeRef(TypeRef object)
      {
        return createTypeRefAdapter();
      }
      @Override
      public Adapter caseDataTypesRef(DataTypesRef object)
      {
        return createDataTypesRefAdapter();
      }
      @Override
      public Adapter caseEntityTypeRef(EntityTypeRef object)
      {
        return createEntityTypeRefAdapter();
      }
      @Override
      public Adapter caseAndroGuiModelRoot(AndroGuiModelRoot object)
      {
        return createAndroGuiModelRootAdapter();
      }
      @Override
      public Adapter caseView(View object)
      {
        return createViewAdapter();
      }
      @Override
      public Adapter caseViewGroup(ViewGroup object)
      {
        return createViewGroupAdapter();
      }
      @Override
      public Adapter caseLayoutParams(LayoutParams object)
      {
        return createLayoutParamsAdapter();
      }
      @Override
      public Adapter caseLayoutGravityAttribute(LayoutGravityAttribute object)
      {
        return createLayoutGravityAttributeAdapter();
      }
      @Override
      public Adapter caseAbsoluteLayout(AbsoluteLayout object)
      {
        return createAbsoluteLayoutAdapter();
      }
      @Override
      public Adapter caseLinearLayout(LinearLayout object)
      {
        return createLinearLayoutAdapter();
      }
      @Override
      public Adapter caseLinearLayoutParams(LinearLayoutParams object)
      {
        return createLinearLayoutParamsAdapter();
      }
      @Override
      public Adapter caseFrameLayout(FrameLayout object)
      {
        return createFrameLayoutAdapter();
      }
      @Override
      public Adapter caseRelativeLayout(RelativeLayout object)
      {
        return createRelativeLayoutAdapter();
      }
      @Override
      public Adapter caseGridLayout(GridLayout object)
      {
        return createGridLayoutAdapter();
      }
      @Override
      public Adapter caseTableLayout(TableLayout object)
      {
        return createTableLayoutAdapter();
      }
      @Override
      public Adapter caseSimpleView(SimpleView object)
      {
        return createSimpleViewAdapter();
      }
      @Override
      public Adapter caseGallery(Gallery object)
      {
        return createGalleryAdapter();
      }
      @Override
      public Adapter caseExpandableListView(ExpandableListView object)
      {
        return createExpandableListViewAdapter();
      }
      @Override
      public Adapter caseWebView(WebView object)
      {
        return createWebViewAdapter();
      }
      @Override
      public Adapter caseImageView(ImageView object)
      {
        return createImageViewAdapter();
      }
      @Override
      public Adapter caseTextView(TextView object)
      {
        return createTextViewAdapter();
      }
      @Override
      public Adapter caseGravityAttribute(GravityAttribute object)
      {
        return createGravityAttributeAdapter();
      }
      @Override
      public Adapter caseTextSizeAttribute(TextSizeAttribute object)
      {
        return createTextSizeAttributeAdapter();
      }
      @Override
      public Adapter caseBackgroundAttribute(BackgroundAttribute object)
      {
        return createBackgroundAttributeAdapter();
      }
      @Override
      public Adapter caseEditText(EditText object)
      {
        return createEditTextAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseListView(ListView object)
      {
        return createListViewAdapter();
      }
      @Override
      public Adapter caseGridView(GridView object)
      {
        return createGridViewAdapter();
      }
      @Override
      public Adapter caseSpinner(Spinner object)
      {
        return createSpinnerAdapter();
      }
      @Override
      public Adapter caseCheckBox(CheckBox object)
      {
        return createCheckBoxAdapter();
      }
      @Override
      public Adapter caseRadioGroup(RadioGroup object)
      {
        return createRadioGroupAdapter();
      }
      @Override
      public Adapter caseRatingBar(RatingBar object)
      {
        return createRatingBarAdapter();
      }
      @Override
      public Adapter caseToggleButton(ToggleButton object)
      {
        return createToggleButtonAdapter();
      }
      @Override
      public Adapter caseRadioButton(RadioButton object)
      {
        return createRadioButtonAdapter();
      }
      @Override
      public Adapter caseCheckedTextView(CheckedTextView object)
      {
        return createCheckedTextViewAdapter();
      }
      @Override
      public Adapter caseAutoCompleteTextView(AutoCompleteTextView object)
      {
        return createAutoCompleteTextViewAdapter();
      }
      @Override
      public Adapter caseAbstractPreference(AbstractPreference object)
      {
        return createAbstractPreferenceAdapter();
      }
      @Override
      public Adapter casePreference(Preference object)
      {
        return createPreferenceAdapter();
      }
      @Override
      public Adapter casePreferenceScreen(PreferenceScreen object)
      {
        return createPreferenceScreenAdapter();
      }
      @Override
      public Adapter casePreferenceCategory(PreferenceCategory object)
      {
        return createPreferenceCategoryAdapter();
      }
      @Override
      public Adapter caseEditTextPreference(EditTextPreference object)
      {
        return createEditTextPreferenceAdapter();
      }
      @Override
      public Adapter caseListPreference(ListPreference object)
      {
        return createListPreferenceAdapter();
      }
      @Override
      public Adapter caseCheckBoxPreference(CheckBoxPreference object)
      {
        return createCheckBoxPreferenceAdapter();
      }
      @Override
      public Adapter caseRingtonePrefence(RingtonePrefence object)
      {
        return createRingtonePrefenceAdapter();
      }
      @Override
      public Adapter casePreferenceAttributes(PreferenceAttributes object)
      {
        return createPreferenceAttributesAdapter();
      }
      @Override
      public Adapter caseDialogPreferenceAttributes(DialogPreferenceAttributes object)
      {
        return createDialogPreferenceAttributesAdapter();
      }
      @Override
      public Adapter caseListPreferenceAttributes(ListPreferenceAttributes object)
      {
        return createListPreferenceAttributesAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseAnyDrawablePropertyValue(AnyDrawablePropertyValue object)
      {
        return createAnyDrawablePropertyValueAdapter();
      }
      @Override
      public Adapter caseStringPropertyValue(StringPropertyValue object)
      {
        return createStringPropertyValueAdapter();
      }
      @Override
      public Adapter caseIntegerPropertyValue(IntegerPropertyValue object)
      {
        return createIntegerPropertyValueAdapter();
      }
      @Override
      public Adapter caseBooleanPropertyValue(BooleanPropertyValue object)
      {
        return createBooleanPropertyValueAdapter();
      }
      @Override
      public Adapter caseColorPropertyValue(ColorPropertyValue object)
      {
        return createColorPropertyValueAdapter();
      }
      @Override
      public Adapter caseDimensionPropertyValue(DimensionPropertyValue object)
      {
        return createDimensionPropertyValueAdapter();
      }
      @Override
      public Adapter caseDrawableResourceLink(DrawableResourceLink object)
      {
        return createDrawableResourceLinkAdapter();
      }
      @Override
      public Adapter caseLocalDrawableResourceLink(LocalDrawableResourceLink object)
      {
        return createLocalDrawableResourceLinkAdapter();
      }
      @Override
      public Adapter caseExternalDrawableResourceLink(ExternalDrawableResourceLink object)
      {
        return createExternalDrawableResourceLinkAdapter();
      }
      @Override
      public Adapter caseStringResourceLink(StringResourceLink object)
      {
        return createStringResourceLinkAdapter();
      }
      @Override
      public Adapter caseIntegerResourceLink(IntegerResourceLink object)
      {
        return createIntegerResourceLinkAdapter();
      }
      @Override
      public Adapter caseBooleanResourceLink(BooleanResourceLink object)
      {
        return createBooleanResourceLinkAdapter();
      }
      @Override
      public Adapter caseColorResourceLink(ColorResourceLink object)
      {
        return createColorResourceLinkAdapter();
      }
      @Override
      public Adapter caseDimensionResourceLink(DimensionResourceLink object)
      {
        return createDimensionResourceLinkAdapter();
      }
      @Override
      public Adapter caseAndroResModelRoot(AndroResModelRoot object)
      {
        return createAndroResModelRootAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseStringResource(StringResource object)
      {
        return createStringResourceAdapter();
      }
      @Override
      public Adapter caseIntegerResource(IntegerResource object)
      {
        return createIntegerResourceAdapter();
      }
      @Override
      public Adapter caseBooleanResource(BooleanResource object)
      {
        return createBooleanResourceAdapter();
      }
      @Override
      public Adapter caseColorResource(ColorResource object)
      {
        return createColorResourceAdapter();
      }
      @Override
      public Adapter caseDimensionResource(DimensionResource object)
      {
        return createDimensionResourceAdapter();
      }
      @Override
      public Adapter caseArrayResource(ArrayResource object)
      {
        return createArrayResourceAdapter();
      }
      @Override
      public Adapter caseIntegerArrayResource(IntegerArrayResource object)
      {
        return createIntegerArrayResourceAdapter();
      }
      @Override
      public Adapter caseIntegerArrayEntry(IntegerArrayEntry object)
      {
        return createIntegerArrayEntryAdapter();
      }
      @Override
      public Adapter caseStringArrayResource(StringArrayResource object)
      {
        return createStringArrayResourceAdapter();
      }
      @Override
      public Adapter caseStringArrayEntry(StringArrayEntry object)
      {
        return createStringArrayEntryAdapter();
      }
      @Override
      public Adapter caseDrawableResource(DrawableResource object)
      {
        return createDrawableResourceAdapter();
      }
      @Override
      public Adapter caseBitmapDrawableResource(BitmapDrawableResource object)
      {
        return createBitmapDrawableResourceAdapter();
      }
      @Override
      public Adapter caseTransitionDrawableResource(TransitionDrawableResource object)
      {
        return createTransitionDrawableResourceAdapter();
      }
      @Override
      public Adapter caseDimensionValue(DimensionValue object)
      {
        return createDimensionValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot <em>Andro Text Model Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot
   * @generated
   */
  public Adapter createAndroTextModelRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ModelRoot <em>Model Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ModelRoot
   * @generated
   */
  public Adapter createModelRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot <em>Andro Gen Model Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot
   * @generated
   */
  public Adapter createAndroGenModelRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication <em>Target Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
   * @generated
   */
  public Adapter createTargetApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication <em>Android Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication
   * @generated
   */
  public Adapter createAndroidApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement <em>Android Application Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement
   * @generated
   */
  public Adapter createAndroidApplicationModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity <em>Simple Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity
   * @generated
   */
  public Adapter createSimpleActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.TabActivity <em>Tab Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TabActivity
   * @generated
   */
  public Adapter createTabActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Tab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Tab
   * @generated
   */
  public Adapter createTabAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity <em>List Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListActivity
   * @generated
   */
  public Adapter createListActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity <em>Preference Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
   * @generated
   */
  public Adapter createPreferenceActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity <em>Invoke Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity
   * @generated
   */
  public Adapter createInvokeActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.InvokeWebUrl <em>Invoke Web Url</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.InvokeWebUrl
   * @generated
   */
  public Adapter createInvokeWebUrlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot <em>Andro Data Model Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot
   * @generated
   */
  public Adapter createAndroDataModelRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypeRef
   * @generated
   */
  public Adapter createTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef <em>Data Types Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef
   * @generated
   */
  public Adapter createDataTypesRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef <em>Entity Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef
   * @generated
   */
  public Adapter createEntityTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot <em>Andro Gui Model Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot
   * @generated
   */
  public Adapter createAndroGuiModelRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.View
   * @generated
   */
  public Adapter createViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ViewGroup <em>View Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ViewGroup
   * @generated
   */
  public Adapter createViewGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams <em>Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams
   * @generated
   */
  public Adapter createLayoutParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute <em>Layout Gravity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute
   * @generated
   */
  public Adapter createLayoutGravityAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout <em>Absolute Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout
   * @generated
   */
  public Adapter createAbsoluteLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout <em>Linear Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayout
   * @generated
   */
  public Adapter createLinearLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams <em>Linear Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams
   * @generated
   */
  public Adapter createLinearLayoutParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.FrameLayout <em>Frame Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FrameLayout
   * @generated
   */
  public Adapter createFrameLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout <em>Relative Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout
   * @generated
   */
  public Adapter createRelativeLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.GridLayout <em>Grid Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridLayout
   * @generated
   */
  public Adapter createGridLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout <em>Table Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TableLayout
   * @generated
   */
  public Adapter createTableLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleView <em>Simple View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SimpleView
   * @generated
   */
  public Adapter createSimpleViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Gallery <em>Gallery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Gallery
   * @generated
   */
  public Adapter createGalleryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ExpandableListView <em>Expandable List View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ExpandableListView
   * @generated
   */
  public Adapter createExpandableListViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.WebView <em>Web View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.WebView
   * @generated
   */
  public Adapter createWebViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView <em>Image View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView
   * @generated
   */
  public Adapter createImageViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView <em>Text View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView
   * @generated
   */
  public Adapter createTextViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute <em>Gravity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute
   * @generated
   */
  public Adapter createGravityAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute <em>Text Size Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute
   * @generated
   */
  public Adapter createTextSizeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute
   * @generated
   */
  public Adapter createBackgroundAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText <em>Edit Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText
   * @generated
   */
  public Adapter createEditTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListView <em>List View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListView
   * @generated
   */
  public Adapter createListViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView <em>Grid View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView
   * @generated
   */
  public Adapter createGridViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner <em>Spinner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner
   * @generated
   */
  public Adapter createSpinnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBox
   * @generated
   */
  public Adapter createCheckBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioGroup <em>Radio Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioGroup
   * @generated
   */
  public Adapter createRadioGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.RatingBar <em>Rating Bar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RatingBar
   * @generated
   */
  public Adapter createRatingBarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton <em>Toggle Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToggleButton
   * @generated
   */
  public Adapter createToggleButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton <em>Radio Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioButton
   * @generated
   */
  public Adapter createRadioButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView <em>Checked Text View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView
   * @generated
   */
  public Adapter createCheckedTextViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView <em>Auto Complete Text View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView
   * @generated
   */
  public Adapter createAutoCompleteTextViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference <em>Abstract Preference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference
   * @generated
   */
  public Adapter createAbstractPreferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Preference <em>Preference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Preference
   * @generated
   */
  public Adapter createPreferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen <em>Preference Screen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen
   * @generated
   */
  public Adapter createPreferenceScreenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory <em>Preference Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory
   * @generated
   */
  public Adapter createPreferenceCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference <em>Edit Text Preference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference
   * @generated
   */
  public Adapter createEditTextPreferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference <em>List Preference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreference
   * @generated
   */
  public Adapter createListPreferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference <em>Check Box Preference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference
   * @generated
   */
  public Adapter createCheckBoxPreferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence <em>Ringtone Prefence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence
   * @generated
   */
  public Adapter createRingtonePrefenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes
   * @generated
   */
  public Adapter createPreferenceAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes <em>Dialog Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes
   * @generated
   */
  public Adapter createDialogPreferenceAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes <em>List Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes
   * @generated
   */
  public Adapter createListPreferenceAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue <em>Any Drawable Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue
   * @generated
   */
  public Adapter createAnyDrawablePropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue <em>String Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue
   * @generated
   */
  public Adapter createStringPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue <em>Integer Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue
   * @generated
   */
  public Adapter createIntegerPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue <em>Boolean Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue
   * @generated
   */
  public Adapter createBooleanPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue <em>Color Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue
   * @generated
   */
  public Adapter createColorPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue <em>Dimension Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue
   * @generated
   */
  public Adapter createDimensionPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink <em>Drawable Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink
   * @generated
   */
  public Adapter createDrawableResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink <em>Local Drawable Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink
   * @generated
   */
  public Adapter createLocalDrawableResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink <em>External Drawable Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink
   * @generated
   */
  public Adapter createExternalDrawableResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink <em>String Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink
   * @generated
   */
  public Adapter createStringResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink <em>Integer Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink
   * @generated
   */
  public Adapter createIntegerResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink <em>Boolean Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink
   * @generated
   */
  public Adapter createBooleanResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink <em>Color Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink
   * @generated
   */
  public Adapter createColorResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink <em>Dimension Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink
   * @generated
   */
  public Adapter createDimensionResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot <em>Andro Res Model Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot
   * @generated
   */
  public Adapter createAndroResModelRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringResource <em>String Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringResource
   * @generated
   */
  public Adapter createStringResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerResource <em>Integer Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerResource
   * @generated
   */
  public Adapter createIntegerResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanResource <em>Boolean Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanResource
   * @generated
   */
  public Adapter createBooleanResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorResource <em>Color Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorResource
   * @generated
   */
  public Adapter createColorResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionResource <em>Dimension Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionResource
   * @generated
   */
  public Adapter createDimensionResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.ArrayResource <em>Array Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ArrayResource
   * @generated
   */
  public Adapter createArrayResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource <em>Integer Array Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource
   * @generated
   */
  public Adapter createIntegerArrayResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry <em>Integer Array Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry
   * @generated
   */
  public Adapter createIntegerArrayEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource <em>String Array Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource
   * @generated
   */
  public Adapter createStringArrayResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry <em>String Array Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry
   * @generated
   */
  public Adapter createStringArrayEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DrawableResource <em>Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DrawableResource
   * @generated
   */
  public Adapter createDrawableResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource
   * @generated
   */
  public Adapter createBitmapDrawableResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource
   * @generated
   */
  public Adapter createTransitionDrawableResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue <em>Dimension Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionValue
   * @generated
   */
  public Adapter createDimensionValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AndroTextDslAdapterFactory
