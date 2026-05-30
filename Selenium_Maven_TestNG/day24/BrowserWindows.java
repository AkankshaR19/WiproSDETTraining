package day24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("tabButton")).click();

        Thread.sleep(2000);

        Set<String> windows = driver.getWindowHandles();

        String[] windowArray = windows.toArray(new String[0]);

        driver.switchTo().window(windowArray[1]);

        System.out.println("Switched To New Tab");

        Thread.sleep(3000);

        driver.close();

        driver.switchTo().window(windowArray[0]);

        Thread.sleep(2000);

        driver.quit();
    }
}