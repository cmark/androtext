package hu.bme.mit.androtext.gen.application;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AndroidManifestGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions generatorExtensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    StringConcatenation _generate = this.generate(androidApplication);
    fsa.generateFile("AndroidManifest.xml", IGeneratorSlots.PROJECT_SLOT, _generate);
  }
  
  public StringConcatenation generate(final TargetApplication androidApplication) {
    StringConcatenation _builder = new StringConcatenation();
    AndroidApplication _application = androidApplication.getApplication();
    final AndroidApplication application = _application;
    _builder.newLineIfNotEmpty();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("package=\"");
    String _findPackageName = this.generatorExtensions.findPackageName(androidApplication);
    _builder.append(_findPackageName, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:versionCode=\"1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:versionName=\"1.0\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<application android:icon=\"@drawable/icon\" android:label=\"@string/app_name\" android:debuggable=\"true\">");
    _builder.newLine();
    _builder.append("\t\t");
    Activity _mainActivity = application.getMainActivity();
    StringConcatenation _generateMainActivity = this.generateMainActivity(_mainActivity);
    _builder.append(_generateMainActivity, "		");
    _builder.newLineIfNotEmpty();
    {
      EList<AndroidApplicationModelElement> _modelElements = application.getModelElements();
      Iterable<Activity> _filter = IterableExtensions.<Activity>filter(_modelElements, hu.bme.mit.androtext.lang.androTextDsl.Activity.class);
      for(final Activity activity : _filter) {
        _builder.append("\t\t");
        StringConcatenation _generateActivity = this.generateActivity(activity);
        _builder.append(_generateActivity, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AndroidApplicationModelElement> _modelElements_1 = application.getModelElements();
      Iterable<DatabaseContentProvider> _filter_1 = IterableExtensions.<DatabaseContentProvider>filter(_modelElements_1, hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider.class);
      for(final DatabaseContentProvider contentProvider : _filter_1) {
        _builder.append("\t\t");
        StringConcatenation _generateContentProvider = this.generateContentProvider(contentProvider, androidApplication);
        _builder.append(_generateContentProvider, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</application>");
    _builder.newLine();
    _builder.append("</manifest>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateContentProvider(final DatabaseContentProvider contentProvider, final TargetApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<provider android:name=\".data.");
    String _className = this.generatorExtensions.className(contentProvider);
    _builder.append(_className, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:authorities=\"");
    String _authority = this.generatorExtensions.authority(application);
    _builder.append(_authority, "	");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generateMainActivity(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<activity android:label=\"@string/");
    String _activityNameValue = this.generatorExtensions.activityNameValue(activity);
    _builder.append(_activityNameValue, "");
    _builder.append("\" android:name=\".");
    String _name = activity.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<intent-filter>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<action android:name=\"android.intent.action.MAIN\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<category android:name=\"android.intent.category.LAUNCHER\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</intent-filter>");
    _builder.newLine();
    _builder.append("</activity>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateActivity(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<activity android:label=\"@string/");
    String _activityNameValue = this.generatorExtensions.activityNameValue(activity);
    _builder.append(_activityNameValue, "");
    _builder.append("\" android:name=\".");
    String _name = activity.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("\">\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</activity>");
    _builder.newLine();
    return _builder;
  }
}
