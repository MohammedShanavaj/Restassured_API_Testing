package stepDifinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;
import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;

public class StepDifinition extends Utils {
	
	TestDataBuild data = new TestDataBuild();
	RequestSpecification req;
	
	Response response;
	
	@Given("Add place playload with {String} {String} {String}")
	
	public void  add_Location_Payload_With(String name, String language,String address)
	
	{
		
 req =given().spec(requestSpecification())
		 .body(data.addPlacePayload(name, language, address));
		

		
	}
	
	@When(" Users call {String} with {String} https request")
	
	public void submit_AddPlacePayLoad_WithPostRequest(String resource, String method)
	
	{
		APIResources apir=APIResources.valueOf(resource);
		
	ResponseSpecification respec=	new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if (method.equalsIgnoreCase("POST"))
			
		{
			
			
			response=req.when().post(apir.getResource());
			
		}
		
		else if(method.equalsIgnoreCase("GET"))
			
		{
			response=req.get(apir.getResource());
		}
		
	}

	
	
	@Then("Check API call got success with status code 200 {int}")
	
	public void Check_api_got_Success(int status)
	
	{
		
	int actualstatuscode=	response.getStatusCode();
	
	assertEquals(actualstatuscode,status);
		
	}
	
	@Then("status in response body is OK {String} {String}")
	
	public void check_Status_In_Response_Body_IS_OK(String status, String okay)
	{
		
		String actualstatus=jsonParse(response, status);
		
		assertEquals(actualstatus,okay)
	}

}
