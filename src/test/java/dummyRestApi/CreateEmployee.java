package dummyRestApi;

import io.restassured.RestAssured;

public class CreateEmployee {

	public static void main(String[] args) {
		RestAssured.given()
		.contentType("application/json")
		.body("{\"name\":\"test\",\"salary\":\"120000\",\"age\":\"21\"}")
		
		.when()
			.post("https://dummy.restapiexample.com/api/v1/create")
	
		.then()
			.log().all();
	}

}
