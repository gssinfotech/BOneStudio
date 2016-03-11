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
public class SirenActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_siren);
	}
	
	public void onLocksSettingsButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onLocksSettingsButtonClicked", Toast.LENGTH_LONG).show();
		Bundle b=new Bundle();
		b.putString("SCREEN_TITLE", "SIREN");
		Intent i=new Intent(SirenActivity.this, SecurityDeviceSettingsActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
}
