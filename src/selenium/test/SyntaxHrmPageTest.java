package selenium.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import selenium.pages.LoginSyntaxHrmPage;
import selenium.testBase.BaseClass;

import java.io.File;
import java.io.IOException;

public class SyntaxHrmPageTest {
    /* HRMS blank username and password validation
Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Leave username and password field empty. Click on login button
Verify error message with text "Username cannot be empty" is displayed*/

    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginSyntaxHrmPage loginSyntaxHrmPage=new LoginSyntaxHrmPage();
        //loginSyntaxHrmPage.username.sendKeys("");
       // loginSyntaxHrmPage.password.sendKeys("");
        loginSyntaxHrmPage.login.click();
       String errorMsgText= loginSyntaxHrmPage.errormsg.getText();
       if(errorMsgText.equals("Username cannot be empty")){
           System.out.println("Error message "+errorMsgText+" is displayed");
       }else{
           System.out.println("error msg not displayed");
       }
        TakesScreenshot ts=(TakesScreenshot) BaseClass.driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(srcFile, new File("screenshots/HRMS/loginValidation.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

BaseClass.tearDown();




    }
}
