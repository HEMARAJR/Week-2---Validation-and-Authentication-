package parameter;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetProjectByID_QueryParameter {

	@Test
	public void get() {
		
		RestAssured.given()
		.queryParam("projectId", "NH_PROJ_001")
		
		.when()
		.get("http://49.249.28.218:8091/project")
		
		.then()
		.log().all();
		
	}
	
}
