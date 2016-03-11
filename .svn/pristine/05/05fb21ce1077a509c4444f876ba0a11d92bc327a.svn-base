/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import java.util.ArrayList;
import com.gssinfotech.bone.R;
import com.gssinfotech.bone.adapters.VerticalListViewAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class MySecurityActivity extends Activity{
	ListView mListView;
	ArrayList<String> roomsArrayList;
	VerticalListViewAdapter mVerticalListviewAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mysecurity);
		mListView=(ListView)findViewById(R.id.mysecurity_listview);
		roomsArrayList=new ArrayList<String>();
		roomsArrayList.add("Room 1");
		roomsArrayList.add("Room 2");
		roomsArrayList.add("Room 3");
		mVerticalListviewAdapter=new VerticalListViewAdapter(MySecurityActivity.this, roomsArrayList,1);
		mListView.setAdapter(mVerticalListviewAdapter);
	}
	
	public void onMySecurityAddDeviceButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMySecurityAddDeviceButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onMySecurityArmButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMySecurityArmButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onMySecurityInHouseButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMySecurityInHouseButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onMySecurityDisarmButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMySecurityDisarmButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	public void onMySecuritySettingsButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMySecuritySettingsButtonClicked", Toast.LENGTH_LONG).show();
	}
}
