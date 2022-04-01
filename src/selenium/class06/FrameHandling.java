package selenium.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox= driver.findElement(By.id("name"));
        textBox.sendKeys("Batch 12 Forever!!");
        driver.switchTo().defaultContent();
        WebElement alertButton=driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //by name or id method;
        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("we are back to frame");
        driver.switchTo().defaultContent();
       WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
       driver.switchTo().frame(frameElement);
       textBox.clear();
       textBox.sendKeys("Hold your horses");
    }
}
