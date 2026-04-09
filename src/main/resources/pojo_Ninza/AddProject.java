package pojo_Ninza;

import static io.restassured.RestAssured.*;

//import pojo_Ninza.Ninza;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class AddProject {

    @Test
    public void addProjectTest() {

        Ninza json_data = new Ninza();
        json_data.setCreatedBy("Tester");
        json_data.setProjectName("Testing 1");
        json_data.setStatus("Completed");
        json_data.setTeamSize(0);

        given()
            .contentType(ContentType.JSON)
            .body(json_data)

        .when()
            .post("http://49.249.28.218:8091/addProject")

        .then()
            .log().all()
            .statusCode(201);
    }
}
