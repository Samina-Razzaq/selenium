package comsyntax.seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
   /* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
driver.findElement(By.id("customer.firstName")).sendKeys("Hassan");
driver.findElement(By.id("customer.lastName")).sendKeys("Khan");
driver.findElement(By.id("customer.address.street")).sendKeys("5011-160Ave");
driver.findElement(By.id("customer.address.city")).sendKeys("Vancouver");
driver.findElement(By.id("customer.address.state")).sendKeys("Canada");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("52667");
driver.findElement(By.id("customer.phoneNumber")).sendKeys("567-987-9876");
driver.findElement(By.id("customer.ssn")).sendKeys("456");
driver.findElement(By.id("customer.username")).sendKeys("hassan@gmail.com");
driver.findElement(By.id("customer.password")).sendKeys("abc567");
driver.findElement(By.id("repeatedPassword")).sendKeys("abc567");
driver.close();

    }
}
