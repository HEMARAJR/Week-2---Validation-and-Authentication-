package responseValidation;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {

@Test
public void updateProject() {

given()
.pathParam("projectId", "NH_PROJ_377")
.contentType(ContentType.JSON)
.body("{\n" +
"  \"createdBy\": \"Kamala\",\n" +
"  \"projectName\": \"Kannan\",\n" +
"  \"status\": \"Ongoing\",\n" +
"  \"teamSize\": 0\n" +
"}")

.when()
.put("http://49.249.28.218:8091/project/{projectId}")

.then()
.log().all()
.assertThat()
.statusCode(200)
.statusLine(containsString("HTTP"))
.time(lessThan(5000L));

}
}