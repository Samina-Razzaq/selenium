package selenium.utils;


import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import selenium.testBase.BaseClass;

public class CommonMethods extends BaseClass {

        public void clickOnElement() {

        }

        /**
         * this method send text to a given element
         * @param element
         * @param text
         */
        public  void  sendText(WebElement element, String text){
                element.clear();
                element.sendKeys(text);
        }

        public void switchToFrame(int index){
                try{
                        driver.switchTo().frame(index)  ;
                }catch (NoSuchFrameException e){
                        e.printStackTrace();
                }

        }

}
