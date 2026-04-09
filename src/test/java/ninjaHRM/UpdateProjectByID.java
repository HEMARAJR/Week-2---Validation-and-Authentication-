package ninjaHRM;

import io.restassured.RestAssured;

public class UpdateProjectByID {
	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"createdBy\": \"Tester 1\",\r\n"
					+ "  \"projectName\": \"API endpoint testing\",\r\n"
					+ "  \"status\": \"Ongoing\",\r\n"
					+ "  \"teamSize\": 0\r\n"
					+ "}")
        
		// HTTP METHOD
			.when()
				.put("http://49.249.28.218:8091/project/NH_PROJ_2922")
			
		// RESPONSE
			.then()
				.log().all();
		}	
}
