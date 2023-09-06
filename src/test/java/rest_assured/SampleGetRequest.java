package rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Response response=RestAssured.get("http://www.google.co.in");
        int statusCode=response.statusCode();
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        String statusLine=response.statusLine();
        System.out.println(statusCode);
        System.out.println(statusLine);
        System.out.println();
        System.out.println(response.getHeaders());
    }
}
