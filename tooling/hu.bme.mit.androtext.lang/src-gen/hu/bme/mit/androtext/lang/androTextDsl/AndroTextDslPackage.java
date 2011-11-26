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
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = ANDROID_APPLICATION_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSimpleActivity()
   * @generated
   */
  int SIMPLE_ACTIVITY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ACTIVITY__NAME = ACTIVITY__NAME;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ACTIVITY__LAYOUT = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Theme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ACTIVITY__THEME = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabActivityImpl <em>Tab Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TabActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTabActivity()
   * @generated
   */
  int TAB_ACTIVITY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY__NAME = ACTIVITY__NAME;

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
  int TAB = 10;

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
  int LIST_ACTIVITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__NAME = ACTIVITY__NAME;

  /**
   * The feature id for the '<em><b>Listitem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__LISTITEM = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceActivityImpl <em>Preference Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceActivity()
   * @generated
   */
  int PREFERENCE_ACTIVITY = 12;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ActionImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 13;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeActivityImpl <em>Invoke Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeActivityImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getInvokeActivity()
   * @generated
   */
  int INVOKE_ACTIVITY = 14;

  /**
   * The feature id for the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_ACTIVITY__ACTIVITY = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invoke Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_ACTIVITY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeWebUrlImpl <em>Invoke Web Url</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeWebUrlImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getInvokeWebUrl()
   * @generated
   */
  int INVOKE_WEB_URL = 15;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_WEB_URL__URL = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invoke Web Url</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_WEB_URL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl <em>Andro Data Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroDataModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroDataModelRoot()
   * @generated
   */
  int ANDRO_DATA_MODEL_ROOT = 16;

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
  int ENTITY = 17;

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
  int PROPERTY = 18;

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
  int TYPE_REF = 19;

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
  int DATA_TYPES_REF = 20;

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
  int ENTITY_TYPE_REF = 21;

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
  int ANDRO_GUI_MODEL_ROOT = 22;

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
   * The number of structural features of the '<em>Andro Gui Model Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDRO_GUI_MODEL_ROOT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getView()
   * @generated
   */
  int VIEW = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__LAYOUT_STYLE = 1;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewGroupImpl <em>View Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ViewGroupImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getViewGroup()
   * @generated
   */
  int VIEW_GROUP = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_GROUP__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_GROUP__LAYOUT_STYLE = VIEW__LAYOUT_STYLE;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl <em>Layout Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutParams()
   * @generated
   */
  int LAYOUT_PARAMS = 25;

  /**
   * The feature id for the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__WEIGHT = 0;

  /**
   * The feature id for the '<em><b>Margin Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__MARGIN_LEFT = 1;

  /**
   * The feature id for the '<em><b>Margin Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__MARGIN_TOP = 2;

  /**
   * The feature id for the '<em><b>Margin Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__MARGIN_RIGHT = 3;

  /**
   * The feature id for the '<em><b>Margin Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__MARGIN_BOTTOM = 4;

  /**
   * The feature id for the '<em><b>Align Parentleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ALIGN_PARENTLEFT = 5;

  /**
   * The feature id for the '<em><b>Align Parent Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ALIGN_PARENT_TOP = 6;

  /**
   * The feature id for the '<em><b>Align Parent Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ALIGN_PARENT_RIGHT = 7;

  /**
   * The feature id for the '<em><b>Align Parent Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM = 8;

  /**
   * The feature id for the '<em><b>Align Top</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ALIGN_TOP = 9;

  /**
   * The feature id for the '<em><b>Align Bottom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ALIGN_BOTTOM = 10;

  /**
   * The feature id for the '<em><b>Align Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ALIGN_LEFT = 11;

  /**
   * The feature id for the '<em><b>Below</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__BELOW = 12;

  /**
   * The feature id for the '<em><b>Above</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__ABOVE = 13;

  /**
   * The feature id for the '<em><b>To Left Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__TO_LEFT_OF = 14;

  /**
   * The feature id for the '<em><b>To Right Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__TO_RIGHT_OF = 15;

  /**
   * The feature id for the '<em><b>Center Horizontal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__CENTER_HORIZONTAL = 16;

  /**
   * The feature id for the '<em><b>Center In Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__CENTER_IN_PARENT = 17;

  /**
   * The feature id for the '<em><b>Center Vertical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__CENTER_VERTICAL = 18;

  /**
   * The feature id for the '<em><b>Background Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE = 19;

  /**
   * The number of structural features of the '<em>Layout Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_PARAMS_FEATURE_COUNT = 20;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutGravityAttributeImpl <em>Layout Gravity Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutGravityAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutGravityAttribute()
   * @generated
   */
  int LAYOUT_GRAVITY_ATTRIBUTE = 26;

  /**
   * The feature id for the '<em><b>Gravity</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY = 0;

  /**
   * The number of structural features of the '<em>Layout Gravity Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_GRAVITY_ATTRIBUTE_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

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
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

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
   * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT__LAYOUT_PARAMS = VIEW_GROUP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Linear Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutParamsImpl <em>Linear Layout Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutParamsImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLinearLayoutParams()
   * @generated
   */
  int LINEAR_LAYOUT_PARAMS = 29;

  /**
   * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS = 0;

  /**
   * The feature id for the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT_PARAMS__GRAVITY = 1;

  /**
   * The number of structural features of the '<em>Linear Layout Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_LAYOUT_PARAMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl <em>Frame Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.FrameLayoutImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getFrameLayout()
   * @generated
   */
  int FRAME_LAYOUT = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

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
  int RELATIVE_LAYOUT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

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
  int GRID_LAYOUT = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

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
  int TABLE_LAYOUT = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__NAME = VIEW_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__LAYOUT_STYLE = VIEW_GROUP__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT__VIEWS = VIEW_GROUP__VIEWS;

  /**
   * The number of structural features of the '<em>Table Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_LAYOUT_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VIEW__LAYOUT_STYLE = VIEW__LAYOUT_STYLE;

  /**
   * The number of structural features of the '<em>Simple View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GalleryImpl <em>Gallery</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GalleryImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGallery()
   * @generated
   */
  int GALLERY = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

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
  int EXPANDABLE_LIST_VIEW = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDABLE_LIST_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDABLE_LIST_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

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
  int WEB_VIEW = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

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
  int IMAGE_VIEW = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW__SRC = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl <em>Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextView()
   * @generated
   */
  int TEXT_VIEW = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Gravity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__GRAVITY_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Text Size Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT_SIZE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__LAYOUT_PARAMS = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Text View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GravityAttributeImpl <em>Gravity Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GravityAttributeImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGravityAttribute()
   * @generated
   */
  int GRAVITY_ATTRIBUTE = 40;

  /**
   * The feature id for the '<em><b>Gravity</b></em>' attribute.
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
  int TEXT_SIZE_ATTRIBUTE = 41;

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
  int BACKGROUND_ATTRIBUTE = 42;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl <em>Edit Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEditText()
   * @generated
   */
  int EDIT_TEXT = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Gravity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__GRAVITY_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Text Size Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT_SIZE_ATTRIBUTE = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__LAYOUT_PARAMS = SIMPLE_VIEW_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Edit Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ButtonImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LAYOUT_PARAMS = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl <em>List View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListView()
   * @generated
   */
  int LIST_VIEW = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VIEW__ENTRIES = SIMPLE_VIEW_FEATURE_COUNT + 0;

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
  int GRID_VIEW = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The number of structural features of the '<em>Grid View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_VIEW_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl <em>Spinner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SpinnerImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSpinner()
   * @generated
   */
  int SPINNER = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__ENTRIES = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spinner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER_FEATURE_COUNT = SIMPLE_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
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
  int RADIO_GROUP = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_GROUP__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

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
  int RATING_BAR = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_BAR__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Num Stars</b></em>' attribute.
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
  int TOGGLE_BUTTON = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Text On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOGGLE_BUTTON__TEXT_ON = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text Off</b></em>' attribute.
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
  int RADIO_BUTTON = 52;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckedTextViewImpl <em>Checked Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckedTextViewImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckedTextView()
   * @generated
   */
  int CHECKED_TEXT_VIEW = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKED_TEXT_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKED_TEXT_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

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
  int AUTO_COMPLETE_TEXT_VIEW = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__NAME = SIMPLE_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Layout Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__LAYOUT_STYLE = SIMPLE_VIEW__LAYOUT_STYLE;

  /**
   * The feature id for the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__ENTRIES = SIMPLE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_COMPLETE_TEXT_VIEW__IS_MULTI = SIMPLE_VIEW_FEATURE_COUNT + 1;

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
  int ABSTRACT_PREFERENCE = 55;

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
  int PREFERENCE = 56;

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
  int PREFERENCE_SCREEN = 57;

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
  int PREFERENCE_CATEGORY = 58;

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
  int EDIT_TEXT_PREFERENCE = 59;

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
  int LIST_PREFERENCE = 60;

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
  int CHECK_BOX_PREFERENCE = 61;

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
  int RINGTONE_PREFENCE = 62;

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
  int PREFERENCE_ATTRIBUTES = 63;

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
  int DIALOG_PREFERENCE_ATTRIBUTES = 64;

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
  int LIST_PREFERENCE_ATTRIBUTES = 65;

  /**
   * The feature id for the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PREFERENCE_ATTRIBUTES__ENTRIES = 0;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 66;

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
  int ANY_DRAWABLE_PROPERTY_VALUE = 67;

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
  int STRING_PROPERTY_VALUE = 68;

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
  int INTEGER_PROPERTY_VALUE = 69;

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
  int BOOLEAN_PROPERTY_VALUE = 70;

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
  int COLOR_PROPERTY_VALUE = 71;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionPropertyValueImpl <em>Dimension Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionPropertyValueImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionPropertyValue()
   * @generated
   */
  int DIMENSION_PROPERTY_VALUE = 72;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dimension Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceLinkImpl <em>Drawable Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDrawableResourceLink()
   * @generated
   */
  int DRAWABLE_RESOURCE_LINK = 73;

  /**
   * The number of structural features of the '<em>Drawable Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_LINK_FEATURE_COUNT = ANY_DRAWABLE_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LocalDrawableResourceLinkImpl <em>Local Drawable Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LocalDrawableResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLocalDrawableResourceLink()
   * @generated
   */
  int LOCAL_DRAWABLE_RESOURCE_LINK = 74;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DRAWABLE_RESOURCE_LINK__LINK = DRAWABLE_RESOURCE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Drawable Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DRAWABLE_RESOURCE_LINK_FEATURE_COUNT = DRAWABLE_RESOURCE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ExternalDrawableResourceLinkImpl <em>External Drawable Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ExternalDrawableResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getExternalDrawableResourceLink()
   * @generated
   */
  int EXTERNAL_DRAWABLE_RESOURCE_LINK = 75;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE = DRAWABLE_RESOURCE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Drawable Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DRAWABLE_RESOURCE_LINK_FEATURE_COUNT = DRAWABLE_RESOURCE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceLinkImpl <em>String Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceLinkImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringResourceLink()
   * @generated
   */
  int STRING_RESOURCE_LINK = 76;

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
  int INTEGER_RESOURCE_LINK = 77;

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
  int BOOLEAN_RESOURCE_LINK = 78;

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
  int COLOR_RESOURCE_LINK = 79;

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
  int DIMENSION_RESOURCE_LINK = 80;

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
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl <em>Andro Res Model Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroResModelRootImpl
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroResModelRoot()
   * @generated
   */
  int ANDRO_RES_MODEL_ROOT = 81;

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
  int RESOURCE = 82;

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
  int STRING_RESOURCE = 83;

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
  int INTEGER_RESOURCE = 84;

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
  int BOOLEAN_RESOURCE = 85;

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
  int COLOR_RESOURCE = 86;

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
  int DIMENSION_RESOURCE = 87;

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
  int ARRAY_RESOURCE = 88;

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
  int INTEGER_ARRAY_RESOURCE = 89;

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
  int INTEGER_ARRAY_ENTRY = 90;

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
  int STRING_ARRAY_RESOURCE = 91;

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
  int STRING_ARRAY_ENTRY = 92;

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
  int DRAWABLE_RESOURCE = 93;

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
  int BITMAP_DRAWABLE_RESOURCE = 94;

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
  int TRANSITION_DRAWABLE_RESOURCE = 95;

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
  int DIMENSION_VALUE = 96;

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
  int API_LEVEL = 97;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme <em>Activity Theme</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getActivityTheme()
   * @generated
   */
  int ACTIVITY_THEME = 98;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.DataTypes <em>Data Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.DataTypes
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDataTypes()
   * @generated
   */
  int DATA_TYPES = 99;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind <em>Layout Gravity Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutGravityKind()
   * @generated
   */
  int LAYOUT_GRAVITY_KIND = 100;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind <em>Layout Dimension Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutDimensionKind()
   * @generated
   */
  int LAYOUT_DIMENSION_KIND = 101;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource <em>Android Drawable Resource</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroidDrawableResource()
   * @generated
   */
  int ANDROID_DRAWABLE_RESOURCE = 102;

  /**
   * The meta object id for the '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric <em>Dimension Metric</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric
   * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionMetric()
   * @generated
   */
  int DIMENSION_METRIC = 103;


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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity <em>Simple Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity
   * @generated
   */
  EClass getSimpleActivity();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getLayout()
   * @see #getSimpleActivity()
   * @generated
   */
  EReference getSimpleActivity_Layout();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getTheme <em>Theme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Theme</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity#getTheme()
   * @see #getSimpleActivity()
   * @generated
   */
  EAttribute getSimpleActivity_Theme();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity <em>Invoke Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity
   * @generated
   */
  EClass getInvokeActivity();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.InvokeActivity#getActivity()
   * @see #getInvokeActivity()
   * @generated
   */
  EReference getInvokeActivity_Activity();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.InvokeWebUrl <em>Invoke Web Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke Web Url</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.InvokeWebUrl
   * @generated
   */
  EClass getInvokeWebUrl();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.InvokeWebUrl#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.InvokeWebUrl#getUrl()
   * @see #getInvokeWebUrl()
   * @generated
   */
  EAttribute getInvokeWebUrl_Url();

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
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutStyle <em>Layout Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout Style</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.View#getLayoutStyle()
   * @see #getView()
   * @generated
   */
  EAttribute getView_LayoutStyle();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams <em>Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Params</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams
   * @generated
   */
  EClass getLayoutParams();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weight</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getWeight()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_Weight();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginLeft <em>Margin Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Left</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginLeft()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_MarginLeft();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginTop <em>Margin Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Top</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginTop()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_MarginTop();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginRight <em>Margin Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Right</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginRight()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_MarginRight();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginBottom <em>Margin Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin Bottom</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getMarginBottom()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_MarginBottom();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentleft <em>Align Parentleft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parentleft</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentleft()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_AlignParentleft();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentTop <em>Align Parent Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Top</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentTop()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_AlignParentTop();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentRight <em>Align Parent Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Right</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentRight()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_AlignParentRight();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentBottom <em>Align Parent Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Align Parent Bottom</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignParentBottom()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_AlignParentBottom();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignTop <em>Align Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Align Top</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignTop()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_AlignTop();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignBottom <em>Align Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Align Bottom</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignBottom()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_AlignBottom();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignLeft <em>Align Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Align Left</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAlignLeft()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_AlignLeft();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getBelow <em>Below</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Below</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getBelow()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_Below();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAbove <em>Above</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Above</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getAbove()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_Above();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getToLeftOf <em>To Left Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Left Of</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getToLeftOf()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_ToLeftOf();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getToRightOf <em>To Right Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Right Of</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getToRightOf()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_ToRightOf();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getCenterHorizontal <em>Center Horizontal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center Horizontal</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getCenterHorizontal()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_CenterHorizontal();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getCenterInParent <em>Center In Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center In Parent</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getCenterInParent()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_CenterInParent();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getCenterVertical <em>Center Vertical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center Vertical</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getCenterVertical()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_CenterVertical();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getBackgroundAttribute <em>Background Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutParams#getBackgroundAttribute()
   * @see #getLayoutParams()
   * @generated
   */
  EReference getLayoutParams_BackgroundAttribute();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute <em>Layout Gravity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Gravity Attribute</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute
   * @generated
   */
  EClass getLayoutGravityAttribute();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute#getGravity <em>Gravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Gravity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute#getGravity()
   * @see #getLayoutGravityAttribute()
   * @generated
   */
  EAttribute getLayoutGravityAttribute_Gravity();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getLayoutParams <em>Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout Params</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayout#getLayoutParams()
   * @see #getLinearLayout()
   * @generated
   */
  EReference getLinearLayout_LayoutParams();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams <em>Linear Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linear Layout Params</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams
   * @generated
   */
  EClass getLinearLayoutParams();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getLayoutParams <em>Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout Params</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getLayoutParams()
   * @see #getLinearLayoutParams()
   * @generated
   */
  EReference getLinearLayoutParams_LayoutParams();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getGravity <em>Gravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gravity</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams#getGravity()
   * @see #getLinearLayoutParams()
   * @generated
   */
  EReference getLinearLayoutParams_Gravity();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.SimpleView <em>Simple View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.SimpleView
   * @generated
   */
  EClass getSimpleView();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.TextView#getLayoutParams <em>Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout Params</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.TextView#getLayoutParams()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_LayoutParams();

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
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute#getGravity <em>Gravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gravity</em>'.
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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.EditText#getLayoutParams <em>Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout Params</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.EditText#getLayoutParams()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_LayoutParams();

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
   * Returns the meta object for the containment reference '{@link hu.bme.mit.androtext.lang.androTextDsl.Button#getLayoutParams <em>Layout Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout Params</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.Button#getLayoutParams()
   * @see #getButton()
   * @generated
   */
  EReference getButton_LayoutParams();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.GridView <em>Grid View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid View</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.GridView
   * @generated
   */
  EClass getGridView();

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
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entries</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#getEntries()
   * @see #getAutoCompleteTextView()
   * @generated
   */
  EReference getAutoCompleteTextView_Entries();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#isIsMulti <em>Is Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Multi</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView#isIsMulti()
   * @see #getAutoCompleteTextView()
   * @generated
   */
  EAttribute getAutoCompleteTextView_IsMulti();

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
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entries</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes#getEntries()
   * @see #getListPreferenceAttributes()
   * @generated
   */
  EReference getListPreferenceAttributes_Entries();

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
   * Returns the meta object for class '{@link hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink <em>Local Drawable Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Drawable Resource Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink
   * @generated
   */
  EClass getLocalDrawableResourceLink();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink#getLink()
   * @see #getLocalDrawableResourceLink()
   * @generated
   */
  EReference getLocalDrawableResourceLink_Link();

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
   * Returns the meta object for enum '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind <em>Layout Gravity Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Layout Gravity Kind</em>'.
   * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind
   * @generated
   */
  EEnum getLayoutGravityKind();

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
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleActivityImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSimpleActivity()
     * @generated
     */
    EClass SIMPLE_ACTIVITY = eINSTANCE.getSimpleActivity();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_ACTIVITY__LAYOUT = eINSTANCE.getSimpleActivity_Layout();

    /**
     * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_ACTIVITY__THEME = eINSTANCE.getSimpleActivity_Theme();

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
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_ACTIVITY__TABS = eINSTANCE.getTabActivity_Tabs();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TabImpl <em>Tab</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TabImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTab()
     * @generated
     */
    EClass TAB = eINSTANCE.getTab();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB__TAG = eINSTANCE.getTab_Tag();

    /**
     * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__ACTIVITY = eINSTANCE.getTab_Activity();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListActivityImpl <em>List Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListActivityImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListActivity()
     * @generated
     */
    EClass LIST_ACTIVITY = eINSTANCE.getListActivity();

    /**
     * The meta object literal for the '<em><b>Listitem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ACTIVITY__LISTITEM = eINSTANCE.getListActivity_Listitem();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceActivityImpl <em>Preference Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceActivityImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceActivity()
     * @generated
     */
    EClass PREFERENCE_ACTIVITY = eINSTANCE.getPreferenceActivity();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCE_ACTIVITY__LAYOUT = eINSTANCE.getPreferenceActivity_Layout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ActionImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeActivityImpl <em>Invoke Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeActivityImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getInvokeActivity()
     * @generated
     */
    EClass INVOKE_ACTIVITY = eINSTANCE.getInvokeActivity();

    /**
     * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE_ACTIVITY__ACTIVITY = eINSTANCE.getInvokeActivity_Activity();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeWebUrlImpl <em>Invoke Web Url</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.InvokeWebUrlImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getInvokeWebUrl()
     * @generated
     */
    EClass INVOKE_WEB_URL = eINSTANCE.getInvokeWebUrl();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOKE_WEB_URL__URL = eINSTANCE.getInvokeWebUrl_Url();

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
     * The meta object literal for the '<em><b>Roots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDRO_GUI_MODEL_ROOT__ROOTS = eINSTANCE.getAndroGuiModelRoot_Roots();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>Layout Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__LAYOUT_STYLE = eINSTANCE.getView_LayoutStyle();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ViewGroupImpl <em>View Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ViewGroupImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getViewGroup()
     * @generated
     */
    EClass VIEW_GROUP = eINSTANCE.getViewGroup();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_GROUP__VIEWS = eINSTANCE.getViewGroup_Views();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl <em>Layout Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutParamsImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutParams()
     * @generated
     */
    EClass LAYOUT_PARAMS = eINSTANCE.getLayoutParams();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__WEIGHT = eINSTANCE.getLayoutParams_Weight();

    /**
     * The meta object literal for the '<em><b>Margin Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__MARGIN_LEFT = eINSTANCE.getLayoutParams_MarginLeft();

    /**
     * The meta object literal for the '<em><b>Margin Top</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__MARGIN_TOP = eINSTANCE.getLayoutParams_MarginTop();

    /**
     * The meta object literal for the '<em><b>Margin Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__MARGIN_RIGHT = eINSTANCE.getLayoutParams_MarginRight();

    /**
     * The meta object literal for the '<em><b>Margin Bottom</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__MARGIN_BOTTOM = eINSTANCE.getLayoutParams_MarginBottom();

    /**
     * The meta object literal for the '<em><b>Align Parentleft</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ALIGN_PARENTLEFT = eINSTANCE.getLayoutParams_AlignParentleft();

    /**
     * The meta object literal for the '<em><b>Align Parent Top</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ALIGN_PARENT_TOP = eINSTANCE.getLayoutParams_AlignParentTop();

    /**
     * The meta object literal for the '<em><b>Align Parent Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ALIGN_PARENT_RIGHT = eINSTANCE.getLayoutParams_AlignParentRight();

    /**
     * The meta object literal for the '<em><b>Align Parent Bottom</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ALIGN_PARENT_BOTTOM = eINSTANCE.getLayoutParams_AlignParentBottom();

    /**
     * The meta object literal for the '<em><b>Align Top</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ALIGN_TOP = eINSTANCE.getLayoutParams_AlignTop();

    /**
     * The meta object literal for the '<em><b>Align Bottom</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ALIGN_BOTTOM = eINSTANCE.getLayoutParams_AlignBottom();

    /**
     * The meta object literal for the '<em><b>Align Left</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ALIGN_LEFT = eINSTANCE.getLayoutParams_AlignLeft();

    /**
     * The meta object literal for the '<em><b>Below</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__BELOW = eINSTANCE.getLayoutParams_Below();

    /**
     * The meta object literal for the '<em><b>Above</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__ABOVE = eINSTANCE.getLayoutParams_Above();

    /**
     * The meta object literal for the '<em><b>To Left Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__TO_LEFT_OF = eINSTANCE.getLayoutParams_ToLeftOf();

    /**
     * The meta object literal for the '<em><b>To Right Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__TO_RIGHT_OF = eINSTANCE.getLayoutParams_ToRightOf();

    /**
     * The meta object literal for the '<em><b>Center Horizontal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__CENTER_HORIZONTAL = eINSTANCE.getLayoutParams_CenterHorizontal();

    /**
     * The meta object literal for the '<em><b>Center In Parent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__CENTER_IN_PARENT = eINSTANCE.getLayoutParams_CenterInParent();

    /**
     * The meta object literal for the '<em><b>Center Vertical</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__CENTER_VERTICAL = eINSTANCE.getLayoutParams_CenterVertical();

    /**
     * The meta object literal for the '<em><b>Background Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT_PARAMS__BACKGROUND_ATTRIBUTE = eINSTANCE.getLayoutParams_BackgroundAttribute();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutGravityAttributeImpl <em>Layout Gravity Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LayoutGravityAttributeImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutGravityAttribute()
     * @generated
     */
    EClass LAYOUT_GRAVITY_ATTRIBUTE = eINSTANCE.getLayoutGravityAttribute();

    /**
     * The meta object literal for the '<em><b>Gravity</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYOUT_GRAVITY_ATTRIBUTE__GRAVITY = eINSTANCE.getLayoutGravityAttribute_Gravity();

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
     * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINEAR_LAYOUT__VERTICAL = eINSTANCE.getLinearLayout_Vertical();

    /**
     * The meta object literal for the '<em><b>Layout Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_LAYOUT__LAYOUT_PARAMS = eINSTANCE.getLinearLayout_LayoutParams();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutParamsImpl <em>Linear Layout Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LinearLayoutParamsImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLinearLayoutParams()
     * @generated
     */
    EClass LINEAR_LAYOUT_PARAMS = eINSTANCE.getLinearLayoutParams();

    /**
     * The meta object literal for the '<em><b>Layout Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_LAYOUT_PARAMS__LAYOUT_PARAMS = eINSTANCE.getLinearLayoutParams_LayoutParams();

    /**
     * The meta object literal for the '<em><b>Gravity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_LAYOUT_PARAMS__GRAVITY = eINSTANCE.getLinearLayoutParams_Gravity();

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
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GridLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGridLayout()
     * @generated
     */
    EClass GRID_LAYOUT = eINSTANCE.getGridLayout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl <em>Table Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TableLayoutImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTableLayout()
     * @generated
     */
    EClass TABLE_LAYOUT = eINSTANCE.getTableLayout();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleViewImpl <em>Simple View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.SimpleViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getSimpleView()
     * @generated
     */
    EClass SIMPLE_VIEW = eINSTANCE.getSimpleView();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GalleryImpl <em>Gallery</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GalleryImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGallery()
     * @generated
     */
    EClass GALLERY = eINSTANCE.getGallery();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ExpandableListViewImpl <em>Expandable List View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ExpandableListViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getExpandableListView()
     * @generated
     */
    EClass EXPANDABLE_LIST_VIEW = eINSTANCE.getExpandableListView();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.WebViewImpl <em>Web View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.WebViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getWebView()
     * @generated
     */
    EClass WEB_VIEW = eINSTANCE.getWebView();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl <em>Image View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ImageViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getImageView()
     * @generated
     */
    EClass IMAGE_VIEW = eINSTANCE.getImageView();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_VIEW__SRC = eINSTANCE.getImageView_Src();

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
     * The meta object literal for the '<em><b>Gravity Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VIEW__GRAVITY_ATTRIBUTE = eINSTANCE.getTextView_GravityAttribute();

    /**
     * The meta object literal for the '<em><b>Text Size Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VIEW__TEXT_SIZE_ATTRIBUTE = eINSTANCE.getTextView_TextSizeAttribute();

    /**
     * The meta object literal for the '<em><b>Layout Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VIEW__LAYOUT_PARAMS = eINSTANCE.getTextView_LayoutParams();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GravityAttributeImpl <em>Gravity Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GravityAttributeImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGravityAttribute()
     * @generated
     */
    EClass GRAVITY_ATTRIBUTE = eINSTANCE.getGravityAttribute();

    /**
     * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAVITY_ATTRIBUTE__GRAVITY = eINSTANCE.getGravityAttribute_Gravity();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.TextSizeAttributeImpl <em>Text Size Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.TextSizeAttributeImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getTextSizeAttribute()
     * @generated
     */
    EClass TEXT_SIZE_ATTRIBUTE = eINSTANCE.getTextSizeAttribute();

    /**
     * The meta object literal for the '<em><b>Text Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_SIZE_ATTRIBUTE__TEXT_SIZE = eINSTANCE.getTextSizeAttribute_TextSize();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BackgroundAttributeImpl <em>Background Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BackgroundAttributeImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBackgroundAttribute()
     * @generated
     */
    EClass BACKGROUND_ATTRIBUTE = eINSTANCE.getBackgroundAttribute();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKGROUND_ATTRIBUTE__BACKGROUND = eINSTANCE.getBackgroundAttribute_Background();

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
     * The meta object literal for the '<em><b>Gravity Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__GRAVITY_ATTRIBUTE = eINSTANCE.getEditText_GravityAttribute();

    /**
     * The meta object literal for the '<em><b>Text Size Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__TEXT_SIZE_ATTRIBUTE = eINSTANCE.getEditText_TextSizeAttribute();

    /**
     * The meta object literal for the '<em><b>Layout Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__LAYOUT_PARAMS = eINSTANCE.getEditText_LayoutParams();

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
     * The meta object literal for the '<em><b>Layout Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__LAYOUT_PARAMS = eINSTANCE.getButton_LayoutParams();

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
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl <em>Grid View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.GridViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getGridView()
     * @generated
     */
    EClass GRID_VIEW = eINSTANCE.getGridView();

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
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckedTextViewImpl <em>Checked Text View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckedTextViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckedTextView()
     * @generated
     */
    EClass CHECKED_TEXT_VIEW = eINSTANCE.getCheckedTextView();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKED_TEXT_VIEW__TEXT = eINSTANCE.getCheckedTextView_Text();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl <em>Auto Complete Text View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AutoCompleteTextViewImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAutoCompleteTextView()
     * @generated
     */
    EClass AUTO_COMPLETE_TEXT_VIEW = eINSTANCE.getAutoCompleteTextView();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTO_COMPLETE_TEXT_VIEW__ENTRIES = eINSTANCE.getAutoCompleteTextView_Entries();

    /**
     * The meta object literal for the '<em><b>Is Multi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTO_COMPLETE_TEXT_VIEW__IS_MULTI = eINSTANCE.getAutoCompleteTextView_IsMulti();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AbstractPreferenceImpl <em>Abstract Preference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AbstractPreferenceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAbstractPreference()
     * @generated
     */
    EClass ABSTRACT_PREFERENCE = eINSTANCE.getAbstractPreference();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_PREFERENCE__TITLE = eINSTANCE.getAbstractPreference_Title();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceImpl <em>Preference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreference()
     * @generated
     */
    EClass PREFERENCE = eINSTANCE.getPreference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE__NAME = eINSTANCE.getPreference_Name();

    /**
     * The meta object literal for the '<em><b>Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCE__PREFERENCE_ATTRIBUTES = eINSTANCE.getPreference_PreferenceAttributes();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE_SCREEN__NAME = eINSTANCE.getPreferenceScreen_Name();

    /**
     * The meta object literal for the '<em><b>Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCE_SCREEN__PREFERENCE_ATTRIBUTES = eINSTANCE.getPreferenceScreen_PreferenceAttributes();

    /**
     * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCE_SCREEN__PREFERENCES = eINSTANCE.getPreferenceScreen_Preferences();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceCategoryImpl <em>Preference Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceCategoryImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceCategory()
     * @generated
     */
    EClass PREFERENCE_CATEGORY = eINSTANCE.getPreferenceCategory();

    /**
     * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCE_CATEGORY__PREFERENCES = eINSTANCE.getPreferenceCategory_Preferences();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextPreferenceImpl <em>Edit Text Preference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.EditTextPreferenceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getEditTextPreference()
     * @generated
     */
    EClass EDIT_TEXT_PREFERENCE = eINSTANCE.getEditTextPreference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDIT_TEXT_PREFERENCE__NAME = eINSTANCE.getEditTextPreference_Name();

    /**
     * The meta object literal for the '<em><b>Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES = eINSTANCE.getEditTextPreference_PreferenceAttributes();

    /**
     * The meta object literal for the '<em><b>Dialog Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES = eINSTANCE.getEditTextPreference_DialogPreferenceAttributes();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceImpl <em>List Preference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListPreference()
     * @generated
     */
    EClass LIST_PREFERENCE = eINSTANCE.getListPreference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_PREFERENCE__NAME = eINSTANCE.getListPreference_Name();

    /**
     * The meta object literal for the '<em><b>Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PREFERENCE__PREFERENCE_ATTRIBUTES = eINSTANCE.getListPreference_PreferenceAttributes();

    /**
     * The meta object literal for the '<em><b>Dialog Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES = eINSTANCE.getListPreference_DialogPreferenceAttributes();

    /**
     * The meta object literal for the '<em><b>List Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES = eINSTANCE.getListPreference_ListPreferenceAttributes();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxPreferenceImpl <em>Check Box Preference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.CheckBoxPreferenceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getCheckBoxPreference()
     * @generated
     */
    EClass CHECK_BOX_PREFERENCE = eINSTANCE.getCheckBoxPreference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_BOX_PREFERENCE__NAME = eINSTANCE.getCheckBoxPreference_Name();

    /**
     * The meta object literal for the '<em><b>Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_BOX_PREFERENCE__PREFERENCE_ATTRIBUTES = eINSTANCE.getCheckBoxPreference_PreferenceAttributes();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.RingtonePrefenceImpl <em>Ringtone Prefence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.RingtonePrefenceImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getRingtonePrefence()
     * @generated
     */
    EClass RINGTONE_PREFENCE = eINSTANCE.getRingtonePrefence();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RINGTONE_PREFENCE__NAME = eINSTANCE.getRingtonePrefence_Name();

    /**
     * The meta object literal for the '<em><b>Preference Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES = eINSTANCE.getRingtonePrefence_PreferenceAttributes();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceAttributesImpl <em>Preference Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PreferenceAttributesImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPreferenceAttributes()
     * @generated
     */
    EClass PREFERENCE_ATTRIBUTES = eINSTANCE.getPreferenceAttributes();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE_ATTRIBUTES__SUMMARY = eINSTANCE.getPreferenceAttributes_Summary();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE_ATTRIBUTES__ENABLED = eINSTANCE.getPreferenceAttributes_Enabled();

    /**
     * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE_ATTRIBUTES__PERSISTENT = eINSTANCE.getPreferenceAttributes_Persistent();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DialogPreferenceAttributesImpl <em>Dialog Preference Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DialogPreferenceAttributesImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDialogPreferenceAttributes()
     * @generated
     */
    EClass DIALOG_PREFERENCE_ATTRIBUTES = eINSTANCE.getDialogPreferenceAttributes();

    /**
     * The meta object literal for the '<em><b>Dialog Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIALOG_PREFERENCE_ATTRIBUTES__DIALOG_TITLE = eINSTANCE.getDialogPreferenceAttributes_DialogTitle();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIALOG_PREFERENCE_ATTRIBUTES__DEFAULT_VALUE = eINSTANCE.getDialogPreferenceAttributes_DefaultValue();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl <em>List Preference Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ListPreferenceAttributesImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getListPreferenceAttributes()
     * @generated
     */
    EClass LIST_PREFERENCE_ATTRIBUTES = eINSTANCE.getListPreferenceAttributes();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PREFERENCE_ATTRIBUTES__ENTRIES = eINSTANCE.getListPreferenceAttributes_Entries();

    /**
     * The meta object literal for the '<em><b>Entry Values</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES = eINSTANCE.getListPreferenceAttributes_EntryValues();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.PropertyValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getPropertyValue()
     * @generated
     */
    EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.AnyDrawablePropertyValueImpl <em>Any Drawable Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AnyDrawablePropertyValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAnyDrawablePropertyValue()
     * @generated
     */
    EClass ANY_DRAWABLE_PROPERTY_VALUE = eINSTANCE.getAnyDrawablePropertyValue();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringPropertyValueImpl <em>String Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringPropertyValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringPropertyValue()
     * @generated
     */
    EClass STRING_PROPERTY_VALUE = eINSTANCE.getStringPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_PROPERTY_VALUE__VALUE = eINSTANCE.getStringPropertyValue_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerPropertyValueImpl <em>Integer Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerPropertyValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerPropertyValue()
     * @generated
     */
    EClass INTEGER_PROPERTY_VALUE = eINSTANCE.getIntegerPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_PROPERTY_VALUE__VALUE = eINSTANCE.getIntegerPropertyValue_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanPropertyValueImpl <em>Boolean Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanPropertyValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBooleanPropertyValue()
     * @generated
     */
    EClass BOOLEAN_PROPERTY_VALUE = eINSTANCE.getBooleanPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_PROPERTY_VALUE__VALUE = eINSTANCE.getBooleanPropertyValue_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorPropertyValueImpl <em>Color Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColorPropertyValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColorPropertyValue()
     * @generated
     */
    EClass COLOR_PROPERTY_VALUE = eINSTANCE.getColorPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_PROPERTY_VALUE__VALUE = eINSTANCE.getColorPropertyValue_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionPropertyValueImpl <em>Dimension Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionPropertyValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionPropertyValue()
     * @generated
     */
    EClass DIMENSION_PROPERTY_VALUE = eINSTANCE.getDimensionPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSION_PROPERTY_VALUE__VALUE = eINSTANCE.getDimensionPropertyValue_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceLinkImpl <em>Drawable Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DrawableResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDrawableResourceLink()
     * @generated
     */
    EClass DRAWABLE_RESOURCE_LINK = eINSTANCE.getDrawableResourceLink();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.LocalDrawableResourceLinkImpl <em>Local Drawable Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.LocalDrawableResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLocalDrawableResourceLink()
     * @generated
     */
    EClass LOCAL_DRAWABLE_RESOURCE_LINK = eINSTANCE.getLocalDrawableResourceLink();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DRAWABLE_RESOURCE_LINK__LINK = eINSTANCE.getLocalDrawableResourceLink_Link();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ExternalDrawableResourceLinkImpl <em>External Drawable Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ExternalDrawableResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getExternalDrawableResourceLink()
     * @generated
     */
    EClass EXTERNAL_DRAWABLE_RESOURCE_LINK = eINSTANCE.getExternalDrawableResourceLink();

    /**
     * The meta object literal for the '<em><b>External Resource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE = eINSTANCE.getExternalDrawableResourceLink_ExternalResource();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceLinkImpl <em>String Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.StringResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getStringResourceLink()
     * @generated
     */
    EClass STRING_RESOURCE_LINK = eINSTANCE.getStringResourceLink();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_RESOURCE_LINK__LINK = eINSTANCE.getStringResourceLink_Link();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceLinkImpl <em>Integer Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.IntegerResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getIntegerResourceLink()
     * @generated
     */
    EClass INTEGER_RESOURCE_LINK = eINSTANCE.getIntegerResourceLink();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_RESOURCE_LINK__LINK = eINSTANCE.getIntegerResourceLink_Link();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceLinkImpl <em>Boolean Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.BooleanResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getBooleanResourceLink()
     * @generated
     */
    EClass BOOLEAN_RESOURCE_LINK = eINSTANCE.getBooleanResourceLink();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_RESOURCE_LINK__LINK = eINSTANCE.getBooleanResourceLink_Link();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceLinkImpl <em>Color Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.ColorResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getColorResourceLink()
     * @generated
     */
    EClass COLOR_RESOURCE_LINK = eINSTANCE.getColorResourceLink();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_RESOURCE_LINK__LINK = eINSTANCE.getColorResourceLink_Link();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceLinkImpl <em>Dimension Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionResourceLinkImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionResourceLink()
     * @generated
     */
    EClass DIMENSION_RESOURCE_LINK = eINSTANCE.getDimensionResourceLink();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSION_RESOURCE_LINK__LINK = eINSTANCE.getDimensionResourceLink_Link();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSION_RESOURCE__VALUE = eINSTANCE.getDimensionResource_Value();

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
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionValueImpl <em>Dimension Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.DimensionValueImpl
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionValue()
     * @generated
     */
    EClass DIMENSION_VALUE = eINSTANCE.getDimensionValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION_VALUE__VALUE = eINSTANCE.getDimensionValue_Value();

    /**
     * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION_VALUE__METRIC = eINSTANCE.getDimensionValue_Metric();

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
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme <em>Activity Theme</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.ActivityTheme
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getActivityTheme()
     * @generated
     */
    EEnum ACTIVITY_THEME = eINSTANCE.getActivityTheme();

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
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind <em>Layout Gravity Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityKind
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutGravityKind()
     * @generated
     */
    EEnum LAYOUT_GRAVITY_KIND = eINSTANCE.getLayoutGravityKind();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind <em>Layout Dimension Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionKind
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getLayoutDimensionKind()
     * @generated
     */
    EEnum LAYOUT_DIMENSION_KIND = eINSTANCE.getLayoutDimensionKind();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource <em>Android Drawable Resource</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.AndroidDrawableResource
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getAndroidDrawableResource()
     * @generated
     */
    EEnum ANDROID_DRAWABLE_RESOURCE = eINSTANCE.getAndroidDrawableResource();

    /**
     * The meta object literal for the '{@link hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric <em>Dimension Metric</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.androtext.lang.androTextDsl.DimensionMetric
     * @see hu.bme.mit.androtext.lang.androTextDsl.impl.AndroTextDslPackageImpl#getDimensionMetric()
     * @generated
     */
    EEnum DIMENSION_METRIC = eINSTANCE.getDimensionMetric();

  }

} //AndroTextDslPackage
