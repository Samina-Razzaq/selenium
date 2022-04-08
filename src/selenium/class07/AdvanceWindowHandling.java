package selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandling {
    //click on windows and open new tabs
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
      WebElement igButton= driver.findElement(By.linkText("Follow On Instagram"));
      WebElement fbButton=driver.findElement(By.linkText("Like us On Facebook"));
      WebElement igAndFbButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));
igButton.click();
fbButton.click();
igAndFbButton.click();
Set<String> allWindowsHandles=driver.getWindowHandles();
        System.out.println(allWindowsHandles.size());
      Iterator<String> it= allWindowsHandles.iterator();
      while ((it.hasNext())){//start iterating through handles
         String handle= it.next();//get the next handle
         if(!mainPageHandle.equals(handle)){//set a condition9
             driver.switchTo().window(handle);// switch to a window which is not equal to main page handle
            // driver.manage().window().maximize();
             String title= driver.getTitle();
             System.out.println(title);
             driver.close();
          }
      }
      driver.switchTo().window(mainPageHandle);//switching back to parent
      igButton.click();

    }
}