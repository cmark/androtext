/*
 * generated by Xtext
 */
package hu.bme.mit.androtext.lang.scoping;

import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.ActivityMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.Attribute;
import hu.bme.mit.androtext.lang.androTextDsl.DataAction;
import hu.bme.mit.androtext.lang.androTextDsl.DataBinding;
import hu.bme.mit.androtext.lang.androTextDsl.DataValue;
import hu.bme.mit.androtext.lang.androTextDsl.DrawableResource;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.ListActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.View;
import hu.bme.mit.androtext.lang.androTextDsl.ViewGroup;
import hu.bme.mit.androtext.lang.attributes.AndroidAttributeList;
import hu.bme.mit.androtext.lang.attributes.IAndroidAttributeProvider;

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.scoping.impl.SingletonScope;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class AndroTextDslScopeProvider extends AbstractDeclarativeScopeProvider {
	
	@Inject 
	IQualifiedNameConverter qualifiedNameConverter;
	@Inject 
	IAndroidAttributeProvider attributeProvider;
	
	private Predicate<IEObjectDescription> rootLayoutFilterPredicate = new Predicate<IEObjectDescription>() {
		@Override
		public boolean apply(IEObjectDescription input) {
			if ("true".equals(input.getUserData("root"))) {
				return true;
			}
			return false;
		}
	};
	
	protected IScope scope_DataValue_feature(DataValue value, EReference reference) {
		if (value.eContainer() != null && value.eContainer() instanceof DataAction) {
			Entity entity = ((DataAction)value.eContainer()).getEntity();
			IScope ret = new SimpleScope(IScope.NULLSCOPE, Iterables.transform(entity.getProperties(), new Function<Property, IEObjectDescription>() {
				@Override
				public IEObjectDescription apply(Property from) {
					return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(from.getName()), from);
				}
			}));
			return ret;
		}
		return null;
	}
	
	protected IScope scope_Activity_layout(EObject context, EReference reference) {
		IScope scope = delegateGetScope(context, reference);
		// show only the second level in qualified names (zero dot, one segment)
		return new FilteringScope(scope, rootLayoutFilterPredicate);
	}
	
	protected IScope scope_LinkableLink_link(EObject context, EReference reference) {
//		System.out.println("Linkable context: " + context.eClass().getName());
		if (context instanceof Attribute) {
			String name = ((Attribute) context).getName();
			if (AndroidAttributeList.VIEWRELATIVE_ATTRIBUTES.contains(name)) {
				IScope scope = delegateGetScope(context, reference);
				return new FilteringScope(scope, new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription input) {
						EObject obj = input.getEObjectOrProxy();
						if (obj instanceof View) {
							return true;
						}
						return false;
					}
				});
			} else if (AndroidAttributeList.DRAWABLE_ATTRIBUTES.contains(name)) {
				IScope scope = delegateGetScope(context, reference);
				return new FilteringScope(scope, new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription input) {
						EObject obj = input.getEObjectOrProxy();
						if (obj instanceof DrawableResource) {
							return true;
						}
						return false;
					}
				});
			} else {
				// any other attribute type does'nt refer to other EObjects.
				return IScope.NULLSCOPE;
			}
		}
		if (context instanceof ActivityMenuItem) {
			IScope scope = delegateGetScope(context, reference);
			return new FilteringScope(scope, new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription input) {
					EObject obj = input.getEObjectOrProxy();
					if (obj instanceof DrawableResource) {
						return true;
					}
					return false;
				}
			});
		}
		return null;
	}
	
	/**
	 * Custom scope for projection. Projection only allowed for the properties of the databinding's entity.
	 * @param context
	 * @param ref
	 * @return
	 */
	protected IScope scope_DataBinding_projection(DataBinding context, EReference ref) {
		if (context.getEntity() != null) {
			Entity entity = context.getEntity();
			IScope ret = new SimpleScope(IScope.NULLSCOPE, Iterables.transform(entity.getProperties(), new Function<Property, IEObjectDescription>() {
				@Override
				public IEObjectDescription apply(Property from) {
					return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(from.getName()), from);
				}
			}));
			return ret;
		}
		return IScope.NULLSCOPE;
	}
	
	/**
	 * Custom scope for Databinding target Views.
	 * @param context
	 * @param ref
	 * @return
	 */
	protected IScope scope_DataBinding_target(DataBinding context, EReference ref) {
		if (context.eContainer() instanceof ListActivity) {
			View li = ((ListActivity)context.eContainer()).getListitem();
			if (li != null) {
				return getScopeForView(li);
			}
		}
		if (context.eContainer() instanceof Activity) {
			View layout = ((Activity)context.eContainer()).getLayout();
			if (layout != null) {
				return getScopeForView(layout);
			}
		}
		return IScope.NULLSCOPE;
	}
	
	private IScope getScopeForView(View layout) {
		if (layout instanceof ViewGroup) {
			// TODO iterate over the hierarchy
			IScope ret = new SimpleScope(IScope.NULLSCOPE, Iterables.transform(((ViewGroup) layout).getViews(), new Function<View, IEObjectDescription>() {
				@Override
				public IEObjectDescription apply(View from) {
					if (!(from instanceof ViewGroup)) {
						return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(from.getName()), from);	
					}
					return null;
				}
			}));
			return ret;
		} else {
			IScope ret = new SingletonScope(EObjectDescription.create(qualifiedNameConverter.toQualifiedName(layout.getName()), layout), IScope.NULLSCOPE);
			return ret;
		}
	}

	protected Predicate<Method> getPredicate(EObject context, EClass type) {
		String methodName = "scope_" + type.getName();
//		System.out.println(methodName);
		return PolymorphicDispatcher.Predicates.forName(methodName, 2);
	}

	protected Predicate<Method> getPredicate(EObject context, EReference reference) {
		String methodName = "scope_" + reference.getEContainingClass().getName() + "_" + reference.getName();
//		System.out.println(methodName);
		return PolymorphicDispatcher.Predicates.forName(methodName, 2);
	}
	
}
