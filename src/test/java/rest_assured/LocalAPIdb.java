package rest_assured;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class LocalAPIdb {
    //RUN 1 BY 1
    //@Test
    @Test(priority=1)
    public void getRequest() {
        baseURI="http://localhost:3000";
        given()
                .get("/users")
                .then()
                .statusCode(200).log().all();
    }

    //@Test
    @Test(priority=2)
    public void postRequest() {
        baseURI="http://localhost:3000";
        JSONObject jsonobject=new JSONObject();
        //jsonobject.put("id", 4);   will be auto generated
        jsonobject.put("firstName", "selvi");
        jsonobject.put("lastName", "satish");
        jsonobject.put("subjectId", 2);
        System.out.println(jsonobject.toJSONString());

        given()
                .header("Content-Type","application/json")
                .body(jsonobject.toJSONString())
                .when()
                .post("/users")
                .then()
                .statusCode(201).log().all();
    }
    //@Test
    @Test(priority=3)
    public void putRequest() {
        baseURI="http://localhost:3000";          //update
        JSONObject jsonobject=new JSONObject();
        //jsonobject.put("id", 4);   will be auto generated
        jsonobject.put("firstName", "Arthi");     //
        jsonobject.put("lastName", "Raj");     	  //
        jsonobject.put("subjectId", 2);
        System.out.println(jsonobject.toJSONString());

        given()
                .header("Content-Type","application/json")
                .body(jsonobject.toJSONString())
                .when()
                .put("/users/4")                 //
                .then()
                .statusCode(200).log().all();
    }
    //@Test
    @Test(priority=4)
    public void patchRequest() {
        baseURI="http://localhost:3000";          //update the put
        JSONObject jsonobject=new JSONObject();

        jsonobject.put("lastName", "Rajkumar");     	  //

        System.out.println(jsonobject.toJSONString());

        given()
                .header("Content-Type","application/json")
                .body(jsonobject.toJSONString())
                .when()
                .patch("/users/4")                 //
                .then()
                .statusCode(200).log().all();
    }

    //@Test
    @Test(priority=5)
    public void deleteRequest() {
        baseURI="http://localhost:3000";
        when()
                .delete("/users/4")
                .then()
                .statusCode(200);
    }

}
