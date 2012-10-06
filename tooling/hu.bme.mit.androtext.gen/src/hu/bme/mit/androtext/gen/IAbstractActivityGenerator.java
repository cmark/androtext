package hu.bme.mit.androtext.gen;

import hu.bme.mit.androtext.gen.activity.AbstractActivityClassGenerator;

import com.google.inject.ImplementedBy;

@ImplementedBy(AbstractActivityClassGenerator.class)
public interface IAbstractActivityGenerator extends IGenerator {

}
