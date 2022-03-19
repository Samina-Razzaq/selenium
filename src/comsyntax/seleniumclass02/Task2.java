package comsyntax.seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*navigate to fb.com click on create new account fill up all the text boxes
click on sign up button close the popup close the browser*/
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("zayaan");
        driver.findElement(By.name("lastname")).sendKeys("khan");
        driver.findElement(By.name("reg_email__")).sendKeys("zggh@hhj.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("gdsjaj45464");
        driver.findElement(By.name("birthday_month")).sendKeys("August");
        driver.findElement(By.name("birthday_day")).sendKeys("15");
        driver.findElement(By.name("birthday_year")).sendKeys("2001");
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.close();














    }
}
