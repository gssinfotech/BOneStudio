/**
 * 
 */
package com.gssinfotech.bone.adapters;

import java.util.ArrayList;
import com.gssinfotech.bone.R;
import com.gssinfotech.bone.model.ConnectedDeviceModel;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * @author jnanendra.kumar
 *
 */
public class ConnectedDevicesListViewAdapter extends ArrayAdapter<ConnectedDeviceModel>{

		//to hold the caller class context
		private Context mContext;
		
		//to hold the list of menu items
		private ArrayList<ConnectedDeviceModel> mMenuList;
		
		/**
		 * Variable to hold reference of shared preference file
		 */
		private SharedPreferences pref_obj;
		//constructor
		public ConnectedDevicesListViewAdapter(Context context, ArrayList<ConnectedDeviceModel> listObjects) {
			super(context,R.layout.list_item_my_account, listObjects);
			// TODO Auto-generated constructor stub
			mContext=context;
			mMenuList=listObjects;
			/**
			 * for create shared preference file if not exist to save member login data
			 */
		    //pref_obj=context.getSharedPreferences(Constants.PREFS_FILE_NAME, 0);
		}
		public View getView(int pos,View rowViewObj,ViewGroup groupObj){
			ViewHolder holder = null;
			if(rowViewObj==null){
				holder=new ViewHolder();
				LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				rowViewObj=inflater.inflate(R.layout.list_item_my_account, groupObj,false);
				holder.mDeviceName=(TextView)rowViewObj.findViewById(R.id.my_account_list_item_1);
				holder.mConnectedDeviceDate=(TextView)rowViewObj.findViewById(R.id.my_account_list_item_2);
				rowViewObj.setTag(holder);
			}else{
				 holder = (ViewHolder)rowViewObj.getTag();
			}
			
			holder.mDeviceName.setText(mMenuList.get(pos).getDeviceName());
			holder.mConnectedDeviceDate.setText(mMenuList.get(pos).getDeviceConnectedDate());
			return rowViewObj;
		}
		private static class ViewHolder{
			private TextView mDeviceName;
			private TextView mConnectedDeviceDate;
		}

	
}
