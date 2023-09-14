package rest_assured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Sample_4_PostRequest {

    @Test
    public void testPost() {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name", "Reka");
        jsonObject.put( "job","SDET");
        System.out.println(jsonObject.toString());
        RestAssured.baseURI="https://reqres.in/api";
        ValidatableResponse response=RestAssured
                .given()
                .header("Content-Type","application/json")
                // [contentType(ContenTtype.JSON)
                //.accept(ContenTtype.JSON)]
                .body(jsonObject.toString())
                .when()
                .post("/users")
                .then()
                .statusCode(201).log().all();
    }

}
