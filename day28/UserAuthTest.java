package day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UserAuthTest 
{
    @Test
    public void getAuthenticatedUser()
    {

        String requestBody = "{\n" +
                "\"username\": \"emilys\",\n" +
                "\"password\": \"emilyspass\"\n" +
                "}";

        String token = given()

                .contentType(ContentType.JSON)
                .body(requestBody)

        .when()

                .post("https://dummyjson.com/user/login")

        .then()

                .statusCode(200)
                .extract()
                .path("accessToken");

        System.out.println("Generated Token: " + token);

        given()

                .header("Authorization", "Bearer " + token)

        .when()

                .get("https://dummyjson.com/user/me")

        .then()

                .statusCode(200)
                .log().all();
    }
}
