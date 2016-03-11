/**
 * 
 */
package com.gssinfotech.bone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class HomeScreenActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//hiding the actionbar
	    setContentView(R.layout.activity_home_screen);
	}
	
	public void onCreateNewAccountButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onCreateNewAccountButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(HomeScreenActivity.this, CreateAccountActivity.class));
	}
	
	public void onAlreadyHaveAccountButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onAlreadyHaveAccountButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(HomeScreenActivity.this, LoginActivity.class));
	}
}
