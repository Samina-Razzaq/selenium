package seleniumclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement username= driver.findElement(By.xpath("//input[contains(@id,'ctl00_MainContent_username')]"));
username.sendKeys("Tester");
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("test");
WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
Thread.sleep(2000);
login.click();
driver.quit();
    }
}
