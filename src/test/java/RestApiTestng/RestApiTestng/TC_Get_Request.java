package RestApiTestng.RestApiTestng;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Get_Request {
	@Test
	public void getWeatherDetail() {
		//set link endpoint
		RestAssured.baseURI="https://reqres.in/api/";
		
		//request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//respone object
		Response respone=httpRequest.request(Method.GET, "users=2");
		
		
		//verify respone
		String str_respone = respone.getBody().asString();	
		System.out.println("Respone request: "+str_respone);
		
		
		int sts_code=respone.getStatusCode();
		System.out.println("Status code: "+sts_code);
		Assert.assertEquals(sts_code, 200);	
		//
	}
}
