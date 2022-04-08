package selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static String url="https://syntaxprojects.com/bootstrap-iframe.php";
    /* Navigate to https://syntaxprojects.com/bootstrap-iframe.php
     verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
     verify enroll today button is enabled*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

       WebElement header= driver.findElement(By.xpath("//span[@class='gum']"));
        if(header.isDisplayed()) {
            System.out.println("AUTOMATION TESTING PLATFORM BY SYNTAX header is verified");
        }else{
            System.out.println("header not verified");
        }
        Thread.sleep(2000);
        driver.switchTo().frame(1);
        Thread.sleep(2000);
        WebElement enrollButton = driver.findElement(By.className("text-block-2"));
        System.out.println(enrollButton.isEnabled());


      driver.close();
    }
}