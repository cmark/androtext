package hu.bme.mit.androtext.gen.util;

import com.android.ide.eclipse.adt.AdtPlugin;
import com.android.ide.eclipse.adt.internal.sdk.Sdk;
import com.android.sdklib.IAndroidTarget;

@SuppressWarnings("restriction")
public class AndroidSdkUtil {

	/**
	 * Returns the Android SDK.
	 * 
	 * @return the SDK instance or null
	 */
	public static final Sdk getAndroidSdk() {
		Sdk sdk;
		String s = AdtPlugin.getOsSdkFolder();
		if (s.isEmpty()) {
			return null;
		}
		if (Sdk.getCurrent() == null) {
			sdk = Sdk.loadSdk(s);
		} else {
			sdk = Sdk.getCurrent();
		}
		return sdk;
	}

	/**
	 * Returns the target based on the input parameters
	 * 
	 * @param sdk
	 * @return
	 */
	public static final IAndroidTarget getTarget(Sdk sdk, int targetNumber, boolean isGoogle) {
		if (isGoogle) {
			return getGoogleTarget(sdk, targetNumber);
		} else {
			return getTarget(sdk, targetNumber);
		}
	}
	
	/**
	 * Returns the target
	 * 
	 * @param sdk
	 * @return
	 */
	private static final IAndroidTarget getTarget(Sdk sdk, int targetNumber) {
		for (IAndroidTarget target : sdk.getTargets()) {
			if (checkTargetNumber(target, targetNumber)) {
				return target;
			}
		}
		return null;
	}

	/**
	 * Returns the target provided by the Google (Google Map implementation included).
	 * 
	 * @param sdk
	 * @return
	 */
	private static final IAndroidTarget getGoogleTarget(Sdk sdk, int targetNumber) {
		for (IAndroidTarget target : sdk.getTargets()) {
			if (checkTargetNumber(target, targetNumber)
					&& checkGoogleVendor(target)) {
				return target;
			}
		}
		return null;
	}
	
	public static final boolean checkTargetNumber(IAndroidTarget target, int targetNumber) {
		return target.getVersion().getApiLevel() == targetNumber;
	}
	
	public static final boolean checkGoogleVendor(IAndroidTarget target) {
		return target.getVendor().contains("Google");
	}

}
