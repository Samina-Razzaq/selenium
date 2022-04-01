package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {
    //Go to facebook sign up page Fill out the whole form Click signup
    static String url="https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe/");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createAccount=driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(1000);
        WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Hassan");
        Thread.sleep(1000);
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Khan");
        Thread.sleep(1000);
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("hsn@gmai.com");
        Thread.sleep(1000);
        WebElement confirmEmail= driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("hsn@gmail.com");
        Thread.sleep(1000);
        WebElement password= driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("abc1234");

        Thread.sleep(1000);

        WebElement monthDD= driver.findElement(By.id("month"));
        Select selectMonth=new Select(monthDD);
        List<WebElement> monthOptions= selectMonth.getOptions();

        for(WebElement m:monthOptions){
            if(m.getText().equals("Sep")){
                m.click();
                break;
            }
        }
        Thread.sleep(1000);
        WebElement dayDD= driver.findElement(By.id("day"));
        Select selectDay=new Select(dayDD);
        List<WebElement> dayOptions=selectDay.getOptions();

        for(WebElement d:dayOptions){
            if(d.getText().equals("28")){
                d.click();
                break;
            }
        }
        Thread.sleep(1000);
        WebElement yearDD= driver.findElement(By.id("year"));
        Select selectYear=new Select(yearDD);
        List<WebElement> yearOptions= selectYear.getOptions();

        for(WebElement y:yearOptions){
            if(y.getText().equals("2015")){
                y.click();
                break;
            }
        }
        Thread.sleep(1000);

        List<WebElement> gender = driver.findElements(By.name("sex"));
       for(WebElement g:gender){
           if(g.getAttribute("value").equals("2")){
               g.click();
           }
       }
       Thread.sleep(1000);
WebElement signUp=driver.findElement(By.name("websubmit"));
       signUp.click();
       driver.quit();


    }
}
