package day37;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
public class ExcelLoginTest extends BaseTest {
    @DataProvider(name = "excelData")
    public Object[][] getData() throws Exception {
        FileInputStream fis =new FileInputStream("src/test/resources/LoginData.xlsx");
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);
        int rows = sheet.getLastRowNum();
        Object[][] data = new Object[rows][2];
        for (int i = 1; i <= rows; i++) {
            data[i - 1][0] = sheet.getRow(i).getCell(0).toString();
            data[i - 1][1] = sheet.getRow(i).getCell(1).toString();
        }
        wb.close();
        return data;
    }
    @Test(dataProvider = "excelData")
    public void loginTest(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}