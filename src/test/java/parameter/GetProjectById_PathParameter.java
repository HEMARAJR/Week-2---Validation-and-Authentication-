package parameter;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetProjectById_PathParameter {

	@Test
	public void get() {
		RestAssured.given()
		.pathParam("projectId", "NH_PROJ_001" )
		
		.when()
		.get("http://49.249.28.218:8091/project/{projectId}")
		
		.then()
		.log().all();
	}
	
}
