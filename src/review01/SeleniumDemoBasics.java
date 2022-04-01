package review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoBasics {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
    /* WebElement userName = driver.findElement(By.id("userName"));
     userName.sendKeys("gfdfsdgftd");
     userName.clear();
     userName.sendKeys("gfyfyttfhg5456");*/
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("helloworld");
    }
}
