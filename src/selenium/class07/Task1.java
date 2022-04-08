package selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
    /*Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify (compare) the titles for each page Print out the title of the all pages*/
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       String mainHandle= driver.getWindowHandle();
      WebElement tabButton= driver.findElement(By.xpath("//button[@id='tabButton']"));
      tabButton.click();
      WebElement windowButton=driver.findElement(By.xpath("//button[@id='windowButton']"));
      windowButton.click();
      WebElement messageButton=driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
      messageButton.click();
      Set<String> allWindowHandles=driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
      Iterator<String> iterator= allWindowHandles.iterator();
      while (iterator.hasNext()){
          String handle=iterator.next();
          if(!mainHandle.equals(handle)){
              driver.switchTo().window(handle);
             WebElement textMsg= driver.findElement(By.xpath("//body"));
             String txt= textMsg.getText();
              System.out.println(txt);
          }
      }
        String title= driver.getTitle();
        System.out.println("Title : "+title);
    }
}