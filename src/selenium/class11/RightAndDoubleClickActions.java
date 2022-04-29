package selenium.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightAndDoubleClickActions {
    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

   Actions action=new Actions(driver);
   action.contextClick(rightClickButton).perform();

  WebElement editOptions= driver.findElement(By.xpath("//span[text()='Edit']"));
  action.click(editOptions).perform();
 // editOptions.click();//sometimes when this click does not work we have option above
  Thread.sleep(2000);
  Alert alert=driver.switchTo().alert();
  alert.accept();
  WebElement doubleClickButton= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
action.doubleClick(doubleClickButton).perform();

        System.out.println(alert.getText());
        alert.accept();

    }
}