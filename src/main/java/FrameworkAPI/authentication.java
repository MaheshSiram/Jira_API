package FrameworkAPI;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class authentication {
	
	
public static String getSessionKey(){
		
		RestAssured.baseURI="http://localhost:8080";
		
		Response resp = given().header("Content-Type","application/json").	
		   body("{ \"username\": \"maheshsiramshetty028@gmail.com\", \"password\": \"Enter password\" }").

   when().
       post(Resources.sessionID()).
   then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
   extract().response();
		
		
		JsonPath j = ReuseableMethods.rawToJson(resp);
		String sessionid = j.get("session.value");
		return sessionid;

    }

}