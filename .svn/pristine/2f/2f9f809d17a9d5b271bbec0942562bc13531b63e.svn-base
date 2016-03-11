/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class SensorActivity extends Activity{
	
	int buttonId=0,detailBtnId=0;
	String screenTitle="";
	TextView screenTitleTV, sensorImgBg;
	ImageView sensorImageView, dropImageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mysecurity_sensor);
		screenTitleTV=(TextView)findViewById(R.id.motion_sensor_title);
		sensorImgBg=(TextView)findViewById(R.id.motion_sensor_bg);
		sensorImageView=(ImageView)findViewById(R.id.motion_sensor_bg_img);
		dropImageView=(ImageView)findViewById(R.id.motion_sensor_drop);
		Bundle b= getIntent().getExtras();
		buttonId=b.getInt("BUTTON_ID", 0);
		detailBtnId=b.getInt("DETAIL_BUTTON_ID", 0);
		screenTitle=b.getString("SCREEN_TITLE");
		screenTitleTV.setText(screenTitle);
		setSensorImageForButtonId(buttonId);
	}
	
	public void onSensorSettingButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSensorSettingButtonClicked", Toast.LENGTH_LONG).show();
		Bundle b=new Bundle();
		b.putString("SCREEN_TITLE", screenTitle);
		Intent i=new Intent(SensorActivity.this, SecurityDeviceSettingsActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
	
	public void setSensorImageForButtonId(int button_id){
		switch (buttonId) {
		case 1:
			break;
			
		case 2:
			
			break;
		case 3:
			//Locks activity
			break;
		case 4:
			if(detailBtnId==1){
				sensorImageView.setImageResource(R.drawable.bone_motion_big);
			}
			else if(detailBtnId==2){
				sensorImageView.setImageResource(R.drawable.wemo_motion_sensor_big);
				sensorImgBg.setBackgroundResource(R.drawable.sensor_bg);
			}
			else if(detailBtnId==3){
				sensorImageView.setImageResource(R.drawable.fibaro_motion_sensor_big);
			}
			break;
		case 5:
			//if(detailBtnId==1){
				sensorImageView.setImageResource(R.drawable.multi_sensor_arrows);
				sensorImgBg.setBackgroundResource(R.color.add_device_save_btn);
			//}
			break;
		case 6:
			sensorImageView.setImageResource(R.drawable.smoke_sensor_transparent);
			sensorImgBg.setBackgroundResource(R.drawable.sensor_bg_red);
			break;
		case 7:
			//Siren activity
			break;
		case 8:
			//if(detailBtnId==1){
				sensorImageView.setImageResource(R.drawable.door_close);
				sensorImgBg.setVisibility(TextView.INVISIBLE);
			//}
			break;
		case 9:
			sensorImageView.setImageResource(R.drawable.flood_sensor_outside);
			sensorImgBg.setVisibility(TextView.INVISIBLE);
			dropImageView.setVisibility(ImageView.VISIBLE);
			break;
		default:
			break;
		}
	}
}
