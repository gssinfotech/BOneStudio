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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class InvitedUsersListViewAdapter extends ArrayAdapter<String>{

		//to hold the caller class context
		private Context mContext;
		
		//to hold the list of menu items
		private ArrayList<String> mMenuList;
		
		/**
		 * Variable to hold reference of shared preference file
		 */
		private SharedPreferences pref_obj;
		//constructor
		public InvitedUsersListViewAdapter(Context context, ArrayList<String> listObjects) {
			super(context,R.layout.list_item_guest_user, listObjects);
			// TODO Auto-generated constructor stub
			mContext=context;
			mMenuList=listObjects;
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
				rowViewObj=inflater.inflate(R.layout.list_item_guest_user, groupObj,false);
				holder.mUserName=(TextView)rowViewObj.findViewById(R.id.guest_user_list_item_1);
				holder.mDeleteBtn=(Button)rowViewObj.findViewById(R.id.guest_user_delete_btn_id);
				rowViewObj.setTag(holder);
			}else{
				 holder = (ViewHolder)rowViewObj.getTag();
			}
			
			holder.mUserName.setText(mMenuList.get(pos));
			holder.mDeleteBtn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//Toast.makeText(mContext, "delete btn on row "+pos, Toast.LENGTH_LONG).show();
					mMenuList.remove(pos);
					notifyDataSetChanged();
				}
			});
			return rowViewObj;
		}
		private static class ViewHolder{
			private TextView mUserName;
			private Button mDeleteBtn;
		}

	
}
