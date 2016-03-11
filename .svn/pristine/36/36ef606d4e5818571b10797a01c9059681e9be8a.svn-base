package com.gssinfotech.bone;

import java.util.ArrayList;
import com.gssinfotech.bone.adapters.ConnectedDevicesListViewAdapter;
import com.gssinfotech.bone.model.ConnectedDeviceModel;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MyAccountActivity extends Activity {
	
	ListView listView;
	ArrayList<ConnectedDeviceModel> connectedDevicesList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_account);
		listView=(ListView)findViewById(R.id.connected_devices_listview_id);
		connectedDevicesList=new ArrayList<ConnectedDeviceModel>();
		//dummy code----------start
		ConnectedDeviceModel model1=new ConnectedDeviceModel();
		model1.setDeviceName("Phillips hue light");
		model1.setDeviceConnectedDate("Feb 25");
		connectedDevicesList.add(model1);
		ConnectedDeviceModel model2=new ConnectedDeviceModel();
		model2.setDeviceName("Wemo switch");
		model2.setDeviceConnectedDate("Feb 25");
		connectedDevicesList.add(model2);
		ConnectedDeviceModel model3=new ConnectedDeviceModel();
		model3.setDeviceName("Wemo socket");
		model3.setDeviceConnectedDate("Feb 25");
		connectedDevicesList.add(model3);
		ConnectedDeviceModel model4=new ConnectedDeviceModel();
		model4.setDeviceName("Phillips hue light");
		model4.setDeviceConnectedDate("Feb 25");
		connectedDevicesList.add(model4);
		connectedDevicesList.add(model4);
		connectedDevicesList.add(model4);
		connectedDevicesList.add(model4);
		connectedDevicesList.add(model4);
		//dummy code----------end
		listView.setAdapter(new ConnectedDevicesListViewAdapter(MyAccountActivity.this, connectedDevicesList));
	}

	public void onManageUserButtonClicked(View v){
		//Toast.makeText(MyAccountActivity.this, "onManageUserButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyAccountActivity.this, ManageUserActivity.class));
	}
	public void onChangePasswordButtonClicked(View v){
		//Toast.makeText(MyAccountActivity.this, "onChangePasswordButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyAccountActivity.this, ChangePasswordActivity.class));
	}
}

