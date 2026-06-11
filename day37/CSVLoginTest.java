package day37;
import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.List;
public class CSVLoginTest extends BaseTest {
    @DataProvider(name = "csvData")
    public Object[][] getData() throws Exception {
        CSVReader reader =new CSVReader(new FileReader("src/test/resources/LoginData.csv"));
        List<String[]> records = reader.readAll();
        Object[][] data = new Object[records.size() - 1][2];
        for (int i = 1; i < records.size(); i++) {
            data[i - 1][0] = records.get(i)[0];
            data[i - 1][1] = records.get(i)[1];
        }
        return data;
    }
    @Test(dataProvider = "csvData")
    public void loginTest(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
