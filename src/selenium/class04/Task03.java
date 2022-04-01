package selenium.class04;
/*
HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username=driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        username.sendKeys("Admin");
       WebElement password= driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
       WebElement logIn=driver.findElement(By.xpath("//input[@id=\"btnLogin\"]"));
       Thread.sleep(2000);
       logIn.click();
       WebElement errorMsg=driver.findElement(By.xpath("//span[@id=\"spanMessage\"]"));

       if(errorMsg.getText().equals("Password cannot be empty")){
           System.out.println("password cannot be empty");
           System.out.println("Verified");
       }else{
           System.out.println("not a verified text");
       }
       Thread.sleep(2000);
       driver.close();
    }
}
