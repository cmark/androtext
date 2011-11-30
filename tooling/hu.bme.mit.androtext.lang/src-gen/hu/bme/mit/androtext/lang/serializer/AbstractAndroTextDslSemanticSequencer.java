package hu.bme.mit.androtext.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.mit.androtext.lang.androTextDsl.AboveAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AbsoluteLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AlignBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentRightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignParentTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AlignTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AutoCompleteTextView;
import hu.bme.mit.androtext.lang.androTextDsl.AutoLinkAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.AutoTextAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BackgroundAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BelowAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.BitmapDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResource;
import hu.bme.mit.androtext.lang.androTextDsl.BooleanResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.Button;
import hu.bme.mit.androtext.lang.androTextDsl.CapitalizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterHorizontalAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterInParentAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CenterVerticalAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CheckBox;
import hu.bme.mit.androtext.lang.androTextDsl.CheckBoxPreference;
import hu.bme.mit.androtext.lang.androTextDsl.CheckedTextView;
import hu.bme.mit.androtext.lang.androTextDsl.ClickableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.CollapseColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ColorPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResource;
import hu.bme.mit.androtext.lang.androTextDsl.ColorResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ColumnWidthAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.DialogPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.DigitsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResource;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.DimensionValue;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.EditText;
import hu.bme.mit.androtext.lang.androTextDsl.EditTextPreference;
import hu.bme.mit.androtext.lang.androTextDsl.EditableAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.EntityTypeRef;
import hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ExpandableListView;
import hu.bme.mit.androtext.lang.androTextDsl.ExternalDrawableResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.FadeScrollBarsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.FastLayoutStyle;
import hu.bme.mit.androtext.lang.androTextDsl.FrameLayout;
import hu.bme.mit.androtext.lang.androTextDsl.Gallery;
import hu.bme.mit.androtext.lang.androTextDsl.GravityAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.GridLayout;
import hu.bme.mit.androtext.lang.androTextDsl.GridView;
import hu.bme.mit.androtext.lang.androTextDsl.HeightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HintAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalSpacingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ImageView;
import hu.bme.mit.androtext.lang.androTextDsl.Import;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayEntry;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerArrayResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResource;
import hu.bme.mit.androtext.lang.androTextDsl.IntegerResourceLink;
import hu.bme.mit.androtext.lang.androTextDsl.IsScrollContainerAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutDimensionPropertyValue;
import hu.bme.mit.androtext.lang.androTextDsl.LayoutProperties;
import hu.bme.mit.androtext.lang.androTextDsl.LinearLayout;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreference;
import hu.bme.mit.androtext.lang.androTextDsl.ListPreferenceAttributes;
import hu.bme.mit.androtext.lang.androTextDsl.ListView;
import hu.bme.mit.androtext.lang.androTextDsl.MarginBottomAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginLeftAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginRightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.MarginTopAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.NumericAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PaddingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PasswordAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.PhoneNumberAttribute;
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
import hu.bme.mit.androtext.lang.androTextDsl.ShrinkColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.SingleLineAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.SpanAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.Spinner;
import hu.bme.mit.androtext.lang.androTextDsl.StretchColumnsAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.StretchModeAttribute;
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
import hu.bme.mit.androtext.lang.androTextDsl.TextColorAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextSizeAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextStyleAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.TextView;
import hu.bme.mit.androtext.lang.androTextDsl.ToLeftOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ToRightOfAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ToggleButton;
import hu.bme.mit.androtext.lang.androTextDsl.TransitionDrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.TypefaceAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.VerticalSpacingAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.ViewElement;
import hu.bme.mit.androtext.lang.androTextDsl.WebView;
import hu.bme.mit.androtext.lang.androTextDsl.WeightAttribute;
import hu.bme.mit.androtext.lang.androTextDsl.WidthAttribute;
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
			case AndroTextDslPackage.ABOVE_ATTRIBUTE:
				if(context == grammarAccess.getAboveAttributeRule()) {
					sequence_AboveAttribute(context, (AboveAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ABSOLUTE_LAYOUT:
				if(context == grammarAccess.getAbsoluteLayoutRule() ||
				   context == grammarAccess.getViewRule() ||
				   context == grammarAccess.getViewGroupRule()) {
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
			case AndroTextDslPackage.ALIGN_BOTTOM_ATTRIBUTE:
				if(context == grammarAccess.getAlignBottomAttributeRule()) {
					sequence_AlignBottomAttribute(context, (AlignBottomAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ALIGN_LEFT_ATTRIBUTE:
				if(context == grammarAccess.getAlignLeftAttributeRule()) {
					sequence_AlignLeftAttribute(context, (AlignLeftAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ALIGN_PARENT_BOTTOM_ATTRIBUTE:
				if(context == grammarAccess.getAlignParentBottomAttributeRule()) {
					sequence_AlignParentBottomAttribute(context, (AlignParentBottomAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ALIGN_PARENT_LEFT_ATTRIBUTE:
				if(context == grammarAccess.getAlignParentLeftAttributeRule()) {
					sequence_AlignParentLeftAttribute(context, (AlignParentLeftAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ALIGN_PARENT_RIGHT_ATTRIBUTE:
				if(context == grammarAccess.getAlignParentRightAttributeRule()) {
					sequence_AlignParentRightAttribute(context, (AlignParentRightAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ALIGN_PARENT_TOP_ATTRIBUTE:
				if(context == grammarAccess.getAlignParentTopAttributeRule()) {
					sequence_AlignParentTopAttribute(context, (AlignParentTopAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.ALIGN_TOP_ATTRIBUTE:
				if(context == grammarAccess.getAlignTopAttributeRule()) {
					sequence_AlignTopAttribute(context, (AlignTopAttribute) semanticObject); 
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
			case AndroTextDslPackage.AUTO_LINK_ATTRIBUTE:
				if(context == grammarAccess.getAutoLinkAttributeRule()) {
					sequence_AutoLinkAttribute(context, (AutoLinkAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.AUTO_TEXT_ATTRIBUTE:
				if(context == grammarAccess.getAutoTextAttributeRule()) {
					sequence_AutoTextAttribute(context, (AutoTextAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.BACKGROUND_ATTRIBUTE:
				if(context == grammarAccess.getBackgroundAttributeRule()) {
					sequence_BackgroundAttribute(context, (BackgroundAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.BELOW_ATTRIBUTE:
				if(context == grammarAccess.getBelowAttributeRule()) {
					sequence_BelowAttribute(context, (BelowAttribute) semanticObject); 
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
			case AndroTextDslPackage.CAPITALIZE_ATTRIBUTE:
				if(context == grammarAccess.getCapitalizeAttributeRule()) {
					sequence_CapitalizeAttribute(context, (CapitalizeAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.CENTER_HORIZONTAL_ATTRIBUTE:
				if(context == grammarAccess.getCenterHorizontalAttributeRule()) {
					sequence_CenterHorizontalAttribute(context, (CenterHorizontalAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.CENTER_IN_PARENT_ATTRIBUTE:
				if(context == grammarAccess.getCenterInParentAttributeRule()) {
					sequence_CenterInParentAttribute(context, (CenterInParentAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.CENTER_VERTICAL_ATTRIBUTE:
				if(context == grammarAccess.getCenterVerticalAttributeRule()) {
					sequence_CenterVerticalAttribute(context, (CenterVerticalAttribute) semanticObject); 
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
			case AndroTextDslPackage.CLICKABLE_ATTRIBUTE:
				if(context == grammarAccess.getClickableAttributeRule()) {
					sequence_ClickableAttribute(context, (ClickableAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.COLLAPSE_COLUMNS_ATTRIBUTE:
				if(context == grammarAccess.getCollapseColumnsAttributeRule()) {
					sequence_CollapseColumnsAttribute(context, (CollapseColumnsAttribute) semanticObject); 
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
			case AndroTextDslPackage.COLUMN_ATTRIBUTE:
				if(context == grammarAccess.getColumnAttributeRule()) {
					sequence_ColumnAttribute(context, (ColumnAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.COLUMN_WIDTH_ATTRIBUTE:
				if(context == grammarAccess.getColumnWidthAttributeRule()) {
					sequence_ColumnWidthAttribute(context, (ColumnWidthAttribute) semanticObject); 
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
			case AndroTextDslPackage.DIGITS_ATTRIBUTE:
				if(context == grammarAccess.getDigitsAttributeRule()) {
					sequence_DigitsAttribute(context, (DigitsAttribute) semanticObject); 
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
			case AndroTextDslPackage.DRAWABLE_RESOURCE_LINK:
				if(context == grammarAccess.getAnyDrawablePropertyValueRule() ||
				   context == grammarAccess.getDrawableResourceLinkRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_DrawableResourceLink(context, (DrawableResourceLink) semanticObject); 
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
			case AndroTextDslPackage.EDITABLE_ATTRIBUTE:
				if(context == grammarAccess.getEditableAttributeRule()) {
					sequence_EditableAttribute(context, (EditableAttribute) semanticObject); 
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
			case AndroTextDslPackage.ENTRIES_ATTRIBUTE:
				if(context == grammarAccess.getEntriesAttributeRule()) {
					sequence_EntriesAttribute(context, (EntriesAttribute) semanticObject); 
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
				   context == grammarAccess.getExternalDrawableResourceLinkRule() ||
				   context == grammarAccess.getPropertyValueRule()) {
					sequence_ExternalDrawableResourceLink(context, (ExternalDrawableResourceLink) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.FADE_SCROLL_BARS_ATTRIBUTE:
				if(context == grammarAccess.getFadeScrollBarsAttributeRule()) {
					sequence_FadeScrollBarsAttribute(context, (FadeScrollBarsAttribute) semanticObject); 
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
			case AndroTextDslPackage.HEIGHT_ATTRIBUTE:
				if(context == grammarAccess.getHeightAttributeRule()) {
					sequence_HeightAttribute(context, (HeightAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.HINT_ATTRIBUTE:
				if(context == grammarAccess.getHintAttributeRule()) {
					sequence_HintAttribute(context, (HintAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.HORIZONTAL_SPACING_ATTRIBUTE:
				if(context == grammarAccess.getHorizontalSpacingAttributeRule()) {
					sequence_HorizontalSpacingAttribute(context, (HorizontalSpacingAttribute) semanticObject); 
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
			case AndroTextDslPackage.IS_SCROLL_CONTAINER_ATTRIBUTE:
				if(context == grammarAccess.getIsScrollContainerAttributeRule()) {
					sequence_IsScrollContainerAttribute(context, (IsScrollContainerAttribute) semanticObject); 
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
			case AndroTextDslPackage.LAYOUT_PROPERTIES:
				if(context == grammarAccess.getLayoutPropertiesRule()) {
					sequence_LayoutProperties(context, (LayoutProperties) semanticObject); 
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
			case AndroTextDslPackage.MARGIN_BOTTOM_ATTRIBUTE:
				if(context == grammarAccess.getMarginBottomAttributeRule()) {
					sequence_MarginBottomAttribute(context, (MarginBottomAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.MARGIN_LEFT_ATTRIBUTE:
				if(context == grammarAccess.getMarginLeftAttributeRule()) {
					sequence_MarginLeftAttribute(context, (MarginLeftAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.MARGIN_RIGHT_ATTRIBUTE:
				if(context == grammarAccess.getMarginRightAttributeRule()) {
					sequence_MarginRightAttribute(context, (MarginRightAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.MARGIN_TOP_ATTRIBUTE:
				if(context == grammarAccess.getMarginTopAttributeRule()) {
					sequence_MarginTopAttribute(context, (MarginTopAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.NUM_COLUMNS_ATTRIBUTE:
				if(context == grammarAccess.getNumColumnsAttributeRule()) {
					sequence_NumColumnsAttribute(context, (NumColumnsAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.NUMERIC_ATTRIBUTE:
				if(context == grammarAccess.getNumericAttributeRule()) {
					sequence_NumericAttribute(context, (NumericAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PADDING_ATTRIBUTE:
				if(context == grammarAccess.getPaddingAttributeRule()) {
					sequence_PaddingAttribute(context, (PaddingAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PASSWORD_ATTRIBUTE:
				if(context == grammarAccess.getPasswordAttributeRule()) {
					sequence_PasswordAttribute(context, (PasswordAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.PHONE_NUMBER_ATTRIBUTE:
				if(context == grammarAccess.getPhoneNumberAttributeRule()) {
					sequence_PhoneNumberAttribute(context, (PhoneNumberAttribute) semanticObject); 
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
			case AndroTextDslPackage.SHRINK_COLUMNS_ATTRIBUTE:
				if(context == grammarAccess.getShrinkColumnsAttributeRule()) {
					sequence_ShrinkColumnsAttribute(context, (ShrinkColumnsAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.SINGLE_LINE_ATTRIBUTE:
				if(context == grammarAccess.getSingleLineAttributeRule()) {
					sequence_SingleLineAttribute(context, (SingleLineAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.SPAN_ATTRIBUTE:
				if(context == grammarAccess.getSpanAttributeRule()) {
					sequence_SpanAttribute(context, (SpanAttribute) semanticObject); 
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
			case AndroTextDslPackage.STRETCH_COLUMNS_ATTRIBUTE:
				if(context == grammarAccess.getStretchColumnsAttributeRule()) {
					sequence_StretchColumnsAttribute(context, (StretchColumnsAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.STRETCH_MODE_ATTRIBUTE:
				if(context == grammarAccess.getStretchModeAttributeRule()) {
					sequence_StretchModeAttribute(context, (StretchModeAttribute) semanticObject); 
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
			case AndroTextDslPackage.TEXT_COLOR_ATTRIBUTE:
				if(context == grammarAccess.getTextColorAttributeRule()) {
					sequence_TextColorAttribute(context, (TextColorAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TEXT_SIZE_ATTRIBUTE:
				if(context == grammarAccess.getTextSizeAttributeRule()) {
					sequence_TextSizeAttribute(context, (TextSizeAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TEXT_STYLE_ATTRIBUTE:
				if(context == grammarAccess.getTextStyleAttributeRule()) {
					sequence_TextStyleAttribute(context, (TextStyleAttribute) semanticObject); 
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
			case AndroTextDslPackage.TO_LEFT_OF_ATTRIBUTE:
				if(context == grammarAccess.getToLeftOfAttributeRule()) {
					sequence_ToLeftOfAttribute(context, (ToLeftOfAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.TO_RIGHT_OF_ATTRIBUTE:
				if(context == grammarAccess.getToRightOfAttributeRule()) {
					sequence_ToRightOfAttribute(context, (ToRightOfAttribute) semanticObject); 
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
			case AndroTextDslPackage.TYPEFACE_ATTRIBUTE:
				if(context == grammarAccess.getTypefaceAttributeRule()) {
					sequence_TypefaceAttribute(context, (TypefaceAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.VERTICAL_SPACING_ATTRIBUTE:
				if(context == grammarAccess.getVerticalSpacingAttributeRule()) {
					sequence_VerticalSpacingAttribute(context, (VerticalSpacingAttribute) semanticObject); 
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
			case AndroTextDslPackage.WEIGHT_ATTRIBUTE:
				if(context == grammarAccess.getWeightAttributeRule()) {
					sequence_WeightAttribute(context, (WeightAttribute) semanticObject); 
					return; 
				}
				else break;
			case AndroTextDslPackage.WIDTH_ATTRIBUTE:
				if(context == grammarAccess.getWidthAttributeRule()) {
					sequence_WidthAttribute(context, (WidthAttribute) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     above=[View|QualifiedName]
	 */
	protected void sequence_AboveAttribute(EObject context, AboveAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAboveAttribute_Above()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAboveAttribute_Above()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAboveAttributeAccess().getAboveViewQualifiedNameParserRuleCall_1_0_1(), semanticObject.getAbove());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]? views+=View*)
	 */
	protected void sequence_AbsoluteLayout(EObject context, AbsoluteLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layout=[View|QualifiedName] theme=ActivityTheme?)
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     alignBottom=[View|QualifiedName]
	 */
	protected void sequence_AlignBottomAttribute(EObject context, AlignBottomAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignBottomAttribute_AlignBottom()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignBottomAttribute_AlignBottom()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlignBottomAttributeAccess().getAlignBottomViewQualifiedNameParserRuleCall_1_0_1(), semanticObject.getAlignBottom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     alignLeft=[View|QualifiedName]
	 */
	protected void sequence_AlignLeftAttribute(EObject context, AlignLeftAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignLeftAttribute_AlignLeft()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignLeftAttribute_AlignLeft()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlignLeftAttributeAccess().getAlignLeftViewQualifiedNameParserRuleCall_1_0_1(), semanticObject.getAlignLeft());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     alignParentBottom=BooleanPropertyValue
	 */
	protected void sequence_AlignParentBottomAttribute(EObject context, AlignParentBottomAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentBottomAttribute_AlignParentBottom()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentBottomAttribute_AlignParentBottom()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlignParentBottomAttributeAccess().getAlignParentBottomBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getAlignParentBottom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     alignParentLeft=BooleanPropertyValue
	 */
	protected void sequence_AlignParentLeftAttribute(EObject context, AlignParentLeftAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentLeftAttribute_AlignParentLeft()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentLeftAttribute_AlignParentLeft()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlignParentLeftAttributeAccess().getAlignParentLeftBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getAlignParentLeft());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     alignParentRight=BooleanPropertyValue
	 */
	protected void sequence_AlignParentRightAttribute(EObject context, AlignParentRightAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentRightAttribute_AlignParentRight()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentRightAttribute_AlignParentRight()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlignParentRightAttributeAccess().getAlignParentRightBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getAlignParentRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     alignParentTop=BooleanPropertyValue
	 */
	protected void sequence_AlignParentTopAttribute(EObject context, AlignParentTopAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentTopAttribute_AlignParentTop()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignParentTopAttribute_AlignParentTop()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlignParentTopAttributeAccess().getAlignParentTopBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getAlignParentTop());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     alignTop=[View|QualifiedName]
	 */
	protected void sequence_AlignTopAttribute(EObject context, AlignTopAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignTopAttribute_AlignTop()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAlignTopAttribute_AlignTop()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlignTopAttributeAccess().getAlignTopViewQualifiedNameParserRuleCall_1_0_1(), semanticObject.getAlignTop());
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
	 *     (name=ID roots+=View* layoutAttributes+=LayoutProperties*)
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
	 *     (
	 *         name=ID 
	 *         entriesAttribute=EntriesAttribute? 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         multi=BooleanPropertyValue?
	 *     )
	 */
	protected void sequence_AutoCompleteTextView(EObject context, AutoCompleteTextView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (all?='all' | (autoLinkMask+=AutoLinkKind autoLinkMask+=AutoLinkKind?))
	 */
	protected void sequence_AutoLinkAttribute(EObject context, AutoLinkAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     autoText=BooleanPropertyValue
	 */
	protected void sequence_AutoTextAttribute(EObject context, AutoTextAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAutoTextAttribute_AutoText()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAutoTextAttribute_AutoText()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAutoTextAttributeAccess().getAutoTextBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getAutoText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     background=AnyDrawablePropertyValue
	 */
	protected void sequence_BackgroundAttribute(EObject context, BackgroundAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getBackgroundAttribute_Background()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getBackgroundAttribute_Background()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBackgroundAttributeAccess().getBackgroundAnyDrawablePropertyValueParserRuleCall_1_0(), semanticObject.getBackground());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     below=[View|QualifiedName]
	 */
	protected void sequence_BelowAttribute(EObject context, BelowAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getBelowAttribute_Below()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getBelowAttribute_Below()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBelowAttributeAccess().getBelowViewQualifiedNameParserRuleCall_1_0_1(), semanticObject.getBelow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID filename=ID)
	 */
	protected void sequence_BitmapDrawableResource(EObject context, BitmapDrawableResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getBitmapDrawableResource_Filename()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getBitmapDrawableResource_Filename()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getBooleanPropertyValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getBooleanPropertyValue_Value()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getBooleanResource_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getBooleanResource_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBooleanResourceAccess().getValueBOOLParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         text=StringPropertyValue 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         widthAttribute=WidthAttribute? 
	 *         heightAttribute=HeightAttribute? 
	 *         backgroundAttribute=BackgroundAttribute? 
	 *         clickableAttribute=ClickableAttribute? 
	 *         hintAttribute=HintAttribute?
	 *     )
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     capitalize=CapitalizeKind
	 */
	protected void sequence_CapitalizeAttribute(EObject context, CapitalizeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getCapitalizeAttribute_Capitalize()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getCapitalizeAttribute_Capitalize()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCapitalizeAttributeAccess().getCapitalizeCapitalizeKindEnumRuleCall_1_0(), semanticObject.getCapitalize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     centerHorizontal=BooleanPropertyValue
	 */
	protected void sequence_CenterHorizontalAttribute(EObject context, CenterHorizontalAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getCenterHorizontalAttribute_CenterHorizontal()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getCenterHorizontalAttribute_CenterHorizontal()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCenterHorizontalAttributeAccess().getCenterHorizontalBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getCenterHorizontal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     centerInParent=BooleanPropertyValue
	 */
	protected void sequence_CenterInParentAttribute(EObject context, CenterInParentAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getCenterInParentAttribute_CenterInParent()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getCenterInParentAttribute_CenterInParent()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCenterInParentAttributeAccess().getCenterInParentBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getCenterInParent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     centerVertical=BooleanPropertyValue
	 */
	protected void sequence_CenterVerticalAttribute(EObject context, CenterVerticalAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getCenterVerticalAttribute_CenterVertical()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getCenterVerticalAttribute_CenterVertical()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCenterVerticalAttributeAccess().getCenterVerticalBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getCenterVertical());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING preferenceAttributes=PreferenceAttributes)
	 */
	protected void sequence_CheckBoxPreference(EObject context, CheckBoxPreference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getCheckBoxPreference_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getCheckBoxPreference_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getCheckBoxPreference_PreferenceAttributes()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getCheckBoxPreference_PreferenceAttributes()));
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
	 *     (name=ID text=StringPropertyValue layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_CheckBox(EObject context, CheckBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_CheckedTextView(EObject context, CheckedTextView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     clickable=BooleanPropertyValue
	 */
	protected void sequence_ClickableAttribute(EObject context, ClickableAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getClickableAttribute_Clickable()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getClickableAttribute_Clickable()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClickableAttributeAccess().getClickableBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getClickable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (collapseColumns+=IntegerPropertyValue collapseColumns+=IntegerPropertyValue?)
	 */
	protected void sequence_CollapseColumnsAttribute(EObject context, CollapseColumnsAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=HEX_COLOR
	 */
	protected void sequence_ColorPropertyValue(EObject context, ColorPropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getColorPropertyValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getColorPropertyValue_Value()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getColorResource_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getColorResource_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColorResourceAccess().getValueHEX_COLORTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     column=IntegerPropertyValue
	 */
	protected void sequence_ColumnAttribute(EObject context, ColumnAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getColumnAttribute_Column()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getColumnAttribute_Column()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnAttributeAccess().getColumnIntegerPropertyValueParserRuleCall_1_0(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     columnWidth=DimensionPropertyValue
	 */
	protected void sequence_ColumnWidthAttribute(EObject context, ColumnWidthAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getColumnWidthAttribute_ColumnWidth()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getColumnWidthAttribute_ColumnWidth()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnWidthAttributeAccess().getColumnWidthDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getColumnWidth());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=DataTypes
	 */
	protected void sequence_DataTypesRef(EObject context, DataTypesRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getDataTypesRef_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getDataTypesRef_Type()));
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
	 *     digits=StringPropertyValue
	 */
	protected void sequence_DigitsAttribute(EObject context, DigitsAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getDigitsAttribute_Digits()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getDigitsAttribute_Digits()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDigitsAttributeAccess().getDigitsStringPropertyValueParserRuleCall_1_0(), semanticObject.getDigits());
		feeder.finish();
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getDimensionResource_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getDimensionResource_Value()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getDimensionValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getDimensionValue_Value()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getDimensionValue_Metric()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getDimensionValue_Metric()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDimensionValueAccess().getValueFLOATParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getDimensionValueAccess().getMetricDimensionMetricEnumRuleCall_1_0(), semanticObject.getMetric());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     link=[DrawableResource|QualifiedName]
	 */
	protected void sequence_DrawableResourceLink(EObject context, DrawableResourceLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getDrawableResourceLink_Link()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getDrawableResourceLink_Link()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDrawableResourceLinkAccess().getLinkDrawableResourceQualifiedNameParserRuleCall_0_1(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING preferenceAttributes=PreferenceAttributes dialogPreferenceAttributes=DialogPreferenceAttributes)
	 */
	protected void sequence_EditTextPreference(EObject context, EditTextPreference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getEditTextPreference_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getEditTextPreference_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getEditTextPreference_PreferenceAttributes()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getEditTextPreference_PreferenceAttributes()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getEditTextPreference_DialogPreferenceAttributes()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getEditTextPreference_DialogPreferenceAttributes()));
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
	 *         text=StringPropertyValue? 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         widthAttribute=WidthAttribute? 
	 *         heightAttribute=HeightAttribute? 
	 *         backgroundAttribute=BackgroundAttribute? 
	 *         clickableAttribute=ClickableAttribute? 
	 *         fadeScrollBarsAttribute=FadeScrollBarsAttribute? 
	 *         isScrollContainerAttribute=IsScrollContainerAttribute? 
	 *         autoLinkAttribute=AutoLinkAttribute? 
	 *         autoTextAttribute=AutoTextAttribute? 
	 *         capitalizeAttribute=CapitalizeAttribute? 
	 *         digitsAttribute=DigitsAttribute? 
	 *         editableAttribute=EditableAttribute? 
	 *         hintAttribute=HintAttribute? 
	 *         numericAttribute=NumericAttribute? 
	 *         passwordAttribute=PasswordAttribute? 
	 *         phoneNumberAttribute=PhoneNumberAttribute? 
	 *         singleLineAttribute=SingleLineAttribute? 
	 *         textColorAttribute=TextColorAttribute? 
	 *         typefaceAttribute=TypefaceAttribute? 
	 *         textStyleAttribute=TextStyleAttribute? 
	 *         gravityAttribute=GravityAttribute? 
	 *         textSizeAttribute=TextSizeAttribute? 
	 *         paddingAttribute=PaddingAttribute?
	 *     )
	 */
	protected void sequence_EditText(EObject context, EditText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     editable=BooleanPropertyValue
	 */
	protected void sequence_EditableAttribute(EObject context, EditableAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getEditableAttribute_Editable()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getEditableAttribute_Editable()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEditableAttributeAccess().getEditableBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getEditable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Entity|QualifiedName]
	 */
	protected void sequence_EntityTypeRef(EObject context, EntityTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getEntityTypeRef_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getEntityTypeRef_Type()));
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
	 *     entries=[ArrayResource|QualifiedName]
	 */
	protected void sequence_EntriesAttribute(EObject context, EntriesAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getEntriesAttribute_Entries()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getEntriesAttribute_Entries()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntriesAttributeAccess().getEntriesArrayResourceQualifiedNameParserRuleCall_1_0_1(), semanticObject.getEntries());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_ExpandableListView(EObject context, ExpandableListView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     externalResource=AndroidDrawableResource
	 */
	protected void sequence_ExternalDrawableResourceLink(EObject context, ExternalDrawableResourceLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getExternalDrawableResourceLink_ExternalResource()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getExternalDrawableResourceLink_ExternalResource()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalDrawableResourceLinkAccess().getExternalResourceAndroidDrawableResourceEnumRuleCall_0(), semanticObject.getExternalResource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     fadeScrollBars=BooleanPropertyValue
	 */
	protected void sequence_FadeScrollBarsAttribute(EObject context, FadeScrollBarsAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getFadeScrollBarsAttribute_FadeScrollBars()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getFadeScrollBarsAttribute_FadeScrollBars()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFadeScrollBarsAttributeAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getFadeScrollBars());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FastLayoutDimensionKind
	 */
	protected void sequence_FastLayoutStyle(EObject context, FastLayoutStyle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getFastLayoutStyle_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getFastLayoutStyle_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFastLayoutStyleAccess().getValueFastLayoutDimensionKindEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]? views+=View*)
	 */
	protected void sequence_FrameLayout(EObject context, FrameLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_Gallery(EObject context, Gallery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (gravity+=GravityKind gravity+=GravityKind*)
	 */
	protected void sequence_GravityAttribute(EObject context, GravityAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]? views+=View*)
	 */
	protected void sequence_GridLayout(EObject context, GridLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         columnWidthAttribute=ColumnWidthAttribute? 
	 *         horizontalSpacingAttribute=HorizontalSpacingAttribute? 
	 *         verticalSpacingAttribute=VerticalSpacingAttribute? 
	 *         numColumnsAttribute=NumColumnsAttribute? 
	 *         stretchModeAttribute=StretchModeAttribute? 
	 *         gravityAttribute=GravityAttribute?
	 *     )
	 */
	protected void sequence_GridView(EObject context, GridView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     height=DimensionPropertyValue
	 */
	protected void sequence_HeightAttribute(EObject context, HeightAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getHeightAttribute_Height()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getHeightAttribute_Height()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeightAttributeAccess().getHeightDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     hint=StringPropertyValue
	 */
	protected void sequence_HintAttribute(EObject context, HintAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getHintAttribute_Hint()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getHintAttribute_Hint()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHintAttributeAccess().getHintStringPropertyValueParserRuleCall_1_0(), semanticObject.getHint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     horizontalSpacing=DimensionPropertyValue
	 */
	protected void sequence_HorizontalSpacingAttribute(EObject context, HorizontalSpacingAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getHorizontalSpacingAttribute_HorizontalSpacing()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getHorizontalSpacingAttribute_HorizontalSpacing()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHorizontalSpacingAttributeAccess().getHorizontalSpacingDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getHorizontalSpacing());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         src=AnyDrawablePropertyValue 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         widthAttribute=WidthAttribute? 
	 *         heightAttribute=HeightAttribute? 
	 *         backgroundAttribute=BackgroundAttribute? 
	 *         clickableAttribute=ClickableAttribute? 
	 *         fadeScrollBarsAttribute=FadeScrollBarsAttribute? 
	 *         isScrollContainerAttribute=IsScrollContainerAttribute?
	 *     )
	 */
	protected void sequence_ImageView(EObject context, ImageView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getImport_ImportedNamespace()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getImport_ImportedNamespace()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getIntegerPropertyValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getIntegerPropertyValue_Value()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getIntegerResource_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getIntegerResource_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerResourceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIntegerResourceAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     isScrollContainer=BooleanPropertyValue
	 */
	protected void sequence_IsScrollContainerAttribute(EObject context, IsScrollContainerAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getIsScrollContainerAttribute_IsScrollContainer()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getIsScrollContainerAttribute_IsScrollContainer()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsScrollContainerAttributeAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getIsScrollContainer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     constValue=LayoutDimensionKind
	 */
	protected void sequence_LayoutDimensionPropertyValue(EObject context, LayoutDimensionPropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getLayoutDimensionPropertyValue_ConstValue()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getLayoutDimensionPropertyValue_ConstValue()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLayoutDimensionPropertyValueAccess().getConstValueLayoutDimensionKindEnumRuleCall_1_0(), semanticObject.getConstValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         weightAttribute=WeightAttribute? 
	 *         marginLeftAttribute=MarginLeftAttribute? 
	 *         marginTopAttribute=MarginTopAttribute? 
	 *         marginRightAttribute=MarginRightAttribute? 
	 *         marginBottomAttribute=MarginBottomAttribute? 
	 *         alignParentLeftAttribute=AlignParentLeftAttribute? 
	 *         alignParentTopAttribute=AlignParentTopAttribute? 
	 *         alignParentRightAttribute=AlignParentRightAttribute? 
	 *         alignParentBottomAttribute=AlignParentBottomAttribute? 
	 *         alignTopAttribute=AlignTopAttribute? 
	 *         alignBottomAttribute=AlignBottomAttribute? 
	 *         alignLeftAttribute=AlignLeftAttribute? 
	 *         belowAttribute=BelowAttribute? 
	 *         aboveAttribute=AboveAttribute? 
	 *         toLeftOfAttribute=ToLeftOfAttribute? 
	 *         toRightOfAttribute=ToRightOfAttribute? 
	 *         centerHorizontalAttribute=CenterHorizontalAttribute? 
	 *         centerInParentAttribute=CenterInParentAttribute? 
	 *         centerVerticalAttribute=CenterVerticalAttribute? 
	 *         columnAttribute=ColumnAttribute? 
	 *         spanAttribute=SpanAttribute?
	 *     )
	 */
	protected void sequence_LayoutProperties(EObject context, LayoutProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         vertical?='vertical'? 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         gravity=GravityAttribute? 
	 *         views+=View*
	 *     )
	 */
	protected void sequence_LinearLayout(EObject context, LinearLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID listitem=[View|QualifiedName] contentProvider=ContentProvider)
	 */
	protected void sequence_ListActivity(EObject context, ListActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entriesAttribute=EntriesAttribute? entryValues=[StringArrayEntry|QualifiedName])
	 */
	protected void sequence_ListPreferenceAttributes(EObject context, ListPreferenceAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_PreferenceAttributes()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_PreferenceAttributes()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_DialogPreferenceAttributes()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_DialogPreferenceAttributes()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_ListPreferenceAttributes()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getListPreference_ListPreferenceAttributes()));
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
	 *     (
	 *         name=ID 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         entriesAttribute=EntriesAttribute? 
	 *         layout=[View|QualifiedName]?
	 *     )
	 */
	protected void sequence_ListView(EObject context, ListView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     marginBottom=DimensionPropertyValue
	 */
	protected void sequence_MarginBottomAttribute(EObject context, MarginBottomAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginBottomAttribute_MarginBottom()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginBottomAttribute_MarginBottom()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarginBottomAttributeAccess().getMarginBottomDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getMarginBottom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     marginLeft=DimensionPropertyValue
	 */
	protected void sequence_MarginLeftAttribute(EObject context, MarginLeftAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginLeftAttribute_MarginLeft()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginLeftAttribute_MarginLeft()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarginLeftAttributeAccess().getMarginLeftDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getMarginLeft());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     marginRight=DimensionPropertyValue
	 */
	protected void sequence_MarginRightAttribute(EObject context, MarginRightAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginRightAttribute_MarginRight()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginRightAttribute_MarginRight()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarginRightAttributeAccess().getMarginRightDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getMarginRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     marginTop=DimensionPropertyValue
	 */
	protected void sequence_MarginTopAttribute(EObject context, MarginTopAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginTopAttribute_MarginTop()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getMarginTopAttribute_MarginTop()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarginTopAttributeAccess().getMarginTopDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getMarginTop());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (autofit?='autofit' | numColumns=IntegerPropertyValue)
	 */
	protected void sequence_NumColumnsAttribute(EObject context, NumColumnsAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (numeric+=NumericKind numeric+=NumericKind?)
	 */
	protected void sequence_NumericAttribute(EObject context, NumericAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     padding=DimensionPropertyValue
	 */
	protected void sequence_PaddingAttribute(EObject context, PaddingAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getPaddingAttribute_Padding()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getPaddingAttribute_Padding()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPaddingAttributeAccess().getPaddingDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getPadding());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     password=BooleanPropertyValue
	 */
	protected void sequence_PasswordAttribute(EObject context, PasswordAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getPasswordAttribute_Password()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getPasswordAttribute_Password()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPasswordAttributeAccess().getPasswordBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getPassword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     phoneNumber=BooleanPropertyValue
	 */
	protected void sequence_PhoneNumberAttribute(EObject context, PhoneNumberAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getPhoneNumberAttribute_PhoneNumber()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getPhoneNumberAttribute_PhoneNumber()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPhoneNumberAttributeAccess().getPhoneNumberBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getPhoneNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layout=[PreferenceScreen|QualifiedName])
	 */
	protected void sequence_PreferenceActivity(EObject context, PreferenceActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAndroidApplicationModelElement_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAndroidApplicationModelElement_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getPreferenceActivity_Layout()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getPreferenceActivity_Layout()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getProperty_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getProperty_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getProperty_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getProperty_Type()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_RadioButton(EObject context, RadioButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID orientation?='horizontal'? layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]? radiobuttons+=RadioButton+)
	 */
	protected void sequence_RadioGroup(EObject context, RadioGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID numStars=IntegerPropertyValue layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_RatingBar(EObject context, RatingBar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=LayoutDimensionPropertyValue? height=LayoutDimensionPropertyValue)
	 */
	protected void sequence_RegularLayoutStyle(EObject context, RegularLayoutStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]? views+=View*)
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResourceContentProvider_Link()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResourceContentProvider_Link()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getAbstractPreference_Title()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getRingtonePrefence_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getRingtonePrefence_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getRingtonePrefence_PreferenceAttributes()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getRingtonePrefence_PreferenceAttributes()));
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
	 *     (shrinkColumns+=IntegerPropertyValue shrinkColumns+=IntegerPropertyValue?)
	 */
	protected void sequence_ShrinkColumnsAttribute(EObject context, ShrinkColumnsAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     singleLine=BooleanPropertyValue
	 */
	protected void sequence_SingleLineAttribute(EObject context, SingleLineAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getSingleLineAttribute_SingleLine()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getSingleLineAttribute_SingleLine()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleLineAttributeAccess().getSingleLineBooleanPropertyValueParserRuleCall_1_0(), semanticObject.getSingleLine());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     span=IntegerPropertyValue
	 */
	protected void sequence_SpanAttribute(EObject context, SpanAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getSpanAttribute_Span()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getSpanAttribute_Span()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpanAttributeAccess().getSpanIntegerPropertyValueParserRuleCall_1_0(), semanticObject.getSpan());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         entriesAttribute=EntriesAttribute? 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         widthAttribute=WidthAttribute? 
	 *         heightAttribute=HeightAttribute? 
	 *         backgroundAttribute=BackgroundAttribute? 
	 *         clickableAttribute=ClickableAttribute? 
	 *         fadeScrollBarsAttribute=FadeScrollBarsAttribute? 
	 *         isScrollContainerAttribute=IsScrollContainerAttribute?
	 *     )
	 */
	protected void sequence_Spinner(EObject context, Spinner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stretchColumns+=IntegerPropertyValue stretchColumns+=IntegerPropertyValue?)
	 */
	protected void sequence_StretchColumnsAttribute(EObject context, StretchColumnsAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stretchMode=StretchModeKind
	 */
	protected void sequence_StretchModeAttribute(EObject context, StretchModeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getStretchModeAttribute_StretchMode()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getStretchModeAttribute_StretchMode()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStretchModeAttributeAccess().getStretchModeStretchModeKindEnumRuleCall_1_0(), semanticObject.getStretchMode());
		feeder.finish();
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getStringPropertyValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getStringPropertyValue_Value()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getStringResource_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getStringResource_Value()));
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
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getTab_Tag()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getTab_Tag()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getTab_Activity()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getTab_Activity()));
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
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         collapseColumnsAttribute=CollapseColumnsAttribute? 
	 *         shrinkColumnsAttribute=ShrinkColumnsAttribute? 
	 *         stretchColumnsAttribute=StretchColumnsAttribute? 
	 *         views+=View*
	 *     )
	 */
	protected void sequence_TableLayout(EObject context, TableLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]? views+=View*)
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
	 *     textColor=ColorPropertyValue
	 */
	protected void sequence_TextColorAttribute(EObject context, TextColorAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getTextColorAttribute_TextColor()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getTextColorAttribute_TextColor()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextColorAttributeAccess().getTextColorColorPropertyValueParserRuleCall_1_0(), semanticObject.getTextColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     textSize=DimensionPropertyValue
	 */
	protected void sequence_TextSizeAttribute(EObject context, TextSizeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getTextSizeAttribute_TextSize()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getTextSizeAttribute_TextSize()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextSizeAttributeAccess().getTextSizeDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getTextSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (textStyle+=TextStyleKind textStyle+=TextStyleKind*)
	 */
	protected void sequence_TextStyleAttribute(EObject context, TextStyleAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         text=StringPropertyValue? 
	 *         layoutStyle=LayoutStyle? 
	 *         layoutProperties=[LayoutProperties|QualifiedName]? 
	 *         widthAttribute=WidthAttribute? 
	 *         heightAttribute=HeightAttribute? 
	 *         backgroundAttribute=BackgroundAttribute? 
	 *         clickableAttribute=ClickableAttribute? 
	 *         fadeScrollBarsAttribute=FadeScrollBarsAttribute? 
	 *         isScrollContainerAttribute=IsScrollContainerAttribute? 
	 *         autoLinkAttribute=AutoLinkAttribute? 
	 *         autoTextAttribute=AutoTextAttribute? 
	 *         capitalizeAttribute=CapitalizeAttribute? 
	 *         digitsAttribute=DigitsAttribute? 
	 *         editableAttribute=EditableAttribute? 
	 *         hintAttribute=HintAttribute? 
	 *         numericAttribute=NumericAttribute? 
	 *         passwordAttribute=PasswordAttribute? 
	 *         phoneNumberAttribute=PhoneNumberAttribute? 
	 *         singleLineAttribute=SingleLineAttribute? 
	 *         textColorAttribute=TextColorAttribute? 
	 *         typefaceAttribute=TypefaceAttribute? 
	 *         textStyleAttribute=TextStyleAttribute? 
	 *         gravityAttribute=GravityAttribute? 
	 *         textSizeAttribute=TextSizeAttribute? 
	 *         paddingAttribute=PaddingAttribute?
	 *     )
	 */
	protected void sequence_TextView(EObject context, TextView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     toLeftOf=[View|QualifiedName]
	 */
	protected void sequence_ToLeftOfAttribute(EObject context, ToLeftOfAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getToLeftOfAttribute_ToLeftOf()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getToLeftOfAttribute_ToLeftOf()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToLeftOfAttributeAccess().getToLeftOfViewQualifiedNameParserRuleCall_1_0_1(), semanticObject.getToLeftOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     toRightOf=[View|QualifiedName]
	 */
	protected void sequence_ToRightOfAttribute(EObject context, ToRightOfAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getToRightOfAttribute_ToRightOf()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getToRightOfAttribute_ToRightOf()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToRightOfAttributeAccess().getToRightOfViewQualifiedNameParserRuleCall_1_0_1(), semanticObject.getToRightOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID textOn=StringPropertyValue textOff=StringPropertyValue layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_ToggleButton(EObject context, ToggleButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID from=[BitmapDrawableResource|ID] to=[BitmapDrawableResource|ID])
	 */
	protected void sequence_TransitionDrawableResource(EObject context, TransitionDrawableResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getResource_Name()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getTransitionDrawableResource_From()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getTransitionDrawableResource_From()));
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getTransitionDrawableResource_To()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getTransitionDrawableResource_To()));
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
	 *     typeface=TypefaceKind
	 */
	protected void sequence_TypefaceAttribute(EObject context, TypefaceAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getTypefaceAttribute_Typeface()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getTypefaceAttribute_Typeface()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypefaceAttributeAccess().getTypefaceTypefaceKindEnumRuleCall_1_0(), semanticObject.getTypeface());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     verticalSpacing=DimensionPropertyValue
	 */
	protected void sequence_VerticalSpacingAttribute(EObject context, VerticalSpacingAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getVerticalSpacingAttribute_VerticalSpacing()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getVerticalSpacingAttribute_VerticalSpacing()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVerticalSpacingAttributeAccess().getVerticalSpacingDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getVerticalSpacing());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]? backgroundAttribute=BackgroundAttribute?)
	 */
	protected void sequence_ViewElement(EObject context, ViewElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layoutStyle=LayoutStyle? layoutProperties=[LayoutProperties|QualifiedName]?)
	 */
	protected void sequence_WebView(EObject context, WebView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     weight=IntegerPropertyValue
	 */
	protected void sequence_WeightAttribute(EObject context, WeightAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getWeightAttribute_Weight()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getWeightAttribute_Weight()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWeightAttributeAccess().getWeightIntegerPropertyValueParserRuleCall_1_0(), semanticObject.getWeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     width=DimensionPropertyValue
	 */
	protected void sequence_WidthAttribute(EObject context, WidthAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AndroTextDslPackage.eINSTANCE.getWidthAttribute_Width()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroTextDslPackage.eINSTANCE.getWidthAttribute_Width()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWidthAttributeAccess().getWidthDimensionPropertyValueParserRuleCall_1_0(), semanticObject.getWidth());
		feeder.finish();
	}
}
