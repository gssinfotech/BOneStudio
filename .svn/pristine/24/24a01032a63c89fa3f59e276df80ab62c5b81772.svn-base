/**
 * 
 */
package com.gssinfotech.bone.mydevices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.gssinfotech.bone.R;

/**
 * @author jnanendra.kumar
 *
 */
public class MyDevicesDeviceCentralActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_device_central);
	}
	
	public void onLightsButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onLightsButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(1);
	}
	
	public void onThermostatButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onThermostatButtonClicked", Toast.LENGTH_LONG).show();
		startActivityForButtonId(2);
	}
	
	public void onSwitchesButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSwitchesButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(3);
	}
	
	public void onTrackerButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onTrackerButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(4);
	}
	
	public void onSocketsButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSocketsButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(5);
	}
	
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	/**
	 * Starts the activity for button id
	 * @param button_id
	 */
	public void startActivityForButtonId(int button_id){
		Bundle b=new Bundle();
		b.putInt("BUTTON_ID", button_id);
		Intent i=new Intent(MyDevicesDeviceCentralActivity.this, MyDevicesDeviceCentralDetailActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
}
