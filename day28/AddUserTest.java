package day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddUserTest 
{
    @Test
    public void addUser()
    {

        String requestBody = "{\n" +
                "\"firstName\": \"Muhammad\",\n" +
                "\"lastName\": \"Ovi\",\n" +
                "\"age\": 250\n" +
                "}";

        given()

            .contentType(ContentType.JSON)
            .body(requestBody)

        .when()

            .post("https://dummyjson.com/users/add")

        .then()

            .statusCode(201)
            .log().all();
    }
}
