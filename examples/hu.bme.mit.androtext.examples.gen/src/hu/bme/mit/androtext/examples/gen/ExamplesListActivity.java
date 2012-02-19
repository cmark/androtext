package hu.bme.mit.androtext.examples.gen;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ExamplesListActivity extends AbstractExamplesListActivity {
	
	private Map<Integer, Class<? extends Activity>> activityMap = new HashMap<Integer, Class<? extends Activity>>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeMap();
		getListView().setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent i = new Intent(ExamplesListActivity.this, activityMap.get(arg2));
				startActivity(i);
			}
		});
	}

	private void initializeMap() {
		activityMap.put(0, HelloWorldActivity.class);
		activityMap.put(1, HelloLinearLayoutActivity.class);
		activityMap.put(2, HelloRelativeLayoutExampleActivity.class);
		activityMap.put(3, HelloTableLayoutActivity.class);
		activityMap.put(4, HelloGridViewActivity.class);
		activityMap.put(5, HelloTabWidgetActivity.class);
		activityMap.put(6, HelloAutoCompleteActivity.class);
		activityMap.put(7, HelloListActivity.class);
		activityMap.put(8, MainActivity.class);
		activityMap.put(9, DataExampleActivity.class);
		activityMap.put(10, LineExampleActivity.class);
		activityMap.put(11, RectangleExample.class);
		activityMap.put(12, MenuExampleActivity.class);
		activityMap.put(13, SpriteExampleActivity.class);
		activityMap.put(14, TextExampleActivity.class);
		activityMap.put(15, PhysicsExampleActivity.class);
	}
}
