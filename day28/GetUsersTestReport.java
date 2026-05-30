package day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GetUsersTestReport 
{
    @Test
    public void getUsers() 
    {
        ExtentSparkReporter sparkReporter =new ExtentSparkReporter("ExtentReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(sparkReporter);

        ExtentTest test = extent.createTest("Get Users API Test");

        given()

        .when().get("https://dummyjson.com/users")

        .then().statusCode(200)
        .log().all();

        test.pass("GET Request executed successfully");

        extent.flush();
    }
}
