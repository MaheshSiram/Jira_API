/*package TestFramework;
import java.io.FileInputStream;

import FrameworkAPI.ReuseableMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import FrameworkAPI.Resources;
import FrameworkAPI.authentication;

public class SessionID {
	
	 Properties prop = new Properties();
	
	@BeforeTest
	  public void Session() throws IOException{
		
		FileInputStream fs = new FileInputStream
				("/home/tanu/CoreJava/JIRA/src/main/java/FrameworkAPI/env.properties");
		prop.load(fs);
	}
	
	@Test
	public static void RequestAdd() throws IOException{
		
		RestAssured.baseURI=prop.getProperty("HOST");
		
		Response resp = given().header("Content-Type","application/json").	
		   body("{ \"username\": \"maheshsiramshetty028@gmail.com\", \"password\": \"developer114\" }").

   when().
       post(Resources.sessionID()).
   then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
   extract().response();
		
		
		JsonPath j = ReuseableMethods.rawToJson(resp);
		System.out.println(j.get("session.value"));
		
	}
	
	
	}
*/
