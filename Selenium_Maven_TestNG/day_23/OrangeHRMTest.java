package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void employeeManagementTest() throws InterruptedException {

        // Admin Login

        driver.findElement(By.name("username"))
                .sendKeys("Admin");

        driver.findElement(By.name("password"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(3000);

        System.out.println("Login Successful");

        // Open PIM Module

        driver.findElement(By.xpath("//span[text()='PIM']"))
                .click();

        Thread.sleep(3000);

        // Add Employee

        driver.findElement(By.xpath("//a[text()='Add Employee']"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.name("firstName"))
                .sendKeys("Akanksha");

        driver.findElement(By.name("lastName"))
                .sendKeys("Rath");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Employee Added");

        // Search Employee

        driver.findElement(By.xpath("//span[text()='PIM']"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"))
                .sendKeys("Akanksha");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Employee Search Successful");

        // Update Employee

        driver.findElement(By.xpath("(//div[@role='row'])[2]"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.name("lastName"))
                .clear();

        driver.findElement(By.name("lastName"))
                .sendKeys("Patra");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Employee Updated");

        // Delete Employee

        driver.findElement(By.xpath("//span[text()='PIM']"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//button[@type='button'])[6]"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()=' Yes, Delete ']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Employee Deleted");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
