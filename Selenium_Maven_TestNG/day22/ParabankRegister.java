package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankRegister {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        driver.findElement(By.id("customer.firstName")).sendKeys("Akanksha");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.lastName")).sendKeys("Rath");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.address.street")).sendKeys("Bhubaneswar");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.address.city")).sendKeys("Bhubaneswar");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.address.state")).sendKeys("Odisha");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("751024");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.username"))
              .sendKeys("akanksha12345");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.password"))
              .sendKeys("Password123");
        Thread.sleep(2000);

        driver.findElement(By.id("repeatedPassword"))
              .sendKeys("Password123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(3000);

        System.out.println("Account Registered Successfully");

        driver.quit();
    }
}
