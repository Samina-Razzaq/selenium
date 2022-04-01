package selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.uitestpractice.com/Students/Form");
            WebElement radioButton=driver.findElement(By.xpath("(//input[@name='optradio'])[1]"));
           boolean marriedRadioButtonEnabled= radioButton.isEnabled();
           if(!marriedRadioButtonEnabled){
               System.out.println("not enabled");
           }else{
               System.out.println("Enabled");
           }
      boolean marriedRadioButtonDisplayed =radioButton.isDisplayed();
        System.out.println(marriedRadioButtonDisplayed);
        boolean isMarriedRadioButtonSelected=radioButton.isSelected();
        System.out.println("Before clicking "+isMarriedRadioButtonSelected);
        radioButton.click();
         isMarriedRadioButtonSelected=radioButton.isSelected();
        System.out.println("After clicking "+isMarriedRadioButtonSelected);
        driver.quit();
    }
}
