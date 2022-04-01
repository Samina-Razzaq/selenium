package selenium.class05;

public class HandlingDDwithIterator {
    static String url="https://www.facebook.com";
    public static void main(String[] args) {
      /*  Facebook dropdown verification, Open chrome browser
        Go to "https://www.facebook.com", click on create new account
        Verify:
        month dd has 12 month options day dd has 31 day options,  year dd has 115 year options
        Select your date of birth, Quit browser*/

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe/");
    }
}
