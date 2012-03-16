package hu.bme.mit.androtext.examples.notepad.gen.data;

import hu.bme.mit.androtext.examples.notepad.gen.data.NotePadData.NoteColumns;
import android.content.ContentValues;
import android.net.Uri;

public class NotePadProvider extends AbstractNotePadProvider {
	
	@Override
	protected void setDefaultValuesFor(Uri uri, ContentValues values) {
		Long now = Long.valueOf(System.currentTimeMillis());
		switch (sUriMatcher.match(uri)) {
        case NOTES:
            // Make sure that the fields are all set
            if (values.containsKey(NoteColumns.CREATED_DATE) == false) {
                values.put(NoteColumns.CREATED_DATE, now);
            }

            if (values.containsKey(NoteColumns.MODIFIED_DATE) == false) {
                values.put(NoteColumns.MODIFIED_DATE, now);
            }

            if (values.containsKey(NoteColumns.TITLE) == false) {
                values.put(NoteColumns.TITLE, "UNTITLED");
            }

            if (values.containsKey(NoteColumns.NOTE) == false) {
                values.put(NoteColumns.NOTE, "");
            } 
        }
	}
	
	@Override
	protected String getNullColumnHack(Uri uri) {
		// specify the nullcolumnhack if needed when inserting new entity
		switch (sUriMatcher.match(uri)) {
        case NOTES:
            return NoteColumns.NOTE;
        default:
        	return null;	
        }
	}
	
}
