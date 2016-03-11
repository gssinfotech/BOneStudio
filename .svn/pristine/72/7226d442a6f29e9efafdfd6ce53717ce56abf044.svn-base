/**
 * 
 */
package com.gssinfotech.bone;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class AddLocationActivity extends Activity {

	private GoogleMap googleMap;
	LocationTrackerService locTrackerService;
	EditText addLocationET;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_location);
		addLocationET=(EditText)findViewById(R.id.add_loc_edittext_id);

		locTrackerService=new LocationTrackerService(AddLocationActivity.this);
		// check if location source enabled		
        if(locTrackerService.canGetLocation()){
        	double latitude = locTrackerService.getLatitude();
        	double longitude = locTrackerService.getLongitude();
        	initilizeMap(latitude, longitude);	
        }else{
        	// can't get location
        	// GPS or Network is not enabled
        	// Ask user to enable GPS/network in settings
        	locTrackerService.showSettingsAlert();
        }
	}
	 /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initilizeMap(double latitude, double longitude) {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
            googleMap.setMyLocationEnabled(true);
            // create marker
            MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude));
             
            // adding marker
            googleMap.addMarker(marker);
            LatLng latLng = new LatLng(latitude, longitude);
	        googleMap.addMarker(new MarkerOptions().position(latLng));
	        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
	        googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
    }
	public void onDoneButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDoneButtonClicked", Toast.LENGTH_LONG).show();
		if(addLocationET.getText().toString().length()==0){
			Toast.makeText(AddLocationActivity.this, "Please enter hub location", Toast.LENGTH_LONG).show();
		}
		else{
			Intent i=new Intent(AddLocationActivity.this, ConnectHubActivity.class);
			i.putExtra("HUB_LOCATION", addLocationET.getText().toString());
			startActivity(i);
		}
	}
}
