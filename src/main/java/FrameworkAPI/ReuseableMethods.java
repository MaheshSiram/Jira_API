package FrameworkAPI;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReuseableMethods {
	
	public static JsonPath rawToJson(Response r){
		
		String response = r.asString();
		JsonPath jp = new JsonPath(response);
		return jp;
	}

}

