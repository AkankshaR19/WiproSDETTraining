package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThreadDemo_Explicit {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/dynamic-properties");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement button = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

		button.click();

		System.out.println("Button Clicked");

		driver.quit();
	}
}
