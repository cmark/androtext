package hu.bme.mit.androtext.lang.attributes;

import hu.bme.mit.androtext.lang.androTextDsl.Attribute;
import hu.bme.mit.androtext.lang.androTextDsl.FrameLayout;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class DefaultAndroidAttributeProvider implements
		IAndroidAttributeProvider {

	private Logger logger = Logger.getLogger(getClass());
	
	@Override
	public List<String> provideAttribute(EObject eObject) {
		EObject context = eObject;
		if (eObject instanceof Attribute) {
			context = eObject.eContainer();
		}
		if (context instanceof View) {
			return provideAttributes((View) context);	
		}
		return Lists.newArrayList();
	}
	
	private List<String> provideAttributes(View context) {
		Iterable<String> viewAttributes = getViewAttributes(context);
		Iterable<String> layoutAttributes = getLayoutAttributes(context);
		return IterableExtensions.toList(Iterables.concat(viewAttributes, layoutAttributes));
	}
	
	private Iterable<String> getLayoutAttributes(View context) {
		EObject contextContainer = context.eContainer();
		Iterable<String> layoutAttributes = null;
		if (contextContainer instanceof ViewGroup) {
			ViewGroup layout = (ViewGroup) contextContainer;
			layoutAttributes = getLayoutAttributes(layout.eClass().getName());
		} 
		if (layoutAttributes == null) {
			layoutAttributes = getLayoutAttributes(FrameLayout.class.getSimpleName());
		}
		return layoutAttributes;
	}

	private Iterable<String> getViewAttributes(View context) {
		Field attributeField = null;
		String semanticObjectName = context.eClass().getName().toUpperCase();
		try {
			attributeField = AndroidAttributeList.class.getField(semanticObjectName + "_ATTRIBUTES");
		} catch(Exception e) {
			logger.info("Attribute field not provided for " + semanticObjectName + "! Using default VIEW_ATTRIBUTES.");
		}
		try {
			if (attributeField == null) {
				// fall back to simple View attributes
				attributeField = AndroidAttributeList.class.getField("VIEW_ATTRIBUTES");
			}
			// get the value from the static field
			Object attributeFieldValue = attributeField.get(null);
			if (attributeFieldValue instanceof Iterable<?>) {
				return (Iterable<String>) attributeFieldValue;	
			}
		} catch (Exception e) {
			logger.error("Error when retrieving "+attributeField.getName()+" field value!");
		}
		return null;
	}

	private Iterable<String> getLayoutAttributes(String viewGroupClassName) {
		Field layoutField = null;
		String semanticObjectName = viewGroupClassName.toUpperCase();
		try {
			layoutField = AndroidAttributeList.class.getField(semanticObjectName + "_LAYOUTPARAMS");
		} catch (Exception e) {
			logger.info("LayoutParams field not provided for " + semanticObjectName + "!", e);
		}
		if (layoutField == null) return null;
		try {
			Object layoutParamsFieldValue = layoutField.get(null);;
			if (layoutParamsFieldValue instanceof Iterable<?>) {
				return (Iterable<String>) layoutParamsFieldValue;
			}
		} catch (Exception e) {
			logger.error("Error when retrieving "+layoutField.getName()+" field value!", e);
		}
		return null;
	}

}
