package selenium.class07;

import com.google.common.base.Strings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandle {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       String mainPageHandle= driver.getWindowHandle();//get window handle for main page
        System.out.println(mainPageHandle);

        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();

       Set<String> allWindowHandles= driver.getWindowHandles();//More than one handle so storing in set
        System.out.println(allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();//iterator to iterate through handles
        mainPageHandle=it.next();//take 1st step and assign the main handle
       String childHandle= it.next();//take 2nd step and have child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);
driver.close();
driver.switchTo().window(mainPageHandle);
helpLink.click();










    }
}