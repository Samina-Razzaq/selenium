package selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWaitDemo {
    public static String url = "https://syntaxprojects.com/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //best practice is to write implicit wait after url
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//need only once for whole script
        WebElement startPracticingButton=driver.findElement(By.id("btn_basic_example"));
        startPracticingButton.click();

    }
}