package com.gssinfotech.bone;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.gssinfotech.bone.utility.BOneConnectivityManager;
import com.gssinfotech.bone.utility.BOneHttpConnection;

import org.json.JSONException;
import org.json.JSONObject;

public class CreateAccountActivity extends Activity {

	private EditText emailid_edt;
	private EditText phone_no_edt;
	private EditText password_edt;
	private EditText confrim_password_edt;
	private Switch   rememberme_switch;
	private	Button create_account_bt;
	private EditText result;
    private Dialog dialog;
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
				
				validateEditFields();
				//displayAlertDialog();
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
	if( emailid_edt.getText().toString().trim().length() == 0 ) {
        emailid_edt.setError("Email ID is required!");
    }
	else if(phone_no_edt.getText().toString().trim().length() == 0 ) {
        phone_no_edt.setError("Phone No is required!");
    }
	else if(password_edt.getText().toString().trim().length() == 0 ) {
        password_edt.setError("Password is required!");
    }
	else if(confrim_password_edt.getText().toString().trim().length() == 0 ) {
        confrim_password_edt.setError("Password is required!");
    }
    else if(android.util.Patterns.EMAIL_ADDRESS.matcher(emailid_edt.getText().toString().trim()).matches()){
        if (password_edt.getText().toString().trim().equals(confrim_password_edt.getText().toString().trim())){
            if(BOneConnectivityManager.isInternetConnectionAvailable(CreateAccountActivity.this)){
                new UserRegistrationAsynctask(CreateAccountActivity.this,
                        emailid_edt.getText().toString(),
                        phone_no_edt.getText().toString(),
                        password_edt.getText().toString()).execute();
            }
            else{
                Toast.makeText(CreateAccountActivity.this, getResources().getString(R.string.NO_INTERNET_ALERT), Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(CreateAccountActivity.this, "Please enter same password.", Toast.LENGTH_LONG).show();
        }
    }
     else{
            Toast.makeText(CreateAccountActivity.this, "Please enter a valid Email address.", Toast.LENGTH_LONG).show();
     }
	}
	
//	private void displayAlertDialog(){
//		// get prompts.xml view
//		LayoutInflater li = LayoutInflater.from(CreateAccountActivity.this);
//		View alertdialog = li.inflate(R.layout.create_account_alertdialog, null);
//
//		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
//				CreateAccountActivity.this);
//
//		// set prompts.xml to alertdialog builder
//		alertDialogBuilder.setView(alertdialog);
//
//		final EditText userInput = (EditText) alertdialog.findViewById(R.id._editTextDialogUserInput);
//
//		// set dialog message
//		alertDialogBuilder
//			.setCancelable(false)
//			.setNegativeButton("Cancel",
//					new DialogInterface.OnClickListener() {
//						public void onClick(DialogInterface dialog, int id) {
//                            dialog.cancel();
//						}
//					})
//			.setPositiveButton("OK",
//                    new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int id) {
//                            if (userInput.getText().toString().trim().length() == 0) {
//                                Toast.makeText(CreateAccountActivity.this, "Please enter the OTP Number", Toast.LENGTH_LONG).show();
//                                //displayAlertDialog();
//                            } else {
//                                //startActivity(new Intent(CreateAccountActivity.this, AccountCreationHelpActivity.class));
//                                new UserAuthenticationAsynctask(CreateAccountActivity.this, userInput.getText().toString()).execute();
//                            }
//                        }
//                    });
//
//		// create alert dialog
//		AlertDialog alertDialog = alertDialogBuilder.create();
//
//		// show it
//		alertDialog.show();
//		alertDialog.getButton(alertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.dialog_btn_blue));
//		alertDialog.getButton(alertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.dialog_btn_blue));
//		alertDialog.getButton(alertDialog.BUTTON_NEGATIVE).setBackgroundColor(getResources().getColor(R.color.dialog_background));
//		alertDialog.getButton(alertDialog.BUTTON_POSITIVE).setBackgroundColor(getResources().getColor(R.color.dialog_background));
//	}
    public void showUserAuthenticationAlertDialog(){
        dialog = new Dialog(CreateAccountActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.create_account_alertdialog);
        dialog.setCancelable(false);
        final EditText userInput=(EditText)dialog.findViewById(R.id._editTextDialogUserInput);
        Button dialogOkBtn=(Button)dialog.findViewById(R.id.dialog_acc_ok_btn);
        Button dialogCancelBtn=(Button)dialog.findViewById(R.id.dialog_acc_cancel_btn);
        dialogOkBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if (userInput.getText().toString().trim().length() == 0) {
                    Toast.makeText(CreateAccountActivity.this, "Please enter the OTP.", Toast.LENGTH_LONG).show();
                    //displayAlertDialog();
                } else {
                    //startActivity(new Intent(CreateAccountActivity.this, AccountCreationHelpActivity.class));
                    new UserAuthenticationAsynctask(CreateAccountActivity.this, userInput.getText().toString()).execute();
                }
            }
        });

        dialogCancelBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(ConnectHubtoHomeWifiActivity.this, "cancel btn clicked", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    //user registration asynctask
	public class UserRegistrationAsynctask extends AsyncTask<Void, Void, Void> {
        private Context mContext;
        private String mEmailId,mPhoneNum,mPassword;
        private Dialog pDialog;
        //Variable to hold reference of shared preference file
        private SharedPreferences pref_obj;
        private String response="";
        private String status="",message="",user_id="";

        //tags to retrieve Json data
        private static final String TAG_STATUS= "status";
        private static final String TAG_MESSAGE = "message";
        private static final String TAG_USER = "user";
        private static final String TAG_USER_ID = "user_id";

        public UserRegistrationAsynctask(Context context, String emailid, String phone_num, String password){
            mContext=context;
            mEmailId=emailid;
            mPhoneNum=phone_num;
            mPassword=password;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog=new Dialog(mContext);
            pDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            pDialog.getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
            pDialog.setContentView(new ProgressBar(mContext));
            pDialog.setCancelable(false);
            pDialog.show();
            //for create shared preference file if not exist to save member login data
            pref_obj=mContext.getSharedPreferences(getResources().getString(R.string.PREFERENCES_FILE_NAME), 0);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            doUserRegistration();
            return null;
        }

        private void doUserRegistration(){
            BOneHttpConnection boneHttpconnection=new BOneHttpConnection();
            String url="http://ec2-54-85-13-111.compute-1.amazonaws.com:8080/user/register";
            JSONObject json_object=new JSONObject();
            try {
                json_object.put("email_id", mEmailId);
                String app_device_tocken_key=getResources().getString(R.string.PREFS_KEY_APP_DEVICE_TOKEN_ID);
                json_object.put("app_device_token_id", pref_obj.getString(app_device_tocken_key,""));
                json_object.put("password", mPassword);
                json_object.put("number", mPhoneNum);
                response= boneHttpconnection.httpPost(url,json_object);
                if(!response.isEmpty()){
                    JSONObject jsonResponse=new JSONObject(response);
                    if(jsonResponse.has(TAG_STATUS)){
                        status=jsonResponse.getString(TAG_STATUS);
                        if(status.equals("1")){
                            if (jsonResponse.has(TAG_MESSAGE)){
                                message=jsonResponse.getString(TAG_MESSAGE);
                            }
                            if(jsonResponse.has(TAG_USER)){
                                JSONObject jsonUser= jsonResponse.getJSONObject(TAG_USER);
                                if(jsonUser.has(TAG_USER_ID)){
                                    user_id=jsonUser.getString(TAG_USER_ID);
                                    pref_obj
                                            .edit()
                                            .putString(getResources().getString(R.string.PREFS_KEY_USER_ID), user_id)
                                            .putString(getResources().getString(R.string.PREFS_KEY_EMAIL_ID), mEmailId)
                                            .putString(getResources().getString(R.string.PREFS_KEY_PHONE_NUM), mPhoneNum)
                                            .putString(getResources().getString(R.string.PREFS_KEY_PASSWORD), mPassword)
                                            .putBoolean(getResources().getString(R.string.PREFS_KEY_REMEMBER_ME), rememberme_switch.isChecked())
                                            .putBoolean(getResources().getString(R.string.PREFS_KEY_IS_REGISTERED),true)
                                            .commit();
                                }
                            }
                        }
                        if(status.equals("0")) {
                            if (jsonResponse.has(TAG_MESSAGE)) {
                                message = jsonResponse.getString(TAG_MESSAGE);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (pDialog.isShowing()){
                pDialog.dismiss();
            }
            if(status.equals("1")){
                Toast.makeText(mContext,message, Toast.LENGTH_LONG).show();
                //displayAlertDialog();
                showUserAuthenticationAlertDialog();
            }
            else if(status.equals("0")){
                Toast.makeText(mContext,message, Toast.LENGTH_LONG).show();
                //displayAlertDialog();
                showUserAuthenticationAlertDialog();
            }
        }
    }
    //user authentication asynctask
    public class UserAuthenticationAsynctask extends AsyncTask<Void, Void, Void> {
        private Context mContext;
        private String mOTP;
        private Dialog pDialog;
        //Variable to hold reference of shared preference file
        private SharedPreferences pref_obj;
        private String response="";
        private String status="",message="",user_id="", session_id="";

        //tags to retrieve Json data
        private static final String TAG_STATUS= "status";
        private static final String TAG_MESSAGE = "message";
        private static final String TAG_USER = "user";
        private static final String TAG_USER_ID = "user_id";
        private static final String TAG_SESSION_ID = "sessionId";

        public UserAuthenticationAsynctask(Context context, String otp){
            mContext=context;
            mOTP=otp;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog=new Dialog(mContext);
            pDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            pDialog.getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
            pDialog.setContentView(new ProgressBar(mContext));
            pDialog.setCancelable(false);
            pDialog.show();
            //for create shared preference file if not exist to save member login data
            pref_obj=mContext.getSharedPreferences(getResources().getString(R.string.PREFERENCES_FILE_NAME), 0);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            doUserAuthentication();
            return null;
        }

        private void doUserAuthentication(){
            BOneHttpConnection boneHttpconnection=new BOneHttpConnection();
            String url="http://ec2-54-85-13-111.compute-1.amazonaws.com:8080/user/authenticate";
            JSONObject json_object=new JSONObject();
            try {
                json_object.put("email_id", pref_obj.getString(getResources().getString(R.string.PREFS_KEY_EMAIL_ID), ""));
                //String app_device_tocken_key=getResources().getString(R.string.PREFS_KEY_APP_DEVICE_TOKEN_ID);
                json_object.put("app_device_token_id", pref_obj.getString(getResources().getString(R.string.PREFS_KEY_APP_DEVICE_TOKEN_ID),""));
                json_object.put("authentication_code", mOTP);
                response= boneHttpconnection.httpPost(url,json_object);
                if(!response.isEmpty()){
                    JSONObject jsonResponse=new JSONObject(response);
                    if(jsonResponse.has(TAG_STATUS)){
                        status=jsonResponse.getString(TAG_STATUS);
                        if(status.equals("1")){
                            if (jsonResponse.has(TAG_MESSAGE)){
                                message=jsonResponse.getString(TAG_MESSAGE);
                            }
                            if (jsonResponse.has(TAG_SESSION_ID)){
                                session_id=jsonResponse.getString(TAG_SESSION_ID);
                            }
                            if(jsonResponse.has(TAG_USER)){
                                JSONObject jsonUser= jsonResponse.getJSONObject(TAG_USER);
                                if(jsonUser.has(TAG_USER_ID)){
                                    user_id=jsonUser.getString(TAG_USER_ID);
                                    pref_obj
                                            .edit()
                                            .putString(getResources().getString(R.string.PREFS_KEY_USER_ID), user_id)
                                            .putString(getResources().getString(R.string.PREFS_KEY_SESSION_ID), session_id)
                                            .putBoolean(getResources().getString(R.string.PREFS_KEY_IS_AUTHENTICATED), true)
                                            .commit();
                                }
                            }
                        }
                        if(status.equals("0")) {
                            if (jsonResponse.has(TAG_MESSAGE)) {
                                message = jsonResponse.getString(TAG_MESSAGE);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (pDialog.isShowing()){
                pDialog.dismiss();
            }
            if(status.equals("1")){
                Toast.makeText(mContext,message, Toast.LENGTH_LONG).show();
                //displayAlertDialog();
                startActivity(new Intent(CreateAccountActivity.this, AccountCreationHelpActivity.class));
            }
            else if(status.equals("0")){
                Toast.makeText(mContext,message, Toast.LENGTH_LONG).show();
               // displayAlertDialog();
                startActivity(new Intent(CreateAccountActivity.this, AccountCreationHelpActivity.class));
            }
        }
    }
}
