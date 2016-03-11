package com.gssinfotech.bone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class CreateAccountActivity extends Activity {

	private EditText emailid_edt;
	private EditText phone_no_edt;
	private EditText password_edt;
	private EditText confrim_password_edt;
	private Switch   rememberme_switch;
	private	Button create_account_bt;
	private EditText result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//To remove the iocn and title on actionbar
	    //getActionBar().setDisplayShowHomeEnabled(false);
	    //getActionBar().setDisplayShowTitleEnabled(false);
		//setTitle("CREATE ACCOUNT");
		//hiding the actionbar
	    setContentView(R.layout.activity_create_account);
		emailid_edt			=	(EditText)findViewById(R.id._emailid);
		phone_no_edt		=	(EditText)findViewById(R.id._phone_no);
		password_edt		=	(EditText)findViewById(R.id._password);
		confrim_password_edt=	(EditText)findViewById(R.id._confrim_password);
		rememberme_switch	=	(Switch)findViewById(R.id._rememberme);
		create_account_bt	=	(Button)findViewById(R.id._create_account_bt);
		//result				=	(EditText)findViewById(R.id._editTextDialogUserInput);
		
		create_account_bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//validateEditFields();
				
				displayAlertDialog();
				
			}
		});
		
		
		 //set the switch to ON 
		rememberme_switch.setChecked(false);
		  //attach a listener to check for changes in state
		rememberme_switch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

		   @Override
		   public void onCheckedChanged(CompoundButton buttonView,
		     boolean isChecked) {

		    if(isChecked){
		    	Log.d("Switch", "is currently ON");
		    	//rememberme_switch.setText("Switch is currently ON");
		    }else{
		    	Log.d("Switch", "is currently OFF");
		    	//rememberme_switch.setText("Switch is currently OFF");
		    }

		   }
		  });
		  
	}
	
	private void validateEditFields(){
		if( emailid_edt.getText().toString().length() == 0 )
			emailid_edt.setError( "Email ID is required!" );
		
	else if(phone_no_edt.getText().toString().length() == 0 )
			phone_no_edt.setError( "Phone No is required!" );
		
	else if(password_edt.getText().toString().length() == 0 )
			password_edt.setError( "Password is required!" );
		
	else if(confrim_password_edt.getText().toString().length() == 0 )
			confrim_password_edt.setError( "Password is required!" );
	}
	
	private void displayAlertDialog(){
		// get prompts.xml view
		LayoutInflater li = LayoutInflater.from(CreateAccountActivity.this);
		View alertdialog = li.inflate(R.layout.create_account_alertdialog, null);

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				CreateAccountActivity.this);

		// set prompts.xml to alertdialog builder
		alertDialogBuilder.setView(alertdialog);

		final EditText userInput = (EditText) alertdialog.findViewById(R.id._editTextDialogUserInput);

		// set dialog message
		alertDialogBuilder
			.setCancelable(false)
			.setNegativeButton("Cancel",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// get user input and set it to result
							// edit text

//				if(userInput.getText().toString().length() == 0 ){
//					
//					Toast.makeText(CreateAccountActivity.this, "Please enter the OTP Number", Toast.LENGTH_LONG).show();
//				}
//				else{
							startActivity(new Intent(CreateAccountActivity.this, AccountCreationHelpActivity.class));
							//}
						}
					})
			.setPositiveButton("OK",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
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
