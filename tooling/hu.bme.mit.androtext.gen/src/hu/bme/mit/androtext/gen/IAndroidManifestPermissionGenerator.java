package hu.bme.mit.androtext.gen;

import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;

import com.google.inject.ImplementedBy;

@ImplementedBy(IAndroidManifestPermissionGenerator.DefaultImpl.class)
public interface IAndroidManifestPermissionGenerator {

	public CharSequence generatePermissons(TargetApplication application);
	
	public class DefaultImpl implements IAndroidManifestPermissionGenerator {

		@Override
		public CharSequence generatePermissons(TargetApplication application) {
			return "";
		}
		
	}
	
}
