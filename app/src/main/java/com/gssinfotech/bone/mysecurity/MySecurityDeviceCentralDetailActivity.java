/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


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
public class MySecurityDeviceCentralDetailActivity extends Activity{
	int buttonId=0;
	TextView screenTitle;
	Button button1,button2, button3;
	ImageView btn1Img, btn2Img,btn3Img;
	ImageView btn1Arrow, btn2Arrow,btn3Arrow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mysecurity_device_central_detail);
		screenTitle=(TextView)findViewById(R.id.device_central_detail_heading);
		
		button1=(Button)findViewById(R.id.device_central_detail_btn1);
		button2=(Button)findViewById(R.id.device_central_detail_btn2);
		button3=(Button)findViewById(R.id.device_central_detail_btn3);
		
		btn1Img=(ImageView)findViewById(R.id.btn1_icon);
		btn2Img=(ImageView)findViewById(R.id.btn2_icon);
		btn3Img=(ImageView)findViewById(R.id.btn3_icon);
		
		btn1Arrow=(ImageView)findViewById(R.id.btn1_arrow_id);
		btn2Arrow=(ImageView)findViewById(R.id.btn2_arrow_id);
		btn3Arrow=(ImageView)findViewById(R.id.btn3_arrow_id);
		
		Bundle b= getIntent().getExtras();
		buttonId=b.getInt("BUTTON_ID", 0);
		//Toast.makeText(getApplicationContext(), "BUTTON ID "+buttonId, Toast.LENGTH_LONG).show();
		displayButtonsForButtonId(buttonId);
	}
	
	public void displayButtonsForButtonId(int button_Id){
		switch (button_Id) {
		case 1:
			
			break;
			
		case 2:
			screenTitle.setText(getResources().getString(R.string.video_cam_title));
			button1.setText(getResources().getString(R.string.video_cam_dropcam));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.video_camera));
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 3:
			screenTitle.setText(getResources().getString(R.string.locks_title));
			button1.setText(getResources().getString(R.string.locks_yale_lock));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.yale_lock_icon));
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 4:
			screenTitle.setText(getResources().getString(R.string.motion_sensor_screen_title));
			button1.setText(getResources().getString(R.string.motion_sensor_bone));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.bone_motion_sensor));
			button2.setText(getResources().getString(R.string.motion_sensor_wemo));
			btn2Img.setImageDrawable(getResources().getDrawable(R.drawable.wemo_motion_sensor));
			button3.setText(getResources().getString(R.string.motion_sensor_fibaro));
			btn3Img.setImageDrawable(getResources().getDrawable(R.drawable.fibero_motion_sensor));
			break;
		case 5:
			screenTitle.setText(getResources().getString(R.string.multi_sensor_screen_title));
			button1.setText(getResources().getString(R.string.multi_sensor_aeon_labs));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.aeon_multi_sensor));
			button2.setText(getResources().getString(R.string.multi_sensor_smart_sense));
			btn2Img.setImageDrawable(getResources().getDrawable(R.drawable.smart_sense_multi_sensor));
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 6:
			screenTitle.setText(getResources().getString(R.string.smoke_sensor_screen_title));
			button1.setText(getResources().getString(R.string.smoke_sensor_nest_protect));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.nest_protect_smoke_sensor));
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 7:
			screenTitle.setText(getResources().getString(R.string.siren_screen_title));
			button1.setText(getResources().getString(R.string.siren_bone));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.zwavesiren));
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 8:
			screenTitle.setText(getResources().getString(R.string.door_sensor_screen_title));
			button1.setText(getResources().getString(R.string.door_sensor_bone));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.bone_door_sensor));
			button2.setText(getResources().getString(R.string.door_sensor_aeon));
			btn2Img.setImageDrawable(getResources().getDrawable(R.drawable.aeon_door_sensor));
			button3.setText(getResources().getString(R.string.door_sensor_fibaro));
			btn3Img.setImageDrawable(getResources().getDrawable(R.drawable.fibaro_door_sensor));
			break;
		case 9:
			screenTitle.setText(getResources().getString(R.string.flood_sensor_screen_title));
			button1.setText(getResources().getString(R.string.flood_sensor_fibaro));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.fibaro_flood_sensor));
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		default:
			break;
		}
	}
	
	public void onDeviceCentralDetailButtonOneClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDropcamButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MySecurityDeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
		setScreenTitleForAddDeviceScreen(1);
	}
	
	public void onDeviceCentralDetailButtonTwoClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDropcamButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MySecurityDeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
		setScreenTitleForAddDeviceScreen(2);
	}
	
	public void onDeviceCentralDetailButtonThreeClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDropcamButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MySecurityDeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
		setScreenTitleForAddDeviceScreen(3);
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	/**
	 * Starts the activity for button id
	 * @param button_id
	 */
	public void startActivityForButtonId(int button_id,int detail_btn_id,String screen_title){
		Bundle b=new Bundle();
		b.putInt("BUTTON_ID", button_id);
		b.putInt("DETAIL_BUTTON_ID", detail_btn_id);
		b.putString("SCREEN_TITLE", screen_title);
		Intent i=new Intent(MySecurityDeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class);
		i.putExtras(b);
		startActivity(i);
	}

	public void setScreenTitleForAddDeviceScreen(int detailBtnId){
		switch (buttonId) {
		case 1:
			
			break;
			
		case 2:
			startActivityForButtonId(2, detailBtnId, getResources().getString(R.string.video_cam_title));
			break;
		case 3:
			startActivityForButtonId(3, detailBtnId, getResources().getString(R.string.locks_title));
			break;
		case 4:
			startActivityForButtonId(4, detailBtnId, getResources().getString(R.string.motion_sensor_screen_title));
			break;
		case 5:
			startActivityForButtonId(5, detailBtnId, getResources().getString(R.string.multi_sensor_screen_title));
			break;
		case 6:
			startActivityForButtonId(6, detailBtnId, getResources().getString(R.string.smoke_sensor_screen_title));
			break;
		case 7:
			startActivityForButtonId(7, detailBtnId, getResources().getString(R.string.siren_screen_title));
			break;
		case 8:
			startActivityForButtonId(8, detailBtnId, getResources().getString(R.string.door_sensor_screen_title));
			break;
		case 9:
			startActivityForButtonId(9, detailBtnId, getResources().getString(R.string.flood_sensor_screen_title));
			break;
		default:
			break;
		}
	}
}
