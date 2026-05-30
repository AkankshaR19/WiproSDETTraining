package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EcomApp {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--guest");

        WebDriver driver = new ChromeDriver(options);

        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("checkout")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("first-name"))
                .sendKeys("Akanksha");

        Thread.sleep(2000);

        driver.findElement(By.id("last-name"))
                .sendKeys("Rath");

        Thread.sleep(2000);

        driver.findElement(By.id("postal-code"))
                .sendKeys("769001");

        Thread.sleep(2000);

        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("finish")).click();

        Thread.sleep(2000);

        String confirmation =
                driver.findElement(By.className("complete-header"))
                        .getText();

        Thread.sleep(2000);

        if (confirmation.equals("Thank you for your order!")) {

            System.out.println("Order placed successfully");

        } else {

            System.out.println("Order failed");

        }

        Thread.sleep(2000);

        driver.quit();
    }
}