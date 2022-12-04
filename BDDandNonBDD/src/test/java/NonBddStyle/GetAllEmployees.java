package NonBddStyle;

//import org.eclipse.jetty.util.ajax.JSON;
//import org.eclipse.jetty.util.ajax.JSONObjectConvertor;
import org.testng.TestNGException;
import org.testng.annotations.Test;

//import com.google.gson.JsonObject;
//import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees 
{

	@Test (enabled=false)
	public void allEmployees() throws TestNGException {
		RestAssured.baseURI="http://localhost:3000/Employees";

		RequestSpecification requestSpecification=RestAssured.given();

		Response response=requestSpecification.request(Method.GET);

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());


	}
	@Test(enabled=false)
	public  void  createanEmployee(){

		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification requestSpecification=RestAssured.given().
				header("Content-Type","application/json")
				.body("{\"id\": \"105\", \"firstName\": \"Hariharasudhan\", \"LastName\": \"Babu\"}");
		Response response=requestSpecification.request(Method.POST,"/JavaEmployees");
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());

	}
	@Test(enabled=false)
	public  void  UpdateanEmployee(){

		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification=RestAssured.given().
				header("Content-Type","application/json")
				.body("{\"firstName\": \"Hasini\",\"LastName\": \"Babu\" }");
		Response response=requestSpecification.request(Method.PUT,"/JavaEmployees/3");


		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());

	}
	@Test 

	public void deleteanEmployee() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestspecification=RestAssured.given();
		Response response=requestspecification.request(Method.DELETE,"/JavaEmployees/110");
		
		System.out.println(response.asPrettyString());
	}


}



