package com.gssinfotech.bone;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ManageUserEmailActivity extends Activity {
	
	private Dialog dialog;
	EditText emailIdEditText;
	String invitedUserEmail="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manage_user_email);
		emailIdEditText=(EditText)findViewById(R.id.user_email_id);
	}

	public void onDoneButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDoneButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(ManageUserActivity.this, MainHomeScreenActivity.class));
		if(emailIdEditText.getText().toString().trim().isEmpty()){
			Toast.makeText(ManageUserEmailActivity.this, "Please enter Email address.", Toast.LENGTH_LONG).show();
		}
		else if(android.util.Patterns.EMAIL_ADDRESS.matcher(emailIdEditText.getText().toString().trim()).matches()){
			showSelectUserPermissionsAlertDialog();
		}
		else{
			Toast.makeText(ManageUserEmailActivity.this, "Please enter a valid Email address.", Toast.LENGTH_LONG).show();
		}
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//String invitedUserEmail = emailIdEditText.getText().toString().trim();
	    Intent intent = new Intent();
	    intent.putExtra("INVITED_USER_EMAIL", invitedUserEmail);
	    setResult(RESULT_OK, intent);
		super.onBackPressed();
	}
	
	public void showSelectUserPermissionsAlertDialog(){
		dialog = new Dialog(ManageUserEmailActivity.this);
	    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
	    dialog.setContentView(R.layout.dialog_manage_user_permissions);
	    dialog.setCancelable(false);

		Button dialogDoneBtn=(Button)dialog.findViewById(R.id.dialog_user_permissions_done);
		ImageButton securityBtn=(ImageButton)dialog.findViewById(R.id.user_permissions_security_btn_id);
		final ImageButton securityTickBtn=(ImageButton)dialog.findViewById(R.id.security_btn_tick_id);
		final ImageButton remoteBtn=(ImageButton)dialog.findViewById(R.id.user_permissions_remote_btn_id);
		final ImageButton remoteTickBtn=(ImageButton)dialog.findViewById(R.id.remote_btn_tick_id);
		final ImageButton musicBtn=(ImageButton)dialog.findViewById(R.id.user_permissions_music_btn_id);
		final ImageButton musicTickBtn=(ImageButton)dialog.findViewById(R.id.music_btn_tick_id);
		final ImageButton devicesBtn=(ImageButton)dialog.findViewById(R.id.user_permissions_devices_btn_id);
		final ImageButton devicesTickBtn=(ImageButton)dialog.findViewById(R.id.devices_btn_tick_id);
		
		dialogDoneBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				dialog.dismiss();
				invitedUserEmail = emailIdEditText.getText().toString().trim();
				onBackPressed();
					//startActivity(new Intent(ManageUserEmailActivity.this, MainHomeScreenActivity.class));
			}
		});
		
		securityBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(securityTickBtn.isShown()){
					securityTickBtn.setVisibility(Button.INVISIBLE);
				}
				else{
					securityTickBtn.setVisibility(Button.VISIBLE);
				}
			}
		});
		securityTickBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(securityTickBtn.isShown()){
					securityTickBtn.setVisibility(Button.INVISIBLE);
				}
			}
		});
		remoteBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(remoteTickBtn.isShown()){
					remoteTickBtn.setVisibility(Button.INVISIBLE);
				}
				else{
					remoteTickBtn.setVisibility(Button.VISIBLE);
				}
			}
		});
		remoteTickBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(remoteTickBtn.isShown()){
					remoteTickBtn.setVisibility(Button.INVISIBLE);
				}
			}
		});
		musicBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(musicTickBtn.isShown()){
					musicTickBtn.setVisibility(Button.INVISIBLE);
				}
				else{
					musicTickBtn.setVisibility(Button.VISIBLE);
				}
			}
		});
		musicTickBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(musicTickBtn.isShown()){
					musicTickBtn.setVisibility(Button.INVISIBLE);
				}
			}
		});
		devicesBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(devicesTickBtn.isShown()){
					devicesTickBtn.setVisibility(Button.INVISIBLE);
				}
				else{
					devicesTickBtn.setVisibility(Button.VISIBLE);
				}
			}
		});
		devicesTickBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(devicesTickBtn.isShown()){
					devicesTickBtn.setVisibility(Button.INVISIBLE);
				}
			}
		});
		dialog.show();
	}
}
