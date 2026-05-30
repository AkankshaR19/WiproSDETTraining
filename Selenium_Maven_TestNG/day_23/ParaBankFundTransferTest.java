package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParaBankFundTransferTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void fundTransferTest() throws InterruptedException {


        driver.findElement(By.name("username"))
                .sendKeys("akanksha123");

        driver.findElement(By.name("password"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        Thread.sleep(3000);

        System.out.println("Login Successful");


        driver.findElement(By.linkText("Transfer Funds"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("amount"))
                .sendKeys("500");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Transfer']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Fund Transfer Successful");

        driver.findElement(By.linkText("Log Out"))
                .click();

        Thread.sleep(3000);

        System.out.println("Logout Successful");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}