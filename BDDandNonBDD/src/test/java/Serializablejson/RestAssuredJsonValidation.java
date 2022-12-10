package Serializablejson;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonValidation {
	@Test
	
	
	public void ValidationusingJsonSchemainClasspath() {
		
		File inputJson=new File("src/test/resources/input.json");
		
		RestAssured.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/MyEmployees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Scehema.json"));
	}

}
