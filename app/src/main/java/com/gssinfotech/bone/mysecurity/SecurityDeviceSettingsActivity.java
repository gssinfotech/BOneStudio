/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class SecurityDeviceSettingsActivity extends Activity{
	String screenTitle="";
	TextView screenTitleTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_security_device_settings);
		screenTitleTextView=(TextView)findViewById(R.id.device_settings_heading);
		
		Bundle b= getIntent().getExtras();
		screenTitle=b.getString("SCREEN_TITLE");
		screenTitleTextView.setText(screenTitle);
	}
	
	public void securityDeviceSettingsHistoryButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "securityDeviceSettingsHistoryButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(SecurityDeviceSettingsActivity.this, SecurityDeviceHistoryActivity.class));
	}
	
	public void securityDeviceSettingsRulesButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "securityDeviceSettingsRulesButtonClicked", Toast.LENGTH_LONG).show();
	}
}
