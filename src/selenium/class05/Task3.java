package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
   /* Go to ebay.com get all the categories and print them in the console
    select Computers/Tables & Networking, click on search, verify the header*/
    public static String url="http://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe/");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement searchBox= driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
        Select selectSearchBox=new Select(searchBox);
        Thread.sleep(2000);
       List<WebElement> options= selectSearchBox.getOptions();
       for(WebElement opt:options){
          String text= opt.getText();
          // System.out.println(text);
           if(text.equals("Computers/Tables & Networking")){
               selectSearchBox.selectByVisibleText(text);

           }

       }
        Thread.sleep(2000);

    }
}
