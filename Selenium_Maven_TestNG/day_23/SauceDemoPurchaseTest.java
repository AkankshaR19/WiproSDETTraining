package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoPurchaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void purchaseFlowTest() throws InterruptedException {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        Thread.sleep(3000);

        System.out.println("Login Successful");

        String productName =
                driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"))
                        .getText();

        System.out.println("Product Found: " + productName);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        Thread.sleep(2000);

        System.out.println("Product Added To Cart");

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("checkout"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("first-name"))
                .sendKeys("Akanksha");

        driver.findElement(By.id("last-name"))
                .sendKeys("Rath");

        driver.findElement(By.id("postal-code"))
                .sendKeys("751024");

        driver.findElement(By.id("continue"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("finish"))
                .click();

        Thread.sleep(3000);

        String confirmationMessage =
                driver.findElement(By.className("complete-header"))
                        .getText();

        System.out.println(confirmationMessage);

        driver.findElement(By.id("react-burger-menu-btn"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("logout_sidebar_link"))
                .click();

        Thread.sleep(3000);

        System.out.println("Logout Successful");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}