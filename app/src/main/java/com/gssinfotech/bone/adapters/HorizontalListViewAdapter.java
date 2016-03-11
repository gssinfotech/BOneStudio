/**
 * 
 */
package com.gssinfotech.bone.adapters;

import java.util.ArrayList;
import com.gssinfotech.bone.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author jnanendra.kumar
 *
 */
public class HorizontalListViewAdapter extends ArrayAdapter<String>{

		//to hold the caller class context
		private Context mContext;
		
		//to hold the list of menu items
		private ArrayList<String> mMenuList;
		int mDeviceType;
		/**
		 * Variable to hold reference of shared preference file
		 */
		private SharedPreferences pref_obj;
		//constructor
		public HorizontalListViewAdapter(Context context, ArrayList<String> listObjects, int deviceType) {
			super(context,R.layout.list_item_horizontal_listview, listObjects);
			// TODO Auto-generated constructor stub
			mContext=context;
			mMenuList=listObjects;
			mDeviceType=deviceType;
			//Toast.makeText(mContext, "HorizontalListViewAdapter", Toast.LENGTH_LONG).show();
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
				rowViewObj=inflater.inflate(R.layout.list_item_horizontal_listview, groupObj,false);
				holder.mDeviceName=(TextView)rowViewObj.findViewById(R.id.horizontal_listview_list_iem_1);
				holder.mDeviceImg=(ImageView)rowViewObj.findViewById(R.id.horizontal_listview_list_item_2);
				if(mDeviceType==4){
					holder.mDeviceImg.setImageResource(R.drawable.philips_hue_light);
				}
				rowViewObj.setTag(holder);
			}else{
				 holder = (ViewHolder)rowViewObj.getTag();
			}
			
			holder.mDeviceName.setText(mMenuList.get(pos));
			return rowViewObj;
		}
		private static class ViewHolder{
			private TextView mDeviceName;
			private ImageView mDeviceImg;
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
