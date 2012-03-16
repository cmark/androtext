package hu.bme.mit.androtext.examples.notepad.gen;

import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class NotesList extends AbstractNotesList {
	
	private static final String TAG = "NotesList";
	
    /** The index of the title column */
    private static final int COLUMN_INDEX_TITLE = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getListView().setOnCreateContextMenuListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
        // Generate any additional actions that can be performed on the
        // overall list.  In a normal install, there are no additional
        // actions found here, but this allows other applications to extend
        // our menu with their own actions.
        Intent intent = new Intent(null, getIntent().getData());
        intent.addCategory(Intent.CATEGORY_ALTERNATIVE);
        menu.addIntentOptions(Menu.CATEGORY_ALTERNATIVE, 0, 0,
                new ComponentName(this, NotesList.class), null, intent, 0, null);
		return true;
	}
	
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);
        
        // Set the context menu header
//        menu.setHeaderTitle(cursor.getString(COLUMN_INDEX_TITLE));
        
//        // Append to the
//        // menu items for any other activities that can do stuff with it
//        // as well.  This does a query on the system for any activities that
//        // implement the ALTERNATIVE_ACTION for our data, adding a menu item
//        // for each one that is found.
//        Intent intent = new Intent(null, Uri.withAppendedPath(getIntent().getData(), 
//                                        Integer.toString((int) info.id) ));
//        intent.addCategory(Intent.CATEGORY_ALTERNATIVE);
//        menu.addIntentOptions(Menu.CATEGORY_ALTERNATIVE, 0, 0,
//                new ComponentName(this, NotesList.class), null, intent, 0, null);
    }
    
}
