package selenium.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo3 {
    public static String url = "http://google.com";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get(url);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open('http://amazon.com');");//opens new tab and navigate to amazon
        driver.get(url);

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("samkinagdhhsd");
    }
}