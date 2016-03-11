package com.gssinfotech.bone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
	
	TextView forgotPasswordTV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		forgotPasswordTV=(TextView)findViewById(R.id.forgot_pass_id);
		forgotPasswordTV.setText(Html.fromHtml("<u>Forgot Password?</u>"));
	}

	public void onLoginBtnClicked(View v){
		//Toast.makeText(getApplicationContext(), "onLoginBtnClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(LoginActivity.this, MainHomeScreenActivity.class));
	}
}
