package day37;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private static final Logger logger =
            LogManager.getLogger(LoginTest.class);

    public static void main(String[] args) {

        logger.info("Test Execution Started");

        WebDriver driver = new ChromeDriver();

        try {
            logger.info("Launching SauceDemo application");
            driver.get("https://www.saucedemo.com/");

            logger.info("Entering username");
            driver.findElement(By.id("user-name"))
                    .sendKeys("standard_user");

            logger.info("Entering password");
            driver.findElement(By.id("password"))
                    .sendKeys("secret_sauce");

            logger.info("Clicking Login button");
            driver.findElement(By.id("login-button")).click();

            String currentUrl = driver.getCurrentUrl();

            if (currentUrl.contains("inventory")) {
                logger.info("Login Successful");
            } else {
                logger.error("Login Failed");
            }

        } catch (Exception e) {
            logger.error("Exception occurred: " + e.getMessage());
        } finally {
            logger.info("Closing Browser");
            driver.quit();
            logger.info("Test Execution Completed");
        }
    }
}