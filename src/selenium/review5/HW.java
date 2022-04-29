package selenium.review5;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    /*goto syntax hrms application, In the table in PIM/EmployeeList
just pick one random username and check it,
no need to delete it , just make sure it is checked.
share the screen shot  of the webpage in channel*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement username= driver.findElement(By.id("txtUsername"));
       username.sendKeys("Admin");
       WebElement password= driver.findElement(By.id("txtPassword"));
       password.sendKeys("Hum@nhrm123");
       WebElement login=driver.findElement(By.id("btnLogin"));
       login.click();
       WebElement pim= driver.findElement(By.id("menu_pim_viewPimModule"));
       pim.click();

        //list all rows of table
        List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        //iterate through all rows and append i with tr to update changing in row number
        for(int i=1; i<=tableRows.size();i++){
           WebElement requiredRow= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[3]"));
           String name=requiredRow.getText();
           // System.out.println(name);
            if(name.contains("Zubair")){
                //find the x-path for checkBox column and append the i to make sure we are clicking the checkBox
               // adjacent to our required name because name and checkBox are on same index number of row
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/input")).click();
            }
        }
        TakesScreenshot ts=(TakesScreenshot)driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(srcFile,new File("screenshots/HRMS/TableCheck.png"));
        }catch
            (IOException e){
                e.printStackTrace();
            }
driver.quit();
    }
}
