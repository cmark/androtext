package hu.bme.mit.androtext.lang.validation;

import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_ACTIVITY;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_ATTRIBUTE;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_CONTENTPROVIDER;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_DATAACTION_VALUE_SET;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_ENTITY;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_INTENTFILTER;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_LAYOUTSTYLE_ATTRIBUTE;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_MENUELEMENT;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_RESOURCE;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_TARGET_APP_PROJECT;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.DUPLICATE_VIEW;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.ENTITY_NOT_IN_PROVIDER;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.INVALID_ATTRIBUTE;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.MISSING_LAYOUTSTYLE_ATTRIBUTE;
import static hu.bme.mit.androtext.lang.validation.AndroTextIssueCodes.WRONG_DATAVALUE_VALUE_TYPE;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenu;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGenModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGuiModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroResModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.Attribute;
import hu.bme.mit.androtext.lang.androTextDsl.ContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.DataAction;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.DataTypesRef;
import hu.bme.mit.androtext.lang.androTextDsl.DataValue;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.TableLayout;
import hu.bme.mit.androtext.lang.androTextDsl.TableRow;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;
import hu.bme.mit.androtext.lang.attributes.AndroidAttributeList;
import hu.bme.mit.androtext.lang.attributes.IAndroidAttributeProvider;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.StringExtensions;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

/**
 * <p>
 * Validation rules.
 * </p>
 * @author Mark Czotter
 * 
 */
public class AndroTextDslJavaValidator extends
		AbstractAndroTextDslJavaValidator {
	
	@Inject IAndroidAttributeProvider attributeProvider;
	
	@Check
	public void checkAttribute(Attribute attribute) {
		EObject container = attribute.eContainer();
		if (container == null || StringExtensions.isNullOrEmpty(attribute.getName())) return;
		// check if the attribute is a valid attribute
		if (attributeProvider.provideAttribute(container).contains(
				attribute.getName())) {
			if (container instanceof View) {
				for (Attribute a : ((View) container).getAttributes()) {
					if (!a.equals(attribute)
							&& a.getName().equals(attribute.getName())) {
						error("Duplicate attribute " + a.getName(), a,
								AndroTextDslPackage.eINSTANCE
										.getAttribute_Name(),
								DUPLICATE_ATTRIBUTE);
						error("Duplicate attribute " + attribute.getName(), attribute,
								AndroTextDslPackage.eINSTANCE
										.getAttribute_Name(),
								DUPLICATE_ATTRIBUTE);
					}
				}
			}
		} else {
			error("Attribute " + attribute.getName()
					+ " not exists (or not supported) in the context of "
					+ container.eClass().getName(),
					AndroTextDslPackage.eINSTANCE.getAttribute_Name(),
					INVALID_ATTRIBUTE);
		}
	}
	
	@Check
	public void checkDataAction(DataAction action) {
		for (int i = 0; i < action.getValues().size(); ++i) {
			Property leftProp = action.getValues().get(i).getFeature();
			for (int j = i + 1; j < action.getValues().size(); ++j) {
				Property rightProp = action.getValues().get(j).getFeature();
				if (leftProp.equals(rightProp)) {
					error("Duplicate value set for property '" + leftProp.getName() + "'!", AndroTextDslPackage.eINSTANCE.getDataAction_Values(), i, DUPLICATE_DATAACTION_VALUE_SET);
					error("Duplicate value set for property '" + rightProp.getName() + "'!", AndroTextDslPackage.eINSTANCE.getDataAction_Values(), j, DUPLICATE_DATAACTION_VALUE_SET);
				}
			}
		}
	}
	
	@Check
	public void checkDataValue(DataValue value) {
		if (value.getFeature() != null && value.getValue() != null) {
			if (value.getValue().isEmpty()) {
				error("The value is empty!", AndroTextDslPackage.eINSTANCE.getDataValue_Value());
			}
			if (value.getFeature().getType() instanceof DataTypesRef) {
				switch (((DataTypesRef)value.getFeature().getType()).getType()) {
				case BOOLEAN:
					if (!("true".equals(value.getValue())) && !("false".equals(value.getValue()))) {
						error("The value '" +value.getValue()+ "' is not applicable for the type Boolean!", AndroTextDslPackage.eINSTANCE.getDataValue_Value(), WRONG_DATAVALUE_VALUE_TYPE);
					}
					break;
				case FLOAT:
					try {
						Float.parseFloat(value.getValue());
					} catch (NumberFormatException e) {
						error("The value '" +value.getValue()+ "' is not applicable for the type Float!", AndroTextDslPackage.eINSTANCE.getDataValue_Value(), WRONG_DATAVALUE_VALUE_TYPE);
					}
					break;
				case INT:
					try {
						Integer.parseInt(value.getValue());
					} catch (NumberFormatException e) {
						error("The value '" +value.getValue()+ "' is not applicable for the type Integer!", AndroTextDslPackage.eINSTANCE.getDataValue_Value(), WRONG_DATAVALUE_VALUE_TYPE);
					}
					break;
				default:
					break;
				}
			}
		}
	}
	
	@Check
	public void checkActivityMenu(ActivityMenu menu) {
		for (int i = 0; i < menu.getMenuElements().size(); ++i) {
			String leftName = menu.getMenuElements().get(i).getName();
			for (int j = i + 1; j < menu.getMenuElements().size(); ++j) {
				String rightName = menu.getMenuElements().get(j).getName();
				if (leftName.equals(rightName)) {
					error("Duplicate menu element '" + leftName + "'!", AndroTextDslPackage.eINSTANCE.getActivityMenu_MenuElements(), i, DUPLICATE_MENUELEMENT);
					error("Duplicate menu element '" + rightName + "'!", AndroTextDslPackage.eINSTANCE.getActivityMenu_MenuElements(), j, DUPLICATE_MENUELEMENT);
				}
			}
		}
	}
	
	@Check
	public void checkIntentFilters(AbstractActivity activity) {
		for (int i = 0; i < activity.getIntentFilters().size(); ++i) {
			String leftName = activity.getIntentFilters().get(i).getName();
			for (int j = i + 1; j < activity.getIntentFilters().size(); ++j) {
				String rightName = activity.getIntentFilters().get(j).getName();
				if (leftName.equals(rightName)) {
					error("Duplicate intent-filter '" + leftName + "'!", AndroTextDslPackage.eINSTANCE.getAbstractActivity_IntentFilters(), i, DUPLICATE_INTENTFILTER);
					error("Duplicate intent-filter '" + rightName + "'!", AndroTextDslPackage.eINSTANCE.getAbstractActivity_IntentFilters(), j, DUPLICATE_INTENTFILTER);
				}
			}
		}
	}
	
	@Check
	public void checkGeneratorTargets(AndroGenModelRoot modelRoot) {
		for (int i = 0; i < modelRoot.getTargetApplications().size(); ++i) {
			String leftName = modelRoot.getTargetApplications().get(i).getProjectName();
			for (int j = i + 1; j < modelRoot.getTargetApplications().size(); ++j) {
				String rightName = modelRoot.getTargetApplications().get(j).getProjectName();
				if (leftName.equals(rightName)) {
					error("Duplicate generator target project '" + leftName + "'!", AndroTextDslPackage.eINSTANCE.getAndroGenModelRoot_TargetApplications(), i, DUPLICATE_TARGET_APP_PROJECT);
					error("Duplicate generator target project '" + rightName + "'!", AndroTextDslPackage.eINSTANCE.getAndroGenModelRoot_TargetApplications(), j, DUPLICATE_TARGET_APP_PROJECT);
				}
			}
		}
	}
	
	@Check
	public void checkViewLayout(View view) {
		// TableRow can define own layout properties
		if (view instanceof TableRow) return;
		if (view.eContainer() instanceof TableRow) return;
		if (view.eContainer() instanceof TableLayout) return;
		Map<String, Attribute> nameToAttributeMap = Maps.uniqueIndex(view.getAttributes(), new Function<Attribute, String>() {
			@Override
			public String apply(Attribute from) {
				return from.getName();
			}
		});
		for (String layoutAttr : AndroidAttributeList.VIEWGROUP_LAYOUTPARAMS) {
			Attribute obj = nameToAttributeMap.get(layoutAttr);
			if (view.getLayoutStyle() == null && obj == null) {
				error("Missing layout (or fastlayout) attribute: " + layoutAttr, view, AndroTextDslPackage.eINSTANCE.getLinkable_Name(), MISSING_LAYOUTSTYLE_ATTRIBUTE);
			}
			if (view.getLayoutStyle() != null && obj != null) {
				error("Layout attribute '"+layoutAttr+"' was already defined (see easy layouting)!", view, AndroTextDslPackage.eINSTANCE.getLinkable_Name(), DUPLICATE_LAYOUTSTYLE_ATTRIBUTE);
			}
		}
	}

	@Check
	public void checkAndroidApplication(AndroidApplication application) {
		if (application.getMainActivity() == null) {
			warning("Must define an Activity component as entry point.", AndroTextDslPackage.eINSTANCE.getAndroidApplication_Name());
			return;
		}
		List<AbstractActivity> activities = Lists.newArrayList(Iterables.filter(application.getComponents(), AbstractActivity.class));
		activities.add(application.getMainActivity());
		List<ContentProvider> contentProviders = Lists.newArrayList(Iterables.filter(application.getComponents(), ContentProvider.class));
		for (int i = 0; i < contentProviders.size(); ++i) {
			String leftName = contentProviders.get(i).getName();
			for (int j = i + 1; j < contentProviders.size(); ++j) {
				String rightName = contentProviders.get(j).getName();
				if (leftName.equals(rightName)) {
					error("Duplicate contentprovider '" + leftName + "'", AndroTextDslPackage.eINSTANCE.getAndroidApplication_Components(), i, DUPLICATE_CONTENTPROVIDER);
					error("Duplicate contentprovider '" + rightName + "'", AndroTextDslPackage.eINSTANCE.getAndroidApplication_Components(), j, DUPLICATE_CONTENTPROVIDER);
				}
			}
		}
		for (int i = 0; i < activities.size(); ++i) {
			String leftName = activities.get(i).getName();
			for (int j = i + 1; j < activities.size(); ++j) {
				String rightName = activities.get(j).getName();
				if (leftName.equals(rightName)) {
					if (activities.get(i) == application.getMainActivity()) {
						error("Duplicate activity '" + leftName + "'", application.getMainActivity(), AndroTextDslPackage.eINSTANCE.getAndroidApplicationComponent_Name(), DUPLICATE_ACTIVITY);
						error("Duplicate activity '" + rightName + "'", application.getComponents().get(j), AndroTextDslPackage.eINSTANCE.getAndroidApplicationComponent_Name(), DUPLICATE_ACTIVITY);
					} else if (activities.get(j) == application.getMainActivity()) {
						error("Duplicate activity '" + leftName + "'", application.getComponents().get(i), AndroTextDslPackage.eINSTANCE.getAndroidApplicationComponent_Name(), DUPLICATE_ACTIVITY);
						error("Duplicate activity '" + rightName + "'", application.getMainActivity(), AndroTextDslPackage.eINSTANCE.getAndroidApplicationComponent_Name(), DUPLICATE_ACTIVITY);
					} else {
						error("Duplicate activity '" + leftName + "'", application.getComponents().get(i), AndroTextDslPackage.eINSTANCE.getAndroidApplicationComponent_Name(), DUPLICATE_ACTIVITY);
						error("Duplicate activity '" + rightName + "'", application.getComponents().get(j), AndroTextDslPackage.eINSTANCE.getAndroidApplicationComponent_Name(), DUPLICATE_ACTIVITY);
					}
				}
			}
		}
	}
	
	@Check
	public void checkResourceModel(AndroResModelRoot modelRoot) {
		for (int i = 0; i < modelRoot.getResources().size(); ++i) {
			String leftName = modelRoot.getResources().get(i).getName();
			for (int j = i + 1; j < modelRoot.getResources().size(); ++j) {
				String rightName = modelRoot.getResources().get(j).getName();
				if (leftName.equals(rightName)) {
					error("Duplicate resource '" + leftName + "'", AndroTextDslPackage.eINSTANCE.getAndroResModelRoot_Resources(), i, DUPLICATE_RESOURCE);
					error("Duplicate resource '" + rightName + "'", AndroTextDslPackage.eINSTANCE.getAndroResModelRoot_Resources(), j, DUPLICATE_RESOURCE);
				}
			}
		}
	}
	
	public void checkAndroGuiModelRoot(AndroGuiModelRoot modelRoot) {
		for (int i = 0; i < modelRoot.getRoots().size(); ++i) {
			String leftName = modelRoot.getRoots().get(i).getName();
			for (int j = i + 1; j < modelRoot.getRoots().size(); ++j) {
				String rightName = modelRoot.getRoots().get(j).getName();
				if (leftName.equals(rightName)) {
					error("Duplicate view '" + leftName + "'", AndroTextDslPackage.eINSTANCE.getAndroGuiModelRoot_Roots(), i, DUPLICATE_VIEW);
					error("Duplicate view '" + rightName + "'", AndroTextDslPackage.eINSTANCE.getAndroGuiModelRoot_Roots(), j, DUPLICATE_VIEW);
				}
			}
		}
	}
	
	@Check
	public void checkViewGroup(ViewGroup viewGroup) {
		for (int i = 0; i < viewGroup.getViews().size(); ++i) {
			String leftName = viewGroup.getViews().get(i).getName();
			for (int j = i + 1; j < viewGroup.getViews().size(); ++j) {
				String rightName = viewGroup.getViews().get(j).getName();
				if (leftName.equals(rightName)) {
					error("Duplicate view '" + leftName + "'", AndroTextDslPackage.eINSTANCE.getViewGroup_Views(), i, DUPLICATE_VIEW);
					error("Duplicate view '" + rightName + "'", AndroTextDslPackage.eINSTANCE.getViewGroup_Views(), j, DUPLICATE_VIEW);
				}
			}
		}
	}
	
	@Check
	public void checkDataModel(AndroDataModelRoot modelRoot) {
		for (int i = 0; i < modelRoot.getEntities().size(); ++i) {
			String leftName = modelRoot.getEntities().get(i).getName();
			for (int j = i + 1; j < modelRoot.getEntities().size(); ++j) {
				String rightName = modelRoot.getEntities().get(j).getName();
				if (leftName.equals(rightName)) {
					error("Duplicate entity '" + leftName + "'", AndroTextDslPackage.eINSTANCE.getAndroDataModelRoot_Entities(), i, DUPLICATE_ENTITY);
					error("Duplicate entity '" + rightName + "'", AndroTextDslPackage.eINSTANCE.getAndroDataModelRoot_Entities(), j, DUPLICATE_ENTITY);
				}
			}
		}
	}
	
	@Check
	public void checkDataBinding(DataBinding binding) {
		if (binding.getEntity() != null
				&& binding.getContentProvider() != null
				&& !checkEntityInContentProvider(binding.getEntity(),
						binding.getContentProvider())) {
			error("Entity '" + binding.getEntity().getName()
					+ "' does not exist in provider '"
					+ binding.getContentProvider().getName() + "'",
					binding,
					AndroTextDslPackage.eINSTANCE.getDataBinding_Entity(),
					ENTITY_NOT_IN_PROVIDER);
		}
	}
	
	private boolean checkEntityInContentProvider(Entity entity,
			ContentProvider contentProvider) {
		if (contentProvider instanceof DatabaseContentProvider) {
			if (((DatabaseContentProvider) contentProvider).getDatamodel().getEntities().contains(entity)) {
				return true;
			}
		}
		return false;
	}

}
