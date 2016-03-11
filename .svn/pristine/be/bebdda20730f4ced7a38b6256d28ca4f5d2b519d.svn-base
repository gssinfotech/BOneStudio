package com.gssinfotech.bone.mydevices;

import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyDevicesSwitchesAcivity extends Activity {
	
	int buttonId=0,detailBtnId=0;
	String screenTitle="";
	ImageView deviceImg;
	TextView deviceName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_switches);
		deviceImg=(ImageView)findViewById(R.id.mydevices_switches_icon);
		deviceName=(TextView)findViewById(R.id.mydevices_switches_text);
		Bundle b= getIntent().getExtras();
		buttonId=b.getInt("BUTTON_ID", 0);
		detailBtnId=b.getInt("DETAIL_BUTTON_ID", 0);
		screenTitle=b.getString("SCREEN_TITLE");
		
		if(detailBtnId==1){
			deviceName.setText("Blaze");
		}
		else if(detailBtnId==2){
			deviceName.setText("Living");
			deviceImg.setImageResource(R.drawable.wemo_light_switch);
		}
	}

	public void onSwitchesSettingsButtonClicked(View v){
		//Toast.makeText(MyDevicesSwitchesAcivity.this, "onSwitchesSettingsButtonClicked", Toast.LENGTH_LONG).show();
		Bundle b=new Bundle();
		b.putString("SCREEN_TITLE", "SWITCHES & CONTROLS");
		Intent i=new Intent(MyDevicesSwitchesAcivity.this, MyDevicesSettingsActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
	
	public void onAllOnButtonClicked(View v){
		Toast.makeText(MyDevicesSwitchesAcivity.this, "onAllOnButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onAllOffButtonClicked(View v){
		Toast.makeText(MyDevicesSwitchesAcivity.this, "onAllOffButtonClicked", Toast.LENGTH_LONG).show();
	}
	
}
