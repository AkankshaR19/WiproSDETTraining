package day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class FilterUsersTest 
{
    @Test
    public void filterUsers()
    {
        given()

            .queryParam("key", "hair.color")
            .queryParam("value", "Brown")

        .when()

            .get("https://dummyjson.com/users/filter")

        .then()

            .statusCode(200)
            .log().all();
    }
}