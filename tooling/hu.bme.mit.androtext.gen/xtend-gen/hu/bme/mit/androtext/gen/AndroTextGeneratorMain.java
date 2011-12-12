package hu.bme.mit.androtext.gen;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IMainGenerator;
import hu.bme.mit.androtext.gen.activity.AbstractActivityClassGenerator;
import hu.bme.mit.androtext.gen.activity.ActivityClassGenerator;
import hu.bme.mit.androtext.gen.application.AndroidManifestGenerator;
import hu.bme.mit.androtext.gen.entity.EntityClassGenerator;
import hu.bme.mit.androtext.gen.entity.EntityTableGenerator;
import hu.bme.mit.androtext.gen.layout.LayoutResourceGenerator;
import hu.bme.mit.androtext.gen.layout.TabLayoutGenerator;
import hu.bme.mit.androtext.gen.resources.BasicAndroidInformationValuesGenerator;
import hu.bme.mit.androtext.gen.resources.StringArrayResourceGenerator;
import hu.bme.mit.androtext.gen.selector.SelectorGenerator;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class AndroTextGeneratorMain implements IMainGenerator {
  @Inject
  private EntityClassGenerator entityClassGenerator;
  
  @Inject
  private EntityTableGenerator entityTableGenerator;
  
  @Inject
  private AndroidManifestGenerator manifestGenerator;
  
  @Inject
  private BasicAndroidInformationValuesGenerator basicValueGenerator;
  
  @Inject
  private StringArrayResourceGenerator stringArrayResourceGenerator;
  
  @Inject
  private AbstractActivityClassGenerator abstractActivityClassGenerator;
  
  @Inject
  private ActivityClassGenerator activityClassGenerator;
  
  @Inject
  private LayoutResourceGenerator layoutGenerator;
  
  @Inject
  private TabLayoutGenerator tabLayoutGenerator;
  
  @Inject
  private SelectorGenerator selectorGenerator;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication targetApplication) {
      AndroidApplication _application = targetApplication.getApplication();
      AndroDataModelRoot _dataroot = _application.getDataroot();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_dataroot, null);
      if (_operator_notEquals) {
        {
          this.entityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
          this.entityTableGenerator.doGenerate(resourceSet, fsa, targetApplication);
        }
      }
      this.manifestGenerator.doGenerate(resourceSet, fsa, targetApplication);
      this.basicValueGenerator.doGenerate(resourceSet, fsa, targetApplication);
      this.stringArrayResourceGenerator.doGenerate(resourceSet, fsa, targetApplication);
      this.abstractActivityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
      this.activityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
      this.layoutGenerator.doGenerate(resourceSet, fsa, targetApplication);
      this.tabLayoutGenerator.doGenerate(resourceSet, fsa, targetApplication);
      this.selectorGenerator.doGenerate(resourceSet, fsa, targetApplication);
  }
}
