package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadDemo_Sleep {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");

        Thread.sleep(5000);

        driver.findElement(By.id("enableAfter")).click();

        driver.quit();
    }
}
