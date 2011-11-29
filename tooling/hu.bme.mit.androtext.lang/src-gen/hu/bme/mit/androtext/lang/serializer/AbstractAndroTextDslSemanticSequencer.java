package hu.bme.mit.androtext.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
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
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionValue;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.ExpandableListView;
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle;
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
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutGravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutParams;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayoutParams;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.LocalDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.Preference;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceActivity;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory;
import hu.bme.mit.androtext.lang.androTextDsl.PreferenceScreen;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.RadioButton;
import hu.bme.mit.androtext.lang.androTextDsl.RadioGroup;
import hu.bme.mit.androtext.lang.androTextDsl.RatingBar;
import hu.bme.mit.androtext.lang.androTextDsl.RegularLayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.RelativeLayout;
import hu.bme.mit.androtext.lang.androTextDsl.ResourceContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.RingtonePrefence;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Spinner;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.StringArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.StringPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.StringResource;
import hu.bme.mit.androtext.lang.androTextDsl.StringResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.Tab;
import hu.bme.mit.androtext.lang.androTextDsl.TabActivity;
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout;
import hu.bme.mit.androtext.lang.androTextDsl.TableRow;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;
import hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement;
import hu.bme.mit.androtext.lang.androTextDsl.WebView;
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
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
					sequence_AbsoluteLayout(context, (AbsoluteLayout) semanticObject); 
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
			case AndroTextDslPackage.AUTO_COMPLETE_TEXT_VIEW:
				if(context == grammarAccess.getAutoCompleteTextViewRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_AutoCompleteTextView(context, (AutoCompleteTextView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.BACKGROUND_ATTRIBUTE:
				if(context == grammarAccess.getBackgroundAttributeRule()) {
					sequence_BackgroundAttribute(context, (BackgroundAttribute) semanticObject); 
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
			case AndroTextDslPackage.BOOLEAN_PROPERTY_VALUE:
				if(context == grammarAccess.getBooleanPropertyValueRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_BooleanPropertyValue(context, (BooleanPropertyValue) semanticObject); 
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
			case AndroTextDslPackage.BOOLEAN_RESOURCE_LINK:
				if(context == grammarAccess.getBooleanPropertyValueRule() ||
				   context == grammarAccess.getBooleanResourceLinkRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_BooleanResourceLink(context, (BooleanResourceLink) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.BUTTON:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.CHECK_BOX:
				if(context == grammarAccess.getCheckBoxRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
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
			case AndroTextDslPackage.CHECKED_TEXT_VIEW:
				if(context == grammarAccess.getCheckedTextViewRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_CheckedTextView(context, (CheckedTextView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.COLOR_PROPERTY_VALUE:
				if(context == grammarAccess.getAnyDrawablePropertyValueRule() ||
				   context == grammarAccess.getColorPropertyValueRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_ColorPropertyValue(context, (ColorPropertyValue) semanticObject); 
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
			case AndroTextDslPackage.COLOR_RESOURCE_LINK:
				if(context == grammarAccess.getAnyDrawablePropertyValueRule() ||
				   context == grammarAccess.getColorPropertyValueRule() ||
				   context == grammarAccess.getColorResourceLinkRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_ColorResourceLink(context, (ColorResourceLink) semanticObject); 
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
			case AndroTextDslPackage.DIMENSION_PROPERTY_VALUE:
				if(context == grammarAccess.getDimensionPropertyValueRule() ||
				   context == grammarAccess.getLayoutDimensionPropertyValueRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_DimensionPropertyValue(context, (DimensionPropertyValue) semanticObject); 
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
			case AndroTextDslPackage.DIMENSION_RESOURCE_LINK:
				if(context == grammarAccess.getDimensionPropertyValueRule() ||
				   context == grammarAccess.getDimensionResourceLinkRule() ||
				   context == grammarAccess.getLayoutDimensionPropertyValueRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_DimensionResourceLink(context, (DimensionResourceLink) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.DIMENSION_VALUE:
				if(context == grammarAccess.getDimensionValueRule()) {
					sequence_DimensionValue(context, (DimensionValue) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.EDIT_TEXT:
				if(context == grammarAccess.getEditTextRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
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
			case AndroTextDslPackage.EXPANDABLE_LIST_VIEW:
				if(context == grammarAccess.getExpandableListViewRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_ExpandableListView(context, (ExpandableListView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.EXTERNAL_DRAWABLE_RESOURCE_LINK:
				if(context == grammarAccess.getAnyDrawablePropertyValueRule() ||
				   context == grammarAccess.getDrawableResourceLinkRule() ||
				   context == grammarAccess.getExternalDrawableResourceLinkRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_ExternalDrawableResourceLink(context, (ExternalDrawableResourceLink) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.FAST_LAYOUT_STYLE:
				if(context == grammarAccess.getFastLayoutStyleRule() ||
				   context == grammarAccess.getLayoutStyleRule()) {
					sequence_FastLayoutStyle(context, (FastLayoutStyle) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.FRAME_LAYOUT:
				if(context == grammarAccess.getFrameLayoutRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
					sequence_FrameLayout(context, (FrameLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.GALLERY:
				if(context == grammarAccess.getGalleryRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_Gallery(context, (Gallery) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.GRAVITY_ATTRIBUTE:
				if(context == grammarAccess.getGravityAttributeRule()) {
					sequence_GravityAttribute(context, (GravityAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.GRID_LAYOUT:
				if(context == grammarAccess.getGridLayoutRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
					sequence_GridLayout(context, (GridLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.GRID_VIEW:
				if(context == grammarAccess.getGridViewRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_GridView(context, (GridView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.IMAGE_VIEW:
				if(context == grammarAccess.getImageViewRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_ImageView(context, (ImageView) semanticObject); 
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
			case AndroTextDslPackage.INTEGER_PROPERTY_VALUE:
				if(context == grammarAccess.getIntegerPropertyValueRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_IntegerPropertyValue(context, (IntegerPropertyValue) semanticObject); 
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
			case AndroTextDslPackage.INTEGER_RESOURCE_LINK:
				if(context == grammarAccess.getIntegerPropertyValueRule() ||
				   context == grammarAccess.getIntegerResourceLinkRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_IntegerResourceLink(context, (IntegerResourceLink) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LAYOUT_DIMENSION_PROPERTY_VALUE:
				if(context == grammarAccess.getLayoutDimensionPropertyValueRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_LayoutDimensionPropertyValue(context, (LayoutDimensionPropertyValue) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LAYOUT_GRAVITY_ATTRIBUTE:
				if(context == grammarAccess.getLayoutGravityAttributeRule()) {
					sequence_LayoutGravityAttribute(context, (LayoutGravityAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LAYOUT_PARAMS:
				if(context == grammarAccess.getLayoutParamsRule()) {
					sequence_LayoutParams(context, (LayoutParams) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LINEAR_LAYOUT:
				if(context == grammarAccess.getLinearLayoutRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
					sequence_LinearLayout(context, (LinearLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LINEAR_LAYOUT_PARAMS:
				if(context == grammarAccess.getLinearLayoutParamsRule()) {
					sequence_LinearLayoutParams(context, (LinearLayoutParams) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LIST_ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getAndroidApplicationModelElementRule() ||
				   context == grammarAccess.getListActivityRule()) {
					sequence_ListActivity(context, (ListActivity) semanticObject); 
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
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_ListView(context, (ListView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.LOCAL_DRAWABLE_RESOURCE_LINK:
				if(context == grammarAccess.getAnyDrawablePropertyValueRule() ||
				   context == grammarAccess.getDrawableResourceLinkRule() ||
				   context == grammarAccess.getLocalDrawableResourceLinkRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_LocalDrawableResourceLink(context, (LocalDrawableResourceLink) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PADDING_ATTRIBUTE:
				if(context == grammarAccess.getPaddingAttributeRule()) {
					sequence_PaddingAttribute(context, (PaddingAttribute) semanticObject); 
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
			case AndroTextDslPackage.PREFERENCE_ACTIVITY:
				if(context == grammarAccess.getAndroidApplicationModelElementRule() ||
				   context == grammarAccess.getPreferenceActivityRule()) {
					sequence_PreferenceActivity(context, (PreferenceActivity) semanticObject); 
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
				   context == grammarAccess.getPreferenceScreenRule()) {
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
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_RadioGroup(context, (RadioGroup) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RATING_BAR:
				if(context == grammarAccess.getRatingBarRule() ||
				   context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_RatingBar(context, (RatingBar) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.REGULAR_LAYOUT_STYLE:
				if(context == grammarAccess.getLayoutStyleRule() ||
				   context == grammarAccess.getRegularLayoutStyleRule()) {
					sequence_RegularLayoutStyle(context, (RegularLayoutStyle) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RELATIVE_LAYOUT:
				if(context == grammarAccess.getRelativeLayoutRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
					sequence_RelativeLayout(context, (RelativeLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.RESOURCE_CONTENT_PROVIDER:
				if(context == grammarAccess.getContentProviderRule() ||
				   context == grammarAccess.getResourceContentProviderRule()) {
					sequence_ResourceContentProvider(context, (ResourceContentProvider) semanticObject); 
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
			case AndroTextDslPackage.SIMPLE_ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getAndroidApplicationModelElementRule() ||
				   context == grammarAccess.getSimpleActivityRule()) {
					sequence_SimpleActivity(context, (SimpleActivity) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.SPINNER:
				if(context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getSpinnerRule() ||
				   context == grammarAccess.getViewRule()) {
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
			case AndroTextDslPackage.STRING_PROPERTY_VALUE:
				if(context == grammarAccess.getPropertyValueRule() ||
				   context == grammarAccess.getStringPropertyValueRule()) {
					sequence_StringPropertyValue(context, (StringPropertyValue) semanticObject); 
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
			case AndroTextDslPackage.STRING_RESOURCE_LINK:
				if(context == grammarAccess.getPropertyValueRule() ||
				   context == grammarAccess.getStringPropertyValueRule() ||
				   context == grammarAccess.getStringResourceLinkRule()) {
					sequence_StringResourceLink(context, (StringResourceLink) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TAB:
				if(context == grammarAccess.getTabRule()) {
					sequence_Tab(context, (Tab) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TAB_ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getAndroidApplicationModelElementRule() ||
				   context == grammarAccess.getTabActivityRule()) {
					sequence_TabActivity(context, (TabActivity) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TABLE_LAYOUT:
				if(context == grammarAccess.getTableLayoutRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
					sequence_TableLayout(context, (TableLayout) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TABLE_ROW:
				if(context == grammarAccess.getTableRowRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
					sequence_TableRow(context, (TableRow) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TARGET_APPLICATION:
				if(context == grammarAccess.getTargetApplicationRule()) {
					sequence_TargetApplication(context, (TargetApplication) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE:
				if(context == grammarAccess.getTextSizeAttributeRule()) {
					sequence_TextSizeAttribute(context, (TextSizeAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TEXT_VIEW:
				if(context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getTextViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_TextView(context, (TextView) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TOGGLE_BUTTON:
				if(context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getToggleButtonRule() ||
				   context == grammarAccess.getViewRule()) {
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
			case AndroTextDslPackage.VIEW_ELEMENT:
				if(context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewElementRule()) {
					sequence_ViewElement(context, (ViewElement) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.WEB_VIEW:
				if(context == grammarAccess.getSimpleViewRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getWebViewRule()) {
					sequence_WebView(context, (WebView) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle views+=View*)
	 */
	protected void sequence_AbsoluteLayout(EObject context, AbsoluteLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID roots+=View*)
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
	 *     (name=ID entries=[StringArrayResource|QualifiedName] layoutStyle=LayoutStyle isMulti?=BOOL)
	 */
	protected void sequence_AutoCompleteTextView(EObject context, AutoCompleteTextView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.AUTO_COMPLETE_TEXT_VIEW__ENTRIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.AUTO_COMPLETE_TEXT_VIEW__ENTRIES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.AUTO_COMPLETE_TEXT_VIEW__IS_MULTI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.AUTO_COMPLETE_TEXT_VIEW__IS_MULTI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAutoCompleteTextViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAutoCompleteTextViewAccess().getEntriesStringArrayResourceQualifiedNameParserRuleCall_2_0_1(), semanticObject.getEntries());
		feeder.accept(grammarAccess.getAutoCompleteTextViewAccess().getLayoutStyleLayoutStyleParserRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.accept(grammarAccess.getAutoCompleteTextViewAccess().getIsMultiBOOLParserRuleCall_4_0(), semanticObject.isIsMulti());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     background=AnyDrawablePropertyValue
	 */
	protected void sequence_BackgroundAttribute(EObject context, BackgroundAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.BACKGROUND_ATTRIBUTE__BACKGROUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.BACKGROUND_ATTRIBUTE__BACKGROUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBackgroundAttributeAccess().getBackgroundAnyDrawablePropertyValueParserRuleCall_1_0(), semanticObject.getBackground());
		feeder.finish();
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
	 *     value=BOOL
	 */
	protected void sequence_BooleanPropertyValue(EObject context, BooleanPropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.BOOLEAN_PROPERTY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.BOOLEAN_PROPERTY_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanPropertyValueAccess().getValueBOOLParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     link=[BooleanResource|QualifiedName]
	 */
	protected void sequence_BooleanResourceLink(EObject context, BooleanResourceLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID text=STRING layoutStyle=LayoutStyle layoutParams=LayoutParams?)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING preferenceAttributes=PreferenceAttributes)
	 */
	protected void sequence_CheckBoxPreference(EObject context, CheckBoxPreference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX_PREFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX_PREFERENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX_PREFERENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX_PREFERENCE__PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckBoxPreferenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCheckBoxPreferenceAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getCheckBoxPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_4_0(), semanticObject.getPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_CheckBox(EObject context, CheckBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.CHECK_BOX__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCheckBoxAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getCheckBoxAccess().getLayoutStyleLayoutStyleParserRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_CheckedTextView(EObject context, CheckedTextView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.CHECKED_TEXT_VIEW__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.CHECKED_TEXT_VIEW__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckedTextViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCheckedTextViewAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getCheckedTextViewAccess().getLayoutStyleLayoutStyleParserRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=HEX_COLOR
	 */
	protected void sequence_ColorPropertyValue(EObject context, ColorPropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.COLOR_PROPERTY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.COLOR_PROPERTY_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorPropertyValueAccess().getValueHEX_COLORTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     link=[ColorResource|QualifiedName]
	 */
	protected void sequence_ColorResourceLink(EObject context, ColorResourceLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     value=DimensionValue
	 */
	protected void sequence_DimensionPropertyValue(EObject context, DimensionPropertyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     link=[DimensionResource|QualifiedName]
	 */
	protected void sequence_DimensionResourceLink(EObject context, DimensionResourceLink semanticObject) {
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
	 *     (value=FLOAT metric=DimensionMetric)
	 */
	protected void sequence_DimensionValue(EObject context, DimensionValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.DIMENSION_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.DIMENSION_VALUE__VALUE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.DIMENSION_VALUE__METRIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.DIMENSION_VALUE__METRIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDimensionValueAccess().getValueFLOATParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getDimensionValueAccess().getMetricDimensionMetricEnumRuleCall_1_0(), semanticObject.getMetric());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING preferenceAttributes=PreferenceAttributes dialogPreferenceAttributes=DialogPreferenceAttributes)
	 */
	protected void sequence_EditTextPreference(EObject context, EditTextPreference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__PREFERENCE_ATTRIBUTES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.EDIT_TEXT_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEditTextPreferenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEditTextPreferenceAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getEditTextPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_4_0(), semanticObject.getPreferenceAttributes());
		feeder.accept(grammarAccess.getEditTextPreferenceAccess().getDialogPreferenceAttributesDialogPreferenceAttributesParserRuleCall_5_0(), semanticObject.getDialogPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         text=STRING? 
	 *         layoutStyle=LayoutStyle 
	 *         (gravityAttribute=GravityAttribute? textSizeAttribute=TextSizeAttribute? layoutParams=LayoutParams?)?
	 *     )
	 */
	protected void sequence_EditText(EObject context, EditText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID layoutStyle=LayoutStyle)
	 */
	protected void sequence_ExpandableListView(EObject context, ExpandableListView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpandableListViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExpandableListViewAccess().getLayoutStyleLayoutStyleParserRuleCall_2_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     externalResource=AndroidDrawableResource
	 */
	protected void sequence_ExternalDrawableResourceLink(EObject context, ExternalDrawableResourceLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.EXTERNAL_DRAWABLE_RESOURCE_LINK__EXTERNAL_RESOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalDrawableResourceLinkAccess().getExternalResourceAndroidDrawableResourceEnumRuleCall_0(), semanticObject.getExternalResource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FastLayoutDimensionKind
	 */
	protected void sequence_FastLayoutStyle(EObject context, FastLayoutStyle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.FAST_LAYOUT_STYLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.FAST_LAYOUT_STYLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFastLayoutStyleAccess().getValueFastLayoutDimensionKindEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle views+=View*)
	 */
	protected void sequence_FrameLayout(EObject context, FrameLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle)
	 */
	protected void sequence_Gallery(EObject context, Gallery semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGalleryAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGalleryAccess().getLayoutStyleLayoutStyleParserRuleCall_2_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     gravity=LayoutGravityKind
	 */
	protected void sequence_GravityAttribute(EObject context, GravityAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.GRAVITY_ATTRIBUTE__GRAVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.GRAVITY_ATTRIBUTE__GRAVITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGravityAttributeAccess().getGravityLayoutGravityKindEnumRuleCall_1_0(), semanticObject.getGravity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle views+=View*)
	 */
	protected void sequence_GridLayout(EObject context, GridLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle)
	 */
	protected void sequence_GridView(EObject context, GridView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGridViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGridViewAccess().getLayoutStyleLayoutStyleParserRuleCall_2_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID src=DrawableResource layoutStyle=LayoutStyle)
	 */
	protected void sequence_ImageView(EObject context, ImageView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.IMAGE_VIEW__SRC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.IMAGE_VIEW__SRC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getImageViewAccess().getSrcDrawableResourceParserRuleCall_2_0(), semanticObject.getSrc());
		feeder.accept(grammarAccess.getImageViewAccess().getLayoutStyleLayoutStyleParserRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
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
	 *     value=INT
	 */
	protected void sequence_IntegerPropertyValue(EObject context, IntegerPropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.INTEGER_PROPERTY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.INTEGER_PROPERTY_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerPropertyValueAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     link=[IntegerResource|QualifiedName]
	 */
	protected void sequence_IntegerResourceLink(EObject context, IntegerResourceLink semanticObject) {
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
	 *     constValue=LayoutDimensionKind
	 */
	protected void sequence_LayoutDimensionPropertyValue(EObject context, LayoutDimensionPropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LAYOUT_DIMENSION_PROPERTY_VALUE__CONST_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLayoutDimensionPropertyValueAccess().getConstValueLayoutDimensionKindEnumRuleCall_1_0(), semanticObject.getConstValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (gravity+=LayoutGravityKind gravity+=LayoutGravityKind*)
	 */
	protected void sequence_LayoutGravityAttribute(EObject context, LayoutGravityAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         weight=IntegerPropertyValue? 
	 *         marginLeft=DimensionPropertyValue? 
	 *         marginTop=DimensionPropertyValue? 
	 *         marginRight=DimensionPropertyValue? 
	 *         marginBottom=DimensionPropertyValue? 
	 *         alignParentLeft=BooleanPropertyValue? 
	 *         alignParentTop=BooleanPropertyValue? 
	 *         alignParentRight=BooleanPropertyValue? 
	 *         alignParentBottom=BooleanPropertyValue? 
	 *         alignTop=[View|ID]? 
	 *         alignBottom=[View|ID]? 
	 *         alignLeft=[View|ID]? 
	 *         below=[View|ID]? 
	 *         above=[View|ID]? 
	 *         toLeftOf=[View|ID]? 
	 *         toRightOf=[View|ID]? 
	 *         centerHorizontal=BooleanPropertyValue? 
	 *         centerInParent=BooleanPropertyValue? 
	 *         centerVertical=BooleanPropertyValue? 
	 *         column=IntegerPropertyValue? 
	 *         backgroundAttribute=BackgroundAttribute?
	 *     )
	 */
	protected void sequence_LayoutParams(EObject context, LayoutParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (layoutParams=LayoutParams? gravity=LayoutGravityAttribute?)
	 */
	protected void sequence_LinearLayoutParams(EObject context, LinearLayoutParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID vertical?='vertical'? layoutStyle=LayoutStyle layoutParams=LinearLayoutParams? views+=View*)
	 */
	protected void sequence_LinearLayout(EObject context, LinearLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID listitem=[View|QualifiedName] contentProvider=ContentProvider)
	 */
	protected void sequence_ListActivity(EObject context, ListActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_ACTIVITY__LISTITEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_ACTIVITY__LISTITEM));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_ACTIVITY__CONTENT_PROVIDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_ACTIVITY__CONTENT_PROVIDER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListActivityAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getListActivityAccess().getListitemViewQualifiedNameParserRuleCall_3_0_1(), semanticObject.getListitem());
		feeder.accept(grammarAccess.getListActivityAccess().getContentProviderContentProviderParserRuleCall_6_0(), semanticObject.getContentProvider());
		feeder.finish();
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
	 *         name=ID 
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__PREFERENCE_ATTRIBUTES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__DIALOG_PREFERENCE_ATTRIBUTES));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LIST_PREFERENCE__LIST_PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListPreferenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getListPreferenceAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getListPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_4_0(), semanticObject.getPreferenceAttributes());
		feeder.accept(grammarAccess.getListPreferenceAccess().getDialogPreferenceAttributesDialogPreferenceAttributesParserRuleCall_5_0(), semanticObject.getDialogPreferenceAttributes());
		feeder.accept(grammarAccess.getListPreferenceAccess().getListPreferenceAttributesListPreferenceAttributesParserRuleCall_6_0(), semanticObject.getListPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle entries=[ArrayResource|QualifiedName]? layout=[View|QualifiedName]?)
	 */
	protected void sequence_ListView(EObject context, ListView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     link=[DrawableResource|QualifiedName]
	 */
	protected void sequence_LocalDrawableResourceLink(EObject context, LocalDrawableResourceLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.LOCAL_DRAWABLE_RESOURCE_LINK__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.LOCAL_DRAWABLE_RESOURCE_LINK__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalDrawableResourceLinkAccess().getLinkDrawableResourceQualifiedNameParserRuleCall_0_1(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     padding=DimensionPropertyValue
	 */
	protected void sequence_PaddingAttribute(EObject context, PaddingAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.PADDING_ATTRIBUTE__PADDING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.PADDING_ATTRIBUTE__PADDING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPaddingAttributeAccess().getPaddingDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getPadding());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layout=[PreferenceScreen|QualifiedName])
	 */
	protected void sequence_PreferenceActivity(EObject context, PreferenceActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ANDROID_APPLICATION_MODEL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.PREFERENCE_ACTIVITY__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.PREFERENCE_ACTIVITY__LAYOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPreferenceActivityAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPreferenceActivityAccess().getLayoutPreferenceScreenQualifiedNameParserRuleCall_3_0_1(), semanticObject.getLayout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (summary=STRING? enabled=BOOL? persistent=BOOL?)
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
	 *     (name=ID? title=STRING preferenceAttributes=PreferenceAttributes preferences+=AbstractPreference*)
	 */
	protected void sequence_PreferenceScreen(EObject context, PreferenceScreen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? title=STRING preferenceAttributes=PreferenceAttributes)
	 */
	protected void sequence_Preference(EObject context, Preference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		feeder.accept(grammarAccess.getRadioButtonAccess().getLayoutStyleLayoutStyleParserRuleCall_3_0(), semanticObject.getLayoutStyle());
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RATING_BAR__NUM_STARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RATING_BAR__NUM_STARS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRatingBarAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRatingBarAccess().getNumStarsINTTerminalRuleCall_2_0(), semanticObject.getNumStars());
		feeder.accept(grammarAccess.getRatingBarAccess().getLayoutStyleLayoutStyleParserRuleCall_3_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (width=LayoutDimensionPropertyValue? height=LayoutDimensionPropertyValue?)
	 */
	protected void sequence_RegularLayoutStyle(EObject context, RegularLayoutStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle views+=View*)
	 */
	protected void sequence_RelativeLayout(EObject context, RelativeLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     link=[ArrayResource|QualifiedName]
	 */
	protected void sequence_ResourceContentProvider(EObject context, ResourceContentProvider semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RESOURCE_CONTENT_PROVIDER__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RESOURCE_CONTENT_PROVIDER__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourceContentProviderAccess().getLinkArrayResourceQualifiedNameParserRuleCall_0_1(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING preferenceAttributes=PreferenceAttributes)
	 */
	protected void sequence_RingtonePrefence(EObject context, RingtonePrefence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.ABSTRACT_PREFERENCE__TITLE));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RINGTONE_PREFENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RINGTONE_PREFENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.RINGTONE_PREFENCE__PREFERENCE_ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRingtonePrefenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRingtonePrefenceAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getRingtonePrefenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_4_0(), semanticObject.getPreferenceAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layout=[ViewGroup|QualifiedName] theme=ActivityTheme?)
	 */
	protected void sequence_SimpleActivity(EObject context, SimpleActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entries=[ArrayResource|QualifiedName]? layoutStyle=LayoutStyle)
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
	 *     value=STRING
	 */
	protected void sequence_StringPropertyValue(EObject context, StringPropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.STRING_PROPERTY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.STRING_PROPERTY_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringPropertyValueAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     link=[StringResource|QualifiedName]
	 */
	protected void sequence_StringResourceLink(EObject context, StringResourceLink semanticObject) {
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
	 *     (name=ID tabs+=Tab+)
	 */
	protected void sequence_TabActivity(EObject context, TabActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tag=STRING activity=[Activity|ID])
	 */
	protected void sequence_Tab(EObject context, Tab semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TAB__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TAB__TAG));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TAB__ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TAB__ACTIVITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTabAccess().getTagSTRINGTerminalRuleCall_1_0(), semanticObject.getTag());
		feeder.accept(grammarAccess.getTabAccess().getActivityActivityIDTerminalRuleCall_4_0_1(), semanticObject.getActivity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         layoutStyle=LayoutStyle 
	 *         (collapseColumns+=IntegerPropertyValue collapseColumns+=IntegerPropertyValue?)? 
	 *         (shrinkColumns+=IntegerPropertyValue shrinkColumns+=IntegerPropertyValue?)? 
	 *         (stretchColumns+=IntegerPropertyValue stretchColumns+=IntegerPropertyValue?)? 
	 *         views+=View*
	 *     )
	 */
	protected void sequence_TableLayout(EObject context, TableLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle views+=View*)
	 */
	protected void sequence_TableRow(EObject context, TableRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     textSize=DimensionPropertyValue
	 */
	protected void sequence_TextSizeAttribute(EObject context, TextSizeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.TEXT_SIZE_ATTRIBUTE__TEXT_SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextSizeAttributeAccess().getTextSizeDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getTextSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         text=STRING? 
	 *         layoutStyle=LayoutStyle 
	 *         (gravityAttribute=GravityAttribute? textSizeAttribute=TextSizeAttribute? paddingAttribute=PaddingAttribute? layoutParams=LayoutParams?)?
	 *     )
	 */
	protected void sequence_TextView(EObject context, TextView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID textOn=STRING textOff=STRING layoutStyle=LayoutStyle)
	 */
	protected void sequence_ToggleButton(EObject context, ToggleButton semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
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
		feeder.accept(grammarAccess.getToggleButtonAccess().getLayoutStyleLayoutStyleParserRuleCall_6_0(), semanticObject.getLayoutStyle());
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
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle layoutParams=LayoutParams?)
	 */
	protected void sequence_ViewElement(EObject context, ViewElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle)
	 */
	protected void sequence_WebView(EObject context, WebView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__NAME));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.Literals.VIEW__LAYOUT_STYLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWebViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWebViewAccess().getLayoutStyleLayoutStyleParserRuleCall_2_0(), semanticObject.getLayoutStyle());
		feeder.finish();
	}
}
