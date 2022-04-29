package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.utils.CommonMethods;

public class LoginSyntaxHrmPage extends CommonMethods {
    @FindBy(id = "txtUsername") public WebElement username;
    @FindBy(id = "txtPassword") public  WebElement password;
    @FindBy(id = "btnLogin") public WebElement login;
    @FindBy(id = "spanMessage") public WebElement errormsg;

   public  LoginSyntaxHrmPage (){
       PageFactory.initElements(driver, this);

    }
}
