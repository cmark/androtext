package hu.bme.mit.androtext.validation.ui.handlers;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;
import org.eclipse.viatra2.emf.incquery.validation.core.Constraint;

import patternmatchers.androtext.RestitutionOutOfRangeMatcher;
import signatures.androtext.RestitutionOutOfRangeSignature;

/**
 * Constraint generated for restitutionOutOfRange
 *
 */
public class RestitutionOutOfRangeConstraint extends Constraint<RestitutionOutOfRangeSignature> {
	
	@Override
	public IMatcherFactory<RestitutionOutOfRangeSignature, ? extends IncQueryMatcher<RestitutionOutOfRangeSignature>> matcherFactory() {
		return RestitutionOutOfRangeMatcher.FACTORY;
	}
	
	@Override
	public String getMessage(RestitutionOutOfRangeSignature signature) {
		String message = "Restitution of fixture $F$ must be lower or equal than 1.0!";
		
		StringTokenizer st = new StringTokenizer(message, "$");
		StringBuilder messageBuilder = new StringBuilder();
		List<String> parameterNames = Arrays.asList(signature.parameterNames());
		
		boolean nextTokenIsParameter = false;
		if(!message.startsWith("$")){
			messageBuilder.append(st.nextToken());
			nextTokenIsParameter = true;
		}
		// stores whether the next token is part of the text or between $ marks
		
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			
			if(nextTokenIsParameter){
				StringTokenizer pt = new StringTokenizer(token, ".");
				if(pt.hasMoreTokens()){
					String paramName = pt.nextToken();				
					if(parameterNames.contains(paramName)){
						Object param = signature.get(paramName);
						if(pt.hasMoreTokens()){
							String featureName = pt.nextToken();
							messageBuilder.append(BasePatternSignature.prettyPrintFeature(param, featureName));
						} else {
							messageBuilder.append(BasePatternSignature.prettyPrintValue(param));
						}
					}
				}
			} else {
				messageBuilder.append(token);
			}
			nextTokenIsParameter = !nextTokenIsParameter;
		}
		message = messageBuilder.toString();
		
		return message;
	}

	@Override
	public EObject getLocationObject(RestitutionOutOfRangeSignature signature) {
		Object location = signature.get("F");
		if(location instanceof EObject){
			return (EObject) location;
		}
		return null;
	}

}
