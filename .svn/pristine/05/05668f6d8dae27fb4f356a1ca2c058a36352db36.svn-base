/**
 * 
 */
package com.gssinfotech.bone;

import java.util.ArrayList;
import com.gssinfotech.bone.adapters.ConnectHubListViewAdapter;
import com.gssinfotech.bone.model.WifiNetworkModel;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class ConnectHubtoHomeWifiActivity extends Activity {

	ListView listView;
	ArrayList<WifiNetworkModel> wifiNetworksList;
	private Dialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connect_hub_to_home_wifi);
		listView=(ListView)findViewById(R.id.hub_to_wifi_listview_id);
		wifiNetworksList=new ArrayList<WifiNetworkModel>();
		//dummy code----------start
		WifiNetworkModel model1=new WifiNetworkModel();
		model1.setWifiNmae("Codefyne 1");
		model1.setWifiSecurityType("No Security");
		wifiNetworksList.add(model1);
		WifiNetworkModel model2=new WifiNetworkModel();
		model2.setWifiNmae("Codefyne 2");
		model2.setWifiSecurityType("WEP");
		wifiNetworksList.add(model2);
		WifiNetworkModel model3=new WifiNetworkModel();
		model3.setWifiNmae("Codefyne 3");
		model3.setWifiSecurityType("WAP/WAP 2/PSK");
		wifiNetworksList.add(model3);
		//dummy code----------end
		
		listView.setAdapter(new ConnectHubListViewAdapter(ConnectHubtoHomeWifiActivity.this, wifiNetworksList));
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				WifiNetworkModel model=wifiNetworksList.get(position);
				showPasswordSecurityAlertDialog(model.getWifiNmae(), model.getWifiSecurityType());
			}
		});
		//showPasswordSecurityAlertDialog("codefyne 1", "No Security");
	}
	
	public void showPasswordSecurityAlertDialog(String dialogTitle, String securityString){
		dialog = new Dialog(ConnectHubtoHomeWifiActivity.this);
	    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
	    dialog.setContentView(R.layout.dialog_connect_hub_to_home_wifi);
	    dialog.setCancelable(false);
		TextView dialogTitleTV=(TextView)dialog.findViewById(R.id.dialog_hub_home_title_id);
		TextView dialogSecurityTV=(TextView)dialog.findViewById(R.id.dialog_hub_home_security_id);
		final EditText dialogPasswordET=(EditText)dialog.findViewById(R.id.dialog_hub_home_password_id);
		Button dialogConnectBtn=(Button)dialog.findViewById(R.id.dialog_hub_home_connect_btn_id);
		Button dialogCancelBtn=(Button)dialog.findViewById(R.id.dialog_hub_home_cancel_btn_id);
		
		dialogTitleTV.setText(dialogTitle);
		dialogSecurityTV.setText(securityString);
		dialogConnectBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(dialogPasswordET.getText().toString().isEmpty()){
					Toast.makeText(ConnectHubtoHomeWifiActivity.this, "Password can't be empty!", Toast.LENGTH_SHORT).show();
				}
				else{
					startActivity(new Intent(ConnectHubtoHomeWifiActivity.this, MainHomeScreenActivity.class));
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
}
