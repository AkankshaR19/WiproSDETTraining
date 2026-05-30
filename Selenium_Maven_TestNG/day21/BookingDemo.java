package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.booking.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        try {
            WebElement closePopup = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }

        Thread.sleep(2000);

        driver.findElement(By.name("ss")).sendKeys("Goa");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@data-testid='autocomplete-result'])[1]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@data-date='2026-06-20']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@data-date='2026-06-25']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("(//div[@data-testid='title'])[1]")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
