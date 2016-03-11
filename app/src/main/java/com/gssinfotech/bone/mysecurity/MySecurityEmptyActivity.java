/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class MySecurityEmptyActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mysecurity_empty);
	}
	
	public void onAddButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onAddButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MySecurityEmptyActivity.this, MySecurityDeviceCentralActivity.class));
	}

}
