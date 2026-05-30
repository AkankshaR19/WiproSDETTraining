package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PinterestSearch {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.pinterest.com/login/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("email"))
                .sendKeys(Credentials.EMAIL);

        Thread.sleep(1000);

        driver.findElement(By.id("password"))
                .sendKeys(Credentials.PASSWORD);

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(5000);

        driver.findElement(By.name("searchBoxInput"))
                .sendKeys("Beautiful Beaches" + Keys.ENTER);

        Thread.sleep(5000);

        driver.findElement(By.xpath("(//div[@data-test-id='pin'])[1]"))
                .click();

        Thread.sleep(7000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}