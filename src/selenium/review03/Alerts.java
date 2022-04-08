package selenium.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       WebElement simpleAlert= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
   simpleAlert.click();
   //handling alert
     Alert alert= driver.switchTo().alert();
     alert.accept();


    }
}
