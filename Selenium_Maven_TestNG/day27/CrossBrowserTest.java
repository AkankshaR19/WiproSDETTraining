package day27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setup(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    @Test
    public void openWebsite() {
        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Browser Launched: " + " Thread ID: " + Thread.currentThread().getId());
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
