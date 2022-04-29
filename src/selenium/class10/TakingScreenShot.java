package selenium.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
       WebElement loginButton= driver.findElement(By.className("button"));
       loginButton.click();
        TakesScreenshot ts=(TakesScreenshot) driver;//creating object and down casting it to driver
       File srcFile= ts.getScreenshotAs(OutputType.FILE);//taking screenshot and turning into file/bytes


        try {
            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/adminLogin111.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
