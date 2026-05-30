package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetApp {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://the-internet.herokuapp.com/login");
	        driver.manage().window().maximize();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("tomsmith");

	        Thread.sleep(1000);

	        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000);

	        System.out.println(driver.getTitle());

	        driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();

	        Thread.sleep(2000);

	        driver.quit();
	    }

}
