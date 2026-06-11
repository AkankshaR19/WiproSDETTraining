package day37;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
public class JsonLoginTest extends BaseTest {
    @DataProvider(name = "jsonData")
    public Object[][] getData() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode users = mapper.readTree(new File("src/test/resources/LoginData.json"));
        Object[][] data = new Object[users.size()][2];
        for (int i = 0; i < users.size(); i++) {
            data[i][0] = users.get(i).get("username").asText();
            data[i][1] = users.get(i).get("password").asText();
        }
        return data;
    }
    @Test(dataProvider = "jsonData")
    public void loginTest(String username, String password) {

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
