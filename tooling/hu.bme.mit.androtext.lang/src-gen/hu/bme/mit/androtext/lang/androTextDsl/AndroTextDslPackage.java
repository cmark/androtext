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
   * The feature id for the '<em><b>Theme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__THEME = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 2;

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
  int TAB_ACTIVITY__NAME = ACTIVITY__NAME;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY__LAYOUT = ACTIVITY__LAYOUT;

  /**
   * The feature id for the '<em><b>Theme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY__THEME = ACTIVITY__THEME;

  /**
   * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY__TABS = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tab Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabImpl <em>Tab</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TabImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTab()
   * @generated
   */
  int TAB = 9;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__TAG = 0;

  /**
   * The feature id for the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__ACTIVITY = 1;

  /**
   * The number of structural features of the '<em>Tab</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListActivityImpl <em>List Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListActivity()
   * @generated
   */
  int LIST_ACTIVITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__NAME = ACTIVITY__NAME;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__LAYOUT = ACTIVITY__LAYOUT;

  /**
   * The feature id for the '<em><b>Theme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__THEME = ACTIVITY__THEME;

  /**
   * The feature id for the '<em><b>Listitem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__LISTITEM = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__CONTENT_PROVIDER = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceActivityImpl <em>Preference Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceActivity()
   * @generated
   */
  int PREFERENCE_ACTIVITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_ACTIVITY__NAME = ANDROID_APPLICATION_MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_ACTIVITY__LAYOUT = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Preference Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_ACTIVITY_FEATURE_COUNT = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ContentProviderImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getContentProvider()
   * @generated
   */
  int CONTENT_PROVIDER = 12;

  /**
   * The number of structural features of the '<em>Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceContentProviderImpl <em>Resource Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceContentProviderImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getResourceContentProvider()
   * @generated
   */
  int RESOURCE_CONTENT_PROVIDER = 13;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CONTENT_PROVIDER__LINK = CONTENT_PROVIDER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CONTENT_PROVIDER_FEATURE_COUNT = CONTENT_PROVIDER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl <em>Andro Data Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroDataModelRoot()
   * @generated
   */
  int ANDRO_DATA_MODEL_ROOT = 14;

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
  int ENTITY = 15;

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
  int PROPERTY = 16;

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
  int TYPE_REF = 17;

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
  int DATA_TYPES_REF = 18;

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
  int ENTITY_TYPE_REF = 19;

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
  int ANDRO_GUI_MODEL_ROOT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT__NAME = MODEL_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Roots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT__ROOTS = MODEL_ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT__LAYOUT_ATTRIBUTES = MODEL_ROOT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Andro Gui Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getView()
   * @generated
   */
  int VIEW = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__LAYOUT_STYLE = 1;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__LAYOUT_PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewGroupImpl <em>View Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ViewGroupImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getViewGroup()
   * @generated
   */
  int VIEW_GROUP = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_GROUP__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_GROUP__LAYOUT_STYLE = VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_GROUP__LAYOUT_PROPERTIES = VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_GROUP__VIEWS = VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_GROUP_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl <em>Layout Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutPropertiesImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutProperties()
   * @generated
   */
  int LAYOUT_PROPERTIES = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__NAME = 0;

  /**
   * The feature id for the '<em><b>Weight Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__WEIGHT_ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Margin Left Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__MARGIN_LEFT_ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Margin Top Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__MARGIN_TOP_ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Margin Right Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__MARGIN_RIGHT_ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Margin Bottom Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__MARGIN_BOTTOM_ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Align Parent Left Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ALIGN_PARENT_LEFT_ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Align Parent Top Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ALIGN_PARENT_TOP_ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Align Parent Right Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ALIGN_PARENT_RIGHT_ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Align Parent Bottom Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ALIGN_PARENT_BOTTOM_ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Align Top Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ALIGN_TOP_ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Align Bottom Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ALIGN_BOTTOM_ATTRIBUTE = 11;

  /**
   * The feature id for the '<em><b>Align Left Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ALIGN_LEFT_ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Below Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__BELOW_ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Above Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__ABOVE_ATTRIBUTE = 14;

  /**
   * The feature id for the '<em><b>To Left Of Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__TO_LEFT_OF_ATTRIBUTE = 15;

  /**
   * The feature id for the '<em><b>To Right Of Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__TO_RIGHT_OF_ATTRIBUTE = 16;

  /**
   * The feature id for the '<em><b>Center Horizontal Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__CENTER_HORIZONTAL_ATTRIBUTE = 17;

  /**
   * The feature id for the '<em><b>Center In Parent Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__CENTER_IN_PARENT_ATTRIBUTE = 18;

  /**
   * The feature id for the '<em><b>Center Vertical Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__CENTER_VERTICAL_ATTRIBUTE = 19;

  /**
   * The feature id for the '<em><b>Column Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__COLUMN_ATTRIBUTE = 20;

  /**
   * The feature id for the '<em><b>Span Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES__SPAN_ATTRIBUTE = 21;

  /**
   * The number of structural features of the '<em>Layout Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PROPERTIES_FEATURE_COUNT = 22;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutStyleImpl <em>Layout Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutStyleImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutStyle()
   * @generated
   */
  int LAYOUT_STYLE = 24;

  /**
   * The number of structural features of the '<em>Layout Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_STYLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RegularLayoutStyleImpl <em>Regular Layout Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RegularLayoutStyleImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRegularLayoutStyle()
   * @generated
   */
  int REGULAR_LAYOUT_STYLE = 25;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_LAYOUT_STYLE__WIDTH = LAYOUT_STYLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_LAYOUT_STYLE__HEIGHT = LAYOUT_STYLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Regular Layout Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_LAYOUT_STYLE_FEATURE_COUNT = LAYOUT_STYLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FastLayoutStyleImpl <em>Fast Layout Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.FastLayoutStyleImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getFastLayoutStyle()
   * @generated
   */
  int FAST_LAYOUT_STYLE = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAST_LAYOUT_STYLE__VALUE = LAYOUT_STYLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fast Layout Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAST_LAYOUT_STYLE_FEATURE_COUNT = LAYOUT_STYLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AbsoluteLayoutImpl <em>Absolute Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AbsoluteLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAbsoluteLayout()
   * @generated
   */
  int ABSOLUTE_LAYOUT = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__LAYOUT_PROPERTIES = VIEW_GROUP__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The number of structural features of the '<em>Absolute Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl <em>Linear Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLinearLayout()
   * @generated
   */
  int LINEAR_LAYOUT = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__LAYOUT_PROPERTIES = VIEW_GROUP__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The feature id for the '<em><b>Vertical</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__VERTICAL = VIEW_GROUP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__GRAVITY = VIEW_GROUP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Linear Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl <em>Frame Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getFrameLayout()
   * @generated
   */
  int FRAME_LAYOUT = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__LAYOUT_PROPERTIES = VIEW_GROUP__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The number of structural features of the '<em>Frame Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RelativeLayoutImpl <em>Relative Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RelativeLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRelativeLayout()
   * @generated
   */
  int RELATIVE_LAYOUT = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__LAYOUT_PROPERTIES = VIEW_GROUP__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The number of structural features of the '<em>Relative Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GridLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGridLayout()
   * @generated
   */
  int GRID_LAYOUT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__LAYOUT_PROPERTIES = VIEW_GROUP__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The number of structural features of the '<em>Grid Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl <em>Table Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTableLayout()
   * @generated
   */
  int TABLE_LAYOUT = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__LAYOUT_PROPERTIES = VIEW_GROUP__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The feature id for the '<em><b>Collapse Columns Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__COLLAPSE_COLUMNS_ATTRIBUTE = VIEW_GROUP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shrink Columns Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__SHRINK_COLUMNS_ATTRIBUTE = VIEW_GROUP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stretch Columns Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__STRETCH_COLUMNS_ATTRIBUTE = VIEW_GROUP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Table Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableRowImpl <em>Table Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TableRowImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTableRow()
   * @generated
   */
  int TABLE_ROW = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW__LAYOUT_PROPERTIES = VIEW_GROUP__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The number of structural features of the '<em>Table Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleViewImpl <em>Simple View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSimpleView()
   * @generated
   */
  int SIMPLE_VIEW = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VIEW__LAYOUT_STYLE = VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VIEW__LAYOUT_PROPERTIES = VIEW__LAYOUT_PROPERTIES;

  /**
   * The number of structural features of the '<em>Simple View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewElementImpl <em>View Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ViewElementImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getViewElement()
   * @generated
   */
  int VIEW_ELEMENT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__BACKGROUND_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl <em>Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextView()
   * @generated
   */
  int TEXT_VIEW = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__WIDTH_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Height Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__HEIGHT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__BACKGROUND_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clickable Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__CLICKABLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__FADE_SCROLL_BARS_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Scroll Container Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Auto Link Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__AUTO_LINK_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Auto Text Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__AUTO_TEXT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Capitalize Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__CAPITALIZE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Digits Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__DIGITS_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Editable Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__EDITABLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Hint Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__HINT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Numeric Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__NUMERIC_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Password Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__PASSWORD_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Phone Number Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__PHONE_NUMBER_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Single Line Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__SINGLE_LINE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Text Color Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT_COLOR_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Typeface Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TYPEFACE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Text Style Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT_STYLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Gravity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__GRAVITY_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Text Size Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT_SIZE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Padding Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__PADDING_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 22;

  /**
   * The number of structural features of the '<em>Text View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 23;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl <em>Edit Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEditText()
   * @generated
   */
  int EDIT_TEXT = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__WIDTH_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Height Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__HEIGHT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__BACKGROUND_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clickable Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__CLICKABLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__FADE_SCROLL_BARS_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Scroll Container Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__IS_SCROLL_CONTAINER_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Auto Link Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__AUTO_LINK_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Auto Text Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__AUTO_TEXT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Capitalize Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__CAPITALIZE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Digits Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__DIGITS_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Editable Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__EDITABLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Hint Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__HINT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Numeric Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__NUMERIC_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Password Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__PASSWORD_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Phone Number Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__PHONE_NUMBER_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Single Line Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__SINGLE_LINE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Text Color Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT_COLOR_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Typeface Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TYPEFACE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Text Style Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT_STYLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Gravity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__GRAVITY_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Text Size Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT_SIZE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Padding Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__PADDING_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 22;

  /**
   * The number of structural features of the '<em>Edit Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 23;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__WIDTH_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Height Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__HEIGHT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BACKGROUND_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clickable Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__CLICKABLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Hint Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__HINT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GalleryImpl <em>Gallery</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GalleryImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGallery()
   * @generated
   */
  int GALLERY = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The number of structural features of the '<em>Gallery</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ExpandableListViewImpl <em>Expandable List View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ExpandableListViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getExpandableListView()
   * @generated
   */
  int EXPANDABLE_LIST_VIEW = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDABLE_LIST_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDABLE_LIST_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDABLE_LIST_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The number of structural features of the '<em>Expandable List View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDABLE_LIST_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.WebViewImpl <em>Web View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.WebViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getWebView()
   * @generated
   */
  int WEB_VIEW = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The number of structural features of the '<em>Web View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl <em>Image View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getImageView()
   * @generated
   */
  int IMAGE_VIEW = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__SRC = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__WIDTH_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Height Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__HEIGHT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__BACKGROUND_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clickable Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__CLICKABLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__FADE_SCROLL_BARS_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Scroll Container Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__IS_SCROLL_CONTAINER_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Image View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl <em>List View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListView()
   * @generated
   */
  int LIST_VIEW = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Entries Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__ENTRIES_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__LAYOUT = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl <em>Grid View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGridView()
   * @generated
   */
  int GRID_VIEW = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Column Width Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__COLUMN_WIDTH_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Horizontal Spacing Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__HORIZONTAL_SPACING_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vertical Spacing Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__VERTICAL_SPACING_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Num Columns Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__NUM_COLUMNS_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Stretch Mode Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__STRETCH_MODE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Gravity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__GRAVITY_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Grid View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl <em>Spinner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSpinner()
   * @generated
   */
  int SPINNER = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Entries Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__ENTRIES_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__WIDTH_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Height Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__HEIGHT_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__BACKGROUND_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clickable Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__CLICKABLE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__FADE_SCROLL_BARS_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Scroll Container Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__IS_SCROLL_CONTAINER_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Spinner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl <em>Radio Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RadioGroupImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRadioGroup()
   * @generated
   */
  int RADIO_GROUP = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__ORIENTATION = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Radiobuttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__RADIOBUTTONS = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Radio Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RatingBarImpl <em>Rating Bar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RatingBarImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRatingBar()
   * @generated
   */
  int RATING_BAR = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Num Stars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__NUM_STARS = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rating Bar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl <em>Toggle Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ToggleButtonImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getToggleButton()
   * @generated
   */
  int TOGGLE_BUTTON = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Text On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__TEXT_ON = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text Off</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__TEXT_OFF = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Toggle Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RadioButtonImpl <em>Radio Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RadioButtonImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRadioButton()
   * @generated
   */
  int RADIO_BUTTON = 50;

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
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__LAYOUT_STYLE = 2;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__LAYOUT_PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Radio Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckedTextViewImpl <em>Checked Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckedTextViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckedTextView()
   * @generated
   */
  int CHECKED_TEXT_VIEW = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKED_TEXT_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKED_TEXT_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKED_TEXT_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKED_TEXT_VIEW__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Checked Text View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKED_TEXT_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl <em>Auto Complete Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAutoCompleteTextView()
   * @generated
   */
  int AUTO_COMPLETE_TEXT_VIEW = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Layout Properties</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__LAYOUT_PROPERTIES = SIMPLE_VIEW__LAYOUT_PROPERTIES;

  /**
   * The feature id for the '<em><b>Entries Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__ENTRIES_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__MULTI = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Auto Complete Text View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AbstractPreferenceImpl <em>Abstract Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AbstractPreferenceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAbstractPreference()
   * @generated
   */
  int ABSTRACT_PREFERENCE = 53;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PREFERENCE__TITLE = 0;

  /**
   * The number of structural features of the '<em>Abstract Preference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PREFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceImpl <em>Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreference()
   * @generated
   */
  int PREFERENCE = 54;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE__TITLE = ABSTRACT_PREFERENCE__TITLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE__NAME = ABSTRACT_PREFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE__PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Preference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_FEATURE_COUNT = ABSTRACT_PREFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl <em>Preference Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceScreenImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceScreen()
   * @generated
   */
  int PREFERENCE_SCREEN = 55;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN__TITLE = ABSTRACT_PREFERENCE__TITLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN__NAME = ABSTRACT_PREFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN__PREFERENCES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Preference Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_SCREEN_FEATURE_COUNT = ABSTRACT_PREFERENCE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceCategoryImpl <em>Preference Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceCategoryImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceCategory()
   * @generated
   */
  int PREFERENCE_CATEGORY = 56;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_CATEGORY__TITLE = ABSTRACT_PREFERENCE__TITLE;

  /**
   * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_CATEGORY__PREFERENCES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Preference Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_CATEGORY_FEATURE_COUNT = ABSTRACT_PREFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextPreferenceImpl <em>Edit Text Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextPreferenceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEditTextPreference()
   * @generated
   */
  int EDIT_TEXT_PREFERENCE = 57;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_PREFERENCE__TITLE = ABSTRACT_PREFERENCE__TITLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_PREFERENCE__NAME = ABSTRACT_PREFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dialog Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Edit Text Preference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_PREFERENCE_FEATURE_COUNT = ABSTRACT_PREFERENCE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceImpl <em>List Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListPreference()
   * @generated
   */
  int LIST_PREFERENCE = 58;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE__TITLE = ABSTRACT_PREFERENCE__TITLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE__NAME = ABSTRACT_PREFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE__PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dialog Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>List Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>List Preference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE_FEATURE_COUNT = ABSTRACT_PREFERENCE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxPreferenceImpl <em>Check Box Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxPreferenceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckBoxPreference()
   * @generated
   */
  int CHECK_BOX_PREFERENCE = 59;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_PREFERENCE__TITLE = ABSTRACT_PREFERENCE__TITLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_PREFERENCE__NAME = ABSTRACT_PREFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_PREFERENCE__PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Check Box Preference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_PREFERENCE_FEATURE_COUNT = ABSTRACT_PREFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RingtonePrefenceImpl <em>Ringtone Prefence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RingtonePrefenceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRingtonePrefence()
   * @generated
   */
  int RINGTONE_PREFENCE = 60;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RINGTONE_PREFENCE__TITLE = ABSTRACT_PREFERENCE__TITLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RINGTONE_PREFENCE__NAME = ABSTRACT_PREFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Preference Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES = ABSTRACT_PREFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ringtone Prefence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RINGTONE_PREFENCE_FEATURE_COUNT = ABSTRACT_PREFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceAttributesImpl <em>Preference Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceAttributesImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceAttributes()
   * @generated
   */
  int PREFERENCE_ATTRIBUTES = 61;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_ATTRIBUTES__SUMMARY = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_ATTRIBUTES__ENABLED = 1;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_ATTRIBUTES__PERSISTENT = 2;

  /**
   * The number of structural features of the '<em>Preference Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_ATTRIBUTES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DialogPreferenceAttributesImpl <em>Dialog Preference Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DialogPreferenceAttributesImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDialogPreferenceAttributes()
   * @generated
   */
  int DIALOG_PREFERENCE_ATTRIBUTES = 62;

  /**
   * The feature id for the '<em><b>Dialog Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_PREFERENCE_ATTRIBUTES__DIALOG_TITLE = 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_PREFERENCE_ATTRIBUTES__DEFAULT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Dialog Preference Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_PREFERENCE_ATTRIBUTES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl <em>List Preference Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListPreferenceAttributes()
   * @generated
   */
  int LIST_PREFERENCE_ATTRIBUTES = 63;

  /**
   * The feature id for the '<em><b>Entries Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE_ATTRIBUTES__ENTRIES_ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Entry Values</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES = 1;

  /**
   * The number of structural features of the '<em>List Preference Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE_ATTRIBUTES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpanAttributeImpl <em>Span Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SpanAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSpanAttribute()
   * @generated
   */
  int SPAN_ATTRIBUTE = 64;

  /**
   * The feature id for the '<em><b>Span</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_ATTRIBUTE__SPAN = 0;

  /**
   * The number of structural features of the '<em>Span Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColumnAttributeImpl <em>Column Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColumnAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColumnAttribute()
   * @generated
   */
  int COLUMN_ATTRIBUTE = 65;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ATTRIBUTE__COLUMN = 0;

  /**
   * The number of structural features of the '<em>Column Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CenterVerticalAttributeImpl <em>Center Vertical Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CenterVerticalAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCenterVerticalAttribute()
   * @generated
   */
  int CENTER_VERTICAL_ATTRIBUTE = 66;

  /**
   * The feature id for the '<em><b>Center Vertical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_VERTICAL_ATTRIBUTE__CENTER_VERTICAL = 0;

  /**
   * The number of structural features of the '<em>Center Vertical Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_VERTICAL_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CenterInParentAttributeImpl <em>Center In Parent Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CenterInParentAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCenterInParentAttribute()
   * @generated
   */
  int CENTER_IN_PARENT_ATTRIBUTE = 67;

  /**
   * The feature id for the '<em><b>Center In Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_IN_PARENT_ATTRIBUTE__CENTER_IN_PARENT = 0;

  /**
   * The number of structural features of the '<em>Center In Parent Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_IN_PARENT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CenterHorizontalAttributeImpl <em>Center Horizontal Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CenterHorizontalAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCenterHorizontalAttribute()
   * @generated
   */
  int CENTER_HORIZONTAL_ATTRIBUTE = 68;

  /**
   * The feature id for the '<em><b>Center Horizontal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_HORIZONTAL_ATTRIBUTE__CENTER_HORIZONTAL = 0;

  /**
   * The number of structural features of the '<em>Center Horizontal Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_HORIZONTAL_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToRightOfAttributeImpl <em>To Right Of Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ToRightOfAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getToRightOfAttribute()
   * @generated
   */
  int TO_RIGHT_OF_ATTRIBUTE = 69;

  /**
   * The feature id for the '<em><b>To Right Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_RIGHT_OF_ATTRIBUTE__TO_RIGHT_OF = 0;

  /**
   * The number of structural features of the '<em>To Right Of Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_RIGHT_OF_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ToLeftOfAttributeImpl <em>To Left Of Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ToLeftOfAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getToLeftOfAttribute()
   * @generated
   */
  int TO_LEFT_OF_ATTRIBUTE = 70;

  /**
   * The feature id for the '<em><b>To Left Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_LEFT_OF_ATTRIBUTE__TO_LEFT_OF = 0;

  /**
   * The number of structural features of the '<em>To Left Of Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_LEFT_OF_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AboveAttributeImpl <em>Above Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AboveAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAboveAttribute()
   * @generated
   */
  int ABOVE_ATTRIBUTE = 71;

  /**
   * The feature id for the '<em><b>Above</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABOVE_ATTRIBUTE__ABOVE = 0;

  /**
   * The number of structural features of the '<em>Above Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABOVE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BelowAttributeImpl <em>Below Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BelowAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBelowAttribute()
   * @generated
   */
  int BELOW_ATTRIBUTE = 72;

  /**
   * The feature id for the '<em><b>Below</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELOW_ATTRIBUTE__BELOW = 0;

  /**
   * The number of structural features of the '<em>Below Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELOW_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignLeftAttributeImpl <em>Align Left Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AlignLeftAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAlignLeftAttribute()
   * @generated
   */
  int ALIGN_LEFT_ATTRIBUTE = 73;

  /**
   * The feature id for the '<em><b>Align Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_LEFT_ATTRIBUTE__ALIGN_LEFT = 0;

  /**
   * The number of structural features of the '<em>Align Left Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_LEFT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignBottomAttributeImpl <em>Align Bottom Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AlignBottomAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAlignBottomAttribute()
   * @generated
   */
  int ALIGN_BOTTOM_ATTRIBUTE = 74;

  /**
   * The feature id for the '<em><b>Align Bottom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_BOTTOM_ATTRIBUTE__ALIGN_BOTTOM = 0;

  /**
   * The number of structural features of the '<em>Align Bottom Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_BOTTOM_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignTopAttributeImpl <em>Align Top Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AlignTopAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAlignTopAttribute()
   * @generated
   */
  int ALIGN_TOP_ATTRIBUTE = 75;

  /**
   * The feature id for the '<em><b>Align Top</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_TOP_ATTRIBUTE__ALIGN_TOP = 0;

  /**
   * The number of structural features of the '<em>Align Top Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_TOP_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentLeftAttributeImpl <em>Align Parent Left Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentLeftAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAlignParentLeftAttribute()
   * @generated
   */
  int ALIGN_PARENT_LEFT_ATTRIBUTE = 76;

  /**
   * The feature id for the '<em><b>Align Parent Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_LEFT_ATTRIBUTE__ALIGN_PARENT_LEFT = 0;

  /**
   * The number of structural features of the '<em>Align Parent Left Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_LEFT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentTopAttributeImpl <em>Align Parent Top Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentTopAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAlignParentTopAttribute()
   * @generated
   */
  int ALIGN_PARENT_TOP_ATTRIBUTE = 77;

  /**
   * The feature id for the '<em><b>Align Parent Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_TOP_ATTRIBUTE__ALIGN_PARENT_TOP = 0;

  /**
   * The number of structural features of the '<em>Align Parent Top Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_TOP_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentRightAttributeImpl <em>Align Parent Right Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentRightAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAlignParentRightAttribute()
   * @generated
   */
  int ALIGN_PARENT_RIGHT_ATTRIBUTE = 78;

  /**
   * The feature id for the '<em><b>Align Parent Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_RIGHT_ATTRIBUTE__ALIGN_PARENT_RIGHT = 0;

  /**
   * The number of structural features of the '<em>Align Parent Right Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_RIGHT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentBottomAttributeImpl <em>Align Parent Bottom Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AlignParentBottomAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAlignParentBottomAttribute()
   * @generated
   */
  int ALIGN_PARENT_BOTTOM_ATTRIBUTE = 79;

  /**
   * The feature id for the '<em><b>Align Parent Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_BOTTOM_ATTRIBUTE__ALIGN_PARENT_BOTTOM = 0;

  /**
   * The number of structural features of the '<em>Align Parent Bottom Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_PARENT_BOTTOM_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginBottomAttributeImpl <em>Margin Bottom Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.MarginBottomAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getMarginBottomAttribute()
   * @generated
   */
  int MARGIN_BOTTOM_ATTRIBUTE = 80;

  /**
   * The feature id for the '<em><b>Margin Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_BOTTOM_ATTRIBUTE__MARGIN_BOTTOM = 0;

  /**
   * The number of structural features of the '<em>Margin Bottom Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_BOTTOM_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginRightAttributeImpl <em>Margin Right Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.MarginRightAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getMarginRightAttribute()
   * @generated
   */
  int MARGIN_RIGHT_ATTRIBUTE = 81;

  /**
   * The feature id for the '<em><b>Margin Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_RIGHT_ATTRIBUTE__MARGIN_RIGHT = 0;

  /**
   * The number of structural features of the '<em>Margin Right Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_RIGHT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginTopAttributeImpl <em>Margin Top Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.MarginTopAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getMarginTopAttribute()
   * @generated
   */
  int MARGIN_TOP_ATTRIBUTE = 82;

  /**
   * The feature id for the '<em><b>Margin Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_TOP_ATTRIBUTE__MARGIN_TOP = 0;

  /**
   * The number of structural features of the '<em>Margin Top Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_TOP_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.WeightAttributeImpl <em>Weight Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.WeightAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getWeightAttribute()
   * @generated
   */
  int WEIGHT_ATTRIBUTE = 83;

  /**
   * The feature id for the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHT_ATTRIBUTE__WEIGHT = 0;

  /**
   * The number of structural features of the '<em>Weight Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.MarginLeftAttributeImpl <em>Margin Left Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.MarginLeftAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getMarginLeftAttribute()
   * @generated
   */
  int MARGIN_LEFT_ATTRIBUTE = 84;

  /**
   * The feature id for the '<em><b>Margin Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_LEFT_ATTRIBUTE__MARGIN_LEFT = 0;

  /**
   * The number of structural features of the '<em>Margin Left Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARGIN_LEFT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextStyleAttributeImpl <em>Text Style Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextStyleAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextStyleAttribute()
   * @generated
   */
  int TEXT_STYLE_ATTRIBUTE = 85;

  /**
   * The feature id for the '<em><b>Text Style</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE_ATTRIBUTE__TEXT_STYLE = 0;

  /**
   * The number of structural features of the '<em>Text Style Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TypefaceAttributeImpl <em>Typeface Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TypefaceAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTypefaceAttribute()
   * @generated
   */
  int TYPEFACE_ATTRIBUTE = 86;

  /**
   * The feature id for the '<em><b>Typeface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEFACE_ATTRIBUTE__TYPEFACE = 0;

  /**
   * The number of structural features of the '<em>Typeface Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEFACE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextColorAttributeImpl <em>Text Color Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextColorAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextColorAttribute()
   * @generated
   */
  int TEXT_COLOR_ATTRIBUTE = 87;

  /**
   * The feature id for the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_COLOR_ATTRIBUTE__TEXT_COLOR = 0;

  /**
   * The number of structural features of the '<em>Text Color Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_COLOR_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SingleLineAttributeImpl <em>Single Line Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SingleLineAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSingleLineAttribute()
   * @generated
   */
  int SINGLE_LINE_ATTRIBUTE = 88;

  /**
   * The feature id for the '<em><b>Single Line</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_LINE_ATTRIBUTE__SINGLE_LINE = 0;

  /**
   * The number of structural features of the '<em>Single Line Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_LINE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PhoneNumberAttributeImpl <em>Phone Number Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PhoneNumberAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPhoneNumberAttribute()
   * @generated
   */
  int PHONE_NUMBER_ATTRIBUTE = 89;

  /**
   * The feature id for the '<em><b>Phone Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONE_NUMBER_ATTRIBUTE__PHONE_NUMBER = 0;

  /**
   * The number of structural features of the '<em>Phone Number Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONE_NUMBER_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PasswordAttributeImpl <em>Password Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PasswordAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPasswordAttribute()
   * @generated
   */
  int PASSWORD_ATTRIBUTE = 90;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD_ATTRIBUTE__PASSWORD = 0;

  /**
   * The number of structural features of the '<em>Password Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.NumericAttributeImpl <em>Numeric Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.NumericAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getNumericAttribute()
   * @generated
   */
  int NUMERIC_ATTRIBUTE = 91;

  /**
   * The feature id for the '<em><b>Numeric</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_ATTRIBUTE__NUMERIC = 0;

  /**
   * The number of structural features of the '<em>Numeric Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.HintAttributeImpl <em>Hint Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.HintAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getHintAttribute()
   * @generated
   */
  int HINT_ATTRIBUTE = 92;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_ATTRIBUTE__HINT = 0;

  /**
   * The number of structural features of the '<em>Hint Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditableAttributeImpl <em>Editable Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EditableAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEditableAttribute()
   * @generated
   */
  int EDITABLE_ATTRIBUTE = 93;

  /**
   * The feature id for the '<em><b>Editable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITABLE_ATTRIBUTE__EDITABLE = 0;

  /**
   * The number of structural features of the '<em>Editable Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITABLE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DigitsAttributeImpl <em>Digits Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DigitsAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDigitsAttribute()
   * @generated
   */
  int DIGITS_ATTRIBUTE = 94;

  /**
   * The feature id for the '<em><b>Digits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITS_ATTRIBUTE__DIGITS = 0;

  /**
   * The number of structural features of the '<em>Digits Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITS_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CapitalizeAttributeImpl <em>Capitalize Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CapitalizeAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCapitalizeAttribute()
   * @generated
   */
  int CAPITALIZE_ATTRIBUTE = 95;

  /**
   * The feature id for the '<em><b>Capitalize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPITALIZE_ATTRIBUTE__CAPITALIZE = 0;

  /**
   * The number of structural features of the '<em>Capitalize Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPITALIZE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoTextAttributeImpl <em>Auto Text Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AutoTextAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAutoTextAttribute()
   * @generated
   */
  int AUTO_TEXT_ATTRIBUTE = 96;

  /**
   * The feature id for the '<em><b>Auto Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_TEXT_ATTRIBUTE__AUTO_TEXT = 0;

  /**
   * The number of structural features of the '<em>Auto Text Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_TEXT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IsScrollContainerAttributeImpl <em>Is Scroll Container Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IsScrollContainerAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIsScrollContainerAttribute()
   * @generated
   */
  int IS_SCROLL_CONTAINER_ATTRIBUTE = 97;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_SCROLL_CONTAINER_ATTRIBUTE__IS_SCROLL_CONTAINER = 0;

  /**
   * The number of structural features of the '<em>Is Scroll Container Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_SCROLL_CONTAINER_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FadeScrollBarsAttributeImpl <em>Fade Scroll Bars Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.FadeScrollBarsAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getFadeScrollBarsAttribute()
   * @generated
   */
  int FADE_SCROLL_BARS_ATTRIBUTE = 98;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADE_SCROLL_BARS_ATTRIBUTE__FADE_SCROLL_BARS = 0;

  /**
   * The number of structural features of the '<em>Fade Scroll Bars Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADE_SCROLL_BARS_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ClickableAttributeImpl <em>Clickable Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ClickableAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getClickableAttribute()
   * @generated
   */
  int CLICKABLE_ATTRIBUTE = 99;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICKABLE_ATTRIBUTE__CLICKABLE = 0;

  /**
   * The number of structural features of the '<em>Clickable Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICKABLE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoLinkAttributeImpl <em>Auto Link Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AutoLinkAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAutoLinkAttribute()
   * @generated
   */
  int AUTO_LINK_ATTRIBUTE = 100;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_LINK_ATTRIBUTE__ALL = 0;

  /**
   * The feature id for the '<em><b>Auto Link Mask</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_LINK_ATTRIBUTE__AUTO_LINK_MASK = 1;

  /**
   * The number of structural features of the '<em>Auto Link Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_LINK_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.WidthAttributeImpl <em>Width Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.WidthAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getWidthAttribute()
   * @generated
   */
  int WIDTH_ATTRIBUTE = 101;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_ATTRIBUTE__WIDTH = 0;

  /**
   * The number of structural features of the '<em>Width Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.HeightAttributeImpl <em>Height Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.HeightAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getHeightAttribute()
   * @generated
   */
  int HEIGHT_ATTRIBUTE = 102;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT_ATTRIBUTE__HEIGHT = 0;

  /**
   * The number of structural features of the '<em>Height Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PaddingAttributeImpl <em>Padding Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PaddingAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPaddingAttribute()
   * @generated
   */
  int PADDING_ATTRIBUTE = 103;

  /**
   * The feature id for the '<em><b>Padding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDING_ATTRIBUTE__PADDING = 0;

  /**
   * The number of structural features of the '<em>Padding Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDING_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GravityAttributeImpl <em>Gravity Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GravityAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGravityAttribute()
   * @generated
   */
  int GRAVITY_ATTRIBUTE = 104;

  /**
   * The feature id for the '<em><b>Gravity</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAVITY_ATTRIBUTE__GRAVITY = 0;

  /**
   * The number of structural features of the '<em>Gravity Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAVITY_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextSizeAttributeImpl <em>Text Size Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextSizeAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextSizeAttribute()
   * @generated
   */
  int TEXT_SIZE_ATTRIBUTE = 105;

  /**
   * The feature id for the '<em><b>Text Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_SIZE_ATTRIBUTE__TEXT_SIZE = 0;

  /**
   * The number of structural features of the '<em>Text Size Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_SIZE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BackgroundAttributeImpl <em>Background Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BackgroundAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBackgroundAttribute()
   * @generated
   */
  int BACKGROUND_ATTRIBUTE = 106;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_ATTRIBUTE__BACKGROUND = 0;

  /**
   * The number of structural features of the '<em>Background Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColumnWidthAttributeImpl <em>Column Width Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColumnWidthAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColumnWidthAttribute()
   * @generated
   */
  int COLUMN_WIDTH_ATTRIBUTE = 107;

  /**
   * The feature id for the '<em><b>Column Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_WIDTH_ATTRIBUTE__COLUMN_WIDTH = 0;

  /**
   * The number of structural features of the '<em>Column Width Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_WIDTH_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.HorizontalSpacingAttributeImpl <em>Horizontal Spacing Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.HorizontalSpacingAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getHorizontalSpacingAttribute()
   * @generated
   */
  int HORIZONTAL_SPACING_ATTRIBUTE = 108;

  /**
   * The feature id for the '<em><b>Horizontal Spacing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_SPACING_ATTRIBUTE__HORIZONTAL_SPACING = 0;

  /**
   * The number of structural features of the '<em>Horizontal Spacing Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_SPACING_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.NumColumnsAttributeImpl <em>Num Columns Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.NumColumnsAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getNumColumnsAttribute()
   * @generated
   */
  int NUM_COLUMNS_ATTRIBUTE = 109;

  /**
   * The feature id for the '<em><b>Autofit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_COLUMNS_ATTRIBUTE__AUTOFIT = 0;

  /**
   * The feature id for the '<em><b>Num Columns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_COLUMNS_ATTRIBUTE__NUM_COLUMNS = 1;

  /**
   * The number of structural features of the '<em>Num Columns Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_COLUMNS_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StretchModeAttributeImpl <em>Stretch Mode Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StretchModeAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStretchModeAttribute()
   * @generated
   */
  int STRETCH_MODE_ATTRIBUTE = 110;

  /**
   * The feature id for the '<em><b>Stretch Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRETCH_MODE_ATTRIBUTE__STRETCH_MODE = 0;

  /**
   * The number of structural features of the '<em>Stretch Mode Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRETCH_MODE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.VerticalSpacingAttributeImpl <em>Vertical Spacing Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.VerticalSpacingAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getVerticalSpacingAttribute()
   * @generated
   */
  int VERTICAL_SPACING_ATTRIBUTE = 111;

  /**
   * The feature id for the '<em><b>Vertical Spacing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_SPACING_ATTRIBUTE__VERTICAL_SPACING = 0;

  /**
   * The number of structural features of the '<em>Vertical Spacing Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_SPACING_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EntriesAttributeImpl <em>Entries Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EntriesAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEntriesAttribute()
   * @generated
   */
  int ENTRIES_ATTRIBUTE = 112;

  /**
   * The feature id for the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRIES_ATTRIBUTE__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Entries Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRIES_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StretchColumnsAttributeImpl <em>Stretch Columns Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StretchColumnsAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStretchColumnsAttribute()
   * @generated
   */
  int STRETCH_COLUMNS_ATTRIBUTE = 113;

  /**
   * The feature id for the '<em><b>Stretch Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRETCH_COLUMNS_ATTRIBUTE__STRETCH_COLUMNS = 0;

  /**
   * The number of structural features of the '<em>Stretch Columns Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRETCH_COLUMNS_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ShrinkColumnsAttributeImpl <em>Shrink Columns Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ShrinkColumnsAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getShrinkColumnsAttribute()
   * @generated
   */
  int SHRINK_COLUMNS_ATTRIBUTE = 114;

  /**
   * The feature id for the '<em><b>Shrink Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHRINK_COLUMNS_ATTRIBUTE__SHRINK_COLUMNS = 0;

  /**
   * The number of structural features of the '<em>Shrink Columns Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHRINK_COLUMNS_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CollapseColumnsAttributeImpl <em>Collapse Columns Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CollapseColumnsAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCollapseColumnsAttribute()
   * @generated
   */
  int COLLAPSE_COLUMNS_ATTRIBUTE = 115;

  /**
   * The feature id for the '<em><b>Collapse Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSE_COLUMNS_ATTRIBUTE__COLLAPSE_COLUMNS = 0;

  /**
   * The number of structural features of the '<em>Collapse Columns Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSE_COLUMNS_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl <em>Andro Res Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroResModelRoot()
   * @generated
   */
  int ANDRO_RES_MODEL_ROOT = 116;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 117;

  /**
   * The number of structural features of the '<em>Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AnyDrawablePropertyValueImpl <em>Any Drawable Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AnyDrawablePropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAnyDrawablePropertyValue()
   * @generated
   */
  int ANY_DRAWABLE_PROPERTY_VALUE = 118;

  /**
   * The number of structural features of the '<em>Any Drawable Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringPropertyValueImpl <em>String Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringPropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringPropertyValue()
   * @generated
   */
  int STRING_PROPERTY_VALUE = 119;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerPropertyValueImpl <em>Integer Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerPropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerPropertyValue()
   * @generated
   */
  int INTEGER_PROPERTY_VALUE = 120;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanPropertyValueImpl <em>Boolean Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanPropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBooleanPropertyValue()
   * @generated
   */
  int BOOLEAN_PROPERTY_VALUE = 121;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorPropertyValueImpl <em>Color Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColorPropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColorPropertyValue()
   * @generated
   */
  int COLOR_PROPERTY_VALUE = 122;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PROPERTY_VALUE__VALUE = ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PROPERTY_VALUE_FEATURE_COUNT = ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutDimensionPropertyValueImpl <em>Layout Dimension Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutDimensionPropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutDimensionPropertyValue()
   * @generated
   */
  int LAYOUT_DIMENSION_PROPERTY_VALUE = 123;

  /**
   * The feature id for the '<em><b>Const Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Layout Dimension Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_DIMENSION_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionPropertyValueImpl <em>Dimension Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionPropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionPropertyValue()
   * @generated
   */
  int DIMENSION_PROPERTY_VALUE = 124;

  /**
   * The feature id for the '<em><b>Const Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE__CONST_VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dimension Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceLinkImpl <em>Drawable Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDrawableResourceLink()
   * @generated
   */
  int DRAWABLE_RESOURCE_LINK = 125;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_LINK__LINK = ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Drawable Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_LINK_FEATURE_COUNT = ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ExternalDrawableResourceLinkImpl <em>External Drawable Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ExternalDrawableResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getExternalDrawableResourceLink()
   * @generated
   */
  int EXTERNAL_DRAWABLE_RESOURCE_LINK = 126;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE = ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Drawable Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DRAWABLE_RESOURCE_LINK_FEATURE_COUNT = ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceLinkImpl <em>String Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringResourceLink()
   * @generated
   */
  int STRING_RESOURCE_LINK = 127;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_RESOURCE_LINK__VALUE = STRING_PROPERTY_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_RESOURCE_LINK__LINK = STRING_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_RESOURCE_LINK_FEATURE_COUNT = STRING_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceLinkImpl <em>Integer Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerResourceLink()
   * @generated
   */
  int INTEGER_RESOURCE_LINK = 128;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RESOURCE_LINK__VALUE = INTEGER_PROPERTY_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RESOURCE_LINK__LINK = INTEGER_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RESOURCE_LINK_FEATURE_COUNT = INTEGER_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceLinkImpl <em>Boolean Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBooleanResourceLink()
   * @generated
   */
  int BOOLEAN_RESOURCE_LINK = 129;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RESOURCE_LINK__VALUE = BOOLEAN_PROPERTY_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RESOURCE_LINK__LINK = BOOLEAN_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RESOURCE_LINK_FEATURE_COUNT = BOOLEAN_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceLinkImpl <em>Color Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColorResourceLink()
   * @generated
   */
  int COLOR_RESOURCE_LINK = 130;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_RESOURCE_LINK__VALUE = COLOR_PROPERTY_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_RESOURCE_LINK__LINK = COLOR_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_RESOURCE_LINK_FEATURE_COUNT = COLOR_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceLinkImpl <em>Dimension Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionResourceLink()
   * @generated
   */
  int DIMENSION_RESOURCE_LINK = 131;

  /**
   * The feature id for the '<em><b>Const Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE_LINK__CONST_VALUE = DIMENSION_PROPERTY_VALUE__CONST_VALUE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE_LINK__VALUE = DIMENSION_PROPERTY_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE_LINK__LINK = DIMENSION_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dimension Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE_LINK_FEATURE_COUNT = DIMENSION_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ResourceImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 132;

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
  int STRING_RESOURCE = 133;

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
  int INTEGER_RESOURCE = 134;

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
  int BOOLEAN_RESOURCE = 135;

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
  int COLOR_RESOURCE = 136;

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
  int DIMENSION_RESOURCE = 137;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
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
  int ARRAY_RESOURCE = 138;

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
  int INTEGER_ARRAY_RESOURCE = 139;

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
  int INTEGER_ARRAY_ENTRY = 140;

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
  int STRING_ARRAY_RESOURCE = 141;

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
  int STRING_ARRAY_ENTRY = 142;

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
  int DRAWABLE_RESOURCE = 143;

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
  int BITMAP_DRAWABLE_RESOURCE = 144;

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
  int TRANSITION_DRAWABLE_RESOURCE = 145;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionValueImpl <em>Dimension Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionValue()
   * @generated
   */
  int DIMENSION_VALUE = 146;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Metric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_VALUE__METRIC = 1;

  /**
   * The number of structural features of the '<em>Dimension Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.ApiLevel <em>Api Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.ApiLevel
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getApiLevel()
   * @generated
   */
  int API_LEVEL = 147;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme <em>Activity Theme</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getActivityTheme()
   * @generated
   */
  int ACTIVITY_THEME = 148;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypes <em>Data Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypes
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDataTypes()
   * @generated
   */
  int DATA_TYPES = 149;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.NumericKind <em>Numeric Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumericKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getNumericKind()
   * @generated
   */
  int NUMERIC_KIND = 150;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind <em>Typeface Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTypefaceKind()
   * @generated
   */
  int TYPEFACE_KIND = 151;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind <em>Text Style Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextStyleKind()
   * @generated
   */
  int TEXT_STYLE_KIND = 152;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind <em>Capitalize Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCapitalizeKind()
   * @generated
   */
  int CAPITALIZE_KIND = 153;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind <em>Auto Link Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAutoLinkKind()
   * @generated
   */
  int AUTO_LINK_KIND = 154;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind <em>Stretch Mode Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStretchModeKind()
   * @generated
   */
  int STRETCH_MODE_KIND = 155;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.GravityKind <em>Gravity Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.GravityKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGravityKind()
   * @generated
   */
  int GRAVITY_KIND = 156;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind <em>Fast Layout Dimension Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getFastLayoutDimensionKind()
   * @generated
   */
  int FAST_LAYOUT_DIMENSION_KIND = 157;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind <em>Layout Dimension Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutDimensionKind()
   * @generated
   */
  int LAYOUT_DIMENSION_KIND = 158;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource <em>Android Drawable Resource</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroidDrawableResource()
   * @generated
   */
  int ANDROID_DRAWABLE_RESOURCE = 159;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric <em>Dimension Metric</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionMetric()
   * @generated
   */
  int DIMENSION_METRIC = 160;


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
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Activity#getTheme <em>Theme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Theme</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Activity#getTheme()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Theme();

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
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.TabActivity#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TabActivity#getTabs()
   * @see #getTabActivity()
   * @generated
   */
  EReference getTabActivity_Tabs();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Tab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Tab
   * @generated
   */
  EClass getTab();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Tab#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tag</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Tab#getTag()
   * @see #getTab()
   * @generated
   */
  EAttribute getTab_Tag();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Tab#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Tab#getActivity()
   * @see #getTab()
   * @generated
   */
  EReference getTab_Activity();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity <em>List Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListActivity
   * @generated
   */
  EClass getListActivity();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getListitem <em>Listitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Listitem</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getListitem()
   * @see #getListActivity()
   * @generated
   */
  EReference getListActivity_Listitem();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content Provider</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListActivity#getContentProvider()
   * @see #getListActivity()
   * @generated
   */
  EReference getListActivity_ContentProvider();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity <em>Preference Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preference Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity
   * @generated
   */
  EClass getPreferenceActivity();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity#getLayout()
   * @see #getPreferenceActivity()
   * @generated
   */
  EReference getPreferenceActivity_Layout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ContentProvider
   * @generated
   */
  EClass getContentProvider();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider <em>Resource Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Content Provider</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider
   * @generated
   */
  EClass getResourceContentProvider();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider#getLink()
   * @see #getResourceContentProvider()
   * @generated
   */
  EReference getResourceContentProvider_Link();

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
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot#getRoots <em>Roots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roots</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot#getRoots()
   * @see #getAndroGuiModelRoot()
   * @generated
   */
  EReference getAndroGuiModelRoot_Roots();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot#getLayoutAttributes <em>Layout Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layout Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot#getLayoutAttributes()
   * @see #getAndroGuiModelRoot()
   * @generated
   */
  EReference getAndroGuiModelRoot_LayoutAttributes();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutStyle()
   * @see #getView()
   * @generated
   */
  EReference getView_LayoutStyle();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutProperties <em>Layout Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout Properties</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutProperties()
   * @see #getView()
   * @generated
   */
  EReference getView_LayoutProperties();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ViewGroup <em>View Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Group</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ViewGroup
   * @generated
   */
  EClass getViewGroup();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.ViewGroup#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ViewGroup#getViews()
   * @see #getViewGroup()
   * @generated
   */
  EReference getViewGroup_Views();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties <em>Layout Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Properties</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties
   * @generated
   */
  EClass getLayoutProperties();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getName()
   * @see #getLayoutProperties()
   * @generated
   */
  EAttribute getLayoutProperties_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getWeightAttribute <em>Weight Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weight Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getWeightAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_WeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginLeftAttribute <em>Margin Left Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Left Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginLeftAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_MarginLeftAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginTopAttribute <em>Margin Top Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Top Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginTopAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_MarginTopAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginRightAttribute <em>Margin Right Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Right Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginRightAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_MarginRightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginBottomAttribute <em>Margin Bottom Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Bottom Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getMarginBottomAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_MarginBottomAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentLeftAttribute <em>Align Parent Left Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Left Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentLeftAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AlignParentLeftAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentTopAttribute <em>Align Parent Top Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Top Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentTopAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AlignParentTopAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentRightAttribute <em>Align Parent Right Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Right Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentRightAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AlignParentRightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentBottomAttribute <em>Align Parent Bottom Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Bottom Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignParentBottomAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AlignParentBottomAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignTopAttribute <em>Align Top Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Top Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignTopAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AlignTopAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignBottomAttribute <em>Align Bottom Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Bottom Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignBottomAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AlignBottomAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignLeftAttribute <em>Align Left Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Left Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAlignLeftAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AlignLeftAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getBelowAttribute <em>Below Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Below Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getBelowAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_BelowAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAboveAttribute <em>Above Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Above Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getAboveAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_AboveAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToLeftOfAttribute <em>To Left Of Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Left Of Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToLeftOfAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_ToLeftOfAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToRightOfAttribute <em>To Right Of Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Right Of Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getToRightOfAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_ToRightOfAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterHorizontalAttribute <em>Center Horizontal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center Horizontal Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterHorizontalAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_CenterHorizontalAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterInParentAttribute <em>Center In Parent Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center In Parent Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterInParentAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_CenterInParentAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterVerticalAttribute <em>Center Vertical Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center Vertical Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getCenterVerticalAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_CenterVerticalAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getColumnAttribute <em>Column Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getColumnAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_ColumnAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getSpanAttribute <em>Span Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties#getSpanAttribute()
   * @see #getLayoutProperties()
   * @generated
   */
  EReference getLayoutProperties_SpanAttribute();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutStyle
   * @generated
   */
  EClass getLayoutStyle();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle <em>Regular Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regular Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle
   * @generated
   */
  EClass getRegularLayoutStyle();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getWidth()
   * @see #getRegularLayoutStyle()
   * @generated
   */
  EReference getRegularLayoutStyle_Width();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle#getHeight()
   * @see #getRegularLayoutStyle()
   * @generated
   */
  EReference getRegularLayoutStyle_Height();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle <em>Fast Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fast Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle
   * @generated
   */
  EClass getFastLayoutStyle();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle#getValue()
   * @see #getFastLayoutStyle()
   * @generated
   */
  EAttribute getFastLayoutStyle_Value();

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
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#isVertical <em>Vertical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vertical</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#isVertical()
   * @see #getLinearLayout()
   * @generated
   */
  EAttribute getLinearLayout_Vertical();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getGravity <em>Gravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gravity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getGravity()
   * @see #getLinearLayout()
   * @generated
   */
  EReference getLinearLayout_Gravity();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.GridLayout <em>Grid Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridLayout
   * @generated
   */
  EClass getGridLayout();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout <em>Table Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TableLayout
   * @generated
   */
  EClass getTableLayout();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getCollapseColumnsAttribute <em>Collapse Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collapse Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getCollapseColumnsAttribute()
   * @see #getTableLayout()
   * @generated
   */
  EReference getTableLayout_CollapseColumnsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getShrinkColumnsAttribute <em>Shrink Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shrink Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getShrinkColumnsAttribute()
   * @see #getTableLayout()
   * @generated
   */
  EReference getTableLayout_ShrinkColumnsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getStretchColumnsAttribute <em>Stretch Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stretch Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TableLayout#getStretchColumnsAttribute()
   * @see #getTableLayout()
   * @generated
   */
  EReference getTableLayout_StretchColumnsAttribute();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TableRow <em>Table Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Row</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TableRow
   * @generated
   */
  EClass getTableRow();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleView <em>Simple View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SimpleView
   * @generated
   */
  EClass getSimpleView();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Element</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ViewElement
   * @generated
   */
  EClass getViewElement();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ViewElement#getBackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ViewElement#getBackgroundAttribute()
   * @see #getViewElement()
   * @generated
   */
  EReference getViewElement_BackgroundAttribute();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getText()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_Text();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getWidthAttribute <em>Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getWidthAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_WidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getHeightAttribute <em>Height Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getHeightAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_HeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getBackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getBackgroundAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_BackgroundAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getClickableAttribute <em>Clickable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clickable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getClickableAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_ClickableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getFadeScrollBarsAttribute <em>Fade Scroll Bars Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fade Scroll Bars Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getFadeScrollBarsAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_FadeScrollBarsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getIsScrollContainerAttribute <em>Is Scroll Container Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Scroll Container Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getIsScrollContainerAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_IsScrollContainerAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getAutoLinkAttribute <em>Auto Link Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Auto Link Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getAutoLinkAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_AutoLinkAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getAutoTextAttribute <em>Auto Text Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Auto Text Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getAutoTextAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_AutoTextAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getCapitalizeAttribute <em>Capitalize Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Capitalize Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getCapitalizeAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_CapitalizeAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getDigitsAttribute <em>Digits Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Digits Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getDigitsAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_DigitsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getEditableAttribute <em>Editable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Editable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getEditableAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_EditableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getHintAttribute <em>Hint Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getHintAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_HintAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getNumericAttribute <em>Numeric Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Numeric Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getNumericAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_NumericAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getPasswordAttribute <em>Password Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Password Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getPasswordAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_PasswordAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getPhoneNumberAttribute <em>Phone Number Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phone Number Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getPhoneNumberAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_PhoneNumberAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getSingleLineAttribute <em>Single Line Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Line Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getSingleLineAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_SingleLineAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextColorAttribute <em>Text Color Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextColorAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_TextColorAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getTypefaceAttribute <em>Typeface Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typeface Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getTypefaceAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_TypefaceAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextStyleAttribute <em>Text Style Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Style Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextStyleAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_TextStyleAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getGravityAttribute <em>Gravity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gravity Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getGravityAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_GravityAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextSizeAttribute <em>Text Size Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Size Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getTextSizeAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_TextSizeAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getPaddingAttribute <em>Padding Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Padding Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getPaddingAttribute()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_PaddingAttribute();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getText()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_Text();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getWidthAttribute <em>Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getWidthAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_WidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getHeightAttribute <em>Height Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getHeightAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_HeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getBackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getBackgroundAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_BackgroundAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getClickableAttribute <em>Clickable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clickable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getClickableAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_ClickableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getFadeScrollBarsAttribute <em>Fade Scroll Bars Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fade Scroll Bars Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getFadeScrollBarsAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_FadeScrollBarsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getIsScrollContainerAttribute <em>Is Scroll Container Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Scroll Container Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getIsScrollContainerAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_IsScrollContainerAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getAutoLinkAttribute <em>Auto Link Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Auto Link Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getAutoLinkAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_AutoLinkAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getAutoTextAttribute <em>Auto Text Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Auto Text Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getAutoTextAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_AutoTextAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getCapitalizeAttribute <em>Capitalize Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Capitalize Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getCapitalizeAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_CapitalizeAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getDigitsAttribute <em>Digits Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Digits Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getDigitsAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_DigitsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getEditableAttribute <em>Editable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Editable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getEditableAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_EditableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getHintAttribute <em>Hint Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getHintAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_HintAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getNumericAttribute <em>Numeric Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Numeric Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getNumericAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_NumericAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getPasswordAttribute <em>Password Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Password Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getPasswordAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_PasswordAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getPhoneNumberAttribute <em>Phone Number Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phone Number Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getPhoneNumberAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_PhoneNumberAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getSingleLineAttribute <em>Single Line Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Line Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getSingleLineAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_SingleLineAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getTextColorAttribute <em>Text Color Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getTextColorAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_TextColorAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getTypefaceAttribute <em>Typeface Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typeface Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getTypefaceAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_TypefaceAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getTextStyleAttribute <em>Text Style Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Style Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getTextStyleAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_TextStyleAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getGravityAttribute <em>Gravity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gravity Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getGravityAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_GravityAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getTextSizeAttribute <em>Text Size Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Size Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getTextSizeAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_TextSizeAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getPaddingAttribute <em>Padding Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Padding Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getPaddingAttribute()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_PaddingAttribute();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getText()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Text();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getWidthAttribute <em>Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getWidthAttribute()
   * @see #getButton()
   * @generated
   */
  EReference getButton_WidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getHeightAttribute <em>Height Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getHeightAttribute()
   * @see #getButton()
   * @generated
   */
  EReference getButton_HeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getBackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getBackgroundAttribute()
   * @see #getButton()
   * @generated
   */
  EReference getButton_BackgroundAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getClickableAttribute <em>Clickable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clickable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getClickableAttribute()
   * @see #getButton()
   * @generated
   */
  EReference getButton_ClickableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getHintAttribute <em>Hint Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getHintAttribute()
   * @see #getButton()
   * @generated
   */
  EReference getButton_HintAttribute();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Gallery <em>Gallery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gallery</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Gallery
   * @generated
   */
  EClass getGallery();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ExpandableListView <em>Expandable List View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expandable List View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ExpandableListView
   * @generated
   */
  EClass getExpandableListView();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.WebView <em>Web View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.WebView
   * @generated
   */
  EClass getWebView();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView <em>Image View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView
   * @generated
   */
  EClass getImageView();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Src</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView#getSrc()
   * @see #getImageView()
   * @generated
   */
  EReference getImageView_Src();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView#getWidthAttribute <em>Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView#getWidthAttribute()
   * @see #getImageView()
   * @generated
   */
  EReference getImageView_WidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView#getHeightAttribute <em>Height Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView#getHeightAttribute()
   * @see #getImageView()
   * @generated
   */
  EReference getImageView_HeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView#getBackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView#getBackgroundAttribute()
   * @see #getImageView()
   * @generated
   */
  EReference getImageView_BackgroundAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView#getClickableAttribute <em>Clickable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clickable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView#getClickableAttribute()
   * @see #getImageView()
   * @generated
   */
  EReference getImageView_ClickableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView#getFadeScrollBarsAttribute <em>Fade Scroll Bars Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fade Scroll Bars Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView#getFadeScrollBarsAttribute()
   * @see #getImageView()
   * @generated
   */
  EReference getImageView_FadeScrollBarsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ImageView#getIsScrollContainerAttribute <em>Is Scroll Container Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Scroll Container Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ImageView#getIsScrollContainerAttribute()
   * @see #getImageView()
   * @generated
   */
  EReference getImageView_IsScrollContainerAttribute();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListView#getEntriesAttribute <em>Entries Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entries Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListView#getEntriesAttribute()
   * @see #getListView()
   * @generated
   */
  EReference getListView_EntriesAttribute();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView <em>Grid View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView
   * @generated
   */
  EClass getGridView();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView#getColumnWidthAttribute <em>Column Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView#getColumnWidthAttribute()
   * @see #getGridView()
   * @generated
   */
  EReference getGridView_ColumnWidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView#getHorizontalSpacingAttribute <em>Horizontal Spacing Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horizontal Spacing Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView#getHorizontalSpacingAttribute()
   * @see #getGridView()
   * @generated
   */
  EReference getGridView_HorizontalSpacingAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView#getVerticalSpacingAttribute <em>Vertical Spacing Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vertical Spacing Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView#getVerticalSpacingAttribute()
   * @see #getGridView()
   * @generated
   */
  EReference getGridView_VerticalSpacingAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView#getNumColumnsAttribute <em>Num Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView#getNumColumnsAttribute()
   * @see #getGridView()
   * @generated
   */
  EReference getGridView_NumColumnsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView#getStretchModeAttribute <em>Stretch Mode Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stretch Mode Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView#getStretchModeAttribute()
   * @see #getGridView()
   * @generated
   */
  EReference getGridView_StretchModeAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView#getGravityAttribute <em>Gravity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gravity Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView#getGravityAttribute()
   * @see #getGridView()
   * @generated
   */
  EReference getGridView_GravityAttribute();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getEntriesAttribute <em>Entries Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entries Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getEntriesAttribute()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_EntriesAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getWidthAttribute <em>Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getWidthAttribute()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_WidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getHeightAttribute <em>Height Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getHeightAttribute()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_HeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getBackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getBackgroundAttribute()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_BackgroundAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getClickableAttribute <em>Clickable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clickable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getClickableAttribute()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_ClickableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getFadeScrollBarsAttribute <em>Fade Scroll Bars Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fade Scroll Bars Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getFadeScrollBarsAttribute()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_FadeScrollBarsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Spinner#getIsScrollContainerAttribute <em>Is Scroll Container Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Scroll Container Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Spinner#getIsScrollContainerAttribute()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_IsScrollContainerAttribute();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBox#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBox#getText()
   * @see #getCheckBox()
   * @generated
   */
  EReference getCheckBox_Text();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.RatingBar#getNumStars <em>Num Stars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Stars</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RatingBar#getNumStars()
   * @see #getRatingBar()
   * @generated
   */
  EReference getRatingBar_NumStars();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOn <em>Text On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text On</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOn()
   * @see #getToggleButton()
   * @generated
   */
  EReference getToggleButton_TextOn();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOff <em>Text Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Off</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToggleButton#getTextOff()
   * @see #getToggleButton()
   * @generated
   */
  EReference getToggleButton_TextOff();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getLayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getLayoutStyle()
   * @see #getRadioButton()
   * @generated
   */
  EReference getRadioButton_LayoutStyle();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getLayoutProperties <em>Layout Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout Properties</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RadioButton#getLayoutProperties()
   * @see #getRadioButton()
   * @generated
   */
  EReference getRadioButton_LayoutProperties();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView <em>Checked Text View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checked Text View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView
   * @generated
   */
  EClass getCheckedTextView();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView#getText()
   * @see #getCheckedTextView()
   * @generated
   */
  EAttribute getCheckedTextView_Text();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView <em>Auto Complete Text View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auto Complete Text View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView
   * @generated
   */
  EClass getAutoCompleteTextView();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntriesAttribute <em>Entries Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entries Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntriesAttribute()
   * @see #getAutoCompleteTextView()
   * @generated
   */
  EReference getAutoCompleteTextView_EntriesAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multi</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getMulti()
   * @see #getAutoCompleteTextView()
   * @generated
   */
  EReference getAutoCompleteTextView_Multi();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference <em>Abstract Preference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Preference</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference
   * @generated
   */
  EClass getAbstractPreference();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference#getTitle()
   * @see #getAbstractPreference()
   * @generated
   */
  EAttribute getAbstractPreference_Title();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Preference <em>Preference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preference</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Preference
   * @generated
   */
  EClass getPreference();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.Preference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Preference#getName()
   * @see #getPreference()
   * @generated
   */
  EAttribute getPreference_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Preference#getPreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Preference#getPreferenceAttributes()
   * @see #getPreference()
   * @generated
   */
  EReference getPreference_PreferenceAttributes();

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
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getName()
   * @see #getPreferenceScreen()
   * @generated
   */
  EAttribute getPreferenceScreen_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getPreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getPreferenceAttributes()
   * @see #getPreferenceScreen()
   * @generated
   */
  EReference getPreferenceScreen_PreferenceAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getPreferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Preferences</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen#getPreferences()
   * @see #getPreferenceScreen()
   * @generated
   */
  EReference getPreferenceScreen_Preferences();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory <em>Preference Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preference Category</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory
   * @generated
   */
  EClass getPreferenceCategory();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory#getPreferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Preferences</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory#getPreferences()
   * @see #getPreferenceCategory()
   * @generated
   */
  EReference getPreferenceCategory_Preferences();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference <em>Edit Text Preference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edit Text Preference</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference
   * @generated
   */
  EClass getEditTextPreference();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getName()
   * @see #getEditTextPreference()
   * @generated
   */
  EAttribute getEditTextPreference_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getPreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getPreferenceAttributes()
   * @see #getEditTextPreference()
   * @generated
   */
  EReference getEditTextPreference_PreferenceAttributes();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dialog Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference#getDialogPreferenceAttributes()
   * @see #getEditTextPreference()
   * @generated
   */
  EReference getEditTextPreference_DialogPreferenceAttributes();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference <em>List Preference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Preference</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreference
   * @generated
   */
  EClass getListPreference();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getName()
   * @see #getListPreference()
   * @generated
   */
  EAttribute getListPreference_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getPreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getPreferenceAttributes()
   * @see #getListPreference()
   * @generated
   */
  EReference getListPreference_PreferenceAttributes();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getDialogPreferenceAttributes <em>Dialog Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dialog Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getDialogPreferenceAttributes()
   * @see #getListPreference()
   * @generated
   */
  EReference getListPreference_DialogPreferenceAttributes();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getListPreferenceAttributes <em>List Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreference#getListPreferenceAttributes()
   * @see #getListPreference()
   * @generated
   */
  EReference getListPreference_ListPreferenceAttributes();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference <em>Check Box Preference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box Preference</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference
   * @generated
   */
  EClass getCheckBoxPreference();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference#getName()
   * @see #getCheckBoxPreference()
   * @generated
   */
  EAttribute getCheckBoxPreference_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference#getPreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference#getPreferenceAttributes()
   * @see #getCheckBoxPreference()
   * @generated
   */
  EReference getCheckBoxPreference_PreferenceAttributes();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence <em>Ringtone Prefence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ringtone Prefence</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence
   * @generated
   */
  EClass getRingtonePrefence();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence#getName()
   * @see #getRingtonePrefence()
   * @generated
   */
  EAttribute getRingtonePrefence_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence#getPreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence#getPreferenceAttributes()
   * @see #getRingtonePrefence()
   * @generated
   */
  EReference getRingtonePrefence_PreferenceAttributes();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes <em>Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes
   * @generated
   */
  EClass getPreferenceAttributes();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes#getSummary()
   * @see #getPreferenceAttributes()
   * @generated
   */
  EAttribute getPreferenceAttributes_Summary();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes#getEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes#getEnabled()
   * @see #getPreferenceAttributes()
   * @generated
   */
  EAttribute getPreferenceAttributes_Enabled();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes#getPersistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes#getPersistent()
   * @see #getPreferenceAttributes()
   * @generated
   */
  EAttribute getPreferenceAttributes_Persistent();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes <em>Dialog Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialog Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes
   * @generated
   */
  EClass getDialogPreferenceAttributes();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDialogTitle <em>Dialog Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dialog Title</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDialogTitle()
   * @see #getDialogPreferenceAttributes()
   * @generated
   */
  EAttribute getDialogPreferenceAttributes_DialogTitle();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes#getDefaultValue()
   * @see #getDialogPreferenceAttributes()
   * @generated
   */
  EAttribute getDialogPreferenceAttributes_DefaultValue();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes <em>List Preference Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Preference Attributes</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes
   * @generated
   */
  EClass getListPreferenceAttributes();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntriesAttribute <em>Entries Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entries Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntriesAttribute()
   * @see #getListPreferenceAttributes()
   * @generated
   */
  EReference getListPreferenceAttributes_EntriesAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntryValues <em>Entry Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entry Values</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntryValues()
   * @see #getListPreferenceAttributes()
   * @generated
   */
  EReference getListPreferenceAttributes_EntryValues();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute <em>Span Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute
   * @generated
   */
  EClass getSpanAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute#getSpan <em>Span</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute#getSpan()
   * @see #getSpanAttribute()
   * @generated
   */
  EReference getSpanAttribute_Span();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColumnAttribute <em>Column Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColumnAttribute
   * @generated
   */
  EClass getColumnAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ColumnAttribute#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColumnAttribute#getColumn()
   * @see #getColumnAttribute()
   * @generated
   */
  EReference getColumnAttribute_Column();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute <em>Center Vertical Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Center Vertical Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute
   * @generated
   */
  EClass getCenterVerticalAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute#getCenterVertical <em>Center Vertical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center Vertical</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute#getCenterVertical()
   * @see #getCenterVerticalAttribute()
   * @generated
   */
  EReference getCenterVerticalAttribute_CenterVertical();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute <em>Center In Parent Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Center In Parent Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute
   * @generated
   */
  EClass getCenterInParentAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute#getCenterInParent <em>Center In Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center In Parent</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute#getCenterInParent()
   * @see #getCenterInParentAttribute()
   * @generated
   */
  EReference getCenterInParentAttribute_CenterInParent();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute <em>Center Horizontal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Center Horizontal Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute
   * @generated
   */
  EClass getCenterHorizontalAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute#getCenterHorizontal <em>Center Horizontal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center Horizontal</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute#getCenterHorizontal()
   * @see #getCenterHorizontalAttribute()
   * @generated
   */
  EReference getCenterHorizontalAttribute_CenterHorizontal();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute <em>To Right Of Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To Right Of Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute
   * @generated
   */
  EClass getToRightOfAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute#getToRightOf <em>To Right Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Right Of</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute#getToRightOf()
   * @see #getToRightOfAttribute()
   * @generated
   */
  EReference getToRightOfAttribute_ToRightOf();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute <em>To Left Of Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To Left Of Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute
   * @generated
   */
  EClass getToLeftOfAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute#getToLeftOf <em>To Left Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Left Of</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute#getToLeftOf()
   * @see #getToLeftOfAttribute()
   * @generated
   */
  EReference getToLeftOfAttribute_ToLeftOf();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AboveAttribute <em>Above Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Above Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AboveAttribute
   * @generated
   */
  EClass getAboveAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AboveAttribute#getAbove <em>Above</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Above</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AboveAttribute#getAbove()
   * @see #getAboveAttribute()
   * @generated
   */
  EReference getAboveAttribute_Above();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute <em>Below Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Below Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute
   * @generated
   */
  EClass getBelowAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute#getBelow <em>Below</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Below</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute#getBelow()
   * @see #getBelowAttribute()
   * @generated
   */
  EReference getBelowAttribute_Below();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute <em>Align Left Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Left Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute
   * @generated
   */
  EClass getAlignLeftAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute#getAlignLeft <em>Align Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Align Left</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute#getAlignLeft()
   * @see #getAlignLeftAttribute()
   * @generated
   */
  EReference getAlignLeftAttribute_AlignLeft();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute <em>Align Bottom Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Bottom Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute
   * @generated
   */
  EClass getAlignBottomAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute#getAlignBottom <em>Align Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Align Bottom</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute#getAlignBottom()
   * @see #getAlignBottomAttribute()
   * @generated
   */
  EReference getAlignBottomAttribute_AlignBottom();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignTopAttribute <em>Align Top Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Top Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignTopAttribute
   * @generated
   */
  EClass getAlignTopAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignTopAttribute#getAlignTop <em>Align Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Align Top</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignTopAttribute#getAlignTop()
   * @see #getAlignTopAttribute()
   * @generated
   */
  EReference getAlignTopAttribute_AlignTop();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute <em>Align Parent Left Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Parent Left Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute
   * @generated
   */
  EClass getAlignParentLeftAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute#getAlignParentLeft <em>Align Parent Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Left</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute#getAlignParentLeft()
   * @see #getAlignParentLeftAttribute()
   * @generated
   */
  EReference getAlignParentLeftAttribute_AlignParentLeft();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute <em>Align Parent Top Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Parent Top Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute
   * @generated
   */
  EClass getAlignParentTopAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute#getAlignParentTop <em>Align Parent Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Top</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute#getAlignParentTop()
   * @see #getAlignParentTopAttribute()
   * @generated
   */
  EReference getAlignParentTopAttribute_AlignParentTop();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute <em>Align Parent Right Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Parent Right Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute
   * @generated
   */
  EClass getAlignParentRightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute#getAlignParentRight <em>Align Parent Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Right</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute#getAlignParentRight()
   * @see #getAlignParentRightAttribute()
   * @generated
   */
  EReference getAlignParentRightAttribute_AlignParentRight();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute <em>Align Parent Bottom Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Parent Bottom Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute
   * @generated
   */
  EClass getAlignParentBottomAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute#getAlignParentBottom <em>Align Parent Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Bottom</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute#getAlignParentBottom()
   * @see #getAlignParentBottomAttribute()
   * @generated
   */
  EReference getAlignParentBottomAttribute_AlignParentBottom();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute <em>Margin Bottom Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Margin Bottom Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute
   * @generated
   */
  EClass getMarginBottomAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute#getMarginBottom <em>Margin Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Bottom</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute#getMarginBottom()
   * @see #getMarginBottomAttribute()
   * @generated
   */
  EReference getMarginBottomAttribute_MarginBottom();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute <em>Margin Right Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Margin Right Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute
   * @generated
   */
  EClass getMarginRightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute#getMarginRight <em>Margin Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Right</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute#getMarginRight()
   * @see #getMarginRightAttribute()
   * @generated
   */
  EReference getMarginRightAttribute_MarginRight();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute <em>Margin Top Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Margin Top Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute
   * @generated
   */
  EClass getMarginTopAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute#getMarginTop <em>Margin Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Top</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute#getMarginTop()
   * @see #getMarginTopAttribute()
   * @generated
   */
  EReference getMarginTopAttribute_MarginTop();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.WeightAttribute <em>Weight Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weight Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.WeightAttribute
   * @generated
   */
  EClass getWeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.WeightAttribute#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weight</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.WeightAttribute#getWeight()
   * @see #getWeightAttribute()
   * @generated
   */
  EReference getWeightAttribute_Weight();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute <em>Margin Left Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Margin Left Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute
   * @generated
   */
  EClass getMarginLeftAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute#getMarginLeft <em>Margin Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Left</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute#getMarginLeft()
   * @see #getMarginLeftAttribute()
   * @generated
   */
  EReference getMarginLeftAttribute_MarginLeft();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute <em>Text Style Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Style Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute
   * @generated
   */
  EClass getTextStyleAttribute();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute#getTextStyle <em>Text Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute#getTextStyle()
   * @see #getTextStyleAttribute()
   * @generated
   */
  EAttribute getTextStyleAttribute_TextStyle();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute <em>Typeface Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typeface Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute
   * @generated
   */
  EClass getTypefaceAttribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute#getTypeface <em>Typeface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typeface</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute#getTypeface()
   * @see #getTypefaceAttribute()
   * @generated
   */
  EAttribute getTypefaceAttribute_Typeface();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute <em>Text Color Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Color Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute
   * @generated
   */
  EClass getTextColorAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute#getTextColor <em>Text Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute#getTextColor()
   * @see #getTextColorAttribute()
   * @generated
   */
  EReference getTextColorAttribute_TextColor();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute <em>Single Line Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Line Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute
   * @generated
   */
  EClass getSingleLineAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute#getSingleLine <em>Single Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Line</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute#getSingleLine()
   * @see #getSingleLineAttribute()
   * @generated
   */
  EReference getSingleLineAttribute_SingleLine();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute <em>Phone Number Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phone Number Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute
   * @generated
   */
  EClass getPhoneNumberAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute#getPhoneNumber <em>Phone Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phone Number</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute#getPhoneNumber()
   * @see #getPhoneNumberAttribute()
   * @generated
   */
  EReference getPhoneNumberAttribute_PhoneNumber();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute <em>Password Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Password Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute
   * @generated
   */
  EClass getPasswordAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute#getPassword()
   * @see #getPasswordAttribute()
   * @generated
   */
  EReference getPasswordAttribute_Password();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute <em>Numeric Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute
   * @generated
   */
  EClass getNumericAttribute();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute#getNumeric <em>Numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Numeric</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute#getNumeric()
   * @see #getNumericAttribute()
   * @generated
   */
  EAttribute getNumericAttribute_Numeric();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.HintAttribute <em>Hint Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hint Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HintAttribute
   * @generated
   */
  EClass getHintAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.HintAttribute#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HintAttribute#getHint()
   * @see #getHintAttribute()
   * @generated
   */
  EReference getHintAttribute_Hint();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute <em>Editable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Editable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute
   * @generated
   */
  EClass getEditableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute#getEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Editable</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute#getEditable()
   * @see #getEditableAttribute()
   * @generated
   */
  EReference getEditableAttribute_Editable();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute <em>Digits Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digits Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute
   * @generated
   */
  EClass getDigitsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute#getDigits <em>Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Digits</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute#getDigits()
   * @see #getDigitsAttribute()
   * @generated
   */
  EReference getDigitsAttribute_Digits();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute <em>Capitalize Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capitalize Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute
   * @generated
   */
  EClass getCapitalizeAttribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute#getCapitalize <em>Capitalize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capitalize</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute#getCapitalize()
   * @see #getCapitalizeAttribute()
   * @generated
   */
  EAttribute getCapitalizeAttribute_Capitalize();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute <em>Auto Text Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auto Text Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute
   * @generated
   */
  EClass getAutoTextAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute#getAutoText <em>Auto Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Auto Text</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute#getAutoText()
   * @see #getAutoTextAttribute()
   * @generated
   */
  EReference getAutoTextAttribute_AutoText();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute <em>Is Scroll Container Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Scroll Container Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute
   * @generated
   */
  EClass getIsScrollContainerAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute#getIsScrollContainer <em>Is Scroll Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute#getIsScrollContainer()
   * @see #getIsScrollContainerAttribute()
   * @generated
   */
  EReference getIsScrollContainerAttribute_IsScrollContainer();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute <em>Fade Scroll Bars Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fade Scroll Bars Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute
   * @generated
   */
  EClass getFadeScrollBarsAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute#getFadeScrollBars()
   * @see #getFadeScrollBarsAttribute()
   * @generated
   */
  EReference getFadeScrollBarsAttribute_FadeScrollBars();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute <em>Clickable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clickable Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute
   * @generated
   */
  EClass getClickableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute#getClickable <em>Clickable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clickable</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute#getClickable()
   * @see #getClickableAttribute()
   * @generated
   */
  EReference getClickableAttribute_Clickable();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute <em>Auto Link Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auto Link Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute
   * @generated
   */
  EClass getAutoLinkAttribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute#isAll()
   * @see #getAutoLinkAttribute()
   * @generated
   */
  EAttribute getAutoLinkAttribute_All();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute#getAutoLinkMask <em>Auto Link Mask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Auto Link Mask</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute#getAutoLinkMask()
   * @see #getAutoLinkAttribute()
   * @generated
   */
  EAttribute getAutoLinkAttribute_AutoLinkMask();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute <em>Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute
   * @generated
   */
  EClass getWidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute#getWidth()
   * @see #getWidthAttribute()
   * @generated
   */
  EReference getWidthAttribute_Width();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute <em>Height Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Height Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute
   * @generated
   */
  EClass getHeightAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute#getHeight()
   * @see #getHeightAttribute()
   * @generated
   */
  EReference getHeightAttribute_Height();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute <em>Padding Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Padding Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute
   * @generated
   */
  EClass getPaddingAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute#getPadding <em>Padding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Padding</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute#getPadding()
   * @see #getPaddingAttribute()
   * @generated
   */
  EReference getPaddingAttribute_Padding();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute <em>Gravity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gravity Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute
   * @generated
   */
  EClass getGravityAttribute();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute#getGravity <em>Gravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Gravity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute#getGravity()
   * @see #getGravityAttribute()
   * @generated
   */
  EAttribute getGravityAttribute_Gravity();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute <em>Text Size Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Size Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute
   * @generated
   */
  EClass getTextSizeAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute#getTextSize <em>Text Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Size</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute#getTextSize()
   * @see #getTextSizeAttribute()
   * @generated
   */
  EReference getTextSizeAttribute_TextSize();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute
   * @generated
   */
  EClass getBackgroundAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute#getBackground()
   * @see #getBackgroundAttribute()
   * @generated
   */
  EReference getBackgroundAttribute_Background();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute <em>Column Width Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Width Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute
   * @generated
   */
  EClass getColumnWidthAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute#getColumnWidth <em>Column Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Width</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute#getColumnWidth()
   * @see #getColumnWidthAttribute()
   * @generated
   */
  EReference getColumnWidthAttribute_ColumnWidth();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute <em>Horizontal Spacing Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horizontal Spacing Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute
   * @generated
   */
  EClass getHorizontalSpacingAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute#getHorizontalSpacing <em>Horizontal Spacing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horizontal Spacing</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute#getHorizontalSpacing()
   * @see #getHorizontalSpacingAttribute()
   * @generated
   */
  EReference getHorizontalSpacingAttribute_HorizontalSpacing();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute <em>Num Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute
   * @generated
   */
  EClass getNumColumnsAttribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#isAutofit <em>Autofit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autofit</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#isAutofit()
   * @see #getNumColumnsAttribute()
   * @generated
   */
  EAttribute getNumColumnsAttribute_Autofit();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#getNumColumns <em>Num Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Columns</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute#getNumColumns()
   * @see #getNumColumnsAttribute()
   * @generated
   */
  EReference getNumColumnsAttribute_NumColumns();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute <em>Stretch Mode Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stretch Mode Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute
   * @generated
   */
  EClass getStretchModeAttribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute#getStretchMode <em>Stretch Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stretch Mode</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute#getStretchMode()
   * @see #getStretchModeAttribute()
   * @generated
   */
  EAttribute getStretchModeAttribute_StretchMode();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute <em>Vertical Spacing Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertical Spacing Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute
   * @generated
   */
  EClass getVerticalSpacingAttribute();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute#getVerticalSpacing <em>Vertical Spacing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vertical Spacing</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute#getVerticalSpacing()
   * @see #getVerticalSpacingAttribute()
   * @generated
   */
  EReference getVerticalSpacingAttribute_VerticalSpacing();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute <em>Entries Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entries Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute
   * @generated
   */
  EClass getEntriesAttribute();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entries</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute#getEntries()
   * @see #getEntriesAttribute()
   * @generated
   */
  EReference getEntriesAttribute_Entries();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute <em>Stretch Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stretch Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute
   * @generated
   */
  EClass getStretchColumnsAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute#getStretchColumns <em>Stretch Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stretch Columns</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute#getStretchColumns()
   * @see #getStretchColumnsAttribute()
   * @generated
   */
  EReference getStretchColumnsAttribute_StretchColumns();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute <em>Shrink Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shrink Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute
   * @generated
   */
  EClass getShrinkColumnsAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute#getShrinkColumns <em>Shrink Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shrink Columns</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute#getShrinkColumns()
   * @see #getShrinkColumnsAttribute()
   * @generated
   */
  EReference getShrinkColumnsAttribute_ShrinkColumns();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute <em>Collapse Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collapse Columns Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute
   * @generated
   */
  EClass getCollapseColumnsAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute#getCollapseColumns <em>Collapse Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collapse Columns</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute#getCollapseColumns()
   * @see #getCollapseColumnsAttribute()
   * @generated
   */
  EReference getCollapseColumnsAttribute_CollapseColumns();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.PropertyValue
   * @generated
   */
  EClass getPropertyValue();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue <em>Any Drawable Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Drawable Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AnyDrawablePropertyValue
   * @generated
   */
  EClass getAnyDrawablePropertyValue();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue <em>String Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue
   * @generated
   */
  EClass getStringPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue#getValue()
   * @see #getStringPropertyValue()
   * @generated
   */
  EAttribute getStringPropertyValue_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue <em>Integer Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue
   * @generated
   */
  EClass getIntegerPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue#getValue()
   * @see #getIntegerPropertyValue()
   * @generated
   */
  EAttribute getIntegerPropertyValue_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue <em>Boolean Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue
   * @generated
   */
  EClass getBooleanPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue#getValue()
   * @see #getBooleanPropertyValue()
   * @generated
   */
  EAttribute getBooleanPropertyValue_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue <em>Color Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue
   * @generated
   */
  EClass getColorPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue#getValue()
   * @see #getColorPropertyValue()
   * @generated
   */
  EAttribute getColorPropertyValue_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue <em>Layout Dimension Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Dimension Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue
   * @generated
   */
  EClass getLayoutDimensionPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue#getConstValue <em>Const Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue#getConstValue()
   * @see #getLayoutDimensionPropertyValue()
   * @generated
   */
  EAttribute getLayoutDimensionPropertyValue_ConstValue();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue <em>Dimension Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Property Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue
   * @generated
   */
  EClass getDimensionPropertyValue();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue#getValue()
   * @see #getDimensionPropertyValue()
   * @generated
   */
  EReference getDimensionPropertyValue_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink <em>Drawable Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drawable Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink
   * @generated
   */
  EClass getDrawableResourceLink();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink#getLink()
   * @see #getDrawableResourceLink()
   * @generated
   */
  EReference getDrawableResourceLink_Link();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink <em>External Drawable Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Drawable Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink
   * @generated
   */
  EClass getExternalDrawableResourceLink();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink#getExternalResource <em>External Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink#getExternalResource()
   * @see #getExternalDrawableResourceLink()
   * @generated
   */
  EAttribute getExternalDrawableResourceLink_ExternalResource();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink <em>String Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink
   * @generated
   */
  EClass getStringResourceLink();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink#getLink()
   * @see #getStringResourceLink()
   * @generated
   */
  EReference getStringResourceLink_Link();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink <em>Integer Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink
   * @generated
   */
  EClass getIntegerResourceLink();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink#getLink()
   * @see #getIntegerResourceLink()
   * @generated
   */
  EReference getIntegerResourceLink_Link();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink <em>Boolean Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink
   * @generated
   */
  EClass getBooleanResourceLink();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink#getLink()
   * @see #getBooleanResourceLink()
   * @generated
   */
  EReference getBooleanResourceLink_Link();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink <em>Color Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink
   * @generated
   */
  EClass getColorResourceLink();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink#getLink()
   * @see #getColorResourceLink()
   * @generated
   */
  EReference getColorResourceLink_Link();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink <em>Dimension Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink
   * @generated
   */
  EClass getDimensionResourceLink();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink#getLink()
   * @see #getDimensionResourceLink()
   * @generated
   */
  EReference getDimensionResourceLink_Link();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionResource#getValue()
   * @see #getDimensionResource()
   * @generated
   */
  EReference getDimensionResource_Value();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue <em>Dimension Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionValue
   * @generated
   */
  EClass getDimensionValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getValue()
   * @see #getDimensionValue()
   * @generated
   */
  EAttribute getDimensionValue_Value();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getMetric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metric</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionValue#getMetric()
   * @see #getDimensionValue()
   * @generated
   */
  EAttribute getDimensionValue_Metric();

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
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme <em>Activity Theme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Activity Theme</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme
   * @generated
   */
  EEnum getActivityTheme();

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
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.NumericKind <em>Numeric Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Numeric Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.NumericKind
   * @generated
   */
  EEnum getNumericKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind <em>Typeface Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Typeface Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TypefaceKind
   * @generated
   */
  EEnum getTypefaceKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind <em>Text Style Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Text Style Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextStyleKind
   * @generated
   */
  EEnum getTextStyleKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind <em>Capitalize Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Capitalize Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.CapitalizeKind
   * @generated
   */
  EEnum getCapitalizeKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind <em>Auto Link Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Auto Link Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoLinkKind
   * @generated
   */
  EEnum getAutoLinkKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind <em>Stretch Mode Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Stretch Mode Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.StretchModeKind
   * @generated
   */
  EEnum getStretchModeKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.GravityKind <em>Gravity Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Gravity Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GravityKind
   * @generated
   */
  EEnum getGravityKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind <em>Fast Layout Dimension Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Fast Layout Dimension Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.FastLayoutDimensionKind
   * @generated
   */
  EEnum getFastLayoutDimensionKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind <em>Layout Dimension Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Layout Dimension Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
   * @generated
   */
  EEnum getLayoutDimensionKind();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource <em>Android Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Android Drawable Resource</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource
   * @generated
   */
  EEnum getAndroidDrawableResource();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric <em>Dimension Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dimension Metric</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric
   * @generated
   */
  EEnum getDimensionMetric();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AndroTextDslFactory getAndroTextDslFactory();

} //AndroTextDslPackage
