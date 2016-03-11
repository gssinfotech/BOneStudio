package com.gssinfotech.bone.mydevices;

import java.util.ArrayList;

import com.gssinfotech.bone.R;
import com.gssinfotech.bone.adapters.MyDevicesLightsListViewAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MyDevicesLightsAcivity extends Activity {
	
	ListView mListView;
	MyDevicesLightsListViewAdapter mAdapter;
	ArrayList<String> lightsList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices_lights);
		mListView=(ListView)findViewById(R.id.mydevices_lights_listview);
		lightsList=new ArrayList<String>();
		lightsList.add("Hue Lamp 1 ( Office )");
		lightsList.add("Hue Lamp 2 ( Office )");
		lightsList.add("Hue Lamp 3 ( Office )");
		lightsList.add("Hue Lamp 4 ( Office )");
		lightsList.add("Hue Lamp 5 ( Office )");
		mAdapter=new MyDevicesLightsListViewAdapter(MyDevicesLightsAcivity.this, lightsList);
		mListView.setAdapter(mAdapter);
	}

	public void onSettingButtonClicked(View v){
		//Toast.makeText(MyDevicesLightsAcivity.this, "onSettingButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MyDevicesLightsAcivity.this, MyDevicesSettingsActivity.class));
		Bundle b=new Bundle();
		b.putString("SCREEN_TITLE", "LIGHTS");
		Intent i=new Intent(MyDevicesLightsAcivity.this, MyDevicesSettingsActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
	
	public void onAllOnButtonClicked(View v){
		Toast.makeText(MyDevicesLightsAcivity.this, "onAllOnButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onAllOffButtonClicked(View v){
		Toast.makeText(MyDevicesLightsAcivity.this, "onAllOffButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onScenesButtonClicked(View v){
		//Toast.makeText(MyDevicesLightsAcivity.this, "onScenesButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesLightsAcivity.this, MyDevicesScenesActivity.class));
	}
}
