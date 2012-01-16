/*******************************************************************************
 * Pattern signature of the androtext.uniqueApplicationModelElementName pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.androtext;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the androtext.uniqueApplicationModelElementName pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class UniqueApplicationModelElementNameSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public UniqueApplicationModelElementNameSignature(Object Element1, Object Element2, Object Name1, Object Name2) {
		this.fElement1 = Element1;
		this.fElement2 = Element2;
		this.fName1 = Name1;
		this.fName2 = Name2;	
	}

	//private attributes
	private Object fElement1;
	private Object fElement2;
	private Object fName1;
	private Object fName2;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("Element1".equals(parameterName)) return fElement1;
		if ("Element2".equals(parameterName)) return fElement2;
		if ("Name1".equals(parameterName)) return fName1;
		if ("Name2".equals(parameterName)) return fName2;
		return null;
	}	
	
	public Object getValueOfElement1(){
		 return fElement1;
	}
	public Object getValueOfElement2(){
		 return fElement2;
	}
	public Object getValueOfName1(){
		 return fName1;
	}
	public Object getValueOfName2(){
		 return fName2;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("Element1".equals(parameterName)) {
			fElement1 = newValue;
			return true;
		}
		if ("Element2".equals(parameterName)) {
			fElement2 = newValue;
			return true;
		}
		if ("Name1".equals(parameterName)) {
			fName1 = newValue;
			return true;
		}
		if ("Name2".equals(parameterName)) {
			fName2 = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfElement1(Object Element1){
		 this.fElement1=Element1;
	}
	public void setValueOfElement2(Object Element2){
		 this.fElement2=Element2;
	}
	public void setValueOfName1(Object Name1){
		 this.fName1=Name1;
	}
	public void setValueOfName2(Object Name2){
		 this.fName2=Name2;
	}

	// overridden prettyPrint(), hashCode(), equals() with Tuple-semantics
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (! (obj instanceof IPatternSignature))
			return false;
		IPatternSignature otherSig = (IPatternSignature) obj;
		if (!patternName().equals(otherSig.patternName()))
			return false;
		if (!UniqueApplicationModelElementNameSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		UniqueApplicationModelElementNameSignature other = (UniqueApplicationModelElementNameSignature) obj;
		if (fElement1 == null) {if (other.fElement1 != null) return false;}
		else if (!fElement1.equals(other.fElement1)) return false;
		if (fElement2 == null) {if (other.fElement2 != null) return false;}
		else if (!fElement2.equals(other.fElement2)) return false;
		if (fName1 == null) {if (other.fName1 != null) return false;}
		else if (!fName1.equals(other.fName1)) return false;
		if (fName2 == null) {if (other.fName2 != null) return false;}
		else if (!fName2.equals(other.fName2)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fElement1 == null) ? 0 : fElement1.hashCode());
		result = prime * result + ((fElement2 == null) ? 0 : fElement2.hashCode());
		result = prime * result + ((fName1 == null) ? 0 : fName1.hashCode());
		result = prime * result + ((fName2 == null) ? 0 : fName2.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"Element1\"=" + prettyPrintValue(fElement1));
		result.append(", \"Element2\"=" + prettyPrintValue(fElement2));
		result.append(", \"Name1\"=" + prettyPrintValue(fName1));
		result.append(", \"Name2\"=" + prettyPrintValue(fName2));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fElement1, fElement2, fName1, fName2};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "androtext.uniqueApplicationModelElementName";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"Element1", "Element2", "Name1", "Name2"};
	
	
}
