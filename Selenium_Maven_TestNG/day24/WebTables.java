package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/webtables");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("addNewRecordButton")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("firstName")).sendKeys("Rahul");

        driver.findElement(By.id("lastName")).sendKeys("Sharma");

        driver.findElement(By.id("userEmail")).sendKeys("rahul@gmail.com");

        driver.findElement(By.id("age")).sendKeys("25");

        driver.findElement(By.id("salary")).sendKeys("50000");

        driver.findElement(By.id("department")).sendKeys("Testing");

        Thread.sleep(2000);

        driver.findElement(By.id("submit")).click();

        System.out.println("Record Added Successfully");

        Thread.sleep(3000);

        driver.quit();
    }
}
