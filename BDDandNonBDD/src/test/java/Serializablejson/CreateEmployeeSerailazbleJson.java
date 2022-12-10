package Serializablejson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateEmployeeSerailazbleJson {
	
	@Test
	
	public void createajson() {
		
		Map<String , Object> jsonbody =new HashMap<String, Object> ();
		List<String> skills= new ArrayList<>();
		
		skills.add("java");
		skills.add("selelnium");
		
		jsonbody.put("firstname", "Muruga");
		jsonbody.put("lastname", "Siva");
		jsonbody.put("email", "Muruga.siva@gmail.com");
		jsonbody.put("skills", skills);
		
		System.out.println(jsonbody);
		
		RestAssured.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(jsonbody)
		.log()
		.all()
		.when()
		.post("/MyEmployees")
		.then()
		.log()
		.all();
		
		
		
	}
	

}
