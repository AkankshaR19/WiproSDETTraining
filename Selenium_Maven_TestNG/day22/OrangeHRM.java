package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("Admin");

        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("admin123");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();

        Thread.sleep(1000);

        driver.findElement(By.linkText("Logout")).click();

        Thread.sleep(2000);

        driver.quit();
    }

}
