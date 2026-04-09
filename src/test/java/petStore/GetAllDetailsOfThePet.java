package petStore;

import io.restassured.RestAssured;

public class GetAllDetailsOfThePet {
	
	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
		
		// HTTP METHOD
		.when()
			.get("https://petstore.swagger.io/v2/pet")
		
		// RESPONSE
			.then()
				.statusCode(200)
					.log().all();
	}
}
