/**
 * 
 */
package com.gssinfotech.bone.adapters;

import java.util.ArrayList;
import com.gssinfotech.bone.R;
import com.gssinfotech.bone.model.WifiNetworkModel;
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
public class ConnectHubListViewAdapter extends ArrayAdapter<WifiNetworkModel>{

		//to hold the caller class context
		private Context mContext;
		
		//to hold the list of menu items
		private ArrayList<WifiNetworkModel> mMenuList;
		
		/**
		 * Variable to hold reference of shared preference file
		 */
		private SharedPreferences pref_obj;
		//constructor
		public ConnectHubListViewAdapter(Context context, ArrayList<WifiNetworkModel> listObjects) {
			super(context,R.layout.list_item_connect_hub, listObjects);
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
				rowViewObj=inflater.inflate(R.layout.list_item_connect_hub, groupObj,false);
				holder.mWifiNmae=(TextView)rowViewObj.findViewById(R.id.connect_hub_list_item_1);
				holder.mWifiSecurityType=(TextView)rowViewObj.findViewById(R.id.connect_hub_list_item_2);
				rowViewObj.setTag(holder);
			}else{
				 holder = (ViewHolder)rowViewObj.getTag();
			}
			
			holder.mWifiNmae.setText(mMenuList.get(pos).getWifiNmae());
			holder.mWifiSecurityType.setText(mMenuList.get(pos).getWifiSecurityType());
			return rowViewObj;
		}
		private static class ViewHolder{
			private TextView mWifiNmae;
			private TextView mWifiSecurityType;
		}

	
}
