package com.gssinfotech.bone.mydevices;

import com.gssinfotech.bone.R;
import com.gssinfotech.bone.mysecurity.AddSecurityDeviceActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MyDevicesAddLightsAcivity extends Activity {
	
	Spinner deviceSpinner, locationSpinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_add_lights);
		deviceSpinner=(Spinner)findViewById(R.id.mydevice_addlights_select_device_spinner);
		locationSpinner=(Spinner)findViewById(R.id.mydevice_addlights_select_location_spinner);
		
		String[] devicesList=new String[]{"Device 1", "Device 2", "Device 3"};
		deviceSpinner.setAdapter(new ArrayAdapter<String>(MyDevicesAddLightsAcivity.this,android.R.layout.simple_list_item_1,devicesList));
		String[] locationsList=new String[]{"Room 1", "Room 2", "Room 3"};
		locationSpinner.setAdapter(new ArrayAdapter<String>(MyDevicesAddLightsAcivity.this,android.R.layout.simple_list_item_1,locationsList));
	}

	public void onHomeButtonClicked(View v){
		//Toast.makeText(MyDevicesAddLightsAcivity.this, "onHomeButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onSaveButtonClicked(View v){
		//Toast.makeText(MyDevicesAddLightsAcivity.this, "onSaveButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesAddLightsAcivity.this, MyDevicesActivity.class));
	}
	
	public void onCancelButtonClicked(View v){
		Toast.makeText(MyDevicesAddLightsAcivity.this, "onCancelButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onFindBridgeButtonClicked(View v){
		Toast.makeText(MyDevicesAddLightsAcivity.this, "onFindBridgeButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onAddBulbButtonClicked(View v){
		Toast.makeText(MyDevicesAddLightsAcivity.this, "onAddBulbButtonClicked", Toast.LENGTH_LONG).show();
	}
}
