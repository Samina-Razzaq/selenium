package selenium.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static String url = "https://syntaxprojects.com/basic-radiobutton-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       WebElement femaleRadioButton= driver.findElement(By.xpath("//input[@value=\"Female\"and@type=\"radio\" and@name=\"optradio\"]"));
//femaleRadioButton.click();
//check if the radio button is enabled
        System.out.println("The female radio button is enabled "+femaleRadioButton.isEnabled());
        //check if the radio button is displayed
        System.out.println("the female radio button is displayed "+ femaleRadioButton.isDisplayed());
        //check if button is selected or not
        System.out.println("the female button is selected "+femaleRadioButton.isSelected());
        if(!femaleRadioButton.isSelected()){
            femaleRadioButton.click();
        }
        System.out.println("the female button is selected "+femaleRadioButton.isSelected());
        //to get all links on current page
       List<WebElement> links= driver.findElements(By.tagName("a"));
       for(WebElement link:links){
           String allLinks=link.getText();

           if(!allLinks.isEmpty()){
               System.out.println(allLinks);
           }
       }


    }
}