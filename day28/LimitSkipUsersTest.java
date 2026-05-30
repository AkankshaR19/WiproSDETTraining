package day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class LimitSkipUsersTest 
{
    @Test
    public void limitAndSkipUsers()
    {
        given()

            .queryParam("limit", 5)
            .queryParam("skip", 10)
            .queryParam("select", "firstName,age")

        .when()

            .get("https://dummyjson.com/users")

        .then()

            .statusCode(200)
            .log().all();
    }
}