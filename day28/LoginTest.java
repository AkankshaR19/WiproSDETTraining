package day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class LoginTest 
{
    @Test
    public void loginUser()
    {
        String requestBody = "{\n" +
                "\"username\": \"emilys\",\n" +
                "\"password\": \"emilyspass\",\n" +
                "\"expiresInMins\": 30\n" +
                "}";

        given()

            .contentType(ContentType.JSON)
            .body(requestBody)

        .when()

            .post("https://dummyjson.com/user/login")

        .then()

            .statusCode(200)
            .log().all();
    }
}
