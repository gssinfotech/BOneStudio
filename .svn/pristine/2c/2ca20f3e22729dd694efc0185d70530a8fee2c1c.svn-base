/**
 * 
 */
package com.gssinfotech.bone.adapters;

import java.util.ArrayList;

import com.gssinfotech.bone.R;
import com.gssinfotech.bone.mydevices.MyDevicesLightsAcivity;
import com.gssinfotech.bone.mysecurity.LocksActivity;
import com.gssinfotech.bone.utility.HorizontalListView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class VerticalListViewAdapter extends ArrayAdapter<String>{

		//to hold the caller class context
		private Context mContext;
		ArrayList<String> deviceList;
		HorizontalListViewAdapter hAdapter;
		//to hold the list of menu items
		private ArrayList<String> mMenuList;
		int mDeviceType;
		
		/**
		 * Variable to hold reference of shared preference file
		 */
		private SharedPreferences pref_obj;
		//constructor
		public VerticalListViewAdapter(Context context, ArrayList<String> listObjects, int deviceType) {
			super(context,R.layout.list_item_vertical_listview, listObjects);
			// TODO Auto-generated constructor stub
			mContext=context;
			mMenuList=listObjects;
			mDeviceType=deviceType;
			deviceList=new ArrayList<String>();
			deviceList.add("Device 1");
			deviceList.add("Device 2");
			deviceList.add("Device 3");
			deviceList.add("Device 4");
			deviceList.add("Device 5");
			hAdapter=new HorizontalListViewAdapter(mContext, deviceList,mDeviceType);
			/**
			 * for create shared preference file if not exist to save member login data
			 */
		    //pref_obj=context.getSharedPreferences(Constants.PREFS_FILE_NAME, 0);
		}
		public View getView(final int pos,View rowViewObj,ViewGroup groupObj){
			ViewHolder holder = null;
			if(rowViewObj==null){
				holder=new ViewHolder();
				LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				rowViewObj=inflater.inflate(R.layout.list_item_vertical_listview, groupObj,false);
				holder.mRoomName=(TextView)rowViewObj.findViewById(R.id.vertical_listview_list_item_1);
				holder.mHorizontalListView=(HorizontalListView)rowViewObj.findViewById(R.id.vertical_listview_list_item_2);
				rowViewObj.setTag(holder);
			}else{
				 holder = (ViewHolder)rowViewObj.getTag();
			}
			
			holder.mRoomName.setText(mMenuList.get(pos));
			
			holder.mHorizontalListView.setAdapter(hAdapter);
			holder.mHorizontalListView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					//Toast.makeText(mContext, "selected row: "+pos+"column :"+position, Toast.LENGTH_LONG).show();
					if (mDeviceType==1) {
						mContext.startActivity(new Intent(mContext, LocksActivity.class));
					}
					else if(mDeviceType==4){
						mContext.startActivity(new Intent(mContext, MyDevicesLightsAcivity.class));
					}
				}
			});
			return rowViewObj;
		}
		private static class ViewHolder{
			private TextView mRoomName;
			private HorizontalListView mHorizontalListView;
		}
//		@Override
//		public int getCount() {
//			// TODO Auto-generated method stub
//			return mMenuList.size();
//		}
//		@Override
//		public Object getItem(int position) {
//			// TODO Auto-generated method stub
//			return mMenuList.get(position);
//		}
//		@Override
//		public long getItemId(int position) {
//			// TODO Auto-generated method stub
//			return position;
//		}

	
}
