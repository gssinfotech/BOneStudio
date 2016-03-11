/**
 * 
 */
package com.gssinfotech.bone.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 * @author jnanendra.kumar
 *
 */
public class BOneHttpConnection {

		public String httpPost(String requestURL, JSONObject urlParams){
			URL url;
			HttpURLConnection connection=null;
			try {
				//Create connection
				url=new URL(requestURL);
				connection=(HttpURLConnection)url.openConnection();
				connection.setDoInput(true);
				connection.setDoOutput(true);
				connection.setRequestMethod( "POST" );
				connection.setRequestProperty( "Content-Type", "application/json"); 
				connection.setRequestProperty("Accept", "application/json");
				connection.connect();
				//Send request
				OutputStreamWriter wr=new OutputStreamWriter(connection.getOutputStream ());
			    wr.write(urlParams.toString());
			    wr.close ();
			    //Get Response	
			    InputStream is = connection.getInputStream();
			    BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			    String line;
			    StringBuffer response = new StringBuffer(); 
			    while((line = rd.readLine()) != null) {
			        response.append(line);
			      }
			      rd.close();
			      return response.toString();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			    return "";
			}finally {

			      if(connection != null) {
			        connection.disconnect(); 
			      }
			}
		}
}
