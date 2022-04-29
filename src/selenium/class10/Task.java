package selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*
Go to aa.com/homePage.do. select depart date
select return date. select destination
click on search. quit the browser*/
   // public static String url = "aa.com/homePage.do.";

    public static void main(String[] args)  {

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("aa.com/homePage.do.");

    }
}