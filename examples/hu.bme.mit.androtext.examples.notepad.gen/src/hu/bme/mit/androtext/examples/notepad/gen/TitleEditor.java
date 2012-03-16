package hu.bme.mit.androtext.examples.notepad.gen;

import hu.bme.mit.androtext.examples.notepad.gen.data.NotePadData.NoteColumns;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TitleEditor extends AbstractTitleEditor implements OnClickListener {

    /** Index of the title column */
    private static final int COLUMN_INDEX_TITLE = 1;

    /**
     * The EditText field from our UI. Keep track of this so we can extract the
     * text when we are finished.
     */
    private EditText mText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set up click handlers for the text field and button
        mText = (EditText) this.findViewById(R.id.title);
        
        Button b = (Button) findViewById(R.id.button_ok);
        b.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Initialize the text with the title column from the cursor
        if (mCursor != null) {
            mCursor.moveToFirst();
            mText.setText(mCursor.getString(COLUMN_INDEX_TITLE));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (mCursor != null) {
            // Write the title back to the note 
            ContentValues values = new ContentValues();
            values.put(NoteColumns.TITLE, mText.getText().toString());
            getContentResolver().update(getIntent().getData(), values, null, null);
        }
    }

    public void onClick(View v) {
        // When the user clicks, just finish this activity.
        // onPause will be called, and we save our data there.
        finish();
    }
}
