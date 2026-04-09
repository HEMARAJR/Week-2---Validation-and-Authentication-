package responseValidation;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;



public class DeleteProject {

	@Test
	public void getSingleProject() {
		
		given()
		.pathParam("projectId","NH_PROJ_312")
		
		.when()
		.delete("http://49.249.28.218:8091/project/{projectId}")
		
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.statusLine(containsString("HTTP"))
		.time(lessThan(5000L));
		
	}
	
}
