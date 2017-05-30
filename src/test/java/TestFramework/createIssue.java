package TestFramework;
import java.io.FileInputStream;
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
import FrameworkAPI.ReuseableMethods;
import FrameworkAPI.authentication;
import FrameworkAPI.payLoad;

public class createIssue {
	
	//create bub/defect
       Properties prop = new Properties();
	
	  @BeforeTest
	  public void Session() throws IOException{
		
		FileInputStream fs = new FileInputStream
				("/home/tanu/CoreJava/JIRA/src/main/java/FrameworkAPI/env.properties");
		prop.load(fs);
	}	

	@Test
	public void createBug(){
		
		RestAssured.baseURI=prop.getProperty("HOST");
		
   Response res = given().
    header("cookie","JSESSIONID="+authentication.getSessionKey()).
	header("Content-Type","application/json").
	body(payLoad.createBug()).
	when().
	post(Resources.createIssue()).
   then().statusCode(201).and().extract().response();
   
      JsonPath js = ReuseableMethods.rawToJson(res);
      String ID = js.get("id");
      System.out.println(ID);

	}
	

}
