package com.abhisheksabbarwal.simplelistviewlistener;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleListviewActivity extends Activity {

/* List of Country names to be displayed in the ListView*/
	
	static final String[] countryNames = new String[] { "India", "USA", "UK",
			"Australia", "Canada", "Brazil", "Russia", "France", "Ireland", "Germany", "South Africa" };
	
	ListView mySimpleListView;

	/** Called when the activity is first created. */
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_listview);
		
		mySimpleListView = (ListView) findViewById(R.id.mylist);
		
		/* Create an ArrayAdapter to populate the ListView with the countryNames */
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryNames);
		
		mySimpleListView.setAdapter(adapter);
		
		/*Define the listener for the ListView*/
		
		mySimpleListView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// Toast to display value of clicked item
							
				Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();			
			}	
		});
		
	}
  
}
