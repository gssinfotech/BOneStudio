package com.gssinfotech.bone.mysecurity;

import com.gssinfotech.bone.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MySecurityDeviceCentralActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mysecurity_device_central);
	}
	
	public void onVideoDoorBellButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onVideoDoorBellButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onVideoCameraButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onVideoCameraButtonClicked", Toast.LENGTH_LONG).show();
		startActivityForButtonId(2);
	}
	
	public void onLocksButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onLocksButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(3);;
	}
	
	public void onMotionSensorButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onMotionSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(4);
	}
	
	public void onMultiSensorButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onMultiSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(5);
	}
	
	public void onSmokeSensorButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSmokeSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(6);
	}
	
	public void onSirenButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSirenButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(7);
	}
	
	public void onOpenClosedSensorButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onOpenClosedSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(8);
	}
	
	public void onFloodSensorButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onFloodSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		startActivityForButtonId(9);
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
		Intent i=new Intent(MySecurityDeviceCentralActivity.this, MySecurityDeviceCentralDetailActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
}
