package BDDstyle;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetJavaEmployees {

	@Test(enabled=false)

	public void getalljavaemployees(){

		RestAssured.given().baseUri("http://localhost:3000")
		.when().get("/JavaEmployees")
		.prettyPrint();
		}
	@Test(enabled=false)

	public void createjavaemployees(){

		RestAssured.given().baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\"id\": \"115\", \"firstName\": \"Harish\", \"LastName\": \"Babu\"}")
		.when().post("/MyEmployees")
		.prettyPrint();
		}
	@Test(enabled=false)

	public void updatejavaemployees(){

		RestAssured.given().baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\"id\": \"115\", \"firstName\": \"Harish\", \"LastName\": \"BabuPriya\"}")
		.when().put("/MyEmployees/115")
		.prettyPrint();
		}
	@Test
	
	public void createjavaemployeesfromjsonfile(){
		//created a json file and passing data through this 
		
		File jsonfile=new File("postData.json");

		RestAssured.given().baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(jsonfile)
		.when().post("/MyEmployees")
		.prettyPrint();
		}

}
