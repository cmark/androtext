/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslFactory
 * @model kind="package"
 * @generated
 */
public interface AndroTextDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "androTextDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/androtext/lang/AndroTextDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "androTextDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AndroTextDslPackage eINSTANCE = hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextModelRootImpl <em>Andro Text Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroTextModelRoot()
   * @generated
   */
  int ANDRO_TEXT_MODEL_ROOT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_TEXT_MODEL_ROOT__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_TEXT_MODEL_ROOT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Actual Model Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT = 2;

  /**
   * The number of structural features of the '<em>Andro Text Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_TEXT_MODEL_ROOT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ModelRootImpl <em>Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getModelRoot()
   * @generated
   */
  int MODEL_ROOT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ROOT__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ImportImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGenModelRootImpl <em>Andro Gen Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGenModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroGenModelRoot()
   * @generated
   */
  int ANDRO_GEN_MODEL_ROOT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GEN_MODEL_ROOT__NAME = MODEL_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Target Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GEN_MODEL_ROOT__TARGET_APPLICATIONS = MODEL_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Andro Gen Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GEN_MODEL_ROOT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TargetApplicationImpl <em>Target Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TargetApplicationImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTargetApplication()
   * @generated
   */
  int TARGET_APPLICATION = 4;

  /**
   * The feature id for the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_APPLICATION__APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_APPLICATION__PROJECT_NAME = 1;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_APPLICATION__PACKAGE_NAME = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_APPLICATION__TARGET = 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_APPLICATION__VERSION = 4;

  /**
   * The number of structural features of the '<em>Target Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_APPLICATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationImpl <em>Android Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroidApplication()
   * @generated
   */
  int ANDROID_APPLICATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APPLICATION__NAME = MODEL_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Dataroot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APPLICATION__DATAROOT = MODEL_ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Main Activity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APPLICATION__MAIN_ACTIVITY = MODEL_ROOT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APPLICATION__MODEL_ELEMENTS = MODEL_ROOT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Android Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APPLICATION_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationModelElementImpl <em>Android Application Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationModelElementImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroidApplicationModelElement()
   * @generated
   */
  int ANDROID_APPLICATION_MODEL_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APPLICATION_MODEL_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Android Application Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = ANDROID_APPLICATION_MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__LAYOUT = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabActivityImpl <em>Tab Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TabActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTabActivity()
   * @generated
   */
  int TAB_ACTIVITY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY__NAME = ANDROID_APPLICATION_MODEL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Tab Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY_FEATURE_COUNT = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl <em>Andro Data Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroDataModelRoot()
   * @generated
   */
  int ANDRO_DATA_MODEL_ROOT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_DATA_MODEL_ROOT__NAME = MODEL_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_DATA_MODEL_ROOT__ENTITIES = MODEL_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Andro Data Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_DATA_MODEL_ROOT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EntityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TypeRefImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 12;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DataTypesRefImpl <em>Data Types Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DataTypesRefImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDataTypesRef()
   * @generated
   */
  int DATA_TYPES_REF = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPES_REF__TYPE = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Types Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPES_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EntityTypeRefImpl <em>Entity Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EntityTypeRefImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEntityTypeRef()
   * @generated
   */
  int ENTITY_TYPE_REF = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_REF__TYPE = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGuiModelRootImpl <em>Andro Gui Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGuiModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroGuiModelRoot()
   * @generated
   */
  int ANDRO_GUI_MODEL_ROOT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT__NAME = MODEL_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Root Layout</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT__ROOT_LAYOUT = MODEL_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Andro Gui Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.UIElementImpl <em>UI Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.UIElementImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getUIElement()
   * @generated
   */
  int UI_ELEMENT = 16;

  /**
   * The number of structural features of the '<em>UI Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 17;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RootLayoutImpl <em>Root Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RootLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRootLayout()
   * @generated
   */
  int ROOT_LAYOUT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_LAYOUT__NAME = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Root Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BaseLayoutImpl <em>Base Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BaseLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBaseLayout()
   * @generated
   */
  int BASE_LAYOUT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_LAYOUT__NAME = ROOT_LAYOUT__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_LAYOUT__LAYOUT_STYLE = ROOT_LAYOUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_LAYOUT__ELEMENTS = ROOT_LAYOUT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Base Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_LAYOUT_FEATURE_COUNT = ROOT_LAYOUT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AbsoluteLayoutImpl <em>Absolute Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AbsoluteLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAbsoluteLayout()
   * @generated
   */
  int ABSOLUTE_LAYOUT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__NAME = BASE_LAYOUT__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__LAYOUT_STYLE = BASE_LAYOUT__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__ELEMENTS = BASE_LAYOUT__ELEMENTS;

  /**
   * The number of structural features of the '<em>Absolute Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT_FEATURE_COUNT = BASE_LAYOUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl <em>Linear Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLinearLayout()
   * @generated
   */
  int LINEAR_LAYOUT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__NAME = BASE_LAYOUT__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__LAYOUT_STYLE = BASE_LAYOUT__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__ELEMENTS = BASE_LAYOUT__ELEMENTS;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__ORIENTATION = BASE_LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Linear Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT_FEATURE_COUNT = BASE_LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl <em>Frame Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getFrameLayout()
   * @generated
   */
  int FRAME_LAYOUT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__NAME = BASE_LAYOUT__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__LAYOUT_STYLE = BASE_LAYOUT__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__ELEMENTS = BASE_LAYOUT__ELEMENTS;

  /**
   * The number of structural features of the '<em>Frame Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT_FEATURE_COUNT = BASE_LAYOUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RelativeLayoutImpl <em>Relative Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RelativeLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRelativeLayout()
   * @generated
   */
  int RELATIVE_LAYOUT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__NAME = BASE_LAYOUT__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__LAYOUT_STYLE = BASE_LAYOUT__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__ELEMENTS = BASE_LAYOUT__ELEMENTS;

  /**
   * The number of structural features of the '<em>Relative Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT_FEATURE_COUNT = BASE_LAYOUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.WidgetImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__NAME = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__LAYOUT_STYLE = UI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl <em>Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextView()
   * @generated
   */
  int TEXT_VIEW = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl <em>Edit Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEditText()
   * @generated
   */
  int EDIT_TEXT = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Edit Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl <em>List View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListView()
   * @generated
   */
  int LIST_VIEW = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__ENTRIES = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__LAYOUT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl <em>Spinner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSpinner()
   * @generated
   */
  int SPINNER = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__ENTRIES = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spinner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl <em>Radio Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRadioGroup()
   * @generated
   */
  int RADIO_GROUP = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__ORIENTATION = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Radiobuttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__RADIOBUTTONS = WIDGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Radio Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RatingBarImpl <em>Rating Bar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RatingBarImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRatingBar()
   * @generated
   */
  int RATING_BAR = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Num Stars</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__NUM_STARS = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rating Bar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl <em>Toggle Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getToggleButton()
   * @generated
   */
  int TOGGLE_BUTTON = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__LAYOUT_STYLE = WIDGET__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__TEXT_ON = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__TEXT_OFF = WIDGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Toggle Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioButtonImpl <em>Radio Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RadioButtonImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRadioButton()
   * @generated
   */
  int RADIO_BUTTON = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__TEXT = 1;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__LAYOUT_STYLE = 2;

  /**
   * The number of structural features of the '<em>Radio Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl <em>Preference Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceScreen()
   * @generated
   */
  int PREFERENCE_SCREEN = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN__NAME = ROOT_LAYOUT__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN__TITLE = ROOT_LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Preference Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN_FEATURE_COUNT = ROOT_LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl <em>Andro Res Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroResModelRoot()
   * @generated
   */
  int ANDRO_RES_MODEL_ROOT = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_RES_MODEL_ROOT__NAME = MODEL_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_RES_MODEL_ROOT__RESOURCES = MODEL_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Andro Res Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_RES_MODEL_ROOT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceImpl <em>String Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringResource()
   * @generated
   */
  int STRING_RESOURCE = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceImpl <em>Integer Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerResource()
   * @generated
   */
  int INTEGER_RESOURCE = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceImpl <em>Boolean Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBooleanResource()
   * @generated
   */
  int BOOLEAN_RESOURCE = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceImpl <em>Color Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColorResource()
   * @generated
   */
  int COLOR_RESOURCE = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceImpl <em>Dimension Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionResource()
   * @generated
   */
  int DIMENSION_RESOURCE = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dimension Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ArrayResourceImpl <em>Array Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ArrayResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getArrayResource()
   * @generated
   */
  int ARRAY_RESOURCE = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The number of structural features of the '<em>Array Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayResourceImpl <em>Integer Array Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerArrayResource()
   * @generated
   */
  int INTEGER_ARRAY_RESOURCE = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ARRAY_RESOURCE__NAME = ARRAY_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ARRAY_RESOURCE__ENTRIES = ARRAY_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Array Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ARRAY_RESOURCE_FEATURE_COUNT = ARRAY_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayEntryImpl <em>Integer Array Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayEntryImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerArrayEntry()
   * @generated
   */
  int INTEGER_ARRAY_ENTRY = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ARRAY_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ARRAY_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Integer Array Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ARRAY_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayResourceImpl <em>String Array Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringArrayResource()
   * @generated
   */
  int STRING_ARRAY_RESOURCE = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ARRAY_RESOURCE__NAME = ARRAY_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ARRAY_RESOURCE__ENTRIES = ARRAY_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Array Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ARRAY_RESOURCE_FEATURE_COUNT = ARRAY_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayEntryImpl <em>String Array Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayEntryImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringArrayEntry()
   * @generated
   */
  int STRING_ARRAY_ENTRY = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ARRAY_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ARRAY_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>String Array Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ARRAY_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDrawableResource()
   * @generated
   */
  int DRAWABLE_RESOURCE = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The number of structural features of the '<em>Drawable Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BitmapDrawableResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBitmapDrawableResource()
   * @generated
   */
  int BITMAP_DRAWABLE_RESOURCE = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITMAP_DRAWABLE_RESOURCE__NAME = DRAWABLE_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITMAP_DRAWABLE_RESOURCE__FILENAME = DRAWABLE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bitmap Drawable Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITMAP_DRAWABLE_RESOURCE_FEATURE_COUNT = DRAWABLE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TransitionDrawableResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTransitionDrawableResource()
   * @generated
   */
  int TRANSITION_DRAWABLE_RESOURCE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DRAWABLE_RESOURCE__NAME = DRAWABLE_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DRAWABLE_RESOURCE__FROM = DRAWABLE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DRAWABLE_RESOURCE__TO = DRAWABLE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition Drawable Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DRAWABLE_RESOURCE_FEATURE_COUNT = DRAWABLE_RESOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.ApiLevel <em>Api Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.ApiLevel
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getApiLevel()
   * @generated
   */
  int API_LEVEL = 51;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypes <em>Data Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypes
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDataTypes()
   * @generated
   */
  int DATA_TYPES = 52;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle <em>Layout Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutStyle()
   * @generated
   */
  int LAYOUT_STYLE = 53;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot <em>Andro Text Model Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Andro Text Model Root</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot
   * @generated
   */
  EClass getAndroTextModelRoot();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot#getName()
   * @see #getAndroTextModelRoot()
   * @generated
   */
  EAttribute getAndroTextModelRoot_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot#getImports()
   * @see #getAndroTextModelRoot()
   * @generated
   */
  EReference getAndroTextModelRoot_Imports();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot#getActualModelRoot <em>Actual Model Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual Model Root</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot#getActualModelRoot()
   * @see #getAndroTextModelRoot()
   * @generated
   */
  EReference getAndroTextModelRoot_ActualModelRoot();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ModelRoot <em>Model Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Root</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ModelRoot
   * @generated
   */
  EClass getModelRoot();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.ModelRoot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ModelRoot#getName()
   * @see #getModelRoot()
   * @generated
   */
  EAttribute getModelRoot_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot <em>Andro Gen Model Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Andro Gen Model Root</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot
   * @generated
   */
  EClass getAndroGenModelRoot();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot#getTargetApplications <em>Target Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Target Applications</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot#getTargetApplications()
   * @see #getAndroGenModelRoot()
   * @generated
   */
  EReference getAndroGenModelRoot_TargetApplications();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication <em>Target Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Application</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
   * @generated
   */
  EClass getTargetApplication();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Application</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getApplication()
   * @see #getTargetApplication()
   * @generated
   */
  EReference getTargetApplication_Application();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getProjectName()
   * @see #getTargetApplication()
   * @generated
   */
  EAttribute getTargetApplication_ProjectName();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getPackageName()
   * @see #getTargetApplication()
   * @generated
   */
  EAttribute getTargetApplication_PackageName();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getTarget()
   * @see #getTargetApplication()
   * @generated
   */
  EAttribute getTargetApplication_Target();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TargetApplication#getVersion()
   * @see #getTargetApplication()
   * @generated
   */
  EAttribute getTargetApplication_Version();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication <em>Android Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Android Application</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication
   * @generated
   */
  EClass getAndroidApplication();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getDataroot <em>Dataroot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dataroot</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getDataroot()
   * @see #getAndroidApplication()
   * @generated
   */
  EReference getAndroidApplication_Dataroot();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getMainActivity <em>Main Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getMainActivity()
   * @see #getAndroidApplication()
   * @generated
   */
  EReference getAndroidApplication_MainActivity();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getModelElements <em>Model Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model Elements</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication#getModelElements()
   * @see #getAndroidApplication()
   * @generated
   */
  EReference getAndroidApplication_ModelElements();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement <em>Android Application Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Android Application Model Element</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement
   * @generated
   */
  EClass getAndroidApplicationModelElement();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement#getName()
   * @see #getAndroidApplicationModelElement()
   * @generated
   */
  EAttribute getAndroidApplicationModelElement_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Activity#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Activity#getLayout()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Layout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TabActivity <em>Tab Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TabActivity
   * @generated
   */
  EClass getTabActivity();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot <em>Andro Data Model Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Andro Data Model Root</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot
   * @generated
   */
  EClass getAndroDataModelRoot();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot#getEntities()
   * @see #getAndroDataModelRoot()
   * @generated
   */
  EReference getAndroDataModelRoot_Entities();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef <em>Data Types Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Types Ref</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef
   * @generated
   */
  EClass getDataTypesRef();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef#getType()
   * @see #getDataTypesRef()
   * @generated
   */
  EAttribute getDataTypesRef_Type();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef <em>Entity Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type Ref</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef
   * @generated
   */
  EClass getEntityTypeRef();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef#getType()
   * @see #getEntityTypeRef()
   * @generated
   */
  EReference getEntityTypeRef_Type();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot <em>Andro Gui Model Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Andro Gui Model Root</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot
   * @generated
   */
  EClass getAndroGuiModelRoot();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot#getRootLayout <em>Root Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Root Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot#getRootLayout()
   * @see #getAndroGuiModelRoot()
   * @generated
   */
  EReference getAndroGuiModelRoot_RootLayout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.UIElement <em>UI Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Element</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.UIElement
   * @generated
   */
  EClass getUIElement();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.RootLayout <em>Root Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RootLayout
   * @generated
   */
  EClass getRootLayout();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.RootLayout#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RootLayout#getName()
   * @see #getRootLayout()
   * @generated
   */
  EAttribute getRootLayout_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseLayout <em>Base Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BaseLayout
   * @generated
   */
  EClass getBaseLayout();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseLayout#getLayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BaseLayout#getLayoutStyle()
   * @see #getBaseLayout()
   * @generated
   */
  EAttribute getBaseLayout_LayoutStyle();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.BaseLayout#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BaseLayout#getElements()
   * @see #getBaseLayout()
   * @generated
   */
  EReference getBaseLayout_Elements();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout <em>Absolute Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absolute Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout
   * @generated
   */
  EClass getAbsoluteLayout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout <em>Linear Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linear Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayout
   * @generated
   */
  EClass getLinearLayout();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#isOrientation <em>Orientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orientation</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#isOrientation()
   * @see #getLinearLayout()
   * @generated
   */
  EAttribute getLinearLayout_Orientation();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.FrameLayout <em>Frame Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Frame Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FrameLayout
   * @generated
   */
  EClass getFrameLayout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout <em>Relative Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout
   * @generated
   */
  EClass getRelativeLayout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Widget#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Widget#getName()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Widget#getLayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Widget#getLayoutStyle()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_LayoutStyle();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView <em>Text View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView
   * @generated
   */
  EClass getTextView();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getText()
   * @see #getTextView()
   * @generated
   */
  EAttribute getTextView_Text();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText <em>Edit Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edit Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText
   * @generated
   */
  EClass getEditText();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getText()
   * @see #getEditText()
   * @generated
   */
  EAttribute getEditText_Text();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getText()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Text();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListView <em>List View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListView
   * @generated
   */
  EClass getListView();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListView#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entries</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListView#getEntries()
   * @see #getListView()
   * @generated
   */
  EReference getListView_Entries();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListView#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListView#getLayout()
   * @see #getListView()
   * @generated
   */
  EReference getListView_Layout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner <em>Spinner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spinner</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner
   * @generated
   */
  EClass getSpinner();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entries</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getEntries()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_Entries();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBox
   * @generated
   */
  EClass getCheckBox();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBox#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBox#getText()
   * @see #getCheckBox()
   * @generated
   */
  EAttribute getCheckBox_Text();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioGroup <em>Radio Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radio Group</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioGroup
   * @generated
   */
  EClass getRadioGroup();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioGroup#isOrientation <em>Orientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orientation</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioGroup#isOrientation()
   * @see #getRadioGroup()
   * @generated
   */
  EAttribute getRadioGroup_Orientation();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioGroup#getRadiobuttons <em>Radiobuttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Radiobuttons</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioGroup#getRadiobuttons()
   * @see #getRadioGroup()
   * @generated
   */
  EReference getRadioGroup_Radiobuttons();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.RatingBar <em>Rating Bar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rating Bar</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RatingBar
   * @generated
   */
  EClass getRatingBar();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.RatingBar#getNumStars <em>Num Stars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Stars</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RatingBar#getNumStars()
   * @see #getRatingBar()
   * @generated
   */
  EAttribute getRatingBar_NumStars();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton <em>Toggle Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Toggle Button</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToggleButton
   * @generated
   */
  EClass getToggleButton();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOn <em>Text On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text On</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOn()
   * @see #getToggleButton()
   * @generated
   */
  EAttribute getToggleButton_TextOn();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOff <em>Text Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text Off</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOff()
   * @see #getToggleButton()
   * @generated
   */
  EAttribute getToggleButton_TextOff();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton <em>Radio Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radio Button</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioButton
   * @generated
   */
  EClass getRadioButton();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getName()
   * @see #getRadioButton()
   * @generated
   */
  EAttribute getRadioButton_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getText()
   * @see #getRadioButton()
   * @generated
   */
  EAttribute getRadioButton_Text();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getLayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getLayoutStyle()
   * @see #getRadioButton()
   * @generated
   */
  EAttribute getRadioButton_LayoutStyle();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen <em>Preference Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preference Screen</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen
   * @generated
   */
  EClass getPreferenceScreen();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getTitle()
   * @see #getPreferenceScreen()
   * @generated
   */
  EAttribute getPreferenceScreen_Title();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot <em>Andro Res Model Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Andro Res Model Root</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot
   * @generated
   */
  EClass getAndroResModelRoot();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot#getResources()
   * @see #getAndroResModelRoot()
   * @generated
   */
  EReference getAndroResModelRoot_Resources();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringResource <em>String Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringResource
   * @generated
   */
  EClass getStringResource();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.StringResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringResource#getValue()
   * @see #getStringResource()
   * @generated
   */
  EAttribute getStringResource_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerResource <em>Integer Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerResource
   * @generated
   */
  EClass getIntegerResource();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerResource#getValue()
   * @see #getIntegerResource()
   * @generated
   */
  EAttribute getIntegerResource_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanResource <em>Boolean Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanResource
   * @generated
   */
  EClass getBooleanResource();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanResource#getValue()
   * @see #getBooleanResource()
   * @generated
   */
  EAttribute getBooleanResource_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorResource <em>Color Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorResource
   * @generated
   */
  EClass getColorResource();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorResource#getValue()
   * @see #getColorResource()
   * @generated
   */
  EAttribute getColorResource_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionResource <em>Dimension Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionResource
   * @generated
   */
  EClass getDimensionResource();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionResource#getValue()
   * @see #getDimensionResource()
   * @generated
   */
  EAttribute getDimensionResource_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ArrayResource <em>Array Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ArrayResource
   * @generated
   */
  EClass getArrayResource();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource <em>Integer Array Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Array Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource
   * @generated
   */
  EClass getIntegerArrayResource();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource#getEntries()
   * @see #getIntegerArrayResource()
   * @generated
   */
  EReference getIntegerArrayResource_Entries();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry <em>Integer Array Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Array Entry</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry
   * @generated
   */
  EClass getIntegerArrayEntry();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry#getName()
   * @see #getIntegerArrayEntry()
   * @generated
   */
  EAttribute getIntegerArrayEntry_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry#getValue()
   * @see #getIntegerArrayEntry()
   * @generated
   */
  EAttribute getIntegerArrayEntry_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource <em>String Array Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Array Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource
   * @generated
   */
  EClass getStringArrayResource();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource#getEntries()
   * @see #getStringArrayResource()
   * @generated
   */
  EReference getStringArrayResource_Entries();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry <em>String Array Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Array Entry</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry
   * @generated
   */
  EClass getStringArrayEntry();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry#getName()
   * @see #getStringArrayEntry()
   * @generated
   */
  EAttribute getStringArrayEntry_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry#getValue()
   * @see #getStringArrayEntry()
   * @generated
   */
  EAttribute getStringArrayEntry_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DrawableResource <em>Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drawable Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DrawableResource
   * @generated
   */
  EClass getDrawableResource();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitmap Drawable Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource
   * @generated
   */
  EClass getBitmapDrawableResource();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource#getFilename()
   * @see #getBitmapDrawableResource()
   * @generated
   */
  EAttribute getBitmapDrawableResource_Filename();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Drawable Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource
   * @generated
   */
  EClass getTransitionDrawableResource();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource#getFrom()
   * @see #getTransitionDrawableResource()
   * @generated
   */
  EReference getTransitionDrawableResource_From();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource#getTo()
   * @see #getTransitionDrawableResource()
   * @generated
   */
  EReference getTransitionDrawableResource_To();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.ApiLevel <em>Api Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Api Level</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ApiLevel
   * @generated
   */
  EEnum getApiLevel();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Types</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypes
   * @generated
   */
  EEnum getDataTypes();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
   * @generated
   */
  EEnum getLayoutStyle();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AndroTextDslFactory getAndroTextDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextModelRootImpl <em>Andro Text Model Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextModelRootImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroTextModelRoot()
     * @generated
     */
    EClass ANDRO_TEXT_MODEL_ROOT = eINSTANCE.getAndroTextModelRoot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANDRO_TEXT_MODEL_ROOT__NAME = eINSTANCE.getAndroTextModelRoot_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDRO_TEXT_MODEL_ROOT__IMPORTS = eINSTANCE.getAndroTextModelRoot_Imports();

    /**
     * The meta object literal for the '<em><b>Actual Model Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDRO_TEXT_MODEL_ROOT__ACTUAL_MODEL_ROOT = eINSTANCE.getAndroTextModelRoot_ActualModelRoot();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ModelRootImpl <em>Model Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ModelRootImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getModelRoot()
     * @generated
     */
    EClass MODEL_ROOT = eINSTANCE.getModelRoot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ROOT__NAME = eINSTANCE.getModelRoot_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ImportImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGenModelRootImpl <em>Andro Gen Model Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGenModelRootImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroGenModelRoot()
     * @generated
     */
    EClass ANDRO_GEN_MODEL_ROOT = eINSTANCE.getAndroGenModelRoot();

    /**
     * The meta object literal for the '<em><b>Target Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDRO_GEN_MODEL_ROOT__TARGET_APPLICATIONS = eINSTANCE.getAndroGenModelRoot_TargetApplications();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TargetApplicationImpl <em>Target Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TargetApplicationImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTargetApplication()
     * @generated
     */
    EClass TARGET_APPLICATION = eINSTANCE.getTargetApplication();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_APPLICATION__APPLICATION = eINSTANCE.getTargetApplication_Application();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_APPLICATION__PROJECT_NAME = eINSTANCE.getTargetApplication_ProjectName();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_APPLICATION__PACKAGE_NAME = eINSTANCE.getTargetApplication_PackageName();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_APPLICATION__TARGET = eINSTANCE.getTargetApplication_Target();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_APPLICATION__VERSION = eINSTANCE.getTargetApplication_Version();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationImpl <em>Android Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroidApplication()
     * @generated
     */
    EClass ANDROID_APPLICATION = eINSTANCE.getAndroidApplication();

    /**
     * The meta object literal for the '<em><b>Dataroot</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_APPLICATION__DATAROOT = eINSTANCE.getAndroidApplication_Dataroot();

    /**
     * The meta object literal for the '<em><b>Main Activity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_APPLICATION__MAIN_ACTIVITY = eINSTANCE.getAndroidApplication_MainActivity();

    /**
     * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_APPLICATION__MODEL_ELEMENTS = eINSTANCE.getAndroidApplication_ModelElements();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationModelElementImpl <em>Android Application Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroidApplicationModelElementImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroidApplicationModelElement()
     * @generated
     */
    EClass ANDROID_APPLICATION_MODEL_ELEMENT = eINSTANCE.getAndroidApplicationModelElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANDROID_APPLICATION_MODEL_ELEMENT__NAME = eINSTANCE.getAndroidApplicationModelElement_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ActivityImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__LAYOUT = eINSTANCE.getActivity_Layout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabActivityImpl <em>Tab Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TabActivityImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTabActivity()
     * @generated
     */
    EClass TAB_ACTIVITY = eINSTANCE.getTabActivity();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl <em>Andro Data Model Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroDataModelRoot()
     * @generated
     */
    EClass ANDRO_DATA_MODEL_ROOT = eINSTANCE.getAndroDataModelRoot();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDRO_DATA_MODEL_ROOT__ENTITIES = eINSTANCE.getAndroDataModelRoot_Entities();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EntityImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TypeRefImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DataTypesRefImpl <em>Data Types Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DataTypesRefImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDataTypesRef()
     * @generated
     */
    EClass DATA_TYPES_REF = eINSTANCE.getDataTypesRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPES_REF__TYPE = eINSTANCE.getDataTypesRef_Type();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EntityTypeRefImpl <em>Entity Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EntityTypeRefImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEntityTypeRef()
     * @generated
     */
    EClass ENTITY_TYPE_REF = eINSTANCE.getEntityTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_TYPE_REF__TYPE = eINSTANCE.getEntityTypeRef_Type();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGuiModelRootImpl <em>Andro Gui Model Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroGuiModelRootImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroGuiModelRoot()
     * @generated
     */
    EClass ANDRO_GUI_MODEL_ROOT = eINSTANCE.getAndroGuiModelRoot();

    /**
     * The meta object literal for the '<em><b>Root Layout</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDRO_GUI_MODEL_ROOT__ROOT_LAYOUT = eINSTANCE.getAndroGuiModelRoot_RootLayout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.UIElementImpl <em>UI Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.UIElementImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getUIElement()
     * @generated
     */
    EClass UI_ELEMENT = eINSTANCE.getUIElement();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RootLayoutImpl <em>Root Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RootLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRootLayout()
     * @generated
     */
    EClass ROOT_LAYOUT = eINSTANCE.getRootLayout();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT_LAYOUT__NAME = eINSTANCE.getRootLayout_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BaseLayoutImpl <em>Base Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BaseLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBaseLayout()
     * @generated
     */
    EClass BASE_LAYOUT = eINSTANCE.getBaseLayout();

    /**
     * The meta object literal for the '<em><b>Layout Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_LAYOUT__LAYOUT_STYLE = eINSTANCE.getBaseLayout_LayoutStyle();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_LAYOUT__ELEMENTS = eINSTANCE.getBaseLayout_Elements();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AbsoluteLayoutImpl <em>Absolute Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AbsoluteLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAbsoluteLayout()
     * @generated
     */
    EClass ABSOLUTE_LAYOUT = eINSTANCE.getAbsoluteLayout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl <em>Linear Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLinearLayout()
     * @generated
     */
    EClass LINEAR_LAYOUT = eINSTANCE.getLinearLayout();

    /**
     * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINEAR_LAYOUT__ORIENTATION = eINSTANCE.getLinearLayout_Orientation();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl <em>Frame Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getFrameLayout()
     * @generated
     */
    EClass FRAME_LAYOUT = eINSTANCE.getFrameLayout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RelativeLayoutImpl <em>Relative Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RelativeLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRelativeLayout()
     * @generated
     */
    EClass RELATIVE_LAYOUT = eINSTANCE.getRelativeLayout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.WidgetImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

    /**
     * The meta object literal for the '<em><b>Layout Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__LAYOUT_STYLE = eINSTANCE.getWidget_LayoutStyle();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl <em>Text View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextView()
     * @generated
     */
    EClass TEXT_VIEW = eINSTANCE.getTextView();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_VIEW__TEXT = eINSTANCE.getTextView_Text();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl <em>Edit Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEditText()
     * @generated
     */
    EClass EDIT_TEXT = eINSTANCE.getEditText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDIT_TEXT__TEXT = eINSTANCE.getEditText_Text();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl <em>List View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListView()
     * @generated
     */
    EClass LIST_VIEW = eINSTANCE.getListView();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_VIEW__ENTRIES = eINSTANCE.getListView_Entries();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_VIEW__LAYOUT = eINSTANCE.getListView_Layout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl <em>Spinner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSpinner()
     * @generated
     */
    EClass SPINNER = eINSTANCE.getSpinner();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPINNER__ENTRIES = eINSTANCE.getSpinner_Entries();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl <em>Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckBox()
     * @generated
     */
    EClass CHECK_BOX = eINSTANCE.getCheckBox();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_BOX__TEXT = eINSTANCE.getCheckBox_Text();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl <em>Radio Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRadioGroup()
     * @generated
     */
    EClass RADIO_GROUP = eINSTANCE.getRadioGroup();

    /**
     * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO_GROUP__ORIENTATION = eINSTANCE.getRadioGroup_Orientation();

    /**
     * The meta object literal for the '<em><b>Radiobuttons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIO_GROUP__RADIOBUTTONS = eINSTANCE.getRadioGroup_Radiobuttons();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RatingBarImpl <em>Rating Bar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RatingBarImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRatingBar()
     * @generated
     */
    EClass RATING_BAR = eINSTANCE.getRatingBar();

    /**
     * The meta object literal for the '<em><b>Num Stars</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATING_BAR__NUM_STARS = eINSTANCE.getRatingBar_NumStars();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl <em>Toggle Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getToggleButton()
     * @generated
     */
    EClass TOGGLE_BUTTON = eINSTANCE.getToggleButton();

    /**
     * The meta object literal for the '<em><b>Text On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOGGLE_BUTTON__TEXT_ON = eINSTANCE.getToggleButton_TextOn();

    /**
     * The meta object literal for the '<em><b>Text Off</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOGGLE_BUTTON__TEXT_OFF = eINSTANCE.getToggleButton_TextOff();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioButtonImpl <em>Radio Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RadioButtonImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRadioButton()
     * @generated
     */
    EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO_BUTTON__NAME = eINSTANCE.getRadioButton_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO_BUTTON__TEXT = eINSTANCE.getRadioButton_Text();

    /**
     * The meta object literal for the '<em><b>Layout Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO_BUTTON__LAYOUT_STYLE = eINSTANCE.getRadioButton_LayoutStyle();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl <em>Preference Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceScreen()
     * @generated
     */
    EClass PREFERENCE_SCREEN = eINSTANCE.getPreferenceScreen();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE_SCREEN__TITLE = eINSTANCE.getPreferenceScreen_Title();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl <em>Andro Res Model Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroResModelRoot()
     * @generated
     */
    EClass ANDRO_RES_MODEL_ROOT = eINSTANCE.getAndroResModelRoot();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDRO_RES_MODEL_ROOT__RESOURCES = eINSTANCE.getAndroResModelRoot_Resources();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceImpl <em>String Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringResource()
     * @generated
     */
    EClass STRING_RESOURCE = eINSTANCE.getStringResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_RESOURCE__VALUE = eINSTANCE.getStringResource_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceImpl <em>Integer Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerResource()
     * @generated
     */
    EClass INTEGER_RESOURCE = eINSTANCE.getIntegerResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_RESOURCE__VALUE = eINSTANCE.getIntegerResource_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceImpl <em>Boolean Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBooleanResource()
     * @generated
     */
    EClass BOOLEAN_RESOURCE = eINSTANCE.getBooleanResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_RESOURCE__VALUE = eINSTANCE.getBooleanResource_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceImpl <em>Color Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColorResource()
     * @generated
     */
    EClass COLOR_RESOURCE = eINSTANCE.getColorResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_RESOURCE__VALUE = eINSTANCE.getColorResource_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceImpl <em>Dimension Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionResource()
     * @generated
     */
    EClass DIMENSION_RESOURCE = eINSTANCE.getDimensionResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION_RESOURCE__VALUE = eINSTANCE.getDimensionResource_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ArrayResourceImpl <em>Array Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ArrayResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getArrayResource()
     * @generated
     */
    EClass ARRAY_RESOURCE = eINSTANCE.getArrayResource();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayResourceImpl <em>Integer Array Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerArrayResource()
     * @generated
     */
    EClass INTEGER_ARRAY_RESOURCE = eINSTANCE.getIntegerArrayResource();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ARRAY_RESOURCE__ENTRIES = eINSTANCE.getIntegerArrayResource_Entries();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayEntryImpl <em>Integer Array Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerArrayEntryImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerArrayEntry()
     * @generated
     */
    EClass INTEGER_ARRAY_ENTRY = eINSTANCE.getIntegerArrayEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ARRAY_ENTRY__NAME = eINSTANCE.getIntegerArrayEntry_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ARRAY_ENTRY__VALUE = eINSTANCE.getIntegerArrayEntry_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayResourceImpl <em>String Array Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringArrayResource()
     * @generated
     */
    EClass STRING_ARRAY_RESOURCE = eINSTANCE.getStringArrayResource();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ARRAY_RESOURCE__ENTRIES = eINSTANCE.getStringArrayResource_Entries();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayEntryImpl <em>String Array Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringArrayEntryImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringArrayEntry()
     * @generated
     */
    EClass STRING_ARRAY_ENTRY = eINSTANCE.getStringArrayEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ARRAY_ENTRY__NAME = eINSTANCE.getStringArrayEntry_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ARRAY_ENTRY__VALUE = eINSTANCE.getStringArrayEntry_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDrawableResource()
     * @generated
     */
    EClass DRAWABLE_RESOURCE = eINSTANCE.getDrawableResource();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BitmapDrawableResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBitmapDrawableResource()
     * @generated
     */
    EClass BITMAP_DRAWABLE_RESOURCE = eINSTANCE.getBitmapDrawableResource();

    /**
     * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BITMAP_DRAWABLE_RESOURCE__FILENAME = eINSTANCE.getBitmapDrawableResource_Filename();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TransitionDrawableResourceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTransitionDrawableResource()
     * @generated
     */
    EClass TRANSITION_DRAWABLE_RESOURCE = eINSTANCE.getTransitionDrawableResource();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DRAWABLE_RESOURCE__FROM = eINSTANCE.getTransitionDrawableResource_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DRAWABLE_RESOURCE__TO = eINSTANCE.getTransitionDrawableResource_To();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.ApiLevel <em>Api Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.ApiLevel
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getApiLevel()
     * @generated
     */
    EEnum API_LEVEL = eINSTANCE.getApiLevel();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypes <em>Data Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypes
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDataTypes()
     * @generated
     */
    EEnum DATA_TYPES = eINSTANCE.getDataTypes();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle <em>Layout Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutStyle()
     * @generated
     */
    EEnum LAYOUT_STYLE = eINSTANCE.getLayoutStyle();

  }

} //AndroTextDslPackage
