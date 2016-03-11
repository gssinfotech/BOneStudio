package com.gssinfotech.bone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
		startActivity(new Intent(ConnectHubActivity.this, WLANNetworkActivity.class));
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
	
}
