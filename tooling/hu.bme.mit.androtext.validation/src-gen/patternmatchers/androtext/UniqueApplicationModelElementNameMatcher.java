/*******************************************************************************
 * EMF Specific API of the androtext.uniqueApplicationModelElementName pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.androtext;

import java.util.Collection;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.ReteEngine;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.androtext.UniqueApplicationModelElementNameSignature;

/**
 * Generated domain-specific pattern matcher API of of the androtext.uniqueApplicationModelElementName pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class UniqueApplicationModelElementNameMatcher extends BaseGeneratedMatcher<UniqueApplicationModelElementNameSignature> implements IncQueryMatcher<UniqueApplicationModelElementNameSignature>{

	public final static IMatcherFactory<UniqueApplicationModelElementNameSignature,UniqueApplicationModelElementNameMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<UniqueApplicationModelElementNameSignature,UniqueApplicationModelElementNameMatcher> {
			@Override
			public UniqueApplicationModelElementNameMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new UniqueApplicationModelElementNameMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "androtext.uniqueApplicationModelElementName";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Element1 the fixed value of pattern parameter Element1, or null if not bound.
	 * @param Element2 the fixed value of pattern parameter Element2, or null if not bound.
	 * @param Name1 the fixed value of pattern parameter Name1, or null if not bound.
	 * @param Name2 the fixed value of pattern parameter Name2, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object Element1, Object Element2, Object Name1, Object Name2) {
		return getAllMatchesAsArray(new Object[] {Element1, Element2, Name1, Name2});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Element1 the fixed value of pattern parameter Element1, or null if not bound.
	 * @param Element2 the fixed value of pattern parameter Element2, or null if not bound.
	 * @param Name1 the fixed value of pattern parameter Name1, or null if not bound.
	 * @param Name2 the fixed value of pattern parameter Name2, or null if not bound.
	 * @return matches represented as a UniqueApplicationModelElementNameSignature object.
	 */
	public Collection<UniqueApplicationModelElementNameSignature> getAllMatchesAsSignature(Object Element1, Object Element2, Object Name1, Object Name2) {
		return getAllMatchesAsSignature(new Object[] {Element1, Element2, Name1, Name2});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Element1 the fixed value of pattern parameter Element1, or null if not bound.
	 * @param Element2 the fixed value of pattern parameter Element2, or null if not bound.
	 * @param Name1 the fixed value of pattern parameter Name1, or null if not bound.
	 * @param Name2 the fixed value of pattern parameter Name2, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object Element1, Object Element2, Object Name1, Object Name2) {
		return getOneMatchAsArray(new Object[] {Element1, Element2, Name1, Name2});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Element1 the fixed value of pattern parameter Element1, or null if not bound.
	 * @param Element2 the fixed value of pattern parameter Element2, or null if not bound.
	 * @param Name1 the fixed value of pattern parameter Name1, or null if not bound.
	 * @param Name2 the fixed value of pattern parameter Name2, or null if not bound.
	 * @return a match represented as a UniqueApplicationModelElementNameSignature object, or null if no match is found.
	 */
	public UniqueApplicationModelElementNameSignature getOneMatchAsSignature(Object Element1, Object Element2, Object Name1, Object Name2) {
		return getOneMatchAsSignature(new Object[] {Element1, Element2, Name1, Name2});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param Element1 the fixed value of pattern parameter Element1, or null if not bound.
	 * @param Element2 the fixed value of pattern parameter Element2, or null if not bound.
	 * @param Name1 the fixed value of pattern parameter Name1, or null if not bound.
	 * @param Name2 the fixed value of pattern parameter Name2, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object Element1, Object Element2, Object Name1, Object Name2) {
		return hasMatch(new Object[] {Element1, Element2, Name1, Name2});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param Element1 the fixed value of pattern parameter Element1, or null if not bound.
	 * @param Element2 the fixed value of pattern parameter Element2, or null if not bound.
	 * @param Name1 the fixed value of pattern parameter Name1, or null if not bound.
	 * @param Name2 the fixed value of pattern parameter Name2, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object Element1, Object Element2, Object Name1, Object Name2) {
		return countMatches(new Object[] {Element1, Element2, Name1, Name2});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "androtext.uniqueApplicationModelElementName";
	}

	private static final String[] paramNames = new String[] {"Element1", "Element2", "Name1", "Name2"};
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getParameterNames()
	 */
	@Override
	public String[] getParameterNames() {
		return paramNames;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher#tupleToSignature(org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple)
	 */
	@Override
	protected UniqueApplicationModelElementNameSignature tupleToSignature(Tuple t) {
		return new UniqueApplicationModelElementNameSignature(t.get(0), t.get(1), t.get(2), t.get(3));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public UniqueApplicationModelElementNameSignature arrayToSignature(Object[] signature) {
		return new UniqueApplicationModelElementNameSignature(signature[0], signature[1], signature[2], signature[3]);
	}	
	
	private UniqueApplicationModelElementNameMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "androtext.uniqueApplicationModelElementName");
	}
		
}
