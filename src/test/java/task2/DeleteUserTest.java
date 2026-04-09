package task2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class DeleteUserTest {

    @Test
    public void deleteUser() {

        RestAssured.baseURI = "http://49.249.28.218:8091";

        RestAssured
                .given()
                .delete("/projects/NH_PROJ_001")
                .then()
                .statusCode(204)
                .log().all();
    }
}
