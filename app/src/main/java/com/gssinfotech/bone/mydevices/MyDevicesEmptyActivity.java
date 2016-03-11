/**
 * 
 */
package com.gssinfotech.bone.mydevices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.gssinfotech.bone.R;

/**
 * @author jnanendra.kumar
 *
 */
public class MyDevicesEmptyActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_empty);
	}
	
	public void onAddButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onAddButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesEmptyActivity.this, MyDevicesDeviceCentralActivity.class));
	}
}
