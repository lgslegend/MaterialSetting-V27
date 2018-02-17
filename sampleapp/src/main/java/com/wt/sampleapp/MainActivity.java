package com.wt.sampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleSettings1(View v) {
		startActivity(new Intent(this, Settings1Activity.class));
	}

	public void handleSettings2(View v) {
		startActivity(new Intent(this, Settings2Activity.class));
	}

	public void handleSettings3(View v) {
		startActivity(new Intent(this, Settings3Activity.class));
	}

	public void handleSettings4(View v) {
		startActivity(new Intent(this, Settings4Activity.class));
	}

	public void handleSettings5(View v) {
		startActivity(new Intent(this, InflatingViewsActivity.class));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
