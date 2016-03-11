/**
 * 
 */
package com.gssinfotech.bone.model;

/**
 * @author jnanendra.kumar
 *
 */
public class ConnectedDeviceModel {

	private String mDeviceName;
	private String mDeviceConnectedDate;
	
	//setter methods
	public void setDeviceName(String deviceName){
		this.mDeviceName=deviceName;
	}
	public void setDeviceConnectedDate(String deviceConnectedDate){
		this.mDeviceConnectedDate=deviceConnectedDate;
	}
	
	//getter methods
	public String getDeviceName(){
		return this.mDeviceName;
	}
	public String getDeviceConnectedDate(){
		return this.mDeviceConnectedDate;
	}
	
}
