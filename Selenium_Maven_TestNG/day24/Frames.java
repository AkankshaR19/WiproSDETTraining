package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.switchTo().frame("frame1");

        WebElement heading = driver.findElement(By.id("sampleHeading"));

        System.out.println("Frame Text: " + heading.getText());

        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        driver.quit();
    }
}
