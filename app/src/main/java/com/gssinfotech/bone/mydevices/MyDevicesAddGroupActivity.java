package com.gssinfotech.bone.mydevices;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyDevicesAddGroupActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_addgroup);
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onFindBridgeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onFindBridgeButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onAddBulbButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onAddBulbButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onSaveButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onSaveButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onCancelButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
	}
	
}
