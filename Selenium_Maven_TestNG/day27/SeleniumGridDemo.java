package day27;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {

    @Test
    public void sauceDemoLogin() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444"),
                options);

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}