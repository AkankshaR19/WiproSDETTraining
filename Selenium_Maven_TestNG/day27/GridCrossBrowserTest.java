package day27;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridCrossBrowserTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setup(String browser) throws MalformedURLException {

        if(browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    options);
        }

        else if(browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    options);
        }

        else if(browser.equalsIgnoreCase("edge")) {

            EdgeOptions options = new EdgeOptions();

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    options);
        }

        driver.manage().window().maximize();

        System.out.println("Browser Launched: "
                + browser
                + " Thread ID: "
                + Thread.currentThread().getId());
    }

    @Test
    public void sauceDemoLogin() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(10000);    
        }

    @AfterTest
    public void closeBrowser() {
    

        driver.quit();
    }
}
