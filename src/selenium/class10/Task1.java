package selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
      /* Go to aa.com/homePage.do. select depart date
          select return date. select destination
            click on search. quit the browser*/
    public static String url="https://www.aa.com/homePage.do.";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement BookFlight= driver.findElement(By.xpath("//a[text()='Book flight']"));
       BookFlight.click();
      WebElement departureCalender= driver.findElement(By.className("ui-datepicker-trigger"));
      departureCalender.click();

      WebElement nextButton= driver.findElement(By.xpath("//a[@aria-label='Next Month']"));

      WebElement departureMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
      String departureMonthText=departureMonth.getText();
        System.out.println(departureMonthText);

      while (!departureMonthText.equals("August")){
          nextButton.click();

      }
      List<WebElement> departureDates=driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']//tr/td"));

      for(WebElement departureDate:departureDates){
          if (departureDate.getText().equals("12")){
              departureDate.click();
              break;
          }
      }
    }
}
