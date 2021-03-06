package com.tcs.simplefragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// The FragmentManager provides methods for interacting
		// with Fragments in this Activity
		FragmentManager fragmentManager = getFragmentManager();
		
		// The FragmentTransaction adds, removes, replaces and defines animations for Fragments
		
		// beginTransaction() - Start a series of edit operations on the Fragments associated with this FragmentManager.
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		SimpleFragment simpleFragment = new SimpleFragment();
		fragmentTransaction.add(R.id.simplefragment, simpleFragment);
		
		// it will be scheduled as work on the main thread to be done the next time that thread is ready
		fragmentTransaction.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}