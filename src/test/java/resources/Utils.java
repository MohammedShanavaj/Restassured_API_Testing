package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {

	
	public RequestSpecification requestSpecification()
	{
		
		RequestSpecification req= new RequestSpecBuilder().setBaseUri("baseUrl=https://rahulshettyacademy.com")
		.addQueryParam("qaclick", "qaclick123")
		.setContentType(ContentType.JSON).build();
		return req;
	}
	
	
	public String getGlobalValues(String key) throws IOException
	
	
	{
		Properties prop=new Properties();
		
		FileInputStream fis= new FileInputStream("src\\test\\java\\resources\\global.properties");
		
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public String jsonParse(Response httpsresponse,String key)
	
	{
	String resp=httpsresponse.asString();
	
		JsonPath jsonpath=new JsonPath(resp);
		
		return jsonpath.get(key).toString();
		
	}
}
