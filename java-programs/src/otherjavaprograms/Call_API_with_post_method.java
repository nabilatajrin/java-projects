package otherjavaprograms;
//Java HttpURLConnection

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import org.json.*;
import java.io.StringReader;
import java.util.Iterator;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Call_API_with_post_method {

	private static JSONObject jObject = null;

	public static void main(String[] args) throws Exception {

		Call_API_with_post_method http = new Call_API_with_post_method();

		System.out.println("\nTesting - Send Http POST request");
		http.sendPost();
	}


	// HTTP POST request
	
	private void sendPost() throws Exception {
		
		//input msisdn_1
		System.out.print("\nPlease enter the phone number\n\n");
		Scanner scanner1 = new Scanner(System.in);
		String msisdn_1 = scanner1.nextLine();

		//check phone number
		Pattern pattern_1 = Pattern.compile("\\+8801[5-9]{1}[0-9]{8}");
		Matcher matcher_1 = pattern_1.matcher(msisdn_1);

		Pattern pattern_2 = Pattern.compile("8801[5-9]{1}[0-9]{8}");
		Matcher matcher_2 = pattern_2.matcher(msisdn_1);

		Pattern pattern_3 = Pattern.compile("008801[5-9]{1}[0-9]{8}");
		Matcher matcher_3 = pattern_3.matcher(msisdn_1);

		Pattern pattern_4 = Pattern.compile("01[5-9]{1}[0-9]{8}");
		Matcher matcher_4 = pattern_4.matcher(msisdn_1);

		if (matcher_1.matches()||matcher_2.matches()||matcher_3.matches()||matcher_4.matches()) {
			System.out.println("Phone Number " +  msisdn_1 + " Is Valid");
      		}
      		else {
    	  		System.out.println("Sorry! Phone Number " + msisdn_1 + " Is Not Valid");
      		}

		//input msg_1
		System.out.print("\nPlease enter the message\n\n");
		Scanner scanner2 = new Scanner(System.in);
		String msg_1 = scanner1.nextLine();

		//input received_1
		System.out.print("\nPlease enter the received time\n\n");
		Scanner scanner3 = new Scanner(System.in);
		String received_1 = scanner1.nextLine(); 		

		//calling to API
		String url = "http://api.xyz.com.usa/sms-request/send";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//encode
		String msisdn = URLEncoder.encode(msisdn_1, "UTF-8");
		String msg = URLEncoder.encode(msg_1, "UTF-8");
		String received = URLEncoder.encode(received_1, "UTF-8");

		//add reuqest header
		con.setRequestMethod("POST");

		//con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String query_en = "msisdn="+msisdn+"&msg="+msg+"&received="+received+"&_key=16227";	
		//String urlParameters = "msisdn=01710376001&msg=pn+12345678&received=2017-03-16+14%3A04&_key=16227";		
		//String encodedUrl = URLEncoder.encode(url, "UTF-8");
		//String urlParameters = URLEncoder.encode(query, "UTF-8");
		
		// Send encoded post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(query_en);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + query_en);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		//System.out.println(response.toString());

		String output = response.toString();
		System.out.println(output);
		JSONObject obj_output = new JSONObject(output);

		System.out.println("\n");		

		Boolean success = obj_output.getBoolean("success");
		System.out.println("success: " + success);

		String message = obj_output.getString("message");//message called from string output
		System.out.println("message: " + message);

		Long request_id = obj_output.getLong("request_id");
		System.out.println("request_id: " + request_id);

		//ternary operator		
		String send_errors;
		send_errors = obj_output.isNull("send_errors") ? null : obj_output.optString("send_errors");
		System.out.println("send_errors: " + send_errors);

		//test
		JSONObject params1 = obj_output.getJSONObject("params");
		System.out.println("###params: " + params1);

		String params = obj_output.isNull("params") ? null : obj_output.optString("params");
		System.out.println("params: " + params);

		String data_errors = obj_output.isNull("data_errors") ? null : obj_output.optString("data_errors");
		System.out.println("data_errors: " + data_errors);

		System.out.println("\n");	

		
		//send_errors.getClass().getName();


		/*String success = obj_output.getString("success");
		System.out.println(success);

		JSONObject obj_output = (JSONObject) jsonObject.get("success");
		JSONObject regData = (JSONObject) data_errors.get("reg_data");

		Boolean status = (Boolean) jsonObject.get("success");
		System.out.println(status);
		
		String msg1 = (String) jsonObject.get("message");
		System.out.println(msg);
		
		JSONObject params = (JSONObject) jsonObject.get("params");
		Long requestKey = (Long) params.get("id_request_key");
		System.out.println(requestKey);
		
		String sms = (String) params.get("sms");
		System.out.println(sms);*/
    
	} 
}
