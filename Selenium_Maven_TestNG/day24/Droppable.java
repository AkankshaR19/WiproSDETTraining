package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/droppable");

        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        // ================= SIMPLE =================

        Thread.sleep(2000);

        WebElement simpleDrag = driver.findElement(By.id("draggable"));

        WebElement simpleDrop = driver.findElement(By.id("droppable"));

        action.clickAndHold(simpleDrag)
              .moveToElement(simpleDrop)
              .release()
              .perform();

        System.out.println("Simple Done");

        // ================= ACCEPT =================

        Thread.sleep(3000);

        driver.findElement(By.id("droppableExample-tab-accept")).click();

        Thread.sleep(2000);

        WebElement acceptable = driver.findElement(By.id("acceptable"));

        WebElement acceptDrop = driver.findElement(
                By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));

        action.clickAndHold(acceptable)
              .moveToElement(acceptDrop)
              .release()
              .perform();

        System.out.println("Accept Done");

        // ================= PREVENT PROPAGATION =================

        Thread.sleep(3000);

        driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();

        Thread.sleep(2000);

        WebElement preventDrag = driver.findElement(By.id("dragBox"));

        WebElement preventDrop = driver.findElement(By.id("notGreedyDropBox"));

        action.clickAndHold(preventDrag)
              .moveToElement(preventDrop)
              .release()
              .perform();

        System.out.println("Prevent Propagation Done");

        // ================= REVERT DRAGGABLE =================

        Thread.sleep(3000);

        driver.findElement(By.id("droppableExample-tab-revertable")).click();

        Thread.sleep(2000);

        WebElement revertDrag = driver.findElement(By.id("revertable"));

        WebElement revertDrop = driver.findElement(
                By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));

        action.clickAndHold(revertDrag)
              .moveToElement(revertDrop)
              .release()
              .perform();

        System.out.println("Revert Draggable Done");

        Thread.sleep(5000);

        driver.quit();
    }
}