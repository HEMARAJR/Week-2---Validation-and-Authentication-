package fakeRESTAPI.Users;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateUser {

	@Test
	public void updateUser() {
		String str = """
	            {
	                "userName": "tester 1",
	                "password": "tester@001"
	             }
	                    """;
		RestAssured.given()
			.contentType("application/json")
			.body(str)
			.pathParam("id", 0)
					
		
		// HTTP METHOD
				.when()
					.put("https://fakerestapi.azurewebsites.net/api/v1/Users/{id}")
		
		// RESPONSE
				.then()
					.log().all()
					.assertThat()
						  .statusCode(200)
						  .statusLine(Matchers.containsString("HTTP"))
						  .time(Matchers.lessThan(5000l));
	}
}
