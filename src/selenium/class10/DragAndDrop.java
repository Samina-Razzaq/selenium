package selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static String url = "https://jqueryui.com/droppable/";


    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement draggable= driver.findElement(By.id("draggable"));
        WebElement dropable=driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
       // action.dragAndDrop(draggable, dropable).perform();
        action.clickAndHold(draggable).moveToElement(dropable).release().build().perform();
    }
}