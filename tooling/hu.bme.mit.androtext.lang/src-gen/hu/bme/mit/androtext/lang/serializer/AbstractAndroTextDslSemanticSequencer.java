package hu.bme.mit.androtext.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.CheckBox;
import hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResource;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.FrameLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Import;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResource;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.Preference;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.RadioButton;
import hu.bme.mit.androtext.lang.androTextDsl.RadioGroup;
import hu.bme.mit.androtext.lang.androTextDsl.RatingBar;
import hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout;
import hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence;
import hu.bme.mit.androtext.lang.androTextDsl.Spinner;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.StringResource;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;
import hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource;
import hu.bme.mit.androtext.lang.services.AndroTextDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractAndroTextDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected AndroTextDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AndroTextDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AndroTextDslPackage.ABSOLUTE_LAYOUT:
				if(context == grammarAccess.getAbsoluteLayoutRule() ||
				   context == grammarAccess.getBaseLayoutRule() ||
				   context == grammarAccess.getLayoutRule() ||
				   context == grammarAccess.getRootLayoutRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_AbsoluteLayout(context, (AbsoluteLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getAndroidApplicationModelElementRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ANDRO_DATA_MODEL_ROOT:
				if(context == grammarAccess.getAndroDataModelRootRule() ||
				   context == grammarAccess.getModelRootRule()) {
					sequence_AndroDataModelRoot(context, (AndroDataModelRoot) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ANDRO_GEN_MODEL_ROOT:
				if(context == grammarAccess.getAndroGenModelRootRule() ||
				   context == grammarAccess.getModelRootRule()) {
					sequence_AndroGenModelRoot(context, (AndroGenModelRoot) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ANDRO_GUI_MODEL_ROOT:
				if(context == grammarAccess.getAndroGuiModelRootRule() ||
				   context == grammarAccess.getModelRootRule()) {
					sequence_AndroGuiModelRoot(context, (AndroGuiModelRoot) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ANDRO_RES_MODEL_ROOT:
				if(context == grammarAccess.getAndroResModelRootRule() ||
				   context == grammarAccess.getModelRootRule()) {
					sequence_AndroResModelRoot(context, (AndroResModelRoot) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ANDRO_TEXT_MODEL_ROOT:
				if(context == grammarAccess.getAndroTextModelRootRule()) {
					sequence_AndroTextModelRoot(context, (AndroTextModelRoot) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ANDROID_APPLICATION:
				if(context == grammarAccess.getAndroidApplicationRule() ||
				   context == grammarAccess.getModelRootRule()) {
					sequence_AndroidApplication(context, (AndroidApplication) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.BITMAP_DRAWABLE_RESOURCE:
				if(context == grammarAccess.getBitmapDrawableResourceRule() ||
				   context == grammarAccess.getDrawableResourceRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_BitmapDrawableResource(context, (BitmapDrawableResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.BOOLEAN_RESOURCE:
				if(context == grammarAccess.getBooleanResourceRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_BooleanResource(context, (BooleanResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.BUTTON:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.CHECK_BOX:
				if(context == grammarAccess.getCheckBoxRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_CheckBox(context, (CheckBox) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.CHECK_BOX_PREFERENCE:
				if(context == grammarAccess.getAbstractPreferenceRule() ||
				   context == grammarAccess.getCheckBoxPreferenceRule()) {
					sequence_CheckBoxPreference(context, (CheckBoxPreference) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.COLOR_RESOURCE:
				if(context == grammarAccess.getColorResourceRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_ColorResource(context, (ColorResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.DATA_TYPES_REF:
				if(context == grammarAccess.getDataTypesRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_DataTypesRef(context, (DataTypesRef) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.DIALOG_PREFERENCE_ATTRIBUTES:
				if(context == grammarAccess.getDialogPreferenceAttributesRule()) {
					sequence_DialogPreferenceAttributes(context, (DialogPreferenceAttributes) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.DIMENSION_RESOURCE:
				if(context == grammarAccess.getDimensionResourceRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_DimensionResource(context, (DimensionResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.EDIT_TEXT:
				if(context == grammarAccess.getEditTextRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_EditText(context, (EditText) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.EDIT_TEXT_PREFERENCE:
				if(context == grammarAccess.getAbstractPreferenceRule() ||
				   context == grammarAccess.getEditTextPreferenceRule()) {
					sequence_EditTextPreference(context, (EditTextPreference) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ENTITY_TYPE_REF:
				if(context == grammarAccess.getEntityTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_EntityTypeRef(context, (EntityTypeRef) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.FRAME_LAYOUT:
				if(context == grammarAccess.getBaseLayoutRule() ||
				   context == grammarAccess.getFrameLayoutRule() ||
				   context == grammarAccess.getLayoutRule() ||
				   context == grammarAccess.getRootLayoutRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_FrameLayout(context, (FrameLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.INTEGER_ARRAY_ENTRY:
				if(context == grammarAccess.getIntegerArrayEntryRule()) {
					sequence_IntegerArrayEntry(context, (IntegerArrayEntry) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.INTEGER_ARRAY_RESOURCE:
				if(context == grammarAccess.getArrayResourceRule() ||
				   context == grammarAccess.getIntegerArrayResourceRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_IntegerArrayResource(context, (IntegerArrayResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.INTEGER_RESOURCE:
				if(context == grammarAccess.getIntegerResourceRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_IntegerResource(context, (IntegerResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LINEAR_LAYOUT:
				if(context == grammarAccess.getBaseLayoutRule() ||
				   context == grammarAccess.getLayoutRule() ||
				   context == grammarAccess.getLinearLayoutRule() ||
				   context == grammarAccess.getRootLayoutRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_LinearLayout(context, (LinearLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LIST_PREFERENCE:
				if(context == grammarAccess.getAbstractPreferenceRule() ||
				   context == grammarAccess.getListPreferenceRule()) {
					sequence_ListPreference(context, (ListPreference) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LIST_PREFERENCE_ATTRIBUTES:
				if(context == grammarAccess.getListPreferenceAttributesRule()) {
					sequence_ListPreferenceAttributes(context, (ListPreferenceAttributes) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LIST_VIEW:
				if(context == grammarAccess.getListViewRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_ListView(context, (ListView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PREFERENCE:
				if(context == grammarAccess.getAbstractPreferenceRule() ||
				   context == grammarAccess.getPreferenceRule()) {
					sequence_Preference(context, (Preference) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PREFERENCE_ATTRIBUTES:
				if(context == grammarAccess.getPreferenceAttributesRule()) {
					sequence_PreferenceAttributes(context, (PreferenceAttributes) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PREFERENCE_CATEGORY:
				if(context == grammarAccess.getAbstractPreferenceRule() ||
				   context == grammarAccess.getPreferenceCategoryRule()) {
					sequence_PreferenceCategory(context, (PreferenceCategory) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PREFERENCE_SCREEN:
				if(context == grammarAccess.getAbstractPreferenceRule() ||
				   context == grammarAccess.getLayoutRule() ||
				   context == grammarAccess.getPreferenceScreenRule() ||
				   context == grammarAccess.getRootLayoutRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_PreferenceScreen(context, (PreferenceScreen) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RADIO_BUTTON:
				if(context == grammarAccess.getRadioButtonRule()) {
					sequence_RadioButton(context, (RadioButton) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RADIO_GROUP:
				if(context == grammarAccess.getRadioGroupRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_RadioGroup(context, (RadioGroup) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RATING_BAR:
				if(context == grammarAccess.getRatingBarRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_RatingBar(context, (RatingBar) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RELATIVE_LAYOUT:
				if(context == grammarAccess.getBaseLayoutRule() ||
				   context == grammarAccess.getLayoutRule() ||
				   context == grammarAccess.getRelativeLayoutRule() ||
				   context == grammarAccess.getRootLayoutRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_RelativeLayout(context, (RelativeLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RINGTONE_PREFENCE:
				if(context == grammarAccess.getAbstractPreferenceRule() ||
				   context == grammarAccess.getRingtonePrefenceRule()) {
					sequence_RingtonePrefence(context, (RingtonePrefence) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.SPINNER:
				if(context == grammarAccess.getSpinnerRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_Spinner(context, (Spinner) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.STRING_ARRAY_ENTRY:
				if(context == grammarAccess.getStringArrayEntryRule()) {
					sequence_StringArrayEntry(context, (StringArrayEntry) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.STRING_ARRAY_RESOURCE:
				if(context == grammarAccess.getArrayResourceRule() ||
				   context == grammarAccess.getResourceRule() ||
				   context == grammarAccess.getStringArrayResourceRule()) {
					sequence_StringArrayResource(context, (StringArrayResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.STRING_RESOURCE:
				if(context == grammarAccess.getResourceRule() ||
				   context == grammarAccess.getStringResourceRule()) {
					sequence_StringResource(context, (StringResource) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TAB_ACTIVITY:
				if(context == grammarAccess.getAndroidApplicationModelElementRule() ||
				   context == grammarAccess.getTabActivityRule()) {
					sequence_TabActivity(context, (TabActivity) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TARGET_APPLICATION:
				if(context == grammarAccess.getTargetApplicationRule()) {
					sequence_TargetApplication(context, (TargetApplication) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TEXT_VIEW:
				if(context == grammarAccess.getTextViewRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_TextView(context, (TextView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TOGGLE_BUTTON:
				if(context == grammarAccess.getToggleButtonRule() ||
				   context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_ToggleButton(context, (ToggleButton) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TRANSITION_DRAWABLE_RESOURCE:
				if(context == grammarAccess.getDrawableResourceRule() ||
				   context == grammarAccess.getResourceRule() ||
				   context == grammarAccess.getTransitionDrawableResourceRule()) {
					sequence_TransitionDrawableResource(context, (TransitionDrawableResource) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle elements+=UIElement*)
	 */
	protected void sequence_AbsoluteLayout(EObject context, AbsoluteLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layout=[RootLayout|QualifiedName])
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ACTIVITY__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ACTIVITY__LAYOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActivityAccess().getLayoutRootLayoutQualifiedNameParserRuleCall_3_0_1(), semanticObject.getLayout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entities+=Entity*)
	 */
	protected void sequence_AndroDataModelRoot(EObject context, AndroDataModelRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID targetApplications+=TargetApplication*)
	 */
	protected void sequence_AndroGenModelRoot(EObject context, AndroGenModelRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rootLayout+=RootLayout*)
	 */
	protected void sequence_AndroGuiModelRoot(EObject context, AndroGuiModelRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID resources+=Resource*)
	 */
	protected void sequence_AndroResModelRoot(EObject context, AndroResModelRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName? imports+=Import* actualModelRoot=ModelRoot)
	 */
	protected void sequence_AndroTextModelRoot(EObject context, AndroTextModelRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dataroot=[AndroDataModelRoot|QualifiedName]? mainActivity=Activity modelElements+=AndroidApplicationModelElement*)
	 */
	protected void sequence_AndroidApplication(EObject context, AndroidApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID filename=ID)
	 */
	protected void sequence_BitmapDrawableResource(EObject context, BitmapDrawableResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.BITMAP_DRAWABLE_RESOURCE__FILENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.BITMAP_DRAWABLE_RESOURCE__FILENAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBitmapDrawableResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBitmapDrawableResourceAccess().getFilenameIDTerminalRuleCall_2_0(), semanticObject.getFilename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=BOOL)
	 */
	protected void sequence_BooleanResource(EObject context, BooleanResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.BOOLEAN_RESOURCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.BOOLEAN_RESOURCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBooleanResourceAccess().getValueBOOLParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.BUTTON__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.BUTTON__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING preferenceAttributes=PreferenceAttributes)
	 */
	protected void sequence_CheckBoxPreference(EObject context, CheckBoxPreference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX_PREFERENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX_PREFERENCE__PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckBoxPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getCheckBoxPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0(), semanticObject.getPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_CheckBox(EObject context, CheckBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCheckBoxAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getCheckBoxAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=HEX_COLOR)
	 */
	protected void sequence_ColorResource(EObject context, ColorResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.COLOR_RESOURCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.COLOR_RESOURCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColorResourceAccess().getValueHEX_COLORTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=DataTypes
	 */
	protected void sequence_DataTypesRef(EObject context, DataTypesRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.DATA_TYPES_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.DATA_TYPES_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypesRefAccess().getTypeDataTypesEnumRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dialogTitle=STRING? defaultValue=STRING?)
	 */
	protected void sequence_DialogPreferenceAttributes(EObject context, DialogPreferenceAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=DimensionValue)
	 */
	protected void sequence_DimensionResource(EObject context, DimensionResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.DIMENSION_RESOURCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.DIMENSION_RESOURCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDimensionResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDimensionResourceAccess().getValueDimensionValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING preferenceAttributes=PreferenceAttributes dialogPreferenceAttributes=DialogPreferenceAttributes)
	 */
	protected void sequence_EditTextPreference(EObject context, EditTextPreference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEditTextPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getEditTextPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0(), semanticObject.getPreferenceAttributes());
		feeder.accept(grammarAccess.getEditTextPreferenceAccess().getDialogPreferenceAttributesDialogPreferenceAttributesParserRuleCall_4_0(), semanticObject.getDialogPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_EditText(EObject context, EditText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEditTextAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getEditTextAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Entity|QualifiedName]
	 */
	protected void sequence_EntityTypeRef(EObject context, EntityTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ENTITY_TYPE_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ENTITY_TYPE_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityTypeRefAccess().getTypeEntityQualifiedNameParserRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[Entity|ID]? properties+=Property*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle elements+=UIElement*)
	 */
	protected void sequence_FrameLayout(EObject context, FrameLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? value=INT)
	 */
	protected void sequence_IntegerArrayEntry(EObject context, IntegerArrayEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entries+=IntegerArrayEntry entries+=IntegerArrayEntry*)
	 */
	protected void sequence_IntegerArrayResource(EObject context, IntegerArrayResource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=INT)
	 */
	protected void sequence_IntegerResource(EObject context, IntegerResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.INTEGER_RESOURCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.INTEGER_RESOURCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIntegerResourceAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID orientation?='horizontal'? layoutStyle=LayoutStyle elements+=UIElement*)
	 */
	protected void sequence_LinearLayout(EObject context, LinearLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entries=[StringArrayEntry|QualifiedName] entryValues=[StringArrayEntry|QualifiedName])
	 */
	protected void sequence_ListPreferenceAttributes(EObject context, ListPreferenceAttributes semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE_ATTRIBUTES__ENTRIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE_ATTRIBUTES__ENTRIES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE_ATTRIBUTES__ENTRY_VALUES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListPreferenceAttributesAccess().getEntriesStringArrayEntryQualifiedNameParserRuleCall_1_0_1(), semanticObject.getEntries());
		feeder.accept(grammarAccess.getListPreferenceAttributesAccess().getEntryValuesStringArrayEntryQualifiedNameParserRuleCall_3_0_1(), semanticObject.getEntryValues());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=STRING 
	 *         preferenceAttributes=PreferenceAttributes 
	 *         dialogPreferenceAttributes=DialogPreferenceAttributes 
	 *         listPreferenceAttributes=ListPreferenceAttributes
	 *     )
	 */
	protected void sequence_ListPreference(EObject context, ListPreference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getListPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0(), semanticObject.getPreferenceAttributes());
		feeder.accept(grammarAccess.getListPreferenceAccess().getDialogPreferenceAttributesDialogPreferenceAttributesParserRuleCall_4_0(), semanticObject.getDialogPreferenceAttributes());
		feeder.accept(grammarAccess.getListPreferenceAccess().getListPreferenceAttributesListPreferenceAttributesParserRuleCall_5_0(), semanticObject.getListPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle entries=[ArrayResource|QualifiedName]? layout=[Layout|QualifiedName]?)
	 */
	protected void sequence_ListView(EObject context, ListView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID summary=STRING? enabled=BOOL? persistent=BOOL?)
	 */
	protected void sequence_PreferenceAttributes(EObject context, PreferenceAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING preferences+=AbstractPreference*)
	 */
	protected void sequence_PreferenceCategory(EObject context, PreferenceCategory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING preferenceAttributes=PreferenceAttributes preferences+=AbstractPreference*)
	 */
	protected void sequence_PreferenceScreen(EObject context, PreferenceScreen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING preferenceAttributes=PreferenceAttributes)
	 */
	protected void sequence_Preference(EObject context, Preference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.PREFERENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.PREFERENCE__PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0(), semanticObject.getPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.PROPERTY__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_RadioButton(EObject context, RadioButton semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RADIO_BUTTON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RADIO_BUTTON__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RADIO_BUTTON__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RADIO_BUTTON__TEXT));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RADIO_BUTTON__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RADIO_BUTTON__LAYOUT_STYLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRadioButtonAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getRadioButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID orientation?='horizontal'? layoutStyle=LayoutStyle radiobuttons+=RadioButton+)
	 */
	protected void sequence_RadioGroup(EObject context, RadioGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID numStars=INT layoutStyle=LayoutStyle)
	 */
	protected void sequence_RatingBar(EObject context, RatingBar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RATING_BAR__NUM_STARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RATING_BAR__NUM_STARS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRatingBarAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRatingBarAccess().getNumStarsINTTerminalRuleCall_2_0(), semanticObject.getNumStars());
		feeder.accept(grammarAccess.getRatingBarAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle elements+=UIElement*)
	 */
	protected void sequence_RelativeLayout(EObject context, RelativeLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING preferenceAttributes=PreferenceAttributes)
	 */
	protected void sequence_RingtonePrefence(EObject context, RingtonePrefence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRingtonePrefenceAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getRingtonePrefenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0(), semanticObject.getPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entries=[Resource|QualifiedName]? layoutStyle=LayoutStyle)
	 */
	protected void sequence_Spinner(EObject context, Spinner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? value=STRING)
	 */
	protected void sequence_StringArrayEntry(EObject context, StringArrayEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entries+=StringArrayEntry entries+=StringArrayEntry*)
	 */
	protected void sequence_StringArrayResource(EObject context, StringArrayResource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_StringResource(EObject context, StringResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.STRING_RESOURCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.STRING_RESOURCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStringResourceAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TabActivity(EObject context, TabActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTabActivityAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (application=[AndroidApplication|QualifiedName] projectName=QualifiedName packageName=AndroidPackageName? target=ApiLevel version=VersionCode)
	 */
	protected void sequence_TargetApplication(EObject context, TargetApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_TextView(EObject context, TextView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TEXT_VIEW__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TEXT_VIEW__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextViewAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getTextViewAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID textOn=STRING textOff=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_ToggleButton(EObject context, ToggleButton semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.WIDGET__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TOGGLE_BUTTON__TEXT_ON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TOGGLE_BUTTON__TEXT_ON));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TOGGLE_BUTTON__TEXT_OFF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TOGGLE_BUTTON__TEXT_OFF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToggleButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getToggleButtonAccess().getTextOnSTRINGTerminalRuleCall_3_0(), semanticObject.getTextOn());
		feeder.accept(grammarAccess.getToggleButtonAccess().getTextOffSTRINGTerminalRuleCall_5_0(), semanticObject.getTextOff());
		feeder.accept(grammarAccess.getToggleButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_6_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID from=[BitmapDrawableResource|ID] to=[BitmapDrawableResource|ID])
	 */
	protected void sequence_TransitionDrawableResource(EObject context, TransitionDrawableResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TRANSITION_DRAWABLE_RESOURCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TRANSITION_DRAWABLE_RESOURCE__FROM));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TRANSITION_DRAWABLE_RESOURCE__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TRANSITION_DRAWABLE_RESOURCE__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionDrawableResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionDrawableResourceAccess().getFromBitmapDrawableResourceIDTerminalRuleCall_1_0_1(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getTransitionDrawableResourceAccess().getToBitmapDrawableResourceIDTerminalRuleCall_3_0_1(), semanticObject.getTo());
		feeder.finish();
	}
}
