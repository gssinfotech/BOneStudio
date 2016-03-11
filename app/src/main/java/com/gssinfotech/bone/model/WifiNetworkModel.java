/**
 * 
 */
package com.gssinfotech.bone.model;

/**
 * @author jnanendra.kumar
 *
 */
public class WifiNetworkModel {

	private String mWifiName;
	private String mWifiSecurityType;
	
	//setter methods
	public void setWifiNmae(String wifiName){
		this.mWifiName=wifiName;
	}
	public void setWifiSecurityType(String wifiSecurityType){
		this.mWifiSecurityType=wifiSecurityType;
	}
	
	//getter methods
	public String getWifiNmae(){
		return this.mWifiName;
	}
	public String getWifiSecurityType(){
		return this.mWifiSecurityType;
	}
	
}
