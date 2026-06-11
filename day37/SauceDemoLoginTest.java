package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class SauceDemoLoginTest {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setup() {

        extent = ExtentManager.getReport();

        driver = new ChromeDriver();
    }

    @Test
    @Description("Verify successful login into SauceDemo")
    public void loginTest() {

        test = extent.createTest("SauceDemo Login Test");

        driver.get("https://www.saucedemo.com/");
        test.pass("Application launched");

        enterUsername("standard_user");
        enterPassword("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        test.pass("Login button clicked");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        test.pass("Login Successful");
    }

    @Step("Entering Username")
    public void enterUsername(String username) {

        driver.findElement(By.id("user-name"))
                .sendKeys(username);
    }

    @Step("Entering Password")
    public void enterPassword(String password) {

        driver.findElement(By.id("password"))
                .sendKeys(password);
    }

    @AfterClass
    public void tearDown() {

        driver.quit();

        extent.flush();
    }
}
