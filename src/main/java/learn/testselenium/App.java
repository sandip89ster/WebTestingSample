package learn.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class App 
{
	@Test
    public static void test1()
    {
       WebDriver driver = new FirefoxDriver();
       driver.get("http://www.google.com");
       System.out.println(">>>>>>>>>> Browser Opened");
    }
}
