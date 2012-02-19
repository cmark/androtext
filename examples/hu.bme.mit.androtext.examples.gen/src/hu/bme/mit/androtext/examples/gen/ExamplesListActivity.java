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
	
	private Map<Integer, Class> activityMap = new HashMap<Integer, Class>();
	
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
		activityMap.put(1, HelloListActivity.class);
		activityMap.put(2, HelloRelativeLayoutExampleActivity.class);
	}
}
