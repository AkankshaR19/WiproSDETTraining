package day26;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_DB {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/seleniumdb","root","root@123");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from login");
        while (rs.next()) {
            String Username = rs.getString("username");
            String Password = rs.getString("password");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys(Username);
            driver.findElement(By.id("password")).sendKeys(Password);
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(2000);
            driver.quit();
        }
        con.close();
    }
}