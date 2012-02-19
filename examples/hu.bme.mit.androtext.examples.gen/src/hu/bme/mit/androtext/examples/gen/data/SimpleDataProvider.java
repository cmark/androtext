package hu.bme.mit.androtext.examples.gen.data;

import android.content.ContentValues;
import android.net.Uri;

public class SimpleDataProvider extends AbstractSimpleDataProvider {
	
	@Override
	protected void setDefaultValuesFor(Uri uri, ContentValues values) {
		// set default content values when inserting a new entity, called when insert called in provider
	}
	
	@Override
	protected String getNullColumnHack(Uri uri) {
		// specify the nullcolumnhack if needed when inserting new entity
		return null;
	}
	
}
