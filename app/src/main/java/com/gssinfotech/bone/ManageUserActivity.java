package com.gssinfotech.bone;

import java.util.ArrayList;
import com.gssinfotech.bone.adapters.InvitedUsersListViewAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ManageUserActivity extends Activity {
	
	//Constant to pass to the activity, to get back result from that activity 
	private static final int INVITE_USER_REQUEST_CODE=417;
	ListView listView;
	ArrayList<String> invitedUsersList;
	InvitedUsersListViewAdapter invitedUsersListViewAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manage_user);
		listView=(ListView)findViewById(R.id.manage_users_listview_id);
		invitedUsersList=new ArrayList<String>();
		invitedUsersListViewAdapter=new InvitedUsersListViewAdapter(ManageUserActivity.this, invitedUsersList);
		listView.setAdapter(invitedUsersListViewAdapter);
	}

	public void onInviteUserButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onInviteUserButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(ManageUserActivity.this, ManageUserEmailActivity.class));
		if(invitedUsersList.size()>=5){
			Toast.makeText(getApplicationContext(), "You can't invite more than 5 users.", Toast.LENGTH_LONG).show();
		}
		else{
			startActivityForResult(new Intent(ManageUserActivity.this, ManageUserEmailActivity.class), INVITE_USER_REQUEST_CODE);
		}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == INVITE_USER_REQUEST_CODE) {
	         if(resultCode == RESULT_OK){
	             String invitedUser=data.getStringExtra("INVITED_USER_EMAIL");
	             if(!invitedUser.isEmpty()){
	            	 invitedUsersList.add(invitedUser);
		             invitedUsersListViewAdapter.notifyDataSetChanged();
	             }
	             //Toast.makeText(getApplicationContext(), invitedUser, Toast.LENGTH_LONG).show();
	         }     
		}
	}
}
