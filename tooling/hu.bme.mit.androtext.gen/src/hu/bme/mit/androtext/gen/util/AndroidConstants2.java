package hu.bme.mit.androtext.gen.util;

import com.android.AndroidConstants;
import com.android.ide.common.layout.LayoutConstants;
import com.android.ide.eclipse.adt.AdtConstants;
import com.android.resources.Density;
import com.android.sdklib.SdkConstants;

@SuppressWarnings("restriction")
public interface AndroidConstants2 {

	public static final String BIN_DIRECTORY = SdkConstants.FD_OUTPUT
			+ AdtConstants.WS_SEP;

	public static final String BIN_CLASSES_DIRECTORY = SdkConstants.FD_OUTPUT
			+ AdtConstants.WS_SEP + SdkConstants.FD_CLASSES_OUTPUT
			+ AdtConstants.WS_SEP;

	public static final String RES_DIRECTORY = SdkConstants.FD_RESOURCES
			+ AdtConstants.WS_SEP;

	public static final String ASSETS_DIRECTORY = SdkConstants.FD_ASSETS
			+ AdtConstants.WS_SEP;

	public static final String DRAWABLE_DIRECTORY = AndroidConstants.FD_RES_DRAWABLE
			+ AdtConstants.WS_SEP;

	public static final String DRAWABLE_HDPI_DIRECTORY = AndroidConstants.FD_RES_DRAWABLE
			+ "-" + Density.HIGH.getResourceValue() + AdtConstants.WS_SEP; //$NON-NLS-1$
	public static final String DRAWABLE_MDPI_DIRECTORY = AndroidConstants.FD_RES_DRAWABLE
			+ "-" + Density.MEDIUM.getResourceValue() + AdtConstants.WS_SEP; //$NON-NLS-1$
	public static final String DRAWABLE_LDPI_DIRECTORY = AndroidConstants.FD_RES_DRAWABLE
			+ "-" + Density.LOW.getResourceValue() + AdtConstants.WS_SEP; //$NON-NLS-1$
	public static final String LAYOUT_DIRECTORY = AndroidConstants.FD_RES_LAYOUT
			+ AdtConstants.WS_SEP;
	public static final String VALUES_DIRECTORY = AndroidConstants.FD_RES_VALUES
			+ AdtConstants.WS_SEP;
	public static final String XML_DIRECTORY = AndroidConstants.FD_RES_XML
			+ AdtConstants.WS_SEP;

	public static final String GEN_SRC_DIRECTORY = SdkConstants.FD_GEN_SOURCES
			+ AdtConstants.WS_SEP;

	public static final String TEMPLATES_DIRECTORY = "templates/"; //$NON-NLS-1$
	public static final String TEMPLATE_MANIFEST = TEMPLATES_DIRECTORY
			+ "AndroidManifest.template"; //$NON-NLS-1$
	public static final String TEMPLATE_ACTIVITIES = TEMPLATES_DIRECTORY
			+ "activity.template"; //$NON-NLS-1$
	public static final String TEMPLATE_USES_SDK = TEMPLATES_DIRECTORY
			+ "uses-sdk.template"; //$NON-NLS-1$
	public static final String TEMPLATE_INTENT_LAUNCHER = TEMPLATES_DIRECTORY
			+ "launcher_intent_filter.template"; //$NON-NLS-1$
	public static final String TEMPLATE_TEST_USES_LIBRARY = TEMPLATES_DIRECTORY
			+ "test_uses-library.template"; //$NON-NLS-1$
	public static final String TEMPLATE_TEST_INSTRUMENTATION = TEMPLATES_DIRECTORY
			+ "test_instrumentation.template"; //$NON-NLS-1$

	public static final String TEMPLATE_STRINGS = TEMPLATES_DIRECTORY
			+ "strings.template"; //$NON-NLS-1$
	public static final String TEMPLATE_STRING = TEMPLATES_DIRECTORY
			+ "string.template"; //$NON-NLS-1$
	public static final String PROJECT_ICON = "icon.png"; //$NON-NLS-1$
	public static final String ICON_HDPI = "ic_launcher_hdpi.png"; //$NON-NLS-1$
	public static final String ICON_MDPI = "ic_launcher_mdpi.png"; //$NON-NLS-1$
	public static final String ICON_LDPI = "ic_launcher_ldpi.png"; //$NON-NLS-1$

	public static final String STRINGS_FILE = "strings.xml"; //$NON-NLS-1$

	public static final String STRING_RSRC_PREFIX = LayoutConstants.STRING_PREFIX;
	public static final String STRING_APP_NAME = "app_name"; //$NON-NLS-1$
	public static final String STRING_HELLO_WORLD = "hello"; //$NON-NLS-1$

	public static final String[] DEFAULT_DIRECTORIES = new String[] {
			BIN_DIRECTORY, BIN_CLASSES_DIRECTORY, RES_DIRECTORY,
			ASSETS_DIRECTORY };

	public static final String[] RES_DIRECTORIES = new String[] {
			DRAWABLE_DIRECTORY, LAYOUT_DIRECTORY, VALUES_DIRECTORY,
			XML_DIRECTORY };

	public static final String[] RES_DENSITY_ENABLED_DIRECTORIES = new String[] {
			DRAWABLE_HDPI_DIRECTORY, DRAWABLE_MDPI_DIRECTORY,
			DRAWABLE_LDPI_DIRECTORY, LAYOUT_DIRECTORY, VALUES_DIRECTORY, XML_DIRECTORY };

	public static final String PROJECT_LOGO_LARGE = "icons/android-64.png"; //$NON-NLS-1$
	public static final String JAVA_ACTIVITY_TEMPLATE = "java_file.template"; //$NON-NLS-1$
	public static final String LAYOUT_TEMPLATE = "layout.template"; //$NON-NLS-1$
	public static final String MAIN_LAYOUT_XML = "main.xml";

}
