package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankApp {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        Thread.sleep(2000);

        driver.findElement(By.name("username"))
                .sendKeys("akanksha12345");

        Thread.sleep(2000);

        driver.findElement(By.name("password"))
                .sendKeys("Password123");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Transfer Funds"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("amount"))
                .sendKeys("100");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Transfer']"))
                .click();

        Thread.sleep(2000);

        String message =
                driver.findElement(By.xpath("//h1[@class='title']"))
                        .getText();

        Thread.sleep(2000);

        if (message.equals("Transfer Complete!")) {

            System.out.println("Fund Transfer Successful");

        } else {

            System.out.println("Transfer Failed");

        }

        Thread.sleep(2000);

        driver.findElement(By.linkText("Log Out"))
                .click();

        Thread.sleep(2000);

        driver.quit();
    }
}