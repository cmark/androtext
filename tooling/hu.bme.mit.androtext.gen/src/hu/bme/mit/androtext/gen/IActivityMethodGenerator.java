package hu.bme.mit.androtext.gen;

import com.google.inject.ImplementedBy;

import hu.bme.mit.androtext.gen.activity.SimpleActivityMethodGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.AbstractActivity;

@ImplementedBy(SimpleActivityMethodGenerator.class)
public interface IActivityMethodGenerator {

	public CharSequence generateMethods(AbstractActivity activity);
	
}
