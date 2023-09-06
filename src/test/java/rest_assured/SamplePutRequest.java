package rest_assured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.ValidatableResponse;

public class SamplePutRequest {

    @Test(priority=1)
    public void putRequestExample()
    {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name", "RekaNV");
        jsonObject.put("job", "QC");
        // text
        System.out.println(jsonObject.toString());

        //RestAssured.baseURI="https://reqres.in/api";
        baseURI="https://reqres.in/api";
        //ValidatableResponse response=RestAssured

        given()
                .header("", "")
                //raw  json as in postman
                .body(jsonObject.toJSONString())
                .when()
                .put("/users/2")
                .then()
                .statusCode(200);
    }

    @Test(priority=2)
    public void patchRequestExample()
    {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name", "RekaNV");
        jsonObject.put("job", "SDET");
        // text
        System.out.println(jsonObject.toString());

        //RestAssured.baseURI="https://reqres.in/api";
        baseURI="https://reqres.in/api";
        //ValidatableResponse response=RestAssured

        given()
                .header("Content-Type","application/json")
                .header("", "")
                //raw  json as in postman
                .body(jsonObject.toJSONString())
                .when()
                .patch("/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void deleteRequestExample()
    {
        //RestAssured.baseURI="https://reqres.in/api";
        baseURI="https://reqres.in/api";
        //ValidatableResponse response=RestAssured
        //.given()
        given()
                .header("", "")
                .when()
                .delete("/users/2")
                .then()
                .statusCode(204);
    }

}
