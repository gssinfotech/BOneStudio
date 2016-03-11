/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class SecurityDeviceHistoryActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_security_device_history);
	}
	
	public void onHistoryByDateButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHistoryByDateButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onRemoveHistoryButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onRemoveHistoryButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
	}
}
