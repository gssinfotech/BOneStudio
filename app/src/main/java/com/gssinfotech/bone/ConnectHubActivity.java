package com.gssinfotech.bone;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.gssinfotech.bone.utility.BOneHttpConnection;

import org.json.JSONException;
import org.json.JSONObject;

public class ConnectHubActivity extends Activity {
	
	EditText enterCodeEditText;
	//Constant to pass to the activity, to get back result from that activity 
	private static final int QR_SCAN_REQUEST_CODE=417;
	
	TextView hubLocationTV;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connect_hub);
		enterCodeEditText=(EditText)findViewById(R.id.connect_hub_edittext_id);
		hubLocationTV=(TextView)findViewById(R.id.connect_hub_hyd_textView);
		//get hub location from called activity
		Bundle extras=getIntent().getExtras();
		if (extras != null) {
		    String locationName = extras.getString("HUB_LOCATION");
		    hubLocationTV.setText(locationName);
		}
	}
    
	public void onBarCodeButtonClicked(View v) {
		//Toast.makeText(getApplicationContext(), "onBarCodeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(ConnectHubActivity.this, QRCodeScannerActivity.class));
		startActivityForResult(new Intent(ConnectHubActivity.this, QRCodeScannerActivity.class), QR_SCAN_REQUEST_CODE);
	}
	
	public void onDoneButtonClicked(View v) {
		//Toast.makeText(getApplicationContext(), "onDoneButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(ConnectHubActivity.this, WLANNetworkActivity.class));
        if (enterCodeEditText.getText().toString().trim().isEmpty()){
            Toast.makeText(ConnectHubActivity.this, "Please enter the Hub identification code.", Toast.LENGTH_LONG).show();
        }
        else{
            new AddHubAsynctask(ConnectHubActivity.this,enterCodeEditText.getText().toString()).execute();
        }
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		 if (requestCode == QR_SCAN_REQUEST_CODE) {
	         if(resultCode == RESULT_OK){
	             String scannedCode=data.getStringExtra("SCANNED_CODE");
	             enterCodeEditText.setText(scannedCode);
	             Toast.makeText(getApplicationContext(), "scanned:"+scannedCode, Toast.LENGTH_LONG).show();
	         }     
	    }
	}

    //Add hub asynctask
    public class AddHubAsynctask extends AsyncTask<Void, Void, Void> {
        private Context mContext;
        private String mHubId;
        private Dialog pDialog;
        //Variable to hold reference of shared preference file
        private SharedPreferences pref_obj;
        private String response="";
        private String status="",message="";

        //tags to retrieve Json data
        private static final String TAG_STATUS= "status";
        private static final String TAG_MESSAGE = "message";

        public AddHubAsynctask(Context context, String hub_id){
            mContext=context;
            mHubId=hub_id;
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
            String url="http://ec2-54-85-13-111.compute-1.amazonaws.com:8080/hub/addHub";
            JSONObject json_object=new JSONObject();
            try {
                json_object.put("user_id", pref_obj.getString(getResources().getString(R.string.PREFS_KEY_USER_ID),""));
                json_object.put("sessionId", pref_obj.getString(getResources().getString(R.string.PREFS_KEY_SESSION_ID),""));
                json_object.put("app_device_token_id", pref_obj.getString(getResources().getString(R.string.PREFS_KEY_APP_DEVICE_TOKEN_ID),""));
                json_object.put("origin_id","1" );
                json_object.put("hub_id",mHubId );
                json_object.put("model_no","hubmodel" );
                json_object.put("date_of_mfg","20160311" );
                json_object.put("software_version","1.0" );
                json_object.put("software_install_date","20160311" );
                response= boneHttpconnection.httpPost(url,json_object);
                if(!response.isEmpty()){
                    JSONObject jsonResponse=new JSONObject(response);
                    if(jsonResponse.has(TAG_STATUS)){
                        status=jsonResponse.getString(TAG_STATUS);
                        if(status.equals("1")){
                            if (jsonResponse.has(TAG_MESSAGE)){
                                message=jsonResponse.getString(TAG_MESSAGE);
                                pref_obj
                                        .edit()
                                        .putString(getResources().getString(R.string.PREFS_KEY_HUB_ID), mHubId)
                                        .commit();
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
                startActivity(new Intent(ConnectHubActivity.this, WLANNetworkActivity.class));
            }
            else if(status.equals("0")){
                Toast.makeText(mContext,message, Toast.LENGTH_LONG).show();
                startActivity(new Intent(ConnectHubActivity.this, WLANNetworkActivity.class));
            }
        }
    }
	
}
