package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

   public static String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {//method is static so variable should be static
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //locating checkboxes and storing then in elements
       List<WebElement> optionCheckboxes= driver.findElements(By.cssSelector("input[class='cb1-element']"));
   int size=optionCheckboxes.size();
        System.out.println(size);
        //looping through each element
        for(WebElement option: optionCheckboxes){
           // option.click();
           String checkboxValue= option.getAttribute("value");
            if(checkboxValue.equals("Option-2")){
                option.click();
                break;
            }
        }
    }
}
