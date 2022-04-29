package selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task {
    /*go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove, verify the text
click on enable verify the text box is enabled
enter text and click disable ,verify the text box is disabled*/
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on checkbox and click on remove, verify the text
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement remove= driver.findElement(By.xpath("//button[text()='Remove']"));
        remove.click();
        WebElement message= driver.findElement(By.xpath("//p[@id='message']"));
        String msgText=message.getText();
        System.out.println(msgText);
        //click on enable verify the text box is enabled
        WebElement enableB= driver.findElement(By.xpath("//button[text()='Enable']"));
        enableB.click();
        WebElement enableBMessage= driver.findElement(By.xpath("//p[@id='message']"));
        String enableText=enableBMessage.getText();
        System.out.println(enableText);
       //enter text and click disable ,verify the text box is disabled
       WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));
       textBox.sendKeys("abcd");
       WebElement disable=driver.findElement(By.xpath("//button[text()='Disable']"));
       disable.click();
       WebElement disableTextMessage=driver.findElement(By.xpath("//p[@id='message']"));
       String disableTxt=disableTextMessage.getText();
        System.out.println(disableTxt);

    }
}