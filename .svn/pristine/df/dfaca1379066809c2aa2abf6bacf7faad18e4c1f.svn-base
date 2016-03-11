/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author jnanendra.kumar
 *
 */
public class LocksActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locks);
	}
	
	public void onLocksSettingsButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onLocksSettingsButtonClicked", Toast.LENGTH_LONG).show();
		Bundle b=new Bundle();
		b.putString("SCREEN_TITLE", "LOCKS");
		Intent i=new Intent(LocksActivity.this, SecurityDeviceSettingsActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
}
