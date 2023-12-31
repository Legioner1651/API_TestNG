package rest_assured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;   //***

public class Sample_6_ValidateJSONagainstSchema {

    @Test //(enabled = false)
    public void test3() {
        baseURI="https://reqres.in/api";
        given()
                .get("/users?page=2")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schema.json"))	      //***
                .statusCode(200);
    }

}
