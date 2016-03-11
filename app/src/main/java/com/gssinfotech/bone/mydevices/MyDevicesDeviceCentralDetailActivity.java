/**
 * 
 */
package com.gssinfotech.bone.mydevices;

import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class MyDevicesDeviceCentralDetailActivity extends Activity{

	int buttonId=0;
	TextView screenTitle;
	Button button1,button2;
	ImageView btn1Img, btn2Img;
	ImageView btn1Arrow, btn2Arrow;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_device_central_detail);
		screenTitle=(TextView)findViewById(R.id.mydevice_central_detail_heading);
		
		button1=(Button)findViewById(R.id.mydevice_central_detail_btn1);
		button2=(Button)findViewById(R.id.mydevice_central_detail_btn2);
		
		btn1Img=(ImageView)findViewById(R.id.btn1_icon);
		btn2Img=(ImageView)findViewById(R.id.btn2_icon);
		
		btn1Arrow=(ImageView)findViewById(R.id.btn1_arrow_id);
		btn2Arrow=(ImageView)findViewById(R.id.btn2_arrow_id);
		
		Bundle b= getIntent().getExtras();
		buttonId=b.getInt("BUTTON_ID", 0);
		//Toast.makeText(getApplicationContext(), "BUTTON ID "+buttonId, Toast.LENGTH_LONG).show();
		displayButtonsForButtonId(buttonId);
	}
	
	public void displayButtonsForButtonId(int button_Id){
		switch (button_Id) {
		case 1:
			screenTitle.setText(getResources().getString(R.string.mydevices_central_lights_str));
			button1.setText(getResources().getString(R.string.lights_philips_hue_lights));
			btn1Img.setImageResource(R.drawable.philips_hue_light);
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			break;
			
		case 2:
			screenTitle.setText(getResources().getString(R.string.mydevices_central_thermostat_str));
			button1.setText(getResources().getString(R.string.thermostat_nest_thermostat));
			btn1Img.setImageResource(R.drawable.nest_thermostat);
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 3:
			screenTitle.setText(getResources().getString(R.string.mydevices_central_switches_str));
			button1.setText(getResources().getString(R.string.switches_wemo_switch));
			btn1Img.setImageResource(R.drawable.wemo_switch);
			button2.setText(getResources().getString(R.string.switches_wemo_light_switch));
			btn2Img.setImageResource(R.drawable.wemo_light_switch);;
			break;
		case 4:
			screenTitle.setText(getResources().getString(R.string.mydevices_central_tracker_str));
			button1.setText(getResources().getString(R.string.mydevices_central_tracker_str));
			btn1Img.setImageResource(R.drawable.mydevices_tracker_icon);
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 5:
			screenTitle.setText(getResources().getString(R.string.mydevices_central_sockets_str));
			button1.setText(getResources().getString(R.string.sockets_aeon_lab_socket));
			btn1Img.setImageResource(R.drawable.aeon_labs_socket);
			button2.setText(getResources().getString(R.string.sockets_aeon_smart_switch));
			btn2Img.setImageResource(R.drawable.aeon_smart_switch);;
			break;
			
		default:
			break;
		}
	}
	
	public void onDeviceCentralDetailButtonOneClicked(View v){
	Toast.makeText(getApplicationContext(), "On NEST THERMOSTAT", Toast.LENGTH_LONG).show();
	//	startActivity(new Intent(MySecurityDeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
		setScreenTitleForAddDeviceScreen(1);
	}
	
	public void onDeviceCentralDetailButtonTwoClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDropcamButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MySecurityDeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
		setScreenTitleForAddDeviceScreen(2);
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	/**
	 * Starts the activity for button id
	 * @param button_id
	 */
	public void startActivityForButtonId(int button_id,int detail_btn_id,String screen_title, Class<?> cls){
		Bundle b=new Bundle();
		b.putInt("BUTTON_ID", button_id);
		b.putInt("DETAIL_BUTTON_ID", detail_btn_id);
		b.putString("SCREEN_TITLE", screen_title);
		Intent i=new Intent(MyDevicesDeviceCentralDetailActivity.this, cls);
		i.putExtras(b);
		startActivity(i);
	}

	public void setScreenTitleForAddDeviceScreen(int detailBtnId){
		switch (buttonId) {
		case 1:
			startActivityForButtonId(1, detailBtnId, getResources().getString(R.string.mydevices_central_lights_str),MyDevicesAddLightsAcivity.class);
			break;
			
		case 2:
			startActivityForButtonId(2, detailBtnId, getResources().getString(R.string.mydevices_central_thermostat_str),MyDevicesAddDeviceActivity.class);
			break;
		case 3:
			startActivityForButtonId(3, detailBtnId, getResources().getString(R.string.mydevices_central_switches_str),MyDevicesAddDeviceActivity.class);
			break;
		case 4:
			startActivityForButtonId(4, detailBtnId, getResources().getString(R.string.mydevices_central_tracker_str),MyDevicesAddDeviceActivity.class);
			break;
		case 5:
			startActivityForButtonId(5, detailBtnId, getResources().getString(R.string.mydevices_central_sockets_str),MyDevicesAddDeviceActivity.class);
			break;
			
		default:
			break;
		}
	}
}
