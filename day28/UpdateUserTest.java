package day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateUserTest 
{
    @Test
    public void updateUser()
    {

        String requestBody = "{\n" +
                "\"lastName\": \"Owais\"\n" +
                "}";

        given()

            .contentType(ContentType.JSON)
            .body(requestBody)

        .when()

            .put("https://dummyjson.com/users/2")

        .then()

            .statusCode(200)
            .log().all();
    }
}