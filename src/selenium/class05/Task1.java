package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
      /*  Facebook dropdown verification, Open chrome browser
        Go to "https://www.facebook.com", click on create new account
        Verify:
        month dd has 12 month options day dd has 31 day options,  year dd has 115 year options
        Select your date of birth, Quit browser*/

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe/");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
         createAccount.click();
         Thread.sleep(2000);

        WebElement monthDD= driver.findElement(By.id("month"));
        Select selectMonth=new Select(monthDD);
       List<WebElement> monthOptions= selectMonth.getOptions();
       int size=monthOptions.size();
        System.out.println(size);
        if(monthOptions.size()==12){
            System.out.println("Month Dropdown Menu has 12 Options");
        } else {
            System.out.println("Month Dropdown Menu Does not have 12 Options, it has "+monthOptions.size());
        }

       WebElement dayDD= driver.findElement(By.id("day"));
        Select selectDay=new Select(dayDD);
        List<WebElement> dayOptions=selectDay.getOptions();
        dayOptions.size();
        if(dayOptions.size()==31){
            System.out.println("Day Dropdown Menu has 31 Options");
        } else {
            System.out.println("Day Dropdown Menu does not have 31 Options, it has "+dayOptions.size());
        }

         WebElement yearDD= driver.findElement(By.id("year"));
        Select selectYear=new Select(yearDD);
       List<WebElement> yearOptions= selectYear.getOptions();
        System.out.println( yearOptions.size());
        if(yearOptions.size()==115){
            System.out.println("Year Dropdown Menu has 115 Options");
        } else {
            System.out.println("Year Dropdown Menu does not have 115 Options, it has "+yearOptions.size());
        }
        Thread.sleep(2000);
        selectMonth.selectByVisibleText("Sep");
        selectDay.selectByVisibleText("9");
        selectYear.selectByValue("1984");
        Thread.sleep(1000);
        driver.quit();


    }
}
