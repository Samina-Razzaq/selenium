package selenium.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        /*// by finding webElement of frames
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frameElement);
        frameElement = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frameElement);*/
//
      /*  driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement  checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();*/

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//b[@id='topic']"));
        System.out.println(topic.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);


        WebElement dropdwn = driver.findElement(By.tagName("select"));
        Select sel=new Select(dropdwn);
        sel.selectByIndex(2);


        driver.switchTo().defaultContent();

//        driver.switchTo().frame(0);
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);

        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();

    }
}