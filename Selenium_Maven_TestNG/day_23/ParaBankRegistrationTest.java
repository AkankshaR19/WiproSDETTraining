package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParaBankRegistrationTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @Test(priority = 1)
    public void verifyPageTitle() {

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "ParaBank | Register for Free Online Account Access");

        System.out.println("Title Validation Passed");
    }

    @Test(priority = 2)
    public void registrationTest() throws InterruptedException {

        driver.findElement(By.id("customer.firstName"))
                .sendKeys("Akanksha");

        driver.findElement(By.id("customer.lastName"))
                .sendKeys("Rath");

        driver.findElement(By.id("customer.address.street"))
                .sendKeys("Bhubaneswar");

        driver.findElement(By.id("customer.address.city"))
                .sendKeys("Bhubaneswar");

        driver.findElement(By.id("customer.address.state"))
                .sendKeys("Odisha");

        driver.findElement(By.id("customer.address.zipCode"))
                .sendKeys("751024");

        driver.findElement(By.id("customer.phoneNumber"))
                .sendKeys("9876543210");

        driver.findElement(By.id("customer.ssn"))
                .sendKeys("123456");

        driver.findElement(By.id("customer.username"))
                .sendKeys("akanksha123");

        driver.findElement(By.id("customer.password"))
                .sendKeys("admin123");

        driver.findElement(By.id("repeatedPassword"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//input[@value='Register']"))
                .click();

        Thread.sleep(3000);

        String successMessage =
                driver.findElement(By.xpath("//h1")).getText();

        Assert.assertEquals(successMessage, "Welcome akanksha123");

        System.out.println("Registration Successful");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}