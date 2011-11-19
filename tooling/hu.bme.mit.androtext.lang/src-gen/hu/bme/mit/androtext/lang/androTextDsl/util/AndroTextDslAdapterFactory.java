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
      public Adapter caseTabActivity(TabActivity object)
      {
        return createTabActivityAdapter();
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
      public Adapter caseUIElement(UIElement object)
      {
        return createUIElementAdapter();
      }
      @Override
      public Adapter caseLayout(Layout object)
      {
        return createLayoutAdapter();
      }
      @Override
      public Adapter caseRootLayout(RootLayout object)
      {
        return createRootLayoutAdapter();
      }
      @Override
      public Adapter caseBaseLayout(BaseLayout object)
      {
        return createBaseLayoutAdapter();
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
      public Adapter caseWidget(Widget object)
      {
        return createWidgetAdapter();
      }
      @Override
      public Adapter caseTextView(TextView object)
      {
        return createTextViewAdapter();
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
      public Adapter casePreferenceScreen(PreferenceScreen object)
      {
        return createPreferenceScreenAdapter();
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
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.UIElement <em>UI Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.UIElement
   * @generated
   */
  public Adapter createUIElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.RootLayout <em>Root Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RootLayout
   * @generated
   */
  public Adapter createRootLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseLayout <em>Base Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BaseLayout
   * @generated
   */
  public Adapter createBaseLayoutAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.bme.mit.androtext.lang.androTextDsl.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Widget
   * @generated
   */
  public Adapter createWidgetAdapter()
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
