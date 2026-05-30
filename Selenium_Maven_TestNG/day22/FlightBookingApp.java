package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FlightBookingApp {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--guest");

        WebDriver driver = new ChromeDriver(options);

        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://blazedemo.com/");

        Thread.sleep(3000);

        WebElement fromCity =
                driver.findElement(By.name("fromPort"));

        Select from = new Select(fromCity);

        from.selectByVisibleText("Boston");

        Thread.sleep(2000);

        WebElement toCity =
                driver.findElement(By.name("toPort"));

        Select to = new Select(toCity);

        to.selectByVisibleText("London");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Find Flights']"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("inputName"))
                .sendKeys("Akanksha Rath");

        Thread.sleep(2000);

        driver.findElement(By.id("address"))
                .sendKeys("Delhi");

        Thread.sleep(2000);

        driver.findElement(By.id("city"))
                .sendKeys("Delhi");

        Thread.sleep(2000);

        driver.findElement(By.id("state"))
                .sendKeys("Delhi");

        Thread.sleep(2000);

        driver.findElement(By.id("zipCode"))
                .sendKeys("790876");

        Thread.sleep(2000);

        driver.findElement(By.id("creditCardNumber"))
                .sendKeys("1234567890123456");

        Thread.sleep(2000);

        driver.findElement(By.id("creditCardMonth"))
                .clear();

        driver.findElement(By.id("creditCardMonth"))
                .sendKeys("12");

        Thread.sleep(2000);

        driver.findElement(By.id("creditCardYear"))
                .clear();

        driver.findElement(By.id("creditCardYear"))
                .sendKeys("2028");

        Thread.sleep(2000);

        driver.findElement(By.id("nameOnCard"))
                .sendKeys("Akanksha Rath");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Purchase Flight']"))
                .click();

        Thread.sleep(4000);

        String confirmation =
                driver.findElement(By.tagName("h1"))
                        .getText();

        Thread.sleep(2000);

        if (confirmation.contains("Thank you for your purchase today!")) {

            System.out.println("Flight Booked Successfully");

            String bookingID =
                    driver.findElement(By.xpath("//td[text()='Id']/following-sibling::td"))
                            .getText();

            System.out.println("Booking ID: " + bookingID);

        } else {

            System.out.println("Flight Booking Failed");

        }

        Thread.sleep(3000);

        driver.quit();
    }
}