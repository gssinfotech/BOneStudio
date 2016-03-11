/**
 * 
 */
package com.gssinfotech.bone.mydevices;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.gssinfotech.bone.R;
import com.gssinfotech.bone.adapters.VerticalListViewAdapter;

/**
 * @author jnanendra.kumar
 *
 */
public class MyDevicesActivity extends Activity{
	ListView mListView;
	ArrayList<String> roomsArrayList;
	VerticalListViewAdapter mVerticalListviewAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydevices);
		mListView=(ListView)findViewById(R.id.mydevices_listview);
		roomsArrayList=new ArrayList<String>();
		roomsArrayList.add("Room 1");
		roomsArrayList.add("Room 2");
		roomsArrayList.add("Room 3");
		mVerticalListviewAdapter=new VerticalListViewAdapter(MyDevicesActivity.this, roomsArrayList,4);
		mListView.setAdapter(mVerticalListviewAdapter);
	}
	
	public void onMyDevicesAddDeviceButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMyDevicesAddDeviceButtonClicked", Toast.LENGTH_LONG).show();
	}
	
}