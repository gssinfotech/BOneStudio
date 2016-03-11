/**
 * 
 */
package com.gssinfotech.bone;

import com.gssinfotech.bone.mydevices.MyDevicesEmptyActivity;
import com.gssinfotech.bone.mysecurity.MySecurityEmptyActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class MainHomeScreenActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main_home_screen);
	}
	
	public void onBOneIconClicked(View v){
		//Toast.makeText(getApplicationContext(), "onBOneIconClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MainHomeScreenActivity.this, HubHealthActivity.class));
	}
	
	public void onSecurityButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSecurityButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MainHomeScreenActivity.this, MySecurityEmptyActivity.class));
	}
	
	public void onRemoteButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onRemoteButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onMusicButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMusicButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onDevicesButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDevicesButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MainHomeScreenActivity.this, MyDevicesEmptyActivity.class));
	}
	
	public void onSettingsMenuBtnClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSettingsMenuBtnClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MainHomeScreenActivity.this, ActionbarMenuActivity.class));
	}
	
}
