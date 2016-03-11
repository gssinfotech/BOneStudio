/**
 * 
 */
package com.gssinfotech.bone.utility;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class BOneConnectivityManager {

	//Method to check Internet connection
		public static boolean isInternetConnectionAvailable(Context context){
			ConnectivityManager connectivityManager=(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
			if(connectivityManager!=null){
				//if connectivity service manager service available
				NetworkInfo activeNetwork=connectivityManager.getActiveNetworkInfo();
				if(activeNetwork != null && activeNetwork.isConnected()){
					//if active network available and connected	
					return true;
				}
				else
				{	
					return false;
				}
			}
			else
			{	Toast.makeText(context,"No Connectivity Service Manager Was Found", 
						Toast.LENGTH_SHORT).show();	
				return false;
			}
		}
}
