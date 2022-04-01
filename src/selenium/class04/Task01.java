package selenium.class04;
/*
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
       userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
       password.sendKeys("Hum@nhrm123");
        WebElement login =driver.findElement(By.xpath("//input[@id='btnLogin']"));
        Thread.sleep(2000);
        login.click();
       if(driver.findElement(By.xpath("//img[starts-with(@src,'/human')]")).isDisplayed()){
           System.out.println("Syntax logo is displayed");
       }else{
           System.out.println("Syntax logo is not displayed");
       }
       driver.close();

    }
}
