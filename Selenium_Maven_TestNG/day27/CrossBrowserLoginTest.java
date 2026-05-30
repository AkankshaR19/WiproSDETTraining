package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserLoginTest {

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
    public void sauceDemoLogin() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        if(title.contains("Swag")) {

            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
