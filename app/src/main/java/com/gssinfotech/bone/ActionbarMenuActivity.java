package com.gssinfotech.bone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActionbarMenuActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actionbar_menu);
	}

	public void onSettingsBtnClicked(View v){
		//Toast.makeText(ActionbarMenuActivity.this, "onSettingsBtnClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(ActionbarMenuActivity.this, MenuSettingsActivity.class));
	}
	public void onMyAccountBtnClicked(View v){
		//Toast.makeText(ActionbarMenuActivity.this, "onMyAccountBtnClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(ActionbarMenuActivity.this, MyAccountActivity.class));
	}
	public void onLogoutBtnClicked(View v){
		//Toast.makeText(ActionbarMenuActivity.this, "onLogoutBtnClicked", Toast.LENGTH_LONG).show();
		displayLogoutAlertDialog();
	}
	public void onGettingStartwithBoneBtnClicked(View v){
		Toast.makeText(ActionbarMenuActivity.this, "onGettingStartwithBoneBtnClicked", Toast.LENGTH_LONG).show();
	}
	
	private void displayLogoutAlertDialog(){
		// get prompts.xml view
		LayoutInflater li = LayoutInflater.from(ActionbarMenuActivity.this);
		View alertdialog = li.inflate(R.layout.logout_alertdialog, null);

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				ActionbarMenuActivity.this);

		// set prompts.xml to alertdialog builder
		alertDialogBuilder.setView(alertdialog);
		
		// set dialog message
		alertDialogBuilder
			.setCancelable(false)
			.setPositiveButton("YES",
			  new DialogInterface.OnClickListener() {
			    public void onClick(DialogInterface dialog,int id) {
				// get user input and set it to result
			    	startActivity(new Intent(ActionbarMenuActivity.this, HomeScreenActivity.class));
			    	finish();
			   }
			 })
			.setNegativeButton("NO",
			  new DialogInterface.OnClickListener() {
			    public void onClick(DialogInterface dialog,int id) {
				dialog.cancel();
			    }
			  });

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
		alertDialog.getButton(alertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.dialog_btn_blue));
		alertDialog.getButton(alertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.dialog_btn_blue));
		alertDialog.getButton(alertDialog.BUTTON_NEGATIVE).setBackgroundColor(getResources().getColor(R.color.dialog_background));
		alertDialog.getButton(alertDialog.BUTTON_POSITIVE).setBackgroundColor(getResources().getColor(R.color.dialog_background));
	}
}

