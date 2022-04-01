package selenium.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    //to handle authentication alert we pass username and password in url/kind of javascript alert
    // username:password@
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}