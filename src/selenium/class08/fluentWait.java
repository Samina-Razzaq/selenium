package selenium.class08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class fluentWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))//look for an element every 5 seconds
                .ignoring(NoSuchElementException.class);//ignore the exception mentioned
    }
}
