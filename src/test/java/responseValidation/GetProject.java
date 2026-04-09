package responseValidation;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;



public class GetProject {

	@Test
	public void getSingleProject() {
		
		given()
//		.pathParam("projectId","NH_PROJ_319")	qaw!~#
		
		.when()
		.get("http://49.249.28.218:8091/projects")
		
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.statusLine(containsString("HTTP"))
		.time(lessThan(5000L));
		
	}
	
}
