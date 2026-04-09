package task_1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Automation {
	final String BASE_URL = "https://automationexercise.com/api";
	String update = "{ \"email\": \"tester01@example.com\", \"birth_date\": \"14\", \"birth_month\": \"08\", \"birth_year\": \"2004\", \"zipcode\": \"608002\" }";
	
	@Test
	void createUserAccount() {
		
		RestAssured.given()
        .contentType("application/x-www-form-urlencoded")
        .formParam("name", "Tester 1")
        .formParam("email", "tester01@example.com")
        .formParam("password", "SecurePassTest123")
        .formParam("title", "Mr")
        .formParam("birth_date", "14")
        .formParam("birth_month", "August")
        .formParam("birth_year", "1972")
        .formParam("firstname", "Mr")
        .formParam("lastname", "Tester")
        .formParam("company", "Tech Solutions Pvt Ltd")
        .formParam("address1", "123 Anna Nagar Street")
        .formParam("address2", "Near Metro Station")
        .formParam("country", "India")
        .formParam("zipcode", "600040")
        .formParam("state", "Tamil Nadu")
        .formParam("city", "Chennai")
        .formParam("mobile_number", "9876543210")

    .when()
        .post(BASE_URL + "/createAccount")

    .then()
        .log().all();
	}
	
	@Test
	void getUserByID() {
		RestAssured.given()
		.formParam("email", "tester01@example.com")
			.when()
				.get(BASE_URL + "/getUserDetailByEmail")
			.then().log().all();
	}
	
	@Test
	void deleteUser() {
		RestAssured.given()
			.formParam("email", "tester01@example.com")
			.formParam("password", "SecurePassTest123")
			
			.when()
				.delete(BASE_URL + "/deleteAccount")
			.then().log().all();
	}
	
	@Test
	void updateAccount() {
		RestAssured.given()
			.formParam("email", "tester01@example.com")
			.formParam("password", "SecurePassTest123")
			.formParam("birth_date", "30")
	        .formParam("birth_month", "10")
	        .formParam("birth_year", "2000")
	        .formParam("zipcode", "600099")
			
			.when()
				.put(BASE_URL + "/updateAccount")
			.then().log().all();
	}
	
	
}
