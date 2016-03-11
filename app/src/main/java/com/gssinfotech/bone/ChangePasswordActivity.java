package com.gssinfotech.bone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ChangePasswordActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_password);
	}

	public void onDoneButtonClicked(View v){
		Toast.makeText(ChangePasswordActivity.this, "onDoneButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(ChangePasswordActivity.this, MainHomeScreenActivity.class));
	}
}
