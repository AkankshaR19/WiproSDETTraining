package day26;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DDT_log {
	static Logger log = LogManager.getLogger(DDT_log.class);
 
    public static void main(String[] args)
            throws EncryptedDocumentException, IOException {
 
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\KIIT\\Desktop\\Book1.xlsx");
 
        Workbook wb = WorkbookFactory.create(fis);
 
        Sheet sh = wb.getSheet("Sheet1");
 
        int rows = sh.getLastRowNum();
 
        DataFormatter formatter = new DataFormatter();
 
        for (int i = 1; i <= rows; i++) {
 
            Row row = sh.getRow(i);

            if (row != null) {
 
                String Username =
                        formatter.formatCellValue(row.getCell(0));
 
                String Password =
                        formatter.formatCellValue(row.getCell(1));
 
                WebDriver driver = new ChromeDriver();
 
                driver.get("https://www.saucedemo.com");
 
                driver.findElement(By.id("user-name"))
                        .sendKeys(Username);
                log.info("user: "+Username);
 
                driver.findElement(By.id("password"))
                        .sendKeys(Password);
                log.info("pass: "+Password);
 
                driver.findElement(By.id("login-button"))
                        .click();
                
 
                driver.quit();
            }
        }
 
        wb.close();
        fis.close();
    }
}
