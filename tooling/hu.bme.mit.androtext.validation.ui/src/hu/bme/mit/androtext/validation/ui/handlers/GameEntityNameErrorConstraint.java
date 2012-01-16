package hu.bme.mit.androtext.validation.ui.handlers;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;
import org.eclipse.viatra2.emf.incquery.validation.core.Constraint;

import patternmatchers.androtext.GameEntityNameErrorMatcher;
import signatures.androtext.GameEntityNameErrorSignature;

/**
 * Constraint generated for gameEntityNameError
 *
 */
public class GameEntityNameErrorConstraint extends Constraint<GameEntityNameErrorSignature> {
	
	@Override
	public IMatcherFactory<GameEntityNameErrorSignature, ? extends IncQueryMatcher<GameEntityNameErrorSignature>> matcherFactory() {
		return GameEntityNameErrorMatcher.FACTORY;
	}
	
	@Override
	public String getMessage(GameEntityNameErrorSignature signature) {
		String message = "GameEntity";
		
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
	public EObject getLocationObject(GameEntityNameErrorSignature signature) {
		Object location = signature.get("GE");
		if(location instanceof EObject){
			return (EObject) location;
		}
		return null;
	}

}
