package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoQATextBoxAutomation {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Rahul Sharma");

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("rahulsharma@gmail.com");

        Thread.sleep(1000);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Mumbai, Maharashtra");

        Thread.sleep(1000);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Pune, Maharashtra");

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        Thread.sleep(3000);

        String outputName = driver.findElement(By.id("name")).getText();

        if (outputName.contains("Rahul Sharma")) {
            System.out.println("Form Submitted Successfully");
        } else {
            System.out.println("Form Submission Failed");
        }

        Thread.sleep(2000);

        fullName.clear();
        email.clear();
        currentAddress.clear();
        permanentAddress.clear();

        System.out.println("All fields cleared successfully");

        Thread.sleep(3000);

        driver.quit();
    }
}