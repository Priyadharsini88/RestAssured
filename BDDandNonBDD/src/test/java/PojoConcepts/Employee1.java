package PojoConcepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		Employee employee1=new Employee();
		employee1.setFirstName("Karthikeya");
		employee1.setLastName("sivan");
		employee1.setEmail("jhfjfhse@gjs.com");
		employee1.setSkills("java");
		
		System.out.println(employee1.getFirstName());
		System.out.println(employee1.getLastName());
		System.out.println(employee1.getEmail());
		System.out.println(employee1.getSkills());
		//object mapper is to print it in json format .it belongs to jackson data binding 
		
		ObjectMapper mapper=new ObjectMapper();
		
		String employeejson= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		
		System.out.println(employeejson);
		
	}

}
