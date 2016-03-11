package com.gssinfotech.bone.mydevices;

import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyDevicesSettingsActivity extends Activity {
	String screenTitle="";
	TextView screenTitleTV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_device_settings);
		screenTitleTV=(TextView)findViewById(R.id.mydevices_settings_heading);
		Bundle b= getIntent().getExtras();
		screenTitle=b.getString("SCREEN_TITLE");
		screenTitleTV.setText(screenTitle);
	}

	
	public void myDevicesSettingsHistoryButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "myDevicesSettingsHistoryButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesSettingsActivity.this, MyDevicesDeviceHistoryActivity.class));
	}
	
	public void myDevicesSettingsRulesButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "myDevicesSettingsRulesButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesSettingsActivity.this, MyDevicesMyRulesActivity.class));
	}
	
	
	public void myDevicesAddGroupButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "myDevicesAddGroupButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesSettingsActivity.this, MyDevicesAddGroupActivity.class));
	}
	
}
