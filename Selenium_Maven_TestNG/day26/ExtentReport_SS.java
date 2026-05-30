package day26;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.google.common.io.Files;

public class ExtentReport_SS {

    public static void main(String[] args) throws IOException {

        ExtentSparkReporter reporter =new ExtentSparkReporter("reports/ExtentReport.html");

        ExtentReports extent =new ExtentReports();

        extent.attachReporter(reporter);

        ExtentTest test =extent.createTest("SauceDemo Login Test");

        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        test.info("Browser Opened Successfully");

        driver.get("https://www.saucedemo.com");

        test.pass("Website Opened");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        test.pass("Username Entered");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        test.pass("Password Entered");

        driver.findElement(By.id("login-button")).click();

        test.pass("Login Button Clicked");

        String title = driver.getTitle();

        if(title.contains("Swag Labs"))
        {
            test.pass("Login Successful");

            TakesScreenshot ts =(TakesScreenshot) driver;

            File src =ts.getScreenshotAs(OutputType.FILE);

            File dest =new File("reports/login.png");

            Files.copy(src, dest);

            test.addScreenCaptureFromPath("login.png");

            test.pass("Screenshot Attached");
        }
        else
        {
            test.fail("Login Failed");
        }

        driver.quit();

        test.info("Browser Closed");

        extent.flush();

        System.out.println("Extent Report Generated");
    }
}