package selenium.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        /* Go to https://syntaxprojects.com/javascript-alert-box-demo.php
           click on each button and handle the alert accordingly*/

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//1st Alert
        WebElement jsAlertBox=driver.findElement(By.xpath("//button[text()='Click me!'and @class='btn btn-default']"));
        jsAlertBox.click();
        Thread.sleep(2000);
        Alert alert1= driver.switchTo().alert();
        alert1.accept();
//2nd Alert
       WebElement jsConfirmBox= driver.findElement(By.xpath("//button[text()='Click me!'and @class='btn btn-default btn-lg']"));
       jsConfirmBox.click();
        Thread.sleep(2000);
        Alert alert2=driver.switchTo().alert();
        alert2.accept();
//3rd Alert
       WebElement jsPromptBox= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
       jsPromptBox.click();
        Thread.sleep(2000);
        Alert alert3=driver.switchTo().alert();
        alert3.sendKeys("abcd123");
        Thread.sleep(2000);
        alert3.accept();

        driver.close();



    }
}
