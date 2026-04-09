package responseValidation;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject {

	@Test
	public void createProject() {
		
		given()
		.contentType(ContentType.JSON)
		.body("{\n" +
		"\"createdBy\":\"QWERTYUIOASDFGHJKZXCVBNM\",\n" +
		"\"projectName\":\"NH_PROJ_89001211\",\n" +
		"\"status\":\"Ongoing\",\n" +
		"\"teamSize\":0\n" +
		"}")

		.when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
		.log().all()
		.assertThat()
		.statusCode(201)
		.statusLine(containsString("HTTP"))
		.time(lessThan(5000L));
		
	}
	
}
