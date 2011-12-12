/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl.impl;

import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslFactory;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

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
  protected String packageFilename = "androTextDsl.ecore";

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
  private EClass contentProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceContentProviderEClass = null;

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
  private EClass layoutPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regularLayoutStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fastLayoutStyleEClass = null;

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
  private EClass tableRowEClass = null;

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
  private EClass viewElementEClass = null;

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
  private EClass spanAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass centerVerticalAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass centerInParentAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass centerHorizontalAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toRightOfAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toLeftOfAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aboveAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass belowAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignLeftAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignBottomAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignTopAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignParentLeftAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignParentTopAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignParentRightAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignParentBottomAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass marginBottomAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass marginRightAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass marginTopAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weightAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass marginLeftAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textStyleAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typefaceAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textColorAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleLineAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phoneNumberAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass passwordAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hintAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editableAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digitsAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capitalizeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autoTextAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isScrollContainerAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fadeScrollBarsAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clickableAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autoLinkAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widthAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heightAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paddingAttributeEClass = null;

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
  private EClass columnWidthAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horizontalSpacingAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numColumnsAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stretchModeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verticalSpacingAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entriesAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stretchColumnsAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shrinkColumnsAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collapseColumnsAttributeEClass = null;

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
  private EClass layoutDimensionPropertyValueEClass = null;

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
  private EClass tabDrawableResourceLinkEClass = null;

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
  private EClass tabDrawableResourceEClass = null;

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
  private EClass baseGameActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androGameRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androGameComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androGameGuiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androGameLogicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androGameBox2DLogicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass box2DOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass box2DComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass revoluteJointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distanceJointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass circleBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixtureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sceneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuSceneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameBackgroundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameMenuItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifierBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass box2DBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEntityModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopEntityModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveByModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alphaModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rotationByModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rotationModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toTripleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromTripleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toSingleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromSingleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass byDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bySingleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rectangleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spriteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass animatedSpriteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textureRegionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tiledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontEClass = null;

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
  private EEnum numericKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typefaceKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum textStyleKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum capitalizeKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum autoLinkKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stretchModeKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum gravityKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fastLayoutDimensionKindEEnum = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum bodyTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sensorTargetEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sensorTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constantColorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum horizontalAlignEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fontTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum screenOrientationEEnum = null;

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
   * @generated
   */
  public static AndroTextDslPackage init()
  {
    if (isInited) return (AndroTextDslPackage)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI);

    // Obtain or create and register package
    AndroTextDslPackageImpl theAndroTextDslPackage = (AndroTextDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AndroTextDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AndroTextDslPackageImpl());

    isInited = true;

    // Load packages
    theAndroTextDslPackage.loadPackage();

    // Fix loaded packages
    theAndroTextDslPackage.fixPackageContents();

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
    if (androTextModelRootEClass == null)
    {
      androTextModelRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(0);
    }
    return androTextModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroTextModelRoot_Name()
  {
        return (EAttribute)getAndroTextModelRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroTextModelRoot_Imports()
  {
        return (EReference)getAndroTextModelRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroTextModelRoot_ActualModelRoot()
  {
        return (EReference)getAndroTextModelRoot().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelRoot()
  {
    if (modelRootEClass == null)
    {
      modelRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(1);
    }
    return modelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    if (importEClass == null)
    {
      importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(2);
    }
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
        return (EAttribute)getImport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGenModelRoot()
  {
    if (androGenModelRootEClass == null)
    {
      androGenModelRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(3);
    }
    return androGenModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroGenModelRoot_Name()
  {
        return (EAttribute)getAndroGenModelRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGenModelRoot_TargetApplications()
  {
        return (EReference)getAndroGenModelRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetApplication()
  {
    if (targetApplicationEClass == null)
    {
      targetApplicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(4);
    }
    return targetApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTargetApplication_Application()
  {
        return (EReference)getTargetApplication().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_ProjectName()
  {
        return (EAttribute)getTargetApplication().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_PackageName()
  {
        return (EAttribute)getTargetApplication().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_Target()
  {
        return (EAttribute)getTargetApplication().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetApplication_Version()
  {
        return (EAttribute)getTargetApplication().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroidApplication()
  {
    if (androidApplicationEClass == null)
    {
      androidApplicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(6);
    }
    return androidApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroidApplication_Name()
  {
        return (EAttribute)getAndroidApplication().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroidApplication_Dataroot()
  {
        return (EReference)getAndroidApplication().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroidApplication_MainActivity()
  {
        return (EReference)getAndroidApplication().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroidApplication_ModelElements()
  {
        return (EReference)getAndroidApplication().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroidApplicationModelElement()
  {
    if (androidApplicationModelElementEClass == null)
    {
      androidApplicationModelElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(7);
    }
    return androidApplicationModelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroidApplicationModelElement_Name()
  {
        return (EAttribute)getAndroidApplicationModelElement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivity()
  {
    if (activityEClass == null)
    {
      activityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(8);
    }
    return activityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivity_Layout()
  {
        return (EReference)getActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivity_Theme()
  {
        return (EAttribute)getActivity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabActivity()
  {
    if (tabActivityEClass == null)
    {
      tabActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(10);
    }
    return tabActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabActivity_Tabs()
  {
        return (EReference)getTabActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTab()
  {
    if (tabEClass == null)
    {
      tabEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(11);
    }
    return tabEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTab_Tag()
  {
        return (EAttribute)getTab().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Activity()
  {
        return (EReference)getTab().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Drawable()
  {
        return (EReference)getTab().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListActivity()
  {
    if (listActivityEClass == null)
    {
      listActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(12);
    }
    return listActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_Listitem()
  {
        return (EReference)getListActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_ContentProvider()
  {
        return (EReference)getListActivity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceActivity()
  {
    if (preferenceActivityEClass == null)
    {
      preferenceActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(13);
    }
    return preferenceActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceActivity_Layout()
  {
        return (EReference)getPreferenceActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentProvider()
  {
    if (contentProviderEClass == null)
    {
      contentProviderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(14);
    }
    return contentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceContentProvider()
  {
    if (resourceContentProviderEClass == null)
    {
      resourceContentProviderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(15);
    }
    return resourceContentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceContentProvider_Link()
  {
        return (EReference)getResourceContentProvider().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroDataModelRoot()
  {
    if (androDataModelRootEClass == null)
    {
      androDataModelRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(16);
    }
    return androDataModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroDataModelRoot_Name()
  {
        return (EAttribute)getAndroDataModelRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroDataModelRoot_Entities()
  {
        return (EReference)getAndroDataModelRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    if (entityEClass == null)
    {
      entityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(17);
    }
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
        return (EAttribute)getEntity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperType()
  {
        return (EReference)getEntity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Properties()
  {
        return (EReference)getEntity().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    if (propertyEClass == null)
    {
      propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(18);
    }
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Type()
  {
        return (EReference)getProperty().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRef()
  {
    if (typeRefEClass == null)
    {
      typeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(19);
    }
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypesRef()
  {
    if (dataTypesRefEClass == null)
    {
      dataTypesRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(20);
    }
    return dataTypesRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypesRef_Type()
  {
        return (EAttribute)getDataTypesRef().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityTypeRef()
  {
    if (entityTypeRefEClass == null)
    {
      entityTypeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(21);
    }
    return entityTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityTypeRef_Type()
  {
        return (EReference)getEntityTypeRef().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGuiModelRoot()
  {
    if (androGuiModelRootEClass == null)
    {
      androGuiModelRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(23);
    }
    return androGuiModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroGuiModelRoot_Name()
  {
        return (EAttribute)getAndroGuiModelRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGuiModelRoot_Roots()
  {
        return (EReference)getAndroGuiModelRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGuiModelRoot_LayoutAttributes()
  {
        return (EReference)getAndroGuiModelRoot().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getView()
  {
    if (viewEClass == null)
    {
      viewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(24);
    }
    return viewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getView_Name()
  {
        return (EAttribute)getView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_LayoutStyle()
  {
        return (EReference)getView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_LayoutProperties()
  {
        return (EReference)getView().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewGroup()
  {
    if (viewGroupEClass == null)
    {
      viewGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(25);
    }
    return viewGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewGroup_Views()
  {
        return (EReference)getViewGroup().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutProperties()
  {
    if (layoutPropertiesEClass == null)
    {
      layoutPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(26);
    }
    return layoutPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayoutProperties_Name()
  {
        return (EAttribute)getLayoutProperties().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_WeightAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_MarginLeftAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_MarginTopAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_MarginRightAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_MarginBottomAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AlignParentLeftAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AlignParentTopAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AlignParentRightAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AlignParentBottomAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AlignTopAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AlignBottomAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AlignLeftAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_BelowAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_AboveAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_ToLeftOfAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_ToRightOfAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_CenterHorizontalAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_CenterInParentAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_CenterVerticalAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_ColumnAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayoutProperties_SpanAttribute()
  {
        return (EReference)getLayoutProperties().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutStyle()
  {
    if (layoutStyleEClass == null)
    {
      layoutStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(27);
    }
    return layoutStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegularLayoutStyle()
  {
    if (regularLayoutStyleEClass == null)
    {
      regularLayoutStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(28);
    }
    return regularLayoutStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularLayoutStyle_Width()
  {
        return (EReference)getRegularLayoutStyle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularLayoutStyle_Height()
  {
        return (EReference)getRegularLayoutStyle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFastLayoutStyle()
  {
    if (fastLayoutStyleEClass == null)
    {
      fastLayoutStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(29);
    }
    return fastLayoutStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFastLayoutStyle_Value()
  {
        return (EAttribute)getFastLayoutStyle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsoluteLayout()
  {
    if (absoluteLayoutEClass == null)
    {
      absoluteLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(30);
    }
    return absoluteLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearLayout()
  {
    if (linearLayoutEClass == null)
    {
      linearLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(31);
    }
    return linearLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearLayout_Vertical()
  {
        return (EAttribute)getLinearLayout().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearLayout_Gravity()
  {
        return (EReference)getLinearLayout().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrameLayout()
  {
    if (frameLayoutEClass == null)
    {
      frameLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(32);
    }
    return frameLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeLayout()
  {
    if (relativeLayoutEClass == null)
    {
      relativeLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(33);
    }
    return relativeLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGridLayout()
  {
    if (gridLayoutEClass == null)
    {
      gridLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(34);
    }
    return gridLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableLayout()
  {
    if (tableLayoutEClass == null)
    {
      tableLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(35);
    }
    return tableLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableLayout_CollapseColumnsAttribute()
  {
        return (EReference)getTableLayout().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableLayout_ShrinkColumnsAttribute()
  {
        return (EReference)getTableLayout().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableLayout_StretchColumnsAttribute()
  {
        return (EReference)getTableLayout().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableRow()
  {
    if (tableRowEClass == null)
    {
      tableRowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(36);
    }
    return tableRowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleView()
  {
    if (simpleViewEClass == null)
    {
      simpleViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(37);
    }
    return simpleViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewElement()
  {
    if (viewElementEClass == null)
    {
      viewElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(38);
    }
    return viewElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewElement_BackgroundAttribute()
  {
        return (EReference)getViewElement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextView()
  {
    if (textViewEClass == null)
    {
      textViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(39);
    }
    return textViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Text()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_WidthAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_HeightAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_BackgroundAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_ClickableAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_FadeScrollBarsAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_IsScrollContainerAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_AutoLinkAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_AutoTextAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_CapitalizeAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_DigitsAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_EditableAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_HintAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_NumericAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_PasswordAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_PhoneNumberAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_SingleLineAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TextColorAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TypefaceAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TextStyleAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_GravityAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TextSizeAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_PaddingAttribute()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditText()
  {
    if (editTextEClass == null)
    {
      editTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(40);
    }
    return editTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Text()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_WidthAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_HeightAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_BackgroundAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_ClickableAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_FadeScrollBarsAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_IsScrollContainerAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_AutoLinkAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_AutoTextAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_CapitalizeAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_DigitsAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_EditableAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_HintAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_NumericAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_PasswordAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_PhoneNumberAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_SingleLineAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TextColorAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TypefaceAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TextStyleAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_GravityAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TextSizeAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_PaddingAttribute()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    if (buttonEClass == null)
    {
      buttonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(41);
    }
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Text()
  {
        return (EReference)getButton().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_WidthAttribute()
  {
        return (EReference)getButton().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_HeightAttribute()
  {
        return (EReference)getButton().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_BackgroundAttribute()
  {
        return (EReference)getButton().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_ClickableAttribute()
  {
        return (EReference)getButton().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_HintAttribute()
  {
        return (EReference)getButton().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGallery()
  {
    if (galleryEClass == null)
    {
      galleryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(42);
    }
    return galleryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpandableListView()
  {
    if (expandableListViewEClass == null)
    {
      expandableListViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(43);
    }
    return expandableListViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebView()
  {
    if (webViewEClass == null)
    {
      webViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(44);
    }
    return webViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageView()
  {
    if (imageViewEClass == null)
    {
      imageViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(45);
    }
    return imageViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_Src()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_WidthAttribute()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_HeightAttribute()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_BackgroundAttribute()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_ClickableAttribute()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_FadeScrollBarsAttribute()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_IsScrollContainerAttribute()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListView()
  {
    if (listViewEClass == null)
    {
      listViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(46);
    }
    return listViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListView_EntriesAttribute()
  {
        return (EReference)getListView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListView_Layout()
  {
        return (EReference)getListView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGridView()
  {
    if (gridViewEClass == null)
    {
      gridViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(47);
    }
    return gridViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridView_ColumnWidthAttribute()
  {
        return (EReference)getGridView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridView_HorizontalSpacingAttribute()
  {
        return (EReference)getGridView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridView_VerticalSpacingAttribute()
  {
        return (EReference)getGridView().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridView_NumColumnsAttribute()
  {
        return (EReference)getGridView().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridView_StretchModeAttribute()
  {
        return (EReference)getGridView().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridView_GravityAttribute()
  {
        return (EReference)getGridView().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpinner()
  {
    if (spinnerEClass == null)
    {
      spinnerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(48);
    }
    return spinnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_EntriesAttribute()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_WidthAttribute()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_HeightAttribute()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_BackgroundAttribute()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_ClickableAttribute()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_FadeScrollBarsAttribute()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_IsScrollContainerAttribute()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckBox()
  {
    if (checkBoxEClass == null)
    {
      checkBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(49);
    }
    return checkBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Text()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadioGroup()
  {
    if (radioGroupEClass == null)
    {
      radioGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(50);
    }
    return radioGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioGroup_Orientation()
  {
        return (EAttribute)getRadioGroup().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadioGroup_Radiobuttons()
  {
        return (EReference)getRadioGroup().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRatingBar()
  {
    if (ratingBarEClass == null)
    {
      ratingBarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(51);
    }
    return ratingBarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRatingBar_NumStars()
  {
        return (EReference)getRatingBar().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToggleButton()
  {
    if (toggleButtonEClass == null)
    {
      toggleButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(52);
    }
    return toggleButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToggleButton_TextOn()
  {
        return (EReference)getToggleButton().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToggleButton_TextOff()
  {
        return (EReference)getToggleButton().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadioButton()
  {
    if (radioButtonEClass == null)
    {
      radioButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(53);
    }
    return radioButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioButton_Name()
  {
        return (EAttribute)getRadioButton().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioButton_Text()
  {
        return (EAttribute)getRadioButton().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadioButton_LayoutStyle()
  {
        return (EReference)getRadioButton().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadioButton_LayoutProperties()
  {
        return (EReference)getRadioButton().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckedTextView()
  {
    if (checkedTextViewEClass == null)
    {
      checkedTextViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(54);
    }
    return checkedTextViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckedTextView_Text()
  {
        return (EAttribute)getCheckedTextView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutoCompleteTextView()
  {
    if (autoCompleteTextViewEClass == null)
    {
      autoCompleteTextViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(55);
    }
    return autoCompleteTextViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAutoCompleteTextView_EntriesAttribute()
  {
        return (EReference)getAutoCompleteTextView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAutoCompleteTextView_ListItem()
  {
        return (EReference)getAutoCompleteTextView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAutoCompleteTextView_Multi()
  {
        return (EReference)getAutoCompleteTextView().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractPreference()
  {
    if (abstractPreferenceEClass == null)
    {
      abstractPreferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(56);
    }
    return abstractPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractPreference_Title()
  {
        return (EAttribute)getAbstractPreference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreference()
  {
    if (preferenceEClass == null)
    {
      preferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(57);
    }
    return preferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreference_Name()
  {
        return (EAttribute)getPreference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreference_PreferenceAttributes()
  {
        return (EReference)getPreference().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceScreen()
  {
    if (preferenceScreenEClass == null)
    {
      preferenceScreenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(58);
    }
    return preferenceScreenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceScreen_Name()
  {
        return (EAttribute)getPreferenceScreen().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceScreen_PreferenceAttributes()
  {
        return (EReference)getPreferenceScreen().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceScreen_Preferences()
  {
        return (EReference)getPreferenceScreen().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceCategory()
  {
    if (preferenceCategoryEClass == null)
    {
      preferenceCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(59);
    }
    return preferenceCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferenceCategory_Preferences()
  {
        return (EReference)getPreferenceCategory().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditTextPreference()
  {
    if (editTextPreferenceEClass == null)
    {
      editTextPreferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(60);
    }
    return editTextPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditTextPreference_Name()
  {
        return (EAttribute)getEditTextPreference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditTextPreference_PreferenceAttributes()
  {
        return (EReference)getEditTextPreference().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditTextPreference_DialogPreferenceAttributes()
  {
        return (EReference)getEditTextPreference().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListPreference()
  {
    if (listPreferenceEClass == null)
    {
      listPreferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(61);
    }
    return listPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListPreference_Name()
  {
        return (EAttribute)getListPreference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreference_PreferenceAttributes()
  {
        return (EReference)getListPreference().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreference_DialogPreferenceAttributes()
  {
        return (EReference)getListPreference().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreference_ListPreferenceAttributes()
  {
        return (EReference)getListPreference().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckBoxPreference()
  {
    if (checkBoxPreferenceEClass == null)
    {
      checkBoxPreferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(62);
    }
    return checkBoxPreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBoxPreference_Name()
  {
        return (EAttribute)getCheckBoxPreference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBoxPreference_PreferenceAttributes()
  {
        return (EReference)getCheckBoxPreference().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRingtonePrefence()
  {
    if (ringtonePrefenceEClass == null)
    {
      ringtonePrefenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(63);
    }
    return ringtonePrefenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRingtonePrefence_Name()
  {
        return (EAttribute)getRingtonePrefence().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRingtonePrefence_PreferenceAttributes()
  {
        return (EReference)getRingtonePrefence().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferenceAttributes()
  {
    if (preferenceAttributesEClass == null)
    {
      preferenceAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(64);
    }
    return preferenceAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceAttributes_Summary()
  {
        return (EAttribute)getPreferenceAttributes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceAttributes_Enabled()
  {
        return (EAttribute)getPreferenceAttributes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferenceAttributes_Persistent()
  {
        return (EAttribute)getPreferenceAttributes().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDialogPreferenceAttributes()
  {
    if (dialogPreferenceAttributesEClass == null)
    {
      dialogPreferenceAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(65);
    }
    return dialogPreferenceAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDialogPreferenceAttributes_DialogTitle()
  {
        return (EAttribute)getDialogPreferenceAttributes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDialogPreferenceAttributes_DefaultValue()
  {
        return (EAttribute)getDialogPreferenceAttributes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListPreferenceAttributes()
  {
    if (listPreferenceAttributesEClass == null)
    {
      listPreferenceAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(66);
    }
    return listPreferenceAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreferenceAttributes_EntriesAttribute()
  {
        return (EReference)getListPreferenceAttributes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListPreferenceAttributes_EntryValues()
  {
        return (EReference)getListPreferenceAttributes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanAttribute()
  {
    if (spanAttributeEClass == null)
    {
      spanAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(67);
    }
    return spanAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanAttribute_Span()
  {
        return (EReference)getSpanAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnAttribute()
  {
    if (columnAttributeEClass == null)
    {
      columnAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(68);
    }
    return columnAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnAttribute_Column()
  {
        return (EReference)getColumnAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCenterVerticalAttribute()
  {
    if (centerVerticalAttributeEClass == null)
    {
      centerVerticalAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(69);
    }
    return centerVerticalAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCenterVerticalAttribute_CenterVertical()
  {
        return (EReference)getCenterVerticalAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCenterInParentAttribute()
  {
    if (centerInParentAttributeEClass == null)
    {
      centerInParentAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(70);
    }
    return centerInParentAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCenterInParentAttribute_CenterInParent()
  {
        return (EReference)getCenterInParentAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCenterHorizontalAttribute()
  {
    if (centerHorizontalAttributeEClass == null)
    {
      centerHorizontalAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(71);
    }
    return centerHorizontalAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCenterHorizontalAttribute_CenterHorizontal()
  {
        return (EReference)getCenterHorizontalAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToRightOfAttribute()
  {
    if (toRightOfAttributeEClass == null)
    {
      toRightOfAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(72);
    }
    return toRightOfAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToRightOfAttribute_ToRightOf()
  {
        return (EReference)getToRightOfAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToLeftOfAttribute()
  {
    if (toLeftOfAttributeEClass == null)
    {
      toLeftOfAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(73);
    }
    return toLeftOfAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToLeftOfAttribute_ToLeftOf()
  {
        return (EReference)getToLeftOfAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAboveAttribute()
  {
    if (aboveAttributeEClass == null)
    {
      aboveAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(74);
    }
    return aboveAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAboveAttribute_Above()
  {
        return (EReference)getAboveAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBelowAttribute()
  {
    if (belowAttributeEClass == null)
    {
      belowAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(75);
    }
    return belowAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBelowAttribute_Below()
  {
        return (EReference)getBelowAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignLeftAttribute()
  {
    if (alignLeftAttributeEClass == null)
    {
      alignLeftAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(76);
    }
    return alignLeftAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlignLeftAttribute_AlignLeft()
  {
        return (EReference)getAlignLeftAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignBottomAttribute()
  {
    if (alignBottomAttributeEClass == null)
    {
      alignBottomAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(77);
    }
    return alignBottomAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlignBottomAttribute_AlignBottom()
  {
        return (EReference)getAlignBottomAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignTopAttribute()
  {
    if (alignTopAttributeEClass == null)
    {
      alignTopAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(78);
    }
    return alignTopAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlignTopAttribute_AlignTop()
  {
        return (EReference)getAlignTopAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignParentLeftAttribute()
  {
    if (alignParentLeftAttributeEClass == null)
    {
      alignParentLeftAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(79);
    }
    return alignParentLeftAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlignParentLeftAttribute_AlignParentLeft()
  {
        return (EReference)getAlignParentLeftAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignParentTopAttribute()
  {
    if (alignParentTopAttributeEClass == null)
    {
      alignParentTopAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(80);
    }
    return alignParentTopAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlignParentTopAttribute_AlignParentTop()
  {
        return (EReference)getAlignParentTopAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignParentRightAttribute()
  {
    if (alignParentRightAttributeEClass == null)
    {
      alignParentRightAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(81);
    }
    return alignParentRightAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlignParentRightAttribute_AlignParentRight()
  {
        return (EReference)getAlignParentRightAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignParentBottomAttribute()
  {
    if (alignParentBottomAttributeEClass == null)
    {
      alignParentBottomAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(82);
    }
    return alignParentBottomAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlignParentBottomAttribute_AlignParentBottom()
  {
        return (EReference)getAlignParentBottomAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarginBottomAttribute()
  {
    if (marginBottomAttributeEClass == null)
    {
      marginBottomAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(83);
    }
    return marginBottomAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarginBottomAttribute_MarginBottom()
  {
        return (EReference)getMarginBottomAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarginRightAttribute()
  {
    if (marginRightAttributeEClass == null)
    {
      marginRightAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(84);
    }
    return marginRightAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarginRightAttribute_MarginRight()
  {
        return (EReference)getMarginRightAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarginTopAttribute()
  {
    if (marginTopAttributeEClass == null)
    {
      marginTopAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(85);
    }
    return marginTopAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarginTopAttribute_MarginTop()
  {
        return (EReference)getMarginTopAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeightAttribute()
  {
    if (weightAttributeEClass == null)
    {
      weightAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(86);
    }
    return weightAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeightAttribute_Weight()
  {
        return (EReference)getWeightAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarginLeftAttribute()
  {
    if (marginLeftAttributeEClass == null)
    {
      marginLeftAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(87);
    }
    return marginLeftAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarginLeftAttribute_MarginLeft()
  {
        return (EReference)getMarginLeftAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextStyleAttribute()
  {
    if (textStyleAttributeEClass == null)
    {
      textStyleAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(88);
    }
    return textStyleAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextStyleAttribute_TextStyle()
  {
        return (EAttribute)getTextStyleAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypefaceAttribute()
  {
    if (typefaceAttributeEClass == null)
    {
      typefaceAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(89);
    }
    return typefaceAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypefaceAttribute_Typeface()
  {
        return (EAttribute)getTypefaceAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextColorAttribute()
  {
    if (textColorAttributeEClass == null)
    {
      textColorAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(90);
    }
    return textColorAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextColorAttribute_TextColor()
  {
        return (EReference)getTextColorAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleLineAttribute()
  {
    if (singleLineAttributeEClass == null)
    {
      singleLineAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(91);
    }
    return singleLineAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleLineAttribute_SingleLine()
  {
        return (EReference)getSingleLineAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPhoneNumberAttribute()
  {
    if (phoneNumberAttributeEClass == null)
    {
      phoneNumberAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(92);
    }
    return phoneNumberAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPhoneNumberAttribute_PhoneNumber()
  {
        return (EReference)getPhoneNumberAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPasswordAttribute()
  {
    if (passwordAttributeEClass == null)
    {
      passwordAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(93);
    }
    return passwordAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPasswordAttribute_Password()
  {
        return (EReference)getPasswordAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericAttribute()
  {
    if (numericAttributeEClass == null)
    {
      numericAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(94);
    }
    return numericAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericAttribute_Numeric()
  {
        return (EAttribute)getNumericAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHintAttribute()
  {
    if (hintAttributeEClass == null)
    {
      hintAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(96);
    }
    return hintAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHintAttribute_Hint()
  {
        return (EReference)getHintAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditableAttribute()
  {
    if (editableAttributeEClass == null)
    {
      editableAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(99);
    }
    return editableAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditableAttribute_Editable()
  {
        return (EReference)getEditableAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDigitsAttribute()
  {
    if (digitsAttributeEClass == null)
    {
      digitsAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(100);
    }
    return digitsAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDigitsAttribute_Digits()
  {
        return (EReference)getDigitsAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapitalizeAttribute()
  {
    if (capitalizeAttributeEClass == null)
    {
      capitalizeAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(101);
    }
    return capitalizeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapitalizeAttribute_Capitalize()
  {
        return (EAttribute)getCapitalizeAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutoTextAttribute()
  {
    if (autoTextAttributeEClass == null)
    {
      autoTextAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(103);
    }
    return autoTextAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAutoTextAttribute_AutoText()
  {
        return (EReference)getAutoTextAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsScrollContainerAttribute()
  {
    if (isScrollContainerAttributeEClass == null)
    {
      isScrollContainerAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(104);
    }
    return isScrollContainerAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIsScrollContainerAttribute_IsScrollContainer()
  {
        return (EReference)getIsScrollContainerAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFadeScrollBarsAttribute()
  {
    if (fadeScrollBarsAttributeEClass == null)
    {
      fadeScrollBarsAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(105);
    }
    return fadeScrollBarsAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFadeScrollBarsAttribute_FadeScrollBars()
  {
        return (EReference)getFadeScrollBarsAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClickableAttribute()
  {
    if (clickableAttributeEClass == null)
    {
      clickableAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(106);
    }
    return clickableAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClickableAttribute_Clickable()
  {
        return (EReference)getClickableAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutoLinkAttribute()
  {
    if (autoLinkAttributeEClass == null)
    {
      autoLinkAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(107);
    }
    return autoLinkAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAutoLinkAttribute_All()
  {
        return (EAttribute)getAutoLinkAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAutoLinkAttribute_AutoLinkMask()
  {
        return (EAttribute)getAutoLinkAttribute().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidthAttribute()
  {
    if (widthAttributeEClass == null)
    {
      widthAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(109);
    }
    return widthAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidthAttribute_Width()
  {
        return (EReference)getWidthAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeightAttribute()
  {
    if (heightAttributeEClass == null)
    {
      heightAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(110);
    }
    return heightAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeightAttribute_Height()
  {
        return (EReference)getHeightAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPaddingAttribute()
  {
    if (paddingAttributeEClass == null)
    {
      paddingAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(111);
    }
    return paddingAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPaddingAttribute_Padding()
  {
        return (EReference)getPaddingAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGravityAttribute()
  {
    if (gravityAttributeEClass == null)
    {
      gravityAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(112);
    }
    return gravityAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGravityAttribute_Gravity()
  {
        return (EAttribute)getGravityAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextSizeAttribute()
  {
    if (textSizeAttributeEClass == null)
    {
      textSizeAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(113);
    }
    return textSizeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextSizeAttribute_TextSize()
  {
        return (EReference)getTextSizeAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackgroundAttribute()
  {
    if (backgroundAttributeEClass == null)
    {
      backgroundAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(114);
    }
    return backgroundAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBackgroundAttribute_Background()
  {
        return (EReference)getBackgroundAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnWidthAttribute()
  {
    if (columnWidthAttributeEClass == null)
    {
      columnWidthAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(115);
    }
    return columnWidthAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnWidthAttribute_ColumnWidth()
  {
        return (EReference)getColumnWidthAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHorizontalSpacingAttribute()
  {
    if (horizontalSpacingAttributeEClass == null)
    {
      horizontalSpacingAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(116);
    }
    return horizontalSpacingAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorizontalSpacingAttribute_HorizontalSpacing()
  {
        return (EReference)getHorizontalSpacingAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumColumnsAttribute()
  {
    if (numColumnsAttributeEClass == null)
    {
      numColumnsAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(117);
    }
    return numColumnsAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumColumnsAttribute_Autofit()
  {
        return (EAttribute)getNumColumnsAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumColumnsAttribute_NumColumns()
  {
        return (EReference)getNumColumnsAttribute().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStretchModeAttribute()
  {
    if (stretchModeAttributeEClass == null)
    {
      stretchModeAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(118);
    }
    return stretchModeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStretchModeAttribute_StretchMode()
  {
        return (EAttribute)getStretchModeAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerticalSpacingAttribute()
  {
    if (verticalSpacingAttributeEClass == null)
    {
      verticalSpacingAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(120);
    }
    return verticalSpacingAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerticalSpacingAttribute_VerticalSpacing()
  {
        return (EReference)getVerticalSpacingAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntriesAttribute()
  {
    if (entriesAttributeEClass == null)
    {
      entriesAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(121);
    }
    return entriesAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntriesAttribute_Entries()
  {
        return (EReference)getEntriesAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStretchColumnsAttribute()
  {
    if (stretchColumnsAttributeEClass == null)
    {
      stretchColumnsAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(122);
    }
    return stretchColumnsAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStretchColumnsAttribute_StretchColumns()
  {
        return (EReference)getStretchColumnsAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShrinkColumnsAttribute()
  {
    if (shrinkColumnsAttributeEClass == null)
    {
      shrinkColumnsAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(123);
    }
    return shrinkColumnsAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShrinkColumnsAttribute_ShrinkColumns()
  {
        return (EReference)getShrinkColumnsAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollapseColumnsAttribute()
  {
    if (collapseColumnsAttributeEClass == null)
    {
      collapseColumnsAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(124);
    }
    return collapseColumnsAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollapseColumnsAttribute_CollapseColumns()
  {
        return (EReference)getCollapseColumnsAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroResModelRoot()
  {
    if (androResModelRootEClass == null)
    {
      androResModelRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(127);
    }
    return androResModelRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroResModelRoot_Name()
  {
        return (EAttribute)getAndroResModelRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroResModelRoot_Resources()
  {
        return (EReference)getAndroResModelRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValue()
  {
    if (propertyValueEClass == null)
    {
      propertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(128);
    }
    return propertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyDrawablePropertyValue()
  {
    if (anyDrawablePropertyValueEClass == null)
    {
      anyDrawablePropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(129);
    }
    return anyDrawablePropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringPropertyValue()
  {
    if (stringPropertyValueEClass == null)
    {
      stringPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(130);
    }
    return stringPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringPropertyValue_Value()
  {
        return (EAttribute)getStringPropertyValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerPropertyValue()
  {
    if (integerPropertyValueEClass == null)
    {
      integerPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(131);
    }
    return integerPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerPropertyValue_Value()
  {
        return (EAttribute)getIntegerPropertyValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanPropertyValue()
  {
    if (booleanPropertyValueEClass == null)
    {
      booleanPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(132);
    }
    return booleanPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanPropertyValue_Value()
  {
        return (EAttribute)getBooleanPropertyValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorPropertyValue()
  {
    if (colorPropertyValueEClass == null)
    {
      colorPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(133);
    }
    return colorPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorPropertyValue_Value()
  {
        return (EAttribute)getColorPropertyValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutDimensionPropertyValue()
  {
    if (layoutDimensionPropertyValueEClass == null)
    {
      layoutDimensionPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(134);
    }
    return layoutDimensionPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayoutDimensionPropertyValue_ConstValue()
  {
        return (EAttribute)getLayoutDimensionPropertyValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionPropertyValue()
  {
    if (dimensionPropertyValueEClass == null)
    {
      dimensionPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(136);
    }
    return dimensionPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionPropertyValue_Value()
  {
        return (EReference)getDimensionPropertyValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableResourceLink()
  {
    if (drawableResourceLinkEClass == null)
    {
      drawableResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(137);
    }
    return drawableResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrawableResourceLink_Link()
  {
        return (EReference)getDrawableResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabDrawableResourceLink()
  {
    if (tabDrawableResourceLinkEClass == null)
    {
      tabDrawableResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(138);
    }
    return tabDrawableResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabDrawableResourceLink_Link()
  {
        return (EReference)getTabDrawableResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalDrawableResourceLink()
  {
    if (externalDrawableResourceLinkEClass == null)
    {
      externalDrawableResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(139);
    }
    return externalDrawableResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalDrawableResourceLink_ExternalResource()
  {
        return (EAttribute)getExternalDrawableResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringResourceLink()
  {
    if (stringResourceLinkEClass == null)
    {
      stringResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(141);
    }
    return stringResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringResourceLink_Link()
  {
        return (EReference)getStringResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerResourceLink()
  {
    if (integerResourceLinkEClass == null)
    {
      integerResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(142);
    }
    return integerResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerResourceLink_Link()
  {
        return (EReference)getIntegerResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanResourceLink()
  {
    if (booleanResourceLinkEClass == null)
    {
      booleanResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(143);
    }
    return booleanResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanResourceLink_Link()
  {
        return (EReference)getBooleanResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorResourceLink()
  {
    if (colorResourceLinkEClass == null)
    {
      colorResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(144);
    }
    return colorResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorResourceLink_Link()
  {
        return (EReference)getColorResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionResourceLink()
  {
    if (dimensionResourceLinkEClass == null)
    {
      dimensionResourceLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(145);
    }
    return dimensionResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionResourceLink_Link()
  {
        return (EReference)getDimensionResourceLink().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    if (resourceEClass == null)
    {
      resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(146);
    }
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Name()
  {
        return (EAttribute)getResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringResource()
  {
    if (stringResourceEClass == null)
    {
      stringResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(147);
    }
    return stringResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringResource_Value()
  {
        return (EAttribute)getStringResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerResource()
  {
    if (integerResourceEClass == null)
    {
      integerResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(148);
    }
    return integerResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerResource_Value()
  {
        return (EAttribute)getIntegerResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanResource()
  {
    if (booleanResourceEClass == null)
    {
      booleanResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(149);
    }
    return booleanResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanResource_Value()
  {
        return (EAttribute)getBooleanResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorResource()
  {
    if (colorResourceEClass == null)
    {
      colorResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(150);
    }
    return colorResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorResource_Value()
  {
        return (EAttribute)getColorResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionResource()
  {
    if (dimensionResourceEClass == null)
    {
      dimensionResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(151);
    }
    return dimensionResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionResource_Value()
  {
        return (EReference)getDimensionResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayResource()
  {
    if (arrayResourceEClass == null)
    {
      arrayResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(152);
    }
    return arrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerArrayResource()
  {
    if (integerArrayResourceEClass == null)
    {
      integerArrayResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(153);
    }
    return integerArrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerArrayResource_Entries()
  {
        return (EReference)getIntegerArrayResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerArrayEntry()
  {
    if (integerArrayEntryEClass == null)
    {
      integerArrayEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(154);
    }
    return integerArrayEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerArrayEntry_Name()
  {
        return (EAttribute)getIntegerArrayEntry().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerArrayEntry_Value()
  {
        return (EAttribute)getIntegerArrayEntry().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringArrayResource()
  {
    if (stringArrayResourceEClass == null)
    {
      stringArrayResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(155);
    }
    return stringArrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringArrayResource_Entries()
  {
        return (EReference)getStringArrayResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringArrayEntry()
  {
    if (stringArrayEntryEClass == null)
    {
      stringArrayEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(156);
    }
    return stringArrayEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringArrayEntry_Name()
  {
        return (EAttribute)getStringArrayEntry().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringArrayEntry_Value()
  {
        return (EAttribute)getStringArrayEntry().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableResource()
  {
    if (drawableResourceEClass == null)
    {
      drawableResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(157);
    }
    return drawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitmapDrawableResource()
  {
    if (bitmapDrawableResourceEClass == null)
    {
      bitmapDrawableResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(158);
    }
    return bitmapDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitmapDrawableResource_Filename()
  {
        return (EAttribute)getBitmapDrawableResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDrawableResource()
  {
    if (transitionDrawableResourceEClass == null)
    {
      transitionDrawableResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(159);
    }
    return transitionDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_From()
  {
        return (EReference)getTransitionDrawableResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_To()
  {
        return (EReference)getTransitionDrawableResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabDrawableResource()
  {
    if (tabDrawableResourceEClass == null)
    {
      tabDrawableResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(160);
    }
    return tabDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabDrawableResource_Selected()
  {
        return (EReference)getTabDrawableResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabDrawableResource_Unselected()
  {
        return (EReference)getTabDrawableResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionValue()
  {
    if (dimensionValueEClass == null)
    {
      dimensionValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(161);
    }
    return dimensionValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionValue_Value()
  {
        return (EAttribute)getDimensionValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionValue_Metric()
  {
        return (EAttribute)getDimensionValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseGameActivity()
  {
    if (baseGameActivityEClass == null)
    {
      baseGameActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(163);
    }
    return baseGameActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseGameActivity_Size()
  {
        return (EReference)getBaseGameActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBaseGameActivity_Orientation()
  {
        return (EAttribute)getBaseGameActivity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseGameActivity_Scene()
  {
        return (EReference)getBaseGameActivity().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGameRoot()
  {
    if (androGameRootEClass == null)
    {
      androGameRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(164);
    }
    return androGameRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGameRoot_AndroGameComponents()
  {
        return (EReference)getAndroGameRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGameComponent()
  {
    if (androGameComponentEClass == null)
    {
      androGameComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(165);
    }
    return androGameComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndroGameComponent_Name()
  {
        return (EAttribute)getAndroGameComponent().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGameGui()
  {
    if (androGameGuiEClass == null)
    {
      androGameGuiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(166);
    }
    return androGameGuiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGameGui_GameElements()
  {
        return (EReference)getAndroGameGui().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGameLogic()
  {
    if (androGameLogicEClass == null)
    {
      androGameLogicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(167);
    }
    return androGameLogicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGameLogic_LogicComponent()
  {
        return (EReference)getAndroGameLogic().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroGameBox2DLogic()
  {
    if (androGameBox2DLogicEClass == null)
    {
      androGameBox2DLogicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(168);
    }
    return androGameBox2DLogicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGameBox2DLogic_Options()
  {
        return (EReference)getAndroGameBox2DLogic().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroGameBox2DLogic_Box2dComponents()
  {
        return (EReference)getAndroGameBox2DLogic().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBox2DOptions()
  {
    if (box2DOptionsEClass == null)
    {
      box2DOptionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(169);
    }
    return box2DOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBox2DOptions_Gravity()
  {
        return (EAttribute)getBox2DOptions().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBox2DComponent()
  {
    if (box2DComponentEClass == null)
    {
      box2DComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(170);
    }
    return box2DComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBox2DComponent_Name()
  {
        return (EAttribute)getBox2DComponent().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoint()
  {
    if (jointEClass == null)
    {
      jointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(171);
    }
    return jointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoint_First()
  {
        return (EReference)getJoint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoint_Second()
  {
        return (EReference)getJoint().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRevoluteJoint()
  {
    if (revoluteJointEClass == null)
    {
      revoluteJointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(172);
    }
    return revoluteJointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistanceJoint()
  {
    if (distanceJointEClass == null)
    {
      distanceJointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(173);
    }
    return distanceJointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    if (bodyEClass == null)
    {
      bodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(174);
    }
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBody_BodyType()
  {
        return (EAttribute)getBody().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Fixture()
  {
        return (EReference)getBody().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineBody()
  {
    if (lineBodyEClass == null)
    {
      lineBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(175);
    }
    return lineBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCircleBody()
  {
    if (circleBodyEClass == null)
    {
      circleBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(176);
    }
    return circleBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxBody()
  {
    if (boxBodyEClass == null)
    {
      boxBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(177);
    }
    return boxBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixture()
  {
    if (fixtureEClass == null)
    {
      fixtureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(178);
    }
    return fixtureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFixture_Density()
  {
        return (EAttribute)getFixture().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFixture_Friction()
  {
        return (EAttribute)getFixture().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFixture_Restitution()
  {
        return (EAttribute)getFixture().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicComponent()
  {
    if (logicComponentEClass == null)
    {
      logicComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(180);
    }
    return logicComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogic()
  {
    if (logicEClass == null)
    {
      logicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(181);
    }
    return logicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGameElement()
  {
    if (gameElementEClass == null)
    {
      gameElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(182);
    }
    return gameElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameElement_Name()
  {
        return (EAttribute)getGameElement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScene()
  {
    if (sceneEClass == null)
    {
      sceneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(183);
    }
    return sceneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScene_GameBackground()
  {
        return (EReference)getScene().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScene_Entities()
  {
        return (EReference)getScene().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuScene()
  {
    if (menuSceneEClass == null)
    {
      menuSceneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(184);
    }
    return menuSceneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuScene_MenuItems()
  {
        return (EReference)getMenuScene().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGameBackground()
  {
    if (gameBackgroundEClass == null)
    {
      gameBackgroundEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(185);
    }
    return gameBackgroundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGameBackground_Color()
  {
        return (EReference)getGameBackground().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGameBackground_TextureRegion()
  {
        return (EReference)getGameBackground().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGameMenuItem()
  {
    if (gameMenuItemEClass == null)
    {
      gameMenuItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(186);
    }
    return gameMenuItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameMenuItem_Text()
  {
        return (EAttribute)getGameMenuItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGameMenuItem_TextureRegion()
  {
        return (EReference)getGameMenuItem().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGameEntity()
  {
    if (gameEntityEClass == null)
    {
      gameEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(187);
    }
    return gameEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameEntity_Name()
  {
        return (EAttribute)getGameEntity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGameEntity_Color()
  {
        return (EReference)getGameEntity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleEntity()
  {
    if (simpleEntityEClass == null)
    {
      simpleEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(188);
    }
    return simpleEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleEntity_Position()
  {
        return (EReference)getSimpleEntity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleEntity_Size()
  {
        return (EReference)getSimpleEntity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleEntity_Children()
  {
        return (EReference)getSimpleEntity().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifierBinding()
  {
    if (modifierBindingEClass == null)
    {
      modifierBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(189);
    }
    return modifierBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifierBinding_Modifier()
  {
        return (EReference)getModifierBinding().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifierBinding_GameEntity()
  {
        return (EReference)getModifierBinding().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBox2DBinding()
  {
    if (box2DBindingEClass == null)
    {
      box2DBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(190);
    }
    return box2DBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBox2DBinding_Body()
  {
        return (EReference)getBox2DBinding().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBox2DBinding_GameEntity()
  {
        return (EReference)getBox2DBinding().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorBinding()
  {
    if (sensorBindingEClass == null)
    {
      sensorBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(191);
    }
    return sensorBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensorBinding_SensorType()
  {
        return (EAttribute)getSensorBinding().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensorBinding_To()
  {
        return (EAttribute)getSensorBinding().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityModifier()
  {
    if (entityModifierEClass == null)
    {
      entityModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(194);
    }
    return entityModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityModifier_Name()
  {
        return (EAttribute)getEntityModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceEntityModifier()
  {
    if (sequenceEntityModifierEClass == null)
    {
      sequenceEntityModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(195);
    }
    return sequenceEntityModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceEntityModifier_Modifiers()
  {
        return (EReference)getSequenceEntityModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopEntityModifier()
  {
    if (loopEntityModifierEClass == null)
    {
      loopEntityModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(196);
    }
    return loopEntityModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopEntityModifier_Modifiers()
  {
        return (EReference)getLoopEntityModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoopEntityModifier_Count()
  {
        return (EAttribute)getLoopEntityModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoveModifier()
  {
    if (moveModifierEClass == null)
    {
      moveModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(197);
    }
    return moveModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoveModifier_Duration()
  {
        return (EAttribute)getMoveModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMoveModifier_From()
  {
        return (EReference)getMoveModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMoveModifier_To()
  {
        return (EReference)getMoveModifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoveByModifier()
  {
    if (moveByModifierEClass == null)
    {
      moveByModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(198);
    }
    return moveByModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoveByModifier_Duration()
  {
        return (EAttribute)getMoveByModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMoveByModifier_By()
  {
        return (EReference)getMoveByModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleModifier()
  {
    if (scaleModifierEClass == null)
    {
      scaleModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(199);
    }
    return scaleModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScaleModifier_Duration()
  {
        return (EAttribute)getScaleModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScaleModifier_From()
  {
        return (EReference)getScaleModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScaleModifier_To()
  {
        return (EReference)getScaleModifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlphaModifier()
  {
    if (alphaModifierEClass == null)
    {
      alphaModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(200);
    }
    return alphaModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlphaModifier_Duration()
  {
        return (EAttribute)getAlphaModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlphaModifier_From()
  {
        return (EReference)getAlphaModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlphaModifier_To()
  {
        return (EReference)getAlphaModifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRotationByModifier()
  {
    if (rotationByModifierEClass == null)
    {
      rotationByModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(201);
    }
    return rotationByModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRotationByModifier_Duration()
  {
        return (EAttribute)getRotationByModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRotationByModifier_By()
  {
        return (EReference)getRotationByModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRotationModifier()
  {
    if (rotationModifierEClass == null)
    {
      rotationModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(202);
    }
    return rotationModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRotationModifier_Duration()
  {
        return (EAttribute)getRotationModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRotationModifier_From()
  {
        return (EReference)getRotationModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRotationModifier_To()
  {
        return (EReference)getRotationModifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorModifier()
  {
    if (colorModifierEClass == null)
    {
      colorModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(203);
    }
    return colorModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorModifier_Duration()
  {
        return (EAttribute)getColorModifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorModifier_From()
  {
        return (EReference)getColorModifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorModifier_To()
  {
        return (EReference)getColorModifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToTriple()
  {
    if (toTripleEClass == null)
    {
      toTripleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(204);
    }
    return toTripleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToTriple_First()
  {
        return (EAttribute)getToTriple().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToTriple_Second()
  {
        return (EAttribute)getToTriple().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToTriple_Third()
  {
        return (EAttribute)getToTriple().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromTriple()
  {
    if (fromTripleEClass == null)
    {
      fromTripleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(205);
    }
    return fromTripleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromTriple_First()
  {
        return (EAttribute)getFromTriple().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromTriple_Second()
  {
        return (EAttribute)getFromTriple().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromTriple_Third()
  {
        return (EAttribute)getFromTriple().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToDouble()
  {
    if (toDoubleEClass == null)
    {
      toDoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(206);
    }
    return toDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToDouble_X()
  {
        return (EAttribute)getToDouble().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToDouble_Y()
  {
        return (EAttribute)getToDouble().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromDouble()
  {
    if (fromDoubleEClass == null)
    {
      fromDoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(207);
    }
    return fromDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromDouble_X()
  {
        return (EAttribute)getFromDouble().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromDouble_Y()
  {
        return (EAttribute)getFromDouble().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToSingle()
  {
    if (toSingleEClass == null)
    {
      toSingleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(208);
    }
    return toSingleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToSingle_Value()
  {
        return (EAttribute)getToSingle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromSingle()
  {
    if (fromSingleEClass == null)
    {
      fromSingleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(209);
    }
    return fromSingleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromSingle_Value()
  {
        return (EAttribute)getFromSingle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getByDouble()
  {
    if (byDoubleEClass == null)
    {
      byDoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(210);
    }
    return byDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getByDouble_X()
  {
        return (EAttribute)getByDouble().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getByDouble_Y()
  {
        return (EAttribute)getByDouble().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBySingle()
  {
    if (bySingleEClass == null)
    {
      bySingleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(211);
    }
    return bySingleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBySingle_Value()
  {
        return (EAttribute)getBySingle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLine()
  {
    if (lineEClass == null)
    {
      lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(212);
    }
    return lineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLine_From()
  {
        return (EReference)getLine().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLine_To()
  {
        return (EReference)getLine().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLine_LineWidth()
  {
        return (EAttribute)getLine().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    if (textEClass == null)
    {
      textEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(213);
    }
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Text()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getText_Position()
  {
        return (EReference)getText().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getText_Font()
  {
        return (EReference)getText().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Halign()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRectangle()
  {
    if (rectangleEClass == null)
    {
      rectangleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(214);
    }
    return rectangleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRectangle_Position()
  {
        return (EReference)getRectangle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRectangle_Size()
  {
        return (EReference)getRectangle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSprite()
  {
    if (spriteEClass == null)
    {
      spriteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(215);
    }
    return spriteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprite_Position()
  {
        return (EReference)getSprite().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprite_Size()
  {
        return (EReference)getSprite().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprite_TextureRegion()
  {
        return (EReference)getSprite().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimatedSprite()
  {
    if (animatedSpriteEClass == null)
    {
      animatedSpriteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(216);
    }
    return animatedSpriteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimatedSprite_Position()
  {
        return (EReference)getAnimatedSprite().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimatedSprite_Size()
  {
        return (EReference)getAnimatedSprite().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimatedSprite_TextureRegion()
  {
        return (EReference)getAnimatedSprite().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnimatedSprite_Animate()
  {
        return (EAttribute)getAnimatedSprite().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    if (colorEClass == null)
    {
      colorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(217);
    }
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_R()
  {
        return (EAttribute)getColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_G()
  {
        return (EAttribute)getColor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_B()
  {
        return (EAttribute)getColor().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_A()
  {
        return (EAttribute)getColor().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_ConstantColor()
  {
        return (EAttribute)getColor().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPosition()
  {
    if (positionEClass == null)
    {
      positionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(218);
    }
    return positionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPosition_X()
  {
        return (EAttribute)getPosition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPosition_Y()
  {
        return (EAttribute)getPosition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSize()
  {
    if (sizeEClass == null)
    {
      sizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(219);
    }
    return sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_W()
  {
        return (EAttribute)getSize().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_H()
  {
        return (EAttribute)getSize().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextureRegion()
  {
    if (textureRegionEClass == null)
    {
      textureRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(220);
    }
    return textureRegionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextureRegion_FileName()
  {
        return (EAttribute)getTextureRegion().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextureRegion_Tiled()
  {
        return (EReference)getTextureRegion().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTiled()
  {
    if (tiledEClass == null)
    {
      tiledEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(221);
    }
    return tiledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTiled_Column()
  {
        return (EAttribute)getTiled().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTiled_Row()
  {
        return (EAttribute)getTiled().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFont()
  {
    if (fontEClass == null)
    {
      fontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(222);
    }
    return fontEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFont_Type()
  {
        return (EAttribute)getFont().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFont_Size()
  {
        return (EAttribute)getFont().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFont_Color()
  {
        return (EReference)getFont().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFont_Antialias()
  {
        return (EAttribute)getFont().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getApiLevel()
  {
    if (apiLevelEEnum == null)
    {
      apiLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(5);
    }
    return apiLevelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActivityTheme()
  {
    if (activityThemeEEnum == null)
    {
      activityThemeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(9);
    }
    return activityThemeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataTypes()
  {
    if (dataTypesEEnum == null)
    {
      dataTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(22);
    }
    return dataTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNumericKind()
  {
    if (numericKindEEnum == null)
    {
      numericKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(95);
    }
    return numericKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypefaceKind()
  {
    if (typefaceKindEEnum == null)
    {
      typefaceKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(97);
    }
    return typefaceKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTextStyleKind()
  {
    if (textStyleKindEEnum == null)
    {
      textStyleKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(98);
    }
    return textStyleKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCapitalizeKind()
  {
    if (capitalizeKindEEnum == null)
    {
      capitalizeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(102);
    }
    return capitalizeKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAutoLinkKind()
  {
    if (autoLinkKindEEnum == null)
    {
      autoLinkKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(108);
    }
    return autoLinkKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStretchModeKind()
  {
    if (stretchModeKindEEnum == null)
    {
      stretchModeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(119);
    }
    return stretchModeKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGravityKind()
  {
    if (gravityKindEEnum == null)
    {
      gravityKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(125);
    }
    return gravityKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFastLayoutDimensionKind()
  {
    if (fastLayoutDimensionKindEEnum == null)
    {
      fastLayoutDimensionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(126);
    }
    return fastLayoutDimensionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLayoutDimensionKind()
  {
    if (layoutDimensionKindEEnum == null)
    {
      layoutDimensionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(135);
    }
    return layoutDimensionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAndroidDrawableResource()
  {
    if (androidDrawableResourceEEnum == null)
    {
      androidDrawableResourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(140);
    }
    return androidDrawableResourceEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDimensionMetric()
  {
    if (dimensionMetricEEnum == null)
    {
      dimensionMetricEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(162);
    }
    return dimensionMetricEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBodyType()
  {
    if (bodyTypeEEnum == null)
    {
      bodyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(179);
    }
    return bodyTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSensorTarget()
  {
    if (sensorTargetEEnum == null)
    {
      sensorTargetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(192);
    }
    return sensorTargetEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSensorType()
  {
    if (sensorTypeEEnum == null)
    {
      sensorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(193);
    }
    return sensorTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstantColor()
  {
    if (constantColorEEnum == null)
    {
      constantColorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(223);
    }
    return constantColorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHorizontalAlign()
  {
    if (horizontalAlignEEnum == null)
    {
      horizontalAlignEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(224);
    }
    return horizontalAlignEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFontType()
  {
    if (fontTypeEEnum == null)
    {
      fontTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(225);
    }
    return fontTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getScreenOrientation()
  {
    if (screenOrientationEEnum == null)
    {
      screenOrientationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AndroTextDslPackage.eNS_URI).getEClassifiers().get(226);
    }
    return screenOrientationEEnum;
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
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("hu.bme.mit.androtext.lang.androTextDsl." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //AndroTextDslPackageImpl
