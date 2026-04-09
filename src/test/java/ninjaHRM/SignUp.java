package ninjaHRM;

import io.restassured.RestAssured;

public class SignUp {
	public static void main(String[] args) {
			
		// PRE CONDITION
		RestAssured.given()
		.contentType("application/json")
        .body("{\r\n"
        		+ "  \"address\": \"Tester 1\",\r\n"
        		+ "  \"contact\": \"9876543210\",\r\n"
        		+ "  \"email\": \"test@gmail.com\",\r\n"
        		+ "  \"gender\": \"male\",\r\n"
        		+ "  \"name\": \"Tester\",\r\n"
        		+ "  \"password\": \"tester@001\",\r\n"
        		+ "  \"role\": \"Test Engineer\",\r\n"
        		+ "  \"username\": \"Tester\"\r\n"
        		+ "}")
        
		// HTTP METHOD
			.when()
				.post("49.249.28.218:8091/signup")
			
		// RESPONSE
			.then()
				.log().all();
			}
	}
