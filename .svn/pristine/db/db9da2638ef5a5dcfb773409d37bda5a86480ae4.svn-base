/**
 * 
 */
package com.gssinfotech.bone.adapters;

import java.util.ArrayList;
import com.gssinfotech.bone.R;
import com.gssinfotech.bone.mydevices.MydevicesColorSelectionActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author jnanendra.kumar
 *
 */
public class MyDevicesLightsListViewAdapter extends ArrayAdapter<String>{

		//to hold the caller class context
		private Context mContext;
		
		//to hold the list of menu items
		private ArrayList<String> mMenuList;
		
		/**
		 * Variable to hold reference of shared preference file
		 */
		private SharedPreferences pref_obj;
		//constructor
		public MyDevicesLightsListViewAdapter(Context context, ArrayList<String> listObjects) {
			super(context,R.layout.list_item_lights, listObjects);
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
				rowViewObj=inflater.inflate(R.layout.list_item_lights, groupObj,false);
				holder.mLightName=(TextView)rowViewObj.findViewById(R.id.lights_list_item_device_name);
				holder.mHueImg=(ImageView)rowViewObj.findViewById(R.id.lights_list_item_hue_icon);
				rowViewObj.setTag(holder);
			}else{
				 holder = (ViewHolder)rowViewObj.getTag();
			}
			holder.mHueImg.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mContext.startActivity(new Intent(mContext, MydevicesColorSelectionActivity.class));
				}
			});
			holder.mLightName.setText(mMenuList.get(pos));
			return rowViewObj;
		}
		private static class ViewHolder{
			private TextView mLightName;
			private ImageView mHueImg;
		}
}
